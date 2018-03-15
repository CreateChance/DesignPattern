/*************************************************************************
	> File Name: AbstractDisplay.java
	> Author: CreateChance
	> Mail: createchance@163.com 
	> Created Time: Mon Mar 12 11:44:15 2018
 ************************************************************************/
public abstract class AbstractDisplay {
	protected abstract void open();
	protected abstract void print();
	protected abstract void close();

	public final void display() {
		open();

		for (int i = 0; i < 5; i++) {
			print();
		}

		close();
	}
}
