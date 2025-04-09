public class Main {
    /**
     * Refactorizando un metodo para devolver la puntuacion de tenis
     */
    public static String getScore(int player1Score, int player2Score){
    String score = "";
    int currentScore = 0;

        private static final String LOVE = "Love";
        private static final String FIFTEEN = "Fifteen";
        private static final String THIRTY = "Thirty";
        private static final String FORTY = "Forty";
        private static final String ALL = "All";
        private static final String DEUCE = "Deuce";
        private static final String ADVANTAGE_PREFIX = "Advantage ";
        private static final String WIN_FOR_PREFIX = "Win for ";
        private static final String PLAYER1 = "player1";
        private static final String PLAYER2 = "player2";

        // Constantes para las reglas del juego
        private static final int MIN_SCORE_FOR_ADVANTAGE = 4;
        private static final int WIN_DIFFERENCE = 2;

    /**
     * Obtiene el marcador actual del partido de tenis
     * @param player1Score Puntos del jugador 1
     * @param player2Score Puntos del jugador 2
     * @return String con el marcador formateado
     */
        public static String getScore(int player1Score, int player2Score) {
            if (isTie(player1Score, player2Score)) {
                return getTieScore(player1Score);      //Retorna "Love-All", "Deuce", otros...
            }

            if (isAdvantageOrWin(player1Score, player2Score)) {
                return getAdvantageOrWinScore(player1Score, player2Score); // → "Advantage" o "Win"
            }
            //Si no es empate ni ventaja: retorna marcador normal ... "Thirty-Fifteen"
            return getRegularScore(player1Score, player2Score);
        }
            // Método que verifica si hay empate
            private static boolean isTie(int player1Score, int player2Score) {
                return player1Score == player2Score;
            }
            // Método que devuelve el marcador cuando hay empate
            private static String getTieScore(int score) {
                switch (score) {
                    case 0: return LOVE + "-" + ALL;
                    case 1: return FIFTEEN + "-" + ALL;
                    case 2: return THIRTY + "-" + ALL;
                    case 3: return FORTY + "-" + ALL;
                    default: return DEUCE;
                }
        }
        // Método que verifica si hay ventaja o victoria
        private static boolean isAdvantageOrWin(int player1Score, int player2Score) {
            return player1Score >= MIN_SCORE_FOR_ADVANTAGE || player2Score >= MIN_SCORE_FOR_ADVANTAGE;
        }
        // Método que determina ventaja o victoria
        private static String getAdvantageOrWinScore(int player1Score, int player2Score) {
            int scoreDifference = player1Score - player2Score;

        }