package androidx.fragment.app;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.core.util.C0654h;
import androidx.lifecycle.InterfaceC0859z;

/* renamed from: androidx.fragment.app.h */
/* loaded from: classes.dex */
public class C0807h {

    /* renamed from: a */
    private final AbstractC0809j<?> f4051a;

    private C0807h(AbstractC0809j<?> abstractC0809j) {
        this.f4051a = abstractC0809j;
    }

    /* renamed from: b */
    public static C0807h m4631b(AbstractC0809j<?> abstractC0809j) {
        return new C0807h((AbstractC0809j) C0654h.m3468g(abstractC0809j, "callbacks == null"));
    }

    /* renamed from: a */
    public void m4632a(Fragment fragment) {
        AbstractC0809j<?> abstractC0809j = this.f4051a;
        abstractC0809j.f4057r.m4499k(abstractC0809j, abstractC0809j, fragment);
    }

    /* renamed from: c */
    public void m4633c() {
        this.f4051a.f4057r.m4525z();
    }

    /* renamed from: d */
    public void m4634d(Configuration configuration) {
        this.f4051a.f4057r.m4440B(configuration);
    }

    /* renamed from: e */
    public boolean m4635e(MenuItem menuItem) {
        return this.f4051a.f4057r.m4441C(menuItem);
    }

    /* renamed from: f */
    public void m4636f() {
        this.f4051a.f4057r.m4443D();
    }

    /* renamed from: g */
    public boolean m4637g(Menu menu, MenuInflater menuInflater) {
        return this.f4051a.f4057r.m4445E(menu, menuInflater);
    }

    /* renamed from: h */
    public void m4638h() {
        this.f4051a.f4057r.m4447F();
    }

    /* renamed from: i */
    public void m4639i() {
        this.f4051a.f4057r.m4451H();
    }

    /* renamed from: j */
    public void m4640j(boolean z10) {
        this.f4051a.f4057r.m4452I(z10);
    }

    /* renamed from: k */
    public boolean m4641k(MenuItem menuItem) {
        return this.f4051a.f4057r.m4455K(menuItem);
    }

    /* renamed from: l */
    public void m4642l(Menu menu) {
        this.f4051a.f4057r.m4457L(menu);
    }

    /* renamed from: m */
    public void m4643m() {
        this.f4051a.f4057r.m4460N();
    }

    /* renamed from: n */
    public void m4644n(boolean z10) {
        this.f4051a.f4057r.m4462O(z10);
    }

    /* renamed from: o */
    public boolean m4645o(Menu menu) {
        return this.f4051a.f4057r.m4463P(menu);
    }

    /* renamed from: p */
    public void m4646p() {
        this.f4051a.f4057r.m4467R();
    }

    /* renamed from: q */
    public void m4647q() {
        this.f4051a.f4057r.m4469S();
    }

    /* renamed from: r */
    public void m4648r() {
        this.f4051a.f4057r.m4472U();
    }

    /* renamed from: s */
    public boolean m4649s() {
        return this.f4051a.f4057r.m4482b0(true);
    }

    /* renamed from: t */
    public FragmentManager m4650t() {
        return this.f4051a.f4057r;
    }

    /* renamed from: u */
    public void m4651u() {
        this.f4051a.f4057r.m4471T0();
    }

    /* renamed from: v */
    public View m4652v(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f4051a.f4057r.m4521w0().onCreateView(view, str, context, attributeSet);
    }

    /* renamed from: w */
    public void m4653w(Parcelable parcelable) {
        AbstractC0809j<?> abstractC0809j = this.f4051a;
        if (abstractC0809j instanceof InterfaceC0859z) {
            abstractC0809j.f4057r.m4496i1(parcelable);
            return;
        }
        throw new IllegalStateException("Your FragmentHostCallback must implement ViewModelStoreOwner to call restoreSaveState(). Call restoreAllState()  if you're still using retainNestedNonConfig().");
    }

    /* renamed from: x */
    public Parcelable m4654x() {
        return this.f4051a.f4057r.m4501k1();
    }
}
