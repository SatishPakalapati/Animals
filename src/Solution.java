/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Win
 */
public class Solution {
      public static int scount=0; // Count variable for singing animals
    public static int wcount=0; // Count variable for walking animals
    public static int fcount=0; // Count variable for flying animals
    public static int swcount=0; //Count variable for swim animals
            
    public static void main (String[] args){
        Bird bird=new Bird();
        bird.walk();
        bird.fly();
        Bird duck=new Bird("Quack, quack"); // Passing Duck sound to the Bird Constructor
        Bird chicken=new Bird("Cluck, cluck"); // Passing Chicken sound to the Bird Constructor
        scount=duck.sing(scount);
        swcount=duck.swim(true, swcount);
        wcount=duck.walk(true,wcount);
        scount=chicken.sing(scount);
        swcount=chicken.swim(false, swcount);
        wcount=chicken.walk(true, wcount);
        Bird rooster=new Bird("Cock-a-doodle-doo");
        scount=rooster.sing(scount);
        swcount=rooster.swim(false, swcount);
        wcount=rooster.walk(true, wcount);
        Bird parrotDog=new Bird("Woof, woof", true);
        scount=parrotDog.sing(scount);
        Bird parrotCat=new Bird("Meow", true);
        scount=parrotCat.sing(scount);
        Bird parrotRooster=new Bird("Cock-a-doodle-doo", true);
        scount=parrotRooster.sing(scount);
        Bird parrotDuck=new Bird("Quack, quack", true);
        scount=parrotDuck.sing(scount);
        Bird parrotPhone=new Bird("Tring, tring", false);
        scount=parrotPhone.sing(scount);
        //Rooster speaks different languages
        Bird rooDanish=new Bird(true, "Danish");
        scount=rooDanish.sing(scount);
        Bird rooDutch=new Bird(true, "Dutch");
        scount=rooDutch.sing(scount);
        Bird rooGreek=new Bird(true, "Greek");
        scount=rooGreek.sing(scount);
        Bird rooItalian=new Bird(true, "Italian");
        scount=rooItalian.sing(scount);
        scount=bird.sing(scount);
        swcount=bird.swim(false,swcount);
        SwimmingAnimals fish=new SwimmingAnimals();
        fish.swim();
        swcount=fish.swim(true, swcount);
        SwimmingAnimals clownFish1=new SwimmingAnimals(true,false);
        clownFish1.swim();
        swcount=clownFish1.swim(true, swcount);
        SwimmingAnimals clownFish2=new SwimmingAnimals("small", "orange");
        clownFish2.swim();
        SwimmingAnimals shark1=new SwimmingAnimals(false, true);
        shark1.swim();
        swcount=shark1.swim(true, swcount);
        SwimmingAnimals shark2=new SwimmingAnimals("large", "grey");
        shark2.swim();
        SwimmingAnimals dolp=new SwimmingAnimals(true);
        dolp.swim();
        swcount=dolp.swim(true, swcount);
        
        AnimalsChangeBehaviour bfly=new AnimalsChangeBehaviour(true, false, false);
        bfly.result();
        fcount=bfly.fly(true, fcount);
        AnimalsChangeBehaviour cpillar=new AnimalsChangeBehaviour(false, true, false);
        cpillar.result();
        wcount=cpillar.walk(true, wcount);
        AnimalsChangeBehaviour unknown=new AnimalsChangeBehaviour(false, false, false);
        unknown.result();
        System.out.println("*****");
        System.out.println("Please find the count of Singing, Flying, Swimming and Walking animals:");
        System.out.println("*****");
        System.out.println("Count of singing animals: " + scount);
        System.out.println("Count of flyning animals: " + fcount);
        System.out.println("Count of swimming animals: " + swcount);
        System.out.println("Count of walking animals: " + wcount);
    }
    
}
