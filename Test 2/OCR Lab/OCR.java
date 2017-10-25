public class OCR{

	private static int findVertPosition(int[][] image, int h) {
		int highestSum = 0;
		int row = 0;
		int [] sum = new int[image.length];
		for(int i = 0; i < image.length; i++){
			int temp = 0;
			for(int n = 0; n < image[0].length; n++){
				temp += image[0][n];
				sum[i] += image [0][n];
			}
			if(temp > highestSum){
				highestSum = temp;
				row = i;
			}
			else if(temp == highestSum){
				row = row;
			}
			else{
				highestSum = highestSum;
			}
		}
		int minRow = -1, minSum = -1;
		for(int r = 0; r <= image.length - h; r++)
		{
	      int s = 0; // access individual elements of sum
	      for(int k = r; k < r + h; k++)
	      {
			s += sum[k];
			if( minSum == -1 || s < minSum)
			{
				minSum = s;
				minRow = r;
			}
	      }
		}
		return minRow;
	}
	private static int findHorzPosition(int[][] image, int row0, int h, int w) {
		return 0;
	}
}