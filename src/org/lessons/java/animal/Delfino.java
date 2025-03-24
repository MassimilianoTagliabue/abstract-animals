package org.lessons.java.animal;

public class Delfino extends AbstractAnimal implements INuotante{

        @Override
        public void verso(){
            System.out.println("frigge");
        }

        @Override
        public void mangia(){
            System.out.println("pesce");
        }

        @Override
        public void nuota(){
            System.out.println("sto nuotando");
        }
}
