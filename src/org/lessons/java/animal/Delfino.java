package org.lessons.java.animal;

public class Delfino extends AbstractAnimal{

        public Delfino(String nome, float peso){
            super(nome, peso);
        }

        public void verso(){
            System.out.println("frigge");
        }

        public void mangia(){
            System.out.println("pesce");
        }
}
