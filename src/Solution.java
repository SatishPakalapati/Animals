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
      public static void main (String[] args){
        Bird bird=new Bird();
        bird.walk();
        bird.fly();
        Bird duck=new Bird("Quack, quack"); // Passing Duck sound to the Bird Constructor
        Bird chicken=new Bird("Cluck, cluck"); // Passing Chicken sound to the Bird Constructor
        duck.sing();
        chicken.sing();
        Bird rooster=new Bird("Cock-a-doodle-doo");
        rooster.sing();
        bird.sing();
    }
    
}
