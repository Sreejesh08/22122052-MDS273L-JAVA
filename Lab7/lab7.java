import java.util.*;
import java.io.*;

public class lab7 {

    static void min(Float[] arr, int cnt) {
        Float temp;
        for (int m = 0; m < cnt; m++) {
            for (int n = m + 1; n < cnt; n++) {
                if (arr[m] > arr[n]) {
                    temp = arr[m];
                    arr[m] = arr[n];
                    arr[n] = temp;
                }
            }
        }
        System.out.println("Minimum: " + arr[0]);
    }

    static void mean(Float[] arr, int cnt) {
        Float s = (float) 0;
        for (int m = 0; m < cnt; m++) {
            s = s + arr[m];
        }
        System.out.println("Mean: " + (s / cnt));
    }

    static void max(Float[] arr, int cnt) {
        Float temp;
        for (int m = 0; m < cnt; m++) {
            for (int n = m + 1; n < cnt; n++) {
                if (arr[m] > arr[n]) {
                    temp = arr[m];
                    arr[m] = arr[n];
                    arr[n] = temp;
                }
            }
        }
        System.out.println("Maximum: " + arr[cnt - 1]);
    }

    static void median(Float[] arr, int cnt) {
        Float temp;
        for (int m = 0; m < cnt; m++) {
            for (int n = m + 1; n < cnt; n++) {
                if (arr[m] > arr[n]) {
                    temp = arr[m];
                    arr[m] = arr[n];
                    arr[n] = temp;
                }
            }
        }
        if (cnt % 2 == 0) {
            System.out.println("Median: " + (arr[cnt / 2] + arr[(cnt / 2) + 1]) / 2);
        } else {
            System.out.println("Median: " + arr[cnt / 2]);
        }
    }

    public static void mode(Float[] arr,int cnt ) {
        Float mode = arr[0];
        int maxCount = 0;

        for (int i = 0; i < cnt; i++) {
            int count = 1;

            for (int j = 0; j < cnt; j++) {
                if (arr[j] == arr[i]) {
                    count++;
                }
            }

            if (count > maxCount) {
                maxCount = count;
                mode = arr[i];
            }
        }
        System.out.println("Mode: " + mode);
    }

    public static void main(String[] args) {
        try {
            File file = new File("iris.csv");
            Scanner read = new Scanner(file);
            String a = read.nextLine();
            String[] arr = a.split(",");
            Scanner scan = new Scanner(System.in);
            int ch = 1, i = 0, cnt = 0;
            Float[] arr1 = new Float[200];
            Float[] arr2 = new Float[200];
            Float[] arr3 = new Float[200];
            Float[] arr4 = new Float[200];
            do {
                while (read.hasNextLine()) {
                    String b = read.nextLine();
                    String[] temp = b.split(",");
                    Float x = Float.parseFloat(temp[1]);
                    Float y = Float.parseFloat(temp[2]);
                    Float z = Float.parseFloat(temp[3]);
                    Float l = Float.parseFloat(temp[4]);
                    arr1[i] = x;
                    arr2[i] = y;
                    arr3[i] = z;
                    arr4[i] = l;
                    cnt++;
                    i++;
                }
                System.out.println("Enter the column you want to operate: \n1. " + arr[1] + "\n2. " + arr[2] + "\n3. "
                        + arr[3] + "\n4. " + arr[4]);
                int choice = scan.nextInt();
                System.out.println("The minimum, mean and maximum value for " + arr[choice]);
                switch (choice) {
                    case 1:
                        min(arr1, cnt);
                        mean(arr1, cnt);
                        median(arr1, cnt);
                        mode(arr1, cnt);
                        max(arr1, cnt);
                        break;
                    case 2:
                        min(arr2, cnt);
                        mean(arr2, cnt);
                        median(arr2, cnt);
                        mode(arr2, cnt);
                        max(arr2, cnt);
                        break;
                    case 3:
                        min(arr3, cnt);
                        mean(arr3, cnt);
                        median(arr3, cnt);
                        mode(arr3, cnt);
                        max(arr3, cnt);
                        break;
                    case 4:
                        min(arr4, cnt);
                        mean(arr4, cnt);
                        median(arr4, cnt);
                        mode(arr4, cnt);
                        max(arr4, cnt);
                        break;
                }
                System.out.println("Enter 1 to continue and any other key to exit");
                ch = scan.nextInt();
            } while (ch == 1);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}