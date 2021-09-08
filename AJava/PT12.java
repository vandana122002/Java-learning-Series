package AJava;

class Faculty
{
    private String name;
    float basicSalary;
    float bonusPercentage;
    float carAllowancePercentage;
    Faculty(String name,float basicSalary)
    {
        this.name=name;
        this.basicSalary=basicSalary;
    }
    float calculateSalary()
    {
        return basicSalary+bonusPercentage+carAllowancePercentage;
    }
    String getName()
    {
        return name;
    }
    void setName(String name)
    {
        this.name=name;
    }
    float getBasicSalary()
    {
        return basicSalary;
    }
    float setBasicSalary()
    {
        return basicSalary;
    }

    float getBonusPercentage()
    {
        return basicSalary;
    }

    void setBonusPercentage(float bonusPercentage)
    {
        this.bonusPercentage=bonusPercentage;
    }

    float getCarAllowancePercentage()
    {
        return carAllowancePercentage;
    }

    void setCarAllowancePercentage(float carAllowancePercentage)
    {
        this.carAllowancePercentage=carAllowancePercentage;
    }
}

class OfficeStaff extends Faculty
{
    private String designation;
    OfficeStaff(String name,float basicSalary,String designation)
    {
        super(name,basicSalary);
        this.designation=designation;
    }
    String getDesignation()
    {
        return designation;
    }
    void setDesignation(String designation)
    {
        this.designation=designation;
    }
    float calculateSalary()
    {
        if(designation=="Accountant")
        {
            return getBasicSalary()+100000;
        }else if(designation=="Clerk")
        {
            return getBasicSalary()+7000;
        }else if(designation=="Peon")
        {
            return getBasicSalary()+4500;
        }else
        {
            return getBasicSalary();
        }
    }
}

class Teacher extends Faculty
{
    private String qualification;
    Teacher(String name,float basicSalary,String qualification)
    {
        super(name,basicSalary);
        this.qualification=qualification;
    }
    String getQualification()
    {
        return qualification;
    }
    void setQualification(String qualification)
    {
        this.qualification=qualification;
    }
    float calculateSalary()
    {
        if(qualification=="Doctoral")
        {
            return getBasicSalary()+200000;
        }else if(qualification=="Masters")
        {
            return getBasicSalary()+18000;
        }else if(qualification=="Bachelors")
        {
            return getBasicSalary()+15500;
        }else if(qualification=="Associate")
        {
            return getBasicSalary()+100000;
        }else
        {
            return getBasicSalary();
        }
    }
}
public class PT12 {
    public static void main(String[] args)
    {
        Faculty f1=new Faculty("Rakhi",2000.0f);
        System.out.println(f1.getName());
        System.out.println(f1.getBasicSalary());

        OfficeStaff os=new OfficeStaff("Rakhi",2000.0f,"Office Staff");
        System.out.println(os.getDesignation());

        Teacher t=new Teacher("Rakhi",2000.0f,"Teacher");

        System.out.println(t.getQualification());
    }
}
