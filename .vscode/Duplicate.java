import java.util.*;

public class Duplicate {

    public static String removeDuplicateCharacters(String s) {
        StringBuilder result = new StringBuilder();
        Set<Character> seen = new HashSet<>();

        for (char ch : s.toCharArray()) {
            if (!seen.contains(ch)) {
                seen.add(ch);
                result.append(ch);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        
        if (sc.hasNextLine()) {
            String input = sc.nextLine();
            System.out.println("Output without duplicates: " + removeDuplicateCharacters(input));
        }
        
        sc.close();
    }
}