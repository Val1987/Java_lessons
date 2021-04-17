package lesson7;



import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Settings extends JFrame {

    private final int WIN_WIDTH= 500;
    private final int WIN_HEIGHT = 400;

    private MainWindow mainWindow;

    private JRadioButton playHuman;
    private JRadioButton playAI;

    private JSlider sliderMapSize;
    private JSlider victoryCondition;

    private JButton confirmUserSettings;

    private final int MIN_MAP_SIZE = 3;
    private final int MAX_MAP_SIZE = 10;

    private final int MIN_VIC_CON = 3;

    private final String MAP_SIZE_PREFIX = "Map size is ";
    private final String VIC_CON_PREFIX = "Victory condition ";

    int gameMode;
    int mapSize;
    int vicCond;


    Settings(MainWindow mainWindow) {
        this.mainWindow = mainWindow;
        setupWindow(mainWindow);
        modeGameControllers();
        mapSetupControllers();
        confirmUserSetup();
        gameMode = GameMap.GAME_MODE_HVA;
        mapSize = MIN_MAP_SIZE;
        vicCond = MIN_VIC_CON;
    }

    private void modeGameControllers() {

        add(new JLabel("Game Mode"));
        playAI = new JRadioButton("Human vs playAI", true);
        playHuman = new JRadioButton("Human vs Human");


        ButtonGroup choiceMBG = new ButtonGroup();
        choiceMBG.add(playAI);
        choiceMBG.add(playHuman);


        add(playAI);
        add(playHuman);

    }

    private void mapSetupControllers() {

        JLabel labelMapSize = new JLabel(MAP_SIZE_PREFIX + MIN_MAP_SIZE);
        JLabel labelVictoryCondition = new JLabel(VIC_CON_PREFIX + MIN_VIC_CON);

        sliderMapSize = new JSlider(MIN_MAP_SIZE, MAX_MAP_SIZE, MIN_MAP_SIZE);
        sliderMapSize.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                int currentMapSize = sliderMapSize.getValue();
                labelMapSize.setText(MAP_SIZE_PREFIX + currentMapSize);
                victoryCondition.setMaximum(currentMapSize);
            }
        });

        victoryCondition = new JSlider(MIN_VIC_CON, MIN_MAP_SIZE, MIN_MAP_SIZE);
        victoryCondition.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                labelVictoryCondition.setText(VIC_CON_PREFIX + victoryCondition.getValue());
            }
        });

        add(new JLabel("Choice Map Size"));
        add(labelMapSize);
        add(sliderMapSize);
        add(new JLabel("Victory Condition"));
        add(labelVictoryCondition);
        add(victoryCondition);
    }

    private void confirmUserSetup() {

        confirmUserSettings = new JButton("Start Game");
        confirmUserSettings.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                collectUserSettings();
                mainWindow.remove(mainWindow.gameMap);
                mainWindow.gameMap = new GameMap(mapSize, mapSize);
                mainWindow.add(mainWindow.gameMap);
                mainWindow.invalidate();
                mainWindow.validate();
                mainWindow.repaint();
            }
        });

        add(confirmUserSettings);

    }

    private void setupWindow(MainWindow mainWindow) {
        setSize(WIN_WIDTH, WIN_HEIGHT);

        Rectangle mainWindowP = mainWindow.getBounds();
        int windowX = (int) mainWindowP.getCenterX() - WIN_WIDTH / 2;
        int windowY = (int) mainWindowP.getCenterY() - WIN_HEIGHT / 2;

        setLocation(windowX, windowY);

        setTitle("Settings");
        setResizable(false);
        setLayout(new GridLayout(10,1));
    }

    private void collectUserSettings() {

        if (playHuman.isSelected()) {
            gameMode = GameMap.GAME_MODE_HVH;
        } else if (playAI.isSelected()) {
            gameMode = GameMap.GAME_MODE_HVA;
        } else {
            throw new RuntimeException("Something wrong!");
        }

        mapSize = sliderMapSize.getValue();
        vicCond = victoryCondition.getValue();

        mainWindow.startGameVicUserSetting(gameMode, mapSize, mapSize, vicCond);
        setVisible(false);

    }

}
