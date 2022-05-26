package asciicodeencryption;
import java.util.Scanner;
public class AsciiCodeEncryption {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i,temp,x,y=1,binary=0;
        String str ;
        System.out.println("Enter your message:");
        str = input.nextLine();
        char [] ch = str.toCharArray();
        i=0;
        
        System.out.println("The ascii code of this message is");
        for (x = 0; x < ch.length; x++){
            
             // (char)i is not in text if counts[i] is 0
            System.out.print((byte)ch[x]+" ");
        
  } 
        System.out.println();
    }
        public static int[] getCharacterFrequency(String text) {
  int[] counts = new int[256]; // 256 ASCII characters
 
  for (int i = 0; i < text.length(); i++)
  counts[(int)text.charAt(i)]++; // Count the characters in text
 
  return counts;
  }
    }
    

