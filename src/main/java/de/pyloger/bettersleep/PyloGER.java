package de.pyloger.bettersleep;

import BedManager.BedManager;
import org.bukkit.Bukkit;
import org.bukkit.block.data.type.Bed;
import org.bukkit.plugin.java.JavaPlugin;

public final class PyloGER extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        Bukkit.getPluginManager().registerEvents(new BedManager(), this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public void Data(){

        String prefix = "§8[§b§lSystem§8§l] ";

    }
}
