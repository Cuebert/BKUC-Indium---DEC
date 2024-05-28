package p246t3;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Objects;

/* renamed from: t3.s2 */
/* loaded from: classes.dex */
public abstract class AbstractC4702s2 implements Comparable {
    /* renamed from: c */
    private final AbstractC4702s2 m18816c(Class cls) throws C4698r2 {
        if (cls.isInstance(this)) {
            return (AbstractC4702s2) cls.cast(this);
        }
        throw new C4698r2("Expected a " + cls.getName() + " value, but got " + getClass().getName());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static int m18817d(byte b10) {
        return (b10 >> 5) & 7;
    }

    /* renamed from: g */
    public static C4682n2 m18818g(long j10) {
        return new C4682n2(j10);
    }

    /* renamed from: i */
    public static C4694q2 m18819i(String str) {
        return new C4694q2(str);
    }

    /* renamed from: j */
    public static AbstractC4702s2 m18820j(byte... bArr) throws C4678m2 {
        Objects.requireNonNull(bArr);
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(Arrays.copyOf(bArr, bArr.length));
        return C4706t2.m18826a(byteArrayInputStream, new C4714v2(byteArrayInputStream));
    }

    /* renamed from: k */
    public static AbstractC4702s2 m18821k(InputStream inputStream) throws C4678m2 {
        return C4706t2.m18826a(inputStream, new C4714v2(inputStream));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public int mo18779b() {
        return 0;
    }

    /* renamed from: e */
    public final C4674l2 m18822e() throws C4698r2 {
        return (C4674l2) m18816c(C4674l2.class);
    }

    /* renamed from: f */
    public final C4682n2 m18823f() throws C4698r2 {
        return (C4682n2) m18816c(C4682n2.class);
    }

    /* renamed from: h */
    public final C4690p2 m18824h() throws C4698r2 {
        return (C4690p2) m18816c(C4690p2.class);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract int zza();
}
