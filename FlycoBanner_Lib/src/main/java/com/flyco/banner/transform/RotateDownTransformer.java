package com.flyco.banner.transform;

import android.view.View;

import com.flyco.banner.widget.LoopViewPager.ViewPagerCompat;
import com.nineoldandroids.view.ViewHelper;

public class RotateDownTransformer implements ViewPagerCompat.PageTransformer {

	private static final float ROT_MOD = -15f;

	@Override
	public void transformPage(View page, float position) {
		final float width = page.getWidth();
		final float height = page.getHeight();
		final float rotation = ROT_MOD * position * -1.25f;

		ViewHelper.setPivotX(page,width * 0.5f);
        ViewHelper.setPivotY(page,height);
        ViewHelper.setRotation(page,rotation);
	}
}
