package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p015b1.C0968c;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.fragment.app.k */
/* loaded from: classes.dex */
public class LayoutInflaterFactory2C0810k implements LayoutInflater.Factory2 {

    /* renamed from: n */
    final FragmentManager f4058n;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.k$a */
    /* loaded from: classes.dex */
    public class a implements View.OnAttachStateChangeListener {

        /* renamed from: n */
        final /* synthetic */ C0816q f4059n;

        a(C0816q c0816q) {
            this.f4059n = c0816q;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            Fragment m4702k = this.f4059n.m4702k();
            this.f4059n.m4703m();
            AbstractC0825z.m4824n((ViewGroup) m4702k.f3802U.getParent(), LayoutInflaterFactory2C0810k.this.f4058n).m4832j();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public LayoutInflaterFactory2C0810k(FragmentManager fragmentManager) {
        this.f4058n = fragmentManager;
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        C0816q m4520w;
        if (C0806g.class.getName().equals(str)) {
            return new C0806g(context, attributeSet, this.f4058n);
        }
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0968c.f5131d);
        if (attributeValue == null) {
            attributeValue = obtainStyledAttributes.getString(C0968c.f5132e);
        }
        int resourceId = obtainStyledAttributes.getResourceId(C0968c.f5133f, -1);
        String string = obtainStyledAttributes.getString(C0968c.f5134g);
        obtainStyledAttributes.recycle();
        if (attributeValue == null || !C0808i.m4655b(context.getClassLoader(), attributeValue)) {
            return null;
        }
        int id = view != null ? view.getId() : 0;
        if (id == -1 && resourceId == -1 && string == null) {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
        }
        Fragment m4495i0 = resourceId != -1 ? this.f4058n.m4495i0(resourceId) : null;
        if (m4495i0 == null && string != null) {
            m4495i0 = this.f4058n.m4498j0(string);
        }
        if (m4495i0 == null && id != -1) {
            m4495i0 = this.f4058n.m4495i0(id);
        }
        if (m4495i0 == null) {
            m4495i0 = this.f4058n.m4515s0().mo4533a(context.getClassLoader(), attributeValue);
            m4495i0.f3782A = true;
            m4495i0.f3791J = resourceId != 0 ? resourceId : id;
            m4495i0.f3792K = id;
            m4495i0.f3793L = string;
            m4495i0.f3783B = true;
            FragmentManager fragmentManager = this.f4058n;
            m4495i0.f3787F = fragmentManager;
            m4495i0.f3788G = fragmentManager.m4519v0();
            m4495i0.m4293L0(this.f4058n.m4519v0().m4659g(), attributeSet, m4495i0.f3822o);
            m4520w = this.f4058n.m4490g(m4495i0);
            if (FragmentManager.m4403H0(2)) {
                Log.v("FragmentManager", "Fragment " + m4495i0 + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
            }
        } else if (!m4495i0.f3783B) {
            m4495i0.f3783B = true;
            FragmentManager fragmentManager2 = this.f4058n;
            m4495i0.f3787F = fragmentManager2;
            m4495i0.f3788G = fragmentManager2.m4519v0();
            m4495i0.m4293L0(this.f4058n.m4519v0().m4659g(), attributeSet, m4495i0.f3822o);
            m4520w = this.f4058n.m4520w(m4495i0);
            if (FragmentManager.m4403H0(2)) {
                Log.v("FragmentManager", "Retained Fragment " + m4495i0 + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
            }
        } else {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
        }
        m4495i0.f3801T = (ViewGroup) view;
        m4520w.m4703m();
        m4520w.m4701j();
        View view2 = m4495i0.f3802U;
        if (view2 != null) {
            if (resourceId != 0) {
                view2.setId(resourceId);
            }
            if (m4495i0.f3802U.getTag() == null) {
                m4495i0.f3802U.setTag(string);
            }
            m4495i0.f3802U.addOnAttachStateChangeListener(new a(m4520w));
            return m4495i0.f3802U;
        }
        throw new IllegalStateException("Fragment " + attributeValue + " did not create a view.");
    }
}
