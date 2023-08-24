package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Chatgpt10811 {

    public static void main(String[] args) throws IOException {
        // 바구니 뒤집기(10811)
        // BufferedReader, BufferedWriter를 활용
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 첫째 줄에는 정수 n, m이 주어진다.
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken()); // n을 정수로 변환하여 저장
        int m = Integer.parseInt(st.nextToken()); // m을 정수로 변환하여 저장

        // 배열 생성 및 초기화
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }

        // M개의 줄에는 바구니의 순서를 역순으로 바꿀 방법을 i, j로 나타낸다
        for (int k = 0; k < m; k++) {
            st = new StringTokenizer(br.readLine(), " ");
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());

            // i부터 j까지의 순서를 역순으로 변경
            reverse(arr, i - 1, j - 1);
        }

        // 배열 출력
        for (int i = 0; i < n; i++) {
            bw.write(arr[i] + " ");
        }
        bw.flush();

        br.close();
        bw.close();
    }

    // 배열의 특정 구간을 역순으로 변경하는 메서드
    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}