/*
 * Reverse bits of a given 32 bits unsigned integer.

For example, given input 43261596 (represented in binary as 00000010100101000001111010011100),
 return 964176192 (represented in binary as 00111001011110000010100101000000).
 */
public class ReverseBit {
	public int reverseBits(int n)
	{
		int rev = 0;
		for (int i = 0; i < 32; i++)
		{
			rev = (rev << 1);
			int bit = n & 1;
			rev = rev + bit;
			n = n >>> 1;
		}
		return rev;
	}

}
