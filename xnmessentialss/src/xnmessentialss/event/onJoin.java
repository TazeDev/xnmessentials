package xnmessentialss.event;




import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import xnmessentialss.cmd.vanish;

public class onJoin implements Listener{
	@EventHandler
	public void onPLayerJoin(PlayerJoinEvent event) {
		Player p = event.getPlayer();
		event.setJoinMessage("");
		if(vanish.invisible_list.contains(event.getPlayer())) {
			vanish.invisible_list.remove(event.getPlayer());
		}
	}
	
}
