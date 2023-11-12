public class Bird extends Animal implements Winged {

    @Override
    public boolean canFly() {
        return true;
    }

    @Override
    public boolean isWarmBlooded() {
        return true;
    }

    @Override
    public String toString() {
        return super.toString() + "\tWarm Blooded\tBird";
    }

    @Override
    public boolean equals(Animal a) {
        if (a.isWarmBlooded() == true && getName().toLowerCase().equals(a.getName().toLowerCase())) {
            return true;
        }
        return false;
    }
}
