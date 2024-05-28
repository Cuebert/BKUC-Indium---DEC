package androidx.camera.camera2.internal;

import android.content.Context;
import android.media.CamcorderProfile;
import android.util.Size;
import androidx.camera.core.C0477u;
import androidx.core.util.C0654h;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p218r.C4397m0;
import p279w.AbstractC5035h2;
import p279w.InterfaceC5063o2;
import p279w.InterfaceC5096z;

/* renamed from: androidx.camera.camera2.internal.a1 */
/* loaded from: classes.dex */
public final class C0269a1 implements InterfaceC5096z {

    /* renamed from: a */
    private final Map<String, C0309i2> f1235a;

    /* renamed from: b */
    private final InterfaceC0277c f1236b;

    /* renamed from: androidx.camera.camera2.internal.a1$a */
    /* loaded from: classes.dex */
    class a implements InterfaceC0277c {
        a() {
        }

        @Override // androidx.camera.camera2.internal.InterfaceC0277c
        /* renamed from: a */
        public CamcorderProfile mo1335a(int i10, int i11) {
            return CamcorderProfile.get(i10, i11);
        }

        @Override // androidx.camera.camera2.internal.InterfaceC0277c
        /* renamed from: b */
        public boolean mo1336b(int i10, int i11) {
            return CamcorderProfile.hasProfile(i10, i11);
        }
    }

    public C0269a1(Context context, Object obj, Set<String> set) throws C0477u {
        this(context, new a(), obj, set);
    }

    /* renamed from: c */
    private void m1332c(Context context, C4397m0 c4397m0, Set<String> set) throws C0477u {
        C0654h.m3467f(context);
        for (String str : set) {
            this.f1235a.put(str, new C0309i2(context, str, c4397m0, this.f1236b));
        }
    }

    @Override // p279w.InterfaceC5096z
    /* renamed from: a */
    public AbstractC5035h2 mo1333a(String str, int i10, Size size) {
        C0309i2 c0309i2 = this.f1235a.get(str);
        if (c0309i2 != null) {
            return c0309i2.m1553L(i10, size);
        }
        return null;
    }

    @Override // p279w.InterfaceC5096z
    /* renamed from: b */
    public Map<InterfaceC5063o2<?>, Size> mo1334b(String str, List<AbstractC5035h2> list, List<InterfaceC5063o2<?>> list2) {
        C0654h.m3463b(!list2.isEmpty(), "No new use cases to be bound.");
        C0309i2 c0309i2 = this.f1235a.get(str);
        if (c0309i2 != null) {
            return c0309i2.m1562y(list, list2);
        }
        throw new IllegalArgumentException("No such camera id in supported combination list: " + str);
    }

    C0269a1(Context context, InterfaceC0277c interfaceC0277c, Object obj, Set<String> set) throws C0477u {
        C4397m0 m18163a;
        this.f1235a = new HashMap();
        C0654h.m3467f(interfaceC0277c);
        this.f1236b = interfaceC0277c;
        if (obj instanceof C4397m0) {
            m18163a = (C4397m0) obj;
        } else {
            m18163a = C4397m0.m18163a(context);
        }
        m1332c(context, m18163a, set);
    }
}
