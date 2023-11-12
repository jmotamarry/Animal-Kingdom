public class Otter extends Mammal implements WaterDweller {

    public Otter(String name) {
        setName(name);
    }

    @Override
    public String toString() {
        return super.toString() + " Otter";
    }

    @Override
    public boolean canLiveOutOfWater() {
        return true;
    }

}
