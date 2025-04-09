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
        }
        else if (m_score1 >=4 || m_score2 >=4)
        {
            int minusResult = m_score1-m_score2;
            if (minusResult==1) score ="Advantage player1";
            else if (minusResult ==-1) score ="Advantage player2";
            else if (minusResult>=2) score = "Win for player1";
            else score ="Win for player2";
        }
        else
        {
            for (int i=1; i<3; i++)
            {
                if (i==1) tempScore = m_score1;
                else { score+="-"; tempScore = m_score2;}
                switch(tempScore)
                {
                    case 0:
                        score+="Love";
                        break;
                    case 1:
                        score+="Fifteen";
                        break;
                    case 2:
                        score+="Thirty";
                        break;
                    case 3:
                        score+="Forty";
                        break;
                }
            }

        }
    return score;
    }
}