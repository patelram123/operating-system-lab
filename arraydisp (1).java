/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class arraydisp
{
	public static void main(String[] args) {
		String[] array=new String[5];
		array[0]="my";
		array[1]="name";
		array[2]="is";
		array[3]="ram";
		array[4]="patel";
		System.out.println("Original array:");
		for(int i=0;i<array.length;i++){
		    System.out.println("Element at index"+i+":"+array[i]);
		}
	}
}