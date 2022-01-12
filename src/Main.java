import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        double fahr;
        double cels;
        int choice;

        // Khởi tạo vòng lặp để chọn phương thức tính
        do {
            System.out.println("Menu");
            System.out.println("1. Fahr to Cels");
            System.out.println("2. Cels to Fahr");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = userInput.nextInt();

//            menu lựa chọn phương thức convert
            switch (choice) {
                case 1:
                    System.out.print("Enter Fahr: ");
                    fahr = userInput.nextDouble();
                    System.out.println("Input " + fahr + " equals to " + fahrToCels(fahr));
                    break;
                case 2:
                    System.out.println("Enter Cels: ");
                    cels = userInput.nextDouble();
                    System.out.println("Input " + cels + " equals to " + celsToFahr(cels));
                    break;
                case 0:
                    System.exit(0);
            }
        } while (choice != 0);
    }

    // Khởi tạo phương thức convert (truyền vào tham số fahr / cels)
    public static double fahrToCels(double fahr) {
        double cels = (5.0 / 9) * (fahr - 32);
        return cels;
    }

    public static double celsToFahr(double cels) {
        double fahr = (9.0 / 5) * cels + 32;
        return fahr;
    }
}
