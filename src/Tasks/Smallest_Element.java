package Tasks;

public class Smallest_Element
{
    public static void main(String[] args) {
        int[] numbers = {12, 45, 67, 23, 89, 45, 89};
        int Smallest = numbers[0];
        //int secondHighest = 0;
     for(int i = 0; i < numbers.length; i++)
     {
         if(numbers[i]<Smallest)
         {
             Smallest= numbers[i];
         }
     }
        System.out.println("highest number:"+ Smallest);


    }
}
