import java.util.Scanner;
class ConvertRoman
{
	
    public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter your Roman in capital ex: IXLCDM");
        String romanNumeral =scan.next(); 
        int result = romanToInt(romanNumeral);
        System.out.println("Roman numeral: " + romanNumeral);
        System.out.println("Integer value: " + result);
    }

    public static int romanToInt(String s) {
        int result = 0;
        int prevValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            int value;

            switch (c) {
                case 'I':
                    value = 1;
                    break;
                case 'V':
                    value = 5;
                    break;
                case 'X':
                    value = 10;
                    break;
                case 'L':
                    value = 50;
                    break;
                case 'C':
                    value = 100;
                    break;
                case 'D':
                    value = 500;
                    break;
                case 'M':
                    value = 1000;
                    break;
                default: System.out.println("enter valid Roman Number");
                    value = 0; 
            }

            if (value < prevValue) {
                result -= value;
            } else {
                result += value;
            }

            prevValue = value;
        }

        return result;
    }
}


