package androidx.appcompat.widget;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import p039d.C2951d;
import p039d.C2953f;
import p039d.C2954g;
import p039d.C2956i;

/* renamed from: androidx.appcompat.widget.s */
/* loaded from: classes.dex */
class C0266s {

    /* renamed from: a */
    private final Context f1218a;

    /* renamed from: b */
    private final View f1219b;

    /* renamed from: c */
    private final TextView f1220c;

    /* renamed from: d */
    private final WindowManager.LayoutParams f1221d;

    /* renamed from: e */
    private final Rect f1222e;

    /* renamed from: f */
    private final int[] f1223f;

    /* renamed from: g */
    private final int[] f1224g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0266s(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f1221d = layoutParams;
        this.f1222e = new Rect();
        this.f1223f = new int[2];
        this.f1224g = new int[2];
        this.f1218a = context;
        View inflate = LayoutInflater.from(context).inflate(C2954g.f12312u, (ViewGroup) null);
        this.f1219b = inflate;
        this.f1220c = (TextView) inflate.findViewById(C2953f.f12290y);
        layoutParams.setTitle(getClass().getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = C2956i.f12332a;
        layoutParams.flags = 24;
    }

    /* renamed from: a */
    private void m1317a(View view, int i10, int i11, boolean z10, WindowManager.LayoutParams layoutParams) {
        int height;
        int i12;
        layoutParams.token = view.getApplicationWindowToken();
        int dimensionPixelOffset = this.f1218a.getResources().getDimensionPixelOffset(C2951d.f12196m);
        if (view.getWidth() < dimensionPixelOffset) {
            i10 = view.getWidth() / 2;
        }
        if (view.getHeight() >= dimensionPixelOffset) {
            int dimensionPixelOffset2 = this.f1218a.getResources().getDimensionPixelOffset(C2951d.f12195l);
            height = i11 + dimensionPixelOffset2;
            i12 = i11 - dimensionPixelOffset2;
        } else {
            height = view.getHeight();
            i12 = 0;
        }
        layoutParams.gravity = 49;
        int dimensionPixelOffset3 = this.f1218a.getResources().getDimensionPixelOffset(z10 ? C2951d.f12198o : C2951d.f12197n);
        View m1318b = m1318b(view);
        if (m1318b == null) {
            Log.e("TooltipPopup", "Cannot find app view");
            return;
        }
        m1318b.getWindowVisibleDisplayFrame(this.f1222e);
        Rect rect = this.f1222e;
        if (rect.left < 0 && rect.top < 0) {
            Resources resources = this.f1218a.getResources();
            int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
            int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            this.f1222e.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
        }
        m1318b.getLocationOnScreen(this.f1224g);
        view.getLocationOnScreen(this.f1223f);
        int[] iArr = this.f1223f;
        int i13 = iArr[0];
        int[] iArr2 = this.f1224g;
        iArr[0] = i13 - iArr2[0];
        iArr[1] = iArr[1] - iArr2[1];
        layoutParams.x = (iArr[0] + i10) - (m1318b.getWidth() / 2);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f1219b.measure(makeMeasureSpec, makeMeasureSpec);
        int measuredHeight = this.f1219b.getMeasuredHeight();
        int[] iArr3 = this.f1223f;
        int i14 = ((iArr3[1] + i12) - dimensionPixelOffset3) - measuredHeight;
        int i15 = iArr3[1] + height + dimensionPixelOffset3;
        if (z10) {
            if (i14 >= 0) {
                layoutParams.y = i14;
                return;
            } else {
                layoutParams.y = i15;
                return;
            }
        }
        if (measuredHeight + i15 <= this.f1222e.height()) {
            layoutParams.y = i15;
        } else {
            layoutParams.y = i14;
        }
    }

    /* renamed from: b */
    private static View m1318b(View view) {
        View rootView = view.getRootView();
        ViewGroup.LayoutParams layoutParams = rootView.getLayoutParams();
        if ((layoutParams instanceof WindowManager.LayoutParams) && ((WindowManager.LayoutParams) layoutParams).type == 2) {
            return rootView;
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return ((Activity) context).getWindow().getDecorView();
            }
        }
        return rootView;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m1319c() {
        if (m1320d()) {
            ((WindowManager) this.f1218a.getSystemService("window")).removeView(this.f1219b);
        }
    }

    /* renamed from: d */
    boolean m1320d() {
        return this.f1219b.getParent() != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m1321e(View view, int i10, int i11, boolean z10, CharSequence charSequence) {
        if (m1320d()) {
            m1319c();
        }
        this.f1220c.setText(charSequence);
        m1317a(view, i10, i11, z10, this.f1221d);
        ((WindowManager) this.f1218a.getSystemService("window")).addView(this.f1219b, this.f1221d);
    }
}
