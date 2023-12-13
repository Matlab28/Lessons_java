package Buildings;

import Buildings.Person;

public class ApartmentManagement {
    public static void main(String[] args) {
        Person persons = new Person();

        persons.id = 1256;
        persons.age = 18;
        persons.name = "Matlab";
        persons.surname = "Abbaszada";
        persons.numberOfFamilies = 1;
        persons.profession = "Developer";

        Building building = new Building();

        building.buildingName = "Yeni Heyat";
        building.buildingNumber = 256;
        building.id = 1512;
        building.apartmentNumber = 1249;
        building.countOfFloor = 13;
        building.mortgage = 25;
        building.person= persons;

//        persons.building = building;

        System.out.println(persons);
        System.out.println(building);


    }
}
