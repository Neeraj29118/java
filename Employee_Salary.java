import java.util.Scanner;
class Employee_Salary
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Baaic Salary:");
        float bs = input.nextFloat();
        float hra,da,gs;
        if(bs<1500)
        {
            hra=bs*0.1f;
            da=bs*0.9f;
        }
        else
        {
            hra=bs*0.2f;
            da=bs*0.8f;
        }
        gs=bs+hra+da;
        System.out.println("Gross Salary Rs."+gs);
    }
}