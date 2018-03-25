package me.veacty.magiclibrary.rudolandia;

import me.veacty.magiclibrary.utilities.PlayerUtil;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PlayerJoinListener implements Listener {

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        final Player joinedPlayer = event.getPlayer();

        List<String> joinMessage = Arrays.asList(
                "&6Na naszym serwerze jest autorskie rozwiazanie na RUDOLADNIE",
                "&aRudolandai to kraina w ktorej mozesz spotkac bossa hapiego, jest on ewolucja dissa",
                "&aaby dowiedziec sie jak go zabic wpisz /rudolandiapomoc"
        );

        PlayerUtil.sendList(joinedPlayer, joinMessage);

    }
}
