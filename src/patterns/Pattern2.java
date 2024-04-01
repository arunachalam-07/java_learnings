package patterns;

import java.util.Scanner;

public class Pattern2 {
//gfg
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
	pattern23(n);

	}

	public static void pattern1(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == 0 || i == n - 1) {
					System.out.print("*");
				} else if (j == 0 || j == n - 1) {
					System.out.print("*");
				} else {
					System.out.print("-");
				}

			}
			System.out.println();
		}
	}

	public static void pattern2(int n) {
		int i, j;
		for (i = 1; i <= n - 1; i++) {
			for (j = 1; j <= i; j++) {
				for (j = 1; j <= n - i; j++) {
					System.out.print("-");
				}
				for (j = 1; j <= i; j++) {
					System.out.print(i + " ");
				}

			}

			System.out.println();
		}
	}

	public static void pattern3(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

	public static void pattern4(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print(j + " ");

			}
			System.out.println();
		}
	}

	public static void pattern5(int n) {
		int val = 1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(val + " ");
				val++;

			}
			System.out.println();
		}
	}

	public static void pattern6(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				if ((i + j) % 2 == 0) {
					System.out.print(1);
				} else {
					System.out.print(0);
				}

			}
			System.out.println();
		}
	}

	public static void pattern7(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print("-");
			}
			for (int j = i; j >= 1; j--) {
				System.out.print(j);
			}
			for (int j = 2; j <= i; j++) {
				System.out.print(j);
			}
			for (int j = 1; j <= n - i; j++) {
				System.out.print("-");
			}
			System.out.println();

		}
	}

	public static void pattern8(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < n - i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void pattern8p1(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < n - i; j++) {
				System.out.print(" ");

			}

			for (int j = 1; j < n; j++) {
				if (i == 1 || i == n || j == 1 || j == n - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}

			System.out.println();

		}

	}
	
	
	public static void pattern9(int n)
	{
//		upward pattern starts
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				System.out.print("-");
			}
			for(int j=0;j<2*i+1;j++)
			{
				System.out.print("*");
			}
			for(int j=0;j<n-i-1;j++)
			{
				System.out.print("-");
			}
			System.out.println();
		}
//		upward pattern ends
		
//		downward pattern starts
		for(int i=1;i<=n-1;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print("-");
			}
			for(int j=0;j<2*n-(2*i+1);j++)
			{
				System.out.print("*");
			}
			for(int j=0;j<i;j++)
			{
				System.out.print("-");
			}
			System.out.println();
		}
	}
	
	public static void pattern10(int n)
	{
//		top part starts

		for(int i=0;i<=n;i++)
		{
//			top left part starts
			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			for(int j=0;j<=n-i-1;j++)
			{
				System.out.print("-");
			}
//			top left part ends
//			top right part begins
			for(int j=0;j<=n-i-1;j++)
			{
				System.out.print("-");
			}
			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
			}
//			top right part ends
			System.out.println();
			
		}
		
//		bottom part starts
		for(int i=0;i<=n;i++)
		{
//			bottom left part starts
			for(int j=0;j<=n-i;j++)
			{
				System.out.print("*");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("-");
		}
//			bottom left part ends
//			bottom right part starts
			for(int j=1;j<=i;j++)
			{
				System.out.print("-");
			}	
			for(int j=0;j<=n-i;j++)
			{
				System.out.print("*");
			}
			
//			bottom right part ends
			
			System.out.println();
		
		}
		
	}
	
	public static void pattern11(int n)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void pattern12(int n)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
	}
		
		
	
	}
	
	public static void pattern13(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=0;j<=n-i;j++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
	
	public static void pattern14(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=0;j<n-i;j++)
			{
				System.out.print("-");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void pattern15(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<i;j++)
			{
				System.out.print("-");
			}
			for(int j=0;j<=n-i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			
		}
	}
	
	public static void pattern16(int n)
	{
//		top part starts
		for(int i=0;i<n;i++)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
//		top part ends
		
//		bottom part starts
		for(int i=2;i<=n;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
	}
	}

	public static void pattern17(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print("-");
		}
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		
		}
	}
	
	public static void pattern18(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print("-");
			}
			for(int j=i;j<=n;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		
		}
	}
	
	public static void pattern19(int n)
	{
//		top part begins
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("-");
			}
			for(int j=i;j<=n;j++)
			{
				System.out.print(j+" ");
				
			}
			System.out.println();
		}
//		top part ends
		
//		bottom part starts
		for(int i=1;i<=n-1;i++)
		{
			for(int j=n;j>i;j--)
			{
				System.out.print("-");
			}
			for(int j=n-i;j<=n;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
//		bottom part ends
	}
	
	public static void pattern20(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=2*n-1;j++)
			{
				if(j==n-i+1 || j==n+i-1 || i==n)
				{
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
	
	public static void pattern21(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=2*n-1;j++)
			{
				if(i==1 || j==((2*n-i))||j==i)
				{
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
	
	public static void pattern21p1(int n)
	{
//		top part begins
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i==j || j==1)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
//		top part ends
//		bottom part starts
		for(int i=1;i<=n-1;i++)
		{
			for(int j=1;j<=n-1;j++)
			{
				if(j==1 || j==n-i)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print(" ");
				}
				
			}
			System.out.println();
				
				
		}
	}
	
	public static void pattern21p2(int n)
	{
//		top part of pattern begins
		for(int i=0;i<n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(j==n-i || j==n)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print("-");
				}
			}
			System.out.println();
		}
//		top part of pattern ends
		
//		bottom part of pattern begins
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(j==n || j==i)
				{
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
//		top part of pattern begins
		for(int i=0;i<=n-1;i++)
		{
				for(int j=1;j<=2*n-1;j++)
				{
					if(j==n-i || j==n+i)
					{
						System.out.print("*");
					}
					else
					{
						System.out.print("-");
					}
				}
				System.out.println();
			}
//		top part pattern ends
//		bottom part pattern starts
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<2*n-1;j++)
			{
				if(i==j||j==(2*n-i)-2 )
				{
					System.out.print("*");
				}
				else
				{
					System.out.print("-");
				}
			}
			System.out.println();
		}
//		bottom part pattern ends

			
		}
	
	public static void pattern23(int n)
	{

//top part pattern begins
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=2*n-1;j++)
			{
				if(i==1||i==j||j==2*n-i)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print("-");
					
				}
			}
			System.out.println();
		}
//		top part pattern ends
		
//		bottom part starts
		for(int i=1;i<=n-1;i++)
		{
			for(int j=1;j<=2*n-1;j++)
			{
				if(j==n-i||i==n-1||j==n+i)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print("-");
				}
			}
			System.out.println();
//			bottom part ends
		}
	}

	}


