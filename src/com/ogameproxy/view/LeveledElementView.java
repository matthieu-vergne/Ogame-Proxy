package com.ogameproxy.view;

import android.content.Context;
import android.widget.TableRow;

import com.ogameproxy.ogame.LeveledElement;

public class LeveledElementView extends TableRow {
	private LabelView label;
	private LevelView level;

	public LeveledElementView(Context context) {
		super(context);
		setLayoutParams(new LayoutParams(2));
		label = new LabelView(context);
		level = new LevelView(context);
		addView(label);
		addView(level);
	}

	public LeveledElementView(Context context, LeveledElement element) {
		this(context);
		setElement(element);
	}

	public LeveledElement getElement() {
		return label.getElement();
	}

	public void setElement(LeveledElement element) {
		label.setElement(element);
		level.setElement(element);
	}
}
