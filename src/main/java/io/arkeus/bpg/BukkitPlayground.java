package io.arkeus.bpg;

import io.arkeus.bpg.component.chat.ChatComponent;
import io.arkeus.bpg.component.listener.DoubleJumpListener;

import org.bukkit.plugin.java.JavaPlugin;

public class BukkitPlayground extends JavaPlugin {
	private final ChatComponent chatComponent;

	public BukkitPlayground() {
		this.chatComponent = new ChatComponent(this);
	}

	@Override
	public void onEnable() {
		getServer().getPluginManager().registerEvents(new DoubleJumpListener(this), this);
		chatComponent.sendAll("Enabled Bukkit Playground");
	}

	@Override
	public void onDisable() {
		chatComponent.sendAll("Disabled Bukkit Playground");
	}
}
