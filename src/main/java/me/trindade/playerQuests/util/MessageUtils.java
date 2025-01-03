package me.trindade.playerQuests.util;

import org.bukkit.entity.Player;

public class MessageUtils {

    public static void sendMessage(Player player, String message){
        String mts = "";
        if (ConfigUtil.PREFIX_ENABLED)
            mts += ConfigUtil.PREFIX;
        mts += message;
        player.sendMessage(Color.translate(mts));
    }
}
