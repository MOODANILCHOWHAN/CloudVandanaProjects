import java.util.Scanner;
public class PangramChecker {
    public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter your string");
        String input =scan.next(); 
        boolean isPangram = isPangram(input);

        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }

    public static boolean isPangram(String str) {
      
        boolean[] seen = new boolean[26];
		str = str.toLowerCase();
		for (int i = 0; i < str.length(); i++) 
		{
            char c = str.charAt(i);

        
            if ('a' <= c && c <= 'z') {
                int index = c - 'a';
                seen[index] = true;
            }
        }
		for (boolean letterSeen : seen) {
            if (!letterSeen) {
                return false;
            }
        }

        return true;
    }
}
