package com.google.firebase.messaging;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import androidx.core.app.C0578k;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p070f3.C3137k;
import p085g4.C3269o;

/* renamed from: com.google.firebase.messaging.g */
/* loaded from: classes.dex */
final class C2625g {

    /* renamed from: a */
    private final Executor f10283a;

    /* renamed from: b */
    private final Context f10284b;

    /* renamed from: c */
    private final C2632n f10285c;

    public C2625g(Context context, C2632n c2632n, Executor executor) {
        this.f10283a = executor;
        this.f10284b = context;
        this.f10285c = c2632n;
    }

    /* renamed from: a */
    public final boolean m12052a() {
        boolean z10;
        if (this.f10285c.m12068g("gcm.n.noui")) {
            return true;
        }
        if (!((KeyguardManager) this.f10284b.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            if (!C3137k.m13802f()) {
                SystemClock.sleep(10L);
            }
            int myPid = Process.myPid();
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) this.f10284b.getSystemService("activity")).getRunningAppProcesses();
            if (runningAppProcesses != null) {
                Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    ActivityManager.RunningAppProcessInfo next = it.next();
                    if (next.pid == myPid) {
                        if (next.importance == 100) {
                            z10 = true;
                        }
                    }
                }
            }
        }
        z10 = false;
        if (z10) {
            return false;
        }
        C2631m m12054b = C2631m.m12054b(this.f10285c.m12066c("gcm.n.image"));
        if (m12054b != null) {
            m12054b.m12057e(this.f10283a);
        }
        C2622d m12047d = C2623e.m12047d(this.f10284b, this.f10285c);
        C0578k.e eVar = m12047d.f10279a;
        if (m12054b != null) {
            try {
                Bitmap bitmap = (Bitmap) C3269o.m14527b(m12054b.m12056c(), 5L, TimeUnit.SECONDS);
                eVar.m2856t(bitmap);
                eVar.m2835B(new C0578k.b().m2814i(bitmap).m2813h(null));
            } catch (InterruptedException unused) {
                Log.w("FirebaseMessaging", "Interrupted while downloading image, showing notification without it");
                m12054b.close();
                Thread.currentThread().interrupt();
            } catch (ExecutionException e10) {
                String valueOf = String.valueOf(e10.getCause());
                StringBuilder sb2 = new StringBuilder(valueOf.length() + 26);
                sb2.append("Failed to download image: ");
                sb2.append(valueOf);
                Log.w("FirebaseMessaging", sb2.toString());
            } catch (TimeoutException unused2) {
                Log.w("FirebaseMessaging", "Failed to download image in time, showing notification without it");
                m12054b.close();
            }
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Showing notification");
        }
        ((NotificationManager) this.f10284b.getSystemService("notification")).notify(m12047d.f10280b, 0, m12047d.f10279a.m2842c());
        return true;
    }
}
