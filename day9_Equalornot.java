import java.util.Scanner;
class equalnumberorornot{
public static void main(String args [])
{
Scanner sc=new Scanner( System.in);
System.out.println("please Enter the 1st number =>  ");
int input1= sc.nextInt();
System.out.println("please Enter the 2nd number =>  ");
int  input2=sc.nextInt();
System.out.println("please Enter the 3rd number=>  ");
int input3 = sc.nextInt();
if( input1==input2 && input2==input3)
{
 System.out.println(" the number is Equal");
}
else
{
System.out.println(" the number is not Equal");
}
}
}