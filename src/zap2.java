
public class zap2 {
 public static int numOfCho(int k)
 {
	 int[] num = new int[k+1];
	 num[0] = 0;
	 num[1] = 0;
	 for(int i = 2; i < k+1; i++)
	 {
		 num[i] = num[i - 1] + i/2;
	 }
	 return num[k];
 }
 public static void numOfCho2(int[] arr)
 {
	 for(int i:  arr)
	 {
		 if(i%2 == 0)
		 {
			 long num = (i/2) * (i/2);
			 System.out.println((int) num);
		 }
		 else
		 {
			 long n = (i/2) * (i/2 + 1);
			 System.out.println((int) n);
		 }
	 }
 }
 public static void main(String[] args)
 {
	 System.out.println(numOfCho(7));
 }
}
