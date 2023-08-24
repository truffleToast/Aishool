package ex06ArrayList;

import java.io.*;
import java.util.ArrayList;
public class 일부터100까지의완전수 {
	
    public static void main(String args[]) {
		
        // 주의 - 출력예시를 보고 예시에 맞게 출력을 하시오.
        //        출력예시 코드 복사 가능
        System.out.print("1부터 10000까지의 완전수는:");
        ArrayList<Integer> numbers= new ArrayList<>(); //새로운 어레이리스트 생성 숫자를 담을 칸
         // 새로운 어레이리스트 생성 이건 약수를 담을 칸.
        for (int i=2; i<=10000; i++){
            for (int j=1; j<= i ; j++){
                ArrayList<Integer> factors= new ArrayList<>();
                int sum=0;
                if (i%j==0) {
                	factors.add(j);
                    for(int k=0; k< factors.size()-1; k++){
                        sum+=factors.get(k);
                    }
                    if(sum==i) {
                    	numbers.add(sum);
                    }
                }

            }
            for(int g=0; g< numbers.size();g++){
                System.out.print(numbers.get(g)+", ");
        }
       
        }
        
	}

}
