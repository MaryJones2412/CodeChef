import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class NecklaceRotation {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int t = Integer.parseInt(st.nextToken()); // Number of test cases 
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            Queue<Integer> necklace = new LinkedList<>();

            st = new StringTokenizer(br.readLine());
            // Enqueue the elements (pearls) into the queue
            for (int i = 0; i < n; i++) {
                necklace.add(Integer.parseInt(st.nextToken()));
            }

            // Optimize k if it's greater than n
            k = k % n;

            // Rotate the queue left by k positions
            for (int i = 0; i < k; i++) {
                int removed = necklace.poll();
                necklace.add(removed);
            }

            // Append the modified necklace to StringBuilder
            while (!necklace.isEmpty()) {
                sb.append(necklace.poll()).append(" ");
            }
            sb.append("\n");
        }

        // Print all outputs at once for speed
        System.out.print(sb);
    }
}