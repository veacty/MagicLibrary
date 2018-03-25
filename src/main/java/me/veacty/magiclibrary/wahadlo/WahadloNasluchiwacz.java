package me.veacty.magiclibrary.wahadlo;

import me.veacty.magiclibrary.utilities.RandomUtil;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import static me.veacty.magiclibrary.utilities.RandomUtil.randomChance;

public class WahadloNasluchiwacz implements Listener {

    @EventHandler
    public void onEventPrzedWahadlem(EntityDamageByEntityEvent wahadloEvent) {
        final Player fajter = (Player) wahadloEvent.getDamager();
        final Player oponent = (Player) wahadloEvent.getEntity();

        final Integer xd = RandomUtil.randomInteger(0, 100);
        if (xd == 30) {
            fajter.sendMessage("ale mu zajabales wahadlo, rozjebal sie jak unixej o drzewo");
            oponent.getPlayer().setHealth(0);
            oponent.sendMessage("dostales wahadlo od uliczniaka, poskladales sie");
        }

        if (xd == 15) {
            for (Player player : Bukkit.getOnlinePlayers()) {
                player.sendMessage(fajter.getDisplayName() + "zajebal tak mocne wahadlo, ze wyjebalo serwer. TO CHYBA OKSI!");
                Bukkit.shutdown();
            }
        }



    }
}
