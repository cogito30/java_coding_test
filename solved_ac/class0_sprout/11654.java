// 아스키 코드
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        char ch = sc.next().charAt(0);
        int asciiCh = (int) ch;

        System.out.println(asciiCh);

		sc.close();
	}
}