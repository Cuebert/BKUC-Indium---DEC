package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.core.util.C0650d;
import androidx.core.view.C0656a;
import androidx.core.view.C0690v;
import androidx.core.view.accessibility.C0660c;
import com.google.android.material.internal.C2489l;
import java.util.Calendar;
import p111i4.C3524f;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class MaterialCalendarGridView extends GridView {

    /* renamed from: n */
    private final Calendar f9316n;

    /* renamed from: o */
    private final boolean f9317o;

    /* renamed from: com.google.android.material.datepicker.MaterialCalendarGridView$a */
    /* loaded from: classes.dex */
    class C2444a extends C0656a {
        C2444a() {
        }

        @Override // androidx.core.view.C0656a
        /* renamed from: g */
        public void mo3484g(View view, C0660c c0660c) {
            super.mo3484g(view, c0660c);
            c0660c.m3536b0(null);
        }
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private void m11024a(int i10, Rect rect) {
        if (i10 == 33) {
            setSelection(getAdapter().m11108i());
        } else if (i10 == 130) {
            setSelection(getAdapter().m11103b());
        } else {
            super.onFocusChanged(true, i10, rect);
        }
    }

    /* renamed from: c */
    private static int m11025c(View view) {
        return view.getLeft() + (view.getWidth() / 2);
    }

    /* renamed from: d */
    private static boolean m11026d(Long l10, Long l11, Long l12, Long l13) {
        return l10 == null || l11 == null || l12 == null || l13 == null || l12.longValue() > l11.longValue() || l13.longValue() < l10.longValue();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    /* renamed from: b, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public C2454i getAdapter2() {
        return (C2454i) super.getAdapter();
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        getAdapter().notifyDataSetChanged();
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        int m11102a;
        int m11025c;
        int m11102a2;
        int m11025c2;
        int width;
        int i10;
        MaterialCalendarGridView materialCalendarGridView = this;
        super.onDraw(canvas);
        C2454i adapter = getAdapter();
        DateSelector<?> dateSelector = adapter.f9409o;
        C2447b c2447b = adapter.f9411q;
        Long item = adapter.getItem(adapter.m11103b());
        Long item2 = adapter.getItem(adapter.m11108i());
        for (C0650d<Long, Long> c0650d : dateSelector.m11015l()) {
            Long l10 = c0650d.f3493a;
            if (l10 != null) {
                if (c0650d.f3494b != null) {
                    long longValue = l10.longValue();
                    long longValue2 = c0650d.f3494b.longValue();
                    if (!m11026d(item, item2, Long.valueOf(longValue), Long.valueOf(longValue2))) {
                        boolean m11382d = C2489l.m11382d(this);
                        if (longValue < item.longValue()) {
                            m11102a = adapter.m11103b();
                            if (adapter.m11106f(m11102a)) {
                                m11025c = 0;
                            } else if (!m11382d) {
                                m11025c = materialCalendarGridView.getChildAt(m11102a - 1).getRight();
                            } else {
                                m11025c = materialCalendarGridView.getChildAt(m11102a - 1).getLeft();
                            }
                        } else {
                            materialCalendarGridView.f9316n.setTimeInMillis(longValue);
                            m11102a = adapter.m11102a(materialCalendarGridView.f9316n.get(5));
                            m11025c = m11025c(materialCalendarGridView.getChildAt(m11102a));
                        }
                        if (longValue2 > item2.longValue()) {
                            m11102a2 = Math.min(adapter.m11108i(), getChildCount() - 1);
                            if (adapter.m11107g(m11102a2)) {
                                m11025c2 = getWidth();
                            } else if (!m11382d) {
                                m11025c2 = materialCalendarGridView.getChildAt(m11102a2).getRight();
                            } else {
                                m11025c2 = materialCalendarGridView.getChildAt(m11102a2).getLeft();
                            }
                        } else {
                            materialCalendarGridView.f9316n.setTimeInMillis(longValue2);
                            m11102a2 = adapter.m11102a(materialCalendarGridView.f9316n.get(5));
                            m11025c2 = m11025c(materialCalendarGridView.getChildAt(m11102a2));
                        }
                        int itemId = (int) adapter.getItemId(m11102a);
                        int itemId2 = (int) adapter.getItemId(m11102a2);
                        while (itemId <= itemId2) {
                            int numColumns = getNumColumns() * itemId;
                            int numColumns2 = (getNumColumns() + numColumns) - 1;
                            View childAt = materialCalendarGridView.getChildAt(numColumns);
                            int top = childAt.getTop() + c2447b.f9332a.m11043c();
                            int bottom = childAt.getBottom() - c2447b.f9332a.m11042b();
                            if (!m11382d) {
                                i10 = numColumns > m11102a ? 0 : m11025c;
                                width = m11102a2 > numColumns2 ? getWidth() : m11025c2;
                            } else {
                                int i11 = m11102a2 > numColumns2 ? 0 : m11025c2;
                                width = numColumns > m11102a ? getWidth() : m11025c;
                                i10 = i11;
                            }
                            canvas.drawRect(i10, top, width, bottom, c2447b.f9339h);
                            itemId++;
                            materialCalendarGridView = this;
                            adapter = adapter;
                        }
                    }
                }
            }
            materialCalendarGridView = this;
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    protected void onFocusChanged(boolean z10, int i10, Rect rect) {
        if (z10) {
            m11024a(i10, rect);
        } else {
            super.onFocusChanged(false, i10, rect);
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (!super.onKeyDown(i10, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= getAdapter().m11103b()) {
            return true;
        }
        if (19 != i10) {
            return false;
        }
        setSelection(getAdapter().m11103b());
        return true;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public void onMeasure(int i10, int i11) {
        if (this.f9317o) {
            super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(16777215, Integer.MIN_VALUE));
            getLayoutParams().height = getMeasuredHeight();
            return;
        }
        super.onMeasure(i10, i11);
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public void setSelection(int i10) {
        if (i10 < getAdapter().m11103b()) {
            super.setSelection(getAdapter().m11103b());
        } else {
            super.setSelection(i10);
        }
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f9316n = C2460o.m11132k();
        if (C2451f.m11077E2(getContext())) {
            setNextFocusLeftId(C3524f.f14623a);
            setNextFocusRightId(C3524f.f14625c);
        }
        this.f9317o = C2451f.m11078F2(getContext());
        C0690v.m3853q0(this, new C2444a());
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (listAdapter instanceof C2454i) {
            super.setAdapter(listAdapter);
            return;
        }
        throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), C2454i.class.getCanonicalName()));
    }
}
