package de.florianmichael.bukkitextensions.task_chain.base;

import de.florianmichael.bukkitextensions.task_chain.listener.FinishExecution;
import de.florianmichael.bukkitextensions.task_chain.listener.TaskExecution;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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

    public FinishExecution getFinishExecution() {
        return finishExecution;
    }

    public String getName() {
        return name;
    }

    public List<Task> getChainTasks() {
        return chainTasks;
    }
}