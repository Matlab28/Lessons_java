package Buildings;

public class Building {
    int id;
    String buildingName;
    int buildingNumber;
    int countOfFloor;
    int apartmentNumber;
    int mortgage;

    Person person;


    @Override
    public String toString() {
        return "Building{" +
                "id=" + id +
                ", buildingName='" + buildingName + '\'' +
                ", buildingNumber=" + buildingNumber +
                ", countOfFloor=" + countOfFloor +
                ", apartmentNumber=" + apartmentNumber +
                ", mortgage=" + mortgage +
                ", person=" + person +
                '}';
    }
}

