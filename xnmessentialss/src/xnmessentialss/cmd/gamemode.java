package xnmessentialss.cmd;

import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import net.md_5.bungee.api.ChatColor;

public class gamemode implements CommandExecutor{
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if(sender instanceof Player) {
			Player p = (Player) sender;
			if(p.hasPermission("xnme.admin")) {
				if(args.length == 0) {
					p.sendMessage("§c Meinst du /gm 0 | 1 | 2 | 3");
				}else if(args.length == 1) {
					if(args[0].equalsIgnoreCase("0")){
						p.setGameMode(GameMode.SURVIVAL);
						p.sendMessage(ChatColor.GRAY + "Spielmodus geändert");
					}else if(args[0].equalsIgnoreCase("1")){
						p.setGameMode(GameMode.CREATIVE);
						p.sendMessage(ChatColor.GRAY + "Spielmodus geändert");
					}else if(args[0].equalsIgnoreCase("2")){
						p.setGameMode(GameMode.ADVENTURE);
						p.sendMessage(ChatColor.GRAY + "Spielmodus geändert");
					}else if(args[0].equalsIgnoreCase("3")){
						p.setGameMode(GameMode.SPECTATOR);
						p.sendMessage(ChatColor.GRAY + "Spielmodus geändert");
					}
				}else if(args.length == 2) {
					Player t = Bukkit.getPlayer(args[0]);
					if(t != null) {
				
						if(args[0].equalsIgnoreCase("0")){
						t.setGameMode(GameMode.SURVIVAL);
						t.sendMessage(ChatColor.GRAY + "Spielmodus geändert");
						p.sendMessage(ChatColor.GRAY + "Spielmodus geändert");
					}else if(args[0].equalsIgnoreCase("1")){
						t.setGameMode(GameMode.CREATIVE);
						t.sendMessage(ChatColor.GRAY + "Spielmodus geändert");
						p.sendMessage(ChatColor.GRAY + "Spielmodus geändert");
					}else if(args[0].equalsIgnoreCase("2")){
						t.setGameMode(GameMode.ADVENTURE);
						t.sendMessage(ChatColor.GRAY + "Spielmodus geändert");
						p.sendMessage(ChatColor.GRAY + "Spielmodus geändert");
					}else if(args[0].equalsIgnoreCase("3")){
						t.setGameMode(GameMode.SPECTATOR);
						t.sendMessage(ChatColor.GRAY + "Spielmodus geändert");
						p.sendMessage(ChatColor.GRAY + "Spielmodus geändert");
						
					} 
				}
				}
				
			}
		}else 
			sender.sendMessage("Nein");
		return false;
	}
}
