package com.ogameproxy.ogame.technology;

import com.ogameproxy.ogame.resource.ResourceSet;

public class Shield extends Technology {

	@Override
	public ResourceSet getInitialCost() {
		return new ResourceSet(200L, 600L, 0L);
	}

}
