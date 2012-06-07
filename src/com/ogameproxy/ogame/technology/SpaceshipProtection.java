package com.ogameproxy.ogame.technology;

import com.ogameproxy.ogame.resource.ResourceSet;

public class SpaceshipProtection extends Technology {

	@Override
	public ResourceSet getInitialCost() {
		return new ResourceSet(1000L, 0L, 0L);
	}

}
