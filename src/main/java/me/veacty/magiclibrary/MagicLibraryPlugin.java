package me.veacty.magiclibrary;

import me.veacty.magiclibrary.listeners.PlayerJoinListener;
import me.veacty.magiclibrary.rudolandia.RudoLandiaPomocCommand;
import me.veacty.magiclibrary.rudolandia.WalkazKurwaCommand;
import me.veacty.magiclibrary.rudolandia.ZabicieHappiego;
import me.veacty.magiclibrary.rudolandia.PlayerJoinListener;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class MagicLibraryPlugin extends JavaPlugin {

    @Override
    public void onLoad() {
        Bukkit.getPluginManager().registerEvents(new me.veacty.magiclibrary.listeners.PlayerJoinListener(), this);
        Bukkit.getPluginManager().registerEvents(new ZabicieHappiego(), this);
        Bukkit.getPluginManager().registerEvents(new me.veacty.magiclibrary.rudolandia.PlayerJoinListener(), this);
        this.getCommand("walakzkurwa").setExecutor(new WalkazKurwaCommand());
        this.getCommand("rudolandiapomoc").setExecutor(new RudoLandiaPomocCommand());

    }

    @Override
    public void onEnable() {

    }

    @Override
    public void onDisable() {

    }

}
