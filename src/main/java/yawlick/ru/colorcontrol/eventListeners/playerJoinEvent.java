package yawlick.ru.colorcontrol.eventListeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import yawlick.ru.colorcontrol.ColorControl;
import yawlick.ru.colorcontrol.enums.GameStatus;
import yawlick.ru.colorcontrol.enums.GameType;
import yawlick.ru.colorcontrol.utils.Utils;

public class playerJoinEvent implements Listener {

    @EventHandler
    public void playerJoinEvent(PlayerJoinEvent event) {
        Player plr = event.getPlayer();
        ColorControl.getInstance().playersCount+=1;
        if(Utils.getGameStatus()!= GameStatus.GAME) {
            if(Utils.getPlayersCount()==Utils.getGameTypePlayerValue(Utils.getGameType())) {
                if(Utils.getGameType()==GameType.TWO_TEAM) {

                }
            }
        }
    }

    @EventHandler
    public void playerQuitEvent(PlayerQuitEvent event) {
        Player plr = event.getPlayer();
        ColorControl.getInstance().playersCount-=1;
    }
}
