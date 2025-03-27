package com.coddingchallenge;
import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class GirlWalkingInRain extends JPanel {
    private int girlX = -50; // Initial position of the girl
    private int[][] rainDrops;
    private static final int NUM_DROPS = 100;
    private static final int WIDTH = 1300;
    private static final int HEIGHT = 1000;
    private static final int SPEED = 2;
    private boolean showLightning = false;
    private Image girlImage;

    public GirlWalkingInRain() {
        rainDrops = new int[NUM_DROPS][2];
        Random rand = new Random();
        for (int i = 0; i < NUM_DROPS; i++) {
            rainDrops[i][0] = rand.nextInt(WIDTH);
            rainDrops[i][1] = rand.nextInt(HEIGHT);
        }
        girlImage = new ImageIcon("E:\\boy.png").getImage(); // Load baby girl image

        Timer timer = new Timer(50, e -> moveElements());
        timer.start();
        Timer lightningTimer = new Timer(3000, e -> triggerLightning());
        lightningTimer.start();
    }

    private void moveElements() {
        girlX += SPEED;
        if (girlX > WIDTH) {
            girlX = -50;
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

    private void triggerLightning() {
        showLightning = true;
        repaint();
        Timer flashTimer = new Timer(200, e -> {
            showLightning = false;
            repaint();
        });
        flashTimer.setRepeats(false);
        flashTimer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        setBackground(showLightning ? Color.WHITE : Color.GRAY);

        // Drawing baby girl image
        g.drawImage(girlImage, girlX, 180, 100, 160, this); // Increased size

        // Drawing raindrops
        g.setColor(Color.CYAN);
        for (int[] rainDrop : rainDrops) {
            g.drawLine(rainDrop[0], rainDrop[1], rainDrop[0], rainDrop[1] + 10);
        }

        // Drawing lightning bolt
        if (showLightning) {
            g.setColor(Color.YELLOW);
            int x = new Random().nextInt(WIDTH - 50);
            g.drawLine(x, 0, x + 10, 50);
            g.drawLine(x + 10, 50, x - 10, 100);
            g.drawLine(x - 10, 100, x + 20, 150);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Akash Flying in Rain with Thunderstorm");
        GirlWalkingInRain panel = new GirlWalkingInRain();
        frame.add(panel);
        frame.setSize(WIDTH, HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
