package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCharacteristics;
import android.util.Pair;
import androidx.camera.camera2.internal.C0311j0;
import androidx.camera.core.AbstractC0473t;
import androidx.camera.core.C0463q1;
import androidx.camera.core.InterfaceC0408f3;
import androidx.camera.core.impl.utils.C0422b;
import androidx.core.util.C0654h;
import androidx.lifecycle.C0849p;
import androidx.lifecycle.InterfaceC0852s;
import androidx.lifecycle.LiveData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import p218r.C4382f;
import p218r.C4397m0;
import p218r.C4414z;
import p242t.C4572g;
import p267v.C4930h;
import p279w.AbstractC5032h;
import p279w.C5095y1;
import p279w.InterfaceC5009b0;
import p279w.InterfaceC5028g;

/* renamed from: androidx.camera.camera2.internal.j0 */
/* loaded from: classes.dex */
public final class C0311j0 implements InterfaceC5009b0 {

    /* renamed from: a */
    private final String f1429a;

    /* renamed from: b */
    private final C4414z f1430b;

    /* renamed from: c */
    private final C4930h f1431c;

    /* renamed from: e */
    private C0350t f1433e;

    /* renamed from: h */
    private final a<AbstractC0473t> f1436h;

    /* renamed from: j */
    private final C5095y1 f1438j;

    /* renamed from: k */
    private final InterfaceC5028g f1439k;

    /* renamed from: l */
    private final C4397m0 f1440l;

    /* renamed from: d */
    private final Object f1432d = new Object();

    /* renamed from: f */
    private a<Integer> f1434f = null;

    /* renamed from: g */
    private a<InterfaceC0408f3> f1435g = null;

    /* renamed from: i */
    private List<Pair<AbstractC5032h, Executor>> f1437i = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.camera.camera2.internal.j0$a */
    /* loaded from: classes.dex */
    public static class a<T> extends C0849p<T> {

        /* renamed from: m */
        private LiveData<T> f1441m;

        /* renamed from: n */
        private T f1442n;

        a(T t10) {
            this.f1442n = t10;
        }

        @Override // androidx.lifecycle.LiveData
        /* renamed from: f */
        public T mo1579f() {
            LiveData<T> liveData = this.f1441m;
            return liveData == null ? this.f1442n : liveData.mo1579f();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: r */
        void m1580r(LiveData<T> liveData) {
            LiveData<T> liveData2 = this.f1441m;
            if (liveData2 != null) {
                super.m4921q(liveData2);
            }
            this.f1441m = liveData;
            super.m4920p(liveData, new InterfaceC0852s() { // from class: androidx.camera.camera2.internal.i0
                @Override // androidx.lifecycle.InterfaceC0852s
                /* renamed from: a */
                public final void mo1522a(Object obj) {
                    C0311j0.a.this.mo4867o(obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0311j0(String str, C4397m0 c4397m0) throws C4382f {
        String str2 = (String) C0654h.m3467f(str);
        this.f1429a = str2;
        this.f1440l = c4397m0;
        C4414z m18165c = c4397m0.m18165c(str2);
        this.f1430b = m18165c;
        this.f1431c = new C4930h(this);
        this.f1438j = C4572g.m18660a(str, m18165c);
        this.f1439k = new C0282d(str, m18165c);
        this.f1436h = new a<>(AbstractC0473t.m2230a(AbstractC0473t.b.CLOSED));
    }

    /* renamed from: l */
    private void m1565l() {
        m1566m();
    }

    /* renamed from: m */
    private void m1566m() {
        String str;
        int m1576j = m1576j();
        if (m1576j == 0) {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_LIMITED";
        } else if (m1576j == 1) {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_FULL";
        } else if (m1576j == 2) {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_LEGACY";
        } else if (m1576j == 3) {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_3";
        } else if (m1576j != 4) {
            str = "Unknown value: " + m1576j;
        } else {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_EXTERNAL";
        }
        C0463q1.m2206e("Camera2CameraInfo", "Device Level: " + str);
    }

    @Override // p279w.InterfaceC5009b0
    /* renamed from: a */
    public Integer mo1567a() {
        Integer num = (Integer) this.f1430b.m18192a(CameraCharacteristics.LENS_FACING);
        C0654h.m3467f(num);
        int intValue = num.intValue();
        if (intValue != 0) {
            return intValue != 1 ? null : 1;
        }
        return 0;
    }

    @Override // p279w.InterfaceC5009b0
    /* renamed from: b */
    public void mo1568b(AbstractC5032h abstractC5032h) {
        synchronized (this.f1432d) {
            C0350t c0350t = this.f1433e;
            if (c0350t == null) {
                List<Pair<AbstractC5032h, Executor>> list = this.f1437i;
                if (list == null) {
                    return;
                }
                Iterator<Pair<AbstractC5032h, Executor>> it = list.iterator();
                while (it.hasNext()) {
                    if (it.next().first == abstractC5032h) {
                        it.remove();
                    }
                }
                return;
            }
            c0350t.m1718X(abstractC5032h);
        }
    }

    @Override // p279w.InterfaceC5009b0
    /* renamed from: c */
    public String mo1569c() {
        return this.f1429a;
    }

    @Override // androidx.camera.core.InterfaceC0465r
    /* renamed from: d */
    public String mo1570d() {
        return m1576j() == 2 ? "androidx.camera.camera2.legacy" : "androidx.camera.camera2";
    }

    @Override // androidx.camera.core.InterfaceC0465r
    /* renamed from: e */
    public int mo1571e(int i10) {
        Integer valueOf = Integer.valueOf(m1575i());
        int m2053b = C0422b.m2053b(i10);
        Integer mo1567a = mo1567a();
        return C0422b.m2052a(m2053b, valueOf.intValue(), mo1567a != null && 1 == mo1567a.intValue());
    }

    @Override // p279w.InterfaceC5009b0
    /* renamed from: f */
    public void mo1572f(Executor executor, AbstractC5032h abstractC5032h) {
        synchronized (this.f1432d) {
            C0350t c0350t = this.f1433e;
            if (c0350t == null) {
                if (this.f1437i == null) {
                    this.f1437i = new ArrayList();
                }
                this.f1437i.add(new Pair<>(abstractC5032h, executor));
                return;
            }
            c0350t.m1736t(executor, abstractC5032h);
        }
    }

    @Override // p279w.InterfaceC5009b0
    /* renamed from: g */
    public C5095y1 mo1573g() {
        return this.f1438j;
    }

    /* renamed from: h */
    public C4414z m1574h() {
        return this.f1430b;
    }

    /* renamed from: i */
    int m1575i() {
        Integer num = (Integer) this.f1430b.m18192a(CameraCharacteristics.SENSOR_ORIENTATION);
        C0654h.m3467f(num);
        return num.intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public int m1576j() {
        Integer num = (Integer) this.f1430b.m18192a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        C0654h.m3467f(num);
        return num.intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public void m1577k(C0350t c0350t) {
        synchronized (this.f1432d) {
            this.f1433e = c0350t;
            a<InterfaceC0408f3> aVar = this.f1435g;
            if (aVar != null) {
                aVar.m1580r(c0350t.m1713F().m1838d());
            }
            a<Integer> aVar2 = this.f1434f;
            if (aVar2 != null) {
                aVar2.m1580r(this.f1433e.m1711D().m1809c());
            }
            List<Pair<AbstractC5032h, Executor>> list = this.f1437i;
            if (list != null) {
                for (Pair<AbstractC5032h, Executor> pair : list) {
                    this.f1433e.m1736t((Executor) pair.second, (AbstractC5032h) pair.first);
                }
                this.f1437i = null;
            }
        }
        m1565l();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public void m1578n(LiveData<AbstractC0473t> liveData) {
        this.f1436h.m1580r(liveData);
    }
}
