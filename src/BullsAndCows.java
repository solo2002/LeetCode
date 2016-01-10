/*
 * You are playing the following Bulls and Cows game with your friend: You write down a number and ask your 
 * friend to guess what the number is. Each time your friend makes a guess, you provide a hint that indicates 
 * how many digits in said guess match your secret number exactly in both digit and position (called "bulls") 
 * and how many digits match the secret number but locate in the wrong position (called "cows"). Your friend will 
 * use successive guesses and hints to eventually derive the secret number.

For example:

Secret number:  "1807"
Friend's guess: "7810"
Hint: 1 bull and 3 cows. (The bull is 8, the cows are 0, 1 and 7.)
Write a function to return a hint according to the secret number and friend's guess, use A to indicate the bulls 
and B to indicate the cows. In the above example, your function should return "1A3B".

Please note that both secret number and friend's guess may contain duplicate digits, for example:

Secret number:  "1123"
Friend's guess: "0111"
In this case, the 1st 1 in friend's guess is a bull, the 2nd or 3rd 1 is a cow, and your function should return 
"1A1B".
You may assume that the secret number and your friend's guess only contain digits, and their lengths are always 
equal.
 */
public class BullsAndCows {
	public String getHint(String secret, String guess) {
    int len = secret.length();
    int numOfBull = 0;
    int numOfCow = 0;
    boolean[] a =new boolean[len];//for labeling the letter that has been used in secret 
    boolean[] b = new boolean[len];//for labeling the letter that has been used in guess 
    //find num of bulls
    for (int i = 0; i < len; i++)
    {
        if (secret.charAt(i) == guess.charAt(i))
        {
            numOfBull++;
            a[i] = true;
            b[i] = true; //this letter has been used, so it could be skipped
        }
    }
    //find num of cows
    first:
    for (int i = 0; i < len; i++)
    {
        if (a[i])
            continue; //this letter has been used
        else
        {
            for (int j = 0; j < len; j++)
            {
                if (b[j])
                    continue;
                else
                    if (secret.charAt(i) == guess.charAt(j))//cow
                    {
                        numOfCow++;
                        a[i] = true;
                        b[j] = true;
                        continue first;//at this time a[i] is used, so we have to continue scan secret
                    }
            }
        }
    }
    String sb = numOfBull + "A" + numOfCow + "B";
    return sb;
}
	// a better one
	public String getHint2(String secret, String guess)
	{
		int len = secret.length();
    int numOfBull = 0;
    int numOfCow = 0;
    int[] s = new int[10];
    int[] g = new int[10];
    for (int i = 0; i < len; i++)
    {
    	char a = secret.charAt(i);
    	char b = guess.charAt(i);
    	if (a == b)
    		numOfBull++;
    	else
    	{
    		s[a - '0']++;
    		s[b - '0']++;
    	}
    }
    for (int i = 0; i < 10; i++)
    {
    	numOfCow = numOfCow + Math.min(s[i], g[i]);
    }
    String result = numOfBull + "A" + numOfCow + "B";
    return result;
	}
 public static void main(String[] args)
 {
	 String s = "1";
	 s = s + "2";
	 System.out.println(s);
 }
}
