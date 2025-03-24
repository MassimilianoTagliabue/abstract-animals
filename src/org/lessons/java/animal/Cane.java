package org.lessons.java.animal;

public class Cane extends AbstractAnimal{

    @Override
    public void verso(){
        System.out.println("abbaia");
    }

    @Override
    public void mangia(){
        System.out.println("carne e croccantini");
    }
}
