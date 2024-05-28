package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import androidx.core.content.C0587a;
import androidx.core.util.C0654h;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: androidx.fragment.app.j */
/* loaded from: classes.dex */
public abstract class AbstractC0809j<E> extends AbstractC0805f {

    /* renamed from: n */
    private final Activity f4053n;

    /* renamed from: o */
    private final Context f4054o;

    /* renamed from: p */
    private final Handler f4055p;

    /* renamed from: q */
    private final int f4056q;

    /* renamed from: r */
    final FragmentManager f4057r;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC0809j(ActivityC0803d activityC0803d) {
        this(activityC0803d, activityC0803d, new Handler(), 0);
    }

    @Override // androidx.fragment.app.AbstractC0805f
    /* renamed from: c */
    public View mo4397c(int i10) {
        return null;
    }

    @Override // androidx.fragment.app.AbstractC0805f
    /* renamed from: d */
    public boolean mo4398d() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public Activity m4658e() {
        return this.f4053n;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public Context m4659g() {
        return this.f4054o;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public Handler m4660h() {
        return this.f4055p;
    }

    /* renamed from: i */
    public void mo4619i(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    /* renamed from: j */
    public abstract E mo4620j();

    /* renamed from: m */
    public LayoutInflater mo4621m() {
        return LayoutInflater.from(this.f4054o);
    }

    /* renamed from: n */
    public boolean mo4622n(Fragment fragment) {
        return true;
    }

    /* renamed from: o */
    public void m4661o(Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i10, Bundle bundle) {
        if (i10 == -1) {
            C0587a.m3036j(this.f4054o, intent, bundle);
            return;
        }
        throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
    }

    /* renamed from: p */
    public void mo4623p() {
    }

    AbstractC0809j(Activity activity, Context context, Handler handler, int i10) {
        this.f4057r = new C0812m();
        this.f4053n = activity;
        this.f4054o = (Context) C0654h.m3468g(context, "context == null");
        this.f4055p = (Handler) C0654h.m3468g(handler, "handler == null");
        this.f4056q = i10;
    }
}
