import java.util.Scanner;
class Employee{
    double basicsalary;
    double grossalary;
    double net_salary;
    double da;
    double hra;
    double pf;
    Employee(){
        da=0.05 * basicsalary;
        hra=0.10 * basicsalary;
        pf=0.15 * basicsalary;
        grossalary = basicsalary+da+hra;
        net_salary=grossalary-pf;
    }
}
class Programmer extends Employee{
    int bonus;
    Programmer(){
        super();    
    }
    double showPay(){
        return(net_salary);
    }
}
class Associate_Professor extends Employee{
   Associate_Professor
}
public class Progam{
    public static void main(String[]args){
       Programmer p1 = new Programmer();
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter your ID:");
        int id = sc.nextInt();
        System.out.println("Enter your name:");
        String name = sc.nextLine();
        sc.nextLine();
        System.out.println("Enter your basic salary:");
        int sal =sc.nextInt();
        System.out.println("Programmer 1 salary:"+sal);
        // System.out.println("Bonus of Programmer 1:"+p1.bonus);
        // System.out.println("Programmer 1 total pay:"+p1.showPay());
    }

}
//wrong one
