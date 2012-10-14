package com.ogameproxy.view;

import java.util.HashMap;
import java.util.Map;

import android.content.Context;
import android.widget.TextView;

import com.ogamelib.LeveledElement;
import com.ogamelib.building.producer.CrystalMine;
import com.ogamelib.building.producer.DeuteriumMine;
import com.ogamelib.building.producer.MetalMine;
import com.ogameproxy.R;

public class LabelView extends TextView {
	private LeveledElement element;

	public LabelView(Context context) {
		super(context);
	}

	@Override
	public CharSequence getText() {
		Map<Class<? extends LeveledElement>, Integer> map = new HashMap<Class<? extends LeveledElement>, Integer>();
		map.put(MetalMine.class, R.string.metal_mine);
		map.put(CrystalMine.class, R.string.cristal_mine);
		map.put(DeuteriumMine.class, R.string.deuterium_mine);
		return getResources().getString(
				map.get(element.getClass()));
	}

	public LeveledElement getElement() {
		return element;
	}

	public void setElement(LeveledElement element) {
		this.element = element;
	}
}
