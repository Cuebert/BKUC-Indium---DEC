package androidx.camera.camera2.internal;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import androidx.camera.core.C0459p1;
import androidx.camera.core.C0463q1;
import androidx.camera.core.C0469s;
import androidx.camera.core.C0477u;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p218r.C4382f;
import p218r.C4397m0;
import p279w.AbstractC5033h0;
import p279w.C5029g0;
import p279w.InterfaceC5005a0;
import p279w.InterfaceC5017d0;

/* renamed from: androidx.camera.camera2.internal.v */
/* loaded from: classes.dex */
public final class C0358v implements InterfaceC5005a0 {

    /* renamed from: a */
    private final AbstractC5033h0 f1618a;

    /* renamed from: c */
    private final C4397m0 f1620c;

    /* renamed from: d */
    private final List<String> f1621d;

    /* renamed from: e */
    private final C0360v1 f1622e;

    /* renamed from: f */
    private final Map<String, C0311j0> f1623f = new HashMap();

    /* renamed from: b */
    private final C5029g0 f1619b = new C5029g0(1);

    public C0358v(Context context, AbstractC5033h0 abstractC5033h0, C0469s c0469s) throws C0459p1 {
        this.f1618a = abstractC5033h0;
        this.f1620c = C4397m0.m18164b(context, abstractC5033h0.mo19462c());
        this.f1622e = C0360v1.m1789b(context);
        this.f1621d = m1781d(C0304h1.m1500b(this, c0469s));
    }

    /* renamed from: d */
    private List<String> m1781d(List<String> list) throws C0459p1 {
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (!str.equals("0") && !str.equals("1")) {
                if (m1782g(str)) {
                    arrayList.add(str);
                } else {
                    C0463q1.m2202a("Camera2CameraFactory", "Camera " + str + " is filtered out because its capabilities do not contain REQUEST_AVAILABLE_CAPABILITIES_BACKWARD_COMPATIBLE.");
                }
            } else {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    /* renamed from: g */
    private boolean m1782g(String str) throws C0459p1 {
        if ("robolectric".equals(Build.FINGERPRINT)) {
            return true;
        }
        try {
            int[] iArr = (int[]) this.f1620c.m18165c(str).m18192a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
            if (iArr != null) {
                for (int i10 : iArr) {
                    if (i10 == 0) {
                        return true;
                    }
                }
            }
            return false;
        } catch (C4382f e10) {
            throw new C0459p1(C0312j1.m1581a(e10));
        }
    }

    @Override // p279w.InterfaceC5005a0
    /* renamed from: a */
    public InterfaceC5017d0 mo1783a(String str) throws C0477u {
        if (this.f1621d.contains(str)) {
            return new C0298g0(this.f1620c, str, m1786e(str), this.f1619b, this.f1618a.mo19461b(), this.f1618a.mo19462c(), this.f1622e);
        }
        throw new IllegalArgumentException("The given camera id is not on the available camera id list.");
    }

    @Override // p279w.InterfaceC5005a0
    /* renamed from: c */
    public Set<String> mo1785c() {
        return new LinkedHashSet(this.f1621d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public C0311j0 m1786e(String str) throws C0477u {
        try {
            C0311j0 c0311j0 = this.f1623f.get(str);
            if (c0311j0 != null) {
                return c0311j0;
            }
            C0311j0 c0311j02 = new C0311j0(str, this.f1620c);
            this.f1623f.put(str, c0311j02);
            return c0311j02;
        } catch (C4382f e10) {
            throw C0312j1.m1581a(e10);
        }
    }

    @Override // p279w.InterfaceC5005a0
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public C4397m0 mo1784b() {
        return this.f1620c;
    }
}
