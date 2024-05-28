package p070f3;

import android.os.SystemClock;

/* renamed from: f3.g */
/* loaded from: classes.dex */
public class C3133g implements InterfaceC3130d {

    /* renamed from: a */
    private static final C3133g f13142a = new C3133g();

    private C3133g() {
    }

    /* renamed from: c */
    public static InterfaceC3130d m13786c() {
        return f13142a;
    }

    @Override // p070f3.InterfaceC3130d
    /* renamed from: a */
    public final long mo13781a() {
        return System.currentTimeMillis();
    }

    @Override // p070f3.InterfaceC3130d
    /* renamed from: b */
    public final long mo13782b() {
        return SystemClock.elapsedRealtime();
    }

    @Override // p070f3.InterfaceC3130d
    public final long nanoTime() {
        return System.nanoTime();
    }
}
