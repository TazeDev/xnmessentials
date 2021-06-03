package xnmessentialss.event;


import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import xnmessentialss.cmd.vanish;

public class onJoin implements Listener{
	public void onPLayerJoin(PlayerJoinEvent event) {
		Bukkit.broadcastMessage(" ");
		if(vanish.invisible_list.contains(event.getPlayer())) {
			vanish.invisible_list.remove(event.getPlayer());
		}
	}
	
}
