/*************************************************************************
	> File Name: Main.java
	> Author: CreateChance
	> Mail: createchance@163.com 
	> Created Time: Mon Mar 12 11:52:05 2018
 ************************************************************************/
public class Main {
	public static void main(String argvs[]) {
		AbstractDisplay d1 = new CharDisplay('a');
		AbstractDisplay d2 = new StringDisplay("hello");

		d1.display();
		System.out.println();
		d2.display();
	}
}
