package _10xxx;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class _10809 {

	public static void main(String[] args) throws  Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String word = br.readLine().toLowerCase();
		for (char c = 'a'; c <= 'z'; c++){
			System.out.print( word.indexOf(c) + " ");
		}
	}
}
