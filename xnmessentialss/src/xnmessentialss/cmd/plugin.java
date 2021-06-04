package xnmessentialss.cmd;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class plugin implements CommandExecutor {
	  public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		  if(sender instanceof Player) {
			  Player p = (Player) sender;
			 
			  p.sendMessage("Plugins (1): §axnmeSystem");
		  }
		  return false;
	  }

}
