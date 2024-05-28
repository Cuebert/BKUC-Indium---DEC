package p321z2;

import android.content.Context;
import android.util.SparseIntArray;
import com.google.android.gms.common.C1379b;
import p295x2.C5506a;

/* renamed from: z2.x */
/* loaded from: classes.dex */
public final class C6007x {

    /* renamed from: a */
    private final SparseIntArray f22075a = new SparseIntArray();

    /* renamed from: b */
    private C1379b f22076b;

    public C6007x(C1379b c1379b) {
        C5984j.m21286j(c1379b);
        this.f22076b = c1379b;
    }

    /* renamed from: a */
    public final int m21319a(Context context, int i10) {
        return this.f22075a.get(i10, -1);
    }

    /* renamed from: b */
    public final int m21320b(Context context, C5506a.f fVar) {
        C5984j.m21286j(context);
        C5984j.m21286j(fVar);
        int i10 = 0;
        if (!fVar.mo20252g()) {
            return 0;
        }
        int mo6185h = fVar.mo6185h();
        int m21319a = m21319a(context, mo6185h);
        if (m21319a == -1) {
            int i11 = 0;
            while (true) {
                if (i11 >= this.f22075a.size()) {
                    i10 = -1;
                    break;
                }
                int keyAt = this.f22075a.keyAt(i11);
                if (keyAt > mo6185h && this.f22075a.get(keyAt) == 0) {
                    break;
                }
                i11++;
            }
            m21319a = i10 == -1 ? this.f22076b.mo7391h(context, mo6185h) : i10;
            this.f22075a.put(mo6185h, m21319a);
        }
        return m21319a;
    }

    /* renamed from: c */
    public final void m21321c() {
        this.f22075a.clear();
    }
}
