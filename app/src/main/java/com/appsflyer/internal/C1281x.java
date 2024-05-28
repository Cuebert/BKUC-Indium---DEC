package com.appsflyer.internal;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import com.appsflyer.oaid.BuildConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.appsflyer.internal.x */
/* loaded from: classes.dex */
public final class C1281x implements SensorEventListener {
    double AFKeystoreWrapper;
    private final String AFLogger$LogLevel;
    private final Executor AFVersionDeclaration;
    private final String getLevel;
    private final int init;
    long valueOf;
    private final int values;
    final float[][] AFInAppEventType = new float[2];
    final long[] AFInAppEventParameterName = new long[2];

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1281x(Sensor sensor, Executor executor) {
        this.AFVersionDeclaration = executor;
        int type = sensor.getType();
        this.values = type;
        String name = sensor.getName();
        String str = BuildConfig.FLAVOR;
        name = name == null ? BuildConfig.FLAVOR : name;
        this.getLevel = name;
        String vendor = sensor.getVendor();
        str = vendor != null ? vendor : str;
        this.AFLogger$LogLevel = str;
        this.init = ((((type + 31) * 31) + name.hashCode()) * 31) + str.hashCode();
    }

    private boolean AFInAppEventParameterName(int i10, String str, String str2) {
        return this.values == i10 && this.getLevel.equals(str) && this.AFLogger$LogLevel.equals(str2);
    }

    private boolean AFInAppEventType() {
        return this.AFInAppEventType[0] != null;
    }

    private Map<String, Object> AFKeystoreWrapper() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(7);
        concurrentHashMap.put("sT", Integer.valueOf(this.values));
        concurrentHashMap.put("sN", this.getLevel);
        concurrentHashMap.put("sV", this.AFLogger$LogLevel);
        float[] fArr = this.AFInAppEventType[0];
        if (fArr != null) {
            concurrentHashMap.put("sVS", valueOf(fArr));
        }
        float[] fArr2 = this.AFInAppEventType[1];
        if (fArr2 != null) {
            concurrentHashMap.put("sVE", valueOf(fArr2));
        }
        return concurrentHashMap;
    }

    private static List<Float> valueOf(float[] fArr) {
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float f10 : fArr) {
            arrayList.add(Float.valueOf(f10));
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1281x)) {
            return false;
        }
        C1281x c1281x = (C1281x) obj;
        return AFInAppEventParameterName(c1281x.values, c1281x.getLevel, c1281x.AFLogger$LogLevel);
    }

    public final int hashCode() {
        return this.init;
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        final long j10 = sensorEvent.timestamp;
        final float[] fArr = sensorEvent.values;
        this.AFVersionDeclaration.execute(new Runnable() { // from class: com.appsflyer.internal.x.5
            @Override // java.lang.Runnable
            public final void run() {
                long currentTimeMillis = System.currentTimeMillis();
                C1281x c1281x = C1281x.this;
                float[][] fArr2 = c1281x.AFInAppEventType;
                float[] fArr3 = fArr2[0];
                if (fArr3 == null) {
                    float[] fArr4 = fArr;
                    fArr2[0] = Arrays.copyOf(fArr4, fArr4.length);
                    C1281x.this.AFInAppEventParameterName[0] = currentTimeMillis;
                    return;
                }
                float[] fArr5 = fArr2[1];
                if (fArr5 == null) {
                    float[] fArr6 = fArr;
                    float[] copyOf = Arrays.copyOf(fArr6, fArr6.length);
                    C1281x c1281x2 = C1281x.this;
                    c1281x2.AFInAppEventType[1] = copyOf;
                    c1281x2.AFInAppEventParameterName[1] = currentTimeMillis;
                    c1281x2.AFKeystoreWrapper = C1281x.AFInAppEventParameterName(fArr3, copyOf);
                    return;
                }
                long j11 = j10;
                if (50000000 <= j11 - c1281x.valueOf) {
                    c1281x.valueOf = j11;
                    if (Arrays.equals(fArr5, fArr)) {
                        C1281x.this.AFInAppEventParameterName[1] = currentTimeMillis;
                        return;
                    }
                    double AFInAppEventParameterName = C1281x.AFInAppEventParameterName(fArr3, fArr);
                    C1281x c1281x3 = C1281x.this;
                    if (AFInAppEventParameterName > c1281x3.AFKeystoreWrapper) {
                        float[][] fArr7 = c1281x3.AFInAppEventType;
                        float[] fArr8 = fArr;
                        fArr7[1] = Arrays.copyOf(fArr8, fArr8.length);
                        C1281x c1281x4 = C1281x.this;
                        c1281x4.AFInAppEventParameterName[1] = currentTimeMillis;
                        c1281x4.AFKeystoreWrapper = AFInAppEventParameterName;
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void values(Map<C1281x, Map<String, Object>> map, boolean z10) {
        if (AFInAppEventType()) {
            map.put(this, AFKeystoreWrapper());
            if (z10) {
                int length = this.AFInAppEventType.length;
                for (int i10 = 0; i10 < length; i10++) {
                    this.AFInAppEventType[i10] = null;
                }
                int length2 = this.AFInAppEventParameterName.length;
                for (int i11 = 0; i11 < length2; i11++) {
                    this.AFInAppEventParameterName[i11] = 0;
                }
                this.AFKeystoreWrapper = 0.0d;
                this.valueOf = 0L;
                return;
            }
            return;
        }
        if (map.containsKey(this)) {
            return;
        }
        map.put(this, AFKeystoreWrapper());
    }

    static /* synthetic */ double AFInAppEventParameterName(float[] fArr, float[] fArr2) {
        int min = Math.min(fArr.length, fArr2.length);
        double d10 = 0.0d;
        for (int i10 = 0; i10 < min; i10++) {
            d10 += StrictMath.pow(fArr[i10] - fArr2[i10], 2.0d);
        }
        return Math.sqrt(d10);
    }
}
