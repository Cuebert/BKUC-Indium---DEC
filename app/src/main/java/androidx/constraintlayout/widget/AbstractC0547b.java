package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import java.util.HashMap;
import p147l0.C3860e;
import p147l0.InterfaceC3863h;

/* renamed from: androidx.constraintlayout.widget.b */
/* loaded from: classes.dex */
public abstract class AbstractC0547b extends View {

    /* renamed from: n */
    protected int[] f2529n;

    /* renamed from: o */
    protected int f2530o;

    /* renamed from: p */
    protected Context f2531p;

    /* renamed from: q */
    protected InterfaceC3863h f2532q;

    /* renamed from: r */
    protected boolean f2533r;

    /* renamed from: s */
    protected String f2534s;

    /* renamed from: t */
    protected String f2535t;

    /* renamed from: u */
    private View[] f2536u;

    /* renamed from: v */
    private HashMap<Integer, String> f2537v;

    public AbstractC0547b(Context context) {
        super(context);
        this.f2529n = new int[32];
        this.f2533r = false;
        this.f2536u = null;
        this.f2537v = new HashMap<>();
        this.f2531p = context;
        mo2527h(null);
    }

    /* renamed from: a */
    private void m2558a(String str) {
        if (str == null || str.length() == 0 || this.f2531p == null) {
            return;
        }
        String trim = str.trim();
        if (getParent() instanceof ConstraintLayout) {
        }
        int m2562g = m2562g(trim);
        if (m2562g != 0) {
            this.f2537v.put(Integer.valueOf(m2562g), trim);
            m2559b(m2562g);
            return;
        }
        Log.w("ConstraintHelper", "Could not find id of \"" + trim + "\"");
    }

    /* renamed from: b */
    private void m2559b(int i10) {
        if (i10 == getId()) {
            return;
        }
        int i11 = this.f2530o + 1;
        int[] iArr = this.f2529n;
        if (i11 > iArr.length) {
            this.f2529n = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f2529n;
        int i12 = this.f2530o;
        iArr2[i12] = i10;
        this.f2530o = i12 + 1;
    }

    /* renamed from: c */
    private void m2560c(String str) {
        if (str == null || str.length() == 0 || this.f2531p == null) {
            return;
        }
        String trim = str.trim();
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        if (constraintLayout == null) {
            Log.w("ConstraintHelper", "Parent not a ConstraintLayout");
            return;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof ConstraintLayout.C0544b) && trim.equals(((ConstraintLayout.C0544b) layoutParams).f2458V)) {
                if (childAt.getId() == -1) {
                    Log.w("ConstraintHelper", "to use ConstraintTag view " + childAt.getClass().getSimpleName() + " must have an ID");
                } else {
                    m2559b(childAt.getId());
                }
            }
        }
    }

    /* renamed from: f */
    private int m2561f(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        if (str == null || constraintLayout == null || (resources = this.f2531p.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            if (childAt.getId() != -1) {
                String str2 = null;
                try {
                    str2 = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException unused) {
                }
                if (str.equals(str2)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    /* renamed from: g */
    private int m2562g(String str) {
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        int i10 = 0;
        if (isInEditMode() && constraintLayout != null) {
            Object m2540g = constraintLayout.m2540g(0, str);
            if (m2540g instanceof Integer) {
                i10 = ((Integer) m2540g).intValue();
            }
        }
        if (i10 == 0 && constraintLayout != null) {
            i10 = m2561f(constraintLayout, str);
        }
        if (i10 == 0) {
            try {
                i10 = C0553h.class.getField(str).getInt(null);
            } catch (Exception unused) {
            }
        }
        return i10 == 0 ? this.f2531p.getResources().getIdentifier(str, "id", this.f2531p.getPackageName()) : i10;
    }

    /* renamed from: d */
    public void m2563d() {
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ConstraintLayout)) {
            return;
        }
        m2564e((ConstraintLayout) parent);
    }

    /* renamed from: e */
    protected void m2564e(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i10 = 0; i10 < this.f2530o; i10++) {
            View m2541i = constraintLayout.m2541i(this.f2529n[i10]);
            if (m2541i != null) {
                m2541i.setVisibility(visibility);
                if (elevation > 0.0f) {
                    m2541i.setTranslationZ(m2541i.getTranslationZ() + elevation);
                }
            }
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f2529n, this.f2530o);
    }

    /* renamed from: h */
    public void mo2527h(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0554i.f2829a1);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == C0554i.f2911m1) {
                    String string = obtainStyledAttributes.getString(index);
                    this.f2534s = string;
                    setIds(string);
                } else if (index == C0554i.f2917n1) {
                    String string2 = obtainStyledAttributes.getString(index);
                    this.f2535t = string2;
                    setReferenceTags(string2);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: i */
    public void mo2528i(C3860e c3860e, boolean z10) {
    }

    /* renamed from: j */
    public void m2565j(ConstraintLayout constraintLayout) {
    }

    /* renamed from: k */
    public void m2566k(ConstraintLayout constraintLayout) {
    }

    /* renamed from: l */
    public void m2567l(ConstraintLayout constraintLayout) {
    }

    /* renamed from: m */
    public void m2568m(ConstraintLayout constraintLayout) {
        String str;
        int m2561f;
        if (isInEditMode()) {
            setIds(this.f2534s);
        }
        InterfaceC3863h interfaceC3863h = this.f2532q;
        if (interfaceC3863h == null) {
            return;
        }
        interfaceC3863h.mo16460c();
        for (int i10 = 0; i10 < this.f2530o; i10++) {
            int i11 = this.f2529n[i10];
            View m2541i = constraintLayout.m2541i(i11);
            if (m2541i == null && (m2561f = m2561f(constraintLayout, (str = this.f2537v.get(Integer.valueOf(i11))))) != 0) {
                this.f2529n[i10] = m2561f;
                this.f2537v.put(Integer.valueOf(m2561f), str);
                m2541i = constraintLayout.m2541i(m2561f);
            }
            if (m2541i != null) {
                this.f2532q.mo16459b(constraintLayout.m2542j(m2541i));
            }
        }
        this.f2532q.mo16458a(constraintLayout.f2425p);
    }

    /* renamed from: n */
    public void m2569n() {
        if (this.f2532q == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.C0544b) {
            ((ConstraintLayout.C0544b) layoutParams).f2490n0 = (C3860e) this.f2532q;
        }
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f2534s;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.f2535t;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        if (this.f2533r) {
            super.onMeasure(i10, i11);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    protected void setIds(String str) {
        this.f2534s = str;
        if (str == null) {
            return;
        }
        int i10 = 0;
        this.f2530o = 0;
        while (true) {
            int indexOf = str.indexOf(44, i10);
            if (indexOf == -1) {
                m2558a(str.substring(i10));
                return;
            } else {
                m2558a(str.substring(i10, indexOf));
                i10 = indexOf + 1;
            }
        }
    }

    protected void setReferenceTags(String str) {
        this.f2535t = str;
        if (str == null) {
            return;
        }
        int i10 = 0;
        this.f2530o = 0;
        while (true) {
            int indexOf = str.indexOf(44, i10);
            if (indexOf == -1) {
                m2560c(str.substring(i10));
                return;
            } else {
                m2560c(str.substring(i10, indexOf));
                i10 = indexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f2534s = null;
        this.f2530o = 0;
        for (int i10 : iArr) {
            m2559b(i10);
        }
    }

    @Override // android.view.View
    public void setTag(int i10, Object obj) {
        super.setTag(i10, obj);
        if (obj == null && this.f2534s == null) {
            m2559b(i10);
        }
    }

    public AbstractC0547b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2529n = new int[32];
        this.f2533r = false;
        this.f2536u = null;
        this.f2537v = new HashMap<>();
        this.f2531p = context;
        mo2527h(attributeSet);
    }
}
