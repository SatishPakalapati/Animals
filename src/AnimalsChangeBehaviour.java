/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Win
 */
public class AnimalsChangeBehaviour extends Bird{
    
    boolean canFly=false;
    boolean canCrawl=false;
    boolean canSing=false;
    
    AnimalsChangeBehaviour(){
        
    }
    AnimalsChangeBehaviour(boolean f, boolean c, boolean s){
        canFly=f;
        canCrawl=c;
        canSing=s;
    }
    
    void result(){
        if(canFly==true && canSing==false){
            System.out.println("I am a Butterfly... I can fly...");
        }else if(canFly==false && canCrawl==true){
            System.out.println("I am a Catter Pillar... I can Crawl...");
        }else{
            System.out.println("I am a behaviour change animal...can you provide a name for me please...");
        }
    }
    
}
