package me.trindade.playerQuests;

import me.trindade.playerQuests.commands.QuestsCommand;
import me.trindade.playerQuests.util.ConfigUtil;
import org.bukkit.plugin.java.JavaPlugin;

public final class PlayerQuests extends JavaPlugin {

    private static PlayerQuests instance;

    @Override
    public void onEnable() {
        // Plugin startup logic
        // instances
        instance = this;
        ConfigUtil.setup();

        //save defaults
        saveDefaultConfig();

        //commands
        getCommand("quests").setExecutor(new QuestsCommand());

        //start message
        System.out.println(ConfigUtil.START_MESSAGE);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic

        System.out.println(ConfigUtil.STOP_MESSAGE);
    }

    public static PlayerQuests getInstance(){
        return instance;
    }
}
