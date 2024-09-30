public class MultiDArr {
    public static void main(String a[]) {
        int arr1[][] = new int[4][5];

        int[][] arr2 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // inserting
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                arr1[i][j] = (int) (Math.random() * 100);
            }
        }

        // accessing
        // for (int i = 0; i < arr1.length; i++) {
        //     for (int j = 0; j < arr1[i].length; j++) {
        //         System.out.print(arr1[i][j] + " ");
        //     }
        //     System.out.println();
        // }

        // enhanced for loop
        for (int[] i: arr1) {
            for (int j: i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
