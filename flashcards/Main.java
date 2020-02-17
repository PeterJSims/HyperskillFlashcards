package flashcards;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input the number of cards: ");
        int size = Integer.parseInt(scanner.nextLine());

        String[][] cards = new String[size][2];

        for (int i = 0; i < size; i++){
            System.out.println("The card #" + (i + 1) + ": ");
            //Card name at [0] of second array
            cards[i][0] = scanner.nextLine();
            System.out.println("The definition of the card #" + (i + 1) + ": ");
            //Definition at [1] of second array
            cards[i][1] = scanner.nextLine();
        }

        for (int i = 0; i < cards.length; i++){
            System.out.println("Print the definition of \"" + cards[i][0] + "\": ");
            String answer = scanner.nextLine();
            if (answer.equals(cards[i][1])){
                System.out.println("Correct answer.");
            } else {
                System.out.println("Wrong answer (the correct one is \"" + cards[i][1] + "\")");
            }
        }

    }
}
