import java.util.*;

public class RomanToInteger {
    public static int romanToInt(String s) {
        // Create a HashMap to store the values of Roman numerals
        HashMap<Character, Integer> romanValues = new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);

        int result = 0;
        int prevValue = 0;

        // Iterate through the characters of the Roman numeral string
        for (int i = s.length() - 1; i >= 0; i--) {
            char currentChar = s.charAt(i); 
            int currentValue = romanValues.get(currentChar);

            // If the current value is smaller than the previous value, subtract it
            if (currentValue < prevValue) {
                result -= currentValue;
            }
            // Otherwise, add it to the result
            else {
                result += currentValue;
            }

            // Update the previous value for the next iteration
            prevValue = currentValue;
        }
        
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int result = romanToInt(s);
        System.out.println(result);
    }
}
