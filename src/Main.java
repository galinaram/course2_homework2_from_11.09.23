
public class Main {
    public static void print (Hogwarts[] hogwarts) {
        System.out.println("Количество учеников: " + hogwarts.length);
        for (int i = 0; i < hogwarts.length; i++) {
            Hogwarts tmp = hogwarts[i];
            System.out.println(tmp.toString());
        }
    }
    public static void compareHogwarts(Hogwarts[] hogwarts, int i, int j) {
        Hogwarts tmp1 = hogwarts[i];
        Hogwarts tmp2 = hogwarts[j];
        tmp1.compare(tmp2);
    }
    public static void compareGryffindor(Gryffindor tmp1, Gryffindor tmp2){
        tmp1.compare(tmp2);
    }
    public static void compareSlytherin(Slytherin tmp1, Slytherin tmp2){
        tmp1.compare(tmp2);
    }
    public static void compareHufflepuff(Hufflepuff tmp1, Hufflepuff tmp2){
        tmp1.compare(tmp2);
    }
    public static void compareRavenclaw(Ravenclaw tmp1, Ravenclaw tmp2) {
        tmp1.compare(tmp2);
    }
    public static void main(String[] args) {
        Hogwarts[] students = new Hogwarts[] {
            new Gryffindor("Гарри Поттер", 23, 34, 98, 57, 42),
            new Gryffindor("Гермиона Грейнджер", 56, 13, 57, 83, 24),
            new Gryffindor("Рон Уизли", 24, 41, 48, 79, 60),

                new Slytherin("Драко Малфой", 35,12,43,65,32,53,75),
                new Slytherin("Грэхэм Монтегю", 23,46,87,98,54,12,45),
                new Slytherin("Грегори Гойл",75,38,90,42,41,64,35),

                new Hufflepuff("Захария Смит", 45, 75, 25, 65, 73),
                new Hufflepuff("Седрик Диггори", 79, 48, 70, 25, 32),
                new Hufflepuff("Джастин Финч-Флетчли", 98, 35, 62, 84, 23),

                new Ravenclaw("Чжоу Чанг", 68, 52, 70, 46, 23, 24),
                new Ravenclaw("Падма Патил", 70, 47, 86, 32, 13,53),
                new Ravenclaw("Маркус Белби", 49, 29, 40,21,43,29)


        };
        print(students);


        System.out.println("========= Сравнение студентов ==========");
        compareHogwarts(students, 1, 4);
        compareHogwarts(students, 0, 3);
        compareHogwarts(students, 8, 6);
        System.out.println("========= Сравнение студентов Гриффиндора ========");
        compareGryffindor((Gryffindor) students[0], (Gryffindor) students[2]);
        compareGryffindor((Gryffindor) students[1], (Gryffindor) students[2]);
        System.out.println("========= Сравнение студентов Слизерина ========");
        compareSlytherin((Slytherin) students[3], (Slytherin) students[5]);
        compareSlytherin((Slytherin) students[4], (Slytherin) students[5]);
        System.out.println("========= Сравнение студентов Пуффендуя ========");
        compareHufflepuff((Hufflepuff) students[6], (Hufflepuff) students[8]);
        compareHufflepuff((Hufflepuff) students[7], (Hufflepuff) students[8]);
        System.out.println("========= Сравнение студентов Когтеврана ========");
        compareRavenclaw((Ravenclaw) students[9], (Ravenclaw) students[11]);
        compareRavenclaw((Ravenclaw) students[10], (Ravenclaw) students[11]);

    }
    }