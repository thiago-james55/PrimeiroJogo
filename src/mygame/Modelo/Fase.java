package mygame.Modelo;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import java.awt.Image;
import java.awt.Graphics2D;
import java.awt.Graphics;

public class Fase extends JPanel {

    private Image fundo;

    public Fase() {
        ImageIcon referencia = new ImageIcon("res\\background.jpg");
        this.fundo = referencia.getImage();
    }

    public void paint (Graphics g) {

        Graphics2D graficos = (Graphics2D) g;
        graficos.drawImage(this.fundo, 0,0, null);
        g.dispose();


    }
}
