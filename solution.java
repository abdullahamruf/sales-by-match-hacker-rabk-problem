package solution;

import java.util.HashMap;
import java.util.Scanner;

;

public class solution {
	  public static void main(String[] args) {
		   
		  Scanner sc= new Scanner(System.in);
		  int n = sc.nextInt();
		   HashMap<Integer, Integer> color = new HashMap<Integer, Integer>();

		while(n-->0) {
			int c=sc.nextInt();
	Integer frequeny=color.get(c);
	
    if(frequeny == null) {
        color.put(c, 1);
    }
    else { 
        color.put(c, frequeny + 1);
    }
		}
sc.close();
        
        
        int pairs = 0;
        for(Integer frequency : color.values()) {
            pairs += frequency>>1;
        }
        System.out.println(pairs);
    }
		   
		  }


