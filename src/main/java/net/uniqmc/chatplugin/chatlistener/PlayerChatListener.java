package net.uniqmc.chatplugin.chatlistener;

import net.luckperms.api.LuckPerms;
import net.luckperms.api.LuckPermsProvider;
import net.luckperms.api.event.LuckPermsEvent;
import net.luckperms.api.model.user.User;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class PlayerChatListener implements Listener {

    @EventHandler
    public void onChat(AsyncPlayerChatEvent e){
        Player p = e.getPlayer();
        User user = LuckPermsProvider.get().getPlayerAdapter(Player.class).getUser(p);

        String Message = e.getMessage();
        Message.replace("#", "Hashtag");

        if (user.getPrimaryGroup().equalsIgnoreCase("admin")){
            e.setFormat("§4" + p.getName() + " §8● §f" + Message);
        }else if (user.getPrimaryGroup().equalsIgnoreCase("developer")){
            e.setFormat("§b" + p.getName() + " §8● §f" + Message);
        }else if (user.getPrimaryGroup().equalsIgnoreCase("moderator")){
            e.setFormat("§3" + p.getName() + " §8● §f" + Message);
        }else if (user.getPrimaryGroup().equalsIgnoreCase("supporter")){
            e.setFormat("§2" + p.getName() + " §8● §f" + Message);
        }else if (user.getPrimaryGroup().equalsIgnoreCase("builder")){
            e.setFormat("§e" + p.getName() + " §8● §f" + Message);
        }else if (user.getPrimaryGroup().equalsIgnoreCase("creator")){
            e.setFormat("§d" + p.getName() + " §8● §f" + Message);
        }else if (user.getPrimaryGroup().equalsIgnoreCase("uniq")){
            e.setFormat("§b" + p.getName() + " §8● §f" + Message);
        }else if (user.getPrimaryGroup().equalsIgnoreCase("vip")){
            e.setFormat("§d" + p.getName() + " §8● §f" + Message);
        }else if (user.getPrimaryGroup().equalsIgnoreCase("premium")){
            e.setFormat("§6" + p.getName() + " §8● §f" + Message);
        }else if (user.getPrimaryGroup().equalsIgnoreCase("default")){
            e.setFormat("§a" + p.getName() + " §8● §f" + Message);
        }
    }
}
