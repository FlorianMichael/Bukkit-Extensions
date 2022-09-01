# Bukkit-Extensions
Powerful Bukkit API for Plugin Developers

## The idea
The idea behind Bukkit Extensions is to develop an API that makes it easier for programmers from all over the world to use Bukkit. <br>
It is meant to break down many things like creating scoreboards, tablists, NPCs and much more into a few lines that would otherwise take hundreds. <br>

## How it works
Bukkit Extensions is modular, which means that each API is a module in itself and depends only on the api-base, <br>
so you can include only the functions you really need on your server / in your project.

## Examples

Finally, for each module you will see an example code to understand what the intention of the module is, <br>
whether it is useful for you or you can use it depends on you.

### Custom Scheduler API v1

```java
// Your Bukkit-Plugin Main-Class
public class Test extends JavaPlugin {
    
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

### Lambda Events v1

```java
public class Test extends JavaPlugin {
    
    private final LambdaEvents lambdaEvents;
    
    @Override
    public void onLoad() {
        super.onLoad();
        
        this.lambdaEvents = (LambdaEvents) BukkitExtensions.self().get(LambdaEvents.class);

        this.lambdaEvents.setPlugin(this); // Sets the Plugin which the listeners are loaded in, default the Bukkit Extensions Loader Plugin
        
        this.lambdaEvents.invokePlayerJoinListener((event) -> {
            System.out.println(event.getPlayer().getName() + " joined the Server");
        });
    }
}
```

### Modern Commands v1

```java
public class Test extends JavaPlugin {
    
    private final ModernCommandBuilder modernCommandBuilder;
    
    @Override
    public void onLoad() {
        super.onLoad();
        
        this.modernCommandBuilder = (ModernCommandBuilder) BukkitExtensions.self().get(ModernCommandBuilder.class);
    }

    @Override
    public void onEnable() {
        this.modernCommandBuilder.registerCommand(new TestCommand());
    }
    
    public static class TestCommand extends AbstractCommand {

        public TestCommand() {
            super("test");
        }

        @Override
        public void onExecute(String label, StringArrayWrapper args) {
            this.sendMessage("Argument Size: " + args.size());
        }
    }
}
```