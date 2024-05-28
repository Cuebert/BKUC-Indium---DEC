package com.appsflyer.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.appsflyer.AFLogger;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executor;

/* renamed from: com.appsflyer.internal.ag */
/* loaded from: classes.dex */
public final class C1221ag {
    public static b AFInAppEventParameterName = null;
    public static long valueOf = 500;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.appsflyer.internal.ag$3, reason: invalid class name */
    /* loaded from: classes.dex */
    public static class AnonymousClass3 implements Application.ActivityLifecycleCallbacks {
        final /* synthetic */ b AFInAppEventParameterName;
        private /* synthetic */ Executor AFInAppEventType;
        boolean valueOf = true;
        boolean values;

        AnonymousClass3(Executor executor, b bVar) {
            this.AFInAppEventType = executor;
            this.AFInAppEventParameterName = bVar;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(final Activity activity, Bundle bundle) {
            this.AFInAppEventType.execute(new Runnable() { // from class: com.appsflyer.internal.ag.3.1
                @Override // java.lang.Runnable
                public final void run() {
                    C1274j.AFInAppEventType();
                    Intent intent = activity.getIntent();
                    if (C1274j.AFInAppEventType(intent) == null || intent == C1274j.values) {
                        return;
                    }
                    C1274j.values = intent;
                }
            });
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(final Activity activity) {
            this.AFInAppEventType.execute(new Runnable() { // from class: com.appsflyer.internal.ag.3.4
                @Override // java.lang.Runnable
                public final void run() {
                    AnonymousClass3.this.valueOf = true;
                    final Context applicationContext = activity.getApplicationContext();
                    try {
                        new Timer().schedule(new TimerTask() { // from class: com.appsflyer.internal.ag.3.4.4
                            @Override // java.util.TimerTask, java.lang.Runnable
                            public final void run() {
                                AnonymousClass3 anonymousClass3 = AnonymousClass3.this;
                                if (anonymousClass3.values && anonymousClass3.valueOf) {
                                    anonymousClass3.values = false;
                                    try {
                                        anonymousClass3.AFInAppEventParameterName.values(applicationContext);
                                    } catch (Exception e10) {
                                        AFLogger.AFInAppEventType("Listener threw exception! ", e10);
                                    }
                                }
                            }
                        }, C1221ag.valueOf);
                    } catch (Throwable th) {
                        AFLogger.AFInAppEventType("Background task failed with a throwable: ", th);
                    }
                }
            });
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(final Activity activity) {
            this.AFInAppEventType.execute(new Runnable() { // from class: com.appsflyer.internal.ag.3.5
                @Override // java.lang.Runnable
                public final void run() {
                    AnonymousClass3 anonymousClass3 = AnonymousClass3.this;
                    if (!anonymousClass3.values) {
                        try {
                            anonymousClass3.AFInAppEventParameterName.AFKeystoreWrapper(activity);
                        } catch (Exception e10) {
                            AFLogger.AFInAppEventParameterName("Listener thrown an exception: ", e10);
                        }
                    }
                    AnonymousClass3 anonymousClass32 = AnonymousClass3.this;
                    anonymousClass32.valueOf = false;
                    anonymousClass32.values = true;
                }
            });
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(Activity activity) {
        }
    }

    /* renamed from: com.appsflyer.internal.ag$b */
    /* loaded from: classes.dex */
    public interface b {
        void AFKeystoreWrapper(Activity activity);

        void values(Context context);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void valueOf(Context context, b bVar, Executor executor) {
        AFInAppEventParameterName = bVar;
        AnonymousClass3 anonymousClass3 = new AnonymousClass3(executor, bVar);
        if (context instanceof Activity) {
            anonymousClass3.onActivityResumed((Activity) context);
        }
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(anonymousClass3);
    }
}
