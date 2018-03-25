package me.veacty.magiclibrary.rudolandia;

import org.bukkit.Material;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.inventory.ItemStack;

public class ZabicieHappiego implements Listener{


    @EventHandler
    public void onZabicRudaKurwe(EntityDeathEvent entityDeathEvent) {
        if (entityDeathEvent.getEntity().getType().equals(EntityType.WITHER)) {
            entityDeathEvent.getEntity().getKiller().sendMessage("zabiles poteznego syna gierczaka happiego, gratulujed ostajesz 500 koxow");
            entityDeathEvent.getEntity().getKiller().getInventory().addItem(new ItemStack(Material.GOLDEN_APPLE, 500));
        }
    }
}
