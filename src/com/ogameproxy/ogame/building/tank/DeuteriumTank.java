package com.ogameproxy.ogame.building.tank;

import com.ogameproxy.ogame.resource.ResourceSet;

public class DeuteriumTank extends Tank {

	@Override
	public ResourceSet getInitialLimit() {
		return new ResourceSet(0L, 0L, 10000L);
	}

	@Override
	public ResourceSet getInitialCost() {
		return new ResourceSet(1000L, 1000L, 0L);
	}

}
