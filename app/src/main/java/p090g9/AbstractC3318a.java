package p090g9;

import android.content.Context;
import com.roblox.engine.jni.NativeGLInterface;
import p035c9.C1151k;
import p076f9.C3211e;

/* renamed from: g9.a */
/* loaded from: classes.dex */
public abstract class AbstractC3318a {

    /* renamed from: a */
    private Context f13795a;

    /* renamed from: b */
    protected C3319b f13796b;

    /* renamed from: c */
    protected a f13797c;

    /* renamed from: d */
    private C3211e f13798d = new C3211e();

    /* renamed from: g9.a$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        public int f13799a;
    }

    public AbstractC3318a(Context context, a aVar) {
        this.f13795a = context;
        this.f13797c = aVar;
    }

    /* renamed from: a */
    private void m14590a(int i10, int i11, int i12, int i13, int i14) {
        C1151k.m6714h("rbx.glview.layout", "doUpdateAppUISizes() vw:" + i10 + " status:" + i11 + " tbh:" + i12 + " bm:" + i13 + " rm:" + i14);
        NativeGLInterface.updateAppUISizes(i10, i11, i12, i13, i14);
    }

    /* renamed from: g */
    private int m14591g(int i10, float f10) {
        return (int) ((i10 / f10) + 0.5d);
    }

    /* renamed from: b */
    public float m14592b() {
        return this.f13798d.m14259b(this.f13795a);
    }

    /* renamed from: c */
    public abstract C3319b mo12555c();

    /* renamed from: d */
    protected void m14593d(C3319b c3319b, boolean z10) {
        C3319b c3319b2;
        if (c3319b == null) {
            return;
        }
        if (z10 || (c3319b2 = this.f13796b) == null || !c3319b2.equals(c3319b)) {
            this.f13796b = c3319b;
            try {
                float m14592b = m14592b();
                int m14591g = m14591g(c3319b.f13801a.right, m14592b);
                int m14591g2 = m14591g(c3319b.f13806f, m14592b);
                int i10 = c3319b.f13805e;
                if (i10 > 0) {
                    m14595f(true, 0, m14591g2, m14591g, m14591g(i10, m14592b));
                } else {
                    m14595f(false, 0, m14591g2, m14591g, 0);
                }
                if (m14596h()) {
                    return;
                }
                int m14591g3 = m14591g(c3319b.f13803c, m14592b);
                int m14591g4 = m14591g(c3319b.f13807g, m14592b);
                int m14591g5 = m14591g(c3319b.f13804d, m14592b);
                a aVar = this.f13797c;
                m14590a(m14591g, m14591g4, aVar != null ? aVar.f13799a : 0, m14591g3, m14591g5);
            } catch (Exception e10) {
                C1151k.m6709c("rbx.glview.layout", "onGlobalLayout() exception:" + e10.getMessage());
            }
        }
    }

    /* renamed from: e */
    public void m14594e(boolean z10) {
        m14593d(mo12555c(), z10);
    }

    /* renamed from: f */
    protected void m14595f(boolean z10, int i10, int i11, int i12, int i13) {
        C1151k.m6714h("rbx.glview.layout", "onUpdateKeyboardSize() v:" + z10 + " x:" + i10 + " y:" + i11 + " w:" + i12 + " h:" + i13);
        NativeGLInterface.updateKeyboardSize(z10, i10, i11, i12, i13);
    }

    /* renamed from: h */
    protected boolean m14596h() {
        return false;
    }
}
