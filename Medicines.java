import java.util.Scanner;

public class Medicines implements Details {
     int n=0;

    String  medicine_name[]=new String[50];
    @Override
    public void set_details(){
    Scanner sc=new Scanner(System.in);
    System.out.println("ENTER NO OF MEDICINE YOU WANT ;");
    n= sc.nextInt();
    for(int i=0;i<n;i++){
        medicine_name[i]=sc.nextLine();
    }
}
    @Override
public void get_details(){
    System.out.println();
    System.out.println("TOTAL "+n+"MEDICINES ARE AVAILABLE :");
    for(int i=0;i<n;i++){
        System.out.println(medicine_name[i]);
    }
}
}
