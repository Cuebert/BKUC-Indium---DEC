package p129j8;

import java.util.ArrayList;
import java.util.Vector;
import p129j8.InterfaceC3670m;

/* renamed from: j8.e */
/* loaded from: classes.dex */
public class C3662e<T extends InterfaceC3670m> extends Vector<T> {

    /* renamed from: n */
    protected a<T> f15379n;

    /* renamed from: j8.e$a */
    /* loaded from: classes.dex */
    public interface a<T> {
        /* renamed from: a */
        boolean mo15083a(T t10, T t11);
    }

    /* renamed from: k */
    public synchronized int m15588k(String str) {
        for (int i10 = 0; i10 < size(); i10++) {
            if (str.equals(((InterfaceC3670m) get(i10)).mo15571b())) {
                return i10;
            }
        }
        return -1;
    }

    /* renamed from: m */
    public boolean m15589m(T t10, T t11) {
        a<T> aVar = this.f15379n;
        if (aVar != null) {
            return aVar.mo15083a(t10, t11);
        }
        return t10 == t11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: o */
    public synchronized void m15590o(T t10) {
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= size()) {
                break;
            }
            if (m15589m(t10, (InterfaceC3670m) get(i10))) {
                ((InterfaceC3670m) get(i10)).mo15572c(t10);
                z10 = true;
                break;
            }
            i10++;
        }
        if (!z10) {
            add(t10);
        }
    }

    /* renamed from: p */
    public synchronized void m15591p(String str) {
        int m15588k = m15588k(str);
        if (m15588k != -1) {
            remove(m15588k);
        }
    }

    /* renamed from: q */
    public synchronized void m15592q(long j10) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < size(); i10++) {
            if (Long.valueOf(((InterfaceC3670m) get(i10)).mo15570a()).longValue() <= j10) {
                arrayList.add((InterfaceC3670m) get(i10));
            }
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            remove(arrayList.get(i11));
        }
    }

    /* renamed from: r */
    public void m15593r(a<T> aVar) {
        this.f15379n = aVar;
    }
}
