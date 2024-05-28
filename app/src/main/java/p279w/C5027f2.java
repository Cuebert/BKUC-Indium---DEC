package p279w;

import androidx.camera.core.InterfaceC0419i1;
import androidx.camera.core.InterfaceC0443l1;
import com.google.common.util.concurrent.InterfaceFutureC2565m;
import java.util.Collections;
import java.util.List;
import p305y.C5586f;

/* renamed from: w.f2 */
/* loaded from: classes.dex */
public final class C5027f2 implements InterfaceC5030g1 {

    /* renamed from: a */
    private final int f19173a;

    /* renamed from: b */
    private final InterfaceC0443l1 f19174b;

    public C5027f2(InterfaceC0443l1 interfaceC0443l1, String str) {
        InterfaceC0419i1 mo1857q = interfaceC0443l1.mo1857q();
        if (mo1857q != null) {
            Integer num = (Integer) mo1857q.mo2028a().m19578c(str);
            if (num != null) {
                this.f19173a = num.intValue();
                this.f19174b = interfaceC0443l1;
                return;
            }
            throw new IllegalArgumentException("ImageProxy has no associated tag");
        }
        throw new IllegalArgumentException("ImageProxy has no associated ImageInfo");
    }

    @Override // p279w.InterfaceC5030g1
    /* renamed from: a */
    public InterfaceFutureC2565m<InterfaceC0443l1> mo2164a(int i10) {
        if (i10 != this.f19173a) {
            return C5586f.m20506f(new IllegalArgumentException("Capture id does not exist in the bundle"));
        }
        return C5586f.m20508h(this.f19174b);
    }

    @Override // p279w.InterfaceC5030g1
    /* renamed from: b */
    public List<Integer> mo2165b() {
        return Collections.singletonList(Integer.valueOf(this.f19173a));
    }

    /* renamed from: c */
    public void m19551c() {
        this.f19174b.close();
    }
}
