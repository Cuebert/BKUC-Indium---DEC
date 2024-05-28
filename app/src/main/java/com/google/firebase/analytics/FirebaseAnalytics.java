package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.internal.measurement.C1774s2;
import com.google.firebase.installations.C2614b;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p018b4.InterfaceC1006t;
import p085g4.C3269o;
import p321z2.C5984j;

/* loaded from: classes.dex */
public final class FirebaseAnalytics {

    /* renamed from: b */
    private static volatile FirebaseAnalytics f10135b;

    /* renamed from: a */
    private final C1774s2 f10136a;

    public FirebaseAnalytics(C1774s2 c1774s2) {
        C5984j.m21286j(c1774s2);
        this.f10136a = c1774s2;
    }

    @Keep
    public static FirebaseAnalytics getInstance(Context context) {
        if (f10135b == null) {
            synchronized (FirebaseAnalytics.class) {
                if (f10135b == null) {
                    f10135b = new FirebaseAnalytics(C1774s2.m8783r(context, null, null, null, null));
                }
            }
        }
        return f10135b;
    }

    @Keep
    public static InterfaceC1006t getScionFrontendApiImplementation(Context context, Bundle bundle) {
        C1774s2 m8783r = C1774s2.m8783r(context, null, null, null, bundle);
        if (m8783r == null) {
            return null;
        }
        return new C2571a(m8783r);
    }

    @Keep
    public String getFirebaseInstanceId() {
        try {
            return (String) C3269o.m14527b(C2614b.m12009l().m12025k(), 30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e10) {
            throw new IllegalStateException(e10);
        } catch (ExecutionException e11) {
            throw new IllegalStateException(e11.getCause());
        } catch (TimeoutException unused) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        }
    }

    @Keep
    @Deprecated
    public void setCurrentScreen(Activity activity, String str, String str2) {
        this.f10136a.m8792c(activity, str, str2);
    }
}
