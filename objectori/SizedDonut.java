/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectori;

/**
 *
 * @author roen.blanke
 */
public class SizedDonut {

    //member variables
    private int percRemaining = 100;
    public String name;
    public boolean frosting;
    public String frostingColor;
    public int sizeInMm;

    public void simulateEating(int percEaten) {
        if(percEaten < 0 && percEaten < 101){
            percRemaining = percRemaining - percEaten;
            System.out.println("eating donut . . .");
        } else if(percEaten > 101){
            System.out.println("percent eaten cannot be greater than 100");
        } else {
            System.out.println("percent eaten cannot be less than 100");
        }//close if else
    }//close method

    public int getPercRemaining() {
        return percRemaining;
    }//close method
}
