package com.ogameproxy.ogame.building;

import com.ogameproxy.ogame.resource.ResourceSet;

public class NaniteFactory extends Building {

	@Override
	public ResourceSet getInitialCost() {
		return new ResourceSet(1000000L, 500000L, 100000L);
	}

}
