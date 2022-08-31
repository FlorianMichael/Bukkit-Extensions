# Bukkit-Extensions
Powerful Bukkit API for Plugin Developers

## The idea
The idea behind Bukkit Extensions is to develop an API that makes it easier for programmers from all over the world to use Bukkit. <br>
It is meant to break down many things like creating scoreboards, tablists, NPCs and much more into a few lines that would otherwise take hundreds. <br>

## How it works
Bukkit Extensions is modular, which means that each API is a module in itself and depends only on the api-base, <br>
so you can include only the functions you really need on your server / in your project.

## Custom Scheduler API v1

```java
// Your Bukkit-Plugin Main-Class
public static class Test extends JavaPlugin {
    
    private final CustomSchedulerAPI schedulerAPI;
    
    @Override
    public void onLoad() {
        super.onLoad();
        
        schedulerAPI = (CustomSchedulerAPI) BukkitExtensions.self().get(CustomSchedulerAPI.class);
    }
    
    @Override
    public void onEnable() {
        final String taskName = "Inventory-Database-Updater";
        
        schedulerAPI.registerTickTask(taskName, 5000L); // Register Scheduler with Name and Delay

        schedulerAPI.addTicker(taskName, () -> {
            // Will execute every 250 seconds
        });
        
        schedulerAPI.start(taskName); // Starts the Scheduler
    }
}
```
