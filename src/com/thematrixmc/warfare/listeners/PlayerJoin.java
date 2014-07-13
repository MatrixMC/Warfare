package com.thematrixmc.warfare.listeners;

import java.util.ArrayList;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.BookMeta;
import org.bukkit.inventory.meta.ItemMeta;

public class PlayerJoin implements Listener {
    
    public ItemStack getClassCompass(){
        ItemStack com = new ItemStack(Material.COMPASS);
        ItemMeta comMeta = com.getItemMeta();
        comMeta.setDisplayName("§eClass §lSelector");
        com.setItemMeta(comMeta);
        return com;
    }
    
    public ItemStack getBook(){
        ArrayList<String> pages = new ArrayList<>();
        pages.add("§0§lMatrix Rules \n §r------------- \n \n §c1) Do not swear \n §c2) Do not spam \n §c3) Do not use ALL caps \n §c4) Do not advertise \n §c5) Do not disrespect \n §cour players.\n \n§cVisit our site for more\n§crules and information:\n§cthematrixmc.com");
        ItemStack book = new ItemStack(Material.BOOK);
        BookMeta bookMeta = (BookMeta) book.getItemMeta();
        bookMeta.setTitle("§e§lMatrix §6Rules");
        bookMeta.setAuthor("§cKing Matrix II");
        bookMeta.setPages(pages);
        book.setItemMeta(bookMeta);
        return book;
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event){
        Player player = event.getPlayer();
        event.setJoinMessage("§5[Warfare] §3Player " + player.getDisplayName() + " has joined us!");
        player.sendMessage("§5[Warfare] §3Welcome to the fight, young warrior!");
        player.getInventory().addItem(getClassCompass());
        player.getInventory().addItem(getBook());
    }
}
