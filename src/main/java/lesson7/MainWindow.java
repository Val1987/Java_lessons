package lesson7;

// Tigashov VE

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindow extends JFrame {

    private final int WIN_WIDTH= 600;
    private final int WIN_HEIGHT = 600;
    private final int WIN_POS_X = 700;
    private final int WIN_POS_Y = 250;

    private Settings settingsWin;
    GameMap gameMap;

    MainWindow() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(WIN_WIDTH, WIN_HEIGHT);
        setLocation(WIN_POS_X, WIN_POS_Y);
        setTitle("Game X|O");
        setResizable(false);

        settingsWin = new Settings(this);
        gameMap = new GameMap();

        JButton startGame = new JButton("New Game");
        startGame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                settingsWin.setVisible(true);
            }
        });
        JButton exitGame = new JButton("Exit Game");
        exitGame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });


        JPanel container = new JPanel();
        container.setLayout(new GridLayout(1,2));
        container.add(startGame);
        container.add(exitGame);

        add(container, BorderLayout.SOUTH);
        add(gameMap);

        setVisible(true);
    }

    void startGameVicUserSetting(int gameMode, int mapSizeX, int mapSizeY, int vicCond) {
        gameMap.startGame(gameMode, mapSizeX, mapSizeY, vicCond);
    }

}
