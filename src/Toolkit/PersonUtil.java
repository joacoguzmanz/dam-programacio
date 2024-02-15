package Toolkit;

public class PersonUtil {
    public static int getAge() {
        int age = UsersUtil.getIntFromUser("Ingrese la edad", "Ingrese un numero");
        while (age <= 0) {
            age = UsersUtil.getIntFromUser("La edad tiene que ser mayor a 0", "Ingrese un numero");
        }
        return age;
    }

    public static boolean isAdult(int age) {
        return age >= 18;
    }
}
