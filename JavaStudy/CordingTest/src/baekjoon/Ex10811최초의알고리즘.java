package baekjoon;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Ex10811최초의알고리즘 {

   public static void main(String[] args) throws Throwable, IOException { // BufferedReader는 예외 처리가 필요한데 이는 try-catch문이나 Throwable을 통해서 처리한다.
	      // 바구니 뒤집기(10811)
	      //BufferedReader, BufferedWriter를 활용
	      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	      BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(System.out));
	      //첫째줄에는 정수 n, m이 주어진다. // n, m으로 변수 설정 필요는 없어보이나 두개를 입력받는 작업이 필요
	//      int n= Integer.parseInt(br.readLine());
	//       하나만 받을 때는 가능하지만, 아마도 두개를 받기위해서는 array(배열)에 넣는 작업이 필요하지 않을까?
	//       추가로 공부할 내용 자바에는 .split()이 존재하는가? //Method에 존재한다.
	      StringTokenizer st=new StringTokenizer(br.readLine(), " ");
	//      " "를 기준으로 토큰을 분리
	//      readLine으로 숫자를 입력시에 (byte로 입력 받음)ASCII code로 숫자를 입력받으므로 ParsenInt(Integer안에 있는 메서드 ParsenInt)를 통해 해결할수 있다.
	//      Stream으로 끝나는 class는 바이트 단위로 입출력을 수행
	//      Read/Writer로 끝나는 class는 캐릭터(char)단위로 입출력 수행
	//      BufferedReader 클래스가 Scanner보다 입출력이 빠르므로 숙지하는 게 필요할것이다._
	      ArrayList<Integer> num= new ArrayList<>(); // 가변 가능한 Arraylist 생성
	      while (st.hasMoreTokens()) { //다음 토큰이 존재하지 않을때까지
	         num.add(Integer.parseInt(st.nextToken())); //토큰은 공백으로 분리하고 엔터로 입력을 중단
	         // 문자열을 int형으로 변환 후에 다음 토큰을 계속 넣어준다.
	      }
	//	  n,m이 각각 arrayList[0] ,arrayList[1]로 들어갈 것이다.
	      int n=num.get(0);
	      int m=num.get(1);
	      
	     
	      int[] arr= new int[n];
	      for (int i=0; i<n; i++) {
	    	  arr[i]=(i+1); // num.size 만큼 여기서 num.size()는 num에 입력받은 개수	  
	      }
	      // arr은 arr(0)=1 부터 arr(n-1)=n까지 작성된 값이 될것.
	      for (int i=0; i<m; i++) {
	    	  
	          for (int j=0; j<m; j++) {
	        	  arr[j]= arr[m+1-j];
	          }	  
	      }
	      // arr이 모두 바뀌었다.
	      // 그렇다면 bw에 쓰기 위해서 문자열로 바꾸는 과정이 필요하다.
	      String[] starr=new String[n];
	      for(int i=0; i<n;i++) {
	    	 starr[i]= Integer.toString(arr[i]);
	      }
	      //starr을 출력
	      for(int i=0;i<starr.length;i++) {
	    	  bw.write(starr[i]+" ");
	    	  bw.flush();
	      }
	      
	      br.close();
	      bw.close();   
	      }
      // 역순으로 처리하기 위해 
      
      // M개의 줄에는 바구니의 순서를 역순으로 바꿀 방법 방법은 i j로 나타내라 -> for문?
//    1. update하는 방법
//    2. remove & add      
    }
    // 메서드를 만들어서 사용해보자.  


