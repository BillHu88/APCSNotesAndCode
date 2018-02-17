public class perfect{
	public static void main(String[] args){
		findNums();
	}

	public static int num1;
	public static int num2;
	public static int num3;
	public static int num4;


	public static boolean isPerfect(int x){
		int temp = 0;
		for(int i = 1;i<x;i++){
			if(x%i==0){
				temp += i;
			}
			else{

			}
		}
		if(temp==x){
			return true;
		}
		else{
			return false;
		}
	}

	public static int perfCount = 0;

	public static void findNums(){
		
		for(int i=1;perfCount<=3;i++){
			if(perfCount==3){
				num3=i;
				if(isPerfect(i)){
				perfCount++;
				}
				else{
					System.out.println(i + " is not perfect");
				}
			}
			if(perfCount==2){
				if(isPerfect(i)){
				num3=i;
				perfCount++;
				}
				else{
					System.out.println(i + " is not perfect");
				}
			}
			if(perfCount==1){
				if(isPerfect(i)){
				num2=i;
				perfCount++;
				}
				else{
					System.out.println(i + " is not perfect");
				}
			}
			if(perfCount==0){
				if(isPerfect(i)){
				num1=i;
				perfCount++;
				}
				else{
					System.out.println(i + " is not perfect");
				}
			}
			
			
			
			
		}
		System.out.println("The first four perfect nums are " + num1 + " " + num2 + " " + num3 + " " + num4);
	}
}