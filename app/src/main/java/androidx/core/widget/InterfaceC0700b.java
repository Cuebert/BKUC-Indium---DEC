package androidx.core.widget;

import android.os.Build;

/* renamed from: androidx.core.widget.b */
/* loaded from: classes.dex */
public interface InterfaceC0700b {

    /* renamed from: a */
    @Deprecated
    public static final boolean f3720a;

    static {
        f3720a = Build.VERSION.SDK_INT >= 27;
    }

    void setAutoSizeTextTypeUniformWithConfiguration(int i10, int i11, int i12, int i13) throws IllegalArgumentException;
}
