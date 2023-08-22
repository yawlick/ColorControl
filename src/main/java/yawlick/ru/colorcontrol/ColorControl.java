package yawlick.ru.colorcontrol;

import org.bukkit.Location;
import org.bukkit.plugin.java.JavaPlugin;
import yawlick.ru.colorcontrol.enums.GameStatus;
import yawlick.ru.colorcontrol.enums.GameTeam;
import yawlick.ru.colorcontrol.enums.GameType;
import yawlick.ru.colorcontrol.eventListeners.playerDeathEvent;
import yawlick.ru.colorcontrol.eventListeners.playerJoinEvent;

import java.util.ArrayList;
import java.util.HashMap;

public final class ColorControl extends JavaPlugin {

    private static ColorControl instance;

    public HashMap<GameType, Integer> gameTypePlayers = new HashMap<>();
    public HashMap<String, GameTeam> gamePlayersTeam = new HashMap<>();
    public ArrayList<String> redPlayers = new ArrayList<>();
    public ArrayList<String> bluePlayers = new ArrayList<>();

    public int playersCount = 0;
    public int timerTotal = 40;
    public int timerLeft = 40;
    public GameType gameType = GameType.TWO_TEAM;
    public GameStatus gameStatus = GameStatus.WAIT;
    public int redEmptyValue;
    public int blueEmptyValue;
    public Location blueSpawnLocation = new Location(getServer().getWorld("world"), 1 ,1 ,1);
    public Location redSpawnLocation = new Location(getServer().getWorld("world"), 1 ,1 ,1);

    @Override
    public void onEnable() {
        instance = this;

        getServer().getWorld("world").setPVP(false);
        getServer().getPluginManager().registerEvents(new playerDeathEvent(), this);
        getServer().getPluginManager().registerEvents(new playerJoinEvent(), this);
    }

    @Override
    public void onDisable() {}

    public void setGameTypePlayersArray() {
        gameTypePlayers.put(GameType.FOUR_TEAM, 2); //4x4 16
        gameTypePlayers.put(GameType.TWO_TEAM, 2); // 4x2 8
    }

    public static ColorControl getInstance() {return instance;}

}
