import java.util.*;
import java.io.*;

public class lab7 {

    static Float min(Float[] arr, int cnt) {
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
        return arr[0];
    }

    static float mean(Float[] arr, int cnt) {
        Float s = (float) 0;
        for (int m = 0; m < cnt; m++) {
            s = s + arr[m];
        }
        return (s / cnt);
    }

    static Float max(Float[] arr, int cnt) {
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
        return arr[cnt - 1];
    }

    static float median(Float[] arr, int cnt) {
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
            return (arr[cnt / 2] + arr[(cnt / 2) + 1]) / 2;
        } else {
            return arr[cnt / 2];
        }
    }

    static Float mode(Float[] arr, int cnt) {
        Float mode = (float) 0;
        int maxCount = 0;

        for (int i = 0; i < cnt; i++) {
            int count = 0;
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
        return mode;
    }

    public static void main(String[] args) {
        try {
            File file = new File("iris.csv");
            Scanner read = new Scanner(file);
            String a = read.nextLine();
            String[] arr = a.split(",");
            Scanner scan = new Scanner(System.in);
            int ch = 1, i = 0, cnt = 0, opt=0;
            Float[] arr1 = new Float[200];
            Float[] arr2 = new Float[200];
            Float[] arr3 = new Float[200];
            Float[] arr4 = new Float[200];
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

            do {
                System.out.println("What would you like to see? : \n1. Overall Summary \n2. Species wise ");
                int choice = scan.nextInt();
                switch (choice) {
                    case 1:
                        Float mean1 = mean(arr1, cnt);
                        Float min1 = min(arr1, cnt);
                        Float median1 = median(arr1, cnt);
                        Float max1 = max(arr1, cnt);
                        Float mode1 = mode(arr1, cnt);
                        Float mean2 = mean(arr2, cnt);
                        Float min2 = min(arr2, cnt);
                        Float median2 = median(arr2, cnt);
                        Float max2 = max(arr2, cnt);
                        Float mode2 = mode(arr2, cnt);
                        Float mean3 = mean(arr3, cnt);
                        Float min3 = min(arr3, cnt);
                        Float median3 = median(arr3, cnt);
                        Float max3 = max(arr3, cnt);
                        Float mode3 = mode(arr3, cnt);
                        Float mean4 = mean(arr4, cnt);
                        Float min4 = min(arr4, cnt);
                        Float median4 = median(arr4, cnt);
                        Float max4 = max(arr4, cnt);
                        Float mode4 = mode(arr4, cnt);
                        System.out.println(
                                "----------------------------------------------------------------------------------");
                        System.out.println(
                                "|                 |   Mean    |   Minimum   |   Medain   |   Maximum   |   Mode   |");
                        System.out.println(
                                "----------------------------------------------------------------------------------");
                        System.out.println("|Sepal Length     | " + mean1 + " |     " + min1 + "     |    " + median1
                                + "     |     " + max1 + "     |   " + mode1 + "    |");
                        System.out.println("|Sepal Width      | " + mean2 + "     |     " + min2 + "     |    "
                                + median2 + "     |     " + max2 + "     |   " + mode2 + "    |");
                        System.out.println("|Petal Length     | " + mean3 + " |     " + min3 + "     |    " + median3
                                + "     |     " + max3 + "     |   " + mode3 + "    |");
                        System.out.println("|Petal Width      | " + mean4 + " |     " + min4 + "     |    " + median4
                                + "     |     " + max4 + "     |   " + mode4 + "    |");
                        System.out.println(
                                "----------------------------------------------------------------------------------");
                        break;
                    case 2:do{
                        System.out.println("Would you like to check for another species?");
                        
                    }while(opt==1);

                }
                System.out.println("Enter 1 to continue and any other key to exit");
                ch = scan.nextInt();
            } while (ch == 1);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}