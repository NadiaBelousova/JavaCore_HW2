public class Slytherin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int thirstForPower;


    public Slytherin(int magicPower, int distanceOfTransgression, int cunning, int determination, int ambition, int resourcefulness, int thirstForPower) {
        super(magicPower, distanceOfTransgression);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstForPower = thirstForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getThirstForPower() {
        return thirstForPower;
    }

    public void setThirstForPower(int thirstForPower) {
        this.thirstForPower = thirstForPower;
    }

    public String toString() {
        return "Сила магии - " + getMagicPower() + " , дистанция трансгрессии - " + getDistanceOfTransgression() + ", очки хитрости - " + getCunning() + ", очки решительности - " + getDetermination() + ", очки амбициозности - " + getAmbition() + ", очки находчивости - " + getResourcefulness() + ", очки жажды власти - " + getThirstForPower();
    }

    private int sum(Slytherin slytherin) {
        return getThirstForPower() + getCunning() + getResourcefulness() + getAmbition() + getDetermination();

    }

    public static void compare(Slytherin GregoryGoyle, Slytherin GrahamMontague) {
        int sum1 = GregoryGoyle.sum(GregoryGoyle);
        int sum2 = GrahamMontague.sum(GrahamMontague);
        if (sum1 > sum2) {
            System.out.println("GregoryGoyle лучший слизеринец, чем  GrahamMontague");
        } else {
            System.out.println("GrahamMontague лучший слизеринец, чем  GregoryGoyle");

        }
    }
}



