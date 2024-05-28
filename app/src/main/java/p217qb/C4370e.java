package p217qb;

import ac.AbstractC0077g;
import ac.C0073c;
import ac.InterfaceC0089s;
import java.io.IOException;

/* renamed from: qb.e */
/* loaded from: classes.dex */
class C4370e extends AbstractC0077g {

    /* renamed from: o */
    private boolean f17898o;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4370e(InterfaceC0089s interfaceC0089s) {
        super(interfaceC0089s);
    }

    @Override // ac.AbstractC0077g, ac.InterfaceC0089s
    /* renamed from: C */
    public void mo313C(C0073c c0073c, long j10) throws IOException {
        if (this.f17898o) {
            c0073c.mo369r(j10);
            return;
        }
        try {
            super.mo313C(c0073c, j10);
        } catch (IOException e10) {
            this.f17898o = true;
            mo18088b(e10);
        }
    }

    /* renamed from: b */
    protected void mo18088b(IOException iOException) {
        throw null;
    }

    @Override // ac.AbstractC0077g, ac.InterfaceC0089s, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f17898o) {
            return;
        }
        try {
            super.close();
        } catch (IOException e10) {
            this.f17898o = true;
            mo18088b(e10);
        }
    }

    @Override // ac.AbstractC0077g, ac.InterfaceC0089s, java.io.Flushable
    public void flush() throws IOException {
        if (this.f17898o) {
            return;
        }
        try {
            super.flush();
        } catch (IOException e10) {
            this.f17898o = true;
            mo18088b(e10);
        }
    }
}
