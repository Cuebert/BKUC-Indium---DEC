package androidx.recyclerview.widget;

import androidx.recyclerview.widget.C0906a;
import java.util.List;

/* renamed from: androidx.recyclerview.widget.h */
/* loaded from: classes.dex */
public class C0913h {

    /* renamed from: a */
    final a f4792a;

    /* renamed from: androidx.recyclerview.widget.h$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: a */
        void mo5693a(C0906a.b bVar);

        /* renamed from: b */
        C0906a.b mo5694b(int i10, int i11, int i12, Object obj);
    }

    public C0913h(a aVar) {
        this.f4792a = aVar;
    }

    /* renamed from: a */
    private int m5799a(List<C0906a.b> list) {
        boolean z10 = false;
        for (int size = list.size() - 1; size >= 0; size--) {
            if (list.get(size).f4664a != 8) {
                z10 = true;
            } else if (z10) {
                return size;
            }
        }
        return -1;
    }

    /* renamed from: c */
    private void m5800c(List<C0906a.b> list, int i10, C0906a.b bVar, int i11, C0906a.b bVar2) {
        int i12 = bVar.f4667d;
        int i13 = bVar2.f4665b;
        int i14 = i12 < i13 ? -1 : 0;
        int i15 = bVar.f4665b;
        if (i15 < i13) {
            i14++;
        }
        if (i13 <= i15) {
            bVar.f4665b = i15 + bVar2.f4667d;
        }
        int i16 = bVar2.f4665b;
        if (i16 <= i12) {
            bVar.f4667d = i12 + bVar2.f4667d;
        }
        bVar2.f4665b = i16 + i14;
        list.set(i10, bVar2);
        list.set(i11, bVar);
    }

    /* renamed from: d */
    private void m5801d(List<C0906a.b> list, int i10, int i11) {
        C0906a.b bVar = list.get(i10);
        C0906a.b bVar2 = list.get(i11);
        int i12 = bVar2.f4664a;
        if (i12 == 1) {
            m5800c(list, i10, bVar, i11, bVar2);
        } else if (i12 == 2) {
            m5803e(list, i10, bVar, i11, bVar2);
        } else {
            if (i12 != 4) {
                return;
            }
            m5804f(list, i10, bVar, i11, bVar2);
        }
    }

    /* renamed from: b */
    public void m5802b(List<C0906a.b> list) {
        while (true) {
            int m5799a = m5799a(list);
            if (m5799a == -1) {
                return;
            } else {
                m5801d(list, m5799a, m5799a + 1);
            }
        }
    }

    /* renamed from: e */
    void m5803e(List<C0906a.b> list, int i10, C0906a.b bVar, int i11, C0906a.b bVar2) {
        boolean z10;
        int i12 = bVar.f4665b;
        int i13 = bVar.f4667d;
        boolean z11 = false;
        if (i12 < i13) {
            if (bVar2.f4665b == i12 && bVar2.f4667d == i13 - i12) {
                z10 = false;
                z11 = true;
            } else {
                z10 = false;
            }
        } else if (bVar2.f4665b == i13 + 1 && bVar2.f4667d == i12 - i13) {
            z10 = true;
            z11 = true;
        } else {
            z10 = true;
        }
        int i14 = bVar2.f4665b;
        if (i13 < i14) {
            bVar2.f4665b = i14 - 1;
        } else {
            int i15 = bVar2.f4667d;
            if (i13 < i14 + i15) {
                bVar2.f4667d = i15 - 1;
                bVar.f4664a = 2;
                bVar.f4667d = 1;
                if (bVar2.f4667d == 0) {
                    list.remove(i11);
                    this.f4792a.mo5693a(bVar2);
                    return;
                }
                return;
            }
        }
        int i16 = bVar.f4665b;
        int i17 = bVar2.f4665b;
        C0906a.b bVar3 = null;
        if (i16 <= i17) {
            bVar2.f4665b = i17 + 1;
        } else {
            int i18 = bVar2.f4667d;
            if (i16 < i17 + i18) {
                bVar3 = this.f4792a.mo5694b(2, i16 + 1, (i17 + i18) - i16, null);
                bVar2.f4667d = bVar.f4665b - bVar2.f4665b;
            }
        }
        if (z11) {
            list.set(i10, bVar2);
            list.remove(i11);
            this.f4792a.mo5693a(bVar);
            return;
        }
        if (z10) {
            if (bVar3 != null) {
                int i19 = bVar.f4665b;
                if (i19 > bVar3.f4665b) {
                    bVar.f4665b = i19 - bVar3.f4667d;
                }
                int i20 = bVar.f4667d;
                if (i20 > bVar3.f4665b) {
                    bVar.f4667d = i20 - bVar3.f4667d;
                }
            }
            int i21 = bVar.f4665b;
            if (i21 > bVar2.f4665b) {
                bVar.f4665b = i21 - bVar2.f4667d;
            }
            int i22 = bVar.f4667d;
            if (i22 > bVar2.f4665b) {
                bVar.f4667d = i22 - bVar2.f4667d;
            }
        } else {
            if (bVar3 != null) {
                int i23 = bVar.f4665b;
                if (i23 >= bVar3.f4665b) {
                    bVar.f4665b = i23 - bVar3.f4667d;
                }
                int i24 = bVar.f4667d;
                if (i24 >= bVar3.f4665b) {
                    bVar.f4667d = i24 - bVar3.f4667d;
                }
            }
            int i25 = bVar.f4665b;
            if (i25 >= bVar2.f4665b) {
                bVar.f4665b = i25 - bVar2.f4667d;
            }
            int i26 = bVar.f4667d;
            if (i26 >= bVar2.f4665b) {
                bVar.f4667d = i26 - bVar2.f4667d;
            }
        }
        list.set(i10, bVar2);
        if (bVar.f4665b != bVar.f4667d) {
            list.set(i11, bVar);
        } else {
            list.remove(i11);
        }
        if (bVar3 != null) {
            list.add(i10, bVar3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0027  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void m5804f(java.util.List<androidx.recyclerview.widget.C0906a.b> r9, int r10, androidx.recyclerview.widget.C0906a.b r11, int r12, androidx.recyclerview.widget.C0906a.b r13) {
        /*
            r8 = this;
            int r0 = r11.f4667d
            int r1 = r13.f4665b
            r2 = 4
            r3 = 0
            r4 = 1
            if (r0 >= r1) goto Ld
            int r1 = r1 - r4
            r13.f4665b = r1
            goto L20
        Ld:
            int r5 = r13.f4667d
            int r1 = r1 + r5
            if (r0 >= r1) goto L20
            int r5 = r5 - r4
            r13.f4667d = r5
            androidx.recyclerview.widget.h$a r0 = r8.f4792a
            int r1 = r11.f4665b
            java.lang.Object r5 = r13.f4666c
            androidx.recyclerview.widget.a$b r0 = r0.mo5694b(r2, r1, r4, r5)
            goto L21
        L20:
            r0 = r3
        L21:
            int r1 = r11.f4665b
            int r5 = r13.f4665b
            if (r1 > r5) goto L2b
            int r5 = r5 + r4
            r13.f4665b = r5
            goto L41
        L2b:
            int r6 = r13.f4667d
            int r7 = r5 + r6
            if (r1 >= r7) goto L41
            int r5 = r5 + r6
            int r5 = r5 - r1
            androidx.recyclerview.widget.h$a r3 = r8.f4792a
            int r1 = r1 + r4
            java.lang.Object r4 = r13.f4666c
            androidx.recyclerview.widget.a$b r3 = r3.mo5694b(r2, r1, r5, r4)
            int r1 = r13.f4667d
            int r1 = r1 - r5
            r13.f4667d = r1
        L41:
            r9.set(r12, r11)
            int r11 = r13.f4667d
            if (r11 <= 0) goto L4c
            r9.set(r10, r13)
            goto L54
        L4c:
            r9.remove(r10)
            androidx.recyclerview.widget.h$a r11 = r8.f4792a
            r11.mo5693a(r13)
        L54:
            if (r0 == 0) goto L59
            r9.add(r10, r0)
        L59:
            if (r3 == 0) goto L5e
            r9.add(r10, r3)
        L5e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.C0913h.m5804f(java.util.List, int, androidx.recyclerview.widget.a$b, int, androidx.recyclerview.widget.a$b):void");
    }
}
