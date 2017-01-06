/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe318.lab6;

import java.util.ArrayList;
/**
 *
 * @author satchel
 */
public class Circuit {
    
    ArrayList<Resistor> resistors;
    private static Circuit instance =  null;
    
    public static Circuit getInstance(){
        if(instance == null){
        instance = new Circuit();
        }
        return instance;
    }
    
    private Circuit(){
        this.resistors = new ArrayList<Resistor>();
    }
    
    public void add(Resistor r){
        this.resistors.add(r);
    }
    
    @Override
    public String toString(){
        String circuit = new String();
        
        for(int i=0; i<this.resistors.size(); i++){
            circuit += this.resistors.get(i).toString() + "\n";
        }
        return(circuit);
    }
}
