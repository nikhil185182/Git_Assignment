import java.util.*;
class CTC{
    public double base,allowances,insurance,joining,relocation;
    CTC(double b,double a,double i,double j,double r){
        base=b;
        allowances=a;
        insurance=i;
        joining=j;
        relocation=r;
    }
}


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

       CTC getCTC_Details(){
        double base,allowances,insurance,joining,relocation;
        base=(ctc*45)/100;
        allowances=(ctc*30)/100;
        insurance=(ctc*5)/100;
        joining=(ctc*10)/100;
        relocation=(ctc*10)/100;
        System.out.println("Base: "+base);
        System.out.println("Allowances: "+allowances);
        System.out.println("Insurance: "+ insurance);
         System.out.println("Joining_bonus: "+joining);
         System.out.println("Relocation: "+relocation);
       
       
       
        CTC k = new CTC(base,allowances,insurance,joining,relocation);
        return k;
    }
    
    void getTax_Details(double income){
        double tax=0;
        if (income >= 250000 && income <= 500000){
            tax = tax + 0.05 * (income - 250000);
        }

        if (income >= 500000 && income <= 1000000){
            tax = tax + 0.20 * (income - 500000);
        }

        if (income >= 1000000){
            tax = tax + 0.30 * (income - 1000000);
        }
        
        System.out.println("Total tax = "+tax);
    }
    void getOverTime_Details(double base)
    {
	int comp_offs=0;
	double ot_pay=0.0;
	if(othours>30 )
	{
		comp_offs=((othours-30)*2)/8;
		ot_pay=(((base/12)/20)/8)*30+(((base/12)/20)/16)*30;
	}
	else
	{
		ot_pay=(((base/12)/20)/8)*othours+(((base/12)/20)/16)*othours;
	}
	System.out.println(name+" holding id "+id+" has worked over time for "+othours+" hours and earned Rs. "+ot_pay+" with "+comp_offs+" comp offs in a month");
    }
    
}

 

public class Main
{
    public static void main(String[] args) {
        String employee_Name,employee_Id,employee_Email;
        double employee_CTC;
        int OT_Hours;
        Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Employee Details");
        
        System.out.println("Enter Employee  Name");
        employee_Name=sc.nextLine();
        
        System.out.println("Enter Employee ID");
        employee_Id=sc.nextLine();
        
        System.out.println("Enter Employee Email");
        employee_Email=sc.nextLine();
        
        System.out.println("Enter Employee CTC");
        employee_CTC=sc.nextDouble();
        
        System.out.println("Enter Employee OverTime Hours");
        OT_Hours=sc.nextInt();
        
        Employee_Paycheck e = new Employee_Paycheck(employee_Id,employee_Name,employee_Email,employee_CTC,OT_Hours);
        e.getDetails();
        

        CTC c = e.getCTC_Details();
        
        e.getTax_Details(c.base+c.allowances);
	e.getOverTime_Details(c.base);
        
    }
}
