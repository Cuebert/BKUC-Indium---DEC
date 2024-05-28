package p295x2;

import android.os.Looper;
import com.google.android.gms.common.api.internal.AbstractC1348b;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import p295x2.C5506a;
import p308y2.InterfaceC5606d;
import p308y2.InterfaceC5618j;
import p308y2.InterfaceC5622l;

@Deprecated
/* renamed from: x2.f */
/* loaded from: classes.dex */
public abstract class AbstractC5511f {

    /* renamed from: a */
    private static final Set<AbstractC5511f> f20555a = Collections.newSetFromMap(new WeakHashMap());

    @Deprecated
    /* renamed from: x2.f$a */
    /* loaded from: classes.dex */
    public interface a extends InterfaceC5606d {
    }

    @Deprecated
    /* renamed from: x2.f$b */
    /* loaded from: classes.dex */
    public interface b extends InterfaceC5618j {
    }

    /* renamed from: c */
    public static Set<AbstractC5511f> m20281c() {
        Set<AbstractC5511f> set = f20555a;
        synchronized (set) {
        }
        return set;
    }

    /* renamed from: a */
    public <A extends C5506a.b, R extends InterfaceC5518m, T extends AbstractC1348b<R, A>> T mo20282a(T t10) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public <A extends C5506a.b, T extends AbstractC1348b<? extends InterfaceC5518m, A>> T mo20283b(T t10) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: d */
    public Looper mo20284d() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: e */
    public boolean m20285e(InterfaceC5622l interfaceC5622l) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: f */
    public void m20286f() {
        throw new UnsupportedOperationException();
    }
}
