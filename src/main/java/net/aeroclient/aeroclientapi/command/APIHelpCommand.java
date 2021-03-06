package net.aeroclient.aeroclientapi.command;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class APIHelpCommand implements CommandExecutor {
  public boolean onCommand(CommandSender sender, Command cmd, String s, String[] args) {
    if (!(sender instanceof Player)) {
      sender.sendMessage("This command can only be ran in-game.");
      return false;
    }

    Player p = (Player)sender;
      p.sendMessage("");
      p.sendMessage(ChatColor.STRIKETHROUGH + "---------------------------------");
    p.sendMessage("");
    p.sendMessage(ChatColor.GREEN + "§lNormal Commands:");
    p.sendMessage(ChatColor.BLUE + "/clientlist: " + ChatColor.GREEN + "Show who is running Aero Client, CheatBreaker or Lunar Client.");
    p.sendMessage(ChatColor.BLUE + "/client: " + ChatColor.GREEN + "Show information about Aero Client.");
    if (p.hasPermission("aeroclientapi.admin")) {
      p.sendMessage("");
      p.sendMessage(ChatColor.RED + "§lAdmin Commands");
      p.sendMessage("");
      p.sendMessage(ChatColor.BLUE + "/client <player>:" + ChatColor.GREEN + "Show what client a player is using.");
      p.sendMessage(ChatColor.BLUE + "/apiinfo: " + ChatColor.GREEN + "Show info about the AeroClientAPI.");
      p.sendMessage(ChatColor.BLUE + "/apihelp: " + ChatColor.GREEN + "Show AeroClientAPI help.");
      p.sendMessage(ChatColor.BLUE + "/apireload: " + ChatColor.GREEN + "Reload the config.");
      p.sendMessage(ChatColor.BLUE + "/clientban: " + ChatColor.GREEN + "Ban a user from your server, and queue them up for a client ban.");
      p.sendMessage(ChatColor.BLUE + "/clientunban: " + ChatColor.GREEN + "Unban a user from your server, cancels the client ban queue.");
      p.sendMessage(ChatColor.BLUE + "/staffmods <player>: " + ChatColor.GREEN + "Grant a user staff modules.");
      p.sendMessage(ChatColor.BLUE + "/setwaypoint: " + ChatColor.GREEN + "Create a waypoint where you are standing.");
      p.sendMessage(ChatColor.BLUE + "/anotification: " + ChatColor.GREEN + "Send notifications to all online Aero Client users.");
    p.sendMessage("");
    p.sendMessage(ChatColor.RED + "§lPermission Nodes:");
    p.sendMessage("");
    p.sendMessage(ChatColor.BLUE + "aeroclientapi.staffmods: " + ChatColor.GREEN + "Grants Staff Mods.");
    p.sendMessage(ChatColor.BLUE + "aeroclientapi.info: " + ChatColor.GREEN + "Grants Info Page.");
    p.sendMessage(ChatColor.BLUE + "aeroclientapi.help: " + ChatColor.GREEN + "Grants Help Page.");
    p.sendMessage(ChatColor.BLUE + "aeroclientapi.admin: " + ChatColor.GREEN + "Grants AeroClientAPI Admin.");
    p.sendMessage(ChatColor.BLUE + "aeroclientapi.clientban: " + ChatColor.GREEN + "Gives access to Client Ban.");
    p.sendMessage(ChatColor.BLUE + "aeroclientapi.clientunban: " + ChatColor.GREEN + "Gives access to Client Unban.");
    p.sendMessage(ChatColor.BLUE + "aeroclientapi.setwaypoint: " + ChatColor.GREEN + "Gives access to set a waypoint.");
    p.sendMessage(ChatColor.BLUE + "aeroclientapi.reload: " + ChatColor.GREEN + "Gives access to reload the config.");
    p.sendMessage(ChatColor.BLUE + "aeroclientapi.anotification: " + ChatColor.GREEN + "Gives access to to send custom notifications.");
    }
    p.sendMessage("");
    p.sendMessage(ChatColor.STRIKETHROUGH + "---------------------------------");
    p.sendMessage("");
    return true;
  }
}
