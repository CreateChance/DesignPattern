/*************************************************************************
	> File Name: StringDisplay.java
	> Author: CreateChance
	> Mail: createchance@163.com 
	> Created Time: Mon Mar 12 11:49:52 2018
 ************************************************************************/
public class StringDisplay extends AbstractDisplay {
	private String str;

	public StringDisplay(String str) {
		this.str = str;
	}

	@Override
	protected final void open() {
		System.out.println("String display opened!");
	}

	@Override
	protected final void print() {
		System.out.println("String: " + str);
	}

	@Override 
	protected final void close() {
		System.out.println("String display closed!");
	}
}
