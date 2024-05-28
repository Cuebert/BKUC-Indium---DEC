package p032c6;

import androidx.annotation.RecentlyNonNull;
import p321z2.C5984j;

/* renamed from: c6.a */
/* loaded from: classes.dex */
public class C1131a extends Exception {

    /* renamed from: n */
    private final int f5466n;

    public C1131a(@RecentlyNonNull String str, int i10) {
        super(C5984j.m21283g(str, "Provided message must not be empty."));
        this.f5466n = i10;
    }

    /* renamed from: a */
    public int m6525a() {
        return this.f5466n;
    }

    public C1131a(@RecentlyNonNull String str, int i10, Throwable th) {
        super(C5984j.m21283g(str, "Provided message must not be empty."), th);
        this.f5466n = i10;
    }
}
