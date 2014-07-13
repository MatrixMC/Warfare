package com.thematrixmc.warfare.classes;

import org.bukkit.Bukkit;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.LeatherArmorMeta;

public class ClassCompass {
    
    public static void openClassCompass(Player player){
        Inventory inv = Bukkit.createInventory(null, 9, "§8Pick your class!");
        
        ItemStack assault = new ItemStack(Material.LEATHER_HELMET, 1);
        ItemStack archer = new ItemStack(Material.LEATHER_HELMET, 1);
        ItemStack stormer = new ItemStack(Material.LEATHER_HELMET, 1);
        ItemStack pyro = new ItemStack(Material.LEATHER_HELMET, 1);
        ItemStack tank = new ItemStack(Material.LEATHER_HELMET, 1);
        ItemStack warrior = new ItemStack(Material.LEATHER_HELMET, 1);
    
        LeatherArmorMeta assaultMeta = (LeatherArmorMeta) assault.getItemMeta();
        LeatherArmorMeta archerMeta = (LeatherArmorMeta) archer.getItemMeta();
        LeatherArmorMeta stormerMeta = (LeatherArmorMeta) stormer.getItemMeta();
        LeatherArmorMeta pyroMeta = (LeatherArmorMeta) pyro.getItemMeta();
        LeatherArmorMeta tankMeta = (LeatherArmorMeta) tank.getItemMeta();
        LeatherArmorMeta warriorMeta = (LeatherArmorMeta) warrior.getItemMeta();
        
        assaultMeta.setColor(Color.FUCHSIA);
        archerMeta.setColor(Color.YELLOW);
        stormerMeta.setColor(Color.RED);
        pyroMeta.setColor(Color.ORANGE);
        tankMeta.setColor(Color.AQUA);   
        warriorMeta.setColor(Color.LIME);
        
        assaultMeta.setDisplayName("§dAssault");
        archerMeta.setDisplayName("§eArcher");
        stormerMeta.setDisplayName("§cStormer");
        pyroMeta.setDisplayName("§6Pyro");
        tankMeta.setDisplayName("§bTank");
        warriorMeta.setDisplayName("§aWarrior");
        
        assault.setItemMeta(assaultMeta);
        archer.setItemMeta(archerMeta);
        stormer.setItemMeta(stormerMeta);
        pyro.setItemMeta(pyroMeta);
        tank.setItemMeta(tankMeta);
        warrior.setItemMeta(warriorMeta);
        
        inv.setItem(0, assault);
        inv.setItem(1, archer);
        inv.setItem(2, stormer);
        inv.setItem(6, pyro);
        inv.setItem(7, tank);
        inv.setItem(8, warrior);
        
        player.openInventory(inv);
    }

}
