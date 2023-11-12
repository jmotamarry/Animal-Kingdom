public class Goldfish extends Fish implements Adoptable {

    public Goldfish(String name) {
        setName(name);
    }

    @Override
    public String toString() {
        return super.toString() + " Goldfish";
    }

    @Override
    public String homeCareDirections() {
        return "Feed, change water, and give lots of love.";
    }

}
