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
    public Boolean isParrotStayingWithOtherAnimal=null;
    Bird(){
        
    }
    Bird(String sound){     // Passing the sound property to the constuctor
        this.sound=sound;
    }
    
    Bird(String sound, Boolean paStWiOtAn){ //two args onstructor to check whether the parrot is staying with any other animal and the sound of the animal
        this.sound=sound;
        this.isParrotStayingWithOtherAnimal=paStWiOtAn;
    }
       
    void fly(){
    System.out.println("I am Flying...");
    }
    int sing(int s){
        try{
         if(isParrotStayingWithOtherAnimal!=null && isParrotStayingWithOtherAnimal==true){
            if(sound=="Woof, woof"){
                System.out.println(" I am a Parrot, staying with Dog and my sound is : " + sound);
                s++;
                System.out.println(s);
            }else if(sound=="Meow"){
                System.out.println(" I am a Parrot, staying with Cat and my sound is : " + sound);
                s++;
                System.out.println(s);
            }else if(sound=="Cock-a-doodle-doo"){
                System.out.println(" I am a Parrot, staying with Rooster and my sound is : " + sound);
                s++;
            }else if(sound=="Quack, quack"){
                System.out.println(" I am a Parrot, staying with Duck and my sound is : " + sound);
                s++;
            }
        }else if(isParrotStayingWithOtherAnimal!=null && isParrotStayingWithOtherAnimal==false){
            System.out.println("I am a Parrot staying with Phone and my sound is : " + sound);
            s++;
        }
        else if(sound=="Quack, quack"){
            System.out.println("I am a Duck and my sound is...: Quack, quack");
            s++;
        }else if(sound=="Cluck, cluck"){
        System.out.println("I am a Chicken and my sound is...: Cluck, cluck");
        s++;
        
        }else if(sound=="Cock-a-doodle-doo"){
            System.out.println("I am a Rooster and my sound is...: Cock-a-doodle-doo");
            s++;
        }else{
            System.out.println("I am a bird... I am Singing...");
            s++;
        }
        }finally{return s;} // this finally block is used to return the count of Singing animals.
    }
    
}
