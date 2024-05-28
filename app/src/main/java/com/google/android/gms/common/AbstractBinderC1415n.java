package com.google.android.gms.common;

import android.os.RemoteException;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import p110i3.BinderC3517b;
import p110i3.InterfaceC3516a;
import p321z2.AbstractBinderC6001r0;
import p321z2.C5984j;
import p321z2.InterfaceC5975e0;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.common.n */
/* loaded from: classes.dex */
public abstract class AbstractBinderC1415n extends AbstractBinderC6001r0 {

    /* renamed from: c */
    private final int f6399c;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractBinderC1415n(byte[] bArr) {
        C5984j.m21277a(bArr.length == 25);
        this.f6399c = Arrays.hashCode(bArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: n */
    public static byte[] m7730n(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e10) {
            throw new AssertionError(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J0 */
    public abstract byte[] mo7731J0();

    @Override // p321z2.InterfaceC5975e0
    /* renamed from: a */
    public final int mo7732a() {
        return this.f6399c;
    }

    @Override // p321z2.InterfaceC5975e0
    /* renamed from: c */
    public final InterfaceC3516a mo7733c() {
        return BinderC3517b.m15328J0(mo7731J0());
    }

    public final boolean equals(Object obj) {
        InterfaceC3516a mo7733c;
        if (obj != null && (obj instanceof InterfaceC5975e0)) {
            try {
                InterfaceC5975e0 interfaceC5975e0 = (InterfaceC5975e0) obj;
                if (interfaceC5975e0.mo7732a() == this.f6399c && (mo7733c = interfaceC5975e0.mo7733c()) != null) {
                    return Arrays.equals(mo7731J0(), (byte[]) BinderC3517b.m15329n(mo7733c));
                }
                return false;
            } catch (RemoteException e10) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e10);
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f6399c;
    }
}
