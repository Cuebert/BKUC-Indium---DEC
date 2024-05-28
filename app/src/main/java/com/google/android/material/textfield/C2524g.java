package com.google.android.material.textfield;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.Filterable;
import android.widget.ListAdapter;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.widget.ListPopupWindow;
import com.appsflyer.oaid.BuildConfig;
import com.google.android.material.internal.C2482e;
import com.google.android.material.internal.C2487j;
import p111i4.C3520b;
import p111i4.C3529k;
import p111i4.C3530l;
import p323z4.C6011a;

/* renamed from: com.google.android.material.textfield.g */
/* loaded from: classes.dex */
public class C2524g extends AppCompatAutoCompleteTextView {

    /* renamed from: n */
    private final ListPopupWindow f9960n;

    /* renamed from: o */
    private final AccessibilityManager f9961o;

    /* renamed from: p */
    private final Rect f9962p;

    /* renamed from: com.google.android.material.textfield.g$a */
    /* loaded from: classes.dex */
    class a implements AdapterView.OnItemClickListener {
        a() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
            C2524g.this.m11692e(i10 < 0 ? C2524g.this.f9960n.getSelectedItem() : C2524g.this.getAdapter().getItem(i10));
            AdapterView.OnItemClickListener onItemClickListener = C2524g.this.getOnItemClickListener();
            if (onItemClickListener != null) {
                if (view == null || i10 < 0) {
                    view = C2524g.this.f9960n.getSelectedView();
                    i10 = C2524g.this.f9960n.getSelectedItemPosition();
                    j10 = C2524g.this.f9960n.getSelectedItemId();
                }
                onItemClickListener.onItemClick(C2524g.this.f9960n.getListView(), view, i10, j10);
            }
            C2524g.this.f9960n.dismiss();
        }
    }

    public C2524g(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C3520b.f14515a);
    }

    /* renamed from: c */
    private TextInputLayout m11690c() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    /* renamed from: d */
    private int m11691d() {
        ListAdapter adapter = getAdapter();
        TextInputLayout m11690c = m11690c();
        int i10 = 0;
        if (adapter == null || m11690c == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int min = Math.min(adapter.getCount(), Math.max(0, this.f9960n.getSelectedItemPosition()) + 15);
        View view = null;
        int i11 = 0;
        for (int max = Math.max(0, min - 15); max < min; max++) {
            int itemViewType = adapter.getItemViewType(max);
            if (itemViewType != i10) {
                view = null;
                i10 = itemViewType;
            }
            view = adapter.getView(max, view, m11690c);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i11 = Math.max(i11, view.getMeasuredWidth());
        }
        Drawable background = this.f9960n.getBackground();
        if (background != null) {
            background.getPadding(this.f9962p);
            Rect rect = this.f9962p;
            i11 += rect.left + rect.right;
        }
        return i11 + m11690c.getEndIconView().getMeasuredWidth();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public <T extends ListAdapter & Filterable> void m11692e(Object obj) {
        setText(convertSelectionToString(obj), false);
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout m11690c = m11690c();
        if (m11690c != null && m11690c.m11578O()) {
            return m11690c.getHint();
        }
        return super.getHint();
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout m11690c = m11690c();
        if (m11690c != null && m11690c.m11578O() && super.getHint() == null && C2482e.m11345a()) {
            setHint(BuildConfig.FLAVOR);
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (View.MeasureSpec.getMode(i10) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), m11691d()), View.MeasureSpec.getSize(i10)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(T t10) {
        super.setAdapter(t10);
        this.f9960n.setAdapter(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView
    public void showDropDown() {
        AccessibilityManager accessibilityManager = this.f9961o;
        if (accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled()) {
            this.f9960n.show();
        } else {
            super.showDropDown();
        }
    }

    public C2524g(Context context, AttributeSet attributeSet, int i10) {
        super(C6011a.m21324c(context, attributeSet, i10, 0), attributeSet, i10);
        this.f9962p = new Rect();
        Context context2 = getContext();
        TypedArray m11374h = C2487j.m11374h(context2, attributeSet, C3530l.f14886X1, i10, C3529k.f14694d, new int[0]);
        int i11 = C3530l.f14893Y1;
        if (m11374h.hasValue(i11) && m11374h.getInt(i11, 0) == 0) {
            setKeyListener(null);
        }
        this.f9961o = (AccessibilityManager) context2.getSystemService("accessibility");
        ListPopupWindow listPopupWindow = new ListPopupWindow(context2);
        this.f9960n = listPopupWindow;
        listPopupWindow.setModal(true);
        listPopupWindow.setAnchorView(this);
        listPopupWindow.setInputMethodMode(2);
        listPopupWindow.setAdapter(getAdapter());
        listPopupWindow.setOnItemClickListener(new a());
        m11374h.recycle();
    }
}
