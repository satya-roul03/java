import java.io.*;
class astro
{
    public static void main(String args[])throws IOException
    {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        int num,astro=0,temp,rem;
        System.out.println("Enter a number : ");
        num=Integer.parseInt(bf.readLine());
       temp=num;
        while(num>0)
        {
            rem=num%10;
            num=num/10;
            astro=astro+(rem*rem*rem);
        }
        if(astro==temp)
        {
            System.out.println(temp+" is a armstrong number");
        }
        else
        {
            System.out.println(temp+" is not armstrom number");
        }
    }
}