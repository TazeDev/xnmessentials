package xnmessentialss.cmd;


import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class admin implements CommandExecutor{
	
	   public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		   if(sender instanceof Player) {
			   Player p = (Player) sender;
			   if(p.hasPermission("xnme.admin")) {
				   if(vanish.invisible_list.contains(p)) {
					vanish.invisible_list.remove(p);
					p.setGameMode(GameMode.SURVIVAL);
					  for (Player alle : Bukkit.getOnlinePlayers()) {
						  alle.showPlayer(p);
					   }
					  p.sendMessage("§cDu bist sichtbar");
					  
				   }else if(!vanish.invisible_list.contains(p)) {
					   vanish.invisible_list.add(p);
						p.setGameMode(GameMode.CREATIVE);
						  for (Player alle : Bukkit.getOnlinePlayers()) {
							  alle.hidePlayer(p);
						   }
						  p.sendMessage("§aDu bist unsichtbar");
				   }
			   }else
				   p.sendMessage("§cDazu hast du keine Rechte.");
		   }else{
			   sender.sendMessage("Nein");
		   }
			   
		   return false;
	   }

}
