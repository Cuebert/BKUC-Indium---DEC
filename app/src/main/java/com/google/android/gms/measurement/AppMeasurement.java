package com.google.android.gms.measurement;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.internal.measurement.zzcl;
import com.google.android.gms.measurement.internal.C2219m4;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p018b4.C0999m;
import p018b4.InterfaceC1006t;
import p321z2.C5984j;

@Deprecated
/* loaded from: classes.dex */
public class AppMeasurement {

    /* renamed from: b */
    private static volatile AppMeasurement f7930b;

    /* renamed from: a */
    private final AbstractC2081d f7931a;

    /* loaded from: classes.dex */
    public static class ConditionalUserProperty {

        @Keep
        public boolean mActive;

        @Keep
        public String mAppId;

        @Keep
        public long mCreationTimestamp;

        @Keep
        public String mExpiredEventName;

        @Keep
        public Bundle mExpiredEventParams;

        @Keep
        public String mName;

        @Keep
        public String mOrigin;

        @Keep
        public long mTimeToLive;

        @Keep
        public String mTimedOutEventName;

        @Keep
        public Bundle mTimedOutEventParams;

        @Keep
        public String mTriggerEventName;

        @Keep
        public long mTriggerTimeout;

        @Keep
        public String mTriggeredEventName;

        @Keep
        public Bundle mTriggeredEventParams;

        @Keep
        public long mTriggeredTimestamp;

        @Keep
        public Object mValue;

        public ConditionalUserProperty() {
        }

        ConditionalUserProperty(Bundle bundle) {
            C5984j.m21286j(bundle);
            this.mAppId = (String) C0999m.m6228a(bundle, "app_id", String.class, null);
            this.mOrigin = (String) C0999m.m6228a(bundle, "origin", String.class, null);
            this.mName = (String) C0999m.m6228a(bundle, "name", String.class, null);
            this.mValue = C0999m.m6228a(bundle, "value", Object.class, null);
            this.mTriggerEventName = (String) C0999m.m6228a(bundle, "trigger_event_name", String.class, null);
            this.mTriggerTimeout = ((Long) C0999m.m6228a(bundle, "trigger_timeout", Long.class, 0L)).longValue();
            this.mTimedOutEventName = (String) C0999m.m6228a(bundle, "timed_out_event_name", String.class, null);
            this.mTimedOutEventParams = (Bundle) C0999m.m6228a(bundle, "timed_out_event_params", Bundle.class, null);
            this.mTriggeredEventName = (String) C0999m.m6228a(bundle, "triggered_event_name", String.class, null);
            this.mTriggeredEventParams = (Bundle) C0999m.m6228a(bundle, "triggered_event_params", Bundle.class, null);
            this.mTimeToLive = ((Long) C0999m.m6228a(bundle, "time_to_live", Long.class, 0L)).longValue();
            this.mExpiredEventName = (String) C0999m.m6228a(bundle, "expired_event_name", String.class, null);
            this.mExpiredEventParams = (Bundle) C0999m.m6228a(bundle, "expired_event_params", Bundle.class, null);
            this.mActive = ((Boolean) C0999m.m6228a(bundle, "active", Boolean.class, Boolean.FALSE)).booleanValue();
            this.mCreationTimestamp = ((Long) C0999m.m6228a(bundle, "creation_timestamp", Long.class, 0L)).longValue();
            this.mTriggeredTimestamp = ((Long) C0999m.m6228a(bundle, "triggered_timestamp", Long.class, 0L)).longValue();
        }
    }

    public AppMeasurement(C2219m4 c2219m4) {
        this.f7931a = new C2078a(c2219m4);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Keep
    @Deprecated
    public static AppMeasurement getInstance(Context context) {
        if (f7930b == null) {
            synchronized (AppMeasurement.class) {
                if (f7930b == null) {
                    InterfaceC1006t interfaceC1006t = (InterfaceC1006t) FirebaseAnalytics.class.getDeclaredMethod("getScionFrontendApiImplementation", Context.class, Bundle.class).invoke(null, context, null);
                    if (interfaceC1006t != null) {
                        f7930b = new AppMeasurement(interfaceC1006t);
                    } else {
                        f7930b = new AppMeasurement(C2219m4.m10096H(context, new zzcl(0L, 0L, true, null, null, null, null, null), null));
                    }
                }
            }
        }
        return f7930b;
    }

    @Keep
    public void beginAdUnitExposure(String str) {
        this.f7931a.mo6239m(str);
    }

    @Keep
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        this.f7931a.mo6240n(str, str2, bundle);
    }

    @Keep
    public void endAdUnitExposure(String str) {
        this.f7931a.mo6243q(str);
    }

    @Keep
    public long generateEventId() {
        return this.f7931a.zzb();
    }

    @Keep
    public String getAppInstanceId() {
        return this.f7931a.mo6234d();
    }

    @Keep
    public List<ConditionalUserProperty> getConditionalUserProperties(String str, String str2) {
        List<Bundle> mo6241o = this.f7931a.mo6241o(str, str2);
        ArrayList arrayList = new ArrayList(mo6241o == null ? 0 : mo6241o.size());
        Iterator<Bundle> it = mo6241o.iterator();
        while (it.hasNext()) {
            arrayList.add(new ConditionalUserProperty(it.next()));
        }
        return arrayList;
    }

    @Keep
    public String getCurrentScreenClass() {
        return this.f7931a.mo6235e();
    }

    @Keep
    public String getCurrentScreenName() {
        return this.f7931a.mo6238l();
    }

    @Keep
    public String getGmpAppId() {
        return this.f7931a.mo6236g();
    }

    @Keep
    public int getMaxUserProperties(String str) {
        return this.f7931a.mo6237h(str);
    }

    @Keep
    protected Map<String, Object> getUserProperties(String str, String str2, boolean z10) {
        return this.f7931a.mo6242p(str, str2, z10);
    }

    @Keep
    public void logEventInternal(String str, String str2, Bundle bundle) {
        this.f7931a.mo6245s(str, str2, bundle);
    }

    @Keep
    public void setConditionalUserProperty(ConditionalUserProperty conditionalUserProperty) {
        C5984j.m21286j(conditionalUserProperty);
        AbstractC2081d abstractC2081d = this.f7931a;
        Bundle bundle = new Bundle();
        String str = conditionalUserProperty.mAppId;
        if (str != null) {
            bundle.putString("app_id", str);
        }
        String str2 = conditionalUserProperty.mOrigin;
        if (str2 != null) {
            bundle.putString("origin", str2);
        }
        String str3 = conditionalUserProperty.mName;
        if (str3 != null) {
            bundle.putString("name", str3);
        }
        Object obj = conditionalUserProperty.mValue;
        if (obj != null) {
            C0999m.m6229b(bundle, obj);
        }
        String str4 = conditionalUserProperty.mTriggerEventName;
        if (str4 != null) {
            bundle.putString("trigger_event_name", str4);
        }
        bundle.putLong("trigger_timeout", conditionalUserProperty.mTriggerTimeout);
        String str5 = conditionalUserProperty.mTimedOutEventName;
        if (str5 != null) {
            bundle.putString("timed_out_event_name", str5);
        }
        Bundle bundle2 = conditionalUserProperty.mTimedOutEventParams;
        if (bundle2 != null) {
            bundle.putBundle("timed_out_event_params", bundle2);
        }
        String str6 = conditionalUserProperty.mTriggeredEventName;
        if (str6 != null) {
            bundle.putString("triggered_event_name", str6);
        }
        Bundle bundle3 = conditionalUserProperty.mTriggeredEventParams;
        if (bundle3 != null) {
            bundle.putBundle("triggered_event_params", bundle3);
        }
        bundle.putLong("time_to_live", conditionalUserProperty.mTimeToLive);
        String str7 = conditionalUserProperty.mExpiredEventName;
        if (str7 != null) {
            bundle.putString("expired_event_name", str7);
        }
        Bundle bundle4 = conditionalUserProperty.mExpiredEventParams;
        if (bundle4 != null) {
            bundle.putBundle("expired_event_params", bundle4);
        }
        bundle.putLong("creation_timestamp", conditionalUserProperty.mCreationTimestamp);
        bundle.putBoolean("active", conditionalUserProperty.mActive);
        bundle.putLong("triggered_timestamp", conditionalUserProperty.mTriggeredTimestamp);
        abstractC2081d.mo6244r(bundle);
    }

    public AppMeasurement(InterfaceC1006t interfaceC1006t) {
        this.f7931a = new C2079b(interfaceC1006t);
    }
}
