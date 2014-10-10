package io.arkeus.bpg.component.listener;

import io.arkeus.bpg.component.Component;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerToggleFlightEvent;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.util.Vector;

public class DoubleJumpListener extends Component implements Listener {
	public DoubleJumpListener(final JavaPlugin plugin) {
		super(plugin);
	}

	@EventHandler
	public void onJoin(final PlayerJoinEvent event) {
		event.getPlayer().setAllowFlight(true);
	}

	@EventHandler
	public void onFlightAttempt(final PlayerToggleFlightEvent event) {
		final Player player = event.getPlayer();
		if (event.isFlying()) {
			player.setFlying(false);
			final Vector jump = player.getLocation().getDirection().multiply(0.25).setY(0.8);
			player.setVelocity(player.getVelocity().add(jump));
			event.setCancelled(true);
		}
	}
}
