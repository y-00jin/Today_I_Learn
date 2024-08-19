package _10xxx._10845_S4;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        ArrayDeque<Integer> deque = new ArrayDeque<>();

        Map<String, Runnable> commands = new HashMap<>();
        commands.put("pop", () -> write(bw, deque.isEmpty() ? -1 : deque.pollLast()));
        commands.put("size", () -> write(bw, deque.size()));
        commands.put("empty", () -> write(bw, deque.isEmpty() ? 1 : 0));
        commands.put("front", () -> write(bw, deque.isEmpty() ? -1 : deque.getLast()));
        commands.put("back", () -> write(bw, deque.isEmpty() ? -1 : deque.getFirst()));

        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String func = st.nextToken();

            if ("push".equals(func)) {
                deque.push(Integer.parseInt(st.nextToken()));
            } else {
                commands.get(func).run();
            }
        }

        bw.flush();
        bw.close();
    }

    private static void write(BufferedWriter bw, int value) {
        try {
            bw.write(value + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
