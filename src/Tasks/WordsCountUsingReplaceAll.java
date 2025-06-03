package Tasks;

import java.util.Scanner;

public class WordsCountUsingReplaceAll
{
    public static void main(String[] args) {

        System.out.println("enter a sentence");
        Scanner sc = new Scanner(System.in);
        String sentence=sc.nextLine();

        sentence=sentence.replaceAll("\\s"," ");
        String[] words=sentence.split(" ");
        System.out.println(words.length);
    }
}
