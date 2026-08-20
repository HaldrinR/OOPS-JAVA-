import java.util.Scanner;
class Employee{
    float salary;
    float da;
    float hra;
    float pf;
    int ID;
    String name;
    void detail(String n,float s){
        name = n;
   //     ID = i;
        salary = s;
    }
    void DA()
    {
        this. da =this.salary *(float) (0.10);
        this.salary=this.salary + da;
   //     System.out.println("Salary is " +this.salary);

    }
    void HRA()
    {
        this. hra = this.salary *(float) (0.15);
        this.salary = this.salary + hra;
  //     System.out.println("Salary is " +this.salary );

    }
    void PF()
    {
        this. pf = this.salary *(float) (0.05);
        this.salary =this.salary- pf;
//     System.out.println("Salary is " + this.salary );

    }
    void Sal()
    {
        System.out.println("Salary is " + salary );
    }
}
    public class Main {
        public static void main(String[]args)
        {
            Employee e = new Employee();
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your name: ");
            String name = sc.nextLine();
            System.out.println("Enter your salary: ");
            int salary = sc.nextInt();
            e.detail(name,salary);
            e.DA();
            e.HRA();
            e.PF();
            e.Sal();


        }
    }