package p199p4;

import android.R;
import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* renamed from: p4.a */
/* loaded from: classes.dex */
public class ViewOnTouchListenerC4268a implements View.OnTouchListener {

    /* renamed from: n */
    private final Dialog f17455n;

    /* renamed from: o */
    private final int f17456o;

    /* renamed from: p */
    private final int f17457p;

    /* renamed from: q */
    private final int f17458q;

    public ViewOnTouchListenerC4268a(Dialog dialog, Rect rect) {
        this.f17455n = dialog;
        this.f17456o = rect.left;
        this.f17457p = rect.top;
        this.f17458q = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        View findViewById = view.findViewById(R.id.content);
        int left = this.f17456o + findViewById.getLeft();
        int width = findViewById.getWidth() + left;
        if (new RectF(left, this.f17457p + findViewById.getTop(), width, findViewById.getHeight() + r3).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            obtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            obtain.setAction(0);
            int i10 = this.f17458q;
            obtain.setLocation((-i10) - 1, (-i10) - 1);
        }
        view.performClick();
        return this.f17455n.onTouchEvent(obtain);
    }
}
