package com.ogameproxy.ogame.technology;

import com.ogameproxy.ogame.resource.ResourceSet;

public class Hyperspace extends Technology {

	@Override
	public ResourceSet getInitialCost() {
		return new ResourceSet(0L, 4000L, 2000L);
	}

}
