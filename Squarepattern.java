package pattern;
import java.util.Scanner;
public class Squarepattern{

public static void main(String args[])
{
int i,row,col=0;
Scanner sc=new Scanner(System.in);
System.out.println("enter number of row");
row=sc.nextInt();
System.out.println("Enter numbrer of colum");
col=sc.nextInt();
for(i=0;i<row;i++){
    for(int j=0;j<col;j++)
    {
 System.out.print("* ");

    }
    System.out.println();
}

}
}