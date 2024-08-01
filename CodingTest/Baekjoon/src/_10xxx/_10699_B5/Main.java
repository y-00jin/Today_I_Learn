package _10xxx._10699_B5;

import java.time.LocalDate;
import java.time.ZoneId;

public class Main {
	public static void main(String[] args) {
		LocalDate now = LocalDate.now(ZoneId.of("UTC+0"));
		System.out.println(now);
	}
}
