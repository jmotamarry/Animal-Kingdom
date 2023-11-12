public class Cat extends Mammal implements Adoptable {

    public Cat(String name) {
        setName(name);
    }

    @Override
    public String toString() {
        return super.toString() + " Cat";
    }

    @Override
    public String homeCareDirections() {
        return "Feed, change litter, give lots of love.";
    }

}
