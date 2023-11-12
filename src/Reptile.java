public class Reptile extends Animal {

    @Override
    public boolean isWarmBlooded() {
        return false;
    }

    @Override
    public String toString() {
        return super.toString() + "\tCold Blooded\tReptile";
    }

    @Override
    public boolean equals(Animal a) {
        if (a.isWarmBlooded() == false && getName().toLowerCase().equals(a.getName().toLowerCase())) {
            return true;
        }
        return false;
    }

}
