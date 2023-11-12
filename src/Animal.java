public abstract class Animal {
    private String name;

    public abstract boolean isWarmBlooded();
    public abstract boolean equals(Animal a);

    public String toString() {
        return "Animal Name: " + getName();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
