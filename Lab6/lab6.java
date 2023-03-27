import java.io.*;
import java.util.*;

class Student {
    String name, email, Class, regno,phone,dept;

    Student(String regno, String name, String email, String phone, String Class, String dept) {
        this.name = name;
        this.regno = regno;
        this.Class = Class;
        this.email = email;
        this.dept = dept;
        this.phone = phone;
    }

    void Display() {
        System.out.println(this.name + " | " + this.regno + " | " + this.Class + " | " + this.email+" | "+this.dept+" | "+this.phone);
    }
}

public class lab6 {
    static String[] details(){
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Enter the Registration Number,Name, Email, Phone, Class and Department");
        String[] arr =  {scan1.nextLine(),scan1.nextLine(),scan1.nextLine(),scan1.nextLine(),scan1.nextLine(),scan1.nextLine()};
        return arr;
    }
    public static void main(String[] args){
        int i=0;
        String ch;
        Scanner scan = new Scanner(System.in);
        Student[] obj = new Student[100];
        do{
            System.out.println("Enter the choice \n 1. Add a student \n 2. Search a Student \n 3. Update Details \n 4. Display all details ");
            int choice = Integer.parseInt(scan.nextLine());
            switch(choice){
                case 1: 
                    String[] arr = details();
                    obj[i] = new Student(arr[0], arr[1], arr[2], arr[3], arr[4], arr[5]);
                    i++;
                    break;
                case 2:
                    System.out.println("Enter the Student Registraton number to search.");
                    String Search = scan.nextLine();
                    for(int j=0;j<i;j++){
                        if(obj[j].regno.equalsIgnoreCase(Search)){
                            System.out.println(obj[j].name + " | " + obj[j].regno + " | " + obj[j].Class + " | " + obj[j].email+" | "+obj[j].dept+" | "+obj[j].phone);break;
                        }
                        else{
                            System.out.println("Student not found!!!");
                        }
                    }
                    break;
                case 3: 
                    System.out.println("Enter the Registration number where the change needs to made.");
                    Search = scan.nextLine();
                    for(int j=0;j<i;j++){
                        if(obj[j].regno.equalsIgnoreCase(Search)){
                            System.out.println("Enter the what has to be changed \n 1. Name \n 2. Email \n 3. Phone \n 4. Class \n 5. Department");
                            int change = Integer.parseInt(scan.nextLine());
                            System.out.println("Enter the updated detail");
                            switch(change){
                                case 1: 
                                obj[j].name = scan.nextLine();break;
                                case 2:
                                obj[j].email = scan.nextLine();break;
                                case 3:
                                obj[j].phone = scan.nextLine();break;
                                case 4:
                                obj[j].Class = scan.nextLine();break;
                                case 5:
                                obj[j].dept = scan.nextLine();break;
                            }
                            break;
                        }
                        else{
                            System.out.println("Student not found!!!");
                        }
                    }
                    break;
                case 4:
                    for(int j=0;j<i;j++){
                        obj[j].Display();
                    }
                    break;

            }
            System.out.println("Do you wish to continue?[n/y]");
            ch = scan.nextLine();
        }while(ch.charAt(0)=='y');
    }
}
