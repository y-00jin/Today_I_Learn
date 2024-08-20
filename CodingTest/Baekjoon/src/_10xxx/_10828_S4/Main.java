package _10xxx._10828_S4;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Stack<Integer> stack = new Stack<>();
        Map<String, Runnable> commands = new HashMap<>();
        commands.put("pop", () -> write(bw, stack.isEmpty() ? -1 : stack.pop()));
        commands.put("size", () -> write(bw, stack.size()));
        commands.put("empty", () -> write(bw, stack.isEmpty() ? 1 : 0));
        commands.put("top", () -> write(bw, stack.isEmpty() ? -1 : stack.peek()));

        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String func = st.nextToken();
            if ("push".equals(func)) {
                stack.push(Integer.parseInt(st.nextToken()));
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
