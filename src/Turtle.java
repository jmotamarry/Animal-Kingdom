public class Turtle extends Reptile implements WaterDweller, Adoptable {

    public Turtle(String name) {
        setName(name);
    }

    @Override
    public String toString() {
        return super.toString() + " Turtle";
    }

    @Override
    public boolean canLiveOutOfWater() {
        return true;
    }

    @Override
    public String homeCareDirections() {
        return "Feed, clean shell, and give lots of love.";
    }

}
