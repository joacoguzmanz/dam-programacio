package UF2.EstudiantCurs;

import Toolkit.PersonUtil;
import Toolkit.UsersUtil;

public class Student {
    public int getAge() {
         return PersonUtil.getAge();
    }

    public String getName() {
        return UsersUtil.getStringFromUser("Ingrese el nombre", "Solo ingrese letras");
    }

    public void showInfo(String name, int age) {
        System.out.println("El nombre es " + name + " y tiene " + age + "años");
    }

    public boolean isOverEighteen(int age) {
        return age >= 18;
    }

    public void greet(String name) {
        System.out.println("Hola " + name);
    }
}
