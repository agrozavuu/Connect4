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
        Random random = new Random();
        turno = random.nextInt(2) == 0 ? 'X' : 'O';
    }

    public void cambiaTurno() {
        if (turno == 'X'){
            turno = 'O';
        }else {
            turno = 'X';
        }
    }
    public boolean estaColumnaLibre(int columna) {
        for (int i = m.length - 1; i >= 0; i--) {
            if (m[i][columna] == ' ') {
                return true;
            }
        }
        return false;
    }


    public void inserta(char ficha, int columna) {
        for (int i = m.length - 1; i >= 0; i--) {
            if (m[i][columna] == ' ') {
                m[i][columna] = ficha;
                contador++;
                break;
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
        for (int fila = 0; fila < ancho; fila++) {
            for (int columna = 0; columna < m[0].length - 3; columna++) {
                if (hay4Horizontales(columna, fila, jugador)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean hay4Horizontales(int columna, int fila, char jugador){
        if (m[fila][columna] == jugador && m[fila][columna] == jugador && m[fila][columna + 1] == jugador && m[fila][columna + 2] == jugador) {
            return true;
        }
        return false;
    }



    private boolean ganaVertical(char jugador) {
        for (int i = 0; i < alto; i++) {
            for (int j = 0; j < ancho; j++) {
                if (hay4Verticales(j, i, jugador)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean hay4Verticales(int columna, int fila, char jugador){
        for (int i = fila + 1; i < alto; i++) {
            if (m[i][columna] == jugador) {
                contador++;
            } else {
                break;
            }
        }

        for (int i = fila - 1; i >= 0; i--) {
            if (m[i][columna] == jugador) {
                contador++;
            } else {
                break;
            }
        }

        if (contador >= 4) {
            return true;
        } else {
            return false;
        }
    }

    private boolean ganaDiagonalArriba(char jugador) {
        //TODO: ganaDiagonalArriba
        boolean b = true;
        return b;
    }

    private boolean hay4DiagonalesArriba(int columna, int fila, char jugador){
        //TODO: hay4DiagonalesArriba
        return true;
    }

    private boolean ganaDiagonalAbajo(char jugador) {
        //TODO: ganaDiagonalAbajo
        boolean b = true;
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
