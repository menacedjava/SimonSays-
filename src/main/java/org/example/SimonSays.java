package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;
import java.util.TimerTask;

public class SimonSays extends JFrame implements ActionListener {
    private JButton[] buttons = new JButton[4];
    private String[] colors = {"Red", "Green", "Blue", "Yellow"};
    private Color[] buttonColors = {Color.RED, Color.GREEN, Color.BLUE, Color.YELLOW};
    private ArrayList<Integer> sequence = new ArrayList<>();
    private int step = 0;
    private boolean playerTurn = false;
    private Random random = new Random();
    private Timer timer;
    private int index = 0;

    public SimonSays() {
        setTitle("Simon Says");
        setSize(400, 500);
        setLayout(new GridLayout(2, 2));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        for (int i = 0; i < 4; i++) {
            buttons[i] = new JButton();
            buttons[i].setBackground(buttonColors[i]);
            buttons[i].setOpaque(true);
            buttons[i].setBorderPainted(false);
            buttons[i].addActionListener(this);
            add(buttons[i]);
        }

        startNewGame();
        setVisible(true);
        setLocationRelativeTo(null);
    }

//    private void startNewGame() {
//        sequence.clear();
//        addToSequence();
//        showSequence();
//    }

//    private void addToSequence() {
//        sequence.add(random.nextInt(4));
//    }

//    private void showSequence() {
//        playerTurn = false;
//        index = 0;
//
//        timer = new Timer(1000, new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//                if (index < sequence.size()) {
//                    int btnIndex = sequence.get(index);
//                    buttons[btnIndex].setBackground(Color.WHITE);
//
//                    new Timer(500, new ActionListener() {
//                        public void actionPerformed(ActionEvent e) {
//                            buttons[btnIndex].setBackground(buttonColors[btnIndex]);
//                        }
//                    }).setRepeats(false);
//
//                    index++;
//                } else {
//                    timer.stop();
//                    playerTurn = true;
//                }
//            }
//        });
//
//        timer.setRepeats(true);
//        timer.start();
//    }

//    @Override
//    public void actionPerformed(ActionEvent e) {
//        if (!playerTurn) return;
//
//        for (int i = 0; i < 4; i++) {
//            if (e.getSource() == buttons[i]) {
//                if (i == sequence.get(step)) {
//                    step++;
//                    if (step == sequence.size()) {
//                        addToSequence();
//                        showSequence();
//                    }
//                } else {
//                    JOptionPane.showMessageDialog(this, "Wrong! Game Over!");
//                    startNewGame();
//                }
//                return;
//            }
//        }
//    }

//    public static void main(String[] args) {
//        new SimonSays();
//    }
}