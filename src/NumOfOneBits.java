/*
 * Write a function that takes an unsigned integer and returns the number of ’1' bits it 
 * has (also known as the Hamming weight).

For example, the 32-bit integer ’11' has binary representation 
00000000000000000000000000001011, so the function should return 3.
 */
public class NumOfOneBits {
//you need to treat n as an unsigned value
  public int hammingWeight(int n)
  {
  	int counter = 0;
  	for (int i = 0; i < 32; i++)
  	{
  		if ((n&1) == 1)// note (n&1): ( ) necessary
  			counter++;
  		n = n >>> 1;//unsign left shift, add 0
  	}
  	return counter;
  }
 
}
