import java.util.Scanner;

public class saluu {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a digit (0-9): ");
        int digit = input.nextInt();

        if (digit < 0 || digit > 9) {
            System.out.println("Invalid digit!");
            return;
        }


        String binary = String.format("%4s", Integer.toBinaryString(digit))
                .replace(' ', '0');

        System.out.println("Decimal: " + digit);
        System.out.println("Binary: " + binary);

        // 7-segment decoder
        boolean[][] segments = {
                {true, true, true, true, true, true, false},    // 0
                {false, true, true, false, false, false, false}, // 1
                {true, true, false, true, true, false, true},    // 2
                {true, true, true, true, false, false, true},    // 3
                {false, true, true, false, false, true, true},   // 4
                {true, false, true, true, false, true, true},    // 5
                {true, false, true, true, true, true, true},     // 6
                {true, true, true, false, false, false, false},  // 7
                {true, true, true, true, true, true, true},      // 8
                {true, true, true, true, false, true, true}      // 9
        };

        char[] names = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};

        System.out.println("\n7-Segment Display:");

        for (int i = 0; i < 7; i++) {
            System.out.println(
                    names[i] + " = " + (segments[digit][i] ? "ON" : "OFF")
            );
        }

        input.close();
    }
}