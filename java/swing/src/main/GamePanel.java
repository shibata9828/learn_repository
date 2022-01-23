package src.main;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class GamePanel extends JPanel {
  private static final long serialVersionUID = 1L;

  JLabel titleLabel;

  GamePanel() {

    this.setLayout(null);
    this.setBackground(Color.yellow);
  }

  public void prepareComponents() {
    titleLabel = new JLabel();
    titleLabel.setText("Game_Screen");
    titleLabel.setBounds(100, 0, 100, 30);
    this.add(titleLabel);

  }
}