package UF2.EstudiantCurs;

import Toolkit.UsersUtil;

public class Course {
    public int getCredits() {
        return UsersUtil.getIntFromUser("Ingrese la cantidad de créditos", "Ingrese un numero");
    }

    public void showInfo(String name, int credits) {
        System.out.println("El curso es " + name + " y tiene " + credits + " créditos");
    }

    public int getHours(int credits) {
        return 15 * credits;
    }
}
