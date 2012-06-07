package com.ogameproxy.view;

import android.content.Context;
import android.widget.ListView;

public class ListLayout extends ListView {

	private final String name;

	public ListLayout(Context context, String name) {
		super(context);
		this.name = name;
	}

	@Override
	public String toString() {
		return getName();
	}

	public String getName() {
		return name;
	}
}
