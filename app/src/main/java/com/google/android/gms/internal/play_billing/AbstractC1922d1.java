package com.google.android.gms.internal.play_billing;

import com.google.android.gms.internal.play_billing.AbstractC1922d1;
import com.google.android.gms.internal.play_billing.C2073z0;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.internal.play_billing.d1 */
/* loaded from: classes.dex */
public abstract class AbstractC1922d1<MessageType extends AbstractC1922d1<MessageType, BuilderType>, BuilderType extends C2073z0<MessageType, BuilderType>> extends AbstractC1976l<MessageType, BuilderType> {
    private static final Map zzb = new ConcurrentHashMap();
    private int zzd = -1;
    protected C1966j3 zzc = C1966j3.m9455c();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public static AbstractC1922d1 m9289i(Class cls) {
        Map map = zzb;
        AbstractC1922d1 abstractC1922d1 = (AbstractC1922d1) map.get(cls);
        if (abstractC1922d1 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC1922d1 = (AbstractC1922d1) map.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (abstractC1922d1 == null) {
            abstractC1922d1 = (AbstractC1922d1) ((AbstractC1922d1) C2029s3.m9626j(cls)).mo9309t(6, null, null);
            if (abstractC1922d1 != null) {
                map.put(cls, abstractC1922d1);
            } else {
                throw new IllegalStateException();
            }
        }
        return abstractC1922d1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: k */
    public static AbstractC1922d1 m9290k(AbstractC1922d1 abstractC1922d1, byte[] bArr, C2005p0 c2005p0) throws C1964j1 {
        AbstractC1922d1 m9295v = m9295v(abstractC1922d1, bArr, 0, bArr.length, c2005p0);
        if (m9295v == null || m9295v.m9307r()) {
            return m9295v;
        }
        C1964j1 m9381a = new C1952h3(m9295v).m9381a();
        m9381a.m9406f(m9295v);
        throw m9381a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public static Object m9291l(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e10);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if (!(cause instanceof RuntimeException)) {
                if (cause instanceof Error) {
                    throw ((Error) cause);
                }
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
            throw ((RuntimeException) cause);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: m */
    public static Object m9292m(InterfaceC1944g2 interfaceC1944g2, String str, Object[] objArr) {
        return new C2007p2(interfaceC1944g2, str, objArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: p */
    public static void m9293p(Class cls, AbstractC1922d1 abstractC1922d1) {
        abstractC1922d1.m9305o();
        zzb.put(cls, abstractC1922d1);
    }

    /* renamed from: u */
    private final int m9294u(InterfaceC2014q2 interfaceC2014q2) {
        return C2000o2.m9515a().m9516b(getClass()).mo9448c(this);
    }

    /* renamed from: v */
    private static AbstractC1922d1 m9295v(AbstractC1922d1 abstractC1922d1, byte[] bArr, int i10, int i11, C2005p0 c2005p0) throws C1964j1 {
        AbstractC1922d1 m9303j = abstractC1922d1.m9303j();
        try {
            InterfaceC2014q2 m9516b = C2000o2.m9515a().m9516b(m9303j.getClass());
            m9516b.mo9454i(m9303j, bArr, 0, i11, new C1997o(c2005p0));
            m9516b.mo9446a(m9303j);
            return m9303j;
        } catch (C1952h3 e10) {
            C1964j1 m9381a = e10.m9381a();
            m9381a.m9406f(m9303j);
            throw m9381a;
        } catch (C1964j1 e11) {
            e11.m9406f(m9303j);
            throw e11;
        } catch (IOException e12) {
            if (e12.getCause() instanceof C1964j1) {
                throw ((C1964j1) e12.getCause());
            }
            C1964j1 c1964j1 = new C1964j1(e12);
            c1964j1.m9406f(m9303j);
            throw c1964j1;
        } catch (IndexOutOfBoundsException unused) {
            C1964j1 m9405g = C1964j1.m9405g();
            m9405g.m9406f(m9303j);
            throw m9405g;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC1944g2
    /* renamed from: a */
    public final void mo9296a(AbstractC1970k0 abstractC1970k0) throws IOException {
        C2000o2.m9515a().m9516b(getClass()).mo9451f(this, C1977l0.m9489K(abstractC1970k0));
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC1944g2
    /* renamed from: b */
    public final int mo9297b() {
        int i10;
        if (m9308s()) {
            i10 = m9294u(null);
            if (i10 < 0) {
                throw new IllegalStateException("serialized size must be non-negative, was " + i10);
            }
        } else {
            i10 = this.zzd & Integer.MAX_VALUE;
            if (i10 == Integer.MAX_VALUE) {
                i10 = m9294u(null);
                if (i10 >= 0) {
                    this.zzd = (this.zzd & Integer.MIN_VALUE) | i10;
                } else {
                    throw new IllegalStateException("serialized size must be non-negative, was " + i10);
                }
            }
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.play_billing.AbstractC1976l
    /* renamed from: c */
    public final int mo9298c(InterfaceC2014q2 interfaceC2014q2) {
        if (m9308s()) {
            int mo9448c = interfaceC2014q2.mo9448c(this);
            if (mo9448c >= 0) {
                return mo9448c;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + mo9448c);
        }
        int i10 = this.zzd & Integer.MAX_VALUE;
        if (i10 != Integer.MAX_VALUE) {
            return i10;
        }
        int mo9448c2 = interfaceC2014q2.mo9448c(this);
        if (mo9448c2 >= 0) {
            this.zzd = (this.zzd & Integer.MIN_VALUE) | mo9448c2;
            return mo9448c2;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + mo9448c2);
    }

    /* renamed from: e */
    final int m9299e() {
        return C2000o2.m9515a().m9516b(getClass()).mo9450e(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return C2000o2.m9515a().m9516b(getClass()).mo9452g(this, (AbstractC1922d1) obj);
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC1951h2
    /* renamed from: f */
    public final /* synthetic */ InterfaceC1944g2 mo9300f() {
        return (AbstractC1922d1) mo9309t(6, null, null);
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC1944g2
    /* renamed from: g */
    public final /* synthetic */ InterfaceC1937f2 mo9301g() {
        return (C2073z0) mo9309t(5, null, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: h */
    public final C2073z0 m9302h() {
        return (C2073z0) mo9309t(5, null, null);
    }

    public final int hashCode() {
        if (m9308s()) {
            return m9299e();
        }
        int i10 = this.zza;
        if (i10 != 0) {
            return i10;
        }
        int m9299e = m9299e();
        this.zza = m9299e;
        return m9299e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public final AbstractC1922d1 m9303j() {
        return (AbstractC1922d1) mo9309t(4, null, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: n */
    public final void m9304n() {
        C2000o2.m9515a().m9516b(getClass()).mo9446a(this);
        m9305o();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public final void m9305o() {
        this.zzd &= Integer.MAX_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public final void m9306q(int i10) {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    /* renamed from: r */
    public final boolean m9307r() {
        byte byteValue = ((Byte) mo9309t(1, null, null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean mo9453h = C2000o2.m9515a().m9516b(getClass()).mo9453h(this);
        mo9309t(2, true != mo9453h ? null : this, null);
        return mo9453h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public final boolean m9308s() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: t */
    public abstract Object mo9309t(int i10, Object obj, Object obj2);

    public final String toString() {
        return C1958i2.m9386a(this, super.toString());
    }
}
