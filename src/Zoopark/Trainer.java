package Zoopark;

public class Trainer {

    String trick;

    public Trainer(String trick) {
        this.trick = trick;
    }

    String teachTrick(String trick) {
        return trick;
    }

    @Override
    public String toString() {
        return "Trainer{" +
                "trick='" + trick + '\'' +
                '}';
    }
}
