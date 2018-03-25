package me.veacty.magiclibrary.rudolandia;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.*;
import org.bukkit.inventory.ItemStack;

public class WalkazKurwaCommand implements CommandExecutor{
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {

        final Player player = (Player) commandSender;

        if (player.getInventory().contains(Material.EMERALD, 5)) {
            player.getInventory().remove(new ItemStack(Material.EMERALD, 5));
            player.teleport(new Location(World.Environment.NETHER, 0, 0, 0, 0, 0));
            player.sendMessage("rudolandai to tak naprawde pieklo, bo lawa jest ruda ;)");

            Location location = player.getLocation();

            location.getWorld().spawnEntity(location, EntityType.WITHER);

            }
        }

        return true;
    }
}
