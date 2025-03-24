package org.lessons.java.animal;

public class Passerotto extends AbstractAnimal{

    public Passerotto(String nome, float peso){
        super(nome, peso);
    }

    public void verso(){
        System.out.println("cinguetta");
    }

    public void mangia(){
        System.out.println("semi");
    }
}
