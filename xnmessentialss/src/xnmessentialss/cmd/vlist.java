package xnmessentialss.cmd;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class vlist implements CommandExecutor{
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if(sender instanceof Player) {
			Player p = (Player) sender;
			if(p.hasPermission("xnme.admin")) {
				p.sendMessage("§bDerzeit sind " + vanish.invisible_list.size() + " §bunsichtbar");
				p.sendMessage(vanish.invisible_list.toString());
			}else{
				p.sendMessage("§cDu hast kein Recht dazu.");
			}
		}else{
			sender.sendMessage("Nein");
		}
		return false;
	}
}
