package com.thematrixmc.warfare.listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;

public class BlockPlace implements Listener {
    
    @EventHandler
    public void onBlockPlace(BlockPlaceEvent event){
        Player player = event.getPlayer();
        if(!(player.isOp())){
            event.setCancelled(true);
        }else{
            event.setCancelled(false);
        }
    }
    
}
