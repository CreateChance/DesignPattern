/*************************************************************************
	> File Name: IDCardFactory.java
	> Author: CreateChance
	> Mail: createchance@163.com 
	> Created Time: Thu Mar 15 12:28:07 2018
 ************************************************************************/
package idcard;

import framework.*;
import java.util.List;
import java.util.ArrayList;

public class IDCardFactory extends AbstractFactory {
	private List<String> owners = new ArrayList<>();

	@Override
	protected AbstractProduct createProduct(String owner) {
		return new IDCard(owner);
	}

	@Override
	protected void registerProduct(AbstractProduct product) {
		owners.add(((IDCard) product).getOwner());
	}

	public List<String> getOwners() {
		return owners;
	}
}
