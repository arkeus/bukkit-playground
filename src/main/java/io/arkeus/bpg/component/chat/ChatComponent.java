package io.arkeus.bpg.component.chat;

import io.arkeus.bpg.component.Component;

import java.util.UUID;

import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class ChatComponent extends Component {
	public ChatComponent(final JavaPlugin plugin) {
		super(plugin);
	}

	public void sendAll(final String message) {
		for (final Player player : plugin.getServer().getOnlinePlayers()) {
			player.sendMessage(message);
		}
	}

	public void send(final UUID id, final String message) {
		final Player player = plugin.getServer().getPlayer(id);
		if (player.isOnline()) {
			player.sendMessage(message);
		}
	}
}
