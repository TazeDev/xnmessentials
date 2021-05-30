package xnmessentialss.cmd;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class fly implements CommandExecutor {
	   public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		   if (sender instanceof Player) {
	            Player p = (Player) sender;
	            if(p.hasPermission("fly")) {
	            	if(args.length == 0) {
	            		
	            	
	            if(p.getAllowFlight() == true) {
	            	p.setAllowFlight(false);
	            	p.sendMessage("§cYou cannot fly anymore.");
	            } else {
	            	p.setAllowFlight(true);
	            	p.sendMessage("§aYou can fly now.");
	            }
	            	
	            }else if(args.length == 1) {
	            	Player t = Bukkit.getPlayer(args[0]);
	            	if(t != null) {
	            		   if(p.getAllowFlight() == true) {
	       	            	t.setAllowFlight(false);
	       	            	t.sendMessage("§cYou cannot fly anymore.");
	       	            	p.sendMessage("§cThe player §7" + t.getName() + "§c can not fly.");
	       	            } else {
	       	            	t.setAllowFlight(true);
	       	            	t.sendMessage("§aYou can fly n ow.");
	       	            	p.sendMessage("§aThe player §7" + t.getName() + "§a can fly.");
	       	            }
	            	}
	            	}
	            } else {
	            	p.sendMessage("&cYou are not allowed to use this command!");
	            }
		   }else{
			   sender.sendMessage("You have to be a Player to do that!");
		   }
		   return false;
	   }
}