package com.appsflyer.internal;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;

/* renamed from: com.appsflyer.internal.bt */
/* loaded from: classes.dex */
public abstract class AbstractC1260bt extends Observable {
    private long AFInAppEventType;
    public final String valueOf;
    final Runnable values;
    public final Map<String, Object> AFKeystoreWrapper = new HashMap();
    public e AFInAppEventParameterName = e.NOT_STARTED;

    /* renamed from: com.appsflyer.internal.bt$e */
    /* loaded from: classes.dex */
    public enum e {
        NOT_STARTED,
        STARTED,
        FINISHED
    }

    public AbstractC1260bt(String str, Runnable runnable) {
        this.values = runnable;
        this.valueOf = str;
    }

    public final void AFInAppEventParameterName() {
        this.AFInAppEventType = System.currentTimeMillis();
        this.AFInAppEventParameterName = e.STARTED;
        addObserver(new Observer() { // from class: com.appsflyer.internal.bt.1
            @Override // java.util.Observer
            public final void update(Observable observable, Object obj) {
                AbstractC1260bt.this.values.run();
            }
        });
    }

    public abstract void AFInAppEventParameterName(Context context);

    public final void AFKeystoreWrapper() {
        this.AFKeystoreWrapper.put("source", this.valueOf);
        this.AFKeystoreWrapper.putAll(new C1261bu());
        this.AFKeystoreWrapper.put("latency", Long.valueOf(System.currentTimeMillis() - this.AFInAppEventType));
        this.AFInAppEventParameterName = e.FINISHED;
        setChanged();
        notifyObservers();
    }
}
