package Interface.A;

public class Players implements INformation{
      private String nameOfPlayer;
      private String sportType;
      private int numberPosition;
      private String nameTeam;

    public Players() {
    }

    public Players(String nameOfPlayer, String sportType, int numberPosition, String nameTeam) {
        this.nameOfPlayer = nameOfPlayer;
        this.sportType = sportType;
        this.numberPosition = numberPosition;
        this.nameTeam = nameTeam;
    }

    @Override
    public void getInfo() {

    }

    @Override
    public void getTeamName() {

    }

    public String getNameOfPlayer() {
        return nameOfPlayer;
    }

    public void setNameOfPlayer(String nameOfPlayer) {
        this.nameOfPlayer = nameOfPlayer;
    }

    public String getSportType() {
        return sportType;
    }

    public void setSportType(String sportType) {
        this.sportType = sportType;
    }

    public int getNumberPosition() {
        return numberPosition;
    }

    public void setNumberPosition(int numberPosition) {
        this.numberPosition = numberPosition;
    }

    public String getNameTeam() {
        return nameTeam;
    }

    public void setNameTeam(String nameTeam) {
        this.nameTeam = nameTeam;
    }
}
