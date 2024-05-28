package com.google.android.gms.common.internal;

import android.app.PendingIntent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.AbstractC1388b;
import p235s3.HandlerC4526i;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.common.internal.l */
/* loaded from: classes.dex */
public final class HandlerC1398l extends HandlerC4526i {

    /* renamed from: b */
    final /* synthetic */ AbstractC1388b f6356b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC1398l(AbstractC1388b abstractC1388b, Looper looper) {
        super(looper);
        this.f6356b = abstractC1388b;
    }

    /* renamed from: a */
    private static final void m7700a(Message message) {
        AbstractC1399m abstractC1399m = (AbstractC1399m) message.obj;
        abstractC1399m.mo7696b();
        abstractC1399m.m7704e();
    }

    /* renamed from: b */
    private static final boolean m7701b(Message message) {
        int i10 = message.what;
        return i10 == 2 || i10 == 1 || i10 == 7;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        AbstractC1388b.a aVar;
        AbstractC1388b.a aVar2;
        ConnectionResult connectionResult;
        ConnectionResult connectionResult2;
        boolean z10;
        if (this.f6356b.f6314C.get() != message.arg1) {
            if (m7701b(message)) {
                m7700a(message);
                return;
            }
            return;
        }
        int i10 = message.what;
        if ((i10 != 1 && i10 != 7 && ((i10 != 4 || this.f6356b.m7675t()) && message.what != 5)) || this.f6356b.m7666i()) {
            int i11 = message.what;
            if (i11 == 4) {
                this.f6356b.f6340z = new ConnectionResult(message.arg2);
                if (AbstractC1388b.m7642h0(this.f6356b)) {
                    AbstractC1388b abstractC1388b = this.f6356b;
                    z10 = abstractC1388b.f6312A;
                    if (!z10) {
                        abstractC1388b.m7643i0(3, null);
                        return;
                    }
                }
                AbstractC1388b abstractC1388b2 = this.f6356b;
                connectionResult2 = abstractC1388b2.f6340z;
                ConnectionResult connectionResult3 = connectionResult2 != null ? abstractC1388b2.f6340z : new ConnectionResult(8);
                this.f6356b.f6330p.mo7581a(connectionResult3);
                this.f6356b.m7651L(connectionResult3);
                return;
            }
            if (i11 == 5) {
                AbstractC1388b abstractC1388b3 = this.f6356b;
                connectionResult = abstractC1388b3.f6340z;
                ConnectionResult connectionResult4 = connectionResult != null ? abstractC1388b3.f6340z : new ConnectionResult(8);
                this.f6356b.f6330p.mo7581a(connectionResult4);
                this.f6356b.m7651L(connectionResult4);
                return;
            }
            if (i11 == 3) {
                Object obj = message.obj;
                ConnectionResult connectionResult5 = new ConnectionResult(message.arg2, obj instanceof PendingIntent ? (PendingIntent) obj : null);
                this.f6356b.f6330p.mo7581a(connectionResult5);
                this.f6356b.m7651L(connectionResult5);
                return;
            }
            if (i11 == 6) {
                this.f6356b.m7643i0(5, null);
                AbstractC1388b abstractC1388b4 = this.f6356b;
                aVar = abstractC1388b4.f6335u;
                if (aVar != null) {
                    aVar2 = abstractC1388b4.f6335u;
                    aVar2.mo7681i(message.arg2);
                }
                this.f6356b.m7652M(message.arg2);
                AbstractC1388b.m7641g0(this.f6356b, 5, 1, null);
                return;
            }
            if (i11 == 2 && !this.f6356b.m7661b()) {
                m7700a(message);
                return;
            }
            if (m7701b(message)) {
                ((AbstractC1399m) message.obj).m7702c();
                return;
            }
            Log.wtf("GmsClient", "Don't know how to handle message: " + message.what, new Exception());
            return;
        }
        m7700a(message);
    }
}
