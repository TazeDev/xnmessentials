package xnmessentialss.event;

import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

import xnmessentialss.cmd.vanish;

public class onLeave implements Listener{
	public void onPlayerleave(PlayerQuitEvent e) {
		if(vanish.invisible_list.contains(e.getPlayer())) {
			vanish.invisible_list.remove(e.getPlayer());
		}
	}
}
