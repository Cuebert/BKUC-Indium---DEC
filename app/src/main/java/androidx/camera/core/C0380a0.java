package androidx.camera.core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p279w.InterfaceC5041j0;
import p279w.InterfaceC5053m0;

/* renamed from: androidx.camera.core.a0 */
/* loaded from: classes.dex */
final class C0380a0 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.camera.core.a0$a */
    /* loaded from: classes.dex */
    public static final class a implements InterfaceC5041j0 {

        /* renamed from: a */
        final List<InterfaceC5053m0> f1717a;

        a(List<InterfaceC5053m0> list) {
            if (list != null && !list.isEmpty()) {
                this.f1717a = Collections.unmodifiableList(new ArrayList(list));
                return;
            }
            throw new IllegalArgumentException("Cannot set an empty CaptureStage list.");
        }

        @Override // p279w.InterfaceC5041j0
        /* renamed from: a */
        public List<InterfaceC5053m0> mo1864a() {
            return this.f1717a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static InterfaceC5041j0 m1861a(List<InterfaceC5053m0> list) {
        return new a(list);
    }

    /* renamed from: b */
    static InterfaceC5041j0 m1862b(InterfaceC5053m0... interfaceC5053m0Arr) {
        return new a(Arrays.asList(interfaceC5053m0Arr));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static InterfaceC5041j0 m1863c() {
        return m1862b(new InterfaceC5053m0.a());
    }
}
