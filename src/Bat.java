public class Bat extends Mammal implements Winged {

    public Bat(String name) {
        setName(name);
    }

    @Override
    public String toString() {
        return super.toString() + " Bat";
    }

    public boolean canFly() {
        return true;
    }
}
