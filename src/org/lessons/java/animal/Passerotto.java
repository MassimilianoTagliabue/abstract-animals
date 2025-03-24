package org.lessons.java.animal;

public class Passerotto extends AbstractAnimal implements IVolante{

    
    @Override
    public void verso(){
        System.out.println("cinguetta");
    }

    @Override
    public void mangia(){
        System.out.println("semi");
    }

    @Override
    public void vola(){
        System.out.println("sto volando");
    }
}
