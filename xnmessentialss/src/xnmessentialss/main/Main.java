package xnmessentialss.main;

import org.bukkit.plugin.java.JavaPlugin;

import xnmessentialss.cmd.fly;
import xnmessentialss.cmd.heal;

public class Main extends JavaPlugin{
	public void onEnable() {
		System.out.println("XNMEssentials wurde erfolgreich geladen!");
		//COMMAND IMPORTS:
			getCommand("fly").setExecutor(new fly());
			getCommand("heal").setExecutor(new heal());
		//TODO eventlogger
		
	}
	
	public void onDisable() {
		System.out.println("XNMEssentials wurde erfolgreich entladen!");
	}
}
