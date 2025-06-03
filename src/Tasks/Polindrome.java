package Tasks;

public class Polindrome
{
    public static void main(String[] args) {

        String s="Nayana";
        String reverse="";

        if(s!=null)
        {
            for(int i=s.length()-1; i>=0; i--)
            {
                reverse+=s.charAt(i);

            }
            System.out.println("reverse string :"+ reverse);
        }

        if(reverse.equals(s))
        {
            System.out.println("string is polindrome");
        }
        else
        {
            System.out.println("string is not polindrome");
        }

    }
}
