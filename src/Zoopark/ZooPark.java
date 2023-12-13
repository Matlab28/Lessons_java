package Zoopark;

public class ZooPark {
    public static void main(String[] args) {
        Animal animal = new Animal("Rabbit", "Europen rabbit,", 9);
        Feeder feeder = new Feeder();
        feeder.prepareMeal("Grass");
        System.out.println(feeder);
        Trainer trainer = new Trainer("Jump on barrier");
        trainer.teachTrick("Jump on barrier");
        System.out.println(animal);
        System.out.println(trainer);
    }
}
