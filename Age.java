import java.util.Scanner;
public class Age {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input your age as an integer");

        if (!input.hasNextInt()) {
            throw new IllegalArgumentException("Invalid Input");
        }
        int age = input.nextInt();

        switch (age) {
            case 1:
                System.out.println("You can crawl");
                break;
            case 2:
                System.out.println("You can talk");
                break;
            case 3:
                System.out.println("you are not a toddler");
                break;
            case 4:
                System.out.println("you are in pre-k");
                break;
            case 5:
                System.out.println("congrats you are an idiot");
                break;
            case 6, 7, 8:
                System.out.println("you are in school");
                break;
            default: // almost like an else statement
                System.out.println("You are " + age + " years old");
                break;
        }
    }
}
