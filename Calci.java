import java.util.Scanner;
interface Calci {
  int sum(int n1, int n2);
 }
class SubClass implements Calci
{
public int sum(int n1, int n2)
{
		return n1 + n2;
 }
}
class Driver {
	public static void main(String[] args)
   {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 Numbers to Find Sum");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		SubClass i1 = new SubClass();
		int sum = i1.sum(n1, n2);
		System.out.println(n1 + "+" + n2 + " = " + sum);
		sc.close();
	}
}
