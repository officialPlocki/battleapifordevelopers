package de.battlesucht.api.utils.server.local;

import de.battlesucht.api.utils.files.FileBuilder;
import org.bukkit.OfflinePlayer;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

import java.text.DecimalFormat;

public class CoinsAPI {

    public static double getCoins(Player p) {
        return 0;
    }

    public static String getVisualCoins(Player p) {
        return "";
    }

    public static void setCoins(Player p, double amount) {

    }

    public static void addCoins(Player p, double amount) {
    }

    public static void removeCoins(Player p, double amount) {
    }

    public static void resetCoins(Player p) {
    }
    public static boolean hasCoins(Player p, double amount) {
        return false;
    }

    public static double getCoins(OfflinePlayer p) {
        return 0;
    }

    public static String getVisualCoins(OfflinePlayer p) {
        return "";
    }

    public static void setCoins(OfflinePlayer p, double amount) {
    }
    public static void resetCoins(OfflinePlayer p) {
    }
    public static void addCoins(OfflinePlayer p, double amount) {
    }

    public static void removeCoins(OfflinePlayer p, double amount) {
    }

    public static boolean hasCoins(OfflinePlayer p, double amount) {
        return false;
    }

}
