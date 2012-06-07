package com.ogameproxy.view;

import android.content.Context;
import android.widget.TextView;

import com.ogameproxy.ogame.LeveledElement;

public class LabelView extends TextView {
	private LeveledElement element;

	public LabelView(Context context) {
		super(context);
	}

	@Override
	public CharSequence getText() {
		return getResources().getString(
				LeveledElement.getIdMap().get(element.getClass()));
	}

	public LeveledElement getElement() {
		return element;
	}

	public void setElement(LeveledElement element) {
		this.element = element;
	}
}
