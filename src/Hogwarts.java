import java.util.Objects;

public abstract class Hogwarts {

    private int magicPower;
    private int distanceOfTransgression;

    public Hogwarts(int magicPower, int distanceOfTransgression) {
        this.magicPower = magicPower;
        this.distanceOfTransgression = distanceOfTransgression;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public void setMagicPower(int magicPower) {
        this.magicPower = magicPower;
    }

    public int getDistanceOfTransgression() {
        return distanceOfTransgression;
    }

    public void setDistanceOfTransgression(int distanceOfTransgression) {
        this.distanceOfTransgression = distanceOfTransgression;
    }

    public String toString() {
        return "Сила магии - " + getMagicPower() + " , дистанция трансгрессии - " + getDistanceOfTransgression();
    }

    public int sum(Hogwarts hogwarts) {
        int sum = getMagicPower() + getDistanceOfTransgression();
        ;
        return sum;

    }

    public static void compareStudents(Griffindor HarryPotter, Slytherin GregoryGoyle) {
        int sum1 = HarryPotter.sum(HarryPotter);
        int sum2 = GregoryGoyle.sum(GregoryGoyle);
        if (sum1 > sum2) {
            System.out.println("HarryPotter обладает большей мощностью магии, чем  GregoryGoyle");
        } else {
            System.out.println("GregoryGoyle обладает большей мощностью магии, чем  HarryPotter");

        }
    }
}



