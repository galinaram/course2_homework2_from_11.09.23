public class Hufflepuff extends Hogwarts {
    private int hardWork;
    private int loyalty;
    private int honesty;
    public Hufflepuff(String name, int spellPower, int transgression, int hardWork, int loyalty, int honesty) {
        super(name, spellPower, transgression);
        this.hardWork = hardWork;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", hardWork " + hardWork +
                ", loyalty " + loyalty +
                ", honesty " + honesty;
    }
    public void compare (Hufflepuff other) {
        int sumThis = this.hardWork+this.loyalty+this.honesty;
        int sumOther = other.hardWork+other.loyalty+other.honesty;
        if (sumThis > sumOther) {
            System.out.println(this.getName() + " лучший студент Пуффендуя чем " + other.getName());
        }
        else if (sumThis < sumOther) {
            System.out.println(other.getName() + " лучший студент Пуффендуя чем " + this.getName());
        }
        else {
            System.out.println("Студенты " + this.getName() + " и " + other.getName() + " равны в учебе");
        }
    }
}
