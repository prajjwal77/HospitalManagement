import java.sql.SQLOutput;
import java.util.Scanner;

interface Details{
    public void get_details();
    public void set_details();
}
public class Main {
    static  void main_menu(){
        System.out.println();
        System.out.println("**************************** *** WELCOME TO HOSPITAL MANAGEMENT APP *** **************************");
        System.out.println();
        System.out.println("***************************** *** ENTER YOUR CHOICE *** ******************************************");
        System.out.println();
        System.out.println("1].ADD HOSPITAL \t\t\t 2].ADD DOCTORS \t\t\t 3].ADD MEDICINES \t\t\t 4].ADD PATIENTS ");
        System.out.println();
        System.out.println("5].GET HOSPITAL \t\t\t 6].GET DOCTORS \t\t\t 7].GET MEDICINES \t\t\t 8].GET PATIENTS");
        System.out.println();
       // System.out.println("R].ADD REPORT \t\t\t r]. GET REPORT ");
        System.out.println("*************************** *** ENTER 0 TO EXIT *** ********************************************  ");
        System.out.println();
    }
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        Hospitals hospitals[]=new Hospitals[10];
        Doctors doctors[]=new Doctors[10];
        Medicines medicines[]=new Medicines[10];
        Patients patients[]=new Patients[10];
       // Report report[]=new Report[10];
        int hospital_count=0;
        int doctors_count=0;
        int medicines_count=0;
        int patients_count=0;
     //  int report_count=0;
        int choice=10; // by Default
        while(choice!=0){
            main_menu();
            choice=scan.nextInt();
            while(choice!=9&& choice!=0){
                switch (choice){
                    case 1:hospitals[hospital_count]=new Hospitals();
                            hospitals[hospital_count].set_details();
                            hospital_count++;
                            System.out.println();
                            System.out.println("1]. ADD NEW HOSPITALS");
                            System.out.println("9]. GO BACK TO MAIN MENU");
                            choice=scan.nextInt();
                            break;
                    case 2: doctors[doctors_count]=new Doctors();
                            doctors[doctors_count].set_details();
                            doctors_count++;
                            System.out.println();
                            System.out.println("2].ADD NEW DOCTORS ");
                            System.out.println("9]. GO BACK TO MAIN MENU");
                            choice=scan.nextInt();
                            break;
                    case 3:medicines[medicines_count]=new Medicines();
                            medicines[medicines_count].set_details();
                            medicines_count++;
                            System.out.println();
                            System.out.println("3].ADD NEW MEDICINES ");
                            System.out.println("9]. GO BACK TO MAIN MENU");
                            choice=scan.nextInt();
                            break;
                    case 4:patients[patients_count]=new Patients();
                            patients[patients_count].set_details();
                            patients_count++;
                            System.out.println();
                            System.out.println("4]. ADD NEW PATIENTS ");
                            System.out.println("9]. GO BACK TO MAIN MENU");
                            choice=scan.nextInt();
                            break;
                    case 5:for(int i=0;i<hospital_count;i++) {
                        doctors[i].get_details();
                        System.out.println();
                        System.out.println();
                    }
                        System.out.println();
                        System.out.println("9].GO BACK TO MAIN MENU ");
                        System.out.println("0].EXIT");
                        choice=scan.nextInt();
                        break;
                    case 6: for(int i=0;i<doctors_count;i++){
                        doctors[i].get_details();
                        System.out.println();
                        System.out.println();
                    }
                        System.out.println();
                        System.out.println("9].GO BACK TO MAIN MENU ");
                        System.out.println("0]. EXIT");
                        choice=scan.nextInt();
                        break;
                    case 7: for(int i=0;i<medicines_count;i++){
                        medicines[i].get_details();
                        System.out.println();
                        System.out.println();
                    }
                        System.out.println();
                        System.out.println("9].G0 BACK TO MAIN MENU ");
                        System.out.println("0]. EXIT");
                        choice=scan.nextInt();
                        break;
                    case 8: for(int i=0; i<patients_count;i++){
                        patients[i].get_details();
                        System.out.println();
                        System.out.println();
                    }
                        System.out.println();
                        System.out.println("9].GO BACK TO MAIN MENU");
                        System.out.println("0]. EXIT");
                        choice=scan.nextInt();
                        break;
                    default:
                        System.out.println("ENTER VALID CHOICE ");
                        break;
                }
            }

        }
    }
}