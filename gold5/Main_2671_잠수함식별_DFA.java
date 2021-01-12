package gold5;

import java.util.Scanner;

public class Main_2671_잠수함식별_DFA {
	static int[][] rule = {
		{5,1},
		{2,9},
		{3,9},
		{3,4},
		{5,7},
		{9,6},
		{5,1},
		{8,7},
		{3,6},
		{9,9}
	};
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		boolean flag = solve(str);
		System.out.println(flag ? "SUBMARINE" : "NOISE");
	}

	private static boolean solve(String str) {
		int s = 0;
		for(int i=0; i<str.length(); i++) {
			int cur = str.charAt(i) - '0';
			s = rule[s][cur];
			
		}
		if(s == 4 || s == 6 || s == 7) {
			return true;
		}else {
			return false;
		}
	}

}
