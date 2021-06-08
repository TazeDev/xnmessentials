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

import net.md_5.bungee.api.ChatColor;

public class adminitems implements CommandExecutor{
	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		
		if(sender instanceof Player) {
			Player p = (Player) sender;
			if(p.hasPermission("xnme.aItems")) {
			 final Inventory inv2 = Bukkit.createInventory(null, 9*3, "§eItem-Menu");
				
				ItemStack knocks = new ItemStack(Material.STICK);
				  ItemMeta knocksmeta = knocks.getItemMeta();
				  knocksmeta.setDisplayName(ChatColor.LIGHT_PURPLE + "Legit Knock Tester");
				  List<String> knocksl = new ArrayList<String>();
				  knocksl.add(ChatColor.GRAY + "Gibt dir einen normalen Knockback Stick");
					knocksmeta.setLore(knocksl);
				  knocks.setItemMeta(knocksmeta);
				  
				  
				  ItemStack knockx = new ItemStack(Material.BLAZE_ROD);
				  ItemMeta knockxmeta = knockx.getItemMeta();
				  knockxmeta.setDisplayName(ChatColor.LIGHT_PURPLE + "§lEXTREME Knock Tester");
				  List<String> knockxl = new ArrayList<String>();
				  knockxl.add(ChatColor.GRAY + "Gibt dir einen EXTREMEN Knockback Stick");
					knockxmeta.setLore(knockxl);
				  knockx.setItemMeta(knockxmeta);
				  
				  ItemStack opsense = new ItemStack(Material.IRON_HOE);
				  ItemMeta metasense = opsense.getItemMeta();
				  metasense.setDisplayName(ChatColor.DARK_PURPLE + "Sense des Todes");
				  List<String> senselore = new ArrayList<String>();
				  senselore.add(ChatColor.GRAY + "Gibt dir eine OneHit Sense");
				  metasense.setLore(senselore);
				  opsense.setItemMeta(metasense);
				  
				  inv2.setItem(0, opsense);
				  inv2.setItem(1, knocks);
				  inv2.setItem(2, knockx);
				  p.openInventory(inv2);
			}
		}
		
		return false;
	}
}
