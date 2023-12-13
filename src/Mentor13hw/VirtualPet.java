package Mentor13hw;

public class VirtualPet {
    public int hungerLevel;
    public int happinessLevel;
    private String name;

    static  int count;


    public VirtualPet() {
    }

    public VirtualPet(int hungerLevel, int happinessLevel, String name) {
        this.hungerLevel = hungerLevel;
        this.happinessLevel = happinessLevel;
        this.name = name;
        count++;
    }

    public void feed() {
         happinessLevel += 10;
         hungerLevel -= 5;
    }

    public void play() {

        System.out.println(happinessLevel += 10);
        System.out.println(hungerLevel -= 5);
    }

    @Override
    public String toString() {
        return "VirtualPet{" +
                "hungerLevel=" + hungerLevel +
                ", happinessLevel=" + happinessLevel +
                ", name='" + name + '\'' +
                '}';
    }

    public int getHungerLevel() {
        return hungerLevel;
    }

    public void setHungerLevel(int hungerLevel) {
        this.hungerLevel = hungerLevel;
    }

    public int getHappinessLevel() {
        return happinessLevel;
    }

    public void setHappinessLevel(int happinessLevel) {
        this.happinessLevel = happinessLevel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
