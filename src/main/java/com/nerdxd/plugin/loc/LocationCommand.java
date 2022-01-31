package com.nerdxd.plugin.loc;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class LocationCommand implements CommandExecutor {

    private String name;

    private double x;

    private double y;

    private double z;

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(sender instanceof Player) {
            if(args[0] != null) {
                name = args[0];
                Player p = (Player) sender;
                Player player = Bukkit.getPlayerExact(name);
                x = player.getLocation().getX();
                y = player.getLocation().getY();
                z = player.getLocation().getZ();

                p.sendMessage("Location of " + name + " is: " + x + ", " + y + ", " + z + ", ");

            } else {
               Player player = (Player) sender;
               player.sendMessage(ChatColor.RED + "INVALID USE OF COMMAND: /<command> {playername}");
            }

        }


        return false;
    }
}
