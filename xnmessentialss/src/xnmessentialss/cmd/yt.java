package xnmessentialss.cmd;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class yt implements CommandExecutor {
	
	List<Inventory> inv = new ArrayList<Inventory>(); 
	
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if(sender instanceof Player) {
			Player p = (Player) sender;
			
			Inventory youtube = Bukkit.createInventory(null, 9*3, "ß5Creator R‰nge:");
			
			
			ItemStack byt = new ItemStack(Material.FIREWORK);
			ItemMeta byt_meta = byt.getItemMeta();
			byt_meta.setDisplayName("ß6ßlBIG CREATOR");
			List<String> bytl = new ArrayList<String>();
			bytl.add("ß3ßl1000 Follower");
			bytl.add("ß35K Views/Monat");
			bytl.add("ß3ODER");
			bytl.add("ß3Mindestens 50 Viewer");
			byt_meta.setLore(bytl);
			byt.setItemMeta(byt_meta);
			
			
			ItemStack yt = new ItemStack(Material.FIREWORK);
			ItemMeta yt_meta = yt.getItemMeta();
			yt_meta.setDisplayName("ß5ßlCREATOR");
			List<String> ytl = new ArrayList<String>();
			ytl.add("ß3ßl500 Follower");
			ytl.add("ß32.5K Views/Monat");
			ytl.add("ß3ODER");
			ytl.add("ß3Mindestens 25 Viewer");
			yt_meta.setLore(ytl);
			yt.setItemMeta(yt_meta);
			
			
			ItemStack syt = new ItemStack(Material.FIREWORK);
			ItemMeta syt_meta = syt.getItemMeta();
			syt_meta.setDisplayName("ßbßlPremium+");
			List<String> sytl = new ArrayList<String>();
			sytl.add("ß3ßl250 Follower");
			sytl.add("ß31K Views/Monat");
			sytl.add("ß3ODER");
			sytl.add("ß3Mindestens 10 Viewer");
			syt_meta.setLore(sytl);
			syt.setItemMeta(syt_meta);
			
			
			ItemStack magma = new ItemStack(Material.MAGMA_CREAM);
			ItemMeta magma_meta = magma.getItemMeta();
			magma_meta.setDisplayName("ßcSchlieﬂe das Menu");
			magma.setItemMeta(magma_meta);
			
			
			ItemStack pane = new ItemStack(Material.STAINED_GLASS_PANE);
			ItemMeta pane_meta = pane.getItemMeta();
			pane_meta.setDisplayName(" ");
			pane.setItemMeta(pane_meta);
			
			youtube.setItem(0, pane);
			youtube.setItem(1, pane);
			youtube.setItem(2, pane);
			youtube.setItem(3, pane);
			youtube.setItem(4, byt);
			youtube.setItem(5, pane);
			youtube.setItem(6, pane);
			youtube.setItem(7, pane);
			youtube.setItem(8, pane);
			youtube.setItem(9, pane);
			youtube.setItem(10, yt);
			youtube.setItem(11, pane);
			youtube.setItem(12, pane);
			youtube.setItem(13, pane);
			youtube.setItem(14, pane);
			youtube.setItem(15, pane);
			youtube.setItem(16, syt);
			youtube.setItem(17, pane);
			youtube.setItem(18, pane);
			youtube.setItem(19, pane);
			youtube.setItem(20, pane);
			youtube.setItem(21, pane);
			youtube.setItem(22, magma);
			youtube.setItem(23, pane);
			youtube.setItem(24, pane);
			youtube.setItem(25, pane);
			youtube.setItem(26, pane);
			
			p.openInventory(youtube);
			
		}
		return false;
	}
}
