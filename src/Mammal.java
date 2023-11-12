public class Mammal extends Animal {

    @Override
    public boolean isWarmBlooded() {
        return true;
    }

    @Override
    public String toString() {
        return super.toString() + "\tWarm Blooded\tMammal";
    }

    @Override
    public boolean equals(Animal a) {
        if (a.isWarmBlooded() && getName().toLowerCase().equals(a.getName().toLowerCase())) {
            return true;
        }
        return false;
    }
}
