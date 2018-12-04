package vn.codegym.QuyenLeSy;

public class OldThread extends Thread {
    @Override
    public void run(){
        int i = 1;
        try {
            while (i<=10){
                System.out.println(i);
                i+=2;
                Thread.sleep(10);
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }

    }
}
