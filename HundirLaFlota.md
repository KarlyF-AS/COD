# Juego de Hundir la Flota 🚢
    import java.util.Scanner;

    public class HundirLaFlota {

        public static void main(String[] args) {
    
            // Creamos el tablero de juego de 5x5
            char[][] tablero = new char[5][5];
    
            // Llenamos el tablero con agua, representado por '~'
            for (int i = 0; i < tablero.length; i++) {
                for (int j = 0; j < tablero[i].length; j++) {
                    tablero[i][j] = '~'; // '~' significa agua
                }
            }
    
            // Colocamos los barcos en el tablero
            tablero[1][1] = 'B'; // Barco en la posición (1,1)
            tablero[3][3] = 'B'; // Barco en la posición (3,3)
            tablero[0][4] = 'B'; // Barco en la posición (0,4)
    
            // Mostramos el tablero inicial
            mostrarTablero(tablero);
    
            // Creamos un Scanner para leer la entrada del usuario
            Scanner scanner = new Scanner(System.in);
            int intentos = 0;
    
            // Comenzamos el juego
            while (true) {
                // Pedimos las coordenadas al jugador (fila y columna)
                System.out.println("Introduce una fila y columna (0-4) para disparar:");
                int fila = scanner.nextInt();
                int columna = scanner.nextInt();
    
                // Verificamos si el jugador ha dado en el blanco
                if (tablero[fila][columna] == 'B') {
                    System.out.println("¡Has hundido un barco!");
                    tablero[fila][columna] = 'X'; // Marcamos el barco hundido
                } else {
                    System.out.println("¡Agua! Sigue intentándolo.");
                    tablero[fila][columna] = 'O'; // Marcamos el disparo fallido
                }
    
                // Mostramos el tablero después de cada disparo
                mostrarTablero(tablero);
    
                // Aumentamos el contador de intentos
                intentos++;
    
                // Comprobamos si ya se han hundido todos los barcos
                if (tablero[1][1] == 'X' && tablero[3][3] == 'X' && tablero[0][4] == 'X') {
                    System.out.println("¡Felicidades! Has hundido todos los barcos en " + intentos + " intentos.");
                    break; // Terminamos el juego
                }
            }
    
            scanner.close(); // Cerramos el scanner
        }
    
        // Método para mostrar el tablero
        public static void mostrarTablero(char[][] tablero) {
            for (int i = 0; i < tablero.length; i++) {
                for (int j = 0; j < tablero[i].length; j++) {
                    System.out.print(tablero[i][j] + " ");
                }
                System.out.println(); // Salto de línea al final de cada fila
            }
        }
    }

![Imagen 2](https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRYhFW4K5sc1tJVAZlUa57ptv7lmGK0AYaDUA&s) 