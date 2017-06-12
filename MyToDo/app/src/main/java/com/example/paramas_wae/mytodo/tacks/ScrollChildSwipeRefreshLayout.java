package com.example.paramas_wae.mytodo.tacks;

import android.content.Context;
import android.support.v4.view.ViewCompat;
import android.support.v4.widget.SwipeRefreshLayout;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by paramas_wae on 6/12/2017.
 */

public class ScrollChildSwipeRefreshLayout extends SwipeRefreshLayout {

    private View mScrollupChild;

    public ScrollChildSwipeRefreshLayout(Context context) {
        super(context);
    }

    public ScrollChildSwipeRefreshLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean canChildScrollUp() {
        if (mScrollupChild != null) {
            return ViewCompat.canScrollVertically(mScrollupChild, -1);
        }
        return super.canChildScrollUp();
    }

    public void setScrollUpChild(View view) {
        this.mScrollupChild = view;
    }
}
