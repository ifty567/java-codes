import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Gsme extends JPanel implements KeyListener {
    private int playerX = 50;
    private int playerY = 50;
    private int playerSpeed = 5;

    public Gsme() {
        JFrame frame = new JFrame("Simple 2D Game");
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(this);
        frame.addKeyListener(this);
        frame.setVisible(true);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.GREEN);
        g.fillRect(playerX, playerY, 50, 50); // Draw the player as a green square
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        if (key == KeyEvent.VK_UP) {
            playerY -= playerSpeed;
        } else if (key == KeyEvent.VK_DOWN) {
            playerY += playerSpeed;
        } else if (key == KeyEvent.VK_LEFT) {
            playerX -= playerSpeed;
        } else if (key == KeyEvent.VK_RIGHT) {
            playerX += playerSpeed;
        }
        repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // Not used
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // Not used
    }

    public static void main(String[] args) {
        new Gsme();
    }
}
