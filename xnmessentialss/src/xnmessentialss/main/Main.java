package xnmessentialss.main;

import org.bukkit.plugin.java.JavaPlugin;

import xnmessentialss.cmd.fly;
import xnmessentialss.cmd.heal;
import xnmessentialss.cmd.vanish;
import xnmessentialss.event.onJoin;

public class Main extends JavaPlugin{
	
	public void onEnable() {
		
		
		System.out.println("XNMEssentials wurde erfolgreich geladen!");
		//COMMAND REGISTRATION:
			getCommand("fly").setExecutor(new fly());
			getCommand("heal").setExecutor(new heal());
			getCommand("vanish").setExecutor(new vanish(this));
			getCommand("v").setExecutor(new vanish(this));
			
		//EVENT REGISTRATION
			getServer().getPluginManager().registerEvents(new onJoin(), this);
			
	}
	
	public void onDisable() {
		System.out.println("XNMEssentials wurde erfolgreich entladen!");
	}
}
