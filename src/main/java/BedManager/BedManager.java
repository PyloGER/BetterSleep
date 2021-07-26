package BedManager;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBedEnterEvent;

public class BedManager implements Listener {

    public static String prefix = "§8[§b§lSystem§8§l] ";

    @EventHandler
    public void onEnterBed(PlayerBedEnterEvent event) {
        Player player = event.getPlayer();
        if (event.getBedEnterResult() == PlayerBedEnterEvent.BedEnterResult.OK) {
            player.sendMessage(prefix + "§7Gute Nacht §b§l"+ player.getDisplayName() + "§7 bis morgen§8.");
            Bukkit.broadcastMessage(prefix + "§7Der Spieler §b§l"+ player.getDisplayName() + "§7 hat geschlafen§8.");
            player.getWorld().setTime(0);

        } else {
            player.sendMessage(prefix + "§cDu kann derzeit nicht schlafen§8.");
        }
    }
}
