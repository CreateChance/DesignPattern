/*************************************************************************
	> File Name: PrintBanner.java
	> Author: CreateChance
	> Mail: createchance@163.com 
	> Created Time: Fri Mar  2 11:32:59 2018
 ************************************************************************/
public class PrintBanner extends Banner implements IPrint {
	public PrintBanner(String name) {
		super(name);
	}

	@Override
	public void printWeak() {
		super.showWithParen();
	}

	@Override
	public void printStrong() {
		super.showWithAster();
	}
}
