
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOf {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }
        System.out.println("Search for?");
        int searchFor = scanner.nextInt();
        int index = 0;
        for (int n :
                list) {

            if(n == searchFor){
                System.out.println(searchFor + " is at index "  + index );
            }
            index++;
        }

        // implement here finding the indices of a number
    }
}
