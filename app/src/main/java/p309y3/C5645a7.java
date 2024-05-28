package p309y3;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: y3.a7 */
/* loaded from: classes.dex */
public final class C5645a7 implements InterfaceC5685e7 {

    /* renamed from: a */
    final List<InterfaceC5685e7> f20849a;

    public C5645a7(Context context, AbstractC5880z6 abstractC5880z6) {
        ArrayList arrayList = new ArrayList();
        this.f20849a = arrayList;
        if (abstractC5880z6.mo20784c()) {
            arrayList.add(new C5764m7(context, abstractC5880z6));
        }
    }

    @Override // p309y3.InterfaceC5685e7
    /* renamed from: a */
    public final void mo20659a(C5705g7 c5705g7) {
        Iterator<InterfaceC5685e7> it = this.f20849a.iterator();
        while (it.hasNext()) {
            it.next().mo20659a(c5705g7);
        }
    }
}
