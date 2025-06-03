package Tasks;

public class Recursive_String
{
    public static String reverse(String str) {
        // Base case
        if (str == null || str.length() <= 1) {
            return str;
        }

        // Recursive case
        return reverse(str.substring(1)) + str.charAt(0);
    }
        public static void main(String[] args) {
            String original = "hello";
            String reversed = reverse(original);
            System.out.println("Original: " + original);
            System.out.println("Reversed: " + reversed);
        }
}
