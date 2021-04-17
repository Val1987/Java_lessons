package lesson7;

import javax.swing.*;

public class CrossButton extends JButton {

    int x;
    int y;
    CrossButton(int x, int y) {

        this.x = x;
        this.y = y;
    }
    boolean isEmpty() {
        return this.getText().isEmpty();
    }

    boolean isCross() {
        return  this.getText() == "x";
    }

    boolean isZero() {
        return  this.getText() == "o";
    }

}
