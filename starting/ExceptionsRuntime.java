public class ExceptionsRuntime {
    public static void main(String a[]) {
        int j = 0;
        int k = 0;

        int m[] = new int[6];

        // handling the exceptions so that java wont stop the execution.
        // try {
        // k = j / k;
        // System.out.println(m[6]);
        // } catch (ArithmeticException e) {
        // System.out.println("Cannot divided by zero!");
        // } catch (ArrayIndexOutOfBoundsException e) {
        // System.out.println("Accessing element out of limit is not possible!");
        // }

        try {
            k = j / k;
            System.out.println(m[6]);
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            // we can do anything here for example i will do k=j/1;
            System.out.println("An exception occurred: " + e.getMessage());
        }
        // catch rest of the exceptions. Exception is the parent so this has to be in
        // the last to handle.
        catch (Exception e) {
            System.out.println("Something went wrong: " + e);
        }

        System.out.println("values: " + j + ", " + k);
        System.out.println("End");
    }
}
