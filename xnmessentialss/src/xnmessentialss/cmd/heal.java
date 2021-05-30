package xnmessentialss.cmd;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class heal implements CommandExecutor {
	   public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		   
		   if (sender instanceof Player) {
	            Player p = (Player) sender;
	            if(p.hasPermission("xnme.heal")) {
	            	if(args.length == 0) {
	            		
	            	
	            	p.setHealth(20);
	            	p.setSaturation(20);
	            	p.sendMessage("§aYou were healed and your hunger was stilled.");
	            	}else if(args.length == 1) {
	            		Player t = Bukkit.getPlayer(args[0]);
	            		if(t != null) {
	            			t.setHealth(20);
	    	            	t.setSaturation(20);
	    	            	t.sendMessage("§aYou were healed and your hunger was stilled.");
	    	            	p.sendMessage("§aYou healed §7" + t.getName());
	            		}
	            	}
	            }else
	            	sender.sendMessage("§cYou are missing the right permissions.");
		   }else
			   sender.sendMessage("You have to be a Player to do that.");
		   return false;
}
}
