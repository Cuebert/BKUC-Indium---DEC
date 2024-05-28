package com.appsflyer.internal;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.Looper;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* renamed from: com.appsflyer.internal.z */
/* loaded from: classes.dex */
public final class C1283z {
    private static final BitSet AppsFlyer2dXConversionCallback;
    private static final Handler getLevel;
    private static volatile C1283z init;
    final Object AFInAppEventParameterName = new Object();
    final Runnable AFInAppEventType;
    final Runnable AFKeystoreWrapper;
    final Executor AFLogger$LogLevel;
    final Runnable AFVersionDeclaration;
    private long onAppOpenAttribution;
    private final SensorManager onAppOpenAttributionNative;
    private int onAttributionFailureNative;
    private final Runnable onConversionDataSuccess;
    private boolean onDeepLinkingNative;
    private final Map<C1281x, Map<String, Object>> onInstallConversionDataLoadedNative;
    private final Map<C1281x, C1281x> onInstallConversionFailureNative;
    final Handler valueOf;
    boolean values;

    /* renamed from: com.appsflyer.internal.z$10, reason: invalid class name */
    /* loaded from: classes.dex */
    final class AnonymousClass10 implements Runnable {
        AnonymousClass10() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                if (!C1283z.this.onInstallConversionFailureNative.isEmpty()) {
                    for (C1281x c1281x : C1283z.this.onInstallConversionFailureNative.values()) {
                        C1283z.this.onAppOpenAttributionNative.unregisterListener(c1281x);
                        c1281x.values(C1283z.this.onInstallConversionDataLoadedNative, true);
                    }
                }
            } catch (Throwable unused) {
            }
            C1283z.this.onAttributionFailureNative = 0;
            C1283z.this.onDeepLinkingNative = false;
        }
    }

    static {
        BitSet bitSet = new BitSet(6);
        AppsFlyer2dXConversionCallback = bitSet;
        getLevel = new Handler(Looper.getMainLooper());
        bitSet.set(1);
        bitSet.set(2);
        bitSet.set(4);
    }

    private C1283z(SensorManager sensorManager, Handler handler) {
        BitSet bitSet = AppsFlyer2dXConversionCallback;
        this.onInstallConversionFailureNative = new HashMap(bitSet.size());
        this.onInstallConversionDataLoadedNative = new ConcurrentHashMap(bitSet.size());
        this.AFKeystoreWrapper = new Runnable() { // from class: com.appsflyer.internal.z.1
            @Override // java.lang.Runnable
            public final void run() {
                synchronized (C1283z.this.AFInAppEventParameterName) {
                    final C1283z c1283z = C1283z.this;
                    c1283z.AFLogger$LogLevel.execute(new Runnable() { // from class: com.appsflyer.internal.z.3
                        @Override // java.lang.Runnable
                        public final void run() {
                            try {
                                for (Sensor sensor : C1283z.this.onAppOpenAttributionNative.getSensorList(-1)) {
                                    if (C1283z.values(sensor.getType())) {
                                        C1281x c1281x = new C1281x(sensor, C1283z.this.AFLogger$LogLevel);
                                        if (!C1283z.this.onInstallConversionFailureNative.containsKey(c1281x)) {
                                            C1283z.this.onInstallConversionFailureNative.put(c1281x, c1281x);
                                        }
                                        C1283z.this.onAppOpenAttributionNative.registerListener((SensorEventListener) C1283z.this.onInstallConversionFailureNative.get(c1281x), sensor, 0);
                                    }
                                }
                            } catch (Throwable unused) {
                            }
                            C1283z.this.onDeepLinkingNative = true;
                        }
                    });
                    C1283z c1283z2 = C1283z.this;
                    c1283z2.valueOf.postDelayed(c1283z2.onConversionDataSuccess, 100L);
                    C1283z.this.values = true;
                }
            }
        };
        this.AFInAppEventType = new Runnable() { // from class: com.appsflyer.internal.z.4
            @Override // java.lang.Runnable
            public final void run() {
                synchronized (C1283z.this.AFInAppEventParameterName) {
                    C1283z c1283z = C1283z.this;
                    c1283z.AFLogger$LogLevel.execute(new AnonymousClass10());
                }
            }
        };
        this.AFVersionDeclaration = new Runnable() { // from class: com.appsflyer.internal.z.5
            @Override // java.lang.Runnable
            public final void run() {
                synchronized (C1283z.this.AFInAppEventParameterName) {
                    C1283z c1283z = C1283z.this;
                    if (c1283z.values) {
                        c1283z.valueOf.removeCallbacks(c1283z.AFKeystoreWrapper);
                        C1283z c1283z2 = C1283z.this;
                        c1283z2.valueOf.removeCallbacks(c1283z2.AFInAppEventType);
                        C1283z c1283z3 = C1283z.this;
                        c1283z3.AFLogger$LogLevel.execute(new AnonymousClass10());
                        C1283z.this.values = false;
                    }
                }
            }
        };
        this.onAttributionFailureNative = 1;
        this.onAppOpenAttribution = 0L;
        this.onConversionDataSuccess = new Runnable() { // from class: com.appsflyer.internal.z.2
            @Override // java.lang.Runnable
            public final void run() {
                synchronized (C1283z.this.AFInAppEventParameterName) {
                    if (C1283z.this.onAttributionFailureNative == 0) {
                        C1283z.this.onAttributionFailureNative = 1;
                    }
                    C1283z c1283z = C1283z.this;
                    c1283z.valueOf.postDelayed(c1283z.AFInAppEventType, c1283z.onAttributionFailureNative * 500);
                }
            }
        };
        this.AFLogger$LogLevel = Executors.newSingleThreadExecutor();
        this.onAppOpenAttributionNative = sensorManager;
        this.valueOf = handler;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void AFInAppEventType() {
        long currentTimeMillis = System.currentTimeMillis();
        long j10 = this.onAppOpenAttribution;
        if (j10 != 0) {
            this.onAttributionFailureNative++;
            if (j10 - currentTimeMillis < 500) {
                this.valueOf.removeCallbacks(this.AFInAppEventType);
                this.valueOf.post(this.AFKeystoreWrapper);
            }
        } else {
            this.valueOf.post(this.AFVersionDeclaration);
            this.valueOf.post(this.AFKeystoreWrapper);
        }
        this.onAppOpenAttribution = currentTimeMillis;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static C1283z AFKeystoreWrapper(Context context) {
        if (init != null) {
            return init;
        }
        return AFKeystoreWrapper((SensorManager) context.getApplicationContext().getSystemService("sensor"), getLevel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean values(int i10) {
        return i10 >= 0 && AppsFlyer2dXConversionCallback.get(i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final List<Map<String, Object>> AFInAppEventParameterName() {
        synchronized (this.AFInAppEventParameterName) {
            if (!this.onInstallConversionFailureNative.isEmpty() && this.onDeepLinkingNative) {
                Iterator<C1281x> it = this.onInstallConversionFailureNative.values().iterator();
                while (it.hasNext()) {
                    it.next().values(this.onInstallConversionDataLoadedNative, false);
                }
            }
            if (this.onInstallConversionDataLoadedNative.isEmpty()) {
                return new CopyOnWriteArrayList(Collections.emptyList());
            }
            return new CopyOnWriteArrayList(this.onInstallConversionDataLoadedNative.values());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final List<Map<String, Object>> values() {
        Iterator<C1281x> it = this.onInstallConversionFailureNative.values().iterator();
        while (it.hasNext()) {
            it.next().values(this.onInstallConversionDataLoadedNative, true);
        }
        Map<C1281x, Map<String, Object>> map = this.onInstallConversionDataLoadedNative;
        if (map != null && !map.isEmpty()) {
            return new CopyOnWriteArrayList(this.onInstallConversionDataLoadedNative.values());
        }
        return new CopyOnWriteArrayList(Collections.emptyList());
    }

    private static C1283z AFKeystoreWrapper(SensorManager sensorManager, Handler handler) {
        if (init == null) {
            synchronized (C1283z.class) {
                if (init == null) {
                    init = new C1283z(sensorManager, handler);
                }
            }
        }
        return init;
    }
}
