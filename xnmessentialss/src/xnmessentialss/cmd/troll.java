package xnmessentialss.cmd;

import org.bukkit.Bukkit;
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


public class troll implements CommandExecutor {
	  public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		  
		  if(sender instanceof Player) {
			  Player p = (Player) sender;
			  if(p.hasPermission("xnme.admin")) {
				  if(args.length == 0) {
					  Inventory inv = Bukkit.createInventory(null, 9*1, "§2TROLL-MENU");
					  
					  ItemStack grass = new ItemStack(Material.GRASS);
					  ItemMeta meta = grass.getItemMeta();
					  meta.setDisplayName("Setze dich in den Creativemode");
					  meta.addEnchant(Enchantment.DURABILITY, 10, false);
					  grass.setItemMeta(meta);
					  
					  
					  ItemStack barrier = new ItemStack(Material.BARRIER);
					  ItemMeta barriermeta = barrier.getItemMeta();
					  barriermeta.setDisplayName(ChatColor.RED + "Derzeit nicht verfügbar.");
					  barrier.setItemMeta(barriermeta);
					  
					  ItemStack pane = new ItemStack(Material.STAINED_GLASS_PANE);
					  ItemMeta panemeta = pane.getItemMeta();
					  panemeta.setDisplayName(" ");
					  pane.setItemMeta(panemeta);
					  
					  inv.setItem(0, pane); 
					  inv.setItem(1, grass);
					  inv.setItem(2, pane);
					  inv.setItem(3, barrier);
					  inv.setItem(4, pane);
					  inv.setItem(5, barrier);
					  inv.setItem(6, pane);
					  inv.setItem(7, barrier);
					  inv.setItem(8, pane);
					  
					  
					  p.openInventory(inv);
						  
					  }
				 }else if (args.length == 1) {
					  
				  }
			  }
		  
		  
		  return false;
	  }
}
