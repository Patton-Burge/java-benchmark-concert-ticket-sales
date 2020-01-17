import java.util.Scanner;

class CustomerInterfaceTest {
    static String CSV = "Artist , Tickets Left , Price , Date \nLilUziVert ,20 ,30.00 ,11/26/16 \nMetalica ,5 ,20.00 ,11/12/97\nBrock ,20 ,30.00 ,11/26/16 \n";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome! What's the name?");

        String name = scanner.nextLine();
        String[] strArray = CSV.split("\n");
        for (String thing : strArray) {
            System.out.println(thing);
        }

        Scanner choice = new Scanner(System.in);

        System.out.println("What artist would you like to see?");

        String artist_choice = choice.nextLine();
        choice.close();
        for (String thing : strArray) {
            System.out.println(thing);
        }
    }
}