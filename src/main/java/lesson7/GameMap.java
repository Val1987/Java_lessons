package lesson7;

// Tigashov Valeriy Evgen'evich

import javax.swing.*;
import java.awt.*;

public class GameMap extends JPanel {

    public static final int GAME_MODE_HVH = 1;
    public static final int GAME_MODE_HVA = 0;

    GameMap() {
        setBackground(new Color(53, 54, 90));
    }

    GameMap(int sizeX, int sizeY) {
        setBackground(new Color(53, 54, 90));
        setLayout(new GridLayout(sizeX, sizeY));
        for (int i = 0; i < sizeX; i++) {
            for(int j = 0; j< sizeY; j++)
                add(new CrossButton(i,j));
        }
    }

    void startGame(int gameMode, int mapSizeX, int mapSizeY, int vicCond) {
        System.out.println("Game mode " + gameMode +
                "\nMap Size -X- " + mapSizeX +
                "\nMap Size -Y- " + mapSizeY +
                "\nVictory Condition " + vicCond);
    }

}
