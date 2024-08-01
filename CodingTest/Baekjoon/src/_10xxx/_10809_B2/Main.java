package _10xxx._10809_B2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws  Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String word = br.readLine().toLowerCase();
		for (char c = 'a'; c <= 'z'; c++){
			System.out.print( word.indexOf(c) + " ");
		}
	}
}
