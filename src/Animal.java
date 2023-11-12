public abstract class Animal {
    private String name;

    public abstract boolean isWarmBlooded();
    public abstract String toString();
    public abstract boolean equals();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
