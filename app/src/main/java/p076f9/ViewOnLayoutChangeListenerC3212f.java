package p076f9;

import android.app.Activity;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import java.util.Objects;

/* renamed from: f9.f */
/* loaded from: classes.dex */
public class ViewOnLayoutChangeListenerC3212f implements View.OnLayoutChangeListener {

    /* renamed from: a */
    private final Activity f13508a;

    /* renamed from: b */
    private final View f13509b;

    /* renamed from: c */
    private int f13510c;

    public ViewOnLayoutChangeListenerC3212f(Activity activity) {
        Objects.requireNonNull(activity);
        this.f13508a = activity;
        Window window = activity.getWindow();
        Objects.requireNonNull(window);
        this.f13509b = window.getDecorView();
        this.f13510c = m14260a();
    }

    /* renamed from: a */
    private int m14260a() {
        WindowManager windowManager = this.f13508a.getWindowManager();
        if (windowManager != null) {
            return windowManager.getDefaultDisplay().getRotation();
        }
        return 0;
    }

    /* renamed from: b */
    protected void mo14230b(int i10) {
        throw null;
    }

    /* renamed from: c */
    public void m14261c() {
        Log.d("ViewOrientationListener", "startListening");
        this.f13510c = m14260a();
        this.f13509b.addOnLayoutChangeListener(this);
        mo14230b(this.f13510c);
    }

    /* renamed from: d */
    public void m14262d() {
        Log.d("ViewOrientationListener", "stopListening");
        this.f13509b.removeOnLayoutChangeListener(this);
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        int m14260a = m14260a();
        if (this.f13510c != m14260a) {
            this.f13510c = m14260a;
            mo14230b(m14260a);
        }
    }
}
