package androidx.camera.core.impl.utils;

import android.util.Size;
import java.util.Comparator;

/* renamed from: androidx.camera.core.impl.utils.c */
/* loaded from: classes.dex */
public final class C0423c implements Comparator<Size> {

    /* renamed from: n */
    private boolean f1925n;

    public C0423c() {
        this(false);
    }

    @Override // java.util.Comparator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(Size size, Size size2) {
        int signum = Long.signum((size.getWidth() * size.getHeight()) - (size2.getWidth() * size2.getHeight()));
        return this.f1925n ? signum * (-1) : signum;
    }

    public C0423c(boolean z10) {
        this.f1925n = z10;
    }
}
