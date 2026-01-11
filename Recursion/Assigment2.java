
// Question 2 :
// You are given a number (eg - 2019), convert it into a String of english like
// “two zero one nine”. Use a recursive function to solve this problem.
// NOTE - The digits of the number will only be in the range 0-9 and the last
// digit of a number
// can’t be 0.
// Sample Input : 1947
// Sample Output : “one nine four seven”

public class Assigment2 {

    // using loop
    public static void covertString(int n, StringBuilder str) {
        String[] numbers = {
                "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"
        };
        String s = Integer.toString(n);
        for (int i = 0; i < s.length() - 1; i++) {
            int digit = s.charAt(i) - '0';
            str.append(numbers[digit] + " ");
        }
        int last = s.charAt(s.length() - 1) - '0';
        if (last == 0) {
            System.out.println(str);
            return;
        } else {
            str.append(numbers[last] + " ");
        }
        System.out.println(str);
    }

    // using recursion
    public static void conversion(int n, String[] numbers, StringBuilder str, int i) {
        String s = Integer.toString(n);
        // base case
        if (i > s.length() - 2) {
            int last = s.charAt(s.length() - 1) - '0';
            if (last == 0) {
                System.out.println(str);
                return;
            } else {
                str.append(numbers[last]);
                System.out.println(str);
            }
            return;
        }
        int digit = s.charAt(i) - '0';
        str.append(numbers[digit] + " ");
        conversion(n, numbers, str, i + 1);
    }

    public static void main(String[] args) {
        String[] numbers = {
                "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"
        };
        // covertString(2010, new StringBuilder(""));
        conversion(2010, numbers, new StringBuilder(""), 0);

    }
}