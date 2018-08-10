package me.MissKrypto.listeners;

import org.bukkit.plugin.java.JavaPlugin;

import me.MissKrypto.listeners.join.JoinListener;

public class Main extends JavaPlugin {

	@Override
	public void onEnable() {
		saveDefaultConfig();
		
		new JoinListener(this); 
	}
	
}
