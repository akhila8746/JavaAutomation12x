package Tasks;

public class Sumof_All_items_inArray
{
    public static void main(String[] args)
    {
        int[] numbers = {12, 45, 67, 23, 89, 45, 89};
        int sum=0;

        for(int i=0;i<numbers.length;i++)
        {
          sum=sum+numbers[i];
        }
        System.out.println("Sum of all numbers in array:"+ sum);
    }
}
