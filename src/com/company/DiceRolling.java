package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Matt on 7/7/2017.
 */
public class DiceRolling {
    private JPanel mainScreen;
    private JTextField numberOfSides;
    private JButton rollTheDiceButton;
    private JTable table1;
    private JTextField numberOfRolls;

    public DiceRolling() {
        rollTheDiceButton.addActionListener(new Rolling());
    }

    private class Rolling implements ActionListener{

        public Rolling(){

        }

        @Override
        public void actionPerformed(ActionEvent e) {

        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("DiceRolling");
        frame.setContentPane(new DiceRolling().mainScreen);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
