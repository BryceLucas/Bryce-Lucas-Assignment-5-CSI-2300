import java.util.Scanner;

public class Converterbryce {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to my converter program!");
        System.out.println("Please input your conversion. For example, 1 km = m.");
        System.out.println("Enter 'exit' to exit the program");

        while (true) {
            System.out.print("Enter your conversion: ");
            String query = sc.nextLine();

            if (query.equalsIgnoreCase("exit")) {
                System.out.println("Exiting the program. Goodbye!");
                break;
            }

            String[] parts = query.split(" ");
            if (parts.length != 3 || !parts[1].equals("=")) {
                System.out.println("Your input is not currently handled by this app, please input another query, for example, 1 kg = lb or 1 ft = inch");
                continue;
            }

            double value = Double.parseDouble(parts[0]);
            String fromUnit = parts[2];

            switch (fromUnit) {
                case "km":
                    System.out.println(value + " km = " + (value * 1000) + " m");
                    break;
                case "kg":
                    System.out.println(value + " kg = " + (value * 2.20462) + " lb");
                    break;
                case "g":
                    System.out.println(value + " g = " + (value * 0.03527396) + " oz");
                    break;
                case "mm":
                    System.out.println(value + " mm = " + (value * 0.03937008) + " inch");
                    break;
                case "ft":
                    System.out.println(value + " ft = " + (value * 12) + " inch");
                    break;
                case "C":
                    System.out.println(value + " °C = " + ((value * 9/5) + 32) + " °F");
                    break;
                default:
                    System.out.println("Your input is not currently handled by this app, please input another query, for example, 1 kg = lb");
            }
        }

        sc.close();
    }
}

