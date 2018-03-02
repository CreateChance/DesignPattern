/*************************************************************************
	> File Name: Main.java
	> Author: CreateChance
	> Mail: createchance@163.com 
	> Created Time: Fri Mar  2 11:35:06 2018
 ************************************************************************/
public class Main {
	public static void main(String argv[]) {
		IPrint printer = new PrintBanner("This is banner.");
		printer.printWeak();
		printer.printStrong();
	}
}
