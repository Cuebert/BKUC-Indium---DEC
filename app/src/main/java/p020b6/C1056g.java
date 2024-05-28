package p020b6;

import com.appsflyer.oaid.BuildConfig;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.bind.TypeAdapters;
import java.lang.reflect.Type;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: b6.g */
/* loaded from: classes.dex */
public final class C1056g {

    /* renamed from: h */
    private String f5286h;

    /* renamed from: a */
    private Excluder f5279a = Excluder.DEFAULT;

    /* renamed from: b */
    private EnumC1070u f5280b = EnumC1070u.f5300n;

    /* renamed from: c */
    private InterfaceC1054e f5281c = EnumC1053d.f5245n;

    /* renamed from: d */
    private final Map<Type, InterfaceC1057h<?>> f5282d = new HashMap();

    /* renamed from: e */
    private final List<InterfaceC1072w> f5283e = new ArrayList();

    /* renamed from: f */
    private final List<InterfaceC1072w> f5284f = new ArrayList();

    /* renamed from: g */
    private boolean f5285g = false;

    /* renamed from: i */
    private int f5287i = 2;

    /* renamed from: j */
    private int f5288j = 2;

    /* renamed from: k */
    private boolean f5289k = false;

    /* renamed from: l */
    private boolean f5290l = false;

    /* renamed from: m */
    private boolean f5291m = true;

    /* renamed from: n */
    private boolean f5292n = false;

    /* renamed from: o */
    private boolean f5293o = false;

    /* renamed from: p */
    private boolean f5294p = false;

    /* renamed from: a */
    private void m6328a(String str, int i10, int i11, List<InterfaceC1072w> list) {
        C1050a c1050a;
        C1050a c1050a2;
        C1050a c1050a3;
        if (str != null && !BuildConfig.FLAVOR.equals(str.trim())) {
            c1050a = new C1050a(Date.class, str);
            c1050a2 = new C1050a(Timestamp.class, str);
            c1050a3 = new C1050a(java.sql.Date.class, str);
        } else {
            if (i10 == 2 || i11 == 2) {
                return;
            }
            C1050a c1050a4 = new C1050a(Date.class, i10, i11);
            C1050a c1050a5 = new C1050a(Timestamp.class, i10, i11);
            C1050a c1050a6 = new C1050a(java.sql.Date.class, i10, i11);
            c1050a = c1050a4;
            c1050a2 = c1050a5;
            c1050a3 = c1050a6;
        }
        list.add(TypeAdapters.newFactory(Date.class, c1050a));
        list.add(TypeAdapters.newFactory(Timestamp.class, c1050a2));
        list.add(TypeAdapters.newFactory(java.sql.Date.class, c1050a3));
    }

    /* renamed from: b */
    public C1055f m6329b() {
        List<InterfaceC1072w> arrayList = new ArrayList<>(this.f5283e.size() + this.f5284f.size() + 3);
        arrayList.addAll(this.f5283e);
        Collections.reverse(arrayList);
        ArrayList arrayList2 = new ArrayList(this.f5284f);
        Collections.reverse(arrayList2);
        arrayList.addAll(arrayList2);
        m6328a(this.f5286h, this.f5287i, this.f5288j, arrayList);
        return new C1055f(this.f5279a, this.f5281c, this.f5282d, this.f5285g, this.f5289k, this.f5293o, this.f5291m, this.f5292n, this.f5294p, this.f5290l, this.f5280b, this.f5286h, this.f5287i, this.f5288j, this.f5283e, this.f5284f, arrayList);
    }

    /* renamed from: c */
    public C1056g m6330c(EnumC1053d enumC1053d) {
        this.f5281c = enumC1053d;
        return this;
    }
}
