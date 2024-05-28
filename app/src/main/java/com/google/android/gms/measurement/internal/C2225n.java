package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.Iterator;
import p321z2.C5984j;

/* renamed from: com.google.android.gms.measurement.internal.n */
/* loaded from: classes.dex */
public final class C2225n {

    /* renamed from: a */
    final String f8348a;

    /* renamed from: b */
    final String f8349b;

    /* renamed from: c */
    final String f8350c;

    /* renamed from: d */
    final long f8351d;

    /* renamed from: e */
    final long f8352e;

    /* renamed from: f */
    final zzar f8353f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2225n(C2219m4 c2219m4, String str, String str2, String str3, long j10, long j11, Bundle bundle) {
        zzar zzarVar;
        C5984j.m21282f(str2);
        C5984j.m21282f(str3);
        this.f8348a = str2;
        this.f8349b = str3;
        this.f8350c = true == TextUtils.isEmpty(str) ? null : str;
        this.f8351d = j10;
        this.f8352e = j11;
        if (j11 != 0 && j11 > j10) {
            c2219m4.mo9765d().m10053w().m9894b("Event created with reverse previous/current timestamps. appId", C2174i3.m10044z(str2));
        }
        if (bundle != null && !bundle.isEmpty()) {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    c2219m4.mo9765d().m10048r().m9893a("Param name can't be null");
                    it.remove();
                } else {
                    Object m9970o = c2219m4.m10114N().m9970o(next, bundle2.get(next));
                    if (m9970o == null) {
                        c2219m4.mo9765d().m10053w().m9894b("Param value can't be null", c2219m4.m10105D().m9810e(next));
                        it.remove();
                    } else {
                        c2219m4.m10114N().m9943B(bundle2, next, m9970o);
                    }
                }
            }
            zzarVar = new zzar(bundle2);
        } else {
            zzarVar = new zzar(new Bundle());
        }
        this.f8353f = zzarVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final C2225n m10184a(C2219m4 c2219m4, long j10) {
        return new C2225n(c2219m4, this.f8350c, this.f8348a, this.f8349b, this.f8351d, j10, this.f8353f);
    }

    public final String toString() {
        String str = this.f8348a;
        String str2 = this.f8349b;
        String obj = this.f8353f.toString();
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 33 + String.valueOf(str2).length() + obj.length());
        sb2.append("Event{appId='");
        sb2.append(str);
        sb2.append("', name='");
        sb2.append(str2);
        sb2.append("', params=");
        sb2.append(obj);
        sb2.append('}');
        return sb2.toString();
    }

    private C2225n(C2219m4 c2219m4, String str, String str2, String str3, long j10, long j11, zzar zzarVar) {
        C5984j.m21282f(str2);
        C5984j.m21282f(str3);
        C5984j.m21286j(zzarVar);
        this.f8348a = str2;
        this.f8349b = str3;
        this.f8350c = true == TextUtils.isEmpty(str) ? null : str;
        this.f8351d = j10;
        this.f8352e = j11;
        if (j11 != 0 && j11 > j10) {
            c2219m4.mo9765d().m10053w().m9895c("Event created with reverse previous/current timestamps. appId, name", C2174i3.m10044z(str2), C2174i3.m10044z(str3));
        }
        this.f8353f = zzarVar;
    }
}
