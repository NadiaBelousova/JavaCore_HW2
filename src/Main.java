

public class Main {
    public static void main(String[] args) {

        Griffindor hermioneGranger = new Griffindor(100, 100, 99, 90, 88);
        Griffindor ronWeasley = new Griffindor(50, 50, 70, 70, 90);
        Griffindor harryPotter = new Griffindor(80, 80, 100, 100, 100);
        Slytherin dracoMalfoy = new Slytherin(60, 70, 100, 100, 100, 100,100);
        Slytherin grahamMontague = new Slytherin(30,30,50,50,50,50,50);
        Slytherin gregoryGoyle = new Slytherin(20, 20, 50, 50, 50, 50, 50);
        Hufflepuff zacharianSmith=new Hufflepuff(20,20,50,30,30);
        Hufflepuff cedricDiggory = new Hufflepuff(100, 100, 100, 100, 100);
        Hufflepuff justinFinchFletchley= new Hufflepuff(30,30,40,50,50);
        Ravenclaw zhouChang = new Ravenclaw(60, 100, 20, 20, 50, 80);
        Ravenclaw padmaPatil = new Ravenclaw(40, 40, 40, 40, 40,40);
        Ravenclaw marcusBelby = new Ravenclaw(30, 30, 30, 30, 30, 30);


        System.out.println("HarryPotter: "+harryPotter.toString());
        System.out.println("DracoMalfoy: "+dracoMalfoy.toString());
        System.out.println("MarcusBelby: "+marcusBelby.toString());
        hermioneGranger.compare(ronWeasley);
        cedricDiggory.compare(zacharianSmith);
        padmaPatil.compare(zhouChang);
        gregoryGoyle.compare(grahamMontague);
        harryPotter.compareStudents(gregoryGoyle);

    }


    }


