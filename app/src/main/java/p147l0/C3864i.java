package p147l0;

import java.util.ArrayList;
import java.util.Arrays;
import p158m0.C3921i;
import p158m0.C3927o;

/* renamed from: l0.i */
/* loaded from: classes.dex */
public class C3864i extends C3860e implements InterfaceC3863h {

    /* renamed from: D0 */
    public C3860e[] f16087D0 = new C3860e[4];

    /* renamed from: E0 */
    public int f16088E0 = 0;

    @Override // p147l0.InterfaceC3863h
    /* renamed from: a */
    public void mo16458a(C3861f c3861f) {
    }

    /* renamed from: a1 */
    public void m16461a1(ArrayList<C3927o> arrayList, int i10, C3927o c3927o) {
        for (int i11 = 0; i11 < this.f16088E0; i11++) {
            c3927o.m16648a(this.f16087D0[i11]);
        }
        for (int i12 = 0; i12 < this.f16088E0; i12++) {
            C3921i.m16633a(this.f16087D0[i12], i10, arrayList, c3927o);
        }
    }

    @Override // p147l0.InterfaceC3863h
    /* renamed from: b */
    public void mo16459b(C3860e c3860e) {
        if (c3860e == this || c3860e == null) {
            return;
        }
        int i10 = this.f16088E0 + 1;
        C3860e[] c3860eArr = this.f16087D0;
        if (i10 > c3860eArr.length) {
            this.f16087D0 = (C3860e[]) Arrays.copyOf(c3860eArr, c3860eArr.length * 2);
        }
        C3860e[] c3860eArr2 = this.f16087D0;
        int i11 = this.f16088E0;
        c3860eArr2[i11] = c3860e;
        this.f16088E0 = i11 + 1;
    }

    /* renamed from: b1 */
    public int m16462b1(int i10) {
        int i11;
        int i12;
        for (int i13 = 0; i13 < this.f16088E0; i13++) {
            C3860e c3860e = this.f16087D0[i13];
            if (i10 == 0 && (i12 = c3860e.f15965A0) != -1) {
                return i12;
            }
            if (i10 == 1 && (i11 = c3860e.f15967B0) != -1) {
                return i11;
            }
        }
        return -1;
    }

    @Override // p147l0.InterfaceC3863h
    /* renamed from: c */
    public void mo16460c() {
        this.f16088E0 = 0;
        Arrays.fill(this.f16087D0, (Object) null);
    }
}
