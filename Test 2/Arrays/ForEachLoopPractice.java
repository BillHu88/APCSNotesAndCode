public class ForEachLoopPractice{
	public static void main(String[] args) {
		int[] test = {1,2,3,4};
		int[][] testTwo = {
			{1,2,3},
			{1,2,3},
			{1,2,3}
		};
		//System.out.println(sumOfAll(test));
		System.out.println(TwoDSum(testTwo));
	}
	public static int OneDSum(int[] array){
		int sum = 0;
		for(int s: array){
			sum+=s;
		}
		return sum;
	}
	public static int TwoDSum(int[][] t){
		int mySum = 0;
		for(int i = 0; i<t[0][].length; i++){
			mySum += OneDSum(t[0][]);
		}
		System.out.println(mySum);
	}
}