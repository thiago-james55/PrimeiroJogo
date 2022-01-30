package mygame.Modelo;

import javax.swing.*;
import java.awt.Image;

public class Tiro {

    private Image imagem;
    private int x,y;
    private int largura,altura;
    private boolean isVisible;

    //Constant

    private static final int MAX_LARGURA = 938;
    private static int VELOCIDADE = 5;

    public Tiro(int x, int y) {

        this.x = x;
        this.y = y;
        isVisible = true;

    }

    public void load() {

        ImageIcon referencia = new ImageIcon("res2\\tiroSimples.png");
        this.imagem = referencia.getImage();

        this.largura = imagem.getHeight(null);
        this.altura = imagem.getWidth(null);
    }

    public void update() {

        this.x += VELOCIDADE;

        if (this.x > MAX_LARGURA) {

            isVisible = false;

        }

    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean isVisible() {
        return isVisible;
    }

    public static int getVELOCIDADE() {
        return VELOCIDADE;
    }

    public static void setVELOCIDADE(int VELOCIDADE) {
        Tiro.VELOCIDADE = VELOCIDADE;
    }

    public Image getImagem() {
        return imagem;
    }

}
