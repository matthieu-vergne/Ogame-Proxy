package com.ogameproxy.ogame.building;

import com.ogameproxy.ogame.resource.ResourceSet;

public class Dock extends Building {

	@Override
	public ResourceSet getInitialCost() {
		return new ResourceSet(400L, 200L, 100L);
	}

}
