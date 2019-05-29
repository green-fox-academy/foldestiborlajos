public class TennisPlayer {
  protected String name;
  protected int matchScore = 0;

  public TennisPlayer (String name){
    this.name= name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getMatchScore() {
    return matchScore;
  }

  public void setMatchScore(int matchScore) {
    this.matchScore = matchScore;
  }
}
