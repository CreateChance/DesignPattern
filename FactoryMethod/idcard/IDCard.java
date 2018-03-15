/*************************************************************************
	> File Name: IDCard.java
	> Author: CreateChance
	> Mail: createchance@163.com 
	> Created Time: Thu Mar 15 11:56:19 2018
 ************************************************************************/
package idcard;

import framework.*;

public class IDCard extends AbstractProduct {
	private String owner;

	IDCard(String owner) {
		System.out.println("Creating id card, owner: " + owner);
		this.owner = owner;
	}

	@Override
	public void use() {
		System.out.println("Using id card, owner: " + owner);
	}

	public String getOwner() {
		return owner;
	}
}
