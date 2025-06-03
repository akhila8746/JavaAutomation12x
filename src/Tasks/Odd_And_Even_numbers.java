package Tasks;

public class Odd_And_Even_numbers {
    public static void main(String[] args) {
        int[] numbers = {12, 45, 67, 28, 89, 45, 89};
        int odd = 0;
        int even = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]%2 == 0) {
                System.out.println("even numbers:" + numbers[i]);
            } else {
                System.out.println("odd numbers:" + numbers[i]);
            }
        }

    }
}
