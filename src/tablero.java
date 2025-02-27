import java.util.Random;

public class tablero {
    private char[][] tablero;
    private int filas;
    private int columnas;
    public tablero(int fila, int columna) {

        this.filas = fila;
        this.columnas = columna;
        tablero = new char[fila][columna];
    }
    public void rellenarTablero(int numBombes) {
        Random rand = new Random();

        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                tablero[i][j] = ' ';
            }
        }
        int bombesColocades = 0;
        while (bombesColocades < numBombes) {
            int fila = rand.nextInt(tablero.length);
            int columna = rand.nextInt(tablero[0].length);

            if (tablero[fila][columna] != 'B') {
                tablero[fila][columna] = 'B';
                bombesColocades++;
            }

        }
    }
    public void imprimirTablero() {
            for (int i = 0; i < filas; i++) {
                for (int j = 0; j < columnas; j++) {
                    System.out.print(tablero[i][j] + " ");
                }
                System.out.println();
            }
        }
    }

