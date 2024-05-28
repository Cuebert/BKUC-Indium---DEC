package p003a2;

import android.util.Base64;
import com.appsflyer.oaid.BuildConfig;
import p003a2.C0009d;
import p307y1.EnumC5595d;

/* renamed from: a2.o */
/* loaded from: classes.dex */
public abstract class AbstractC0020o {

    /* renamed from: a2.o$a */
    /* loaded from: classes.dex */
    public static abstract class a {
        /* renamed from: a */
        public abstract AbstractC0020o mo115a();

        /* renamed from: b */
        public abstract a mo116b(String str);

        /* renamed from: c */
        public abstract a mo117c(byte[] bArr);

        /* renamed from: d */
        public abstract a mo118d(EnumC5595d enumC5595d);
    }

    /* renamed from: a */
    public static a m148a() {
        return new C0009d.b().mo118d(EnumC5595d.DEFAULT);
    }

    /* renamed from: b */
    public abstract String mo112b();

    /* renamed from: c */
    public abstract byte[] mo113c();

    /* renamed from: d */
    public abstract EnumC5595d mo114d();

    /* renamed from: e */
    public boolean m149e() {
        return mo113c() != null;
    }

    /* renamed from: f */
    public AbstractC0020o m150f(EnumC5595d enumC5595d) {
        return m148a().mo116b(mo112b()).mo118d(enumC5595d).mo117c(mo113c()).mo115a();
    }

    public final String toString() {
        Object[] objArr = new Object[3];
        objArr[0] = mo112b();
        objArr[1] = mo114d();
        objArr[2] = mo113c() == null ? BuildConfig.FLAVOR : Base64.encodeToString(mo113c(), 2);
        return String.format("TransportContext(%s, %s, %s)", objArr);
    }
}
