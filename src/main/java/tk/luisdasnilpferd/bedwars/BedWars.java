package tk.luisdasnilpferd.bedwars;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class BedWars extends JavaPlugin{

    private static BedWars bedWars;

    private PluginManager pluginManager;
    public String prefix ,noperm;

    @Override
    public void onLoad() {

    }

    @Override
    public void onEnable() {
        this.init();
    }

    @Override
    public void onDisable() {

    }

    private void init(){

        this.prefix = "§l§7[§bBedWars§7] §r";
        this.noperm = prefix + "§cYou have no permissions for this command.";

        this.pluginManager = Bukkit.getPluginManager();

        this.registerCommands();
        this.registerListener();
    }

    private void registerCommands(){

    }

    private void registerListener(){

    }

    public static BedWars getBedWars() {
        return bedWars;
    }

    public static void setBedWars(BedWars bedWars) {
        BedWars.bedWars = bedWars;
    }

    public PluginManager getPluginManager() {
        return pluginManager;
    }
}
