package p266ub;

import ac.C0076f;
import p205pb.C4286e;

/* renamed from: ub.c */
/* loaded from: classes.dex */
public final class C4911c {

    /* renamed from: d */
    public static final C0076f f18794d = C0076f.m388i(":");

    /* renamed from: e */
    public static final C0076f f18795e = C0076f.m388i(":status");

    /* renamed from: f */
    public static final C0076f f18796f = C0076f.m388i(":method");

    /* renamed from: g */
    public static final C0076f f18797g = C0076f.m388i(":path");

    /* renamed from: h */
    public static final C0076f f18798h = C0076f.m388i(":scheme");

    /* renamed from: i */
    public static final C0076f f18799i = C0076f.m388i(":authority");

    /* renamed from: a */
    public final C0076f f18800a;

    /* renamed from: b */
    public final C0076f f18801b;

    /* renamed from: c */
    final int f18802c;

    public C4911c(String str, String str2) {
        this(C0076f.m388i(str), C0076f.m388i(str2));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C4911c)) {
            return false;
        }
        C4911c c4911c = (C4911c) obj;
        return this.f18800a.equals(c4911c.f18800a) && this.f18801b.equals(c4911c.f18801b);
    }

    public int hashCode() {
        return ((527 + this.f18800a.hashCode()) * 31) + this.f18801b.hashCode();
    }

    public String toString() {
        return C4286e.m17753q("%s: %s", this.f18800a.mo404w(), this.f18801b.mo404w());
    }

    public C4911c(C0076f c0076f, String str) {
        this(c0076f, C0076f.m388i(str));
    }

    public C4911c(C0076f c0076f, C0076f c0076f2) {
        this.f18800a = c0076f;
        this.f18801b = c0076f2;
        this.f18802c = c0076f.mo399r() + 32 + c0076f2.mo399r();
    }
}
