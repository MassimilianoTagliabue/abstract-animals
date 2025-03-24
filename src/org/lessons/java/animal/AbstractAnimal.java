package org.lessons.java.animal;

public abstract class AbstractAnimal {

    String nome;
    float peso;

    public AbstractAnimal(String nome, float peso){
        this.nome = nome;
        this.peso = peso;

    }

    public void dormi(){
        System.out.println("Zzzz");
    }

    abstract void verso();

    abstract void mangia();
}
