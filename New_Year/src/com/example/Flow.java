package com.example;

import java.util.Random;
import javax.swing.JFrame;


public class Flow implements Runnable{

    private JFrame window;


     public void draw(){

        Random random = new Random();

        int width = random.nextInt(1920) + 1;
        int height = random.nextInt(1080) + 1;
        MyPanel p = new MyPanel();
        JFrame frame = new JFrame();

        frame.add(p);

         frame.setSize(300,390);
         frame.setLocation(width, height);

         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setResizable(false);
         frame.setVisible(true);

        p.setBounds(0, 0, 300, 300);

    }

    @Override
    public void run() {
        for(int i = 0; i < 30; i++)
            try{
                draw();
                Thread.sleep(500);

            }catch(InterruptedException exc){
                System.out.println(exc.getMessage());
            }
    }



}