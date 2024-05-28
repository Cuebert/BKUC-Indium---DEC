package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import com.google.firebase.iid.BinderC2601p;
import java.util.concurrent.ExecutorService;
import p084g3.ThreadFactoryC3239a;
import p085g4.AbstractC3263l;
import p085g4.C3265m;
import p085g4.C3269o;
import p085g4.InterfaceC3251f;
import p224r5.C4440l;
import p224r5.InterfaceC4442n;
import p259u3.C4841a;
import p259u3.C4846f;
import p259u3.InterfaceC4842b;

@SuppressLint({"UnwrappedWakefulBroadcastReceiver"})
/* renamed from: com.google.firebase.messaging.f */
/* loaded from: classes.dex */
public abstract class AbstractServiceC2624f extends Service {
    private final ExecutorService zza;
    private Binder zzb;
    private final Object zzc;
    private int zzd;
    private int zze;

    public AbstractServiceC2624f() {
        InterfaceC4842b m19031a = C4841a.m19031a();
        String simpleName = getClass().getSimpleName();
        this.zza = m19031a.mo19033b(new ThreadFactoryC3239a(simpleName.length() != 0 ? "Firebase-".concat(simpleName) : new String("Firebase-")), C4846f.f18712a);
        this.zzc = new Object();
        this.zze = 0;
    }

    /* renamed from: zze */
    public final AbstractC3263l<Void> zzd(Intent intent) {
        if (zzb(intent)) {
            return C3269o.m14531f(null);
        }
        C3265m c3265m = new C3265m();
        this.zza.execute(new Runnable(this, intent, c3265m) { // from class: com.google.firebase.messaging.h

            /* renamed from: n */
            private final AbstractServiceC2624f f10286n;

            /* renamed from: o */
            private final Intent f10287o;

            /* renamed from: p */
            private final C3265m f10288p;

            public RunnableC2626h(AbstractServiceC2624f this, Intent intent2, C3265m c3265m2) {
                this.f10286n = this;
                this.f10287o = intent2;
                this.f10288p = c3265m2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                AbstractServiceC2624f abstractServiceC2624f = this.f10286n;
                Intent intent2 = this.f10287o;
                C3265m c3265m2 = this.f10288p;
                try {
                    abstractServiceC2624f.zzc(intent2);
                } finally {
                    c3265m2.m14514c(null);
                }
            }
        });
        return c3265m2.m14512a();
    }

    private final void zzf(Intent intent) {
        if (intent != null) {
            C4440l.m18249b(intent);
        }
        synchronized (this.zzc) {
            int i10 = this.zze - 1;
            this.zze = i10;
            if (i10 == 0) {
                stopSelfResult(this.zzd);
            }
        }
    }

    @Override // android.app.Service
    public final synchronized IBinder onBind(Intent intent) {
        if (Log.isLoggable("EnhancedIntentService", 3)) {
            Log.d("EnhancedIntentService", "Service received bind request");
        }
        if (this.zzb == null) {
            this.zzb = new BinderC2601p(new InterfaceC4442n(this) { // from class: com.google.firebase.messaging.i

                /* renamed from: a */
                private final AbstractServiceC2624f f10289a;

                public C2627i(AbstractServiceC2624f this) {
                    this.f10289a = this;
                }

                @Override // p224r5.InterfaceC4442n
                /* renamed from: a */
                public final AbstractC3263l mo12053a(Intent intent2) {
                    return this.f10289a.zzd(intent2);
                }
            });
        }
        return this.zzb;
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.zza.shutdown();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i10, int i11) {
        synchronized (this.zzc) {
            this.zzd = i11;
            this.zze++;
        }
        Intent zza = zza(intent);
        if (zza == null) {
            zzf(intent);
            return 2;
        }
        AbstractC3263l<Void> zzd = zzd(zza);
        if (zzd.mo14507n()) {
            zzf(intent);
            return 2;
        }
        zzd.mo14496c(ExecutorC2629k.f10292n, new InterfaceC3251f(this, intent) { // from class: com.google.firebase.messaging.j

            /* renamed from: a */
            private final AbstractServiceC2624f f10290a;

            /* renamed from: b */
            private final Intent f10291b;

            public C2628j(AbstractServiceC2624f this, Intent intent2) {
                this.f10290a = this;
                this.f10291b = intent2;
            }

            @Override // p085g4.InterfaceC3251f
            /* renamed from: a */
            public final void mo7517a(AbstractC3263l abstractC3263l) {
                this.f10290a.zza(this.f10291b, abstractC3263l);
            }
        });
        return 3;
    }

    protected Intent zza(Intent intent) {
        return intent;
    }

    public final /* synthetic */ void zza(Intent intent, AbstractC3263l abstractC3263l) {
        zzf(intent);
    }

    public boolean zzb(Intent intent) {
        return false;
    }

    public abstract void zzc(Intent intent);
}
