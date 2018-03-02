/*************************************************************************
	> File Name: Banner.java
	> Author: CreateChance
	> Mail: createchance@163.com 
	> Created Time: Fri Mar  2 11:30:10 2018
 ************************************************************************/
public class Banner {
	private String name;

	public Banner(String name) {
		this.name = name;
	}

	public void showWithParen() {
		System.out.println("(" + name + ")");
	}

	public void showWithAster() {
		System.out.println("*" + name + "*");
	}
}
