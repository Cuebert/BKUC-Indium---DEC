package p308y2;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
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

/* renamed from: y2.i0 */
/* loaded from: classes.dex */
public final class FragmentC5617i0 extends Fragment implements InterfaceC5612g {

    /* renamed from: q */
    private static final WeakHashMap f20810q = new WeakHashMap();

    /* renamed from: n */
    private final Map f20811n = Collections.synchronizedMap(new C3356a());

    /* renamed from: o */
    private int f20812o = 0;

    /* renamed from: p */
    private Bundle f20813p;

    /* renamed from: d */
    public static FragmentC5617i0 m20644d(Activity activity) {
        FragmentC5617i0 fragmentC5617i0;
        WeakHashMap weakHashMap = f20810q;
        WeakReference weakReference = (WeakReference) weakHashMap.get(activity);
        if (weakReference != null && (fragmentC5617i0 = (FragmentC5617i0) weakReference.get()) != null) {
            return fragmentC5617i0;
        }
        try {
            FragmentC5617i0 fragmentC5617i02 = (FragmentC5617i0) activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
            if (fragmentC5617i02 == null || fragmentC5617i02.isRemoving()) {
                fragmentC5617i02 = new FragmentC5617i0();
                activity.getFragmentManager().beginTransaction().add(fragmentC5617i02, "LifecycleFragmentImpl").commitAllowingStateLoss();
            }
            weakHashMap.put(activity, new WeakReference(fragmentC5617i02));
            return fragmentC5617i02;
        } catch (ClassCastException e10) {
            throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e10);
        }
    }

    @Override // p308y2.InterfaceC5612g
    /* renamed from: b */
    public final void mo20634b(String str, LifecycleCallback lifecycleCallback) {
        if (!this.f20811n.containsKey(str)) {
            this.f20811n.put(str, lifecycleCallback);
            if (this.f20812o > 0) {
                new HandlerC4526i(Looper.getMainLooper()).post(new RunnableC5615h0(this, lifecycleCallback, str));
                return;
            }
            return;
        }
        throw new IllegalArgumentException("LifecycleCallback with tag " + str + " already added to this fragment.");
    }

    @Override // android.app.Fragment
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        Iterator it = this.f20811n.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).m7431a(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // p308y2.InterfaceC5612g
    /* renamed from: e */
    public final <T extends LifecycleCallback> T mo20635e(String str, Class<T> cls) {
        return cls.cast(this.f20811n.get(str));
    }

    @Override // p308y2.InterfaceC5612g
    /* renamed from: g */
    public final Activity mo20636g() {
        return getActivity();
    }

    @Override // android.app.Fragment
    public final void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        Iterator it = this.f20811n.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).mo7433e(i10, i11, intent);
        }
    }

    @Override // android.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f20812o = 1;
        this.f20813p = bundle;
        for (Map.Entry entry : this.f20811n.entrySet()) {
            ((LifecycleCallback) entry.getValue()).mo7434f(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.f20812o = 5;
        Iterator it = this.f20811n.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).m7435g();
        }
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        this.f20812o = 3;
        Iterator it = this.f20811n.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).mo7436h();
        }
    }

    @Override // android.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle == null) {
            return;
        }
        for (Map.Entry entry : this.f20811n.entrySet()) {
            Bundle bundle2 = new Bundle();
            ((LifecycleCallback) entry.getValue()).mo7437i(bundle2);
            bundle.putBundle((String) entry.getKey(), bundle2);
        }
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        this.f20812o = 2;
        Iterator it = this.f20811n.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).mo7438j();
        }
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        this.f20812o = 4;
        Iterator it = this.f20811n.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).mo7439k();
        }
    }
}
