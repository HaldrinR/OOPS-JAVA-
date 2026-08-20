class Student{
    String name;
    int id;
    Student(String name, int id)
    {
        this.name=name;
        this.id=id;
    }
    Student(Student obj2)
    {
        this.name=obj2.name;
        this.id=obj2.id;
    }
}
public class CopyConstructor{
    public static void main(String[]args){
        System.out.println("First Object");
        Student st1=new Student("Lia",99);
        System.out.println("Student 1:"+st1.name+" and ID "+st1.id);
        System.out.println();
        Student st2 = new Student(st1);
        System.out.println("Copy constructor using second object");
        System.out.println("Student 2:"+st2.name+" and ID "+st2.id);
    }
}
