
public class NChooseK {
	public static void main(String[] args) {
		System.out.println(binomialCoeff(2,1)); //2
		System.out.println(binomialCoeff(2,2)); //1
		System.out.println(binomialCoeff(3,2)); //3
		System.out.println(binomialCoeff(4,3)); //4
	}
	/*Complete the following recursive method binomialCoeff(), 
	 * which computes a specified binomial coefficient
	 */
	
	//Returns the value of the binCoeff C(n,k)
	//Precondition: 0<=k<=n
	public static int binomialCoeff(int n, int k) {
		if(k==n || (k==0)) //if something choose itself then always 1 and something choose 0 is 1 too
			return 1;
		else
			return binomialCoeff(n-1,k-1)+binomialCoeff(n-1,k);
	}
}
