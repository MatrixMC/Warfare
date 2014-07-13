package com.thematrixmc.warfare.listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class PlayerQuit implements Listener {
    
    @EventHandler
    public void onPlayerLeave(PlayerQuitEvent event){
        Player player = event.getPlayer();
        event.setQuitMessage("§5[Warfare] §3Player " + player.getDisplayName() + " has left us!");
        player.sendMessage("§5[Warfare] §3Goodbye for now, young warrior..");
    }

}
