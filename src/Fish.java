public class Fish extends Animal implements WaterDweller {

    @Override
    public boolean isWarmBlooded() {
        return false;
    }

    @Override
    public String toString() {
        return super.toString() + "\tCold Blooded\tFish";
    }

    @Override
    public boolean equals(Animal a) {
        if (a.isWarmBlooded() == false && getName().toLowerCase().equals(a.getName().toLowerCase())) {
            return true;
        }
        return false;
    }

    @Override
    public boolean canLiveOutOfWater() {
        return false;
    }

}
