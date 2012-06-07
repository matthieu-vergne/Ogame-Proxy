package com.ogameproxy.ogame.building;

import com.ogameproxy.ogame.resource.ResourceSet;

public class ResearchLab extends Building {

	@Override
	public ResourceSet getInitialCost() {
		return new ResourceSet(400L, 800L, 400L);
	}

}
