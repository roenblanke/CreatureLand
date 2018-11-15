package objectori;

public class Creature {

    //public member variables
    public String name;
    public String species;
    public boolean hairy;
    public double weight;
    public double height;

    //private member variables
    private int biteSizeInPercent;
    private int minDonutSize;
    

    //method to simulate eating Donut
    public void eatDonut(SizedDonut donutToEat) {
        donutToEat.simulateEating(biteSizeInPercent);
    }//close eatDonut method

    //getter method for biteSizeInPercent
    public int getBiteSizeInPercent() {
        return biteSizeInPercent;
    }//close getter method
    
    //get minDonutSize
    public int getMinDonutSize (){
        return minDonutSize;
    }//close getter method

    //setter method for biteSizeInPercent
    public void setBiteSizeInPercent(int size) {
        if(size > 0 && size < 101){
        biteSizeInPercent = size;
        } else if(size >= 101){
            System.out.println("bite size cannot be greater than 100");
        } else {
            System.out.println("bite size cannot be less than 1");
        }//close else if chain
    }//close setter method
    
    //set minDonutSize
    public void setMinDonutSize(int size){
        if(size > 0){
            minDonutSize = size;
        } else {
            System.out.println("min donut size must be greater than 0");
        }//close else if
    }//close method
}//close class
