package com.ogameproxy.view;

import android.content.Context;
import android.widget.TextView;

import com.ogamelib.LeveledElement;

public class LevelView extends TextView {
	private LeveledElement element;

	public LevelView(Context context) {
		super(context);
	}

	@Override
	public CharSequence getText() {
		return "" + element.getLevel();
	}

	public LeveledElement getElement() {
		return element;
	}

	public void setElement(LeveledElement element) {
		this.element = element;
	}
}
