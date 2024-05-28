package p313y7;

import android.R;
import android.view.View;
import androidx.fragment.app.ActivityC0803d;
import com.roblox.client.AbstractActivityC2837i0;
import p090g9.C3319b;

/* renamed from: y7.a */
/* loaded from: classes.dex */
public abstract class AbstractC5899a {

    /* renamed from: a */
    protected ActivityC0803d f21738a;

    public AbstractC5899a(ActivityC0803d activityC0803d) {
        this.f21738a = activityC0803d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public boolean m20990a() {
        ActivityC0803d activityC0803d = this.f21738a;
        if (activityC0803d == null) {
            return false;
        }
        return ((activityC0803d instanceof AbstractActivityC2837i0) && ((AbstractActivityC2837i0) activityC0803d).m12648g1()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public int m20991b() {
        View findViewById = this.f21738a.findViewById(R.id.content);
        C3319b m14597a = C3319b.m14597a(findViewById.getRootView(), this.f21738a.getWindowManager(), findViewById, ((AbstractActivityC2837i0) this.f21738a).m12673Z0().m17187c());
        return (m14597a.f13802b - m14597a.f13807g) - m14597a.f13803c;
    }
}
