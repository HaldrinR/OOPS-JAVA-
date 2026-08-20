import java.util.Scanner;
class Employee{
    String name;
    int id;
    double Basicsalary, grossSalary,netSalary;
    Employee(String name, int id, double Basicsalary){
        this.name=name;
        this.id=id;
        this.Basicsalary=Basicsalary;
    }
    void calculateSalary(){
        double DA = 0.10 * Basicsalary;
        double HRA = 0.20 * Basicsalary;
        double PF = 0.12 * Basicsalary;
        grossSalary = Basicsalary + DA + HRA;
        netSalary = grossSalary - PF;
    }
    void displayPaySlip(){
        System.out.println("Pay Slip");
        System.out.println("Employee Name: "+ name);
        System.out.println("Employee ID: "+id);
        System.out.println("Basic Salary: "+Basicsalary);
        System.out.println("Gross Salary: "+grossSalary);
        System.out.println("Net Salary: "+netSalary);
    }
}
class Programmer extends Employee
{
    Programmer(String name,int id, double Basicsalary)
    {
        super(name,id,Basicsalary);
    }
}
class AssistantProfessor extends Employee
{
    AssistantProfessor(String name,int id, double Basicsalary)
    {
        super(name,id,Basicsalary);
    }
}
class AssociateProfessor extends Employee
{
    AssociateProfessor(String name, int id, double Basicsalary)
    {
        super(name,id,Basicsalary);
    }
}
public class PaySlip{
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter Employee Name: ");
        String name = sc.nextLine();
        System.out.println("Enter Employee ID: ");
        int id = sc.nextInt();
        System.out.println("Enter Basic Salary: ");
        double salary = sc.nextDouble();
        System.out.println("Select Employee Type: ");
        System.out.println("1.Programmer");
        System.out.println("2.Assistant Professor");
        System.out.println("3.Associate Professor");
        System.out.println("Enter choice: ");
        int choice = sc.nextInt();
        Employee emp;
        switch(choice)
        {
            case 1:
                emp = new Programmer(name,id,salary);
                break;
            case 2:
                emp = new AssistantProfessor(name,id,salary);
                break;
            case 3:
                emp = new AssociateProfessor(name,id,salary);
                break;
            default:
                System.out.println("Invalid choice");
                return;
        }
        emp.calculateSalary();
        emp.displayPaySlip();
        sc.close();
    }
}