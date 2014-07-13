package com.thematrixmc.warfare.listeners;

import com.thematrixmc.warfare.classes.EquipPlayer;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;

public class InventoryClick implements Listener {

    @EventHandler
    public void onInventoryClick(InventoryClickEvent event){
        Player player = (Player) event.getWhoClicked();
        Inventory inv = event.getClickedInventory();
        if(inv.getName().equalsIgnoreCase("§8Pick your class!")){
            if(event.getCurrentItem() == null | event.getCurrentItem().getType() == Material.AIR || !event.getCurrentItem().hasItemMeta()){
                player.closeInventory();
            }else{
                if(event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§dAssault")){
                    player.closeInventory();
                    EquipPlayer.equipAssaultClass(player);
                }
                if(event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§eArcher")){
                    player.closeInventory();
                    EquipPlayer.equipArcherClass(player);
                }    
                if(event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§cStormer")){
                    player.closeInventory();
                    EquipPlayer.equipStormerClass(player);
                }
                if(event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§6Pyro")){
                    player.closeInventory();
                    if(player.hasPermission("matrixffa.pyro")){
                        EquipPlayer.equipPyroClass(player);
                    }else{
                        player.sendMessage("§5[Warfare] §3You need to buy a premium rank to unlock this class. Visit §ahttp://thematrixmc.buycraft.net §3to unlock.");
                    }
                }
                if(event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§bTank")){
                    player.closeInventory();
                    if(player.hasPermission("matrixffa.tank")){
                        EquipPlayer.equipPyroClass(player);
                    }else{
                        player.sendMessage("§5[Warfare] §3You need to buy a premium rank to unlock this class. Visit §ahttp://thematrixmc.buycraft.net §3to unlock.");
                    }
                }
                if(event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§aWarrior")){
                    player.closeInventory();
                    if(player.hasPermission("matrixffa.warrior")){
                        EquipPlayer.equipPyroClass(player);
                    }else{
                        player.sendMessage("§5[Warfare] §3You need to buy a premium rank to unlock this class. Visit §ahttp://thematrixmc.buycraft.net §3to unlock.");
                    }
                }
            }
        }
    }
}
