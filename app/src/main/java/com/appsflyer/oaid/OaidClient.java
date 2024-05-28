package com.appsflyer.oaid;

import android.content.Context;
import android.os.Build;
import com.huawei.hms.ads.identifier.AdvertisingIdClient;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public class OaidClient {
    private final Context context;
    private final Logger logger;
    private final long timeout;
    private final TimeUnit unit;

    /* renamed from: com.appsflyer.oaid.OaidClient$1 */
    /* loaded from: classes.dex */
    public class CallableC12841 implements Callable<Info> {
        CallableC12841() {
        }

        @Override // java.util.concurrent.Callable
        public Info call() {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(OaidClient.this.context);
            if (advertisingIdInfo == null) {
                return null;
            }
            return new Info(advertisingIdInfo.getId(), Boolean.valueOf(advertisingIdInfo.isLimitAdTrackingEnabled()));
        }
    }

    public OaidClient(Context context, long j10, TimeUnit timeUnit) {
        Logger logger = Logger.getLogger("AppsFlyerOaid6.2.4");
        this.logger = logger;
        this.context = context;
        this.timeout = j10;
        this.unit = timeUnit;
        logger.setLevel(Level.OFF);
    }

    private Info fetchHuawei() {
        try {
            FutureTask futureTask = new FutureTask(new Callable<Info>() { // from class: com.appsflyer.oaid.OaidClient.1
                CallableC12841() {
                }

                @Override // java.util.concurrent.Callable
                public Info call() {
                    AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(OaidClient.this.context);
                    if (advertisingIdInfo == null) {
                        return null;
                    }
                    return new Info(advertisingIdInfo.getId(), Boolean.valueOf(advertisingIdInfo.isLimitAdTrackingEnabled()));
                }
            });
            new Thread(futureTask).start();
            return (Info) futureTask.get(this.timeout, this.unit);
        } catch (Throwable th) {
            this.logger.info(th.getMessage());
            return null;
        }
    }

    private static boolean isHuawei() {
        try {
            if (!Build.BRAND.equalsIgnoreCase("huawei")) {
                if (((Integer) Class.forName("com.huawei.android.os.BuildEx$VERSION").getDeclaredField("EMUI_SDK_INT").get(null)).intValue() <= 0) {
                    return false;
                }
            }
            return true;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException unused) {
            return false;
        }
    }

    private static boolean isMsaAvailableAtRuntime() {
        return true;
    }

    public Info fetch() {
        Info fetchMsa;
        try {
            long currentTimeMillis = System.currentTimeMillis();
            if (isHuawei()) {
                fetchMsa = fetchHuawei();
            } else {
                fetchMsa = isMsaAvailableAtRuntime() ? OaidMsaClient.fetchMsa(this.context, this.logger, this.timeout, this.unit) : null;
            }
            this.logger.info("Fetch " + (System.currentTimeMillis() - currentTimeMillis) + " ms");
            return fetchMsa;
        } catch (Throwable th) {
            this.logger.info(th.getMessage());
            return null;
        }
    }

    public void setLogging(boolean z10) {
        this.logger.setLevel(z10 ? null : Level.OFF);
    }

    /* loaded from: classes.dex */
    public static class Info {

        /* renamed from: id */
        private final String f5728id;
        private final Boolean lat;

        public Info(String str, Boolean bool) {
            this.f5728id = str;
            this.lat = bool;
        }

        public String getId() {
            return this.f5728id;
        }

        public Boolean getLat() {
            return this.lat;
        }

        public Info(String str) {
            this(str, null);
        }
    }

    public OaidClient(Context context) {
        this(context, 1L, TimeUnit.SECONDS);
    }
}
