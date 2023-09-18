public class PrintService {
    public static void printHogwarts (Hogwarts[] hogwarts) {
        System.out.println("Количество учеников: " + hogwarts.length);
        for (int i = 0; i < hogwarts.length; i++) {
            Hogwarts tmp = hogwarts[i];
            System.out.println("Имя: " + tmp.getName());
        }
    }
}
