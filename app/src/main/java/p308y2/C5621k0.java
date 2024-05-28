package p308y2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import androidx.fragment.app.ActivityC0803d;
import androidx.fragment.app.Fragment;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import p093h0.C3356a;
import p235s3.HandlerC4526i;

/* renamed from: y2.k0 */
/* loaded from: classes.dex */
public final class C5621k0 extends Fragment implements InterfaceC5612g {

    /* renamed from: r0 */
    private static final WeakHashMap f20817r0 = new WeakHashMap();

    /* renamed from: o0 */
    private final Map f20818o0 = Collections.synchronizedMap(new C3356a());

    /* renamed from: p0 */
    private int f20819p0 = 0;

    /* renamed from: q0 */
    private Bundle f20820q0;

    /* renamed from: Z1 */
    public static C5621k0 m20647Z1(ActivityC0803d activityC0803d) {
        C5621k0 c5621k0;
        WeakHashMap weakHashMap = f20817r0;
        WeakReference weakReference = (WeakReference) weakHashMap.get(activityC0803d);
        if (weakReference != null && (c5621k0 = (C5621k0) weakReference.get()) != null) {
            return c5621k0;
        }
        try {
            C5621k0 c5621k02 = (C5621k0) activityC0803d.m4617y0().m4498j0("SupportLifecycleFragmentImpl");
            if (c5621k02 == null || c5621k02.m4358n0()) {
                c5621k02 = new C5621k0();
                activityC0803d.m4617y0().m4504m().m4749e(c5621k02, "SupportLifecycleFragmentImpl").mo4560i();
            }
            weakHashMap.put(activityC0803d, new WeakReference(c5621k02));
            return c5621k02;
        } catch (ClassCastException e10) {
            throw new IllegalStateException("Fragment with tag SupportLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e10);
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: E0 */
    public final void mo4274E0() {
        super.mo4274E0();
        this.f20819p0 = 5;
        Iterator it = this.f20818o0.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).m7435g();
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: U0 */
    public final void mo4319U0() {
        super.mo4319U0();
        this.f20819p0 = 3;
        Iterator it = this.f20818o0.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).mo7436h();
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: V0 */
    public final void mo4322V0(Bundle bundle) {
        super.mo4322V0(bundle);
        if (bundle == null) {
            return;
        }
        for (Map.Entry entry : this.f20818o0.entrySet()) {
            Bundle bundle2 = new Bundle();
            ((LifecycleCallback) entry.getValue()).mo7437i(bundle2);
            bundle.putBundle((String) entry.getKey(), bundle2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: W0 */
    public final void mo268W0() {
        super.mo268W0();
        this.f20819p0 = 2;
        Iterator it = this.f20818o0.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).mo7438j();
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: X0 */
    public final void mo4327X0() {
        super.mo4327X0();
        this.f20819p0 = 4;
        Iterator it = this.f20818o0.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).mo7439k();
        }
    }

    @Override // p308y2.InterfaceC5612g
    /* renamed from: b */
    public final void mo20634b(String str, LifecycleCallback lifecycleCallback) {
        if (!this.f20818o0.containsKey(str)) {
            this.f20818o0.put(str, lifecycleCallback);
            if (this.f20819p0 > 0) {
                new HandlerC4526i(Looper.getMainLooper()).post(new RunnableC5619j0(this, lifecycleCallback, str));
                return;
            }
            return;
        }
        throw new IllegalArgumentException("LifecycleCallback with tag " + str + " already added to this fragment.");
    }

    @Override // p308y2.InterfaceC5612g
    /* renamed from: e */
    public final <T extends LifecycleCallback> T mo20635e(String str, Class<T> cls) {
        return cls.cast(this.f20818o0.get(str));
    }

    @Override // p308y2.InterfaceC5612g
    /* renamed from: g */
    public final /* synthetic */ Activity mo20636g() {
        return m4363p();
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: j */
    public final void mo4349j(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.mo4349j(str, fileDescriptor, printWriter, strArr);
        Iterator it = this.f20818o0.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).m7431a(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: u0 */
    public final void mo4379u0(int i10, int i11, Intent intent) {
        super.mo4379u0(i10, i11, intent);
        Iterator it = this.f20818o0.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).mo7433e(i10, i11, intent);
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: z0 */
    public final void mo270z0(Bundle bundle) {
        super.mo270z0(bundle);
        this.f20819p0 = 1;
        this.f20820q0 = bundle;
        for (Map.Entry entry : this.f20818o0.entrySet()) {
            ((LifecycleCallback) entry.getValue()).mo7434f(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }
}
