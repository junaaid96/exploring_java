
public class JaggedArr {
    public static void main(String a[]) {
        int arr1[][] = new int[4][];

        arr1[0] = new int[5];
        arr1[1] = new int[6];
        arr1[2] = new int[3];
        arr1[3] = new int[2];

        // inserting
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                arr1[i][j] = (int) (Math.random() * 100);
            }
        }

        // accessing
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }
    }
}