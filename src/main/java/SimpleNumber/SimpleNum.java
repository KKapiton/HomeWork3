package SimpleNumber;

class Simple {
    public static void main(String args[]) {
        int i;
        int g;
        int Simple;

        for (i = 2; i <=100; i++) {
            Simple = 0;
            for (g = 1; g <= i; g++) {
                if (i % g == 0) Simple++;
            }
            if (Simple == 2)
                System.out.println("Простое число - " + i);
        }
    }
}