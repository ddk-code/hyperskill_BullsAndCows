package bullscows;

import java.util.Scanner;

public class BullsCows {
    final static Scanner scanner = new Scanner(System.in);

    private int numberLength;

    private StringBuilder number;
    int turn;

    GameState state;

    int answer;
    String answerDigits;
    int bulls;
    int cows;

    public BullsCows() {
        this.state = GameState.NOT_STARTED;
        this.turn = 0;
        System.out.println("Please, enter the secret code's length:");
//        System.out.println("\nThe secret code is prepared: ****.");
    }

    public void start() {
        this.state = GameState.NOT_FINISHED;
        this.numberLength = scanner.nextInt();
        this.generatePseudoRandomNumber();
        System.out.println("[" + this.number + "]");
        System.out.println("Okay, let's start a game!");
        this.turn = 0;
        while (this.state != GameState.FINISHED) {
            this.playing();
        }
    }

    private void generatePseudoRandomNumber() {
        if (this.numberLength > 10) {
            System.out.println("Error: can't generate a secret number with a length of " +
                    this.numberLength + " because there aren't enough unique digits.");
            return;
        }
        if (this.numberLength < 1) {
            System.err.println("Error: can't generate a secret number with a length of " +
                    this.numberLength + " because there aren't enough digits.");
            return;
        }
        long pseudoRandomNumber;
        do {
            pseudoRandomNumber = System.nanoTime();
            this.number = new StringBuilder(Long.toString(pseudoRandomNumber));
            this.number.reverse();
            while (this.number.charAt(0) == '0') {
                this.number.deleteCharAt(0);
            }
            for (int i = 0; i < this.number.length(); i++) {
                if (isBefore(this.number, i, this.number.charAt(i))) {
                    this.number.deleteCharAt(i--);
                }
            }
        } while (this.number.length() < this.numberLength);
        this.number.delete(this.numberLength, this.number.length());
    }

    private boolean isBefore(StringBuilder sb, int i, char c) {
        for (int j = 0; j < i; j++) {
            if (sb.charAt(j) == c) {
                return true;
            }
        }
        return false;
    }

    private void playing() {
        ++this.turn;
        System.out.println("Turn " + this.turn);
        this.cows = 0;
        this.bulls = 0;
        this.answer = scanner.nextInt();
        this.answerDigits = Integer.toString(answer);
        bullsAndCowsCounting();
        printGrade();
        if (this.bulls == this.numberLength) {
            System.out.println("Congratulations! You guessed the secret code.");
            this.state = GameState.FINISHED;
        }
    }

    private void bullsAndCowsCounting() {
        for (int i = 0; i < this.answerDigits.length(); i++) {
            if (answerDigits.charAt(i) == number.charAt(i)) {
                ++this.bulls;
            } else if (number.toString().contains(Character.toString(answerDigits.charAt(i)))) {
                ++this.cows;
            }
        }
    }

    private void printGrade() {
        System.out.print("Grade: ");
        if (this.bulls > 0 || this.cows > 0) {
            System.out.print(printBullsMsg());
            System.out.print(!"".equals(printBullsMsg()) && !"".equals(printCowsMsg()) ? " and " : "");
            System.out.print(printCowsMsg());
            System.out.println(".");
//            System.out.print("."); //
//            System.out.println(" The secret code is " + this.digits + "."); //

        } else {
            System.out.println("None.");
        }
    }

    private String printBullsMsg() {
        if (this.bulls == 1) {
            return "1 bull";
        }
        if (this.bulls > 1) {
            return this.bulls + " bulls";
        }
        return "";
    }

    private String printCowsMsg() {
        if (this.cows == 1) {
            return "1 cow";
        }
        if (this.cows > 1) {
            return this.cows + " cows";
        }
        return "";
    }
}
