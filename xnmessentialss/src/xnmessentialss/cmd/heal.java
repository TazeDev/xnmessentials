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
	            if(p.hasPermission("xnme.admin")) {
	            	if(args.length == 0) {
	            	p.setHealth(20);
	            	p.setFoodLevel(20);
	            	p.sendMessage("§aDu wurdest geheilt.");
	            	}else if(args.length == 1) {
	            		Player t = Bukkit.getPlayer(args[0]);
	            		if(t != null) {
	            			t.setHealth(20);
	    	            	t.setFoodLevel(20);
	    	            	t.sendMessage("§aDu wurdest geheilt.");
	    	            	p.sendMessage("§aDu hast §7" + t.getName() + " §ageheilt");
	            		}
	            	}
	            }else
	            	sender.sendMessage("§cDu hast dazu kein Recht.");
		   }else
			   sender.sendMessage("Nein");
		   return false;
}
}
