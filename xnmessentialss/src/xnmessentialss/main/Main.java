package xnmessentialss.main;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin{
	public void onEnable() {
		System.out.println("XNMEssentials wurde erfolgreich geladen!");
		
		//TODO commandlogger
		//TODO eventlogger
		
	}
	
	public void onDisable() {
		System.out.println("XNMEssentials wurde erfolgreich entladen!");
	}
}
