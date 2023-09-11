interface Calci
{
  int sum(int n1, int n2);
}
class SubClass implements Calci
{
public int sum(int n1, int n2)
  {
		return n1 + n2;
	}
}