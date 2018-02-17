import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class OCR{
private static int[][] aTemplate = {
    		{-1, -1, -1,  0,  0,  1,  1,  0,  0, -1, -1, -1},
    		{-1, -1,  0,  0,  1,  0,  0,  1,  0,  0, -1, -1},
    		{-1, -1,  0,  0,  1,  0,  0,  1,  0,  0, -1, -1},
    		{-1,  0,  0,  1,  1,  0,  0,  1,  1,  0,  0, -1},
    		{-1,  0,  1,  1,  0,  0,  0,  0,  1,  1,  0, -1},
    		{-1,  0,  1,  1,  0, -1, -1,  0,  1,  1,  0, -1},
    		{-1,  0,  1,  1,  0, -1, -1,  0,  1,  1,  0, -1},
    		{-1,  0,  1,  1,  0,  0,  0,  0,  1,  1,  0, -1},
    		{-1,  0,  1,  1,  0,  0,  0,  0,  1,  1,  0, -1},
    		{ 0,  0,  1,  1,  1,  1,  1,  1,  1,  1,  0,  0},
    		{ 0,  1,  1,  0,  0,  0,  0,  0,  0,  1,  1,  0},
    		{ 0,  1,  1,  0,  0,  0,  0,  0,  0,  1,  1,  0},
    		{ 0,  1,  1,  0,  0, -1, -1,  0,  0,  1,  1,  0},
    		{ 1,  1,  0,  0, -1, -1, -1, -1,  0,  0,  1,  1},
    		{ 1,  1,  0,  0, -1, -1, -1, -1,  0,  0,  1,  1},
    		{ 1,  1,  0,  0, -1, -1, -1, -1,  0,  0,  1,  1}
  		};
		private static int[][] bTemplate = {
    		{0,  1,  1,  1,  1,  1,  1,  1,  1,  0,  0,  0},
    		{0,  1,  1,  1,  1,  1,  1,  1,  1,  1,  0,  0},
    		{0,  1,  1,  0,  0,  0,  0,  0,  0,  0,  1,  0},
    		{0,  1,  1,  0, -1, -1, -1, -1,  0,  0,  1,  0},
    		{0,  1,  1,  0, -1, -1, -1, -1,  0,  0,  1,  0},
    		{0,  1,  1,  0,  0,  0,  0,  0,  0,  0,  1,  0},
    		{0,  1,  1,  0,  0,  0,  0,  0,  0,  1,  0,  0},
    		{0,  1,  1,  1,  1,  1,  1,  1,  1,  0,  0,  0},
    		{0,  1,  1,  0,  0,  0,  0,  0,  0,  1,  0,  0},
    		{0,  1,  1,  0,  0,  0,  0,  0,  0,  0,  1,  0},
    		{0,  1,  1,  0, -1, -1, -1, -1,  0,  0,  1,  0},
    		{0,  1,  1,  0, -1, -1, -1, -1,  0,  0,  1,  0},
    		{0,  1,  1,  0, -1, -1, -1, -1,  0,  0,  1,  0},
    		{0,  1,  1,  0,  0,  0,  0,  0,  0,  0,  1,  0},
    		{0,  1,  1,  1,  1,  1,  1,  1,  1,  1,  0,  0},
    		{0,  1,  1,  1,  1,  1,  1,  1,  1,  0,  0,  0}
  		};
	public OCR(){
		//12 wide by 16 deep
		
	}

	private static int findVertPosition(int[][] image, int h) {
		int highestSum = 0;
		int row = 0;
		int [] sum = new int[image.length];
		for(int i = 0; i < image.length; i++){
			int temp = 0;
			for(int light: image[i])
				temp += light;
			sum[i] += temp;
			}
			/*
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
			
		}*/
		int minRow = 0, minSum = 0;
		for(int r = 0; r <= image.length - h; r++)
		{
	      int s = 0; // access individual elements of sum
	      for(int k = r; k < r + h; k++)
	      {
			s += sum[k];
			if( minSum == 0 || s < minSum)
			{
				minSum = s;
				minRow = r;
			}
	      }
		}
		return minRow;
	}
	private static int findHorzPosition(int[][] image, int row0, int h, int w) {
		int numRows=image.length;
		int numCol=image[0].length;
		int[] sum = new int[numCol];
		for(int c = 0; c<numCol; c++){
			int s = 0;
			for(int r = row0; r<row0+h; r++){
				s+= image[r][c];
				sum[c]=r;
			}
		}
		int minCol = -1, minSum = -1;
		for(int c = 0; c <= image[0].length - w; c++)
		{
	      int s = 0; // access individual elements of sum
	      for(int k = c; k < c + w; k++)
	      {
			s += sum[k];
			if( minSum == -1 || s < minSum)
			{
				minSum = s;
				minCol = c;
			}
	      }
		}
		return minCol;
	}
	private double match(int[][] image, int[][] template, int row, int col){
		int n = (template.length)*(template[0].length);
		double avgImage = 0.0, avgTempl = 0.0;
		for(int r = 0; r<template.length; r++){
			for(int c = 0; c<template[0].length; c++){
				avgImage+=image[r+row][c+col];
				avgTempl+=template[r][c];
			}
		}
		avgImage/=n;
		avgTempl/=n;
		double sigmaImage=0.0, sigmaTempl=0.0, cov = 0.0;
		for(int ro = 0; ro<template.length; ro++){
			for(int co = 0; co<template[0].length; co++){
				double d1 = image[ro+row][co+col]-avgImage;
				double d2 = template[ro][co]-avgTempl;
				sigmaImage+=d1*d1;
				sigmaTempl+=d2*d2;
				cov += d1*d2;
			}
		}
		sigmaImage = Math.sqrt(sigmaImage/n);
		sigmaTempl = Math.sqrt(sigmaTempl/n);
		cov /= n;
		double corr = -cov/(sigmaImage*sigmaTempl);
		return corr;
	}
	private static double average(int[][] array){
        int counter=0;
        double sum = 0;
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                sum = sum+array[i][j];
                counter++;
            }
        }

        return sum / counter;
    }

	public char ocr(int[][]image){
		int h = aTemplate.length;
		int w = aTemplate[0].length;
		int row0 = findVertPosition(image, h);
		int col0 = findHorzPosition(image, row0, h, w);
		double matchA = match(image, aTemplate, row0, col0);
		double matchB = match(image, bTemplate, row0, col0);

		if(matchA > matchB)
		 return 'A';
		else if (matchB > matchA)
		 return 'B';
		else
		 return '?';
	}
	private int[][] loadImage(String fileName, int rows, int cols){
		File file = new File(fileName);
		Scanner input = null;
		try{
			input = new Scanner(file);
		}
		catch (FileNotFoundException ex){
			System.out.println("*** Can't open " + fileName + " ***");
			System.exit(1);
		}
		int[][] image = new int[rows][cols];
		input.nextLine();
		input.nextLine();
		input.nextLine();

		int r = 0, c = 0;
		while(input.hasNextInt()){
			if(r>=rows){
				System.out.println("Too many numbers in the image file");
				input.close();
				System.exit(1);
			}
			image[r][c]=input.nextInt();
			c++;
			if(c==cols){
				c=0;
				r++;
			}
		}
		if(c!=0 || r!=rows){
			System.out.println("Too many numberse in the image file");
			input.close();
			System.exit(1);
		}
		input.close();
		return image;
	}
	public static void main(String[] args)
	{
		OCR test = new OCR();
		for(int k = 1; k <= 6; k++)
		{
			String fileName = "Image" + k + ".pgm";
			int[][] image = test.loadImage(fileName, 24, 20);
			System.out.println(fileName + ": " + test.ocr(image));
		}
	}
}