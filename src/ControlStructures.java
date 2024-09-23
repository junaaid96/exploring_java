public class ControlStructures {
    public static void main(String[] args) {
        int number = 10;

        // If-else statement
        if (number > 0) {
            System.out.println("Number is positive");
        } else if (number < 0) {
            System.out.println("Number is negative");
        } else {
            System.out.println("Number is zero");
        }

        // For loop
        System.out.println("Counting from 1 to 5:");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        // While loop
        System.out.println("Countdown from 5 to 1:");
        int countdown = 5;
        while (countdown > 0) {
            System.out.println(countdown);
            countdown--;
        }

        // Switch statement
        String day = "Monday";
        switch (day) {
            case "Monday":
                System.out.println("Start of the work week");
                break;
            case "Friday":
                System.out.println("TGIF!");
                break;
            default:
                System.out.println("Regular day");
        }
    }
}