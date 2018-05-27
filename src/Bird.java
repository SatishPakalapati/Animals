/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Win
 */
public class Bird extends Animal{
    
    public String sound=""; // Created a property for the sound
    Bird(){
        
    }
    Bird(String sound){     // Passing the sound property to the constuctor
        this.sound=sound;
    }
       
    void fly(){
    System.out.println("I am Flying...");
    }
    void sing(){
        if(sound=="Quack, quack"){
            System.out.println("I am a Duck and my sound is...: Quack, quack");
        }else if(sound=="Cluck, cluck"){
        System.out.println("I am a Chicken and my sound is...: Cluck, cluck");
        
        }else if(sound=="Cock-a-doodle-doo"){
            System.out.println("I am a Rooster and my sound is...: Cock-a-doodle-doo");
        }else{
            System.out.println("I am a bird... I am Singing...");
        }
    }
    
}
