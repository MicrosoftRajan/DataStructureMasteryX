package MidLevel.Queue;

import java.util.*;

public class WinnerCircularGame {


    public static int WinnerGame(int n, int k){
        Queue<Integer> q = new LinkedList<>();

        for(int i = 1;i<=n; i++){ // sare ele add karo
            q.add(i);
        }


        while(q.size()>1){
            for(int i = 1; i<k-1; i++){
                q.add(q.remove());
            }
            q.remove();
        }

        return q.peek();

    }

    public static void main(String[] args) {
         int n = 5;
        int k = 2;

        int winner = WinnerGame(n, k);

        System.out.println("Winner: " + winner);
    }
    
}
