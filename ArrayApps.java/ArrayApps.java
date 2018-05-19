
/**
 * Program 1 | ArrayApps.java
 * 
 * @author Will Luttmann 
 * 
 */
import java.util.Scanner; //import scanner utility to read user input


public class ArrayApps
{
       /**
    A method to print out the elements in an array, separated by ``|''
    @param values, an array of integers
    @param size, the actual number in array ``values''
    */
    public static void printArray(int [] values, int size)
    {
        for (int i = 0; i < size; i++){
            System.out.print(values[i]);//prints the number
            if(i < size - 1){
                System.out.print("|");//prints | to separate numbers
            }
        }
        System.out.println();
    }
    
        /**
    A method to triple all the elements in an array
    @param values, an array of integers
    @param size, the actual number in array ``values''
    */
    public static void tripleArray(int [] values, int size)
    {
        for (int i = 0; i < size; i++){
            values[i] = values[i] * 3;// sets index value to 3x current value
        }
    }
    
        /**
    A method to reverse all the elements in an array.
    @param values, an array of integers
    @param size, the actual number in array ``values''
    */
    public static void reverseElements(int [] values, int size)
    {
        for (int i = 0; i < size / 2; i++){
          int temp = values[i]; 
          values[i] = values[size - 1 - i]; //swap first and last elements
          values[size - 1 - i] = temp;
        }
    }
    
        /**
    A method to swap middle elements in an array.
    For an array of odd length, you don't need to swap.
    For an array of even length, there are TWO middle values, so swap.
    @param values, an array of integers
    @param size, the actual number in array ``values''
    */
    public static void swapMiddleElements(int [] values, int size)
    {
            if (size % 2 == 0){
                int middle = (size / 2) - 1; //get middle element
                int temp = values[middle];
                
                values[middle] = values[middle + 1]; // swap elements
                values[middle + 1] = temp;

            }
    }
    
    public static void main(){
      String letter; //string to loop program  
        
      do{
          int [] values = new int [100];   //declares a new array called values
          int number; //this is the number you will store
          int size = 0; //this will count the number of values entered
            
          System.out.println("Please enter values, Q to quit:");    //user input
          Scanner input = new Scanner(System.in);
     
             while (input.hasNextInt())// while there is a next number keep going
             {  
                number = input.nextInt();
                size++;
                values[size - 1] = number;//stores number in the next index of values
             }
              
             System.out.println(); //make a space between input
             System.out.print("Original Array: ");
             printArray(values, size); //calls and prints the arraylist
             
             tripleArray(values, size);//calls tripleArray method
             System.out.print("Triple Array: ");
             printArray(values, size);
             
             reverseElements(values, size);//calls reverseArray method
             System.out.print("Reversed Array: ");
             printArray(values, size);
              
             swapMiddleElements(values, size); //calls swapMiddleElements method
             System.out.print("Middle elements swapped: ");
             printArray(values, size);
              
             
             System.out.println();
             System.out.print("Try it again? (y/n):");//loop program
             input = new Scanner(System.in);
             letter = input.nextLine();
            
                     
       } while (letter.equals("y") || letter.equals("Y"));
  }
}
