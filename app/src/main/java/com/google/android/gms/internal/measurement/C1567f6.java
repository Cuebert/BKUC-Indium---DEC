package com.google.android.gms.internal.measurement;

import android.util.Log;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.f6 */
/* loaded from: classes.dex */
public final class C1567f6 extends AbstractC1666l6<Boolean> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C1567f6(C1618i6 c1618i6, String str, Boolean bool, boolean z10) {
        super(c1618i6, str, bool, true, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.AbstractC1666l6
    /* renamed from: a */
    final /* bridge */ /* synthetic */ Boolean mo8088a(Object obj) {
        if (C1665l5.f6963c.matcher(obj).matches()) {
            return Boolean.TRUE;
        }
        if (C1665l5.f6964d.matcher(obj).matches()) {
            return Boolean.FALSE;
        }
        String m8381c = super.m8381c();
        String str = (String) obj;
        StringBuilder sb2 = new StringBuilder(String.valueOf(m8381c).length() + 28 + str.length());
        sb2.append("Invalid boolean value for ");
        sb2.append(m8381c);
        sb2.append(": ");
        sb2.append(str);
        Log.e("PhenotypeFlag", sb2.toString());
        return null;
    }
}
