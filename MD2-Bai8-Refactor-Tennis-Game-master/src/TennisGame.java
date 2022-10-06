public class TennisGame {
    public static String getScore(String player1Name, String player2Name, int first_Score_Player1, int second_Score_Player) {
        String score = "";
        int tempScore = 0;
        if (first_Score_Player1 == second_Score_Player) {
            switch (first_Score_Player1) {
                case 0:
                    score = "Love-All";
                    break;
                case 1:
                    score = "Fifteen-All";
                    break;
                case 2:
                    score = "Thirty-All";
                    break;
                case 3:
                    score = "Forty-All";
                    break;
                default:
                    score = "Deuce";
                    break;
            }
        } else if (first_Score_Player1 >= 4 || second_Score_Player >= 4) {
            int minusResult = first_Score_Player1 - second_Score_Player;
            if (minusResult == 1) score = "Advantage player1";
            else if (minusResult == -1) score = "Advantage player2";
            else if (minusResult >= 2) score = "Win for player1";
            else score = "Win for player2";
        } else {
            for (int i = 1; i < 3; i++) {
                if (i == 1) tempScore = first_Score_Player1;
                else {
                    score += "-";
                    tempScore = second_Score_Player;
                }
                switch (tempScore) {
                    case 0:
                        score += "Love";
                        break;
                    case 1:
                        score += "Fifteen";
                        break;
                    case 2:
                        score += "Thirty";
                        break;
                    case 3:
                        score += "Forty";
                        break;
                }
            }
        }
        return score;
    }
}
