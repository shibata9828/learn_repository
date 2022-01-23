package src.main;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MainWindow extends JFrame {
  private static final long serialVersionUID = 1L;

  ScreenMode screensode = ScreenMode.TITLE;

  final int WIDTH = 800;
  final int HEIGHT = 600;

  CardLayout layout = new CardLayout();

  TitlePanel titlePanel;
  GamePanel gamePanel;
  ScreenMode screenMode;

  MainWindow() {
    this.setTitle("set title here");
    ImageIcon icon = new ImageIcon(getClass().getClassLoader().getResource("images/swing_icon.png"));

    this.setIconImage(icon.getImage());

    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    this.setResizable(false);
    this.getContentPane().setBackground(Color.green);
    this.setLayout(layout);
    this.setPreferredSize(new Dimension(WIDTH, HEIGHT));
    this.pack();
    this.setLocationRelativeTo(null);

  }

  public void preparePanels() {

    titlePanel = new TitlePanel();
    this.add(titlePanel, "Title");
    gamePanel = new GamePanel();
    this.add(gamePanel, "Game_Screen");
    this.pack();
  }

  public void prepareComponents() {
    titlePanel.prepareComponents();
    gamePanel.prepareComponents();
  }

  public void setFontScreenAndFocus(ScreenMode s) {
    screenMode = s;

    switch (screenMode) {
      case TITLE:
        layout.show(this.getContentPane(), "Title");
        titlePanel.requestFocus();
        break;
      case GAME:
        layout.show(this.getContentPane(), "Game_Screen");
        gamePanel.requestFocus();
        break;
    }

  }
}