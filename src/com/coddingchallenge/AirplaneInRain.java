package com.coddingchallenge;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class AirplaneInRain extends JPanel {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int planeX = -100; // Initial position of the airplane
    private int[][] rainDrops;
    private static final int NUM_DROPS = 100;
    private static final int WIDTH = 800;
    private static final int HEIGHT = 500;
    private static final int SPEED = 5;
    
    public AirplaneInRain() {
        rainDrops = new int[NUM_DROPS][2];
        Random rand = new Random();
        for (int i = 0; i < NUM_DROPS; i++) {
            rainDrops[i][0] = rand.nextInt(WIDTH);
            rainDrops[i][1] = rand.nextInt(HEIGHT);
        }
        Timer timer = new Timer(50, e -> moveElements());
        timer.start();
    }
    
    private void moveElements() {
        planeX += SPEED;
        if (planeX > WIDTH) {
            planeX = -100;
        }
        for (int i = 0; i < NUM_DROPS; i++) {
            rainDrops[i][1] += 10;
            if (rainDrops[i][1] > HEIGHT) {
                rainDrops[i][1] = 0;
                rainDrops[i][0] = new Random().nextInt(WIDTH);
            }
        }
        repaint();
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        setBackground(Color.GRAY);
        
        g.setColor(Color.BLUE);
        g.fillOval(planeX + 40, 200, 80, 30);
        g.fillRect(planeX + 50, 220, 60, 20);
        g.setColor(Color.BLACK);
        g.fillPolygon(new int[]{planeX + 40, planeX + 10, planeX + 40}, new int[]{200, 220, 240}, 3);
        g.fillPolygon(new int[]{planeX + 120, planeX + 150, planeX + 120}, new int[]{200, 220, 240}, 3);
        g.setColor(Color.WHITE);
        g.fillRect(planeX + 75, 190, 30, 10);
        
        g.setColor(Color.CYAN);
        for (int[] rainDrop : rainDrops) {
            g.drawLine(rainDrop[0], rainDrop[1], rainDrop[0], rainDrop[1] + 10);
        }
    }
    
    public static void main(String[] args) {
        JFrame frame = new JFrame("Airplane Flying in Rain");
        AirplaneInRain panel = new AirplaneInRain();
        frame.add(panel);
        frame.setSize(WIDTH, HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
