package me.veacty.magiclibrary;

import me.veacty.magiclibrary.listeners.PlayerJoinListener;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class MagicLibraryPlugin extends JavaPlugin {

    @Override
    public void onLoad() {
        Bukkit.getPluginManager().registerEvents(new PlayerJoinListener(), this);

    }

    @Override
    public void onEnable() {

    }

    @Override
    public void onDisable() {

    }

}
