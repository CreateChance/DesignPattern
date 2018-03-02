/*************************************************************************
	> File Name: PrintBanner.java
	> Author: CreateChance
	> Mail: createchance@163.com 
	> Created Time: Fri Mar  2 11:37:43 2018
 ************************************************************************/
public class PrintBanner implements IPrint {
	private Banner banner;

	public PrintBanner(String name) {
		banner = new Banner(name);
	}

	@Override
	public void printWeak() {
		banner.showWithParen();
	}

	@Override
	public void printStrong() {
		banner.showWithAster();
	}
}
