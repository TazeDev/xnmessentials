package xnmessentialss.event;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;

public class godmodee implements Listener{
	public static List<String> damage = new ArrayList<String>();
	public void damage(EntityDamageEvent e) {
		Player p = (Player) e.getEntity();
		if(damage.contains(p.getName())) {
			e.setCancelled(true);
		}else {
			e.setCancelled(false);
		}
	}
}
