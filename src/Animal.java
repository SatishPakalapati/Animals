/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Win
 */
public class Animal {
    void walk(){
        System.out.println("I am Walking...");
       
    }
    
    int swim(boolean sw, int swcount){ // this method is used to generate the count for Swimming Animals
        if(sw==true){
            swcount++;
            return swcount;
        }else{
            return swcount;
        }
    }
    
    int walk(boolean w, int wcount){
        if(w==true){
            wcount++;
        return wcount;
        }else{
            return wcount;
        }
    }  
        int fly(boolean f, int fcount){
        if(f==true){
            fcount++;
            return fcount;
        }else{
            return fcount;
        }
    }
}
