package com.ogameproxy.ogame.technology;

import com.ogameproxy.ogame.resource.ResourceSet;

public class Spy extends Technology {

	@Override
	public ResourceSet getInitialCost() {
		return new ResourceSet(200L, 1000L, 200L);
	}

}
