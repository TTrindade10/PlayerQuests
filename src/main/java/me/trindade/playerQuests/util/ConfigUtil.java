package me.trindade.playerQuests.util;

import me.trindade.playerQuests.PlayerQuests;
import org.bukkit.configuration.file.FileConfiguration;

public class ConfigUtil {

    public static String START_MESSAGE;
    public static String STOP_MESSAGE;
    public static String PREFIX;
    public static boolean PREFIX_ENABLED;
    public static String CMD_QUESTS_USAGE;
    public static boolean CMD_QUESTS_USAGE_ENABLED;

    public static void setup() {
        reload();
    }

    public static void reload() {
        PlayerQuests playerQuests = PlayerQuests.getInstance();
        FileConfiguration config = playerQuests.getConfig();
        START_MESSAGE = config.getString("start-message");
        STOP_MESSAGE = config.getString("stop-message");
        PREFIX = config.getString("prefix");
        PREFIX_ENABLED = config.getBoolean("prefix-enabled");
        CMD_QUESTS_USAGE = config.getString("cmd-quests-usage");
        CMD_QUESTS_USAGE_ENABLED = config.getBoolean("cmd-quests-usage-enabled");
    }
}
