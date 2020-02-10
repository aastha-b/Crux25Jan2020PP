package L4_Feb9;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 09-Feb-2020
 *
 */

public class DataTypeDemo {

	public static void main(String[] args) {

		// case 1
		byte by = 10;
		short sh = 10;
		int in = 10;
		long lo = 10;

		// by = sh ;
		// by = in ;
		// by = lo ;

		sh = by;
		// sh = in ;
		// sh = lo ;

		in = by;
		in = sh;
		// in = lo ;

		lo = by;
		lo = sh;
		lo = in;

		// case 2
		by = 100;

		// for (byte b = 0; b <= 128; b ++ ) {
		// System.out.println("hello");
		// }

		// case 3
		lo = 10000000000L;
		System.out.println(in);

		// case 4
		float f = 5.6f;
		double d = 6.7;

		// f = d;
		d = f;

		// case 5
		in = (int) f;
		f = in;

		// case 6
		boolean bl = true;

		if (bl == true) {
			System.out.println("hi");
		}

		if (bl) {

		}

		// case 7
		char ch = 'a';

		in = ch;
		System.out.println(in);
		System.out.println(ch);
		System.out.println((int) ch);

		ch = 70;
		System.out.println(ch);
		System.out.println((int) 200);

		ch = (char) (ch + 1);
		System.out.println(ch);

		ch = 'a' + 1;

		ch = (char) ('a' + ch);
		System.out.println(ch);

		// case 8
		System.out.println(10 + 20 + "Hello" + 10 + 20); // 30Hello1020
		System.out.println(2 + ' ' + 5); // 39
		System.out.println(2 + " " + 5); // 2 5
		System.out.println("Hello" + '\t' + "World"); // Hello World
		System.out.println("Hello" + "\t" + "World"); // Hello World

		System.out.println(2 + '\t' + 3); // 14

	}

}
