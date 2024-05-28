package com.appsflyer.internal;

import android.content.Context;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;
import com.appsflyer.AFLogger;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.appsflyer.internal.bo */
/* loaded from: classes.dex */
public class C1255bo extends AbstractC1260bt {
    public final Map<String, Object> AFInAppEventType;

    public C1255bo(Runnable runnable) {
        super("google", runnable);
        this.AFInAppEventType = new HashMap();
    }

    private static boolean AFInAppEventType(Context context) {
        C1219ae.values();
        if (C1219ae.valueOf(C1219ae.values(context), "appsFlyerCount", false) > 0) {
            AFLogger.AFInAppEventParameterName("Install referrer will not load, the counter > 1, ");
            return false;
        }
        try {
            if (C1215aa.AFInAppEventParameterName(context, "com.google.android.finsky.permission.BIND_GET_INSTALL_REFERRER_SERVICE")) {
                AFLogger.values("Install referrer is allowed");
                return true;
            }
            AFLogger.values("Install referrer is not allowed");
            return false;
        } catch (ClassNotFoundException unused) {
            StringBuilder sb2 = new StringBuilder("Class ");
            sb2.append("com.android.installreferrer.api.InstallReferrerClient");
            sb2.append(" not found");
            AFLogger.AFInAppEventParameterName(sb2.toString());
            return false;
        } catch (Throwable th) {
            AFLogger.AFInAppEventType("An error occurred while trying to verify manifest : ".concat("com.android.installreferrer.api.InstallReferrerClient"), th);
            return false;
        }
    }

    @Override // com.appsflyer.internal.AbstractC1260bt
    public final void AFInAppEventParameterName(final Context context) {
        if (AFInAppEventType(context)) {
            AFInAppEventParameterName();
            try {
                final InstallReferrerClient build = InstallReferrerClient.newBuilder(context).build();
                AFLogger.values("Connecting to Install Referrer Library...");
                build.startConnection(new InstallReferrerStateListener() { // from class: com.appsflyer.internal.bo.5
                    @Override // com.android.installreferrer.api.InstallReferrerStateListener
                    public final void onInstallReferrerServiceDisconnected() {
                        AFLogger.values("Install Referrer service disconnected");
                    }

                    @Override // com.android.installreferrer.api.InstallReferrerStateListener
                    public final void onInstallReferrerSetupFinished(int i10) {
                        C1255bo.this.AFInAppEventType.put("code", String.valueOf(i10));
                        C1255bo.this.AFKeystoreWrapper.put("api_ver", Long.valueOf(C1215aa.values(context, "com.android.vending")));
                        C1255bo.this.AFKeystoreWrapper.put("api_ver_name", C1215aa.AFKeystoreWrapper(context, "com.android.vending"));
                        if (i10 == -1) {
                            AFLogger.init("InstallReferrer SERVICE_DISCONNECTED");
                            C1255bo.this.AFKeystoreWrapper.put("response", "SERVICE_DISCONNECTED");
                        } else if (i10 == 0) {
                            C1255bo.this.AFKeystoreWrapper.put("response", "OK");
                            try {
                                AFLogger.values("InstallReferrer connected");
                                if (build.isReady()) {
                                    ReferrerDetails installReferrer = build.getInstallReferrer();
                                    String installReferrer2 = installReferrer.getInstallReferrer();
                                    if (installReferrer2 != null) {
                                        C1255bo.this.AFInAppEventType.put("val", installReferrer2);
                                        C1255bo.this.AFKeystoreWrapper.put("referrer", installReferrer2);
                                    }
                                    long referrerClickTimestampSeconds = installReferrer.getReferrerClickTimestampSeconds();
                                    C1255bo.this.AFInAppEventType.put("clk", Long.toString(referrerClickTimestampSeconds));
                                    C1255bo.this.AFKeystoreWrapper.put("click_ts", Long.valueOf(referrerClickTimestampSeconds));
                                    long installBeginTimestampSeconds = installReferrer.getInstallBeginTimestampSeconds();
                                    C1255bo.this.AFInAppEventType.put("install", Long.toString(installBeginTimestampSeconds));
                                    C1255bo.this.AFKeystoreWrapper.put("install_begin_ts", Long.valueOf(installBeginTimestampSeconds));
                                    HashMap hashMap = new HashMap();
                                    try {
                                        boolean googlePlayInstantParam = installReferrer.getGooglePlayInstantParam();
                                        C1255bo.this.AFInAppEventType.put("instant", Boolean.valueOf(googlePlayInstantParam));
                                        hashMap.put("instant", Boolean.valueOf(googlePlayInstantParam));
                                    } catch (NoSuchMethodError unused) {
                                    }
                                    try {
                                        hashMap.put("click_server_ts", Long.valueOf(installReferrer.getReferrerClickTimestampServerSeconds()));
                                        hashMap.put("install_begin_server_ts", Long.valueOf(installReferrer.getInstallBeginTimestampServerSeconds()));
                                        hashMap.put("install_version", installReferrer.getInstallVersion());
                                    } catch (NoSuchMethodError unused2) {
                                    }
                                    if (!hashMap.isEmpty()) {
                                        C1255bo.this.AFKeystoreWrapper.put("google_custom", hashMap);
                                    }
                                } else {
                                    AFLogger.init("ReferrerClient: InstallReferrer is not ready");
                                    C1255bo.this.AFInAppEventType.put("err", "ReferrerClient: InstallReferrer is not ready");
                                }
                            } catch (Throwable th) {
                                AFLogger.init("Failed to get install referrer: " + th.getMessage());
                                C1255bo.this.AFInAppEventType.put("err", th.getMessage());
                            }
                        } else if (i10 == 1) {
                            C1255bo.this.AFKeystoreWrapper.put("response", "SERVICE_UNAVAILABLE");
                            AFLogger.init("InstallReferrer not supported");
                        } else if (i10 == 2) {
                            AFLogger.init("InstallReferrer FEATURE_NOT_SUPPORTED");
                            C1255bo.this.AFKeystoreWrapper.put("response", "FEATURE_NOT_SUPPORTED");
                        } else if (i10 != 3) {
                            AFLogger.init("responseCode not found.");
                        } else {
                            AFLogger.init("InstallReferrer DEVELOPER_ERROR");
                            C1255bo.this.AFKeystoreWrapper.put("response", "DEVELOPER_ERROR");
                        }
                        AFLogger.values("Install Referrer collected locally");
                        C1255bo.this.AFKeystoreWrapper();
                        build.endConnection();
                    }
                });
            } catch (Throwable th) {
                AFLogger.AFInAppEventType("referrerClient -> startConnection", th);
            }
        }
    }
}
