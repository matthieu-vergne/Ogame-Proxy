package com.ogameproxy.ogame.technology;

import com.ogameproxy.ogame.resource.ResourceSet;

public class Plasma extends Technology {

	@Override
	public ResourceSet getInitialCost() {
		return new ResourceSet(2000L, 4000L, 1000L);
	}

}
