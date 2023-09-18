public class Ravenclaw extends Hogwarts {
    private int intelligence;
    private int wisdom;
    private int wit;
    private int creativity;


    public Ravenclaw(int magicPower, int distanceOfTransgression, int intelligence, int wisdom, int wit, int creativity) {
        super(magicPower, distanceOfTransgression);
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }
    public String toString() {
        return "Сила магии - " + getMagicPower() + " , дистанция трансгрессии - " + getDistanceOfTransgression() + ", очки интеллекта- " + getIntelligence() + ", очки мудрости - " + getWisdom() + ", очки остроумия - " + getWit() + ", очки креативности - " + getCreativity();
    }
    private int sum(Ravenclaw ravenclaw) {
        return getCreativity()+getWit()+getWisdom()+getIntelligence();

    }

    public void compare(Ravenclaw ZhouChang, Ravenclaw PadmaPatil) {
        int sum1 = ZhouChang.sum(ZhouChang);
        int sum2 = PadmaPatil.sum(PadmaPatil);
        if (sum1 > sum2) {
            System.out.println("ZhouChang лучший когтевранец, чем  PadmaPatil");
        } else {
            System.out.println("PadmaPatil лучший когтевранец, чем  ZhouChang");

        }
    }
}


