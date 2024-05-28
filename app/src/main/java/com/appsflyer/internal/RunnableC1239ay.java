package com.appsflyer.internal;

import android.app.Application;
import com.appsflyer.AFLogger;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.appsflyer.internal.ay */
/* loaded from: classes.dex */
public final class RunnableC1239ay implements Runnable {
    private static String valueOf = "https://%sgcdsdk.%s/install_data/v4.0/";
    private static final List<String> values = Arrays.asList("googleplay", "playstore", "googleplaystore");
    private final String AFInAppEventParameterName;
    final ScheduledExecutorService AFInAppEventType;
    private final Application AFKeystoreWrapper;
    private final C1219ae AFLogger$LogLevel;
    private final int AFVersionDeclaration;
    private final AtomicInteger getLevel;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC1239ay(C1219ae c1219ae, Application application, String str) {
        if (C1275k.valueOf == null) {
            C1275k.valueOf = new C1275k();
        }
        this.AFInAppEventType = C1275k.valueOf.AFInAppEventParameterName();
        this.getLevel = new AtomicInteger(0);
        this.AFLogger$LogLevel = c1219ae;
        this.AFKeystoreWrapper = application;
        this.AFInAppEventParameterName = str;
        this.AFVersionDeclaration = 0;
    }

    public static void AFInAppEventParameterName(String str) {
        if (C1219ae.valueOf != null) {
            AFLogger.values("[GCD-A02] Calling onConversionFailure with:\n".concat(String.valueOf(str)));
            C1219ae.valueOf.onConversionDataFail(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void AFInAppEventType(Map<String, Object> map) {
        StringBuilder sb2 = new StringBuilder("[GCD-A02] Calling onConversionDataSuccess with:\n");
        sb2.append(map.toString());
        AFLogger.values(sb2.toString());
        C1219ae.valueOf.onConversionDataSuccess(map);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:17|18|(2:20|(10:22|23|24|25|(5:29|(1:39)(1:33)|34|35|36)|40|(13:42|(1:44)|(1:48)|49|50|(2:52|(1:54)(1:55))|56|(1:58)|59|60|(1:62)(1:76)|63|(5:67|68|(1:70)|72|73))|34|35|36)(1:94))|95|23|24|25|(7:29|(1:31)|37|39|34|35|36)|40|(0)|34|35|36) */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0284, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0285, code lost:
    
        r3 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x028a, code lost:
    
        if (r16.AFVersionDeclaration < 2) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x028c, code lost:
    
        r2 = new com.appsflyer.internal.RunnableC1239ay(r16);
        com.appsflyer.internal.C1219ae.AFInAppEventType(r2.AFInAppEventType, r2, 10, java.util.concurrent.TimeUnit.MILLISECONDS);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x02a2, code lost:
    
        com.appsflyer.AFLogger.AFInAppEventType(r0.getMessage(), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x029b, code lost:
    
        AFInAppEventParameterName(r0.getMessage());
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x02be, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x02bf, code lost:
    
        r16.getLevel.decrementAndGet();
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x02c4, code lost:
    
        if (r3 != null) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x02c6, code lost:
    
        r3.disconnect();
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x02c9, code lost:
    
        throw r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x018e A[Catch: all -> 0x0284, TryCatch #1 {all -> 0x0284, blocks: (B:25:0x00eb, B:33:0x013f, B:37:0x012b, B:39:0x012f, B:40:0x014e, B:42:0x018e, B:44:0x019c, B:46:0x01b6, B:48:0x01bc, B:49:0x01c9, B:52:0x01d3, B:54:0x01d9, B:55:0x01ed, B:56:0x01fe, B:58:0x0204, B:59:0x0217, B:62:0x0229, B:63:0x0234, B:65:0x0238, B:68:0x0240, B:70:0x0254, B:73:0x0261, B:75:0x025c, B:76:0x022f), top: B:24:0x00eb, inners: #0 }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 725
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.RunnableC1239ay.run():void");
    }

    private RunnableC1239ay(RunnableC1239ay runnableC1239ay) {
        if (C1275k.valueOf == null) {
            C1275k.valueOf = new C1275k();
        }
        this.AFInAppEventType = C1275k.valueOf.AFInAppEventParameterName();
        this.getLevel = new AtomicInteger(0);
        this.AFLogger$LogLevel = runnableC1239ay.AFLogger$LogLevel;
        this.AFKeystoreWrapper = runnableC1239ay.AFKeystoreWrapper;
        this.AFInAppEventParameterName = runnableC1239ay.AFInAppEventParameterName;
        this.AFVersionDeclaration = runnableC1239ay.AFVersionDeclaration + 1;
    }
}
