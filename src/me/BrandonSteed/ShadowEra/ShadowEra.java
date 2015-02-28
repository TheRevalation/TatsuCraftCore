package me.BrandonSteed.ShadowEra;

import me.BrandonSteed.ShadowEra.Commands.*;
import me.zd12.ShadowEra.Commands.*;
import me.BrandonSteed.ShadowEra.Listeners.PlayerListener;
import me.zd12.ShadowEra.SE_Messages;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class ShadowEra extends JavaPlugin {
 public PlayerListener playerListener;
    public ShadowEra plugin;
     
    @Override
    public void onLoad() {
        plugin = this;
        playerListener = new PlayerListener(plugin);
    }
    
    public void onEnable()
     {
        PluginManager pm = getServer().getPluginManager();
        pm.registerEvents(plugin.playerListener, plugin);
         getCommand("rage").setExecutor((org.bukkit.command.CommandExecutor) new Command_rage(this));
        getCommand("announce").setExecutor((org.bukkit.command.CommandExecutor) new Command_announce(this));
        getCommand("administratemode").setExecutor((org.bukkit.command.CommandExecutor) new Command_administratemode(this));
        getCommand("slime").setExecutor((org.bukkit.command.CommandExecutor) new Command_slime(this));
        getCommand("promote").setExecutor((org.bukkit.command.CommandExecutor) new Command_promote(this));
        getCommand("nv").setExecutor((org.bukkit.command.CommandExecutor) new Command_nv(this));
        getCommand("fakeleave").setExecutor((org.bukkit.command.CommandExecutor) new Command_fakeleave(this));
        getCommand("serversay").setExecutor((org.bukkit.command.CommandExecutor) new Command_consolesay(this));
        getCommand("machat").setExecutor((org.bukkit.command.CommandExecutor) new Command_machat(this));
// Broken, to be fixed.        //getCommand("console").setExecutor((org.bukkit.command.CommandExecutor) new Command_console(this));
        getCommand("birthday").setExecutor((org.bukkit.command.CommandExecutor) new Command_birthday(this));
        getCommand("cc").setExecutor((org.bukkit.command.CommandExecutor) new Command_cc(this));
        getCommand("forcecommand").setExecutor((org.bukkit.command.CommandExecutor) new Command_forcecommand(this));
        getCommand("fuck").setExecutor((org.bukkit.command.CommandExecutor) new Command_fuck(this));
        getCommand("apply").setExecutor((org.bukkit.command.CommandExecutor) new Command_apply(this));
        getCommand("shelp").setExecutor((org.bukkit.command.CommandExecutor) new Command_shelp(this));
        getCommand("kpvp").setExecutor((org.bukkit.command.CommandExecutor) new Command_kpvp(this));
        getCommand("associated").setExecutor((org.bukkit.command.CommandExecutor) new Command_associated(this));
        
        getLogger().info(SE_Messages.TAG + "| Plugin by ShadowEra Development Team.");
        Bukkit.broadcastMessage(SE_Messages.TAG + ChatColor.DARK_PURPLE + "Plugin by ShadowEra Development Team sucessfully enabled!");
       
     }
     
     public void onDisable()
     {
        getLogger().info(SE_Messages.TAG + "Plugin going to sleep...");
        Bukkit.broadcastMessage(SE_Messages.TAG + ChatColor.DARK_PURPLE + "Plugin going to sleep...");
        Bukkit.broadcastMessage(SE_Messages.TAG + ChatColor.RED + "Warning: ShadowEraCore was disabled on the ShadowEra server! Please re-enable.");
     }

}
