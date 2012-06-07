package com.ogameproxy.ogame.building.tank;

import com.ogameproxy.ogame.building.Building;
import com.ogameproxy.ogame.resource.Resource;
import com.ogameproxy.ogame.resource.ResourceSet;

public abstract class Tank extends Building {

	public abstract ResourceSet getInitialLimit();

	public ResourceSet getLimit() {
		ResourceSet limit = getInitialLimit();
		for (Resource resource : new Resource[] { limit.metal, limit.crystal,
				limit.deuterium, limit.antimatter, limit.energy }) {
			if (resource.getAmount() > 0 && getLevel() > 0) {
				resource.setAmount((long) (5000 * Math.floor(2.5 * Math
						.exp(20.0 / 33.0 * getLevel()))));
			}
		}
		return limit;
	}

	public abstract ResourceSet getInitialCost();

}
