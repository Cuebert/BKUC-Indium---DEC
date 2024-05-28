package androidx.fragment.app;

import android.view.ViewGroup;
import androidx.lifecycle.AbstractC0839f;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* renamed from: androidx.fragment.app.t */
/* loaded from: classes.dex */
public abstract class AbstractC0819t {

    /* renamed from: a */
    private final C0808i f4090a;

    /* renamed from: b */
    private final ClassLoader f4091b;

    /* renamed from: d */
    int f4093d;

    /* renamed from: e */
    int f4094e;

    /* renamed from: f */
    int f4095f;

    /* renamed from: g */
    int f4096g;

    /* renamed from: h */
    int f4097h;

    /* renamed from: i */
    boolean f4098i;

    /* renamed from: k */
    String f4100k;

    /* renamed from: l */
    int f4101l;

    /* renamed from: m */
    CharSequence f4102m;

    /* renamed from: n */
    int f4103n;

    /* renamed from: o */
    CharSequence f4104o;

    /* renamed from: p */
    ArrayList<String> f4105p;

    /* renamed from: q */
    ArrayList<String> f4106q;

    /* renamed from: s */
    ArrayList<Runnable> f4108s;

    /* renamed from: c */
    ArrayList<a> f4092c = new ArrayList<>();

    /* renamed from: j */
    boolean f4099j = true;

    /* renamed from: r */
    boolean f4107r = false;

    /* renamed from: androidx.fragment.app.t$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        int f4109a;

        /* renamed from: b */
        Fragment f4110b;

        /* renamed from: c */
        int f4111c;

        /* renamed from: d */
        int f4112d;

        /* renamed from: e */
        int f4113e;

        /* renamed from: f */
        int f4114f;

        /* renamed from: g */
        AbstractC0839f.c f4115g;

        /* renamed from: h */
        AbstractC0839f.c f4116h;

        public a() {
        }

        public a(int i10, Fragment fragment) {
            this.f4109a = i10;
            this.f4110b = fragment;
            AbstractC0839f.c cVar = AbstractC0839f.c.RESUMED;
            this.f4115g = cVar;
            this.f4116h = cVar;
        }

        a(int i10, Fragment fragment, AbstractC0839f.c cVar) {
            this.f4109a = i10;
            this.f4110b = fragment;
            this.f4115g = fragment.f3812e0;
            this.f4116h = cVar;
        }
    }

    public AbstractC0819t(C0808i c0808i, ClassLoader classLoader) {
        this.f4090a = c0808i;
        this.f4091b = classLoader;
    }

    /* renamed from: b */
    public AbstractC0819t m4746b(int i10, Fragment fragment) {
        mo4563m(i10, fragment, null, 1);
        return this;
    }

    /* renamed from: c */
    public AbstractC0819t m4747c(int i10, Fragment fragment, String str) {
        mo4563m(i10, fragment, str, 1);
        return this;
    }

    /* renamed from: d */
    public AbstractC0819t m4748d(ViewGroup viewGroup, Fragment fragment, String str) {
        fragment.f3801T = viewGroup;
        return m4747c(viewGroup.getId(), fragment, str);
    }

    /* renamed from: e */
    public AbstractC0819t m4749e(Fragment fragment, String str) {
        mo4563m(0, fragment, str, 1);
        return this;
    }

    /* renamed from: f */
    public void m4750f(a aVar) {
        this.f4092c.add(aVar);
        aVar.f4111c = this.f4093d;
        aVar.f4112d = this.f4094e;
        aVar.f4113e = this.f4095f;
        aVar.f4114f = this.f4096g;
    }

    /* renamed from: g */
    public AbstractC0819t m4751g(String str) {
        if (this.f4099j) {
            this.f4098i = true;
            this.f4100k = str;
            return this;
        }
        throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
    }

    /* renamed from: h */
    public abstract int mo4559h();

    /* renamed from: i */
    public abstract int mo4560i();

    /* renamed from: j */
    public abstract void mo4561j();

    /* renamed from: k */
    public abstract void mo4562k();

    /* renamed from: l */
    public AbstractC0819t m4752l() {
        if (!this.f4098i) {
            this.f4099j = false;
            return this;
        }
        throw new IllegalStateException("This transaction is already being added to the back stack");
    }

    /* renamed from: m */
    public void mo4563m(int i10, Fragment fragment, String str, int i11) {
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (!cls.isAnonymousClass() && Modifier.isPublic(modifiers) && (!cls.isMemberClass() || Modifier.isStatic(modifiers))) {
            if (str != null) {
                String str2 = fragment.f3793L;
                if (str2 != null && !str.equals(str2)) {
                    throw new IllegalStateException("Can't change tag of fragment " + fragment + ": was " + fragment.f3793L + " now " + str);
                }
                fragment.f3793L = str;
            }
            if (i10 != 0) {
                if (i10 != -1) {
                    int i12 = fragment.f3791J;
                    if (i12 != 0 && i12 != i10) {
                        throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.f3791J + " now " + i10);
                    }
                    fragment.f3791J = i10;
                    fragment.f3792K = i10;
                } else {
                    throw new IllegalArgumentException("Can't add fragment " + fragment + " with tag " + str + " to container view with no id");
                }
            }
            m4750f(new a(i11, fragment));
            return;
        }
        throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
    }

    /* renamed from: n */
    public AbstractC0819t mo4564n(Fragment fragment) {
        m4750f(new a(3, fragment));
        return this;
    }

    /* renamed from: o */
    public AbstractC0819t m4753o(int i10, Fragment fragment) {
        return m4754p(i10, fragment, null);
    }

    /* renamed from: p */
    public AbstractC0819t m4754p(int i10, Fragment fragment, String str) {
        if (i10 != 0) {
            mo4563m(i10, fragment, str, 2);
            return this;
        }
        throw new IllegalArgumentException("Must use non-zero containerViewId");
    }

    /* renamed from: q */
    public AbstractC0819t m4755q(int i10, int i11, int i12, int i13) {
        this.f4093d = i10;
        this.f4094e = i11;
        this.f4095f = i12;
        this.f4096g = i13;
        return this;
    }

    /* renamed from: r */
    public AbstractC0819t mo4565r(Fragment fragment, AbstractC0839f.c cVar) {
        m4750f(new a(10, fragment, cVar));
        return this;
    }

    /* renamed from: s */
    public AbstractC0819t m4756s(boolean z10) {
        this.f4107r = z10;
        return this;
    }

    /* renamed from: t */
    public AbstractC0819t mo4566t(Fragment fragment) {
        m4750f(new a(5, fragment));
        return this;
    }
}
