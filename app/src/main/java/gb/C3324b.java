package gb;

import java.util.NoSuchElementException;
import ua.AbstractC4908z;

/* renamed from: gb.b */
/* loaded from: classes.dex */
public final class C3324b extends AbstractC4908z {

    /* renamed from: n */
    private final int f13829n;

    /* renamed from: o */
    private final int f13830o;

    /* renamed from: p */
    private boolean f13831p;

    /* renamed from: q */
    private int f13832q;

    public C3324b(int i10, int i11, int i12) {
        this.f13829n = i12;
        this.f13830o = i11;
        boolean z10 = true;
        if (i12 <= 0 ? i10 < i11 : i10 > i11) {
            z10 = false;
        }
        this.f13831p = z10;
        this.f13832q = z10 ? i10 : i11;
    }

    @Override // ua.AbstractC4908z
    /* renamed from: a */
    public int mo14615a() {
        int i10 = this.f13832q;
        if (i10 == this.f13830o) {
            if (this.f13831p) {
                this.f13831p = false;
            } else {
                throw new NoSuchElementException();
            }
        } else {
            this.f13832q = this.f13829n + i10;
        }
        return i10;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f13831p;
    }
}
