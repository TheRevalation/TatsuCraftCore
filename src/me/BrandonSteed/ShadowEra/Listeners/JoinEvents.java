package me.BrandonSteed.ShadowEra.Listeners;

import me.BrandonSteed.ShadowEra.ShadowEra;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class JoinEvents implements Listener {
    
    public ShadowEra plugin;
       
        public JoinEvents(ShadowEra instance){
                plugin = instance;
        }
    
     // Player Tab and auto Tags
    @EventHandler(priority = EventPriority.HIGH)
    public static void onPlayerJoinEvent(PlayerJoinEvent event)
    {
        Player player = event.getPlayer();
        final String username = event.getPlayer().getName();
        final String IP = event.getPlayer().getAddress().getAddress().getHostAddress().trim();

        if (username.equalsIgnoreCase("ImALuckyGuy"))
        {
            //Entrance
            Bukkit.broadcastMessage(ChatColor.AQUA + "Lucky is the " + ChatColor.DARK_RED + ChatColor.BOLD + "Owner!" + ChatColor.AQUA + " and is also a lucky guy!");
        }
        else if (username.equalsIgnoreCase("xDestroyer217"))
        {
            //Entrance
            Bukkit.broadcastMessage(ChatColor.AQUA + "xDestroyer217 is the " + ChatColor.DARK_PURPLE + "Co-Lead Developer!");
        }
        else if (username.equalsIgnoreCase("Revalation"))
        {
            //Entrance
            Bukkit.broadcastMessage(ChatColor.AQUA + "Revalation is the " + ChatColor.DARK_PURPLE + "Lead Developer!");
        }
        else if (username.equalsIgnoreCase("VjGamingUK") || (username.equalsIgnoreCase("ImAUnluckyGuy")))
        {
            //Entrance
            player.kickPlayer(ChatColor.RED + "You are hardcoded to the TatsuCraft Permban list, Fuck off.");
        }
     
        
}
