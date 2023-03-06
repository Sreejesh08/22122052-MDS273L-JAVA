import java.util.Scanner;
public class lab5 {
    
        static void encrypt(String str){
            String[] arr = new String[1024];
            System.out.println("*****************************");
            System.out.println("The Encrypted message is: ");
            for(int i=0;i<str.length();i++){
                switch(str.charAt(i)){
                    case 'A': System.out.print("X");break; 
                    case 'B': System.out.print("Y");break;
                    case 'C': System.out.print("Z");break;
                    case 'D': System.out.print("A");break;
                    case 'E': System.out.print("B");break;
                    case 'F': System.out.print("C");break;
                    case 'G': System.out.print("D");break;
                    case 'H': System.out.print("E");break;
                    case 'I': System.out.print("F");break;
                    case 'J': System.out.print("G");break;
                    case 'K': System.out.print("H");break;
                    case 'L': System.out.print("I");break;
                    case 'M': System.out.print("J");break;
                    case 'N': System.out.print("K");break;
                    case 'O': System.out.print("L");break;
                    case 'P': System.out.print("M");break;
                    case 'Q': System.out.print("N");break;
                    case 'R': System.out.print("O");break;
                    case 'S': System.out.print("P");break;
                    case 'T': System.out.print("Q");break;
                    case 'U': System.out.print("R");break;
                    case 'V': System.out.print("S");break;
                    case 'W': System.out.print("T");break;
                    case 'X': System.out.print("U");break;
                    case 'Y': System.out.print("V");break;
                    case 'Z': System.out.print("W");break;
                    default: System.out.print(" ");break;
                }
            }
        }
        static void decrypt(String str){
            System.out.println("*****************************");
            System.out.println("The Decrypted message is: ");
            for(int i=0;i<str.length();i++){
                switch(str.charAt(i)){
                    case 'X': System.out.print("A");break;
                    case 'Y': System.out.print("B");break;
                    case 'Z': System.out.print("C");break;
                    case 'A': System.out.print("D");break;
                    case 'B': System.out.print("E");break;
                    case 'C': System.out.print("F");break;
                    case 'D': System.out.print("G");break;
                    case 'E': System.out.print("H");break;
                    case 'F': System.out.print("I");break;
                    case 'G': System.out.print("J");break;
                    case 'H': System.out.print("K");break;
                    case 'I': System.out.print("L");break;
                    case 'J': System.out.print("M");break;
                    case 'K': System.out.print("N");break;
                    case 'L': System.out.print("O");break;
                    case 'M': System.out.print("P");break;
                    case 'N': System.out.print("Q");break;
                    case 'O': System.out.print("R");break;
                    case 'P': System.out.print("S");break;
                    case 'Q': System.out.print("T");break;
                    case 'R': System.out.print("U");break;
                    case 'S': System.out.print("V");break;
                    case 'T': System.out.print("W");break;
                    case 'U': System.out.print("X");break;
                    case 'V': System.out.print("Y");break;
                    case 'W': System.out.print("Z");break;
                    default: System.out.print(" ");break;
                }
            }
        }

    public static void main(String[] args){
        String str;
        int choice;
        Scanner scan = new Scanner(System.in);
        Scanner scan1 = new Scanner(System.in);
        do {
            System.out.println("*****************************");
            System.out.println(
                    "Enter the choice. \n 1. Encrypt \n 2. Decrypt.");
            System.out.println("*****************************");
            int ch = scan.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Enter the message to Encrypted: ");
                    str = scan1.nextLine();
                    encrypt(str); break;
                case 2:
                    System.out.println("Enter the message to Decrypted: ");
                    str = scan1.nextLine();
                    decrypt(str);
                    break;
            }
            System.out.println();
            System.out.println("*****************************");
            System.out.println("Do you wish to continue[1/2].");
            choice = scan.nextInt();
        } while (choice == 1);
}
}


