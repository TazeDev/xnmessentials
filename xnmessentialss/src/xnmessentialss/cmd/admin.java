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
					  Inventory inv = Bukkit.createInventory(null, 9*3, "§4Admin-Menu");
					  
					  ItemStack grass = new ItemStack(Material.GRASS);
					  ItemMeta meta = grass.getItemMeta();
					  meta.setDisplayName("§b§lÄnder deinen Spielmodus");
					  meta.addEnchant(Enchantment.DURABILITY, 10, false);
					  grass.setItemMeta(meta);
					  
					  
					  ItemStack vanishe = new ItemStack(Material.GHAST_TEAR);
					  ItemMeta vanishemeta = vanishe.getItemMeta();
					  List<String> vanishl = new ArrayList<String>();
					  vanishemeta.setDisplayName(ChatColor.DARK_GRAY + "Vanish");
					  if(vanish.invisible_list.contains(p)) {
						  vanishemeta.addEnchant(Enchantment.DURABILITY, 10, false);
						  vanishl.remove(ChatColor.GRAY + "Vanish: " + ChatColor.RED + "AUS");
						  vanishl.add(ChatColor.GRAY + "Vanish: " + ChatColor.GREEN + "AN");
					  }else {
						  vanishemeta.removeEnchant(Enchantment.DURABILITY);
						  vanishl.remove(ChatColor.GRAY + "Vanish: " + ChatColor.GREEN + "AN");
						  vanishl.add(ChatColor.GRAY + "Vanish: " + ChatColor.RED + "AUS");
					  }  
						vanishemeta.setLore(vanishl);
					  vanishe.setItemMeta(vanishemeta);
					  
					  
					  ItemStack flye = new ItemStack(Material.FEATHER);
					  ItemMeta flyemeta = flye.getItemMeta();
					  flyemeta.setDisplayName(ChatColor.AQUA + "Fly");
					  List<String> flylore = new ArrayList<String>();
					  vanishemeta.setDisplayName(ChatColor.AQUA + "Fly");
					  if(fly.fly_list.contains(p)) {
						  flyemeta.addEnchant(Enchantment.DURABILITY, 10, false);
						  flylore.remove(ChatColor.GRAY + "Fly: " + ChatColor.RED + "AUS");
						  flylore.add(ChatColor.GRAY + "Fly: " + ChatColor.GREEN + "AN");
					  }else {
						  flyemeta.removeEnchant(Enchantment.DURABILITY);
						  flylore.remove(ChatColor.GRAY + "Fly: " + ChatColor.GREEN + "AN");
						  flylore.add(ChatColor.GRAY + "Fly: " + ChatColor.RED + "AUS");
					  }  
						flyemeta.setLore(flylore);
					  flye.setItemMeta(flyemeta);
					  
					  ItemStack godmode = new ItemStack(Material.GOLDEN_APPLE, 1, (short) 1);
					  ItemMeta godmeta = godmode.getItemMeta();
					  godmeta.setDisplayName(ChatColor.GOLD + "Godmode");
					  List<String> godlore = new ArrayList<String>();
					  if(godmodee.damage.contains(p.getName())) {
						  godmeta.addEnchant(Enchantment.DURABILITY, 10, false);
						  godlore.remove(ChatColor.GRAY + "GODMODE: " + ChatColor.RED + "AUS");
						  flylore.add(ChatColor.GRAY + "GODMODE: " + ChatColor.GREEN + "AN");
					  }else {
						  flylore.remove(ChatColor.GRAY + "GODMODE: " + ChatColor.GREEN + "AN");
						  godlore.add(ChatColor.GRAY + "GODMODE: " + ChatColor.RED + "AUS");
					  } 
					  godmeta.setLore(godlore);
					  godmode.setItemMeta(godmeta);
					  
					  
					  ItemStack heal = new ItemStack(Material.POTION, 1, (short) 8229);
					  ItemMeta healmeta = heal.getItemMeta();
					  healmeta.setDisplayName(ChatColor.DARK_PURPLE + "Heal");
					  List<String> heallore = new ArrayList<String>();
					  heallore.add(ChatColor.GRAY + "Heil deine Herzen voll auf.");
					  healmeta.setLore(heallore);
					  heal.setItemMeta(healmeta);
					  
					  ItemStack vliste = new ItemStack(Material.PAPER);
					  ItemMeta vlmeta = vliste.getItemMeta();
					  vlmeta.setDisplayName(ChatColor.DARK_AQUA +"Vanish Liste");
					  List<String> vllore = new ArrayList<String>();
					  vllore.add(ChatColor.GRAY + "Listet alle Spieler im Vanish auf");
					  vlmeta.setLore(vllore);
					  vliste.setItemMeta(vlmeta);
					  
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
					  metasense.setDisplayName(ChatColor.DARK_PURPLE + "Sense");
					  List<String> senselore = new ArrayList<String>();
					  senselore.add(ChatColor.GRAY + "Gibt dir eine OneHit Sense");
					  metasense.setLore(senselore);
					  opsense.setItemMeta(metasense);
					  
					  
					  ItemStack barrier = new ItemStack(Material.BARRIER);
					  ItemMeta barriermeta = barrier.getItemMeta();
					  barriermeta.setDisplayName(ChatColor.RED + "Derzeit nicht verfügbar.");
					  barrier.setItemMeta(barriermeta);
					  
					  ItemStack pane = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) 14);
					  ItemMeta panemeta = pane.getItemMeta();
					  panemeta.setDisplayName(" ");
					  pane.setItemMeta(panemeta);
					  
					  inv.setItem(0, pane); 
					  inv.setItem(1, pane);
					  inv.setItem(2, pane);
					  inv.setItem(3, vanishe);
					  inv.setItem(4, pane);
					  inv.setItem(5, heal);
					  inv.setItem(6, pane);
					  inv.setItem(7, knocks);
					  inv.setItem(8, pane);
					  inv.setItem(9, pane); 
					  inv.setItem(10, grass);
					  inv.setItem(11, pane);
					  inv.setItem(12, flye);
					  inv.setItem(13, pane);
					  inv.setItem(14, vliste);
					  inv.setItem(15, pane);
					  inv.setItem(16, knockx);
					  inv.setItem(17, pane);
					  inv.setItem(18, pane); 
					  inv.setItem(19, pane);
					  inv.setItem(20, pane);
					  inv.setItem(21, godmode);
					  inv.setItem(22, pane);
					  inv.setItem(23, barrier);
					  inv.setItem(24, pane);
					  inv.setItem(25, opsense);
					  inv.setItem(26, pane);
					  
					  
					  
					  p.openInventory(inv);
						  
					  }
				 }else if (args.length == 1) {
					  
				  }
			  }else
				  sender.sendMessage("Nein");
		  
		  
		  return false;
	  }
}
