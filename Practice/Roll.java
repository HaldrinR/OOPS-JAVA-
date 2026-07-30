class employee{
    float salary;
    float da;
    float hra;
    float pf;
    int ID;
    void detail(string n,int i,float s){
        name = n;
        ID = i;
        salary = s;
    }
    void DA(float salary)
    {
        float da = salary * (10/100);
        salary = salary + da;
    }
    void HRA(float salary)
    {
        float hra = salary * (15/100);
        salary = salary + hra;
    }
    void PF(float salary)
    {
        float pf = salary*(5/100);
        salary = salary - pf;
    }
    void Sal()
    {
        System.out.println("Salary is " + salary );
    }
}
   class Main()
     {
        public static void main(String[]args)
        {
            Roll r = new Roll();
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your name: ");
            String name = sc.nextLine();
            System.out.println("Enter your salary: ");
            int salary = sc.nextInt();
            r.DA();
            r.HRA();
            r.PF();
            r.Sal();


        }
    }