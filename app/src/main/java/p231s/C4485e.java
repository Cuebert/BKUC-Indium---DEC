package p231s;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;
import androidx.core.util.C0654h;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: s.e */
/* loaded from: classes.dex */
public class C4485e extends C4484d {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C4485e(Surface surface) {
        super(new OutputConfiguration(surface));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static C4485e m18443g(OutputConfiguration outputConfiguration) {
        return new C4485e(outputConfiguration);
    }

    @Override // p231s.C4484d, p231s.C4483c, p231s.C4486f, p231s.C4482b.a
    /* renamed from: b */
    public String mo18438b() {
        return null;
    }

    @Override // p231s.C4484d, p231s.C4483c, p231s.C4486f, p231s.C4482b.a
    /* renamed from: c */
    public Object mo18439c() {
        C0654h.m3462a(this.f18175a instanceof OutputConfiguration);
        return this.f18175a;
    }

    @Override // p231s.C4484d, p231s.C4483c, p231s.C4486f, p231s.C4482b.a
    /* renamed from: d */
    public void mo18440d(String str) {
        ((OutputConfiguration) mo18439c()).setPhysicalCameraId(str);
    }

    C4485e(Object obj) {
        super(obj);
    }
}
