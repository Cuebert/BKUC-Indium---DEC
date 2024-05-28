package p144ka;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import ma.C3969a;

/* renamed from: ka.a */
/* loaded from: classes.dex */
public class C3769a {

    /* renamed from: b */
    private static C3769a f15802b;

    /* renamed from: a */
    private boolean f15803a;

    /* renamed from: ka.a$a */
    /* loaded from: classes.dex */
    public enum a {
        SPLASH,
        MAIN
    }

    private C3769a(boolean z10) {
        this.f15803a = z10;
    }

    /* renamed from: c */
    public static void m16020c(Context context) {
        if (f15802b == null) {
            f15802b = new C3769a(context instanceof Activity);
        }
    }

    /* renamed from: d */
    public static C3769a m16021d() {
        return f15802b;
    }

    /* renamed from: a */
    public void m16022a(a aVar, Bundle bundle) {
        if (aVar == a.SPLASH) {
            if (bundle == null && this.f15803a) {
                C3969a.m16695e().m16698c("cold_start", 1L);
            } else {
                C3969a.m16695e().m16697b("warm_start");
            }
        }
    }

    /* renamed from: b */
    public void m16023b(a aVar) {
        C3969a.m16695e().m16697b("app_paused");
    }
}
