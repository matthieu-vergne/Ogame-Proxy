package com.ogameproxy.ogame.technology;

import com.ogameproxy.ogame.resource.ResourceSet;

public class Computer extends Technology {

	@Override
	public ResourceSet getInitialCost() {
		return new ResourceSet(0L, 400L, 600L);
	}

}
