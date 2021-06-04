package xnmessentialss.event;


import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.inventory.meta.ItemMeta;

import net.md_5.bungee.api.ChatColor;
import xnmessentialss.cmd.fly;
import xnmessentialss.cmd.vanish;

public class ClickEvents implements Listener {
	int i = 0;
		@EventHandler
	public void clickEvent(InventoryClickEvent e) {
			
			Player p = (Player) e.getWhoClicked();
			
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
					p.setMaxHealth(20);
	            	p.setHealth(20);
	            	p.setFoodLevel(20);
	            	p.sendMessage("§aDu wurdest geheilt.");
	            	p.closeInventory();
				break;
					
				case PAPER:
					p.sendMessage("§bDerzeit sind " + vanish.invisible_list.size() + " §bunsichtbar");
					p.sendMessage(vanish.invisible_list.toString());
					p.closeInventory();
					break;
				
					
			
				case STICK:
					ItemStack knocks = new ItemStack(Material.STICK);
					  ItemMeta knocksmeta = knocks.getItemMeta();
					  knocksmeta.setDisplayName(ChatColor.LIGHT_PURPLE + "Legit Knock Tester");
					  knocksmeta.addEnchant(Enchantment.KNOCKBACK, 1, true);
					  knocks.setItemMeta(knocksmeta);
					  PlayerInventory pinv = p.getInventory();	
					  pinv.addItem(knocks);
					  p.closeInventory();
					  break;
					  
				case BLAZE_ROD:
					ItemStack knockx = new ItemStack(Material.BLAZE_ROD);
					  ItemMeta knockxmeta = knockx.getItemMeta();
					  knockxmeta.setDisplayName(ChatColor.LIGHT_PURPLE + "§lEXTREME Knock Tester");
					  knockxmeta.addEnchant(Enchantment.KNOCKBACK, 20, true);
					  knockx.setItemMeta(knockxmeta);
					  PlayerInventory pinv2 = p.getInventory();
					  pinv2.addItem(knockx);
					  p.closeInventory();
					  break;
					  
				case IRON_HOE:
					ItemStack opsense = new ItemStack(Material.IRON_HOE);
					  ItemMeta metasense = opsense.getItemMeta();
					  metasense.setDisplayName(ChatColor.DARK_PURPLE + "§lSense des Todes");
					  metasense.addEnchant(Enchantment.DAMAGE_ALL, 200, true);
					  opsense.setItemMeta(metasense);
					  PlayerInventory pinv3 = p.getInventory();
					  pinv3.addItem(opsense);
					  p.closeInventory();
					  break;
					  
					  
					
				case BARRIER:
					p.closeInventory();
					p.sendMessage("§cDerzeit nicht verfügbar");
					break;
				}
				
			e.setCancelled(true);
			}
			if(e.getClickedInventory().getTitle().equalsIgnoreCase("§5Creator Ränge:")) {
				switch(e.getCurrentItem().getType()) {
				case FIREWORK:
					p.sendMessage("§l§3Den Rang kannst du mit einem Ticket anfordern.");
					p.sendMessage("§9Discord: §bhttps://discord.gg/52DF47S5Jh");
				case MAGMA_CREAM:
					p.closeInventory();
				}
				e.setCancelled(true);
				}
				
			}
		}
	

