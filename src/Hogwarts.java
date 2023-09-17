public class Hogwarts {
    private String name;
    private int spellPower;
    private int transgression;
    public Hogwarts(String name, int spellPower, int transgression) {
        this.name = name;
        this.spellPower = spellPower;
        this.transgression = transgression;
    }
    public String getName(){
        return name;
    }

    public int getSpellPower() {
        return spellPower;
    }

    public int getTransgression() {
        return transgression;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", spellPower=" + spellPower +
                ", transgression=" + transgression;
    }
    public void compareHogwarts(Hogwarts other){
        int sumThis = this.spellPower+this.transgression;
        int sumOther = other.spellPower+other.transgression;
        if (sumThis > sumOther) {
            System.out.println(this.getName() + " лучший студент чем " + other.getName());
        }
        else if (sumThis < sumOther) {
            System.out.println(other.getName() + " лучший студент чем " + this.getName());
        }
        else {
            System.out.println("Студенты " + this.getName() + " и " + other.getName() + " равны в учебе");
        }
    }
}

