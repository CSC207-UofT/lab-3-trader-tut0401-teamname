public class Dog implements Tradable, Domesticatable {
    String name;
    int age;
    int avg_lifespan;
    int breed;

    @Override
    public String sound() {
        return "Bow wow!!";
    }

    public Dog(String name, int avg_lifespan) {
        this.name = name;
        this.age = 1;
        this.avg_lifespan = 0;
        this.breed = 20;
    }

    @Override
    public int getPrice() {
        return breed * (avg_lifespan - age) * 100;
    }

    public String getName() {
        return this.name;
    }
}
