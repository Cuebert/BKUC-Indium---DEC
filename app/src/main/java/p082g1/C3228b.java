package p082g1;

import android.content.Context;
import androidx.core.util.C0648b;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: g1.b */
/* loaded from: classes.dex */
public class C3228b<D> {

    /* renamed from: a */
    int f13625a;

    /* renamed from: b */
    b<D> f13626b;

    /* renamed from: c */
    a<D> f13627c;

    /* renamed from: d */
    Context f13628d;

    /* renamed from: e */
    boolean f13629e = false;

    /* renamed from: f */
    boolean f13630f = false;

    /* renamed from: g */
    boolean f13631g = true;

    /* renamed from: h */
    boolean f13632h = false;

    /* renamed from: i */
    boolean f13633i = false;

    /* renamed from: g1.b$a */
    /* loaded from: classes.dex */
    public interface a<D> {
        /* renamed from: a */
        void m14449a(C3228b<D> c3228b);
    }

    /* renamed from: g1.b$b */
    /* loaded from: classes.dex */
    public interface b<D> {
        /* renamed from: a */
        void mo4963a(C3228b<D> c3228b, D d10);
    }

    public C3228b(Context context) {
        this.f13628d = context.getApplicationContext();
    }

    /* renamed from: a */
    public void m14430a() {
        this.f13630f = true;
        m14438j();
    }

    /* renamed from: b */
    public boolean m14431b() {
        return mo14420k();
    }

    /* renamed from: c */
    public void m14432c() {
        this.f13633i = false;
    }

    /* renamed from: d */
    public String m14433d(D d10) {
        StringBuilder sb2 = new StringBuilder(64);
        C0648b.m3451a(d10, sb2);
        sb2.append("}");
        return sb2.toString();
    }

    /* renamed from: e */
    public void m14434e() {
        a<D> aVar = this.f13627c;
        if (aVar != null) {
            aVar.m14449a(this);
        }
    }

    /* renamed from: f */
    public void m14435f(D d10) {
        b<D> bVar = this.f13626b;
        if (bVar != null) {
            bVar.mo4963a(this, d10);
        }
    }

    @Deprecated
    /* renamed from: g */
    public void mo14419g(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mId=");
        printWriter.print(this.f13625a);
        printWriter.print(" mListener=");
        printWriter.println(this.f13626b);
        if (this.f13629e || this.f13632h || this.f13633i) {
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.print(this.f13629e);
            printWriter.print(" mContentChanged=");
            printWriter.print(this.f13632h);
            printWriter.print(" mProcessingChange=");
            printWriter.println(this.f13633i);
        }
        if (this.f13630f || this.f13631g) {
            printWriter.print(str);
            printWriter.print("mAbandoned=");
            printWriter.print(this.f13630f);
            printWriter.print(" mReset=");
            printWriter.println(this.f13631g);
        }
    }

    /* renamed from: h */
    public void m14436h() {
        mo14421m();
    }

    /* renamed from: i */
    public boolean m14437i() {
        return this.f13630f;
    }

    /* renamed from: j */
    protected void m14438j() {
    }

    /* renamed from: k */
    protected boolean mo14420k() {
        throw null;
    }

    /* renamed from: l */
    public void m14439l() {
        if (this.f13629e) {
            m14436h();
        } else {
            this.f13632h = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: m */
    public void mo14421m() {
    }

    /* renamed from: n */
    protected void m14440n() {
    }

    /* renamed from: o */
    protected void mo14441o() {
        throw null;
    }

    /* renamed from: p */
    protected void m14442p() {
    }

    /* renamed from: q */
    public void m14443q(int i10, b<D> bVar) {
        if (this.f13626b == null) {
            this.f13626b = bVar;
            this.f13625a = i10;
            return;
        }
        throw new IllegalStateException("There is already a listener registered");
    }

    /* renamed from: r */
    public void m14444r() {
        m14440n();
        this.f13631g = true;
        this.f13629e = false;
        this.f13630f = false;
        this.f13632h = false;
        this.f13633i = false;
    }

    /* renamed from: s */
    public void m14445s() {
        if (this.f13633i) {
            m14439l();
        }
    }

    /* renamed from: t */
    public final void m14446t() {
        this.f13629e = true;
        this.f13631g = false;
        this.f13630f = false;
        mo14441o();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        C0648b.m3451a(this, sb2);
        sb2.append(" id=");
        sb2.append(this.f13625a);
        sb2.append("}");
        return sb2.toString();
    }

    /* renamed from: u */
    public void m14447u() {
        this.f13629e = false;
        m14442p();
    }

    /* renamed from: v */
    public void m14448v(b<D> bVar) {
        b<D> bVar2 = this.f13626b;
        if (bVar2 == null) {
            throw new IllegalStateException("No listener register");
        }
        if (bVar2 == bVar) {
            this.f13626b = null;
            return;
        }
        throw new IllegalArgumentException("Attempting to unregister the wrong listener");
    }
}
