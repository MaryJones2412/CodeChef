import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();
        
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            StringTokenizer st = new StringTokenizer(br.readLine());
            Deque<Integer> dq = new ArrayDeque<>();
            
            for (int i = 0; i < n; i++) {
                dq.offer(Integer.parseInt(st.nextToken()));
            }
            
            int lastPlayer = -1; // 1 for Aman, 0 for Akshat
            boolean isAmanTurn = true;
            
            while (dq.size() > 1) {
                if (isAmanTurn) {
                    // Aman performs: move 1 then move 2
                    if (dq.size() > 1) {
                        int stone = dq.poll();
                        dq.offer(stone);
                    }
                    if (dq.size() > 1) {
                        dq.poll();
                        lastPlayer = 1;
                    }
                } else {
                    // Akshat performs: move 1, move 1, then move 2
                    if (dq.size() > 1) {
                        int stone = dq.poll();
                        dq.offer(stone);
                    }
                    if (dq.size() > 1) {
                        int stone = dq.poll();
                        dq.offer(stone);
                    }
                    if (dq.size() > 1) {
                        dq.poll();
                        lastPlayer = 0;
                    }
                }
                isAmanTurn = !isAmanTurn;
            }
            
            int lastStone = dq.peek();
            sb.append(lastPlayer).append(" ").append(lastStone).append("\n");
        }
        System.out.print(sb.toString());
    }
}