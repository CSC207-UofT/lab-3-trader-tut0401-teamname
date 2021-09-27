public class Dog implements Tradable, Domesticatable {
    public String name;
    public int age;
    public int averageLifespan;
    public int breed;

    @Override
    public String sound() {
        return "Bow-wow!";
    }

    public Dog(String name, int avgLifespan) {
        this.name = name;
        this.age = 1;
        this.averageLifespan = avgLifespan;
        this.breed = 20;
    }

    @Override
    public int getPrice() {
        return this.breed * (this.averageLifespan - this.age) * 100;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public int getAverageLifespan() {
        return this.averageLifespan;
    }
}
