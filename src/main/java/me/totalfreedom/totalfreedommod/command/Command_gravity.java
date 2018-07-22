package me.totalfreedom.totalfreedommod.command;

import me.totalfreedom.totalfreedommod.rank.Rank;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

@CommandPermissions(level = Rank.OP, source = SourceType.ONLY_IN_GAME)
@CommandParameters(description = "Enable or disable gravity for yourself", usage = "/<command>")
public class Command_gravity extends FreedomCommand
{

    @Override
    public boolean run(CommandSender sender, Player playerSender, Command cmd, String commandLabel, String[] args, boolean senderIsConsole)
    {
        playerSender.setGravity(!playerSender.hasGravity());
        msg((playerSender.hasGravity() ? "Enabled" : "Disabled") + " gravity.", (playerSender.hasGravity() ? ChatColor.GREEN : ChatColor.RED));
        return true;
    }
}
