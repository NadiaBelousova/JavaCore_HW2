public class Hufflepuff extends Hogwarts {
    private int hardWork;
    private int loyalty;
    private int honesty;


    public Hufflepuff(int magicPower, int distanceOfTransgression, int hardWork, int loyalty, int honesty) {
        super(magicPower, distanceOfTransgression);
        this.hardWork = hardWork;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getHardWork() {
        return hardWork;
    }

    public void setHardWork(int hardWork) {
        this.hardWork = hardWork;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    public String toString() {
        return "Сила магии - " + getMagicPower() + " , дистанция трансгрессии - " + getDistanceOfTransgression() + ", очки трудолюбия - " + getHardWork() + ", очки верности - " + getLoyalty() + ", очки честности - " + getHonesty();
    }
    private int sum(Hufflepuff hufflepuff) {
        return getHardWork()+getHonesty()+getLoyalty();

    }

    public  void compare(Hufflepuff CedricDiggory, Hufflepuff ZacharianSmith) {
        int sum1 = CedricDiggory.sum(CedricDiggory);
        int sum2 = ZacharianSmith.sum(ZacharianSmith);
        if (sum1 > sum2) {
            System.out.println("CedricDiggory лучший пуффендуец, чем  ZacharianSmith");
        } else {
            System.out.println("ZacharianSmith лучший пуффендуец, чем  CedricDiggory");

        }
    }
}


