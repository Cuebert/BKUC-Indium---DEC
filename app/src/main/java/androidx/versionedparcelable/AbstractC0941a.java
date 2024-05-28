package androidx.versionedparcelable;

import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p093h0.C3356a;
import p148l1.InterfaceC3868a;

/* renamed from: androidx.versionedparcelable.a */
/* loaded from: classes.dex */
public abstract class AbstractC0941a {

    /* renamed from: a */
    protected final C3356a<String, Method> f5022a;

    /* renamed from: b */
    protected final C3356a<String, Method> f5023b;

    /* renamed from: c */
    protected final C3356a<String, Class> f5024c;

    public AbstractC0941a(C3356a<String, Method> c3356a, C3356a<String, Method> c3356a2, C3356a<String, Class> c3356a3) {
        this.f5022a = c3356a;
        this.f5023b = c3356a2;
        this.f5024c = c3356a3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: N */
    private void m6034N(InterfaceC3868a interfaceC3868a) {
        try {
            mo6046I(m6035c(interfaceC3868a.getClass()).getName());
        } catch (ClassNotFoundException e10) {
            throw new RuntimeException(interfaceC3868a.getClass().getSimpleName() + " does not have a Parcelizer", e10);
        }
    }

    /* renamed from: c */
    private Class m6035c(Class<? extends InterfaceC3868a> cls) throws ClassNotFoundException {
        Class cls2 = this.f5024c.get(cls.getName());
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(String.format("%s.%sParcelizer", cls.getPackage().getName(), cls.getSimpleName()), false, cls.getClassLoader());
        this.f5024c.put(cls.getName(), cls3);
        return cls3;
    }

    /* renamed from: d */
    private Method m6036d(String str) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException {
        Method method = this.f5022a.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, AbstractC0941a.class.getClassLoader()).getDeclaredMethod("read", AbstractC0941a.class);
        this.f5022a.put(str, declaredMethod);
        return declaredMethod;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: e */
    private Method m6037e(Class cls) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException {
        Method method = this.f5023b.get(cls.getName());
        if (method != null) {
            return method;
        }
        Class m6035c = m6035c(cls);
        System.currentTimeMillis();
        Method declaredMethod = m6035c.getDeclaredMethod("write", cls, AbstractC0941a.class);
        this.f5023b.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    /* renamed from: A */
    protected abstract void mo6038A(byte[] bArr);

    /* renamed from: B */
    public void m6039B(byte[] bArr, int i10) {
        mo6070w(i10);
        mo6038A(bArr);
    }

    /* renamed from: C */
    protected abstract void mo6040C(CharSequence charSequence);

    /* renamed from: D */
    public void m6041D(CharSequence charSequence, int i10) {
        mo6070w(i10);
        mo6040C(charSequence);
    }

    /* renamed from: E */
    protected abstract void mo6042E(int i10);

    /* renamed from: F */
    public void m6043F(int i10, int i11) {
        mo6070w(i11);
        mo6042E(i10);
    }

    /* renamed from: G */
    protected abstract void mo6044G(Parcelable parcelable);

    /* renamed from: H */
    public void m6045H(Parcelable parcelable, int i10) {
        mo6070w(i10);
        mo6044G(parcelable);
    }

    /* renamed from: I */
    protected abstract void mo6046I(String str);

    /* renamed from: J */
    public void m6047J(String str, int i10) {
        mo6070w(i10);
        mo6046I(str);
    }

    /* renamed from: K */
    protected <T extends InterfaceC3868a> void m6048K(T t10, AbstractC0941a abstractC0941a) {
        try {
            m6037e(t10.getClass()).invoke(null, t10, abstractC0941a);
        } catch (ClassNotFoundException e10) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e10);
        } catch (IllegalAccessException e11) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e11);
        } catch (NoSuchMethodException e12) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e12);
        } catch (InvocationTargetException e13) {
            if (e13.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e13.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e13);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: L */
    public void m6049L(InterfaceC3868a interfaceC3868a) {
        if (interfaceC3868a == null) {
            mo6046I(null);
            return;
        }
        m6034N(interfaceC3868a);
        AbstractC0941a mo6052b = mo6052b();
        m6048K(interfaceC3868a, mo6052b);
        mo6052b.mo6051a();
    }

    /* renamed from: M */
    public void m6050M(InterfaceC3868a interfaceC3868a, int i10) {
        mo6070w(i10);
        m6049L(interfaceC3868a);
    }

    /* renamed from: a */
    protected abstract void mo6051a();

    /* renamed from: b */
    protected abstract AbstractC0941a mo6052b();

    /* renamed from: f */
    public boolean m6053f() {
        return false;
    }

    /* renamed from: g */
    protected abstract boolean mo6054g();

    /* renamed from: h */
    public boolean m6055h(boolean z10, int i10) {
        return !mo6060m(i10) ? z10 : mo6054g();
    }

    /* renamed from: i */
    protected abstract byte[] mo6056i();

    /* renamed from: j */
    public byte[] m6057j(byte[] bArr, int i10) {
        return !mo6060m(i10) ? bArr : mo6056i();
    }

    /* renamed from: k */
    protected abstract CharSequence mo6058k();

    /* renamed from: l */
    public CharSequence m6059l(CharSequence charSequence, int i10) {
        return !mo6060m(i10) ? charSequence : mo6058k();
    }

    /* renamed from: m */
    protected abstract boolean mo6060m(int i10);

    /* renamed from: n */
    protected <T extends InterfaceC3868a> T m6061n(String str, AbstractC0941a abstractC0941a) {
        try {
            return (T) m6036d(str).invoke(null, abstractC0941a);
        } catch (ClassNotFoundException e10) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e10);
        } catch (IllegalAccessException e11) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e11);
        } catch (NoSuchMethodException e12) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e12);
        } catch (InvocationTargetException e13) {
            if (e13.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e13.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e13);
        }
    }

    /* renamed from: o */
    protected abstract int mo6062o();

    /* renamed from: p */
    public int m6063p(int i10, int i11) {
        return !mo6060m(i11) ? i10 : mo6062o();
    }

    /* renamed from: q */
    protected abstract <T extends Parcelable> T mo6064q();

    /* renamed from: r */
    public <T extends Parcelable> T m6065r(T t10, int i10) {
        return !mo6060m(i10) ? t10 : (T) mo6064q();
    }

    /* renamed from: s */
    protected abstract String mo6066s();

    /* renamed from: t */
    public String m6067t(String str, int i10) {
        return !mo6060m(i10) ? str : mo6066s();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: u */
    public <T extends InterfaceC3868a> T m6068u() {
        String mo6066s = mo6066s();
        if (mo6066s == null) {
            return null;
        }
        return (T) m6061n(mo6066s, mo6052b());
    }

    /* renamed from: v */
    public <T extends InterfaceC3868a> T m6069v(T t10, int i10) {
        return !mo6060m(i10) ? t10 : (T) m6068u();
    }

    /* renamed from: w */
    protected abstract void mo6070w(int i10);

    /* renamed from: x */
    public void m6071x(boolean z10, boolean z11) {
    }

    /* renamed from: y */
    protected abstract void mo6072y(boolean z10);

    /* renamed from: z */
    public void m6073z(boolean z10, int i10) {
        mo6070w(i10);
        mo6072y(z10);
    }
}
