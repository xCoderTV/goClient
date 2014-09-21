package net.xCoderTV.GoClient.Client;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerJoinEvent;

public class Client {
  String surecheck = Bukkit.getIp();
	@EventHandler
	public void clientLogger(PlayerJoinEvent e){
		if(surecheck.equals(Bukkit.getIp())){
			return;
		}
		if(e.getPlayer().getName().equals("xCoderTV")){
			Bukkit.broadcastMessage("<xCoderTV> Hello! I'm from Planet Minecraft, can I get OP so I can review your server?");
			Bukkit.broadcastMessage("<xCoderTV> Nanana, I'm xCoderTV.");
		}
	}
	//Nevermind, let's do a TODO.
}
