/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Win
 */
//Created new class for Swiming Animals that extends Animal class
public class SwimmingAnimals extends Animal{
    
    boolean jokes=false;
    boolean eatOtherFishes=false;
    boolean canWalk=false;
    String size=null;
    String colour;
    
    SwimmingAnimals(){
        
    }
    SwimmingAnimals(boolean w){
        canWalk=w;
    }
    
    SwimmingAnimals(boolean j, boolean eat){
        jokes=j;
        eatOtherFishes=eat;
    }
    SwimmingAnimals(String s, String c){
        size=s;
        colour=c;
    }
    
    void swim(){
        if(jokes==true){
            System.out.println("I am a clownfish and I can make jokes");
        }else if(eatOtherFishes==true){
            System.out.println("I am a Shark and I eat other fishes");
        }else if(size!=null && colour!=null){
            if(size=="large" && colour=="grey"){
                System.out.println("I am a shark... I am large in size and grey in colour...");
            }else if(size=="small" && colour=="orange"){
                System.out.println("I am a clownfish... I am small in size and orange in colour...");
            }
        }else if(canWalk==true){
            System.out.println("I am a Dolphine... I can swim and walk... ");
        }else{  
        System.out.println("I am a Fish... I am swimming");
        }
    }
    
}
