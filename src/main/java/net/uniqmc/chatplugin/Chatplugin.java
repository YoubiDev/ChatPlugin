package net.uniqmc.chatplugin;

import net.uniqmc.chatplugin.chatlistener.PlayerChatListener;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Chatplugin extends JavaPlugin {

    public static Chatplugin plugin;

    @Override
    public void onEnable() {
        plugin = this;
        Bukkit.getPluginManager().registerEvents(new PlayerChatListener(), this);
    }

    @Override
    public void onDisable() {
    }
}
