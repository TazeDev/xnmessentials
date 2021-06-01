package xnmessentialss.cmd;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import xnmessentialss.main.Main;

public class vanish implements CommandExecutor {
	
	public ArrayList<Player> invisible_list = new ArrayList<Player>();
	
	
	Main plugin;
	
	public vanish(Main plugin) {
		this.plugin = plugin;
	}
	
	   public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		   
		   if(sender instanceof Player) {
			   Player p = (Player) sender;
			   if(p.hasPermission("xnme.admin")) {
				   if(args.length == 0) {
					   if(invisible_list.contains(p)) {
						   for (Player alle : Bukkit.getOnlinePlayers()) {
								  alle.showPlayer(p);
							   }
						   invisible_list.remove(p);
						   p.sendMessage("§cDu bist nun sichtbar");
					   }else if(!invisible_list.contains(p)) {
						   for (Player alle : Bukkit.getOnlinePlayers()) {
							  alle.hidePlayer(p);
						   }
						   invisible_list.add(p);
						   p.sendMessage("§aDu bist unsichtbar");
					   }
				   }else if(args.length == 1) {
					   Player t = Bukkit.getPlayer(args[0]);
					   if(t != null) {
					   if(invisible_list.contains(t)) {
						   for (Player alle : Bukkit.getOnlinePlayers()) {
								  alle.showPlayer(t);
							   }
						   invisible_list.remove(t);
						   t.sendMessage("§cDu bist nun sichtbar");
						   p.sendMessage("§cDer Spieler §7" + t.getName() + " §cist nun sichtbar");
					   }else if(!invisible_list.contains(t)) {
						   for (Player alle : Bukkit.getOnlinePlayers()) {
							  alle.hidePlayer(t);
						   }
						   invisible_list.add(t);
						   t.sendMessage("§aDu bist unsichtbar");
						   p.sendMessage("§aDer Spieler §7" + t.getName() + " §aist nun unsichtbar");
					   }
					   }
				   }
			   }else
				  p.sendMessage("§cDu hast dazu kein Recht.");
			   
		   }else
			   sender.sendMessage("nein");
		   return false;
	   }
}
