package com.roblox.client.components;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.SearchView;
import android.widget.TextView;

/* loaded from: classes.dex */
public class RbxSearchView extends SearchView {
    public RbxSearchView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m12392a(context, attributeSet);
    }

    /* renamed from: a */
    private void m12392a(Context context, AttributeSet attributeSet) {
        TextView textView = (TextView) findViewById(getContext().getResources().getIdentifier("android:id/search_src_text", null, null));
        if (textView != null) {
            C2808i.m12428c(textView, context, attributeSet);
        }
    }
}
