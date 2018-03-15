/*************************************************************************
	> File Name: AbstractFactory.java
	> Author: CreateChance
	> Mail: createchance@163.com 
	> Created Time: Thu Mar 15 11:52:57 2018
 ************************************************************************/
package framework;

public abstract class AbstractFactory {
	public final AbstractProduct create(String owner) {
		AbstractProduct product = createProduct(owner);
		registerProduct(product);

		return product;
	}

	protected abstract AbstractProduct createProduct(String owner);
	protected abstract void registerProduct(AbstractProduct product);
}
