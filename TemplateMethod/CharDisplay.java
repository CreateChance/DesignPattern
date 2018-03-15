/*************************************************************************
	> File Name: CharDisplay.java
	> Author: CreateChance
	> Mail: createchance@163.com 
	> Created Time: Mon Mar 12 11:46:13 2018
 ************************************************************************/
public class CharDisplay extends AbstractDisplay {
	private char ch;
	
	public CharDisplay(char ch) {
		this.ch = ch;
	}

	@Override
	protected final void open() {
		System.out.println("Char display opened!");
	}

	@Override 
	protected final void print() {
		System.out.println("char: " + ch);
	}

	@Override
	protected final void close() {
		System.out.println("Char display closed!");
	}
}
