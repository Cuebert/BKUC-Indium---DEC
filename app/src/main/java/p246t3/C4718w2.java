package p246t3;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;

/* renamed from: t3.w2 */
/* loaded from: classes.dex */
final class C4718w2 {

    /* renamed from: a */
    private final Deque f18521a = new ArrayDeque(16);

    private C4718w2(boolean z10) {
    }

    /* renamed from: a */
    public static C4718w2 m18850a() {
        return new C4718w2(false);
    }

    /* renamed from: h */
    private final long m18851h() {
        if (this.f18521a.isEmpty()) {
            return 0L;
        }
        return ((Long) this.f18521a.peek()).longValue();
    }

    /* renamed from: i */
    private final void m18852i(long j10) {
        this.f18521a.pop();
        this.f18521a.push(Long.valueOf(j10));
    }

    /* renamed from: b */
    public final void m18853b() throws IOException {
        if (!this.f18521a.isEmpty()) {
            throw new IOException(String.format("data item not completed, stackSize: %s scope: %s", Integer.valueOf(this.f18521a.size()), Long.valueOf(m18851h())));
        }
    }

    /* renamed from: c */
    public final void m18854c() throws IOException {
        long m18851h = m18851h();
        if (m18851h >= 0) {
            throw new IOException(String.format("expected indefinite length scope but found %s", Long.valueOf(m18851h)));
        }
        if (m18851h != -5) {
            this.f18521a.pop();
            return;
        }
        throw new IOException("expected a value for dangling key in indefinite-length map");
    }

    /* renamed from: d */
    public final void m18855d() throws IOException {
        long m18851h = m18851h();
        if (m18851h != -1) {
            if (m18851h != -2) {
                return;
            } else {
                m18851h = -2;
            }
        }
        throw new IOException(String.format("expected non-string scope but found %s", Long.valueOf(m18851h)));
    }

    /* renamed from: e */
    public final void m18856e(long j10) throws IOException {
        long m18851h = m18851h();
        if (m18851h != j10) {
            if (m18851h != -1) {
                if (m18851h != -2) {
                    return;
                } else {
                    m18851h = -2;
                }
            }
            throw new IOException(String.format("expected non-string scope or scope %s but found %s", Long.valueOf(j10), Long.valueOf(m18851h)));
        }
    }

    /* renamed from: f */
    public final void m18857f() {
        long m18851h = m18851h();
        if (m18851h == 1) {
            this.f18521a.pop();
            return;
        }
        if (m18851h > 1) {
            m18852i(m18851h - 1);
        } else if (m18851h == -4) {
            m18852i(-5L);
        } else if (m18851h == -5) {
            m18852i(-4L);
        }
    }

    /* renamed from: g */
    public final void m18858g(long j10) {
        this.f18521a.push(Long.valueOf(j10));
    }
}
