package objectori;

public class CreatureLand {

    public static void main(String[] args) {
        //instantiate a new Creature object    
        Creature toshi = new Creature();
        toshi.name = "Jacko";
        toshi.species = "Toshi";
        toshi.weight = 12.39;
        toshi.height = 14.20;
        toshi.setBiteSizeInPercent(2);
        toshi.setMinDonutSize(90);

        //instantiating a new SizedDonut object 
        SizedDonut redDonut = new SizedDonut();
        redDonut.sizeInMm = 104;
        redDonut.frosting = true;
        redDonut.frostingColor = "blue";
        redDonut.name = "Francis";

        //simulate the toshi eating 2% of the redDonut
        toshi.eatDonut(redDonut);

        //now get the bite size as a precnt of the total donut and print it
        printCreatureMemVars(toshi);

        //get the percent remaining of the donut after being eaten
        printDonutMemVars(redDonut);

    }//close main method

    public static void printDonutMemVars(SizedDonut donut) {
        System.out.println("*****" + donut.name.toUpperCase() + " STATS*****");
        System.out.println("This donut is called " + donut.name);
        System.out.println(donut.name + " has " + donut.getPercRemaining() + "% remaining");
        System.out.println("It is " + donut.frosting + " that " + donut.name + " has frosting");
        System.out.println("The color of the frsoting is " + donut.frostingColor);
        System.out.println(donut.name + " is " + donut.sizeInMm + "mm in diameter");
        System.out.println("************************");
        System.out.println();
    }//close method

    public static void printCreatureMemVars(Creature creature) {
        System.out.println("*****" + creature.name.toUpperCase() + " STATS*****");
        System.out.println("This creature's name is " + creature.name);
        System.out.println(creature.name + " has taken " + creature.getBiteSizeInPercent() + "% out of the donut");
        System.out.println(creature.name + " is a " + creature.species);
        System.out.println("It is " + creature.hairy + " that " + creature.name + " is hairy");
        System.out.println(creature.name + " weighs " + creature.weight + "lbs");
        System.out.println(creature.name + " is " + creature.height + "in. tall");
        System.out.println("************************");
        System.out.println();
    }//close method
}//close class
