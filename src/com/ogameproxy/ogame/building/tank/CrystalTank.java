package com.ogameproxy.ogame.building.tank;

import com.ogameproxy.ogame.resource.ResourceSet;

public class CrystalTank extends Tank {

	@Override
	public ResourceSet getInitialLimit() {
		return new ResourceSet(0L, 10000L, 0L);
	}

	@Override
	public ResourceSet getInitialCost() {
		return new ResourceSet(1000L, 500L, 0L);
	}

}
