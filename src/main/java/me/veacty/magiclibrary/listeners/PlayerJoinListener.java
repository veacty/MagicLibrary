package me.veacty.magiclibrary.listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerJoinListener implements Listener {

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        final Player player = event.getPlayer();

        if (player.getName().equalsIgnoreCase("_happi")) {
            player.kickPlayer("to nie rudolandia");
        }
    }
}
