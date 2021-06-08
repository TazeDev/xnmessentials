package xnmessentialss.event;


import java.util.ArrayList;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.inventory.meta.ItemMeta;

import net.md_5.bungee.api.ChatColor;
import xnmessentialss.cmd.fly;
import xnmessentialss.cmd.vanish;

public class ClickEvents implements Listener {
	int i = 0;
	
	public static List<Player> adminmode = new ArrayList<>();
	
		@EventHandler
	public void clickEvent(InventoryClickEvent e) {
			
			Player p = (Player) e.getWhoClicked();
	
			//SPEZIELLE SACHEN DIE GENERELL IN DER KOMPLETTEN KLASSE GEBRAUCHT WERDEN KÖNNEN:
			
			ItemStack close = new ItemStack(Material.IRON_DOOR);
			  ItemMeta closemeta = close.getItemMeta();
			  closemeta.setDisplayName(ChatColor.RED + "Menu Schließen");
			  close.setItemMeta(closemeta);
			
			
			Inventory invamode = Bukkit.createInventory(null, 9*3, "§4Admin-Dienst");
			  
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
			
			Inventory inv2 = Bukkit.createInventory(null, 9*1, "§eItem-Menu");
			
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
			  
			  ItemStack barrier = new ItemStack(Material.BARRIER);
			  ItemMeta barriermeta = barrier.getItemMeta();
			  barriermeta.setDisplayName(ChatColor.RED + "Derzeit nicht verfügbar.");
			  barrier.setItemMeta(barriermeta);
			  
			  ItemStack pane = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) 4);
			  ItemMeta panemeta = pane.getItemMeta();
			  panemeta.setDisplayName(" ");
			  pane.setItemMeta(panemeta);
			  
			  inv2.setItem(0, pane);
			  inv2.setItem(1, knocks);
			  inv2.setItem(2, pane);
			  inv2.setItem(3, knockx);
			  inv2.setItem(4, pane);
			  inv2.setItem(5, opsense);
			  inv2.setItem(6, pane);
			  inv2.setItem(7, barrier);
			  inv2.setItem(8, close);
			
			  
			  
			  
			  Inventory inv = Bukkit.createInventory(null, 9*3, "§4Admin-Menu");
			  
			  ItemStack grass = new ItemStack(Material.GRASS);
			  ItemMeta meta = grass.getItemMeta();
			  meta.setDisplayName("§b§lÄnder deinen Spielmodus");
			  meta.addEnchant(Enchantment.DURABILITY, 10, false);
			  grass.setItemMeta(meta);
			  
			  
			 
			  
			  ItemStack godmode = new ItemStack(Material.GOLDEN_APPLE, 1, (short) 1);
			  ItemMeta godmeta = godmode.getItemMeta();
			  godmeta.setDisplayName(ChatColor.GOLD + "Godmode");
			  List<String> godlore = new ArrayList<String>();
			  if(godmodee.damage.contains(p.getName())) {
				  godmeta.addEnchant(Enchantment.DURABILITY, 10, false);
				  godlore.remove(ChatColor.GRAY + "GODMODE: " + ChatColor.RED + "AUS");
				  godlore.add(ChatColor.GRAY + "GODMODE: " + ChatColor.GREEN + "AN");
			  }else {
				  godlore.remove(ChatColor.GRAY + "GODMODE: " + ChatColor.GREEN + "AN");
				  godlore.add(ChatColor.GRAY + "GODMODE: " + ChatColor.RED + "AUS");
			  } 
			  godmeta.setLore(godlore);
			  godmode.setItemMeta(godmeta);
			  
			  
			  ItemStack heal1 = new ItemStack(Material.POTION, 1, (short) 8229);
			  ItemMeta heal1meta = heal1.getItemMeta();
			  heal1meta.setDisplayName(ChatColor.DARK_PURPLE + "Fähigkeiten-Menu");
			  List<String> heal1lore = new ArrayList<String>();
			  heal1lore.add(ChatColor.GRAY + "Öffne das Fähigkeitens-Menu");
			  heal1meta.setLore(heal1lore);
			  heal1.setItemMeta(heal1meta);
			  
			  ItemStack vliste = new ItemStack(Material.PAPER);
			  ItemMeta vlmeta = vliste.getItemMeta();
			  vlmeta.setDisplayName(ChatColor.DARK_AQUA +"Vanish Liste");
			  List<String> vllore = new ArrayList<String>();
			  vllore.add(ChatColor.GRAY + "Listet alle Spieler im Vanish auf");
			  vlmeta.setLore(vllore);
			  vliste.setItemMeta(vlmeta);
			  
			  
			  ItemStack knockx1 = new ItemStack(Material.BLAZE_ROD);
			  ItemMeta knockx1meta = knockx1.getItemMeta();
			  knockx1meta.setDisplayName(ChatColor.YELLOW + "§lItem-Menu");
			  List<String> knockxl1 = new ArrayList<String>();
			  knockxl1.add(ChatColor.GRAY + "Öffnet das ITEM-MENU auf das regulär");
			  knockxl1.add(ChatColor.GRAY + "nur Administratoren Zugriff haben.");
				knockx1meta.setLore(knockxl1);
			  knockx1.setItemMeta(knockx1meta);
			 
			  
			  ItemStack barrier2 = new ItemStack(Material.BARRIER);
			  ItemMeta barrier2meta = barrier2.getItemMeta();
			  barrier2meta.setDisplayName(ChatColor.RED + "Derzeit nicht verfügbar.");
			  barrier2.setItemMeta(barrier2meta);
			  
			  ItemStack supportmenu = new ItemStack(Material.GOLD_HELMET);
			  ItemMeta supportmenumeta = supportmenu.getItemMeta();
			  supportmenumeta.setDisplayName(ChatColor.YELLOW + "Support-Menu");
			  supportmenu.setItemMeta(supportmenumeta);
			  
			  
			  ItemStack pane1 = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) 14);
			  ItemMeta pane1meta = pane1.getItemMeta();
			  pane1meta.setDisplayName(" ");
			  pane1.setItemMeta(pane1meta);
			  
			  inv.setItem(0, pane1); 
			  inv.setItem(1, pane1);
			  inv.setItem(2, pane1);
			  inv.setItem(3, pane1);
			  inv.setItem(4, pane1);
			  inv.setItem(5, pane1);
			  inv.setItem(6, pane1);
			  inv.setItem(7, pane1);
			  inv.setItem(8, pane1);
			  inv.setItem(9, pane1); 
			  inv.setItem(10, grass);
			  inv.setItem(11, pane1);
			  inv.setItem(12, supportmenu);
			  inv.setItem(13, heal1);
			  inv.setItem(14, vliste);
			  inv.setItem(15, knockx1);
			  inv.setItem(16, close);
			  inv.setItem(17, pane1);
			  inv.setItem(18, pane1); 
			  inv.setItem(19, pane1);
			  inv.setItem(20, pane1);
			  inv.setItem(21, pane1);
			  inv.setItem(22, pane1);
			  inv.setItem(23, pane1);
			  inv.setItem(24, pane1);
			  inv.setItem(25, pane1);
			  inv.setItem(26, pane1);
			  
			  
			  
			  Inventory inv3 = Bukkit.createInventory(null, 9*1, "§dFähigkeitens-Menu");
			  
			  ItemStack heal = new ItemStack(Material.POTION, 1, (short) 8229);
			  ItemMeta healmeta = heal.getItemMeta();
			  healmeta.setDisplayName(ChatColor.DARK_PURPLE + "Heal");
			  List<String> heallore = new ArrayList<String>();
			  heallore.add(ChatColor.GRAY + "Heil deine Herzen voll auf.");
			  healmeta.setLore(heallore);
			  heal.setItemMeta(healmeta);
			  
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
			  ItemStack pane2 = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) 2);
			  ItemMeta pane2meta = pane2.getItemMeta();
			  pane2meta.setDisplayName(" ");
			  pane2.setItemMeta(pane2meta);
			  
			  inv3.setItem(0, pane2);
			  inv3.setItem(1, heal);
			  inv3.setItem(2, pane2);
			  inv3.setItem(3, vanishe);
			  inv3.setItem(4, pane2);
			  inv3.setItem(5, barrier);
			  inv3.setItem(6, pane2);
			  inv3.setItem(7, barrier);
			  inv3.setItem(8, close);
			  
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
			    
			  
			  
			
			if(e.getClickedInventory().getTitle().equalsIgnoreCase("§4Admin-Menu")) {
			
				
				switch(e.getCurrentItem().getType()) {	
				case GRASS:
					p.closeInventory();
					if(i == 0) {
					p.setGameMode(GameMode.CREATIVE);
					p.sendMessage("§aDu bist nun im Creative Mode.");
					i++;
					}else if(i == 1) {
						p.setGameMode(GameMode.SURVIVAL);
						p.sendMessage("§aDu bist nun um Survival Mode.");
						i--;
					}
					break;
				case GOLD_HELMET:
					p.sendMessage(ChatColor.RED + "Derzeit nicht Implementiert!");
				case IRON_DOOR:
					p.closeInventory();
					break;
					
				case GHAST_TEAR:
					p.closeInventory();
					if(vanish.invisible_list.contains(p)) {
						   for (Player alle : Bukkit.getOnlinePlayers()) {
								  alle.showPlayer(p);
							   }
						   p.setDisplayName(p.getName());
						   vanish.invisible_list.remove(p);
						   p.sendMessage("§cDu bist nun sichtbar");
					   }else if(!vanish.invisible_list.contains(p)) {
						   for (Player alle : Bukkit.getOnlinePlayers()) {
							  alle.hidePlayer(p);
						   }
						   p.setDisplayName("§7Vanished " + p.getName());
						   vanish.invisible_list.add(p);
						   p.sendMessage("§aDu bist unsichtbar");
					   }
					break;
					
				case FEATHER:
					if(p.getAllowFlight() == true) {
		            	p.setAllowFlight(false);
		            	p.sendMessage(ChatColor.RED + "Du kannst nicht mehr fliegen");
		            	fly.fly_list.remove(p);
		            } else {
		            	p.setAllowFlight(true);
		            	p.sendMessage(ChatColor.GREEN + "Du kannst nun fliegen.");
		            	fly.fly_list.add(p);
		            }
					p.closeInventory();
					break;
					
					
				case GOLDEN_APPLE:
					p.sendMessage(ChatColor.RED + "Dieses feature ist derzeit nicht verfügbar");
					p.closeInventory();
					break;
					
				case POTION:
					p.closeInventory();
					p.openInventory(inv3);
				break;
					
				case PAPER:
					p.sendMessage("§bDerzeit sind " + vanish.invisible_list.size() + " §bunsichtbar");
					p.sendMessage(vanish.invisible_list.toString());
					p.closeInventory();
					break;
					
				case BARRIER:
					p.closeInventory();
					p.sendMessage("§cDerzeit nicht verfügbar");
					break;
					
				case BLAZE_ROD:
					ItemStack knockx2 = new ItemStack(Material.BLAZE_ROD);
					  ItemMeta knockx2meta = knockx2.getItemMeta();
					  knockx2meta.setDisplayName(ChatColor.LIGHT_PURPLE + "§lEXTREME Knock Tester");
					  knockx2meta.addEnchant(Enchantment.KNOCKBACK, 20, true);
					  knockx.setItemMeta(knockx2meta);
					  p.closeInventory();
					  p.openInventory(inv2);
					  break;
				}
				e.setCancelled(true);
				}
				
		
				if(e.getClickedInventory().getTitle().equalsIgnoreCase("§4Admin-Dienst")) {
					switch(e.getCurrentItem().getType()) {	
					case EMERALD_BLOCK:
						p.closeInventory();
						adminmode.add(p);
						p.openInventory(inv);
						break;
					case IRON_DOOR:
						p.closeInventory();
						break;
					case REDSTONE_BLOCK:
						adminmode.remove(p);
						p.closeInventory();
						p.openInventory(invamode);
						p.closeInventory();
						p.openInventory(invamode);
						break;
					case GLOWSTONE_DUST:
						p.closeInventory();
						p.openInventory(inv);
						
					}
					e.setCancelled(true);
					}
			if(e.getClickedInventory().getTitle().equalsIgnoreCase("§5Creator Ränge:")) {
				switch(e.getCurrentItem().getType()) {
				case IRON_DOOR:
					p.closeInventory();
					break;
				case FIREWORK:
					p.sendMessage("§l§3Den Rang kannst du mit einem Ticket anfordern.");
					p.sendMessage("§9Discord: §bhttps://discord.gg/52DF47S5Jh");
				case MAGMA_CREAM:
					p.closeInventory();
				}
				e.setCancelled(true);
				}
			
			
			
			
			if(e.getClickedInventory().getTitle().equalsIgnoreCase("§eItem-Menu")) {
				switch(e.getCurrentItem().getType()) {	
				case IRON_DOOR:
					p.closeInventory();
					break;
				case STICK:
					ItemStack knocks2 = new ItemStack(Material.STICK);
					  ItemMeta knocks2meta = knocks2.getItemMeta();
					  knocks2meta.setDisplayName(ChatColor.LIGHT_PURPLE + "Legit Knock Tester");
					  knocks2meta.addEnchant(Enchantment.KNOCKBACK, 1, true);
					  knocks2.setItemMeta(knocks2meta);
					  PlayerInventory pinv = p.getInventory();	
					  pinv.addItem(knocks2);
					  p.closeInventory();
					  break;
					  
				case BLAZE_ROD:
					ItemStack knockx2 = new ItemStack(Material.BLAZE_ROD);
					  ItemMeta knockx2meta = knockx2.getItemMeta();
					  knockx2meta.setDisplayName(ChatColor.LIGHT_PURPLE + "§lEXTREME Knock Tester");
					  knockx2meta.addEnchant(Enchantment.KNOCKBACK, 20, true);
					  knockx2.setItemMeta(knockx2meta);
					  PlayerInventory pinv2 = p.getInventory();
					  p.closeInventory();
					  pinv2.addItem(knockx2);
					  break;
					  
				case IRON_HOE:
					ItemStack opsense2 = new ItemStack(Material.IRON_HOE);
					  ItemMeta meta2sense = opsense2.getItemMeta();
					  meta2sense.setDisplayName(ChatColor.DARK_PURPLE + "§lSense des Todes");
					  meta2sense.addEnchant(Enchantment.DAMAGE_ALL, 1200, true);
					  opsense2.setItemMeta(meta2sense);
					  PlayerInventory pinv3 = p.getInventory();
					  pinv3.addItem(opsense2);
					  p.closeInventory();
					  break;
				}
				e.setCancelled(true);
				}
			
			
			if(e.getClickedInventory().getTitle().equalsIgnoreCase("§dFähigkeitens-Menu")) {
				switch(e.getCurrentItem().getType()) {
				case IRON_DOOR:
					p.closeInventory();
					break;
			
	case GHAST_TEAR:
		p.closeInventory();
		if(vanish.invisible_list.contains(p)) {
			   for (Player alle : Bukkit.getOnlinePlayers()) {
					  alle.showPlayer(p);
				   }
			   p.setDisplayName(p.getName());
			   vanish.invisible_list.remove(p);
			   p.sendMessage("§cDu bist nun sichtbar");
		   }else if(!vanish.invisible_list.contains(p)) {
			   for (Player alle : Bukkit.getOnlinePlayers()) {
				  alle.hidePlayer(p);
			   }
			   p.setDisplayName("§7Vanished " + p.getName());
			   vanish.invisible_list.add(p);
			   p.sendMessage("§aDu bist unsichtbar");
		   }
		break;
		
	case FEATHER:
		if(p.getAllowFlight() == true) {
        	p.setAllowFlight(false);
        	p.sendMessage(ChatColor.RED + "Du kannst nicht mehr fliegen");
        	fly.fly_list.remove(p);
        } else {
        	p.setAllowFlight(true);
        	p.sendMessage(ChatColor.GREEN + "Du kannst nun fliegen.");
        	fly.fly_list.add(p);
        }
		p.closeInventory();
		break;
				}
		e.setCancelled(true);
			}
		
		}
			
		}
		

