package me.veacty.magiclibrary.utilities;

import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

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


}
