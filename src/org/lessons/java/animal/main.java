package org.lessons.java.animal;

public class main {
    public static void main(String[] args) {
        
        Cane cane = new Cane("cane", 5.3f);
        Delfino delfino = new Delfino("delfino", 50.5f);
        Aquila aquila = new Aquila("aquila", 10.4f);
        Passerotto passerotto = new Passerotto("passerotto", 1.3f);


        cane.verso();
        cane.mangia();
        System.out.println("--------");
        delfino.verso();
        delfino.mangia();
        System.out.println("--------");
        aquila.verso();
        aquila.mangia();
        System.out.println("--------");
        passerotto.verso();
        passerotto.mangia();
       
    }

}
