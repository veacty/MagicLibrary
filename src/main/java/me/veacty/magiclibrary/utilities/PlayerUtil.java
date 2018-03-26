package me.veacty.magiclibrary.utilities;

import me.veacty.magiclibrary.ItemStackException;
import org.apache.commons.lang.Validate;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import java.util.Arrays;
import java.util.List;
import java.util.stream.StreamSupport;

public final class PlayerUtil {

    private PlayerUtil() {
        throw new UnsupportedOperationException("Utility class can't be initialized");
    }

    public static boolean canPickup(Inventory inventory, ItemStack itemStack) {
        return inventory.firstEmpty() != -1 ||
                StreamSupport.stream(inventory.spliterator(), false)
                        .filter(itemStack::isSimilar)
                        .anyMatch(pickupedItemStack -> pickupedItemStack.getAmount() + itemStack.getAmount() < pickupedItemStack.getMaxStackSize());
    }

    public static boolean addItem(Inventory inventory, ItemStack itemStack) {
        if(canPickup(inventory, itemStack)) {
            inventory.addItem(itemStack);
            return true;
        }

        throw new ItemStackException("the player has no place in the inventory");
    }

    public static void addItemOrDrop(Player player, ItemStack itemStack) {
        if (!addItem(player.getInventory(), itemStack)) {
            player.getLocation().getBlock().getWorld().dropItemNaturally(player.getLocation(), itemStack);
        }
    }

    public static void addItemsOrDrop(Player player, ItemStack... itemStacks) {
        Arrays.stream(itemStacks).forEach(itemStack -> addItemOrDrop(player, itemStack));
    }

    public static void addItems(Inventory inventory, ItemStack... itemStacks) {
        Arrays.stream(itemStacks).forEach(itemStack -> addItem(inventory, itemStack));
    }

    public static void sendList(Player player, List<String> list) {
        ChatColorUtil.color(list).stream().forEach(player::sendMessage);
        
      
    }


}
