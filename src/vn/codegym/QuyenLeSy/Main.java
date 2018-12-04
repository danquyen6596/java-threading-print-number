package vn.codegym.QuyenLeSy;

import sun.awt.windows.ThemeReader;

public class Main {
    public static void main(String[] args){
        OldThread oldThread = new OldThread();
        EvenThread evenThread = new EvenThread();

        Thread threadOld = new Thread(oldThread);
        Thread threadEven = new Thread(evenThread);


        threadOld.start();
        threadEven.start();

    }
}
