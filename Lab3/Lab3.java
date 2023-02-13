import java.util.Scanner;

public class Lab3 {
    static String[] student = new String[1024];
    static String Name, email, cl, dept, regno, search;
    static int i = 0, co = 1;
    static Scanner scan = new Scanner(System.in);
    static Scanner scan1 = new Scanner(System.in);

    static String[][] collectDetails(String students[][]) {
        while (co == 1) {
            System.out.println("***********************************************");
            System.out.println("Enter the Name.");
            Name = scan.nextLine();
            students[i][0] = Name;
            student[i] = Name;
            System.out.println("Enter the Register Number.");
            regno = scan.nextLine();
            students[i][1] = regno;
            System.out.println("Enter the e-mail ID.");
            email = scan.nextLine();
            students[i][2] = email;
            System.out.println("Enter the Class.");
            cl = scan.nextLine();
            students[i][3] = cl;
            System.out.println("Enter the Department.");
            dept = scan.nextLine();
            students[i][4] = dept;
            i++;
            System.out.println("***********************************************");
            System.out.println("Do you wish to Enter more student details[1/2].");
            co = scan1.nextInt();
        }
        return students;
    }

    static void displaydeatils(String students[][]) {
        for (int j = 0; j < i; j++) {
            System.out.println("Details of the " + j + " student.");
            System.out.println("***********************************************");
            System.out.println("The Name is: " + students[j][0]);
            System.out.println("The Register Number is: " + students[j][1]);
            System.out.println("The e-mail ID is: " + students[j][2]);
            System.out.println("The Class ID is: " + students[j][3]);
            System.out.println("The Department ID is: " + students[j][4]);
            System.out.println();
        }
    }

    static String[][] searchthedetails(String students[][]) {
        System.out.println("Enter the name that needs to be searched.");
        search = scan.nextLine();
        for (int l = 0; l < i; l++) {
            if (student[l].equalsIgnoreCase(search)) {
                System.out.println("The student details is present at the" + l + "th location.");
                System.out.println("Details of the " + l + " student.");
                System.out.println("The Name is: " + students[l][0]);
                System.out.println("The Register Number is: " + students[l][1]);
                System.out.println("The e-mail ID is: " + students[l][2]);
                System.out.println("The Class ID is: " + students[l][3]);
                System.out.println("The Department ID is: " + students[l][4]);
            } 
        }
        return students;
    }
    public static void main(String[] args) {
        int choice = 1;
        String[][] students = new String[1024][5];
        Scanner scan = new Scanner(System.in);
        Scanner scan1 = new Scanner(System.in);
       do {
            System.out.println(
                    "Enter the choice. \n 1. Collect details of a student. \n 2. Display the details of a student. \n 3. Search the details of a student. ");
            int ch = scan.nextInt();
            switch (ch) {
                case 1:
                    students = collectDetails(students);break;
                case 2:
                    displaydeatils(students); break;
                case 3:
                    searchthedetails(students);break;

            }
            System.out.println("*****************************");
            System.out.println("Do you wish to continue[1/2].");
            choice = scan1.nextInt();
        } while (choice == 1);
    }
}