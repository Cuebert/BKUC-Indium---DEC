package p120j;

import android.view.View;
import android.view.animation.Interpolator;
import androidx.core.view.C0665b0;
import androidx.core.view.C0669d0;
import androidx.core.view.InterfaceC0667c0;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: j.h */
/* loaded from: classes.dex */
public class C3589h {

    /* renamed from: c */
    private Interpolator f15211c;

    /* renamed from: d */
    InterfaceC0667c0 f15212d;

    /* renamed from: e */
    private boolean f15213e;

    /* renamed from: b */
    private long f15210b = -1;

    /* renamed from: f */
    private final C0669d0 f15214f = new a();

    /* renamed from: a */
    final ArrayList<C0665b0> f15209a = new ArrayList<>();

    /* renamed from: j.h$a */
    /* loaded from: classes.dex */
    class a extends C0669d0 {

        /* renamed from: a */
        private boolean f15215a = false;

        /* renamed from: b */
        private int f15216b = 0;

        a() {
        }

        /* renamed from: a */
        void m15406a() {
            this.f15216b = 0;
            this.f15215a = false;
            C3589h.this.m15399b();
        }

        @Override // androidx.core.view.InterfaceC0667c0
        public void onAnimationEnd(View view) {
            int i10 = this.f15216b + 1;
            this.f15216b = i10;
            if (i10 == C3589h.this.f15209a.size()) {
                InterfaceC0667c0 interfaceC0667c0 = C3589h.this.f15212d;
                if (interfaceC0667c0 != null) {
                    interfaceC0667c0.onAnimationEnd(null);
                }
                m15406a();
            }
        }

        @Override // androidx.core.view.C0669d0, androidx.core.view.InterfaceC0667c0
        public void onAnimationStart(View view) {
            if (this.f15215a) {
                return;
            }
            this.f15215a = true;
            InterfaceC0667c0 interfaceC0667c0 = C3589h.this.f15212d;
            if (interfaceC0667c0 != null) {
                interfaceC0667c0.onAnimationStart(null);
            }
        }
    }

    /* renamed from: a */
    public void m15398a() {
        if (this.f15213e) {
            Iterator<C0665b0> it = this.f15209a.iterator();
            while (it.hasNext()) {
                it.next().m3601c();
            }
            this.f15213e = false;
        }
    }

    /* renamed from: b */
    void m15399b() {
        this.f15213e = false;
    }

    /* renamed from: c */
    public C3589h m15400c(C0665b0 c0665b0) {
        if (!this.f15213e) {
            this.f15209a.add(c0665b0);
        }
        return this;
    }

    /* renamed from: d */
    public C3589h m15401d(C0665b0 c0665b0, C0665b0 c0665b02) {
        this.f15209a.add(c0665b0);
        c0665b02.m3606j(c0665b0.m3602d());
        this.f15209a.add(c0665b02);
        return this;
    }

    /* renamed from: e */
    public C3589h m15402e(long j10) {
        if (!this.f15213e) {
            this.f15210b = j10;
        }
        return this;
    }

    /* renamed from: f */
    public C3589h m15403f(Interpolator interpolator) {
        if (!this.f15213e) {
            this.f15211c = interpolator;
        }
        return this;
    }

    /* renamed from: g */
    public C3589h m15404g(InterfaceC0667c0 interfaceC0667c0) {
        if (!this.f15213e) {
            this.f15212d = interfaceC0667c0;
        }
        return this;
    }

    /* renamed from: h */
    public void m15405h() {
        if (this.f15213e) {
            return;
        }
        Iterator<C0665b0> it = this.f15209a.iterator();
        while (it.hasNext()) {
            C0665b0 next = it.next();
            long j10 = this.f15210b;
            if (j10 >= 0) {
                next.m3603f(j10);
            }
            Interpolator interpolator = this.f15211c;
            if (interpolator != null) {
                next.m3604g(interpolator);
            }
            if (this.f15212d != null) {
                next.m3605h(this.f15214f);
            }
            next.m3608l();
        }
        this.f15213e = true;
    }
}
