package xnmessentialss.cmd;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import net.md_5.bungee.api.ChatColor;

public class warn implements CommandExecutor{
	
	 List<String> warn_hacks = new ArrayList<String>();
	
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		
		if(sender instanceof Player) {
			Player p = (Player) sender;
			Player t = Bukkit.getPlayer(args[0]);
			if(p.hasPermission("xnme.warn")) {
				if(args.length == 0) {
				p.sendMessage(ChatColor.RED + "Nutze dazu /warn <name>");	
				}else if(args.length == 1) {
					
				Inventory inv = Bukkit.createInventory(null, 9*3, "ßcWARN-MENU");
				
				ItemStack close = new ItemStack(Material.REDSTONE_BLOCK);
				ItemMeta close_meta = close.getItemMeta();
				close_meta.setDisplayName(ChatColor.RED + "Schlieﬂen");
				List<String> close_lore = new ArrayList<String>();
				close_lore.add(ChatColor.RED + "Schlieﬂt das menu");
				close_meta.setLore(close_lore);
				close.setItemMeta(close_meta);
				
				ItemStack hacks = new ItemStack(Material.IRON_SWORD);
				ItemMeta hacks_meta = hacks.getItemMeta();
				hacks_meta.setDisplayName(ChatColor.RED + "Schlieﬂen");
				List<String> hacks_lore = new ArrayList<String>();
				hacks_lore.add(ChatColor.RED + "Schlieﬂt das menu");
				hacks_meta.setLore(hacks_lore);
				hacks.setItemMeta(hacks_meta);
				
				inv.setItem(2, close);
				inv.setItem(3, hacks);
				p.openInventory(inv);
				
				}else if(args.length == 2) {
					p.sendMessage(ChatColor.RED + "Nutze dazu /warn <name>");
				}
				
			}
		}else
			sender.sendMessage("Nein");
		
	return false;
	}
	

}
