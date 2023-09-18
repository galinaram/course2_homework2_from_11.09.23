public class Gryffindor  extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;
    public Gryffindor(String name, int spellPower, int transgression, int nobility, int honor, int bravery) {
        super(name, spellPower, transgression);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }

    @Override
    public String toString() {
        return super.toString() +
                " nobility " + nobility +
                ", honor " + honor +
                ", bravery " + bravery;
    }

    public void compare (Gryffindor other) {
        int sumThis = this.nobility+this.honor+this.bravery;
        int sumOther = other.nobility+other.honor+other.bravery;
        if (sumThis > sumOther) {
            System.out.println(this.getName() + " лучший студент Гриффиндора чем " + other.getName());
        }
        else if (sumThis < sumOther) {
            System.out.println(other.getName() + " лучший студент Гриффиндора чем " + this.getName());
        }
        else {
            System.out.println("Студенты " + this.getName() + " и " + other.getName() + " равны в учебе");
        }
    }
}
