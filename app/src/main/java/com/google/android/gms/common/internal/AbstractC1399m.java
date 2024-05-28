package com.google.android.gms.common.internal;

import android.util.Log;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.common.internal.m */
/* loaded from: classes.dex */
public abstract class AbstractC1399m {

    /* renamed from: a */
    private Object f6357a;

    /* renamed from: b */
    private boolean f6358b = false;

    /* renamed from: c */
    final /* synthetic */ AbstractC1388b f6359c;

    public AbstractC1399m(AbstractC1388b abstractC1388b, Object obj) {
        this.f6359c = abstractC1388b;
        this.f6357a = obj;
    }

    /* renamed from: a */
    protected abstract void mo7695a(Object obj);

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo7696b();

    /* renamed from: c */
    public final void m7702c() {
        Object obj;
        synchronized (this) {
            obj = this.f6357a;
            if (this.f6358b) {
                Log.w("GmsClient", "Callback proxy " + toString() + " being reused. This is not safe.");
            }
        }
        if (obj != null) {
            try {
                mo7695a(obj);
            } catch (RuntimeException e10) {
                throw e10;
            }
        }
        synchronized (this) {
            this.f6358b = true;
        }
        m7704e();
    }

    /* renamed from: d */
    public final void m7703d() {
        synchronized (this) {
            this.f6357a = null;
        }
    }

    /* renamed from: e */
    public final void m7704e() {
        ArrayList arrayList;
        ArrayList arrayList2;
        m7703d();
        arrayList = this.f6359c.f6332r;
        synchronized (arrayList) {
            arrayList2 = this.f6359c.f6332r;
            arrayList2.remove(this);
        }
    }
}
