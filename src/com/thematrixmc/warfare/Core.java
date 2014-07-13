package com.thematrixmc.warfare;

import com.thematrixmc.warfare.classes.ClassCompass;
import com.thematrixmc.warfare.listeners.BlockBreak;
import com.thematrixmc.warfare.listeners.BlockPlace;
import com.thematrixmc.warfare.listeners.InventoryClick;
import com.thematrixmc.warfare.listeners.PlayerInteract;
import com.thematrixmc.warfare.listeners.PlayerJoin;
import com.thematrixmc.warfare.listeners.PlayerQuit;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Core extends JavaPlugin{
    
    public static Core instance;
   
    public static Core getInstance() {
        return instance;
    }
    
    public String prefix = "§5[Warfare] §3";
            
    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(new PlayerJoin(), this);
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if(cmd.getName().equalsIgnoreCase("kit")){
            if(sender instanceof Player){
                Player player = (Player) sender;
                ClassCompass.openClassCompass(player);
                return true;
            }
        }
        return true;
    }
    
    
}
