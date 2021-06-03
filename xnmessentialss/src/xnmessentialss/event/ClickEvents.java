package xnmessentialss.event;


import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class ClickEvents implements Listener {
		@EventHandler
	public void clickEvent(InventoryClickEvent e) {
			
			Player p = (Player) e.getWhoClicked();
			
			if(e.getClickedInventory().getTitle().equalsIgnoreCase("§2TROLL-MENU")) {
			
				
				switch(e.getCurrentItem().getType()) {
				case GRASS:
					p.closeInventory();
					p.setGameMode(GameMode.CREATIVE);
					p.sendMessage("§aDu bist nun im Creativemode.");
					break;
				case BARRIER:
					p.closeInventory();
					p.sendMessage("§cDerzeit nicht verfügbar");
					break;
				}
				
			e.setCancelled(true);
			}
			if(e.getClickedInventory().getTitle().equalsIgnoreCase("§5YouTube Ränge:")) {
				e.setCancelled(true);
				}
				
			}
		}
	

