package io.arkeus.bpg.component;

import org.bukkit.plugin.java.JavaPlugin;

public class Component {
	protected final JavaPlugin plugin;

	public Component(final JavaPlugin plugin) {
		this.plugin = plugin;
	}
}
