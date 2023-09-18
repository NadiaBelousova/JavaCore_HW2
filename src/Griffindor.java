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

    private int sum(Griffindor griffindors) {
        return getBravery() + getHonor() + getNobility();

    }

    public static void compare(Griffindor HermioneGranger, Griffindor RonWeasley) {
        int sum1 = HermioneGranger.sum(HermioneGranger);
        int sum2 = RonWeasley.sum(RonWeasley);
        if (sum1 > sum2) {
            System.out.println("HermioneGranger лучший гриффиндорец, чем  RonWeasley");
        } else {
            System.out.println("RonWeasley лучший гриффиндорец, чем  HermioneGranger");

        }
    }


}


