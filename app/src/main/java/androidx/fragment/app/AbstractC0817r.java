package androidx.fragment.app;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC0839f;
import androidx.viewpager.widget.AbstractC0957a;
import java.util.ArrayList;

@Deprecated
/* renamed from: androidx.fragment.app.r */
/* loaded from: classes.dex */
public abstract class AbstractC0817r extends AbstractC0957a {

    /* renamed from: c */
    private final FragmentManager f4080c;

    /* renamed from: d */
    private final int f4081d;

    /* renamed from: e */
    private AbstractC0819t f4082e;

    /* renamed from: f */
    private ArrayList<Fragment.SavedState> f4083f;

    /* renamed from: g */
    private ArrayList<Fragment> f4084g;

    /* renamed from: h */
    private Fragment f4085h;

    /* renamed from: i */
    private boolean f4086i;

    @Deprecated
    public AbstractC0817r(FragmentManager fragmentManager) {
        this(fragmentManager, 0);
    }

    @Override // androidx.viewpager.widget.AbstractC0957a
    /* renamed from: a */
    public void mo4713a(ViewGroup viewGroup, int i10, Object obj) {
        Fragment fragment = (Fragment) obj;
        if (this.f4082e == null) {
            this.f4082e = this.f4080c.m4504m();
        }
        while (this.f4083f.size() <= i10) {
            this.f4083f.add(null);
        }
        this.f4083f.set(i10, fragment.m4342g0() ? this.f4080c.m4503l1(fragment) : null);
        this.f4084g.set(i10, null);
        this.f4082e.mo4564n(fragment);
        if (fragment.equals(this.f4085h)) {
            this.f4085h = null;
        }
    }

    @Override // androidx.viewpager.widget.AbstractC0957a
    /* renamed from: b */
    public void mo4714b(ViewGroup viewGroup) {
        AbstractC0819t abstractC0819t = this.f4082e;
        if (abstractC0819t != null) {
            if (!this.f4086i) {
                try {
                    this.f4086i = true;
                    abstractC0819t.mo4562k();
                } finally {
                    this.f4086i = false;
                }
            }
            this.f4082e = null;
        }
    }

    @Override // androidx.viewpager.widget.AbstractC0957a
    /* renamed from: g */
    public Object mo4715g(ViewGroup viewGroup, int i10) {
        Fragment.SavedState savedState;
        Fragment fragment;
        if (this.f4084g.size() > i10 && (fragment = this.f4084g.get(i10)) != null) {
            return fragment;
        }
        if (this.f4082e == null) {
            this.f4082e = this.f4080c.m4504m();
        }
        Fragment mo4721p = mo4721p(i10);
        if (this.f4083f.size() > i10 && (savedState = this.f4083f.get(i10)) != null) {
            mo4721p.m4291K1(savedState);
        }
        while (this.f4084g.size() <= i10) {
            this.f4084g.add(null);
        }
        mo4721p.m4294L1(false);
        if (this.f4081d == 0) {
            mo4721p.m4315S1(false);
        }
        this.f4084g.set(i10, mo4721p);
        this.f4082e.m4746b(viewGroup.getId(), mo4721p);
        if (this.f4081d == 1) {
            this.f4082e.mo4565r(mo4721p, AbstractC0839f.c.STARTED);
        }
        return mo4721p;
    }

    @Override // androidx.viewpager.widget.AbstractC0957a
    /* renamed from: h */
    public boolean mo4716h(View view, Object obj) {
        return ((Fragment) obj).m4334b0() == view;
    }

    @Override // androidx.viewpager.widget.AbstractC0957a
    /* renamed from: j */
    public void mo4717j(Parcelable parcelable, ClassLoader classLoader) {
        if (parcelable != null) {
            Bundle bundle = (Bundle) parcelable;
            bundle.setClassLoader(classLoader);
            Parcelable[] parcelableArray = bundle.getParcelableArray("states");
            this.f4083f.clear();
            this.f4084g.clear();
            if (parcelableArray != null) {
                for (Parcelable parcelable2 : parcelableArray) {
                    this.f4083f.add((Fragment.SavedState) parcelable2);
                }
            }
            for (String str : bundle.keySet()) {
                if (str.startsWith("f")) {
                    int parseInt = Integer.parseInt(str.substring(1));
                    Fragment m4512q0 = this.f4080c.m4512q0(bundle, str);
                    if (m4512q0 != null) {
                        while (this.f4084g.size() <= parseInt) {
                            this.f4084g.add(null);
                        }
                        m4512q0.m4294L1(false);
                        this.f4084g.set(parseInt, m4512q0);
                    } else {
                        Log.w("FragmentStatePagerAdapt", "Bad fragment at key " + str);
                    }
                }
            }
        }
    }

    @Override // androidx.viewpager.widget.AbstractC0957a
    /* renamed from: k */
    public Parcelable mo4718k() {
        Bundle bundle;
        if (this.f4083f.size() > 0) {
            bundle = new Bundle();
            Fragment.SavedState[] savedStateArr = new Fragment.SavedState[this.f4083f.size()];
            this.f4083f.toArray(savedStateArr);
            bundle.putParcelableArray("states", savedStateArr);
        } else {
            bundle = null;
        }
        for (int i10 = 0; i10 < this.f4084g.size(); i10++) {
            Fragment fragment = this.f4084g.get(i10);
            if (fragment != null && fragment.m4342g0()) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                this.f4080c.m4484c1(bundle, "f" + i10, fragment);
            }
        }
        return bundle;
    }

    @Override // androidx.viewpager.widget.AbstractC0957a
    /* renamed from: l */
    public void mo4719l(ViewGroup viewGroup, int i10, Object obj) {
        Fragment fragment = (Fragment) obj;
        Fragment fragment2 = this.f4085h;
        if (fragment != fragment2) {
            if (fragment2 != null) {
                fragment2.m4294L1(false);
                if (this.f4081d == 1) {
                    if (this.f4082e == null) {
                        this.f4082e = this.f4080c.m4504m();
                    }
                    this.f4082e.mo4565r(this.f4085h, AbstractC0839f.c.STARTED);
                } else {
                    this.f4085h.m4315S1(false);
                }
            }
            fragment.m4294L1(true);
            if (this.f4081d == 1) {
                if (this.f4082e == null) {
                    this.f4082e = this.f4080c.m4504m();
                }
                this.f4082e.mo4565r(fragment, AbstractC0839f.c.RESUMED);
            } else {
                fragment.m4315S1(true);
            }
            this.f4085h = fragment;
        }
    }

    @Override // androidx.viewpager.widget.AbstractC0957a
    /* renamed from: n */
    public void mo4720n(ViewGroup viewGroup) {
        if (viewGroup.getId() != -1) {
            return;
        }
        throw new IllegalStateException("ViewPager with adapter " + this + " requires a view id");
    }

    /* renamed from: p */
    public abstract Fragment mo4721p(int i10);

    public AbstractC0817r(FragmentManager fragmentManager, int i10) {
        this.f4082e = null;
        this.f4083f = new ArrayList<>();
        this.f4084g = new ArrayList<>();
        this.f4085h = null;
        this.f4080c = fragmentManager;
        this.f4081d = i10;
    }
}
