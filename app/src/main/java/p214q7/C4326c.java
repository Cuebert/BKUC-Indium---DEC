package p214q7;

import java.util.ArrayList;
import p008a7.C0044b;
import p024bc.C1100c;
import p091gc.C3348t;
import p179n9.C4083g;
import p214q7.AbstractC4329f;
import p249t6.C4734a;
import p249t6.C4735b;
import p289w9.C5481a;
import p289w9.C5482b;

/* renamed from: q7.c */
/* loaded from: classes.dex */
public class C4326c extends AbstractC4329f {

    /* renamed from: F */
    private ArrayList<Long> f17571F;

    public C4326c(long j10) {
        ArrayList<Long> arrayList = new ArrayList<>(1);
        this.f17571F = arrayList;
        arrayList.add(Long.valueOf(j10));
    }

    /* renamed from: x */
    private void m17847x(long j10, String str) {
        C4734a m18877d;
        if (str == null || str.isEmpty() || (m18877d = C4735b.m18874b().m18877d(j10)) == null) {
            return;
        }
        m18877d.m18869e(str);
    }

    @Override // com.birbit.android.jobqueue.AbstractC1292e
    /* renamed from: n */
    public void mo7050n() throws Throwable {
        if (this.f17571F.isEmpty()) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f17571F.get(0));
        for (int i10 = 1; i10 < this.f17571F.size(); i10++) {
            sb2.append(",");
            sb2.append(this.f17571F.get(i10));
        }
        C3348t<C5482b> mo14637c = C4083g.m16979d().mo16974g().m18309b(sb2.toString(), "150x150", "Png", Boolean.FALSE).mo14637c();
        ArrayList arrayList = new ArrayList();
        if (mo14637c.m14735f()) {
            for (C5481a c5481a : mo14637c.m14731a().data) {
                m17847x(c5481a.targetId, c5481a.imageUrl);
                arrayList.add(Long.valueOf(c5481a.targetId));
            }
        }
        C1100c.m6458d().m6469j(new C0044b(arrayList));
    }

    @Override // p214q7.AbstractC4329f
    /* renamed from: w */
    protected void mo17841w(AbstractC4329f.a aVar) {
    }
}
