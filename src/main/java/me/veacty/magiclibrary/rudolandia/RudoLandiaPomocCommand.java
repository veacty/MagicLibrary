package me.veacty.magiclibrary.rudolandia;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class RudoLandiaPomocCommand implements CommandExecutor {


    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        commandSender.sendMessage("aby pokonac happiego z rudolandi musisz posiadac w ekwipunku 5 emeraldow i wpisac /walkazkurwa to cie przetelportuje na walke z nim");
        return true;
    }
}
