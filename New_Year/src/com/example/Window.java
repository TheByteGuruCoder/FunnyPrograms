package com.example;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Window implements ActionListener{

    private final JLabel jlab = new JLabel("Press a buttom");



    public Window(){
        JFrame frame = new JFrame();
        frame.setSize(190,80);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setVisible(true);

        JPanel panel = new JPanel();
        JButton button = new JButton("BUTTON");
        frame.setLayout(new BorderLayout());
        panel.add(button);
        frame.add (panel, BorderLayout.SOUTH);
        button.addActionListener(this);
        panel.add(jlab);

    }


    @Override
    public void actionPerformed(ActionEvent ae) {

        if(ae.getActionCommand().equals("BUTTON")){
            Flow f = new Flow();
            Thread Thrd = new Thread(f);
            Thrd.start();

        }
    }
}
