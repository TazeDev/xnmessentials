package xnmessentialss.cmd;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.DyeColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import net.md_5.bungee.api.ChatColor;
import xnmessentialss.event.ClickEvents;
import xnmessentialss.event.godmodee;


public class admin implements CommandExecutor {
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		  
		  if(sender instanceof Player) {
			  Player p = (Player) sender;
			  if(p.hasPermission("xnme.admin")) {
				  if(args.length == 0) {
					  Inventory invamode = Bukkit.createInventory(null, 9*3, "§4Admin-Dienst");
					  
					  ItemStack close = new ItemStack(Material.IRON_DOOR);
					  ItemMeta closemeta = close.getItemMeta();
					  closemeta.setDisplayName(ChatColor.RED + "Menu Schließen");
					  close.setItemMeta(closemeta);
					  
					  ItemStack gpane5 = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) 7);
					  ItemMeta gpane5meta = gpane5.getItemMeta();
					  gpane5meta.setDisplayName("");
					  gpane5.setItemMeta(gpane5meta);
					  
					  ItemStack activate = new ItemStack(Material.EMERALD_BLOCK);
					  ItemMeta activatemeta = gpane5.getItemMeta();
					  activatemeta.setDisplayName(ChatColor.GREEN + "In den Admin-Dienst gehen");
					  activate.setItemMeta(activatemeta);
					  
					  ItemStack deactivate = new ItemStack(Material.REDSTONE_BLOCK);
					  ItemMeta deactivatemeta = deactivate.getItemMeta();
					  deactivatemeta.setDisplayName(ChatColor.RED + "Aus den Admin-Dienst gehen");
					  deactivate.setItemMeta(deactivatemeta);
					  
					  ItemStack reopen = new ItemStack(Material.GLOWSTONE_DUST);
					  ItemMeta reopenmeta = reopen.getItemMeta();
					  reopenmeta.setDisplayName(ChatColor.YELLOW + "Das Admin Menu öffnen");
					  reopen.setItemMeta(reopenmeta);
					  
					  if(ClickEvents.adminmode.contains(p)) {
						  invamode.setItem(0, gpane5);
						  invamode.setItem(1, gpane5);
						  invamode.setItem(2, gpane5);
						  invamode.setItem(3, gpane5);
						  invamode.setItem(4, gpane5);
						  invamode.setItem(5, gpane5);
						  invamode.setItem(6, gpane5);
						  invamode.setItem(7, gpane5);
						  invamode.setItem(8, gpane5);
						  invamode.setItem(9, gpane5);
						  invamode.setItem(10, gpane5);
						  invamode.setItem(11, gpane5);
						  invamode.setItem(12, deactivate);
						  invamode.setItem(13, gpane5);
						  invamode.setItem(14, reopen);
						  invamode.setItem(15, gpane5);
						  invamode.setItem(16, gpane5);
						  invamode.setItem(17, gpane5);
						  invamode.setItem(18, gpane5);
						  invamode.setItem(19, gpane5);
						  invamode.setItem(20, gpane5);
						  invamode.setItem(21, gpane5);
						  invamode.setItem(22, gpane5);
						  invamode.setItem(23, gpane5);
						  invamode.setItem(24, gpane5);
						  invamode.setItem(25, gpane5);
						  invamode.setItem(26, close);
					  }else if(!(ClickEvents.adminmode.contains(p))) {
						  invamode.setItem(0, gpane5);
						  invamode.setItem(1, gpane5);
						  invamode.setItem(2, gpane5);
						  invamode.setItem(3, gpane5);
						  invamode.setItem(4, gpane5);
						  invamode.setItem(5, gpane5);
						  invamode.setItem(6, gpane5);
						  invamode.setItem(7, gpane5);
						  invamode.setItem(8, gpane5);
						  invamode.setItem(9, gpane5);
						  invamode.setItem(10, gpane5);
						  invamode.setItem(11, gpane5);
						  invamode.setItem(12, gpane5);
						  invamode.setItem(13, activate);
						  invamode.setItem(14, gpane5);
						  invamode.setItem(15, gpane5);
						  invamode.setItem(16, gpane5);
						  invamode.setItem(17, gpane5);
						  invamode.setItem(18, gpane5);
						  invamode.setItem(19, gpane5);
						  invamode.setItem(20, gpane5);
						  invamode.setItem(21, gpane5);
						  invamode.setItem(22, gpane5);
						  invamode.setItem(23, gpane5);
						  invamode.setItem(24, gpane5);
						  invamode.setItem(25, gpane5);
						  invamode.setItem(26, close);
					  }
					  
					  
					  p.openInventory(invamode);
						  
					  }
				 }else if (args.length == 1) {
					  
				  }
			  }else
				  sender.sendMessage("Nein");
		  
		  
		  return false;
	  }
}
