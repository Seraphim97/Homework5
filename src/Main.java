import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Phone phoneI = new Phone("12", 123456, 0.2);
        Phone androidPhone = new Phone("galaxy", 654321);



        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();

        if (month == 0) {
            System.out.println("Winter");
        } else if (month == 1) {
            System.out.println("Spring");
        } else if (month == 2) {
            System.out.println("Summer");
        } else if (month == 3) {
            System.out.println("Autumn");
        } else {
            System.out.println("Sorry, there is no season with this number");
        }

        String[] seasons = new String[4];
        seasons[0] = "Winter";
        seasons[1] = "Spring";
        seasons[2] = "Summer";
        seasons[3] = "Autumn";


        String[] mySinger;
        mySinger = new String[5];
        mySinger[0] = "Eminem";
        mySinger[1] = "Wiz Khalifa";
        mySinger[2] = "Dr.Dre";
        mySinger[3] = "2Pac";
        mySinger[4] = "Nas";


        int[] firstArray = {1, 2};
        int[] secondArray = {3, 4};
        int[] thirdArray = {5, 6};
        System.out.println(firstArray[0] + " " + firstArray[1]);
        System.out.println(secondArray[0] + " " + secondArray[1]);
        System.out.println(thirdArray[0] + " " + thirdArray[1]);


    }


}


