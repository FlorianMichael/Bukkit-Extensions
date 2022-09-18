package de.florianmichael.bukkitextensions.task_chain;

import de.florianmichael.bukkitextensions.api_base.BukkitExtensionBase;
import de.florianmichael.bukkitextensions.task_chain.base.Chain;
import de.florianmichael.bukkitextensions.task_chain.base.Task;

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

        if (chain.getFinishExecution() != null)
            chain.getFinishExecution().onFinishChain();
    }
}
