package org.lessons.java.animal;

public class main {
    public static void main(String[] args) {
        
        Cane cane = new Cane();
        Delfino delfino = new Delfino();
        Aquila aquila = new Aquila();
        Passerotto passerotto = new Passerotto();


        cane.verso();
        cane.mangia();
        System.out.println("--------");
        delfino.verso();
        delfino.mangia();
        faiNuotare(delfino);
        System.out.println("--------");
        aquila.verso();
        aquila.mangia();
        faiVolare(aquila);
        System.out.println("--------");
        passerotto.verso();
        passerotto.mangia();
        faiVolare(passerotto);

        
    }

    static void faiVolare(IVolante animale){
        animale.vola();
    }

    static void faiNuotare(INuotante animale){
        animale.nuota();
    }

}
