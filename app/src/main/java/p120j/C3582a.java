package p120j;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import p039d.C2948a;
import p039d.C2949b;
import p039d.C2951d;
import p039d.C2957j;

/* renamed from: j.a */
/* loaded from: classes.dex */
public class C3582a {

    /* renamed from: a */
    private Context f15147a;

    private C3582a(Context context) {
        this.f15147a = context;
    }

    /* renamed from: b */
    public static C3582a m15368b(Context context) {
        return new C3582a(context);
    }

    /* renamed from: a */
    public boolean m15369a() {
        return this.f15147a.getApplicationInfo().targetSdkVersion < 14;
    }

    /* renamed from: c */
    public int m15370c() {
        return this.f15147a.getResources().getDisplayMetrics().widthPixels / 2;
    }

    /* renamed from: d */
    public int m15371d() {
        Configuration configuration = this.f15147a.getResources().getConfiguration();
        int i10 = configuration.screenWidthDp;
        int i11 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i10 > 600) {
            return 5;
        }
        if (i10 > 960 && i11 > 720) {
            return 5;
        }
        if (i10 > 720 && i11 > 960) {
            return 5;
        }
        if (i10 >= 500) {
            return 4;
        }
        if (i10 > 640 && i11 > 480) {
            return 4;
        }
        if (i10 <= 480 || i11 <= 640) {
            return i10 >= 360 ? 3 : 2;
        }
        return 4;
    }

    /* renamed from: e */
    public int m15372e() {
        return this.f15147a.getResources().getDimensionPixelSize(C2951d.f12185b);
    }

    /* renamed from: f */
    public int m15373f() {
        TypedArray obtainStyledAttributes = this.f15147a.obtainStyledAttributes(null, C2957j.f12466a, C2948a.f12151c, 0);
        int layoutDimension = obtainStyledAttributes.getLayoutDimension(C2957j.f12512j, 0);
        Resources resources = this.f15147a.getResources();
        if (!m15374g()) {
            layoutDimension = Math.min(layoutDimension, resources.getDimensionPixelSize(C2951d.f12184a));
        }
        obtainStyledAttributes.recycle();
        return layoutDimension;
    }

    /* renamed from: g */
    public boolean m15374g() {
        return this.f15147a.getResources().getBoolean(C2949b.f12175a);
    }

    /* renamed from: h */
    public boolean m15375h() {
        return true;
    }
}
