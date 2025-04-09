public class Main {
    public static String getScore(int player1Score, int player2Score) {
        if (player1Score == player2Score) {
            return getTieScore(player1Score);
        } else if (player1Score >= 4 || player2Score >= 4) {
            return getAdvantageOrWinScore(player1Score, player2Score);
        } else {
            return getRegularScore(player1Score, player2Score);
        }
    }

    private static String getTieScore(int score) {
        switch (score) {
            case 0:
                return "Love-All";
            case 1:
                return "Fifteen-All";
            case 2:
                return "Thirty-All";
            case 3:
                return "Forty-All";
            default:
                return "Deuce";
        }
    }

    private static String getAdvantageOrWinScore(int player1Score, int player2Score) {
        int difference = player1Score - player2Score;
        if (difference == 1) return "Advantage player1";
        if (difference == -1) return "Advantage player2";
        if (difference >= 2) return "Win for player1";
        return "Win for player2";
    }

    private static String getRegularScore(int player1Score, int player2Score) {
        String[] scoreNames = {"Love", "Fifteen", "Thirty", "Forty"};
        return scoreNames[player1Score] + "-" + scoreNames[player2Score];
    }
}
