public class Ravenclaw extends Hogwarts{
    private int mind;
    private int wisdom;
    private int wit;
    private int creation;
    public Ravenclaw(String name, int spellPower, int transgression, int mind, int wisdom, int wit, int creation) {
        super(name, spellPower, transgression);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creation = creation;
    }

    @Override
    public String toString() {
        return super.toString()  +
                ", mind " + mind +
                ", wisdom " + wisdom +
                ", wit " + wit +
                ", creation " + creation;
    }
    public void compare (Ravenclaw other) {
        int sumThis = this.mind+this.wisdom+this.wit+this.creation;
        int sumOther = other.mind+other.wisdom+other.wit+other.creation;
        if (sumThis > sumOther) {
            System.out.println(this.getName() + " лучший студент Когтеврана чем " + other.getName());
        }
        else if (sumThis < sumOther) {
            System.out.println(other.getName() + " лучший студент Когтеврана чем " + this.getName());
        }
        else {
            System.out.println("Студенты " + this.getName() + " и " + other.getName() + " равны в учебе");
        }
    }
}
