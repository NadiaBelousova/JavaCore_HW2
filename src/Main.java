

public class Main {
    public static void main(String[] args) {

        Griffindor HermioneGranger = new Griffindor(100, 100, 99, 90, 88);
        Griffindor RonWeasley = new Griffindor(50, 50, 70, 70, 90);
        Griffindor HarryPotter = new Griffindor(80, 80, 100, 100, 100);
        Slytherin DracoMalfoy = new Slytherin(60, 70, 100, 100, 100, 100,100);
        Slytherin GrahamMontague = new Slytherin(30,30,50,50,50,50,50);
        Slytherin GregoryGoyle = new Slytherin(20, 20, 50, 50, 50, 50, 50);
        Hufflepuff ZacharianSmith=new Hufflepuff(20,20,50,30,30);
        Hufflepuff CedricDiggory = new Hufflepuff(100, 100, 100, 100, 100);
        Hufflepuff JustinFinchFletchley= new Hufflepuff(30,30,40,50,50);
        Ravenclaw ZhouChang = new Ravenclaw(60, 100, 20, 20, 50, 80);
        Ravenclaw PadmaPatil = new Ravenclaw(40, 40, 40, 40, 40,40);
        Ravenclaw MarcusBelby = new Ravenclaw(30, 30, 30, 30, 30, 30);

        System.out.println("HarryPotter: "+HarryPotter.toString());
        System.out.println("DracoMalfoy: "+DracoMalfoy.toString());
        System.out.println("MarcusBelby: "+MarcusBelby.toString());
        Griffindor.compare(HermioneGranger,RonWeasley);
        Hufflepuff.compare(CedricDiggory,ZacharianSmith);
        Ravenclaw.compare(PadmaPatil,ZhouChang);
        Slytherin.compare(GregoryGoyle,GrahamMontague);
        Hogwarts.compareStudents(HarryPotter,GregoryGoyle);

    }


    }


