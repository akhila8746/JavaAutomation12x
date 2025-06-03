package Tasks;

import java.util.Scanner;

public class FirstLetterOfEachWord
{
    public static void main(String[] args) {

        System.out.println("enter a sentence");
        Scanner sc=new Scanner(System.in);
        String sentence=sc.nextLine();
        //String[] word={ };
        //String word="";

        String[] words=sentence.trim().split(" ");
        for(int i=0; i<words.length; i++)
        {
            String word=words[i];
            if(!word.isEmpty())
            {
                System.out.println(word.charAt(0));
            }

        }

    }
}
