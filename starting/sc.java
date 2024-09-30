public class SC {
    public static void main(String arg[]) {
        // int n = 1;

        // switch (n) {
        // case 1:
        // System.out.println("Saturday");
        // break;
        // case 2:
        // System.out.println("Sunday");
        // break;
        // case 3:
        // System.out.println("Monday");
        // break;
        // case 4:
        // System.out.println("Tuesday");
        // break;
        // case 5:
        // System.out.println("Wednesday");
        // break;
        // case 6:
        // System.out.println("Thursday");
        // break;
        // case 7:
        // System.out.println("Friday");
        // break;
        // default:
        // System.out.println("Invalid Input");
        // }

        String day = "Monday";
        String res = "";

        res = switch (day) {
            case "Saturday" -> "1";
            case "Sunday" -> "2";
            case "Monday" -> "3";
            case "Tuesday" -> "4";
            case "Wednesday" -> "5";
            case "Thursday" -> "6";
            case "Friday" -> "7";
            default -> "Invalid Input";
        };

        System.out.println(res);

    }
}
