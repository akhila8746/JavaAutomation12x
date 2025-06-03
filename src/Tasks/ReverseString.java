package Tasks;

public class ReverseString
{
    public static void main(String[] args) {
        /*StringBuilder sb=new StringBuilder("lasya");
        System.out.println(sb.reverse());*/
      String input="Raman";
      char output;

      for(int i=input.length()-1; i>=0; i--)
      {
          output= input.charAt(i);
          //System.out.println("reverse string:"+input.charAt(i));
          System.out.println(output);
      }

    }
}
