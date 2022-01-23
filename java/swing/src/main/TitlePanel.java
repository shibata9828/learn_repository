package src.main;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class TitlePanel extends JPanel {

  JLabel titleLabel;

  TitlePanel() {

    this.setLayout(null);
    this.setBackground(Color.white);
  }

  public void prepareComponents() {
    titleLabel = new JLabel();
    titleLabel.setText("Title_Screen");
    titleLabel.setBounds(100, 0, 100, 30);
    this.add(titleLabel);

  }
}