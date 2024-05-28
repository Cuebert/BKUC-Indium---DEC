package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.AbstractC1732p8;
import com.google.android.gms.internal.measurement.C1684m8;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.internal.measurement.p8 */
/* loaded from: classes.dex */
public abstract class AbstractC1732p8<MessageType extends AbstractC1732p8<MessageType, BuilderType>, BuilderType extends C1684m8<MessageType, BuilderType>> extends AbstractC1890z6<MessageType, BuilderType> {
    private static final Map<Object, AbstractC1732p8<?, ?>> zza = new ConcurrentHashMap();
    protected C1830va zzc = C1830va.m8915c();
    protected int zzd = -1;

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: k */
    public static <E> InterfaceC1844w8<E> m8667k() {
        return C1537da.m8057e();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: l */
    public static <E> InterfaceC1844w8<E> m8668l(InterfaceC1844w8<E> interfaceC1844w8) {
        int size = interfaceC1844w8.size();
        return interfaceC1844w8.mo8008g(size == 0 ? 10 : size + size);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public static Object m8669m(Method method, Object obj, Object... objArr) {
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
    /* renamed from: n */
    public static Object m8670n(InterfaceC1813u9 interfaceC1813u9, String str, Object[] objArr) {
        return new C1554ea(interfaceC1813u9, str, objArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: o */
    public static <T extends AbstractC1732p8> void m8671o(Class<T> cls, T t10) {
        zza.put(cls, t10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public static <T extends AbstractC1732p8> T m8672r(Class<T> cls) {
        Map<Object, AbstractC1732p8<?, ?>> map = zza;
        AbstractC1732p8<?, ?> abstractC1732p8 = map.get(cls);
        if (abstractC1732p8 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC1732p8 = map.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (abstractC1732p8 == null) {
            abstractC1732p8 = (AbstractC1732p8) ((AbstractC1732p8) C1555eb.m8109j(cls)).mo7884v(6, null, null);
            if (abstractC1732p8 != null) {
                map.put(cls, abstractC1732p8);
            } else {
                throw new IllegalStateException();
            }
        }
        return abstractC1732p8;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: s */
    public static InterfaceC1812u8 m8673s() {
        return C1748q8.m8729i();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: t */
    public static InterfaceC1828v8 m8674t() {
        return C1621i9.m8303e();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: u */
    public static InterfaceC1828v8 m8675u(InterfaceC1828v8 interfaceC1828v8) {
        int size = interfaceC1828v8.size();
        return interfaceC1828v8.mo8008g(size == 0 ? 10 : size + size);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1813u9
    /* renamed from: a */
    public final /* synthetic */ InterfaceC1797t9 mo8676a() {
        C1684m8 c1684m8 = (C1684m8) mo7884v(5, null, null);
        c1684m8.m8470t(this);
        return c1684m8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.AbstractC1890z6
    /* renamed from: b */
    public final int mo8677b() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1813u9
    /* renamed from: d */
    public final void mo8678d(AbstractC1859x7 abstractC1859x7) throws IOException {
        C1520ca.m8011a().m8012b(getClass()).mo8166i(this, C1875y7.m9069l(abstractC1859x7));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.AbstractC1890z6
    /* renamed from: e */
    public final void mo8679e(int i10) {
        this.zzd = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return C1520ca.m8011a().m8012b(getClass()).mo8165h(this, (AbstractC1732p8) obj);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1813u9
    /* renamed from: g */
    public final int mo8680g() {
        int i10 = this.zzd;
        if (i10 != -1) {
            return i10;
        }
        int mo8160c = C1520ca.m8011a().m8012b(getClass()).mo8160c(this);
        this.zzd = mo8160c;
        return mo8160c;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1829v9
    /* renamed from: h */
    public final /* synthetic */ InterfaceC1813u9 mo8462h() {
        return (AbstractC1732p8) mo7884v(6, null, null);
    }

    public final int hashCode() {
        int i10 = this.zzb;
        if (i10 != 0) {
            return i10;
        }
        int mo8162e = C1520ca.m8011a().m8012b(getClass()).mo8162e(this);
        this.zzb = mo8162e;
        return mo8162e;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1813u9
    /* renamed from: j */
    public final /* synthetic */ InterfaceC1797t9 mo8681j() {
        return (C1684m8) mo7884v(5, null, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: p */
    public final <MessageType extends AbstractC1732p8<MessageType, BuilderType>, BuilderType extends C1684m8<MessageType, BuilderType>> BuilderType m8682p() {
        return (BuilderType) mo7884v(5, null, null);
    }

    /* renamed from: q */
    public final BuilderType m8683q() {
        BuilderType buildertype = (BuilderType) mo7884v(5, null, null);
        buildertype.m8470t(this);
        return buildertype;
    }

    public final String toString() {
        return C1845w9.m8945a(this, super.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: v */
    public abstract Object mo7884v(int i10, Object obj, Object obj2);
}
