package androidx.camera.camera2.internal;

import androidx.camera.core.C0463q1;
import p218r.C4414z;
import p242t.C4570e;
import p242t.C4572g;
import p255u.C4759c;
import p279w.InterfaceC5028g;

/* renamed from: androidx.camera.camera2.internal.d */
/* loaded from: classes.dex */
public class C0282d implements InterfaceC5028g {

    /* renamed from: a */
    private final boolean f1266a;

    /* renamed from: b */
    private final int f1267b;

    /* renamed from: c */
    private final C4759c f1268c;

    public C0282d(String str, C4414z c4414z) {
        boolean z10;
        int i10;
        try {
            i10 = Integer.parseInt(str);
            z10 = true;
        } catch (NumberFormatException unused) {
            C0463q1.m2212k("Camera2CamcorderProfileProvider", "Camera id is not an integer: " + str + ", unable to create CamcorderProfileProvider");
            z10 = false;
            i10 = -1;
        }
        this.f1266a = z10;
        this.f1267b = i10;
        this.f1268c = new C4759c((C4570e) C4572g.m18660a(str, c4414z).m19725b(C4570e.class));
    }
}
