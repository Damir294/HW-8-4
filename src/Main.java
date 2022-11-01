public class Main {
    public static void main(String[] args) {
        byte  a=16;
        byte b=2; //Минуты
        byte y= 20;// Минуты
        byte c = 24;  // Сутки
        int i= 4320; // 3 дня
        int e = a / b;
        int q= 60; // час
        int r= e*q;
        int t=  r*c;
        int u= e*y;
        int p= i*e;
        System.out.println("За 20 минут машина произвела бутылок "+ u);
        System.out.println("За час  машина произвела бутылок "+ r);
        System.out.println("За сутки  машина произвела бутылок " + t);
        System.out.println("За 3 дня  машина произвела бутылок "+ p);
    }
}