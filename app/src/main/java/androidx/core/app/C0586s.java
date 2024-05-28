package androidx.core.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import androidx.core.content.C0587a;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: androidx.core.app.s */
/* loaded from: classes.dex */
public final class C0586s implements Iterable<Intent> {

    /* renamed from: n */
    private final ArrayList<Intent> f3257n = new ArrayList<>();

    /* renamed from: o */
    private final Context f3258o;

    /* renamed from: androidx.core.app.s$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: d0 */
        Intent mo730d0();
    }

    private C0586s(Context context) {
        this.f3258o = context;
    }

    /* renamed from: k */
    public static C0586s m3021k(Context context) {
        return new C0586s(context);
    }

    /* renamed from: c */
    public C0586s m3022c(Intent intent) {
        this.f3257n.add(intent);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: e */
    public C0586s m3023e(Activity activity) {
        Intent mo730d0 = activity instanceof a ? ((a) activity).mo730d0() : null;
        if (mo730d0 == null) {
            mo730d0 = C0576i.m2786a(activity);
        }
        if (mo730d0 != null) {
            ComponentName component = mo730d0.getComponent();
            if (component == null) {
                component = mo730d0.resolveActivity(this.f3258o.getPackageManager());
            }
            m3024i(component);
            m3022c(mo730d0);
        }
        return this;
    }

    /* renamed from: i */
    public C0586s m3024i(ComponentName componentName) {
        int size = this.f3257n.size();
        try {
            Intent m2787b = C0576i.m2787b(this.f3258o, componentName);
            while (m2787b != null) {
                this.f3257n.add(size, m2787b);
                m2787b = C0576i.m2787b(this.f3258o, m2787b.getComponent());
            }
            return this;
        } catch (PackageManager.NameNotFoundException e10) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e10);
        }
    }

    @Override // java.lang.Iterable
    @Deprecated
    public Iterator<Intent> iterator() {
        return this.f3257n.iterator();
    }

    /* renamed from: l */
    public void m3025l() {
        m3026m(null);
    }

    /* renamed from: m */
    public void m3026m(Bundle bundle) {
        if (!this.f3257n.isEmpty()) {
            Intent[] intentArr = (Intent[]) this.f3257n.toArray(new Intent[0]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            if (C0587a.m3035i(this.f3258o, intentArr, bundle)) {
                return;
            }
            Intent intent = new Intent(intentArr[intentArr.length - 1]);
            intent.addFlags(268435456);
            this.f3258o.startActivity(intent);
            return;
        }
        throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
    }
}
