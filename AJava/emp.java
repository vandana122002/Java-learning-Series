package AJava;

import java.util.Scanner;

public class emp {
    static class Employee
    {
        private int id;
        private String name;
        private String department;
        private int Salary;
        Employee()
        {

        }
        Employee(int id,String name,int Salary,String department)
        {
            this.id=id;
            this.name=name;
            this.department=department;
            this.Salary=Salary;
        }
        public void display()
        {
            System.out.println("Name is "+name);
            System.out.println("Id is "+id);
            System.out.println("Department is "+department);
        }
    }

    static class Manager extends Employee
    {
        private int bonus;
        Manager(int id,String name,int Salary,String department,int bonus)
        {
            super(id, name,Salary, department);
            this.bonus=bonus;
        }
        public void display()
        {
            super.display();
            System.out.println("Bonus is "+bonus);
        }
    }
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the no of Employees");
        int maxbonus=0,occ=0;
        int num=scan.nextInt();
        Manager[] m=new Manager[num];
        for(int i=0;i<num;i++)
        {
            System.out.println("Enter id ");
            int id= scan.nextInt();
            scan.nextLine();
            System.out.println("Enter name");
            String name=scan.nextLine();
            System.out.println("Enter Salary");
            int sal=scan.nextInt();
            scan.nextLine();
            System.out.println("Enter department");
            String department=scan.nextLine();
            System.out.println("Enter Bonus");
            int bonus=scan.nextInt();
            if(maxbonus<bonus)
            {
                maxbonus=bonus+sal;
                occ=i;
            }
            Manager m1=new Manager(id,name,sal,department,bonus);
            m[i]=m1;
        }
        m[occ].display();
    }
}
