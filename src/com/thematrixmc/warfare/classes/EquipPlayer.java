package com.thematrixmc.warfare.classes;

import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;

public class EquipPlayer {
    
    public static void equipAssaultClass(Player player){
        PlayerInventory inv = player.getInventory();
        
        inv.clear();
        inv.setItem(0, new ItemStack(Material.STONE_SWORD));
        inv.setItem(1, new ItemStack(Material.FISHING_ROD));
        inv.setItem(2, new ItemStack(Material.BOW));
        inv.setItem(3, new ItemStack(Material.ARROW, 4));
        
        inv.setArmorContents(null);
        inv.setHelmet(new ItemStack(Material.IRON_HELMET));
        inv.setChestplate(new ItemStack(Material.IRON_CHESTPLATE));
        inv.setLeggings(new ItemStack(Material.IRON_LEGGINGS));
        inv.setBoots(new ItemStack(Material.IRON_BOOTS));
        
        player.setGameMode(GameMode.ADVENTURE);
        String ORIGINAL_DISPLAY_NAME = player.getDisplayName();
        player.setDisplayName("§dArcher §8| " + ORIGINAL_DISPLAY_NAME);
        
        player.sendMessage("§5[Warfare] §3Successfully chose class §dAssault§3!");
    }
    
    public static void equipArcherClass(Player player){
        PlayerInventory inv = player.getInventory();
        
        inv.clear();
        inv.setItem(0, new ItemStack(Material.STONE_SWORD));
        inv.setItem(1, new ItemStack(Material.FISHING_ROD));
        inv.setItem(2, new ItemStack(Material.BOW));
        inv.setItem(3, new ItemStack(Material.ARROW, 4));
        
        inv.setArmorContents(null);
        inv.setHelmet(new ItemStack(Material.IRON_HELMET));
        inv.setChestplate(new ItemStack(Material.IRON_CHESTPLATE));
        inv.setLeggings(new ItemStack(Material.IRON_LEGGINGS));
        inv.setBoots(new ItemStack(Material.IRON_BOOTS));
        
        player.setGameMode(GameMode.ADVENTURE);
        player.setAllowFlight(false);
        player.setFlying(false);
        String ORIGINAL_DISPLAY_NAME = player.getDisplayName();
        player.setDisplayName("§dArcher §8| " + ORIGINAL_DISPLAY_NAME);
        
        player.sendMessage("§5[Warfare] §3Successfully chose class §dAssault§3!");
    }
    
    public static void equipStormerClass(Player player){
        PlayerInventory inv = player.getInventory();
        
        inv.clear();
        inv.setItem(0, new ItemStack(Material.STONE_SWORD));
        inv.setItem(1, new ItemStack(Material.FISHING_ROD));
        inv.setItem(2, new ItemStack(Material.BOW));
        inv.setItem(3, new ItemStack(Material.ARROW, 4));
        
        inv.setArmorContents(null);
        inv.setHelmet(new ItemStack(Material.IRON_HELMET));
        inv.setChestplate(new ItemStack(Material.IRON_CHESTPLATE));
        inv.setLeggings(new ItemStack(Material.IRON_LEGGINGS));
        inv.setBoots(new ItemStack(Material.IRON_BOOTS));
        
        player.setGameMode(GameMode.ADVENTURE);
        player.setAllowFlight(false);
        player.setFlying(false);
        String ORIGINAL_DISPLAY_NAME = player.getDisplayName();
        player.setDisplayName("§dArcher §8| " + ORIGINAL_DISPLAY_NAME);
        
        player.sendMessage("§5[Warfare] §3Successfully chose class §dAssault§3!");
    }
    
    public static void equipPyroClass(Player player){
        PlayerInventory inv = player.getInventory();
        
        inv.clear();
        inv.setItem(0, new ItemStack(Material.STONE_SWORD));
        inv.setItem(1, new ItemStack(Material.FISHING_ROD));
        inv.setItem(2, new ItemStack(Material.BOW));
        inv.setItem(3, new ItemStack(Material.ARROW, 4));
        
        inv.setArmorContents(null);
        inv.setHelmet(new ItemStack(Material.IRON_HELMET));
        inv.setChestplate(new ItemStack(Material.IRON_CHESTPLATE));
        inv.setLeggings(new ItemStack(Material.IRON_LEGGINGS));
        inv.setBoots(new ItemStack(Material.IRON_BOOTS));
        
        player.setGameMode(GameMode.ADVENTURE);
        player.setAllowFlight(false);
        player.setFlying(false);
        String ORIGINAL_DISPLAY_NAME = player.getDisplayName();
        player.setDisplayName("§dArcher §8| " + ORIGINAL_DISPLAY_NAME);
        
        player.sendMessage("§5[Warfare] §3Successfully chose class §dAssault§3!");
    }
    
    public static void equipTankClass(Player player){
        PlayerInventory inv = player.getInventory();
        
        inv.clear();
        inv.setItem(0, new ItemStack(Material.STONE_SWORD));
        inv.setItem(1, new ItemStack(Material.FISHING_ROD));
        inv.setItem(2, new ItemStack(Material.BOW));
        inv.setItem(3, new ItemStack(Material.ARROW, 4));
        
        inv.setArmorContents(null);
        inv.setHelmet(new ItemStack(Material.IRON_HELMET));
        inv.setChestplate(new ItemStack(Material.IRON_CHESTPLATE));
        inv.setLeggings(new ItemStack(Material.IRON_LEGGINGS));
        inv.setBoots(new ItemStack(Material.IRON_BOOTS));
        
        player.setGameMode(GameMode.ADVENTURE);
        player.setAllowFlight(false);
        player.setFlying(false);
        String ORIGINAL_DISPLAY_NAME = player.getDisplayName();
        player.setDisplayName("§dArcher §8| " + ORIGINAL_DISPLAY_NAME);
        
        player.sendMessage("§5[Warfare] §3Successfully chose class §dAssault§3!");
    }
    
    public static void equipWarriorClass(Player player){
        PlayerInventory inv = player.getInventory();
        
        inv.clear();
        inv.setItem(0, new ItemStack(Material.STONE_SWORD));
        inv.setItem(1, new ItemStack(Material.FISHING_ROD));
        inv.setItem(2, new ItemStack(Material.BOW));
        inv.setItem(3, new ItemStack(Material.ARROW, 4));
        
        inv.setArmorContents(null);
        inv.setHelmet(new ItemStack(Material.IRON_HELMET));
        inv.setChestplate(new ItemStack(Material.IRON_CHESTPLATE));
        inv.setLeggings(new ItemStack(Material.IRON_LEGGINGS));
        inv.setBoots(new ItemStack(Material.IRON_BOOTS));
        
        player.setGameMode(GameMode.ADVENTURE);
        player.setAllowFlight(false);
        player.setFlying(false);
        String ORIGINAL_DISPLAY_NAME = player.getDisplayName();
        player.setDisplayName("§dArcher §8| " + ORIGINAL_DISPLAY_NAME);
        
        player.sendMessage("§5[Warfare] §3Successfully chose class §dAssault§3!");
    }

}
