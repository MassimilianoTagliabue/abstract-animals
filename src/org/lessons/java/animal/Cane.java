package org.lessons.java.animal;

public class Cane extends AbstractAnimal{

    public Cane(String nome, float peso){
        super(nome, peso);
    }
    
    public void verso(){
        System.out.println("abbaia");
    }

    public void mangia(){
        System.out.println("carne e croccantini");
    }
}
