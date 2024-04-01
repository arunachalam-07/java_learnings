package patterns;

import java.util.Scanner;

public class Patterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		Patterns.pattern9(n);
	}

	public static void pattern1(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("*");

			}

			System.out.println();
		}

	}

	public static void pattern2(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	public static void pattern3(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}

			System.out.println();
		}
	}

	public static void pattern4(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}

	public static void pattern5(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void pattern6(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print(j);
			}

			System.out.println();
		}
	}

	public static void pattern7(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				System.out.print("-");
			}

			for (int j = 0; j < 2 * i + 1; j++) {
				System.out.print("*");
			}

			for (int j = 0; j < n - i - 1; j++) {
				System.out.print("-");
			}
			System.out.println();
		}
	}

	public static void pattern8(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("-");
			}

			for (int j = 0; j < 2 * n - (2 * i + 1); j++) {
				System.out.print("*");
			}

			for (int j = 0; j < i; j++) {
				System.out.print("-");
			}
			System.out.println();

		}
	}

	public static void pattern8p1(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j <= n - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	public static void pattern8p2(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				System.out.print(" ");
			}

			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}

			System.out.println();
		}

		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j < n - i; j++) {
				System.out.print("*");
			}

			System.out.println();
		}
	}

	public static void pattern9(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				System.out.print("-");
			}

			for (int j = 0; j < 2 * i + 1; j++) {
				System.out.print("*");
			}
			for (int j = 0; j < n - i - 1; j++) {
				System.out.print("-");
			}

			System.out.println();
		}

//		downward pattern
		for (int i = 1; i <= n - 1; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("-");
			}

			for (int j = 0; j < 2 * n - (2 * i + 1); j++) {
				System.out.print("*");
			}

			for (int j = 0; j < i; j++) {
				System.out.print("-");
			}

			System.out.println();
		}

	}

	public static void pattern10(int n) {

		pattern8p1(n);
	}

	public static void pattern11(int n) {
		int start = 1;
		for (int i = 0; i < n; i++) {
			if (i % 2 == 0) {
				start = 1;
			}

			else {
				start = 0;
			}

			for (int j = 0; j <= i; j++) {
				System.out.print(start);
				start = 1 - start;
			}
			System.out.println();
		}
	}

	public static void pattern12(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			for (int j = 1; j <= n - i; j++) {
				System.out.print("-");
			}

			for (int j = 1; j <= n - i; j++) {
				System.out.print("x");
			}
			for (int j = i; j >= 1; j--) {
				System.out.print(j);
			}

			System.out.println();

		}
	}

	public static void pattern13(int n) {
		int value = 1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(value + " ");
				value++;
			}
			System.out.println();
		}
	}

	public static void pattern14(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print((char) ('A' + j));
			}
			System.out.println();
		}

	}

	public static void pattern15(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i; j++) {
				System.out.print((char) ('A' + j));
			}

			System.out.println();
		}
	}

	public static void pattern16(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print((char) ('A' + i));
			}
			System.out.println();
		}
	}

	public static void pattern17(int n) {
		for (int i = 1; i <= n; i++) {
//			left space
			for (int j = 1; j <= n - i; j++) {
				System.out.print("-");
			}
//			System.out.println();

			for (int j = 0; j < i; j++) {
				System.out.print((char) ('A' + j));
			}
//			right space

			for (int j = i; j > 1; j--) {
				System.out.print((char) ('A' + j));
			}

			for (int j = 1; j <= n - i; j++) {
				System.out.print("-");
			}

			System.out.println();
		}

	}

	public static void pattern18(int n) {
		char c = (char) ('A' + n);
		for (int i = 1; i <= n; i++) {
			for (int j = i; j >= 1; j--) {
				System.out.print((char) (c - j));
			}
			System.out.println();
		}
	}

	public static void pattern19(int n) {
//		top part starts
		for (int i = 1; i <= n; i++) {
//			left part starts
			for (int j = 0; j <= n - i; j++) {
				System.out.print("*");
			}
			for (int j = 1; j < i; j++) {
				System.out.print(" ");
			}
//			left part ends

//			right part starts
			for (int j = 1; j < i; j++) {
				System.out.print(" ");
			}

			for (int j = 0; j <= n - i; j++) {
				System.out.print("*");
			}

			System.out.println();
		}
//		right part ends
//		top part ends

//		bottom pattern starts

		for (int i = 1; i <= n; i++) {
//			bottom left part starts
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}

			System.out.println();

		}

	}

	public static void pattern20(int n) {
//		top part starts

//		top left part
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			for (int j = 0; j < n - i; j++) {
				System.out.print("-");
			}
//			top left part ends
//			top right part begins
			for (int j = 0; j < n - i; j++) {
				System.out.print("-");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
//			top right part ends
//			top part ends

		}

//bottom part begins

		for (int i = 0; i < n - 1; i++) {
//	left part begins
			for (int j = 1; j <= n - i - 1; j++) {
				System.out.print("*");
			}

			for (int j = 0; j <= i; j++) {
				System.out.print("-");
			}
//	left part ends

//		right part begins
			for (int j = 0; j <= i; j++) {
				System.out.print("-");
			}

			for (int j = 1; j <= n - i - 1; j++) {
				System.out.print("*");
			}
//			right part ends

			System.out.println();

		}

	}

	public static void pattern21(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == 0||i==n-1 || j==0 || j==n-1) {
					System.out.print("*");
				}
				else 
				{
					System.out.print("-");
				}
				
				
			}
			System.out.println();
		}
		
	}
	
	public static void pattern22(int n)
	{
		for(int i=0;i<2*n-1;i++)
		{
			
			for(int j=0;j<2*n-1;j++)
			{
				int top=i;
				int bottom=(2*n-2)-i;
				int left=j;
				int right=(2*n-2)-j;
			
System.out.print(n-Math.min(Math.min(left, right), Math.min(top, bottom)));
			}
			System.out.println();
		}
	}
}
