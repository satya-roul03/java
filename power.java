import java.util.Scanner;
//import java.math.*;
class pwr
{
    int num,e;
    public void power()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number :");
        num=in.nextInt();
        System.out.println("Enter a exponate of the number : ");
        e=in.nextInt();
        int p=1;
        for(int i=1;i<=e;i++)
        {
           p=p*num;
        }
        System.out.println("Power of "+num+" is : "+p);

    }
}
class power
{
    public static void main(String args[])
    {
        pwr obj=new pwr();
        obj.power();
    }
}