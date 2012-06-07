package com.ogameproxy.ogame.technology;

import com.ogameproxy.ogame.resource.ResourceSet;

public class IntergalacticSearchNetwork extends Technology {

	@Override
	public ResourceSet getInitialCost() {
		return new ResourceSet(240000L, 400000L, 160000L);
	}

}
