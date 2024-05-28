package com.google.android.gms.internal.measurement;

import android.os.Binder;

/* renamed from: com.google.android.gms.internal.measurement.t5 */
/* loaded from: classes.dex */
public final /* synthetic */ class C1793t5 {
    /* renamed from: a */
    public static <V> V m8845a(InterfaceC1809u5<V> interfaceC1809u5) {
        try {
            return interfaceC1809u5.zza();
        } catch (SecurityException unused) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                return interfaceC1809u5.zza();
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
    }
}
