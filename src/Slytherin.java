public class Slytherin extends Hogwarts{
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulnes;
    private int lustForPower;
    public Slytherin(String name, int spellPower, int transgression, int cunning, int determination, int ambition, int resourcefulnes, int lustForPower) {
        super(name, spellPower, transgression);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulnes = resourcefulnes;
        this.lustForPower = lustForPower;
    }

    @Override
    public String toString() {
        return super.toString() + " Slytherin{" +
                "cunning=" + cunning +
                ", determination=" + determination +
                ", ambition=" + ambition +
                ", resourcefulnes=" + resourcefulnes +
                ", lustForPower=" + lustForPower +
                '}';
    }

    public void compare (Slytherin other) {
        int sumThis = this.cunning+this.determination+this.ambition+this.resourcefulnes+this.lustForPower;
        int sumOther = other.cunning+other.determination+other.ambition+other.resourcefulnes+other.lustForPower;
        if (sumThis > sumOther) {
            System.out.println(this.getName() + " лучший студент Слизерина чем " + other.getName());
        }
        else if (sumThis < sumOther) {
            System.out.println(other.getName() + " лучший студент Слизерина чем " + this.getName());
        }
        else {
            System.out.println("Студенты " + this.getName() + " и " + other.getName() + " равны в учебе");
        }
    }
}
