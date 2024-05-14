package com.iam57.simpleteleport.command;

import com.iam57.simpleteleport.enums.TeleportRequestType;
import com.iam57.simpleteleport.service.TeleportManager;
import org.bukkit.entity.Player;

/**
 * @author iam57
 * @since 2024-05-14 10:47
 */
public class TpaCommand extends BasePlayerCommand {
    private static final TeleportManager teleportManager = TeleportManager.getInstance();

    @Override
    public boolean execute(Player player, String[] args) {
        teleportManager.sendTeleportRequests(player, args[0], TeleportRequestType.REQUEST);
        return true;
    }

    @Override
    protected boolean validateArgs(String[] args) {
        return args.length == 1;
    }
}