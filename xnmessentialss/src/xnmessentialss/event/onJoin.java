package xnmessentialss.event;


import org.bukkit.Bukkit;
import org.bukkit.craftbukkit.Main;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class onJoin implements Listener{
	
	Main plugin;
	
	
	public void onPLayerJoin(PlayerJoinEvent event) {
		Bukkit.broadcastMessage(" ");
	}
	
}
