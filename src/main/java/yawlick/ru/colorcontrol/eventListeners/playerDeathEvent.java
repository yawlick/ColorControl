package yawlick.ru.colorcontrol.eventListeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.PlayerDeathEvent;

public class playerDeathEvent implements Listener {

    @EventHandler
    public void playerDeathEvent(PlayerDeathEvent event) {
        Player plr = event.getEntity();


    }

    @EventHandler
    public void onPlayerDamagedByVoid(EntityDamageEvent event) {
        if(event.getCause() == EntityDamageEvent.DamageCause.VOID) {

        }
    }

}
