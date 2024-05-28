package kotlin.jvm.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p036cb.C1163a;
import p051db.InterfaceC3030a;
import p051db.InterfaceC3031b;
import p051db.InterfaceC3032c;
import p051db.InterfaceC3033d;
import p051db.InterfaceC3034e;
import p051db.InterfaceC3035f;
import p051db.InterfaceC3036g;
import p051db.InterfaceC3037h;
import p051db.InterfaceC3038i;
import p051db.InterfaceC3039j;
import p051db.InterfaceC3040k;
import p051db.InterfaceC3041l;
import p051db.InterfaceC3042m;
import p051db.InterfaceC3043n;
import p051db.InterfaceC3044o;
import p051db.InterfaceC3045p;
import p051db.InterfaceC3046q;
import p051db.InterfaceC3047r;
import p051db.InterfaceC3048s;
import p051db.InterfaceC3049t;
import p051db.InterfaceC3050u;
import p051db.InterfaceC3051v;
import p051db.InterfaceC3052w;
import p104hb.InterfaceC3454c;
import p132jb.C3696m;
import p253ta.C4750g;
import p253ta.C4753j;
import ua.C4878c0;
import ua.C4880d0;
import ua.C4895m;
import ua.C4896n;

/* renamed from: kotlin.jvm.internal.c */
/* loaded from: classes.dex */
public final class C3838c implements InterfaceC3454c<Object>, InterfaceC3837b {

    /* renamed from: o */
    public static final a f15893o = new a(null);

    /* renamed from: p */
    private static final Map<Class<Object>, Integer> f15894p;

    /* renamed from: q */
    private static final HashMap<String, String> f15895q;

    /* renamed from: r */
    private static final HashMap<String, String> f15896r;

    /* renamed from: s */
    private static final HashMap<String, String> f15897s;

    /* renamed from: t */
    private static final Map<String, String> f15898t;

    /* renamed from: n */
    private final Class<?> f15899n;

    /* renamed from: kotlin.jvm.internal.c$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C3840e c3840e) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        List m19141d;
        int m19144g;
        Map<Class<Object>, Integer> m19109i;
        int m19088a;
        String m15694w;
        String m15694w2;
        int i10 = 0;
        m19141d = C4895m.m19141d(InterfaceC3030a.class, InterfaceC3041l.class, InterfaceC3045p.class, InterfaceC3046q.class, InterfaceC3047r.class, InterfaceC3048s.class, InterfaceC3049t.class, InterfaceC3050u.class, InterfaceC3051v.class, InterfaceC3052w.class, InterfaceC3031b.class, InterfaceC3032c.class, InterfaceC3033d.class, InterfaceC3034e.class, InterfaceC3035f.class, InterfaceC3036g.class, InterfaceC3037h.class, InterfaceC3038i.class, InterfaceC3039j.class, InterfaceC3040k.class, InterfaceC3042m.class, InterfaceC3043n.class, InterfaceC3044o.class);
        m19144g = C4896n.m19144g(m19141d, 10);
        ArrayList arrayList = new ArrayList(m19144g);
        for (Object obj : m19141d) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                C4895m.m19143f();
            }
            arrayList.add(C4753j.m18910a((Class) obj, Integer.valueOf(i10)));
            i10 = i11;
        }
        m19109i = C4880d0.m19109i(arrayList);
        f15894p = m19109i;
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("boolean", "kotlin.Boolean");
        hashMap.put("char", "kotlin.Char");
        hashMap.put("byte", "kotlin.Byte");
        hashMap.put("short", "kotlin.Short");
        hashMap.put("int", "kotlin.Int");
        hashMap.put("float", "kotlin.Float");
        hashMap.put("long", "kotlin.Long");
        hashMap.put("double", "kotlin.Double");
        f15895q = hashMap;
        HashMap<String, String> hashMap2 = new HashMap<>();
        hashMap2.put("java.lang.Boolean", "kotlin.Boolean");
        hashMap2.put("java.lang.Character", "kotlin.Char");
        hashMap2.put("java.lang.Byte", "kotlin.Byte");
        hashMap2.put("java.lang.Short", "kotlin.Short");
        hashMap2.put("java.lang.Integer", "kotlin.Int");
        hashMap2.put("java.lang.Float", "kotlin.Float");
        hashMap2.put("java.lang.Long", "kotlin.Long");
        hashMap2.put("java.lang.Double", "kotlin.Double");
        f15896r = hashMap2;
        HashMap<String, String> hashMap3 = new HashMap<>();
        hashMap3.put("java.lang.Object", "kotlin.Any");
        hashMap3.put("java.lang.String", "kotlin.String");
        hashMap3.put("java.lang.CharSequence", "kotlin.CharSequence");
        hashMap3.put("java.lang.Throwable", "kotlin.Throwable");
        hashMap3.put("java.lang.Cloneable", "kotlin.Cloneable");
        hashMap3.put("java.lang.Number", "kotlin.Number");
        hashMap3.put("java.lang.Comparable", "kotlin.Comparable");
        hashMap3.put("java.lang.Enum", "kotlin.Enum");
        hashMap3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        hashMap3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        hashMap3.put("java.util.Iterator", "kotlin.collections.Iterator");
        hashMap3.put("java.util.Collection", "kotlin.collections.Collection");
        hashMap3.put("java.util.List", "kotlin.collections.List");
        hashMap3.put("java.util.Set", "kotlin.collections.Set");
        hashMap3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        hashMap3.put("java.util.Map", "kotlin.collections.Map");
        hashMap3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        hashMap3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        hashMap3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        hashMap3.putAll(hashMap);
        hashMap3.putAll(hashMap2);
        Collection<String> values = hashMap.values();
        C3844i.m16252e(values, "primitiveFqNames.values");
        for (String kotlinName : values) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("kotlin.jvm.internal.");
            C3844i.m16252e(kotlinName, "kotlinName");
            m15694w2 = C3696m.m15694w(kotlinName, '.', null, 2, null);
            sb2.append(m15694w2);
            sb2.append("CompanionObject");
            C4750g m18910a = C4753j.m18910a(sb2.toString(), kotlinName + ".Companion");
            hashMap3.put(m18910a.m18902c(), m18910a.m18903d());
        }
        for (Map.Entry<Class<Object>, Integer> entry : f15894p.entrySet()) {
            hashMap3.put(entry.getKey().getName(), "kotlin.Function" + entry.getValue().intValue());
        }
        f15897s = hashMap3;
        m19088a = C4878c0.m19088a(hashMap3.size());
        LinkedHashMap linkedHashMap = new LinkedHashMap(m19088a);
        for (Map.Entry entry2 : hashMap3.entrySet()) {
            Object key = entry2.getKey();
            m15694w = C3696m.m15694w((String) entry2.getValue(), '.', null, 2, null);
            linkedHashMap.put(key, m15694w);
        }
        f15898t = linkedHashMap;
    }

    public C3838c(Class<?> jClass) {
        C3844i.m16253f(jClass, "jClass");
        this.f15899n = jClass;
    }

    @Override // kotlin.jvm.internal.InterfaceC3837b
    /* renamed from: a */
    public Class<?> mo16245a() {
        return this.f15899n;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C3838c) && C3844i.m16248a(C1163a.m6768a(this), C1163a.m6768a((InterfaceC3454c) obj));
    }

    public int hashCode() {
        return C1163a.m6768a(this).hashCode();
    }

    public String toString() {
        return mo16245a().toString() + " (Kotlin reflection is not available)";
    }
}
