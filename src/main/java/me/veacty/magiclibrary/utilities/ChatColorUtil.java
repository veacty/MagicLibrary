package me.veacty.magiclibrary.utilities;

import org.bukkit.ChatColor;

import java.util.List;
import java.util.stream.Collectors;

public final class ChatColorUtil {

    private ChatColorUtil() {
        throw new UnsupportedOperationException("Utility class can't be initialized");
    }

    public static String color(String string) {
        return ChatColor.translateAlternateColorCodes('$', string);
    }

    public static List<String> color(List<String> stringList) {
        return stringList.stream().map(ChatColorUtil::color).collect(Collectors.toList());
    }

    public static String strip(String string) {
        return ChatColor.stripColor(string);
    }

    public static List<String> strip(List<String> stringList) {
        return stringList.stream().map(ChatColorUtil::strip).collect(Collectors.toList());
    }
}
