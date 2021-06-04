package solution;

import java.util.HashMap;
import java.util.Scanner;

;

public class solution1 {
	  public static void main(String[] args) {
		   
		  
	        Scanner sc =new Scanner(System.in);
	        int[] colors=new int[101];
	        int pair=0;
	        int n=sc.nextInt();
	        for(int i=0;i<n;i++){
	            int color=sc.nextInt();
	            colors[color]++;
	            if(colors[color]%2 != 0){
	                pair++;
	                colors[color] = 0;
	            }
	        }
	        System.out.println(pair);
		   
		  }

}
