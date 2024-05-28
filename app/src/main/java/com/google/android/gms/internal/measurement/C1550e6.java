package com.google.android.gms.internal.measurement;

import android.util.Log;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.e6 */
/* loaded from: classes.dex */
public final class C1550e6 extends AbstractC1666l6<Long> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C1550e6(C1618i6 c1618i6, String str, Long l10, boolean z10) {
        super(c1618i6, str, l10, true, null);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1666l6
    /* renamed from: a */
    final /* bridge */ /* synthetic */ Long mo8088a(Object obj) {
        try {
            return Long.valueOf(Long.parseLong((String) obj));
        } catch (NumberFormatException unused) {
            String m8381c = super.m8381c();
            String str = (String) obj;
            StringBuilder sb2 = new StringBuilder(String.valueOf(m8381c).length() + 25 + str.length());
            sb2.append("Invalid long value for ");
            sb2.append(m8381c);
            sb2.append(": ");
            sb2.append(str);
            Log.e("PhenotypeFlag", sb2.toString());
            return null;
        }
    }
}
