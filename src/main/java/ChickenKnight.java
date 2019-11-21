public class ChickenKnight implements Knight {

    private RescueQuest rescueQuest;

    public ChickenKnight() {
        this.rescueQuest = new RescueQuest();
    }

    @Override
    public void embarkOnQuest() {
        rescueQuest.embark();
    }
}
