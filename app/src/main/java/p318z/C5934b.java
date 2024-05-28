package p318z;

import android.graphics.Matrix;
import androidx.camera.core.InterfaceC0419i1;
import androidx.camera.core.impl.utils.C0427g;
import p279w.C5043j2;
import p279w.InterfaceC5068q;

/* renamed from: z.b */
/* loaded from: classes.dex */
public final class C5934b implements InterfaceC0419i1 {

    /* renamed from: a */
    private final InterfaceC5068q f21824a;

    public C5934b(InterfaceC5068q interfaceC5068q) {
        this.f21824a = interfaceC5068q;
    }

    @Override // androidx.camera.core.InterfaceC0419i1
    /* renamed from: a */
    public C5043j2 mo2028a() {
        return this.f21824a.mo1383a();
    }

    @Override // androidx.camera.core.InterfaceC0419i1
    /* renamed from: b */
    public void mo2037b(C0427g.b bVar) {
        this.f21824a.mo1384b(bVar);
    }

    @Override // androidx.camera.core.InterfaceC0419i1
    /* renamed from: c */
    public long mo2029c() {
        return this.f21824a.mo1385c();
    }

    @Override // androidx.camera.core.InterfaceC0419i1
    /* renamed from: d */
    public int mo2030d() {
        return 0;
    }

    @Override // androidx.camera.core.InterfaceC0419i1
    /* renamed from: e */
    public Matrix mo2031e() {
        return new Matrix();
    }

    /* renamed from: f */
    public InterfaceC5068q m21100f() {
        return this.f21824a;
    }
}
