package me.trindade.playerQuests.commands;

import me.trindade.playerQuests.util.ConfigUtil;
import me.trindade.playerQuests.util.MessageUtils;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class QuestsCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] args) {

        if (commandSender instanceof Player player
                && ConfigUtil.CMD_QUESTS_USAGE_ENABLED
                && args.length == 0) {
            MessageUtils.sendMessage(player, "Quests command send");
        }
        return true;
    }
}
