/*
 * Description:

Count the number of prime numbers less than a non-negative number, n.
 */
public class CountPrimes {
	public static int countPrimes(int n) {
    if ( n <= 1)
        return 0;
    if (n == 2)
        return 1;
    int counter = 1;
    for (int i = 3; i <= n; i++)
    {
        if (isPrime(i))
        {
        	System.out.println("prime: " + i);
            counter++;
        }
    }
    return counter;
}
public static boolean isPrime(int m)
{
    for(int i = 2; i * i <= m; i++)
    {
        if (m % i == 0)
            return false;
    }
    return true;
}
public static int countPrimes2(int n)
{//more efficient
	if (n <= 2)
		return 0;
	
	boolean[] isPrime = new boolean[n];
	for (int i = 2; i < n; i++)
		isPrime[i] = true;
	for (int i = 2; i * i < n; i++)
	{
		if (!isPrime[i]) continue;
		for (int j = i * i; j < n; j = j + i)
			isPrime[j] = false;
	}
	int counter = 0;
	for (int i = 2; i < n; i++)
		if (isPrime[i]) counter++;
	return counter;
}
public static void main(String[] args)
{
	System.out.print(countPrimes2(10));
}
}
