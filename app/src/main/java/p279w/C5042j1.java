package p279w;

import androidx.camera.core.C0457p;
import androidx.camera.core.InterfaceC0461q;
import androidx.camera.core.InterfaceC0465r;
import androidx.core.util.C0654h;
import java.util.ArrayList;
import java.util.List;

/* renamed from: w.j1 */
/* loaded from: classes.dex */
public class C5042j1 implements InterfaceC0461q {

    /* renamed from: b */
    private int f19201b;

    public C5042j1(int i10) {
        this.f19201b = i10;
    }

    @Override // androidx.camera.core.InterfaceC0461q
    /* renamed from: a */
    public /* synthetic */ AbstractC5094y0 mo2175a() {
        return C0457p.m2174a(this);
    }

    @Override // androidx.camera.core.InterfaceC0461q
    /* renamed from: b */
    public List<InterfaceC0465r> mo2176b(List<InterfaceC0465r> list) {
        ArrayList arrayList = new ArrayList();
        for (InterfaceC0465r interfaceC0465r : list) {
            C0654h.m3463b(interfaceC0465r instanceof InterfaceC5009b0, "The camera info doesn't contain internal implementation.");
            Integer mo1567a = ((InterfaceC5009b0) interfaceC0465r).mo1567a();
            if (mo1567a != null && mo1567a.intValue() == this.f19201b) {
                arrayList.add(interfaceC0465r);
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public int m19575c() {
        return this.f19201b;
    }
}
