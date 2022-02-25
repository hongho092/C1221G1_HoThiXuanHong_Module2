package ss8_cleancode_refactor.bai_tap;

public class TennisGame {
    public static String getScore(String player1Name, String player2Name, int player1Score, int player2Score) {
        boolean draw = player1Score == player2Score;
        boolean winner = player1Score >= 4 || player2Score >= 4;
        if (draw) return getDraw(player1Score);
        if (winner) return getWinner(player1Score, player2Score);
        String score = getPlayerScore(player1Score) + "-" + getPlayerScore(player2Score);
        return score;
    }
    private static String getPlayerScore(int playerScore) {
        switch(playerScore){
            case 0:
                return "Love";
            case 1:
                return "15";
            case 2:
                return "30";
            default:
                return "40";
        }
    }
    private static String getDraw(int player1Score) {
        switch (player1Score)
        {
            case 0:
                return  "Love-All";
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
    private static String getWinner(int player1Score, int player2Score) {
        int finalScore = player1Score - player2Score;
        if (finalScore == 1) return "Advantage player1";
        else if (finalScore == -1) return "Advantage player2";
        else if (finalScore >= 2) return "Win for player1";
        else return "Win for player2";
    }

    public static void main(String[] args) {
        System.out.println(getScore("hong","mai", 5,6));
        System.out.println(getScore("hong","main", 50,4));
        System.out.println(getScore("hong", "main", 5, 5));
        System.out.println(getDraw(7));
    }
}
