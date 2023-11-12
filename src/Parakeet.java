public class Parakeet extends Bird implements Adoptable {

    public Parakeet(String name) {
        setName(name);
    }

    @Override
    public String toString() {
        return super.toString() + " Parakeet";
    }

    @Override
    public String homeCareDirections() {
        return "Feed, talk to, give lots of love.";
    }

}
