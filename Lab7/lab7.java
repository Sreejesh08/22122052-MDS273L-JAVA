import java.util.*;
import java.io.*;
import java.text.DecimalFormat;

public class lab7 {
        private static final DecimalFormat df = new DecimalFormat("0.00");

        static Float min(Float[] arr, int cnt, int l) {
                Float temp;
                for (int m = l; m < cnt; m++) {
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

        static float mean(Float[] arr, int cnt, int l) {
                Float s = (float) 0;
                for (int m = l; m < cnt; m++) {
                        s = s + arr[m];
                }
                return (s / cnt);
        }

        static Float max(Float[] arr, int cnt, int l) {
                Float temp;
                for (int m = l; m < cnt; m++) {
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

        static float median(Float[] arr, int cnt, int l) {
                Float temp;
                for (int m = l; m < cnt; m++) {
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

        static Float mode(Float[] arr, int cnt, int l) {
                Float mode = (float) 0;
                int maxCount = 0;

                for (int i = l; i < cnt; i++) {
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
                        File file1 = new File("output.txt");
                        if (file1.exists()) {
                        } else {
                                if (file1.createNewFile()) {
                                        System.out.println("File Created...");
                                }
                        }
                        Scanner read = new Scanner(file);
                        read.nextLine();
                        Scanner scan = new Scanner(System.in);
                        int ch = 1, i = 0, cnt = 0, opt = 0;
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
                        FileWriter write = new FileWriter(file1, true);

                        do {
                                System.out.println(
                                                "What would you like to see? : \n1. Overall Summary \n2. Species wise ");
                                int choice = Integer.parseInt(scan.nextLine());
                                switch (choice) {
                                        case 1:
                                                Float mean1 = mean(arr1, cnt, 0);
                                                Float min1 = min(arr1, cnt, 0);
                                                Float median1 = median(arr1, cnt, 0);
                                                Float max1 = max(arr1, cnt, 0);
                                                Float mode1 = mode(arr1, cnt, 0);
                                                Float mean2 = mean(arr2, cnt, 0);
                                                Float min2 = min(arr2, cnt, 0);
                                                Float median2 = median(arr2, cnt, 0);
                                                Float max2 = max(arr2, cnt, 0);
                                                Float mode2 = mode(arr2, cnt, 0);
                                                Float mean3 = mean(arr3, cnt, 0);
                                                Float min3 = min(arr3, cnt, 0);
                                                Float median3 = median(arr3, cnt, 0);
                                                Float max3 = max(arr3, cnt, 0);
                                                Float mode3 = mode(arr3, cnt, 0);
                                                Float mean4 = mean(arr4, cnt, 0);
                                                Float min4 = min(arr4, cnt, 0);
                                                Float median4 = median(arr4, cnt, 0);
                                                Float max4 = max(arr4, cnt, 0);
                                                Float mode4 = mode(arr4, cnt, 0);
                                                System.out.println(
                                                                "------------------------------------------------------------------------------------");
                                                System.out.println(
                                                                "|                 |   Mean   |   Minimum    |   Medain    |   Maximum    |   Mode   |");
                                                System.out.println(
                                                                "------------------------------------------------------------------------------------");
                                                System.out.println("|Sepal Length     |   " + df.format(mean1)
                                                                + "   |     " + df.format(min1) + "     |    "
                                                                + df.format(median1)
                                                                + "     |     " + df.format(max1) + "     |   "
                                                                + df.format(mode1) + "   |");
                                                System.out.println("|Sepal Width      |   " + df.format(mean2)
                                                                + "   |     " + df.format(min2) + "     |    "
                                                                + df.format(median2) + "     |     " + df.format(max2)
                                                                + "     |   " + df.format(mode2) + "   |");
                                                System.out.println("|Petal Length     |   " + df.format(mean3)
                                                                + "   |     " + df.format(min3) + "     |    "
                                                                + df.format(median3)
                                                                + "     |     " + df.format(max3) + "     |   "
                                                                + df.format(mode3) + "   |");
                                                System.out.println("|Petal Width      |   " + df.format(mean4)
                                                                + "   |     " + df.format(min4) + "     |    "
                                                                + df.format(median4)
                                                                + "     |     " + df.format(max4) + "     |   "
                                                                + df.format(mode4) + "   |");
                                                System.out.println(
                                                                "------------------------------------------------------------------------------------");

                                                // Writing in file
                                                write.write("\nThe entire summary is as below.");
                                                write.write("\n------------------------------------------------------------------------------------");
                                                write.write(
                                                                "\n|                 |   Mean   |   Minimum    |   Medain    |   Maximum    |   Mode   |");
                                                write.write(
                                                                "\n------------------------------------------------------------------------------------");
                                                write.write("\n|Sepal Length     |   " + df.format(mean1)
                                                                + "   |     " + df.format(min1) + "     |    "
                                                                + df.format(median1)
                                                                + "     |     " + df.format(max1) + "     |   "
                                                                + df.format(mode1) + "   |");
                                                write.write("\n|Sepal Width      |   " + df.format(mean2)
                                                                + "   |     " + df.format(min2) + "     |    "
                                                                + df.format(median2) + "     |     " + df.format(max2)
                                                                + "     |   " + df.format(mode2) + "   |");
                                                write.write("\n|Petal Length     |   " + df.format(mean3)
                                                                + "   |     " + df.format(min3) + "     |    "
                                                                + df.format(median3)
                                                                + "     |     " + df.format(max3) + "     |   "
                                                                + df.format(mode3) + "   |");
                                                write.write("\n|Petal Width      |   " + df.format(mean4)
                                                                + "   |     " + df.format(min4) + "     |    "
                                                                + df.format(median4)
                                                                + "     |     " + df.format(max4) + "     |   "
                                                                + df.format(mode4) + "   |");
                                                write.write(
                                                                "\n------------------------------------------------------------------------------------");
                                                System.out.println("File Updated.");
                                                break;
                                        case 2:
                                                write.write("\nThe species wise summary is as below ");
                                                do {
                                                        System.out.println(
                                                                        "Enter the species you would like to see \n1.Setosa \n2.Versicolor \n3.Virginica");
                                                        int cho = Integer.parseInt(scan.nextLine());
                                                        switch (cho) {
                                                                case 1:
                                                                        Float smean1 = mean(arr1, 50, 0);
                                                                        Float smin1 = min(arr1, 50, 0);
                                                                        Float smedian1 = median(arr1, 50, 0);
                                                                        Float smax1 = max(arr1, 50, 0);
                                                                        Float smode1 = mode(arr1, 50, 0);
                                                                        Float smean2 = mean(arr2, 50, 0);
                                                                        Float smin2 = min(arr2, 50, 0);
                                                                        Float smedian2 = median(arr2, 50, 0);
                                                                        Float smax2 = max(arr2, 50, 0);
                                                                        Float smode2 = mode(arr2, 50, 0);
                                                                        Float smean3 = mean(arr3, 50, 0);
                                                                        Float smin3 = min(arr3, 50, 0);
                                                                        Float smedian3 = median(arr3, 50, 0);
                                                                        Float smax3 = max(arr3, 50, 0);
                                                                        Float smode3 = mode(arr3, 50, 0);
                                                                        Float smean4 = mean(arr4, 50, 0);
                                                                        Float smin4 = min(arr4, 50, 0);
                                                                        Float smedian4 = median(arr4, 50, 0);
                                                                        Float smax4 = max(arr4, 50, 0);
                                                                        Float smode4 = mode(arr4, 50, 0);
                                                                        System.out.println(
                                                                                        "----------------------------------------------------------------------------------");
                                                                        System.out.println(
                                                                                        "|     Setosa      |   Mean   |    Minimum   |   Medain   |   Maximum   |   Mode   |");
                                                                        System.out.println(
                                                                                        "----------------------------------------------------------------------------------");
                                                                        System.out.println("|Sepal Length     |   "
                                                                                        + df.format(smean1)
                                                                                        + "   |     " + df.format(smin1)
                                                                                        + "     |    "
                                                                                        + df.format(smedian1)
                                                                                        + "    |     "
                                                                                        + df.format(smax1) + "    |   "
                                                                                        + df.format(smode1) + "   |");
                                                                        System.out.println("|Sepal Width      |   "
                                                                                        + df.format(smean2)
                                                                                        + "   |     " + df.format(smin2)
                                                                                        + "     |    "
                                                                                        + df.format(smedian2)
                                                                                        + "    |     "
                                                                                        + df.format(smax2) + "    |   "
                                                                                        + df.format(smode2) + "   |");
                                                                        System.out.println("|Petal Length     |   "
                                                                                        + df.format(smean3)
                                                                                        + "   |     " + df.format(smin3)
                                                                                        + "     |    "
                                                                                        + df.format(smedian3)
                                                                                        + "    |     "
                                                                                        + df.format(smax3) + "    |   "
                                                                                        + df.format(smode3) + "   |");
                                                                        System.out.println("|Petal Width      |   "
                                                                                        + df.format(smean4)
                                                                                        + "   |     " + df.format(smin4)
                                                                                        + "     |    "
                                                                                        + df.format(smedian4)
                                                                                        + "    |     "
                                                                                        + df.format(smax4) + "    |   "
                                                                                        + df.format(smode4) + "   |");
                                                                        System.out.println(
                                                                                        "----------------------------------------------------------------------------------");

                                                                        // Writing to file
                                                                        write.write(
                                                                                        "\n----------------------------------------------------------------------------------");
                                                                        write.write(
                                                                                        "\n|     Setosa      |   Mean   |    Minimum   |   Medain   |   Maximum   |   Mode   |");
                                                                        write.write(
                                                                                        "\n----------------------------------------------------------------------------------");
                                                                        write.write("\n|Sepal Length     |   "
                                                                                        + df.format(smean1)
                                                                                        + "   |     " + df.format(smin1)
                                                                                        + "     |    "
                                                                                        + df.format(smedian1)
                                                                                        + "    |     "
                                                                                        + df.format(smax1) + "    |   "
                                                                                        + df.format(smode1) + "   |");
                                                                        write.write("\n|Sepal Width      |   "
                                                                                        + df.format(smean2)
                                                                                        + "   |     " + df.format(smin2)
                                                                                        + "     |    "
                                                                                        + df.format(smedian2)
                                                                                        + "    |     "
                                                                                        + df.format(smax2) + "    |   "
                                                                                        + df.format(smode2) + "   |");
                                                                        write.write("\n|Petal Length     |   "
                                                                                        + df.format(smean3)
                                                                                        + "   |     " + df.format(smin3)
                                                                                        + "     |    "
                                                                                        + df.format(smedian3)
                                                                                        + "    |     "
                                                                                        + df.format(smax3) + "    |   "
                                                                                        + df.format(smode3) + "   |");
                                                                        write.write("\n|Petal Width      |   "
                                                                                        + df.format(smean4)
                                                                                        + "   |     " + df.format(smin4)
                                                                                        + "     |    "
                                                                                        + df.format(smedian4)
                                                                                        + "    |     "
                                                                                        + df.format(smax4) + "    |   "
                                                                                        + df.format(smode4) + "   |");
                                                                        write.write(
                                                                                        "\n----------------------------------------------------------------------------------");
                                                                        System.out.println("File Updated.");
                                                                        break;
                                                                case 2:
                                                                        smean1 = mean(arr1, 100, 50);
                                                                        smin1 = min(arr1, 100, 50);
                                                                        smedian1 = median(arr1, 100, 50);
                                                                        smax1 = max(arr1, 100, 50);
                                                                        smode1 = mode(arr1, 100, 50);
                                                                        smean2 = mean(arr2, 100, 50);
                                                                        smin2 = min(arr2, 100, 50);
                                                                        smedian2 = median(arr2, 100, 50);
                                                                        smax2 = max(arr2, 100, 50);
                                                                        smode2 = mode(arr2, 100, 50);
                                                                        smean3 = mean(arr3, 100, 50);
                                                                        smin3 = min(arr3, 100, 50);
                                                                        smedian3 = median(arr3, 100, 50);
                                                                        smax3 = max(arr3, 100, 50);
                                                                        smode3 = mode(arr3, 100, 50);
                                                                        smean4 = mean(arr4, 100, 50);
                                                                        smin4 = min(arr4, 100, 50);
                                                                        smedian4 = median(arr4, 100, 50);
                                                                        smax4 = max(arr4, 100, 50);
                                                                        smode4 = mode(arr4, 100, 50);
                                                                        System.out.println(
                                                                                        "----------------------------------------------------------------------------------");
                                                                        System.out.println(
                                                                                        "|   Versicolor    |   Mean   |    Minimum   |   Medain   |   Maximum   |   Mode   |");
                                                                        System.out.println(
                                                                                        "----------------------------------------------------------------------------------");
                                                                        System.out.println("|Sepal Length     |   "
                                                                                        + df.format(smean1)
                                                                                        + "   |     " + df.format(smin1)
                                                                                        + "     |    "
                                                                                        + df.format(smedian1)
                                                                                        + "    |     "
                                                                                        + df.format(smax1) + "    |   "
                                                                                        + df.format(smode1) + "   |");
                                                                        System.out.println("|Sepal Width      |   "
                                                                                        + df.format(smean2)
                                                                                        + "   |     " + df.format(smin2)
                                                                                        + "     |    "
                                                                                        + df.format(smedian2)
                                                                                        + "    |     "
                                                                                        + df.format(smax2) + "    |   "
                                                                                        + df.format(smode2) + "   |");
                                                                        System.out.println("|Petal Length     |   "
                                                                                        + df.format(smean3)
                                                                                        + "   |     " + df.format(smin3)
                                                                                        + "     |    "
                                                                                        + df.format(smedian3)
                                                                                        + "    |     "
                                                                                        + df.format(smax3) + "    |   "
                                                                                        + df.format(smode3) + "   |");
                                                                        System.out.println("|Petal Width      |   "
                                                                                        + df.format(smean4)
                                                                                        + "   |     " + df.format(smin4)
                                                                                        + "     |    "
                                                                                        + df.format(smedian4)
                                                                                        + "    |     "
                                                                                        + df.format(smax4) + "    |   "
                                                                                        + df.format(smode4) + "   |");
                                                                        System.out.println(
                                                                                        "----------------------------------------------------------------------------------");

                                                                        // Writing to file
                                                                        write.write(
                                                                                        "\n----------------------------------------------------------------------------------");
                                                                        write.write(
                                                                                        "\n|   Versicolor    |   Mean   |    Minimum   |   Medain   |   Maximum   |   Mode   |");
                                                                        write.write(
                                                                                        "\n----------------------------------------------------------------------------------");
                                                                        write.write("\n|Sepal Length     |   "
                                                                                        + df.format(smean1)
                                                                                        + "   |     " + df.format(smin1)
                                                                                        + "     |    "
                                                                                        + df.format(smedian1)
                                                                                        + "    |     "
                                                                                        + df.format(smax1) + "    |   "
                                                                                        + df.format(smode1) + "   |");
                                                                        write.write("\n|Sepal Width      |   "
                                                                                        + df.format(smean2)
                                                                                        + "   |     " + df.format(smin2)
                                                                                        + "     |    "
                                                                                        + df.format(smedian2)
                                                                                        + "    |     "
                                                                                        + df.format(smax2) + "    |   "
                                                                                        + df.format(smode2) + "   |");
                                                                        write.write("\n|Petal Length     |   "
                                                                                        + df.format(smean3)
                                                                                        + "   |     " + df.format(smin3)
                                                                                        + "     |    "
                                                                                        + df.format(smedian3)
                                                                                        + "    |     "
                                                                                        + df.format(smax3) + "    |   "
                                                                                        + df.format(smode3) + "   |");
                                                                        write.write("\n|Petal Width      |   "
                                                                                        + df.format(smean4)
                                                                                        + "   |     " + df.format(smin4)
                                                                                        + "     |    "
                                                                                        + df.format(smedian4)
                                                                                        + "    |     "
                                                                                        + df.format(smax4) + "    |   "
                                                                                        + df.format(smode4) + "   |");
                                                                        write.write(
                                                                                        "\n----------------------------------------------------------------------------------");
                                                                        System.out.println("File Updated.");
                                                                        break;
                                                                case 3:
                                                                        smean1 = mean(arr1, 150, 100);
                                                                        smin1 = min(arr1, 150, 100);
                                                                        smedian1 = median(arr1, 150, 100);
                                                                        smax1 = max(arr1, 150, 100);
                                                                        smode1 = mode(arr1, 150, 100);
                                                                        smean2 = mean(arr2, 150, 100);
                                                                        smin2 = min(arr2, 150, 100);
                                                                        smedian2 = median(arr2, 150, 100);
                                                                        smax2 = max(arr2, 150, 100);
                                                                        smode2 = mode(arr2, 150, 100);
                                                                        smean3 = mean(arr3, 150, 100);
                                                                        smin3 = min(arr3, 150, 100);
                                                                        smedian3 = median(arr3, 150, 100);
                                                                        smax3 = max(arr3, 150, 100);
                                                                        smode3 = mode(arr3, 150, 100);
                                                                        smean4 = mean(arr4, 150, 100);
                                                                        smin4 = min(arr4, 150, 100);
                                                                        smedian4 = median(arr4, 150, 100);
                                                                        smax4 = max(arr4, 150, 100);
                                                                        smode4 = mode(arr4, 150, 100);
                                                                        System.out.println(
                                                                                        "----------------------------------------------------------------------------------");
                                                                        System.out.println(
                                                                                        "|    Virginica    |   Mean   |    Minimum   |   Medain   |   Maximum   |   Mode   |");
                                                                        System.out.println(
                                                                                        "----------------------------------------------------------------------------------");
                                                                        System.out.println("|Sepal Length     |   "
                                                                                        + df.format(smean1)
                                                                                        + "   |     " + df.format(smin1)
                                                                                        + "     |    "
                                                                                        + df.format(smedian1)
                                                                                        + "    |     "
                                                                                        + df.format(smax1) + "    |   "
                                                                                        + df.format(smode1) + "   |");
                                                                        System.out.println("|Sepal Width      |   "
                                                                                        + df.format(smean2)
                                                                                        + "   |     " + df.format(smin2)
                                                                                        + "     |    "
                                                                                        + df.format(smedian2)
                                                                                        + "    |     "
                                                                                        + df.format(smax2) + "    |   "
                                                                                        + df.format(smode2) + "   |");
                                                                        System.out.println("|Petal Length     |   "
                                                                                        + df.format(smean3)
                                                                                        + "   |     " + df.format(smin3)
                                                                                        + "     |    "
                                                                                        + df.format(smedian3)
                                                                                        + "    |     "
                                                                                        + df.format(smax3) + "    |   "
                                                                                        + df.format(smode3) + "   |");
                                                                        System.out.println("|Petal Width      |   "
                                                                                        + df.format(smean4)
                                                                                        + "   |     " + df.format(smin4)
                                                                                        + "     |    "
                                                                                        + df.format(smedian4)
                                                                                        + "    |     "
                                                                                        + df.format(smax4) + "    |   "
                                                                                        + df.format(smode4) + "   |");
                                                                        System.out.println(
                                                                                        "----------------------------------------------------------------------------------");

                                                                        // Writing to file
                                                                        write.write(
                                                                                        "\n----------------------------------------------------------------------------------");
                                                                        write.write(
                                                                                        "\n|    Virginica    |   Mean   |    Minimum   |   Medain   |   Maximum   |   Mode   |");
                                                                        write.write(
                                                                                        "\n----------------------------------------------------------------------------------");
                                                                        write.write("\n|Sepal Length     |   "
                                                                                        + df.format(smean1)
                                                                                        + "   |     " + df.format(smin1)
                                                                                        + "     |    "
                                                                                        + df.format(smedian1)
                                                                                        + "    |     "
                                                                                        + df.format(smax1) + "    |   "
                                                                                        + df.format(smode1) + "   |");
                                                                        write.write("\n|Sepal Width      |   "
                                                                                        + df.format(smean2)
                                                                                        + "   |     " + df.format(smin2)
                                                                                        + "     |    "
                                                                                        + df.format(smedian2)
                                                                                        + "    |     "
                                                                                        + df.format(smax2) + "    |   "
                                                                                        + df.format(smode2) + "   |");
                                                                        write.write("\n|Petal Length     |   "
                                                                                        + df.format(smean3)
                                                                                        + "   |     " + df.format(smin3)
                                                                                        + "     |    "
                                                                                        + df.format(smedian3)
                                                                                        + "    |     "
                                                                                        + df.format(smax3) + "    |   "
                                                                                        + df.format(smode3) + "   |");
                                                                        write.write("\n|Petal Width      |   "
                                                                                        + df.format(smean4)
                                                                                        + "   |     " + df.format(smin4)
                                                                                        + "     |    "
                                                                                        + df.format(smedian4)
                                                                                        + "    |     "
                                                                                        + df.format(smax4) + "    |   "
                                                                                        + df.format(smode4) + "   |");
                                                                        write.write(
                                                                                        "\n----------------------------------------------------------------------------------");
                                                                        System.out.println("File Updated.");
                                                                        break;
                                                                default:
                                                                        System.out.println("Invalid Choice");
                                                        }
                                                        System.out.println(
                                                                        "Would you like to check for another species?[1]");
                                                        opt = Integer.parseInt(scan.nextLine());
                                                } while (opt == 1);

                                }
                                System.out.println("Enter 1 to continue and any other key to exit");
                                ch = Integer.parseInt(scan.nextLine());
                        } while (ch == 1);
                        write.close();
                        scan.close();
                        read.close();
                } catch (Exception e) {
                        System.out.println(e.getMessage());
                }
        }
}