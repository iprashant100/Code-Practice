package Concepts;

public class Singleton {
Animal anima = Animal.getInstanceOfANimal();
    
}


class Animal{

    public static Animal animal = new Animal();

    private Animal(){};

    public static Animal getInstanceOfANimal(){
        return animal;
    }
}