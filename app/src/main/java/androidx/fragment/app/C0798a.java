package androidx.fragment.app;

import android.util.Log;
import androidx.fragment.app.AbstractC0819t;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.AbstractC0839f;
import java.io.PrintWriter;
import java.util.ArrayList;

/* renamed from: androidx.fragment.app.a */
/* loaded from: classes.dex */
public final class C0798a extends AbstractC0819t implements FragmentManager.InterfaceC0793m {

    /* renamed from: t */
    final FragmentManager f3954t;

    /* renamed from: u */
    boolean f3955u;

    /* renamed from: v */
    int f3956v;

    public C0798a(FragmentManager fragmentManager) {
        super(fragmentManager.m4515s0(), fragmentManager.m4519v0() != null ? fragmentManager.m4519v0().m4659g().getClassLoader() : null);
        this.f3956v = -1;
        this.f3954t = fragmentManager;
    }

    /* renamed from: E */
    private static boolean m4550E(AbstractC0819t.a aVar) {
        Fragment fragment = aVar.f4110b;
        return (fragment == null || !fragment.f3832y || fragment.f3802U == null || fragment.f3795N || fragment.f3794M || !fragment.m4356m0()) ? false : true;
    }

    /* renamed from: A */
    public Fragment m4551A(ArrayList<Fragment> arrayList, Fragment fragment) {
        Fragment fragment2 = fragment;
        int i10 = 0;
        while (i10 < this.f4092c.size()) {
            AbstractC0819t.a aVar = this.f4092c.get(i10);
            int i11 = aVar.f4109a;
            if (i11 != 1) {
                if (i11 == 2) {
                    Fragment fragment3 = aVar.f4110b;
                    int i12 = fragment3.f3792K;
                    boolean z10 = false;
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        Fragment fragment4 = arrayList.get(size);
                        if (fragment4.f3792K == i12) {
                            if (fragment4 == fragment3) {
                                z10 = true;
                            } else {
                                if (fragment4 == fragment2) {
                                    this.f4092c.add(i10, new AbstractC0819t.a(9, fragment4));
                                    i10++;
                                    fragment2 = null;
                                }
                                AbstractC0819t.a aVar2 = new AbstractC0819t.a(3, fragment4);
                                aVar2.f4111c = aVar.f4111c;
                                aVar2.f4113e = aVar.f4113e;
                                aVar2.f4112d = aVar.f4112d;
                                aVar2.f4114f = aVar.f4114f;
                                this.f4092c.add(i10, aVar2);
                                arrayList.remove(fragment4);
                                i10++;
                            }
                        }
                    }
                    if (z10) {
                        this.f4092c.remove(i10);
                        i10--;
                    } else {
                        aVar.f4109a = 1;
                        arrayList.add(fragment3);
                    }
                } else if (i11 == 3 || i11 == 6) {
                    arrayList.remove(aVar.f4110b);
                    Fragment fragment5 = aVar.f4110b;
                    if (fragment5 == fragment2) {
                        this.f4092c.add(i10, new AbstractC0819t.a(9, fragment5));
                        i10++;
                        fragment2 = null;
                    }
                } else if (i11 != 7) {
                    if (i11 == 8) {
                        this.f4092c.add(i10, new AbstractC0819t.a(9, fragment2));
                        i10++;
                        fragment2 = aVar.f4110b;
                    }
                }
                i10++;
            }
            arrayList.add(aVar.f4110b);
            i10++;
        }
        return fragment2;
    }

    /* renamed from: B */
    public String m4552B() {
        return this.f4100k;
    }

    /* renamed from: C */
    public boolean m4553C(int i10) {
        int size = this.f4092c.size();
        for (int i11 = 0; i11 < size; i11++) {
            Fragment fragment = this.f4092c.get(i11).f4110b;
            int i12 = fragment != null ? fragment.f3792K : 0;
            if (i12 != 0 && i12 == i10) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: D */
    public boolean m4554D(ArrayList<C0798a> arrayList, int i10, int i11) {
        if (i11 == i10) {
            return false;
        }
        int size = this.f4092c.size();
        int i12 = -1;
        for (int i13 = 0; i13 < size; i13++) {
            Fragment fragment = this.f4092c.get(i13).f4110b;
            int i14 = fragment != null ? fragment.f3792K : 0;
            if (i14 != 0 && i14 != i12) {
                for (int i15 = i10; i15 < i11; i15++) {
                    C0798a c0798a = arrayList.get(i15);
                    int size2 = c0798a.f4092c.size();
                    for (int i16 = 0; i16 < size2; i16++) {
                        Fragment fragment2 = c0798a.f4092c.get(i16).f4110b;
                        if ((fragment2 != null ? fragment2.f3792K : 0) == i14) {
                            return true;
                        }
                    }
                }
                i12 = i14;
            }
        }
        return false;
    }

    /* renamed from: F */
    public boolean m4555F() {
        for (int i10 = 0; i10 < this.f4092c.size(); i10++) {
            if (m4550E(this.f4092c.get(i10))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: G */
    public void m4556G() {
        if (this.f4108s != null) {
            for (int i10 = 0; i10 < this.f4108s.size(); i10++) {
                this.f4108s.get(i10).run();
            }
            this.f4108s = null;
        }
    }

    /* renamed from: H */
    public void m4557H(Fragment.InterfaceC0778h interfaceC0778h) {
        for (int i10 = 0; i10 < this.f4092c.size(); i10++) {
            AbstractC0819t.a aVar = this.f4092c.get(i10);
            if (m4550E(aVar)) {
                aVar.f4110b.m4300N1(interfaceC0778h);
            }
        }
    }

    /* renamed from: I */
    public Fragment m4558I(ArrayList<Fragment> arrayList, Fragment fragment) {
        for (int size = this.f4092c.size() - 1; size >= 0; size--) {
            AbstractC0819t.a aVar = this.f4092c.get(size);
            int i10 = aVar.f4109a;
            if (i10 != 1) {
                if (i10 != 3) {
                    switch (i10) {
                        case 8:
                            fragment = null;
                            break;
                        case 9:
                            fragment = aVar.f4110b;
                            break;
                        case 10:
                            aVar.f4116h = aVar.f4115g;
                            break;
                    }
                }
                arrayList.add(aVar.f4110b);
            }
            arrayList.remove(aVar.f4110b);
        }
        return fragment;
    }

    @Override // androidx.fragment.app.FragmentManager.InterfaceC0793m
    /* renamed from: a */
    public boolean mo4542a(ArrayList<C0798a> arrayList, ArrayList<Boolean> arrayList2) {
        if (FragmentManager.m4403H0(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f4098i) {
            return true;
        }
        this.f3954t.m4486e(this);
        return true;
    }

    @Override // androidx.fragment.app.AbstractC0819t
    /* renamed from: h */
    public int mo4559h() {
        return m4568v(false);
    }

    @Override // androidx.fragment.app.AbstractC0819t
    /* renamed from: i */
    public int mo4560i() {
        return m4568v(true);
    }

    @Override // androidx.fragment.app.AbstractC0819t
    /* renamed from: j */
    public void mo4561j() {
        m4752l();
        this.f3954t.m4483c0(this, false);
    }

    @Override // androidx.fragment.app.AbstractC0819t
    /* renamed from: k */
    public void mo4562k() {
        m4752l();
        this.f3954t.m4483c0(this, true);
    }

    @Override // androidx.fragment.app.AbstractC0819t
    /* renamed from: m */
    public void mo4563m(int i10, Fragment fragment, String str, int i11) {
        super.mo4563m(i10, fragment, str, i11);
        fragment.f3787F = this.f3954t;
    }

    @Override // androidx.fragment.app.AbstractC0819t
    /* renamed from: n */
    public AbstractC0819t mo4564n(Fragment fragment) {
        FragmentManager fragmentManager = fragment.f3787F;
        if (fragmentManager != null && fragmentManager != this.f3954t) {
            throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
        }
        return super.mo4564n(fragment);
    }

    @Override // androidx.fragment.app.AbstractC0819t
    /* renamed from: r */
    public AbstractC0819t mo4565r(Fragment fragment, AbstractC0839f.c cVar) {
        if (fragment.f3787F == this.f3954t) {
            if (cVar == AbstractC0839f.c.INITIALIZED && fragment.f3821n > -1) {
                throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + cVar + " after the Fragment has been created");
            }
            if (cVar != AbstractC0839f.c.DESTROYED) {
                return super.mo4565r(fragment, cVar);
            }
            throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + cVar + ". Use remove() to remove the fragment from the FragmentManager and trigger its destruction.");
        }
        throw new IllegalArgumentException("Cannot setMaxLifecycle for Fragment not attached to FragmentManager " + this.f3954t);
    }

    @Override // androidx.fragment.app.AbstractC0819t
    /* renamed from: t */
    public AbstractC0819t mo4566t(Fragment fragment) {
        FragmentManager fragmentManager = fragment.f3787F;
        if (fragmentManager != null && fragmentManager != this.f3954t) {
            throw new IllegalStateException("Cannot show Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
        }
        return super.mo4566t(fragment);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("BackStackEntry{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f3956v >= 0) {
            sb2.append(" #");
            sb2.append(this.f3956v);
        }
        if (this.f4100k != null) {
            sb2.append(" ");
            sb2.append(this.f4100k);
        }
        sb2.append("}");
        return sb2.toString();
    }

    /* renamed from: u */
    public void m4567u(int i10) {
        if (this.f4098i) {
            if (FragmentManager.m4403H0(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i10);
            }
            int size = this.f4092c.size();
            for (int i11 = 0; i11 < size; i11++) {
                AbstractC0819t.a aVar = this.f4092c.get(i11);
                Fragment fragment = aVar.f4110b;
                if (fragment != null) {
                    fragment.f3786E += i10;
                    if (FragmentManager.m4403H0(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + aVar.f4110b + " to " + aVar.f4110b.f3786E);
                    }
                }
            }
        }
    }

    /* renamed from: v */
    int m4568v(boolean z10) {
        if (!this.f3955u) {
            if (FragmentManager.m4403H0(2)) {
                Log.v("FragmentManager", "Commit: " + this);
                PrintWriter printWriter = new PrintWriter(new C0824y("FragmentManager"));
                m4569w("  ", printWriter);
                printWriter.close();
            }
            this.f3955u = true;
            if (this.f4098i) {
                this.f3956v = this.f3954t.m4497j();
            } else {
                this.f3956v = -1;
            }
            this.f3954t.m4480Z(this, z10);
            return this.f3956v;
        }
        throw new IllegalStateException("commit already called");
    }

    /* renamed from: w */
    public void m4569w(String str, PrintWriter printWriter) {
        m4570x(str, printWriter, true);
    }

    /* renamed from: x */
    public void m4570x(String str, PrintWriter printWriter, boolean z10) {
        String str2;
        if (z10) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f4100k);
            printWriter.print(" mIndex=");
            printWriter.print(this.f3956v);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f3955u);
            if (this.f4097h != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f4097h));
            }
            if (this.f4093d != 0 || this.f4094e != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f4093d));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f4094e));
            }
            if (this.f4095f != 0 || this.f4096g != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f4095f));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f4096g));
            }
            if (this.f4101l != 0 || this.f4102m != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f4101l));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f4102m);
            }
            if (this.f4103n != 0 || this.f4104o != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f4103n));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f4104o);
            }
        }
        if (this.f4092c.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = this.f4092c.size();
        for (int i10 = 0; i10 < size; i10++) {
            AbstractC0819t.a aVar = this.f4092c.get(i10);
            switch (aVar.f4109a) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + aVar.f4109a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i10);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(aVar.f4110b);
            if (z10) {
                if (aVar.f4111c != 0 || aVar.f4112d != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f4111c));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f4112d));
                }
                if (aVar.f4113e != 0 || aVar.f4114f != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f4113e));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f4114f));
                }
            }
        }
    }

    /* renamed from: y */
    public void m4571y() {
        int size = this.f4092c.size();
        for (int i10 = 0; i10 < size; i10++) {
            AbstractC0819t.a aVar = this.f4092c.get(i10);
            Fragment fragment = aVar.f4110b;
            if (fragment != null) {
                fragment.m4303O1(false);
                fragment.m4297M1(this.f4097h);
                fragment.m4312R1(this.f4105p, this.f4106q);
            }
            switch (aVar.f4109a) {
                case 1:
                    fragment.m4278F1(aVar.f4111c, aVar.f4112d, aVar.f4113e, aVar.f4114f);
                    this.f3954t.m4507n1(fragment, false);
                    this.f3954t.m4490g(fragment);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f4109a);
                case 3:
                    fragment.m4278F1(aVar.f4111c, aVar.f4112d, aVar.f4113e, aVar.f4114f);
                    this.f3954t.m4487e1(fragment);
                    break;
                case 4:
                    fragment.m4278F1(aVar.f4111c, aVar.f4112d, aVar.f4113e, aVar.f4114f);
                    this.f3954t.m4446E0(fragment);
                    break;
                case 5:
                    fragment.m4278F1(aVar.f4111c, aVar.f4112d, aVar.f4113e, aVar.f4114f);
                    this.f3954t.m4507n1(fragment, false);
                    this.f3954t.m4514r1(fragment);
                    break;
                case 6:
                    fragment.m4278F1(aVar.f4111c, aVar.f4112d, aVar.f4113e, aVar.f4114f);
                    this.f3954t.m4523y(fragment);
                    break;
                case 7:
                    fragment.m4278F1(aVar.f4111c, aVar.f4112d, aVar.f4113e, aVar.f4114f);
                    this.f3954t.m4507n1(fragment, false);
                    this.f3954t.m4502l(fragment);
                    break;
                case 8:
                    this.f3954t.m4511p1(fragment);
                    break;
                case 9:
                    this.f3954t.m4511p1(null);
                    break;
                case 10:
                    this.f3954t.m4509o1(fragment, aVar.f4116h);
                    break;
            }
            if (!this.f4107r && aVar.f4109a != 1 && fragment != null && !FragmentManager.f3865P) {
                this.f3954t.m4464P0(fragment);
            }
        }
        if (this.f4107r || FragmentManager.f3865P) {
            return;
        }
        FragmentManager fragmentManager = this.f3954t;
        fragmentManager.m4466Q0(fragmentManager.f3896q, true);
    }

    /* renamed from: z */
    public void m4572z(boolean z10) {
        for (int size = this.f4092c.size() - 1; size >= 0; size--) {
            AbstractC0819t.a aVar = this.f4092c.get(size);
            Fragment fragment = aVar.f4110b;
            if (fragment != null) {
                fragment.m4303O1(true);
                fragment.m4297M1(FragmentManager.m4422j1(this.f4097h));
                fragment.m4312R1(this.f4106q, this.f4105p);
            }
            switch (aVar.f4109a) {
                case 1:
                    fragment.m4278F1(aVar.f4111c, aVar.f4112d, aVar.f4113e, aVar.f4114f);
                    this.f3954t.m4507n1(fragment, true);
                    this.f3954t.m4487e1(fragment);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f4109a);
                case 3:
                    fragment.m4278F1(aVar.f4111c, aVar.f4112d, aVar.f4113e, aVar.f4114f);
                    this.f3954t.m4490g(fragment);
                    break;
                case 4:
                    fragment.m4278F1(aVar.f4111c, aVar.f4112d, aVar.f4113e, aVar.f4114f);
                    this.f3954t.m4514r1(fragment);
                    break;
                case 5:
                    fragment.m4278F1(aVar.f4111c, aVar.f4112d, aVar.f4113e, aVar.f4114f);
                    this.f3954t.m4507n1(fragment, true);
                    this.f3954t.m4446E0(fragment);
                    break;
                case 6:
                    fragment.m4278F1(aVar.f4111c, aVar.f4112d, aVar.f4113e, aVar.f4114f);
                    this.f3954t.m4502l(fragment);
                    break;
                case 7:
                    fragment.m4278F1(aVar.f4111c, aVar.f4112d, aVar.f4113e, aVar.f4114f);
                    this.f3954t.m4507n1(fragment, true);
                    this.f3954t.m4523y(fragment);
                    break;
                case 8:
                    this.f3954t.m4511p1(null);
                    break;
                case 9:
                    this.f3954t.m4511p1(fragment);
                    break;
                case 10:
                    this.f3954t.m4509o1(fragment, aVar.f4115g);
                    break;
            }
            if (!this.f4107r && aVar.f4109a != 3 && fragment != null && !FragmentManager.f3865P) {
                this.f3954t.m4464P0(fragment);
            }
        }
        if (this.f4107r || !z10 || FragmentManager.f3865P) {
            return;
        }
        FragmentManager fragmentManager = this.f3954t;
        fragmentManager.m4466Q0(fragmentManager.f3896q, true);
    }
}
