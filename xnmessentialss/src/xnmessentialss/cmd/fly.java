package xnmessentialss.cmd;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class fly implements CommandExecutor {
	   public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		   if (sender instanceof Player) {
	            Player p = (Player) sender;
	            if(p.hasPermission("fly")) {
	            if(p.getAllowFlight() == true) {
	            	p.setAllowFlight(false);
	            } else {
	            	p.setAllowFlight(true);
	            }  
	            } else {
	            	p.sendMessage("&cYou are not allowed to use this command!");
	            }
		   } else {
			   sender.sendMessage("You have to be a Player to do that!");
		   }
		   return false;
	   }
}