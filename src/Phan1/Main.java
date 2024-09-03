package Phan1;

public class Main{
    public static void main(String[] args) {
        Bikini b1 = new Bikini();
        Dress d1=new Dress();
        Girl g1=new Girl(b1);
        g1.show();
    }
}