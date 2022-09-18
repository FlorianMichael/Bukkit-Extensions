package de.florianmichael.bukkitextensions.task_chain.base;

import de.florianmichael.bukkitextensions.task_chain.listener.TaskExecution;

import java.util.Optional;

public class Task {

    private final int priority;
    private final TaskExecution taskExecution;
    private final Optional<String> name;

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
