package app;

import com.formdev.flatlaf.FlatDarkLaf;
import app.layout.App;

import javax.swing.*;

/**
 * The Calculator class is responsible for launching the calculator application.
 *
 * @author Roberto Vicario
 * @version 1.0
 */
public class Calculator {
    /**
     * The main method is the entry point of the calculator application.
     *
     * @param args command-line arguments (not used in this application)
     */
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(new FlatDarkLaf());
        } catch (UnsupportedLookAndFeelException e) {
            throw new RuntimeException(e.getMessage());
        }

        new App();
    }
}
