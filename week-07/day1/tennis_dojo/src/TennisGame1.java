public class TennisGame1 implements TennisGamePlayable {

  private TennisPlayer playerOne;
  private TennisPlayer playerTwo;
  private Scores matchScores = new Scores();

  public TennisGame1(String playerOneName, String playerTwoName) {
    this.playerOne = new TennisPlayer(playerOneName);
    this.playerTwo = new TennisPlayer(playerTwoName);
  }

  public void wonPoint(TennisPlayer player) {
    player.setMatchScore(player.getMatchScore() + 1);
  }

  public String getScore() {
    if (isAnybodyWinns()) {
      return "winner";
    } else if (isItDeuce()) {
      return "deuce";
    } else if (isItAdvantage()) {
      return "advantage";
    } else {
      return this.matchScores.getPlainScore(playerOne.matchScore) + "-" +
          this.matchScores.getPlainScore(playerTwo.getMatchScore());
    }
  }

  public boolean isAnybodyWinns() {
    if ((playerOne.getMatchScore() >= 4 || playerTwo.getMatchScore() >= 4) && (
        playerOne.getMatchScore() - playerTwo.getMatchScore() >= 2
            || playerTwo.getMatchScore() - playerOne.getMatchScore() >= 2)) {
      return true;
    } else {
      return false;
    }
  }

  public boolean isItDeuce() {
    if (playerOne.getMatchScore() + playerTwo.getMatchScore() > 6
        && playerOne.getMatchScore() == playerTwo.getMatchScore()) {
      return true;
    } else {
      return false;
    }
  }

  public boolean isItAdvantage() {
    if (playerOne.getMatchScore() + playerTwo.getMatchScore() > 6
        && playerOne.getMatchScore() != playerTwo.getMatchScore()) {
      return true;
    } else {
      return false;
    }
  }


}

