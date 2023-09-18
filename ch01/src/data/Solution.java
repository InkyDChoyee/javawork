package data;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        char[] charArray = a.toCharArray();
        for(int i=0; i<charArray.length;i++)
        {
            char checkChar=charArray[i];
           /* if(Character.isUpperCase(checkChar))
            {
                checkChar =Character.toLowerCase(checkChar);
            }
            else*/
            {
                checkChar = Character.toUpperCase(checkChar);
            }
        }
        
        String convertStr = new String(charArray);
        System.out.print(convertStr);
    }
}