import java.util.Scanner;

public class Patients implements Details{
    String  p_name;
    int  p_age;
    int p_bp;
    int p_weight;
    String p_disease;
    @Override
    public void set_details(){
        Scanner scan=new Scanner(System.in);
        System.out.println();
        System.out.print("PATIENTS NAME :");
        p_name=scan.nextLine();
        System.out.println();
        System.out.print("PATIENTS AGE : ");
        p_age=scan.nextInt();
        System.out.println();
        System.out.print("PATIENTS BLOOD PRESSURE : ");
        p_bp=scan.nextInt();
        System.out.println();
        System.out.print("PATIENTS BODY WEIGHT : ");
        p_weight=scan.nextInt();
        System.out.println();
        System.out.print(" PATIENTS  DISEASES :");
        p_disease=scan.nextLine();
        System.out.println();
    }
    @Override
    public void get_details(){
        System.out.println("PATIENTS NAME : "+p_name);
        System.out.println("PATIENTS AGE : "+p_age);
        System.out.println("PATIENTS BLOOD PRESSURE : "+ p_bp);
        System.out.println("PATIENTS BODY WEIGHT : "+ p_weight);
        System.out.println("PATIENTS DISEASE : " + p_disease);
    }
}
