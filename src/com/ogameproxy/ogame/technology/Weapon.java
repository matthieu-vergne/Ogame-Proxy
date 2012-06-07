package com.ogameproxy.ogame.technology;

import com.ogameproxy.ogame.resource.ResourceSet;

public class Weapon extends Technology {

	@Override
	public ResourceSet getInitialCost() {
		return new ResourceSet(800L, 200L, 0L);
	}

}
