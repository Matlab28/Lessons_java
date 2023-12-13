package Zoopark;

public class Feeder {
    String food;

    public Feeder(String food) {
        this.food = food;
    }

    public Feeder() {
    }

    public String prepareMeal(String food) {
        return this.food = food;
    }

    @Override
    public String toString() {
        return "Feeder{" + "food='" + food + '\'' + '}';
    }
}
