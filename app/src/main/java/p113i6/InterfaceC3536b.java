package p113i6;

import androidx.annotation.RecentlyNonNull;
import androidx.lifecycle.AbstractC0839f;
import androidx.lifecycle.InterfaceC0844k;
import androidx.lifecycle.InterfaceC0853t;
import java.io.Closeable;
import java.util.List;
import p085g4.AbstractC3263l;
import p140k6.C3759a;

/* renamed from: i6.b */
/* loaded from: classes.dex */
public interface InterfaceC3536b extends Closeable, InterfaceC0844k {
    /* renamed from: N */
    AbstractC3263l<List<C3535a>> mo12083N(@RecentlyNonNull C3759a c3759a);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    @InterfaceC0853t(AbstractC0839f.b.ON_DESTROY)
    void close();
}
