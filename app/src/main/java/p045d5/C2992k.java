package p045d5;

import java.util.Objects;

/* renamed from: d5.k */
/* loaded from: classes.dex */
public final class C2992k implements InterfaceC2991j {

    /* renamed from: b */
    private static final C2992k f12689b = new C2992k(null);

    /* renamed from: a */
    private final Object f12690a;

    private C2992k(Object obj) {
        this.f12690a = obj;
    }

    /* renamed from: b */
    public static InterfaceC2991j m13462b(Object obj) {
        Objects.requireNonNull(obj, "instance cannot be null");
        return new C2992k(obj);
    }

    @Override // p045d5.InterfaceC2994m
    /* renamed from: a */
    public final Object mo6269a() {
        return this.f12690a;
    }
}
