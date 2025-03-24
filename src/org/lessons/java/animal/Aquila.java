package org.lessons.java.animal;

public class Aquila extends AbstractAnimal{

    public Aquila(String nome, float peso){
        super(nome, peso);
    }

    public void verso(){
        System.out.println("stridio");
    }

    public void mangia(){
        System.out.println("carne");
    }

}
