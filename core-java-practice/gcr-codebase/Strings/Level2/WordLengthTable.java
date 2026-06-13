package String;

import java.util.Scanner;

public class WordLengthTable {

    public static String[][] getWordLength(String[] words){

        String[][] result =
                new String[words.length][2];

        for(int i=0;i<words.length;i++){

            result[i][0] = words[i];
            result[i][1] =
                    String.valueOf(words[i].length());
        }

        return result;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Text: ");
        String text = sc.nextLine();

        String[] words = text.split(" ");

        String[][] table = getWordLength(words);

        System.out.println("Word\tLength");

        for(int i=0;i<table.length;i++){
            System.out.println(
                    table[i][0]+"\t"+
                            Integer.parseInt(table[i][1]));
        }
    }
}