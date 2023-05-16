import java.util.Scanner;

public class Doctors implements Details{
    String doctors_name;
    String doctor_qualification;
    String  experience;
    String core_qualification;
    @Override
    public void  set_details(){
        Scanner scan=new Scanner(System.in);
        System.out.println("DOCTORS NAME :");
        doctors_name=scan.nextLine();
        System.out.println("DOCTORS QUALIFICATION : ");
        doctor_qualification=scan.nextLine();
        System.out.println("WORK EXPERIENCE (in years) : ");
        experience=scan.nextLine();
        System.out.println("CORE QUALIFICATION :");
        core_qualification=scan.nextLine();
        System.out.println();
    }
    @Override
    public void get_details(){
        System.out.println();
        System.out.println("DOCTOR NAME : "+ doctors_name);
        System.out.println("DOCTOR QUALIFICATION : "+ doctor_qualification);
        System.out.println(" WORK EXPERIENCE (in years) :" + experience);
        System.out.println("CORE QUALIFICATION : "+ core_qualification);
    }
}
