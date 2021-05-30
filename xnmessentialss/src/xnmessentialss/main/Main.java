package xnmessentialss.main;

import org.bukkit.plugin.java.JavaPlugin;

import xnmessentialss.cmd.fly;

public class Main extends JavaPlugin{
	public void onEnable() {
		System.out.println("XNMEssentials wurde erfolgreich geladen!");
			getCommand("fly").setExecutor(new fly());
		//TODO eventlogger
		
	}
	
	public void onDisable() {
		System.out.println("XNMEssentials wurde erfolgreich entladen!");
	}
}
