package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Ex나머지3052{

	public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	    int[] numberArray = new int[10];
	    for (int i = 0; i < numberArray.length; i++) {
	        numberArray[i] = Integer.parseInt(br.readLine());
	    }
	    for (int i = 0; i < numberArray.length; i++) {
	        numberArray[i] = numberArray[i] % 42;
	    }
	
	    int cnt = 0;
	    for (int i = 0; i < numberArray.length; i++) {
	   
	        for (int j = 1; j <numberArray.length; j++) {
	        	if(i<j) {
	        		if (numberArray[i] == numberArray[j]) {
	        			cnt++;
	        			break;
	        		}
	            }
	        }
	       
	    }
	    bw.write(Integer.toString(cnt));
	    bw.newLine();
	
	    br.close();
	    bw.close();
	}
}	