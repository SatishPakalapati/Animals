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
    public String language=null;
    public boolean isRooster=false;
    Bird(){
        
    }
    Bird(String sound){     // Passing the sound property to the constuctor
        this.sound=sound;
    }
    Bird (boolean isRooster, String language){
        if(isRooster==true)
            this.language=language;
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
        
        }else if(language!=null)
        {
            if(language=="Danish"){
                System.out.println("I am a Danish Rooster and my sound is...: kykyliky");
            }else if(language=="Dutch"){
                System.out.println("I am a Dutch Rooster and my sound is...: kukeleku");
            }else if(language=="Finnish"){
                System.out.println("I am a Finnish Rooster and my sound is...: kukko kiekuu");
            }else if(language=="French"){
                System.out.println("I am a French Rooster and my sound is...:  cocorico");
            }else if(language=="German"){
                System.out.println("I am a German Rooster and my sound is...:  kikeriki");
            }else if(language=="Greek"){
                System.out.println("I am a Greek Rooster and my sound is...:  kikiriki");
            }else if(language=="Herbrew"){
                System.out.println("I am a Herbrew Rooster and my sound is...:  coo-koo-ri-koo");
            }else if(language=="Hungarian"){
                System.out.println("I am a Hungarian Rooster and my sound is...:  kukuriku");
            }else if(language=="Italian"){
                System.out.println("I am a Italian Rooster and my sound is...:  chicchirichi");
            }else if(language=="Japanese"){
                System.out.println("I am a Japanese Rooster and my sound is...:  ko-ke-kok-ko-o");
            }else if(language=="Portuguese"){
                System.out.println("I am a Portuguese Rooster and my sound is...:  cucurucu");
            }else if(language=="Russian"){
                System.out.println("I am a Russian Rooster and my sound is...:  kukareku");
            }else if(language=="Swedish"){
                System.out.println("I am a Swedish Rooster and my sound is...:  kuckeliku");
            }else if(language=="Turkish"){
                System.out.println("I am a Turkish Rooster and my sound is...:  kuk-kurri-kuuu");
            }if(language=="Urdu"){
                System.out.println("I am a Urdu Rooster and my sound is...:  kuklooku");
            }
            
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
