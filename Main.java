import java.util.*;


class Employee_Paycheck{
    public String name,id,email;
    public double ctc;
    public int othours;
    
    Employee_Paycheck(String n,String i,String e,double c,int o){
        name=n;
        id=i;
        email=e;
        ctc=c;
        othours=o;
    }
    
    void getDetails(){
        System.out.println("Employee Details : ");
        System.out.println("Name : "+name);
        System.out.println("ID : "+id);
        System.out.println("Email : "+email);
        System.out.println("CTC : "+ctc);
    }
    
}

 

public class Main
{
    public static void main(String[] args) {
        String employee_Name,employee_Id,employee_Email;
        double employee_CTC;
        int OT_Hours;
        Scanner sc = new Scanner(System.in);
        employee_Name=sc.nextLine();
        employee_Id=sc.nextLine();
        employee_Email=sc.nextLine();
        employee_CTC=sc.nextDouble();
        OT_Hours=sc.nextInt();
        
        Employee_Paycheck e = new Employee_Paycheck(employee_Id,employee_Name,employee_Email,employee_CTC,OT_Hours);
        e.getDetails();
        
    }
}