import java.util.Scanner;
public class Lab1 {
    public static void main(String[] args){
        // Accepting various attributes of the employee
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the name of the Employee.");
        String name = scan.nextLine();
        System.out.println("Enter the age of the Employee.");
        int age = Integer.parseInt(scan.nextLine());
        System.out.println("Enter the gender of the Employee.");
        String gen = scan.nextLine();
        System.out.println("Enter the state of the Employee.");
        String state = scan.nextLine();
        System.out.println("Enter the company the Employee works at.");
        String com = scan.nextLine();
        System.out.println("Enter the salary of the Employee.");
        Float salary = scan.nextFloat();

        //Printing the details of the employee
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("Employee Name: "+name);
        System.out.println("Employee Age: "+age);
        System.out.print("Employee Gender: ");
        
        // Checking whether the employee is male or female using if-else statements
        if(gen == "f"){
            System.out.println("FEMALE");
        }
        else{
            System.out.println("Male");
        }

        // To display where the employee lives and also the preferable work location for the employee using switch case
        switch(state){
            // Central
            case "Chattisgarh", "Madhya Pradesh":
                System.out.println("The Employee is from the central states of India; Preferable work location is in " + state);
                break;
            
            // North
            case "Jammu and Kashmir", "Himachal Pradesh", "Punjab", "Uttarakhand", "Haryana", "Delhi", "Rajasthan", "Uttar Pradesh", "Chandigarh":
                System.out.println("The Employee is from the northern states of India; Preferable work location is in " + state);
                break;
            
            // East
            case "West Bengal", "Bihar", "Jharkhand", "Nagaland", "Manipur", "Meghalaya", "Tripura", "Arunachal Pradesh", "Assam", "Mizoram", "Sikkim":
                System.out.println("The Employee is from the eastern states of India; Preferable work location is in " + state);
                break;

            // West
            case "Gujarat", "Goa", "Maharashtra":
                System.out.println("The Employee is from the western states of India; Preferable work location is in " + state);
                break;

            // South 
            case "Andhra Pradesh", "Karanataka", "Kerala", "Tamil Nadu", "Telangana":
                System.out.println("The Employee is from the southern states of India; Preferable work location is in " + state);
                break;

            default:
                System.out.println("The employee is not from Indian regions and is fine with working anywhere.");
                break;
        }
        
        System.out.println("The company the employee works for: "+com);

        // to check whether the employee works for an MNC or not
        if(com.equals("Facebook") || com.equals("Google") || com.equals("Microsoft") || com.equals("Samsung") || com.equals("IBM") || com.equals("Apple")){
            System.out.println("The employee is working in Top MNC Companies.");
        }
        else{
            System.out.println("The employee doesn't work for an MNC.");
        }
        System.out.println("Salary of the Employee: "+salary);
        System.out.println("-----------------------------------------------------------------------------------------");
}
}
