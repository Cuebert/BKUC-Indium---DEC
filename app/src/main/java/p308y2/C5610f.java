package p308y2;

import android.app.Activity;
import androidx.fragment.app.ActivityC0803d;
import p321z2.C5984j;

/* renamed from: y2.f */
/* loaded from: classes.dex */
public class C5610f {

    /* renamed from: a */
    private final Object f20787a;

    public C5610f(Activity activity) {
        C5984j.m21287k(activity, "Activity must not be null");
        this.f20787a = activity;
    }

    /* renamed from: a */
    public final Activity m20627a() {
        return (Activity) this.f20787a;
    }

    /* renamed from: b */
    public final ActivityC0803d m20628b() {
        return (ActivityC0803d) this.f20787a;
    }

    /* renamed from: c */
    public final boolean m20629c() {
        return this.f20787a instanceof Activity;
    }

    /* renamed from: d */
    public final boolean m20630d() {
        return this.f20787a instanceof ActivityC0803d;
    }
}
