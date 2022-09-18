package de.florianmichael.bukkitextensions.task_chain;

import de.florianmichael.bukkitextensions.api_base.BukkitExtensionBase;

import java.util.*;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ThreadLocalRandom;

public class TaskChain extends BukkitExtensionBase {

    private final Map<Integer, Chain> chainTasks = new HashMap<>();

    public TaskChain() {
        super("Task Chain", 1, "Florian");
    }

    public int create(final String name) {
        final int nextKey = ThreadLocalRandom.current().nextInt(10);
        if (this.chainTasks.containsKey(nextKey))
            this.create(name);

        this.chainTasks.put(nextKey, new Chain(name));

        return nextKey;
    }

    public Chain createDirect(final String name) {
        return new Chain(name);
    }

    public void executeAsync(final Chain chain) {
        CompletableFuture.runAsync(() -> this.execute(chain));
    }

    public void execute(final Chain chain) {
        final List<Task> tasks = new ArrayList<>(chain.getChainTasks());
        tasks.sort(Comparator.comparingInt(Task::getPriority));

        for (Task task : tasks)
            task.process();

        if (chain.finishExecution != null)
            chain.finishExecution.onFinishChain();
    }

    public class Task {
        private Optional<String> name;
        private final int priority;
        private final TaskExecution taskExecution;

        public Task(final int priority, final TaskExecution taskExecution) {
            this(Optional.empty(), priority, taskExecution);
        }

        public Task(final Optional<String> name, final int priority, final TaskExecution taskExecution) {
            this.name = name;
            this.priority = priority;
            this.taskExecution = taskExecution;
        }

        public void process() {
            this.taskExecution.onExecute();
        }

        public boolean hasName() {
            return this.name.isPresent();
        }

        public String getName() {
            if (!this.hasName()) return null;

            return this.name.get();
        }

        public int getPriority() {
            return priority;
        }
    }

    public interface FinishExecution {
        void onFinishChain();
    }

    public interface TaskExecution {
        void onExecute();
    }

    public class Chain {
        private final List<Task> chainTasks = new ArrayList<>();

        private final String name;
        private FinishExecution finishExecution;

        public Chain(final String name) {
            this.name = name;
        }

        public void setFinishListener(FinishExecution finishExecution) {
            this.finishExecution = finishExecution;
        }

        public void add(final int priority, final TaskExecution taskExecution) {
            this.add(null, priority, taskExecution);
        }

        public void add(final String name, final int priority, final TaskExecution taskExecution) {
            if (name == null)
                this.chainTasks.add(new Task(priority, taskExecution));
            else
                this.chainTasks.add(new Task(Optional.of(name), priority, taskExecution));
        }

        public String getName() {
            return name;
        }

        public List<Task> getChainTasks() {
            return chainTasks;
        }
    }
}
