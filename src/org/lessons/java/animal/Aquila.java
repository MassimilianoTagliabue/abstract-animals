package org.lessons.java.animal;

public class Aquila extends AbstractAnimal implements IVolante{


    @Override
    public void verso(){
        System.out.println("stridio");
    }

    @Override
    public void mangia(){
        System.out.println("carne");
    }

    @Override
    public void vola(){
        System.out.println("sto volando");
    }

}
