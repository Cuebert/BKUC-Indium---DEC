package p113i6;

import androidx.annotation.RecentlyNullable;
import p127j6.InterfaceC3649i;
import p321z2.C5984j;

/* renamed from: i6.a */
/* loaded from: classes.dex */
public class C3535a {

    /* renamed from: a */
    private final InterfaceC3649i f15118a;

    public C3535a(InterfaceC3649i interfaceC3649i) {
        this.f15118a = (InterfaceC3649i) C5984j.m21286j(interfaceC3649i);
    }

    /* renamed from: a */
    public int m15334a() {
        int zza = this.f15118a.zza();
        if (zza > 4096 || zza == 0) {
            return -1;
        }
        return zza;
    }

    @RecentlyNullable
    /* renamed from: b */
    public String m15335b() {
        return this.f15118a.mo15560k();
    }

    /* renamed from: c */
    public int m15336c() {
        return this.f15118a.zzb();
    }
}
