package com.ogameproxy.ogame.building;

import com.ogameproxy.ogame.resource.ResourceSet;

public class RobotFactory extends Building {

	@Override
	public ResourceSet getInitialCost() {
		return new ResourceSet(400L, 120L, 200L);
	}

}
