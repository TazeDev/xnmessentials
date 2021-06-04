package xnmessentialss.main;

import org.bukkit.plugin.java.JavaPlugin;

import xnmessentialss.cmd.admin;
import xnmessentialss.cmd.fly;
import xnmessentialss.cmd.gamemode;
import xnmessentialss.cmd.heal;
import xnmessentialss.cmd.help;
import xnmessentialss.cmd.plugin;
import xnmessentialss.cmd.vanish;
import xnmessentialss.cmd.vlist;
import xnmessentialss.cmd.yt;
import xnmessentialss.event.ClickEvents;
import xnmessentialss.event.godmodee;
import xnmessentialss.event.onJoin;
import xnmessentialss.event.onLeave;

public class Main extends JavaPlugin{
	
	public void onEnable() {
		
		System.out.println("XNMEssentials wurde erfolgreich geladen!");
		
		//COMMAND REGISTRATION:
			getCommand("fly").setExecutor(new fly());
			getCommand("heal").setExecutor(new heal());
			getCommand("vanish").setExecutor(new vanish());
			getCommand("admin").setExecutor(new admin());
			getCommand("vl").setExecutor(new vlist());
			getCommand("yt").setExecutor(new yt());
			getCommand("gm").setExecutor(new gamemode());
			getCommand("help").setExecutor(new help());
			getCommand("plugin").setExecutor(new plugin());
			getCommand("pl").setExecutor(new plugin());
			
		//EVENT REGISTRATION
			getServer().getPluginManager().registerEvents(new onJoin(), this);
			getServer().getPluginManager().registerEvents(new onLeave(), this);
			getServer().getPluginManager().registerEvents(new ClickEvents(), this);
			getServer().getPluginManager().registerEvents(new godmodee(), this);
			
	}
	
	public void onDisable() {
		vanish.invisible_list.clear();
		fly.fly_list.clear();
		
		
		
		
		
		System.out.println("XNMEssentials wurde erfolgreich entladen!");
	}
}
