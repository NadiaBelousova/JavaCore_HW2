public class Griffindor extends Hogwarts {
    private int bravery;
    private int honor;
    private int nobility;


    public Griffindor(int magicPower, int distanceOfTransgression, int bravery, int honor, int nobility) {
        super(magicPower, distanceOfTransgression);
        this.bravery = bravery;
        this.honor = honor;
        this.nobility = nobility;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public String toString() {
        return "Сила магии - " + getMagicPower() + " , дистанция трансгрессии - " + getDistanceOfTransgression() + ", Очки храбрости - " + getBravery() + ", Очки чести - " + getHonor() + ", Очки благородства - " + getNobility();
    }

    public int sumGriffindor () {
        return getBravery() + getHonor() + getNobility();

    }

    public void compare(Griffindor ronWeasley) {
        int sum1 = this.sumGriffindor();
        int sum2 = ronWeasley.sumGriffindor();
        if (sum1 > sum2) {
            System.out.println("HermioneGranger лучший гриффиндорец, чем  RonWeasley");
        } else {
            System.out.println("RonWeasley лучший гриффиндорец, чем  HermioneGranger");

        }
    }
}


