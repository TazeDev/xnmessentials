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
	            if(p.hasPermission("xnme.admin")) {
	            	if(args.length == 0) {
	            		
	            	
	            if(p.getAllowFlight() == true) {
	            	p.setAllowFlight(false);
	            	p.sendMessage("§cDu kannst nicht mehr fliegen");
	            } else {
	            	p.setAllowFlight(true);
	            	p.sendMessage("§aDu kannst nun fliegen.");
	            }
	            	
	            }else if(args.length == 1) {
	            	Player t = Bukkit.getPlayer(args[0]);
	            	if(t != null) {
	            		   if(t.getAllowFlight() == true) {
	       	            	t.setAllowFlight(false);
	       	            	t.sendMessage("§cDu kannst nicht mehr fliegen.");
	       	            	p.sendMessage("§cDer Spieler §7" + t.getName() + "§c kann nicht mehr fliegen.");
	       	            } else {
	       	            	t.setAllowFlight(true);
	       	            	t.sendMessage("§aDu kannst nun fliegen.");
	       	            	p.sendMessage("§aDer Spieler §7" + t.getName() + "§a kann fliegen.");
	       	            }
	            	}
	            	}
	            } else {
	            	p.sendMessage("§cDu hast dazu keine Rechte.");
	            }
		   }else{
			   sender.sendMessage("Nein");
		   }
		   return false;
	   }
}