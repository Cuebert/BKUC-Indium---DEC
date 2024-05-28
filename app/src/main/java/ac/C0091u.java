package ac;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* renamed from: ac.u */
/* loaded from: classes.dex */
public class C0091u {

    /* renamed from: d */
    public static final C0091u f316d = new a();

    /* renamed from: a */
    private boolean f317a;

    /* renamed from: b */
    private long f318b;

    /* renamed from: c */
    private long f319c;

    /* renamed from: ac.u$a */
    /* loaded from: classes.dex */
    final class a extends C0091u {
        a() {
        }

        @Override // ac.C0091u
        /* renamed from: d */
        public C0091u mo410d(long j10) {
            return this;
        }

        @Override // ac.C0091u
        /* renamed from: f */
        public void mo412f() throws IOException {
        }

        @Override // ac.C0091u
        /* renamed from: g */
        public C0091u mo413g(long j10, TimeUnit timeUnit) {
            return this;
        }
    }

    /* renamed from: a */
    public C0091u mo407a() {
        this.f317a = false;
        return this;
    }

    /* renamed from: b */
    public C0091u mo408b() {
        this.f319c = 0L;
        return this;
    }

    /* renamed from: c */
    public long mo409c() {
        if (this.f317a) {
            return this.f318b;
        }
        throw new IllegalStateException("No deadline");
    }

    /* renamed from: d */
    public C0091u mo410d(long j10) {
        this.f317a = true;
        this.f318b = j10;
        return this;
    }

    /* renamed from: e */
    public boolean mo411e() {
        return this.f317a;
    }

    /* renamed from: f */
    public void mo412f() throws IOException {
        if (!Thread.interrupted()) {
            if (this.f317a && this.f318b - System.nanoTime() <= 0) {
                throw new InterruptedIOException("deadline reached");
            }
            return;
        }
        Thread.currentThread().interrupt();
        throw new InterruptedIOException("interrupted");
    }

    /* renamed from: g */
    public C0091u mo413g(long j10, TimeUnit timeUnit) {
        if (j10 >= 0) {
            if (timeUnit != null) {
                this.f319c = timeUnit.toNanos(j10);
                return this;
            }
            throw new IllegalArgumentException("unit == null");
        }
        throw new IllegalArgumentException("timeout < 0: " + j10);
    }

    /* renamed from: h */
    public long m451h() {
        return this.f319c;
    }
}
