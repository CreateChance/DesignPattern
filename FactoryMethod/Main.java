/*************************************************************************
	> File Name: Main.java
	> Author: CreateChance
	> Mail: createchance@163.com 
	> Created Time: Thu Mar 15 12:35:22 2018
 ************************************************************************/
import framework.*;
import idcard.*;

public class Main {
	public static void main(String[] argvs) {
		AbstractFactory factory = new IDCardFactory();
		AbstractProduct card1 = factory.create("Tom");
		AbstractProduct card2 = factory.create("Jack");
		AbstractProduct card3 = factory.create("Jimmy");

		card1.use();
		card2.use();
		card3.use();
	}
}
