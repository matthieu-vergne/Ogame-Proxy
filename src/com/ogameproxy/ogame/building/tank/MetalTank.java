package com.ogameproxy.ogame.building.tank;

import com.ogameproxy.ogame.resource.ResourceSet;

public class MetalTank extends Tank {

	@Override
	public ResourceSet getInitialLimit() {
		return new ResourceSet(10000L, 0L, 0L);
	}

	@Override
	public ResourceSet getInitialCost() {
		return new ResourceSet(1000L, 0L, 0L);
	}

}
