package p231s;

import android.annotation.SuppressLint;
import android.os.Build;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.C0463q1;
import androidx.core.util.C0654h;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p231s.C4482b;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: s.f */
/* loaded from: classes.dex */
public class C4486f implements C4482b.a {

    /* renamed from: a */
    final Object f18175a;

    /* renamed from: s.f$a */
    /* loaded from: classes.dex */
    private static final class a {

        /* renamed from: a */
        final List<Surface> f18176a;

        /* renamed from: b */
        final Size f18177b;

        /* renamed from: c */
        final int f18178c;

        /* renamed from: d */
        final int f18179d;

        /* renamed from: e */
        String f18180e;

        /* renamed from: f */
        boolean f18181f = false;

        a(Surface surface) {
            C0654h.m3468g(surface, "Surface must not be null");
            this.f18176a = Collections.singletonList(surface);
            this.f18177b = m18446c(surface);
            this.f18178c = m18444a(surface);
            this.f18179d = m18445b(surface);
        }

        @SuppressLint({"BlockedPrivateApi"})
        /* renamed from: a */
        private static int m18444a(Surface surface) {
            try {
                Method declaredMethod = Class.forName("android.hardware.camera2.legacy.LegacyCameraDevice").getDeclaredMethod("detectSurfaceType", Surface.class);
                if (Build.VERSION.SDK_INT < 22) {
                    declaredMethod.setAccessible(true);
                }
                return ((Integer) declaredMethod.invoke(null, surface)).intValue();
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e10) {
                C0463q1.m2205d("OutputConfigCompat", "Unable to retrieve surface format.", e10);
                return 0;
            }
        }

        @SuppressLint({"SoonBlockedPrivateApi"})
        /* renamed from: b */
        private static int m18445b(Surface surface) {
            try {
                return ((Integer) Surface.class.getDeclaredMethod("getGenerationId", new Class[0]).invoke(surface, new Object[0])).intValue();
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e10) {
                C0463q1.m2205d("OutputConfigCompat", "Unable to retrieve surface generation id.", e10);
                return -1;
            }
        }

        @SuppressLint({"BlockedPrivateApi"})
        /* renamed from: c */
        private static Size m18446c(Surface surface) {
            try {
                Method declaredMethod = Class.forName("android.hardware.camera2.legacy.LegacyCameraDevice").getDeclaredMethod("getSurfaceSize", Surface.class);
                declaredMethod.setAccessible(true);
                return (Size) declaredMethod.invoke(null, surface);
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e10) {
                C0463q1.m2205d("OutputConfigCompat", "Unable to retrieve surface size.", e10);
                return null;
            }
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (!this.f18177b.equals(aVar.f18177b) || this.f18178c != aVar.f18178c || this.f18179d != aVar.f18179d || this.f18181f != aVar.f18181f || !Objects.equals(this.f18180e, aVar.f18180e)) {
                return false;
            }
            int min = Math.min(this.f18176a.size(), aVar.f18176a.size());
            for (int i10 = 0; i10 < min; i10++) {
                if (this.f18176a.get(i10) != aVar.f18176a.get(i10)) {
                    return false;
                }
            }
            return true;
        }

        public int hashCode() {
            int hashCode = this.f18176a.hashCode() ^ 31;
            int i10 = this.f18179d ^ ((hashCode << 5) - hashCode);
            int hashCode2 = this.f18177b.hashCode() ^ ((i10 << 5) - i10);
            int i11 = this.f18178c ^ ((hashCode2 << 5) - hashCode2);
            int i12 = (this.f18181f ? 1 : 0) ^ ((i11 << 5) - i11);
            int i13 = (i12 << 5) - i12;
            String str = this.f18180e;
            return (str == null ? 0 : str.hashCode()) ^ i13;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4486f(Surface surface) {
        this.f18175a = new a(surface);
    }

    @Override // p231s.C4482b.a
    /* renamed from: a */
    public Surface mo18437a() {
        List<Surface> list = ((a) this.f18175a).f18176a;
        if (list.size() == 0) {
            return null;
        }
        return list.get(0);
    }

    @Override // p231s.C4482b.a
    /* renamed from: b */
    public String mo18438b() {
        return ((a) this.f18175a).f18180e;
    }

    @Override // p231s.C4482b.a
    /* renamed from: c */
    public Object mo18439c() {
        return null;
    }

    @Override // p231s.C4482b.a
    /* renamed from: d */
    public void mo18440d(String str) {
        ((a) this.f18175a).f18180e = str;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C4486f) {
            return Objects.equals(this.f18175a, ((C4486f) obj).f18175a);
        }
        return false;
    }

    public int hashCode() {
        return this.f18175a.hashCode();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4486f(Object obj) {
        this.f18175a = obj;
    }
}
