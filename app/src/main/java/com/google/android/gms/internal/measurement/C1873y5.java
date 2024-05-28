package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.database.ContentObserver;
import android.util.Log;
import androidx.core.content.C0588b;

/* renamed from: com.google.android.gms.internal.measurement.y5 */
/* loaded from: classes.dex */
public final class C1873y5 implements InterfaceC1825v5 {

    /* renamed from: c */
    private static C1873y5 f7327c;

    /* renamed from: a */
    private final Context f7328a;

    /* renamed from: b */
    private final ContentObserver f7329b;

    private C1873y5() {
        this.f7328a = null;
        this.f7329b = null;
    }

    private C1873y5(Context context) {
        this.f7328a = context;
        C1857x5 c1857x5 = new C1857x5(this, null);
        this.f7329b = c1857x5;
        context.getContentResolver().registerContentObserver(C1665l5.f6961a, true, c1857x5);
    }

    /* renamed from: b */
    public static C1873y5 m9065b(Context context) {
        C1873y5 c1873y5;
        C1873y5 c1873y52;
        synchronized (C1873y5.class) {
            if (f7327c == null) {
                if (C0588b.m3053b(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0) {
                    c1873y52 = new C1873y5(context);
                } else {
                    c1873y52 = new C1873y5();
                }
                f7327c = c1873y52;
            }
            c1873y5 = f7327c;
        }
        return c1873y5;
    }

    /* renamed from: e */
    public static synchronized void m9066e() {
        Context context;
        synchronized (C1873y5.class) {
            C1873y5 c1873y5 = f7327c;
            if (c1873y5 != null && (context = c1873y5.f7328a) != null && c1873y5.f7329b != null) {
                context.getContentResolver().unregisterContentObserver(f7327c.f7329b);
            }
            f7327c = null;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1825v5
    /* renamed from: c */
    public final String mo8459a(String str) {
        if (this.f7328a == null) {
            return null;
        }
        try {
            return (String) C1793t5.m8845a(new InterfaceC1809u5() { // from class: com.google.android.gms.internal.measurement.w5

                /* renamed from: b */
                public final /* synthetic */ String f7280b;

                public /* synthetic */ C1841w5(String str2) {
                    r2 = str2;
                }

                @Override // com.google.android.gms.internal.measurement.InterfaceC1809u5
                public final Object zza() {
                    return C1873y5.this.m9068d(r2);
                }
            });
        } catch (IllegalStateException | NullPointerException | SecurityException e10) {
            String valueOf = String.valueOf(str2);
            Log.e("GservicesLoader", valueOf.length() != 0 ? "Unable to read GServices for: ".concat(valueOf) : new String("Unable to read GServices for: "), e10);
            return null;
        }
    }

    /* renamed from: d */
    public final /* synthetic */ String m9068d(String str) {
        return C1665l5.m8375a(this.f7328a.getContentResolver(), str, null);
    }
}
