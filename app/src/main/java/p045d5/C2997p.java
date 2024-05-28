package p045d5;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: d5.p */
/* loaded from: classes.dex */
public final class C2997p {
    /* renamed from: a */
    public static final List m13468a(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC2999r abstractC2999r = (AbstractC2999r) it.next();
            Bundle bundle = new Bundle();
            bundle.putInt("event_type", abstractC2999r.mo13470a());
            bundle.putLong("event_timestamp", abstractC2999r.mo13471b());
            arrayList.add(bundle);
        }
        return arrayList;
    }

    /* renamed from: b */
    public static final void m13469b(int i10, List list) {
        list.add(AbstractC2999r.m13472c(i10, System.currentTimeMillis()));
    }
}
