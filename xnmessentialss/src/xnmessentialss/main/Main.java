package xnmessentialss.main;

import org.bukkit.plugin.java.JavaPlugin;

import xnmessentialss.cmd.admin;
import xnmessentialss.cmd.fly;
import xnmessentialss.cmd.heal;
import xnmessentialss.cmd.vanish;
import xnmessentialss.cmd.vlist;
import xnmessentialss.event.onJoin;
import xnmessentialss.event.onLeave;

public class Main extends JavaPlugin{
	
	public void onEnable() {
		
		System.out.println("XNMEssentials wurde erfolgreich geladen!");
		
		//COMMAND REGISTRATION:
			getCommand("fly").setExecutor(new fly());
			getCommand("heal").setExecutor(new heal());
			getCommand("vanish").setExecutor(new vanish());
			getCommand("ad").setExecutor(new admin());
			getCommand("vl").setExecutor(new vlist());
			
		//EVENT REGISTRATION
			getServer().getPluginManager().registerEvents(new onJoin(), this);
			getServer().getPluginManager().registerEvents(new onLeave(), this);
			
	}
	
	public void onDisable() {
		vanish.invisible_list.clear();
		
		
		
		
		
		System.out.println("XNMEssentials wurde erfolgreich entladen!");
	}
}
