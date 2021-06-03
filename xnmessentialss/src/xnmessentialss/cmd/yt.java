package xnmessentialss.cmd;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class yt implements CommandExecutor {
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if(sender instanceof Player) {
			Player p = (Player) sender;
			
			Inventory youtube = Bukkit.createInventory(null, 9*3, "§5Creator Ränge:");
			ItemStack byt = new ItemStack(Material.FIREWORK);
			ItemMeta byt_meta = byt.getItemMeta();
			byt_meta.setDisplayName("§5§lBIG CREATOR");
			List<String> bytl = new ArrayList<String>();
			bytl.add("§b§l1000 Abonenneten");
			bytl.add("§b5K Views/Monat");
			byt_meta.setLore(bytl);
			byt.setItemMeta(byt_meta);
			
			
			

			
			youtube.setItem(4, byt);
			
			p.openInventory(youtube);
		}
		return false;
	}
}
