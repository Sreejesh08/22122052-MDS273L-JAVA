import java.util.Scanner;

public class lab4 {
    static int AccNo;
    static String AccHolName;
    static float Bal;
    static Scanner scan = new Scanner(System.in);
    static Scanner scan1 = new Scanner(System.in);

    static void initialize(){
        int mno;
        String email;
        System.out.println("Enter the Account Holder Name :- ");
        AccHolName = scan.nextLine();
        System.out.println("Enter the Account Number :- ");
        AccNo = scan1.nextInt();
        System.out.println("Enter the Existing Balance :- ");
        Bal = Float.parseFloat(scan.nextLine());
    }

    static String[] deposit(){
        float dep;
        float copy;
        String[] depo = new String[1024];
        System.out.println("Enter the Amount you want to deposit :- ");
        dep = scan1.nextInt();
        copy=Bal;
        Bal = Bal+dep;
        depo[0] = "Deposit";
        depo[1] = Float.toString(copy);
        depo[2] = String.valueOf(dep);
        depo[3] = Float.toString(Bal);
        return depo;
    }

    static  String[] withdraw(){
        float wit, copy;
        String[] depo = new String[1024];
        System.out.println("Enter the Amount you want to withdraw :- ");
        wit = scan1.nextInt();
        copy=Bal;
        if(wit>Bal)
            System.out.println("You don't have enough balance!!! ");    
        else
            Bal = Bal-wit;
        depo[0] = "Deposit";
        depo[1] = Float.toString(copy);
        depo[2] = String.valueOf(wit);
        depo[3] = Float.toString(Bal);
        return depo;
    }

    static void transaction(String[][] transact,int i){
        System.out.print("These are you previos transactions:- {");
        for(int j=0;j<i;j++){
            System.out.print("{");
            for(int k=0;k<3;k++){
                System.out.print(transact[j][k]+",");
            }
            System.out.print(transact[j][3]+"}");
        }
        System.out.println("}");
    }

    static void summary(){
        System.out.println("The Account Holder Name :- "+ AccHolName);
        System.out.println("The Account Number :- "+AccNo);
        System.out.println("Balance :- "+Bal);
    }
    public static void main(String[] args) {
        initialize();
        String[] temp = new String[4];
        int choice, i=0;
        String[][] transact = new String[100][100];
        do {
            System.out.println("*****************************");
            System.out.println(
                    "Enter the choice. \n 1. Deposit Money. \n 2. Withdraw Money. \n 3. Show the Transactions. \n 4. Give the Account Summary. ");
            System.out.println("*****************************");
            int ch = scan.nextInt();
            switch (ch) {
                case 1:
                    temp = deposit();
                    transact[i] = temp;
                    i++;
                    break;
                case 2:
                    temp = withdraw(); 
                    transact[i] = temp;
                    i++;
                    break;
                case 3:
                    transaction(transact,i);
                    break;
                case 4:
                    summary();break;
            }
            System.out.println("*****************************");
            System.out.println("Do you wish to continue[1/2].");
            choice = scan1.nextInt();
        } while (choice == 1);
    }
}
