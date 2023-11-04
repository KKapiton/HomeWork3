package Buckweat;

public class Buckweat {
    public static void main(String[] args) {
        int Month = 0;  //количество месяцец с гречей
        int Price = 100;
        int Cost = 0;

        for (int g = 100; g > 0; g -=6, Month++) {
            Cost = Cost + (g * Price);
        }
            System.out.println("Количество месяцев = " + Month);
            System.out.println("Цена = " + Cost);
        }
    }