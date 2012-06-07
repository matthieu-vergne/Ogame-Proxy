package com.ogameproxy.ogame;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.HashMap;
import java.util.Map;

import com.ogameproxy.R;
import com.ogameproxy.ogame.building.producer.CrystalMine;
import com.ogameproxy.ogame.building.producer.DeuteriumMine;
import com.ogameproxy.ogame.building.producer.MetalMine;
import com.ogameproxy.ogame.resource.Resource;
import com.ogameproxy.ogame.resource.ResourceSet;

public abstract class LeveledElement implements Externalizable {
	private Integer level = 0;

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeInt(level);
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException,
			ClassNotFoundException {
		level = in.readInt();
	}

	abstract public ResourceSet getInitialCost();

	public ResourceSet getNextLevelCost() {
		ResourceSet cost = getInitialCost();
		for (Resource resource : new Resource[] { cost.metal, cost.crystal,
				cost.deuterium, cost.antimatter, cost.energy }) {
			resource.setAmount((long) (resource.getAmount() * Math.pow(2,
					getLevel())));
		}
		return cost;
	}

	public static final Map<Class<? extends LeveledElement>, Integer> getIdMap() {
		Map<Class<? extends LeveledElement>, Integer> map = new HashMap<Class<? extends LeveledElement>, Integer>();
		map.put(MetalMine.class, R.string.metal_mine);
		map.put(CrystalMine.class, R.string.cristal_mine);
		map.put(DeuteriumMine.class, R.string.deuterium_mine);
		return map;
	}
}
