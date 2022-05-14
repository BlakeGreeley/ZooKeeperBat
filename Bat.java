public class Bat extends Mammal {

    public Bat(){
        super(300);
    }

    void fly(){
        System.out.println("Time to Fly!");
        energyLevel -= 50;
        displayEnergy();
    }

    void eatHumans(){
        System.out.println("Yummy humans, fuel me up.");
        energyLevel += 25;
        displayEnergy();
    }

    void attackTown(){
        System.out.println("Attacking is tiring, i'm drained.");
        energyLevel -= 100;
        displayEnergy();
    }
}