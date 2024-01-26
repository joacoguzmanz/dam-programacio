package Estrelles;

public class Estrelles {
    public static void main(String[] args) {
        Estrelles program = new Estrelles();
        program.inici();
    }

    public void inici() {
        estrelles(7);
        guiones(1);
        numeros(6, 5);
        estrelles(3);
        guiones(5);
        numeros(2, 3);
    }

    public void estrelles(int qty) {
        for (int i = 0; i < qty; i++) {
            System.out.print('*');
        }
        System.out.println();
    }

    public void guiones(int qty) {
        for (int i = 0; i < qty; i++) {
            System.out.print('-');
        }
        System.out.println();
    }

    public void numeros(int qty, int num) {
        for (int i = 0; i < qty; i++) {
            System.out.print(num);
        }
        System.out.println();
    }
}
