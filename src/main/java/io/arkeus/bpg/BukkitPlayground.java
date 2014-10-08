package io.arkeus.bpg;

import io.arkeus.bpg.component.chat.ChatComponent;

import org.bukkit.plugin.java.JavaPlugin;

public class BukkitPlayground extends JavaPlugin {
	private final ChatComponent chatComponent;

	public BukkitPlayground() {
		System.out.println("does this let me initialize shit?");
		this.chatComponent = new ChatComponent(this);
	}

	@Override
	public void onEnable() {
		chatComponent.sendAll("Enabled Bukkit Playground");
	}

	@Override
	public void onDisable() {
		chatComponent.sendAll("Disabled Bukkit Playground");
	}
}
