package _10xxx._10828_S4;

import java.io.*;
import java.util.*;
import java.util.function.Function;

public class Main4 {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            Stack<Integer> stack = new Stack<>();
            Map<String, Function<Stack<Integer>, Integer>> commands = new HashMap<>();

            commands.put("pop", s -> s.isEmpty() ? -1 : s.pop());
            commands.put("size", s -> s.size());
            commands.put("empty", s -> s.isEmpty() ? 1 : 0);
            commands.put("top", s -> s.isEmpty() ? -1 : s.peek());

            int N = Integer.parseInt(br.readLine());
            for (int i = 0; i < N; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                String func = st.nextToken();

                if ("push".equals(func)) {
                    stack.push(Integer.parseInt(st.nextToken()));
                } else {
                    bw.write(commands.get(func).apply(stack) + "\n");
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
