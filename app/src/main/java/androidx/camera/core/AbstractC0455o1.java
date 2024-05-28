package androidx.camera.core;

import android.graphics.Matrix;
import androidx.camera.core.impl.utils.C0427g;
import p279w.C5043j2;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.camera.core.o1 */
/* loaded from: classes.dex */
public abstract class AbstractC0455o1 implements InterfaceC0419i1 {
    /* renamed from: f */
    public static InterfaceC0419i1 m2173f(C5043j2 c5043j2, long j10, int i10, Matrix matrix) {
        return new C0413h(c5043j2, j10, i10, matrix);
    }

    @Override // androidx.camera.core.InterfaceC0419i1
    /* renamed from: a */
    public abstract C5043j2 mo2028a();

    @Override // androidx.camera.core.InterfaceC0419i1
    /* renamed from: b */
    public void mo2037b(C0427g.b bVar) {
        bVar.m2108m(mo2030d());
    }

    @Override // androidx.camera.core.InterfaceC0419i1
    /* renamed from: c */
    public abstract long mo2029c();

    @Override // androidx.camera.core.InterfaceC0419i1
    /* renamed from: d */
    public abstract int mo2030d();

    @Override // androidx.camera.core.InterfaceC0419i1
    /* renamed from: e */
    public abstract Matrix mo2031e();
}
