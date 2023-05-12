import java.util.Scanner;
import java.util.Arrays;

public class Lab2 {
    public static void main(String[] args){
        String arr[] = new String[1024];
        int i=0,ch=1,cnt=0,rem=0;
        Scanner scan = new Scanner(System.in);
        do{
           switch(ch){
            case 0: 
            break;

            case 1: 
            System.out.println("Enter the name.");
            String name = scan.nextLine();
            boolean test1= Arrays.asList(arr).contains(name);
            if(test1==true)
            System.out.println("Try again as the Name is already present.");
            else{
            arr[i] = name;
            i++;
            cnt++;
            }
            break;

            case 2:
            System.out.println("Enter the name that needs to be searched : ");
            String search = scan.nextLine();
            for(int z=0;z<cnt;z++){
                if(arr[z].equalsIgnoreCase(search))
                System.out.println("The Name is already present at "+z+" location.");
            }
            break;

            case 3:
            System.out.println("Enter the name that needs to be removed : ");
            String remove = scan.nextLine();
            for(int j=0;j<cnt;j++){
                if(arr[j].equalsIgnoreCase(remove)){
                    arr[j]=null;
                }
            }
            for(int k=0;k<cnt;k++){
                if(arr[k]==null){
                    String x = arr[k];
                    arr[k]=arr[k+1];
                    arr[k+1]=x;
                }
            }
            rem++;
            break;
           } 
           System.out.println("Enter the choice. \n 1. Enter a Name \n 2. Search a name \n 3. Remove a name. \n 0. Quit");
           ch = Integer.parseInt(scan.nextLine());
        }while(ch!=0);
        System.out.print("{");
        for(int l=0;l<cnt-rem;l++)
            System.out.print(arr[l]+",");
        System.out.print("}");
    }
}