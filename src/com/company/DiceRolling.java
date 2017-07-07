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
    private JTextField dieOutputTextField;

    public DiceRolling() {
        rollTheDiceButton.addActionListener(new Rolling());
    }

    private class Rolling implements ActionListener{

        int[] tableRowOutput;
        public Rolling(){
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            int side = Integer.getInteger(numberOfSides.toString());

            int rolls = Integer.getInteger(numberOfRolls.toString());

            int random = (int) (Math.random() * side + 1);
            String sOutput = Integer.toString(random);
                dieOutputTextField.setText(sOutput);
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
