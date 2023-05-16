import java.util.Scanner;

public class Hospitals implements Details {
    String hospital_name;
    String hospital_address;
    int  total_no_doctors=0;
    int no_of_beds=0;
    @Override
    public void set_details(){
        Scanner scan=new Scanner(System.in);
        System.out.println();
        System.out.println("HOSPITAL NAME : ");
        hospital_name=scan.nextLine();
        System.out.println("HOSPITAL ADDRESS : ");
        hospital_address=scan.nextLine();
        System.out.println("TOTAL NO OF DOCTORS : ");
        total_no_doctors=scan.nextInt();
        total_no_doctors++;
        System.out.println("TOTAL NO OF BEDS : ");
        no_of_beds=scan.nextInt();
        no_of_beds++;
    }
    @Override
    public void get_details(){
        System.out.println();
        System.out.println("HOSPITAL NAME : "+hospital_name);
        System.out.println("HOSPITAL ADDRESS : "+ hospital_address);
        System.out.println("TOTAL NO OF DOCTORS : "+total_no_doctors);
        System.out.println("TOTAL BNO OF BEDS : "+ no_of_beds);
    }

}
