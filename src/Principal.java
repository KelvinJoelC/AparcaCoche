import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        int filas = 5;
        int col = 10;
        int eleccion;
        int coorX;
        int coorY;

        char[][] aparcamiento = new char[filas][col];
        Scanner teclado = new Scanner(System.in);
        inicializarAparcamiento(aparcamiento, filas, col);

        do {
            System.out.println("" +
                    "Que deseas realizar: \n" +
                    "1.- Ver el parking.\n" +
                    "2.- Entrada de un coche.\n" +
                    "3.- Entrada de una moto.\n" +
                    "4.- Entrada de un autobus.\n" +
                    "5.- Salida de un vehiculo.\n" +
                    "6.- Ver recaudación.\n" +
                    "7.- Salir del programa.");
            eleccion = teclado.nextInt();
            switch (eleccion) {
                case 1:
                    dibujarAparcamiento(aparcamiento, filas, col);
                    break;
                case 2:
                        preguntacoordenadas();
                        coorX= teclado.nextInt();
                        coorY= teclado.nextInt();
                    if (comprobarParkingE(aparcamiento,coorY,coorX) == true)
                        añadirCoche(aparcamiento,coorY, coorX);
                    else
                        System.out.println("No se puede aparacar ahí\n");

                    break;
                case 3:
                    preguntacoordenadas();
                    coorX= teclado.nextInt();
                    coorY= teclado.nextInt();
                    if (comprobarParkingE(aparcamiento,coorY,coorX) == true)
                        añadirMoto(aparcamiento,coorY, coorX);
                    else
                        System.out.println("No se puede aparacar ahí\n");

                    break;
                case 4:
                    preguntacoordenadas();
                    coorX= teclado.nextInt();
                    coorY= teclado.nextInt();
                    if (comprobarParkingE(aparcamiento,coorY,coorX) == true)
                        añadirAutobus(aparcamiento,coorY, coorX);
                    else
                        System.out.println("No se puede aparacar ahí\n");

                    break;
                case 5:
                    preguntacoordenadas();
                    coorX= teclado.nextInt();
                    coorY= teclado.nextInt();
                    if (comprobarParkingS(aparcamiento,coorY,coorX) == true)
                            quitarVehiculo(aparcamiento,coorY,coorX);
                    break;
                case 6:
                    break;
                case 7:
                    System.out.println("Gracias por usar el programa");
                    break;
                default:
                    System.out.println("Numero no permitido");
                    break;
            }
        } while (eleccion != 7);

    }

    static void dibujarAparcamiento(char[][] matriz, int f, int c) {
        System.out.println("\t  Parking ");
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void inicializarAparcamiento(char[][] matriz, int f, int c) {

        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                if ((i == 0 && j == 0) || (i == 0 && j == 9) || (i == 2 && j == 0) || (i == 4 && j == 0) || (i == 4 && j == 9))
                    matriz[i][j] = 'X';
                else if (i == 1 && j == 0)
                    matriz[i][j] = 'E';
                else if (i == 3 && j == 0)
                    matriz[i][j] = 'S';
                else if ((i == 0 && matriz[i][j] != 'X') || (i == 4 && matriz[i][j] != 'X') || (j == 9 && matriz[i][j] != 'X'))
                    matriz[i][j] = 'P';
                else matriz[i][j] = ' ';
            }
            System.out.println();
        }
    }

    static boolean comprobarParkingE(char[][] matriz, int i, int j) {

        if (matriz[i][j] != ' ')
            return false;
        else return true ;
    }

    static void añadirCoche(char[][] matriz, int i, int j) {

        matriz[i][j] = 'C';

    }
    static void añadirMoto(char[][] matriz, int i, int j) {
        matriz[i][j] = 'M';

    }
    static void añadirAutobus(char[][] matriz, int i, int j) {

        matriz[i][j] = 'A';

    }
    static void preguntacoordenadas() {
        System.out.println("¿Que posición quieres aparcar? (x:(0-9), y:(0-4))");
    }
    static boolean comprobarParkingS(char[][] matriz, int i, int j) {

        if ((matriz[i][j] == 'C') || (matriz[i][j] == 'A') || (matriz[i][j] == 'M'))
            return true;
        else return false ;
    }
    static void quitarVehiculo(char[][] matriz, int i, int j){
        matriz[i][j] = ' ';
    }


}



