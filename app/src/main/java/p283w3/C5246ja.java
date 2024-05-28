package p283w3;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: w3.ja */
/* loaded from: classes.dex */
public final class C5246ja implements InterfaceC5311oa {

    /* renamed from: a */
    final List<InterfaceC5311oa> f19842a;

    public C5246ja(Context context, AbstractC5233ia abstractC5233ia) {
        ArrayList arrayList = new ArrayList();
        this.f19842a = arrayList;
        if (abstractC5233ia.mo19837c()) {
            arrayList.add(new C5428xa(context, abstractC5233ia));
        }
    }

    @Override // p283w3.InterfaceC5311oa
    /* renamed from: a */
    public final void mo19845a(C5363sa c5363sa) {
        Iterator<InterfaceC5311oa> it = this.f19842a.iterator();
        while (it.hasNext()) {
            it.next().mo19845a(c5363sa);
        }
    }
}
