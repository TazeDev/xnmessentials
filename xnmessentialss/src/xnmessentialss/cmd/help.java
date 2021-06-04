package xnmessentialss.cmd;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class help implements CommandExecutor {
	  public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		  if(sender instanceof Player) {
			  Player p = (Player) sender;
			  if(args.length == 0) {
				  p.sendMessage("§axnmeSystem Version: §l§b V0.871");
				  p.sendMessage("§7/help xnmesystem Zeigt dir die hilfe an.");
			  }else if(args.length == 1) {
				  if(args[0].equalsIgnoreCase("xnmesystem")) {
					  p.sendMessage("██████████XNMESYS██████████");
					  p.sendMessage("§2§lxnmeSystem wurde von Taze gecodet");
					  p.sendMessage("§bxnmeSystem ist OpenSource");
					  p.sendMessage("§9xnmeSystem Version: 0.871");
					  p.sendMessage("§c§lDAS SYSTEM IST NICHT ERWERBLICH");
					  p.sendMessage("████████████X████████████");
				  }else {
					  p.sendMessage("██████████XNMESYS██████████");
					  p.sendMessage("§2§lxnmeSystem wurde von Taze gecodet");
					  p.sendMessage("§bxnmeSystem ist OpenSource");
					  p.sendMessage("§9xnmeSystem Version: 0.871");
					  p.sendMessage("§c§lDAS SYSTEM IST NICHT ERWERBLICH");
					  p.sendMessage("████████████X████████████");
				  }
			  }
		  }
		  
		  
		  
		  
		  
		  
		  return false;
	  }
}
