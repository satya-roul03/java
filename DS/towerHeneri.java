import java.util.Scanner;
class towerHeneri
{
    public static void towerhen(int n,String src,String helper,String deft)
    {
        if(n==1)
        {
            System.out.println(n+" disk trasfer from "+src+" to "+deft);
            return;
        }
        towerhen(n-1,src,deft,helper);
        System.out.println(n+" disk transfer from "+src+" to "+helper);
        towerhen(n-1,helper,src,deft);

    }
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the number of disk: ");
        int n=in.nextInt();
        towerhen(n,"A","B","C");
    }
}
