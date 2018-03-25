package me.veacty.magiclibrary.rudolandia;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerJoinListener implements Listener {

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        final Player joinedPlayer = event.getPlayer();

        String[] joinMessage = new String[3];

        joinMessage[1] = "Na naszym serwerze jest autorskie rozwiazanie na RUDOLADNIE";
        joinMessage[2] = "Rudolandai to kraina w ktorej mozesz spotkac bossa hapiego, jest on ewolucja dissa";
        joinMessage[3] = "aby dowiedziec sie jak go zabic wpisz /rudolandiapomoc";

        joinedPlayer.sendMessage(joinMessage);
    }
}
