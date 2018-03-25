package me.veacty.magiclibrary.rudolandia;

import me.veacty.magiclibrary.utilities.PlayerUtil;
import org.bukkit.Material;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.inventory.ItemStack;

public class ZabicieHappiego implements Listener {

    @EventHandler
    public void onZabicRudaKurwe(EntityDeathEvent entityDeathEvent) {
        if (entityDeathEvent.getEntity().getType().equals(EntityType.WITHER)) {
            entityDeathEvent.getEntity().getKiller().sendMessage("zabiles poteznego syna gierczaka happiego, gratulujed ostajesz 500 koxow");
            PlayerUtil.addItem(entityDeathEvent.getEntity().getKiller().getInventory(), new ItemStack(Material.GOLDEN_APPLE, 500));
        }
    }
}
