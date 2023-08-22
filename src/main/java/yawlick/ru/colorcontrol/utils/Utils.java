package yawlick.ru.colorcontrol.utils;

import yawlick.ru.colorcontrol.ColorControl;
import yawlick.ru.colorcontrol.enums.GameStatus;
import yawlick.ru.colorcontrol.enums.GameType;

public class Utils {

    public static GameStatus getGameStatus() {return ColorControl.getInstance().gameStatus;}
    public static GameType getGameType() {return ColorControl.getInstance().gameType;}
    public static Integer getGameTypePlayerValue(GameType gameType) {return ColorControl.getInstance().gameTypePlayers.get(gameType);}
    public static Integer getPlayersCount() {return ColorControl.getInstance().playersCount;}

    public static void setGameStatus(GameStatus gameStatus) {
        ColorControl.getInstance().gameStatus = gameStatus;
    }
    public static void setGameType(GameType gameType) {
        ColorControl.getInstance().gameType = gameType;
    }
    public static void setPlayersCount(Integer int1) {
        ColorControl.getInstance().playersCount = int1;
    }


    public static void startGame(GameType teamMode) {
        setGameStatus(GameStatus.GAME);
    }

    public static void startTimer() {
        setGameStatus(GameStatus.TIMER);
    }

}
