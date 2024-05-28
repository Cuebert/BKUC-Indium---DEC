package p244t1;

import java.util.Arrays;
import p233s1.C4516a;

/* renamed from: t1.c */
/* loaded from: classes.dex */
public class C4612c {

    /* renamed from: a */
    AbstractC4611b[] f18375a;

    /* renamed from: b */
    int[] f18376b;

    public C4612c() {
        AbstractC4611b[] abstractC4611bArr = new AbstractC4611b[EnumC4616g.values().length];
        this.f18375a = abstractC4611bArr;
        int[] iArr = new int[abstractC4611bArr.length];
        this.f18376b = iArr;
        Arrays.fill(iArr, 0);
    }

    /* renamed from: a */
    public <T extends AbstractC4611b> T m18706a(Class<T> cls) {
        EnumC4616g enumC4616g = EnumC4616g.f18390A.get(cls);
        synchronized (enumC4616g) {
            T t10 = (T) this.f18375a[enumC4616g.ordinal()];
            if (t10 != null) {
                this.f18375a[enumC4616g.ordinal()] = t10.f18373b;
                this.f18376b[enumC4616g.ordinal()] = r7[r3] - 1;
                t10.f18373b = null;
                return t10;
            }
            try {
                try {
                    return cls.newInstance();
                } catch (IllegalAccessException e10) {
                    C4516a.m18535d(e10, "Cannot create an instance of " + cls + ". Make sure it has a public empty constructor.", new Object[0]);
                    return null;
                }
            } catch (InstantiationException e11) {
                C4516a.m18535d(e11, "Cannot create an instance of " + cls + ". Make sure it has a empty constructor.", new Object[0]);
                return null;
            }
        }
    }

    /* renamed from: b */
    public void m18707b(AbstractC4611b abstractC4611b) {
        EnumC4616g enumC4616g = abstractC4611b.f18372a;
        abstractC4611b.m18705b();
        synchronized (enumC4616g) {
            if (this.f18376b[enumC4616g.ordinal()] < 20) {
                abstractC4611b.f18373b = this.f18375a[enumC4616g.ordinal()];
                this.f18375a[enumC4616g.ordinal()] = abstractC4611b;
                int[] iArr = this.f18376b;
                int ordinal = enumC4616g.ordinal();
                iArr[ordinal] = iArr[ordinal] + 1;
            }
        }
    }
}
