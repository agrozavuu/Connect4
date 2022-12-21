package com.agrozavuu.connect4;

import java.util.Random;

/**
 * @author Nombre Apellido
 */
public class Tablero {
    private static final Random RANDOM = new Random();

    public final static char O = 'O';
    public final static char X = 'X';
    public final static char L = ' ';
    private final static int W = 7;
    private final static int H = 6;
    private int contador;
    private char turno;
    private final int ancho;
    private final int alto;
    private final char[][] m;

    public Tablero() {
        contador = 0;
        turno = O;
        ancho = W;
        alto = H;
        m = new char[ancho][alto];
        for (int i = 0; i < ancho; i++) {
            for (int j = 0; j < alto; j++) {
                m[i][j] = L;
            }
        }
    }

    public Tablero(char[][] m) {
        //TODO: Tablero(m)
        contador = 0;
        turno = X;
        ancho = 0;
        alto = 0;
        this.m = m;
    }

    public int getAncho() {
        return ancho;
    }

    public int getAlto() {
        return alto;
    }

    public int getContador() {
        return contador;
    }

    public char[][] getMatriz(){
        return m;
    }

    public char getTurno() {
        return turno;
    }

    public void iniciaTurno() {
        Random rand = new Random();

        int turno = rand.nextInt(2);

        if (turno == 0) {
            System.out.println("X");
        } else {
            System.out.println("O");
        }
    }

    public void cambiaTurno() {
        if (turno == 'X'){
            turno += 'O';
        }else if (turno == 'O'){
            turno += 'X';
        }
    }

    public boolean estaColumnaLibre(int columna) {
        for (int i = 0; i < m.length; i++) {
            if (m[i][columna] == ' '){
                return true;
            }
        }
        return false;
    }

    public void inserta(char ficha, int columna) {
        for (int i = 0; i < m.length; i++) {
            if (m[i][columna] == ' ') {
                m[i][columna] = ficha;
                contador++;
                return;
            }
        }
    }

    public boolean estaLleno() {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (m[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean gana(char jugador) {
        boolean b;
        b = ganaHorizontal(jugador);
        b = b || ganaVertical(jugador);
        b = b || ganaDiagonalArriba(jugador);
        b = b || ganaDiagonalAbajo(jugador);
        return b;
    }

    private boolean ganaHorizontal(char jugador) {
        //TODO: ganaHorizontal
        boolean b = false;
        return b;
    }

    private boolean hay4Horizontales(int columna, int fila, char jugador){
        //TODO: hay4Horizontales
        return true;
    }

    private boolean ganaVertical(char jugador) {
        //TODO: ganaVertical
        boolean b = false;
        return b;
    }

    private boolean hay4Verticales(int columna, int fila, char jugador){
        //TODO: hay4Verticales
        return true;
    }

    private boolean ganaDiagonalArriba(char jugador) {
        //TODO: ganaDiagonalArriba
        boolean b = false;
        return b;
    }

    private boolean hay4DiagonalesArriba(int columna, int fila, char jugador){
        //TODO: hay4DiagonalesArriba
        return true;
    }

    private boolean ganaDiagonalAbajo(char jugador) {
        //TODO: ganaDiagonalAbajo
        boolean b = false;
        return b;
    }

    private boolean hay4DiagonalesAbajo(int columna, int fila, char jugador){
        //TODO: hay4DiagonalesAbajo
        return true;
    }

    public boolean estaFinalizado() {
        //TODO: finalizado
        return false;
    }

}
