package p090g9;

import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import android.view.WindowManager;
import p035c9.C1151k;
import p076f9.C3207a;

/* renamed from: g9.b */
/* loaded from: classes.dex */
public class C3319b {

    /* renamed from: h */
    private static boolean f13800h;

    /* renamed from: a */
    public Rect f13801a;

    /* renamed from: b */
    public int f13802b;

    /* renamed from: c */
    public int f13803c;

    /* renamed from: d */
    public int f13804d;

    /* renamed from: e */
    public int f13805e;

    /* renamed from: f */
    public int f13806f;

    /* renamed from: g */
    public int f13807g;

    public C3319b(Rect rect, int i10, int i11, int i12, int i13, int i14, int i15) {
        this.f13801a = rect;
        this.f13802b = i10;
        this.f13803c = i11;
        this.f13804d = i12;
        this.f13805e = i13;
        this.f13806f = i14;
        this.f13807g = i15;
    }

    /* renamed from: a */
    public static C3319b m14597a(View view, WindowManager windowManager, View view2, Rect rect) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        m14598b("getInfo() ------ start ------");
        Rect rect2 = new Rect();
        view.getWindowVisibleDisplayFrame(rect2);
        m14598b("getInfo() sr:" + rect2.toString());
        Point point = new Point();
        windowManager.getDefaultDisplay().getSize(point);
        m14598b("getInfo() ss:" + point.toString());
        int height = view.getHeight();
        int width = view.getWidth();
        if (C3207a.m14198b()) {
            i10 = 0;
            i11 = 0;
        } else {
            Point point2 = new Point();
            windowManager.getDefaultDisplay().getRealSize(point2);
            i10 = point2.y;
            i11 = point2.x;
        }
        m14598b("getInfo() sh1:" + height + " sh2:" + i10);
        if (height > i10) {
            i12 = height;
        } else {
            width = i11;
            i12 = i10;
        }
        m14598b("getInfo() sh:" + i12);
        if (rect != null) {
            i13 = rect.bottom;
        } else {
            i13 = i12 - rect2.bottom;
        }
        m14598b("getInfo() bm:" + i13);
        int i16 = i12 - point.y;
        m14598b("getInfo() sbh:" + i16);
        if (rect != null) {
            i14 = rect.top;
        } else {
            int[] iArr = new int[2];
            if (view2 != null) {
                view2.getLocationInWindow(iArr);
            }
            i14 = iArr[1];
        }
        int i17 = i14;
        m14598b("getInfo() top:" + i17);
        int i18 = rect2.bottom;
        if (C3207a.m14199c() && i17 < rect2.top) {
            m14598b("getInfo() adjusting top margin");
            int i19 = rect2.top;
            i18 -= i19;
            i16 -= i19;
        }
        int i20 = i18;
        m14598b("getInfo() kby:" + i20);
        if (rect != null) {
            i15 = rect.right;
        } else {
            i15 = width - point.x;
        }
        int i21 = i15;
        m14598b("getInfo() rsbw:" + i21);
        int min = C3207a.m14198b() ? 0 : Math.min(i13, i16);
        m14598b("getInfo() rsbh:" + min);
        int max = Math.max(0, i13 - i16);
        m14598b("getInfo() kbh:" + max);
        return new C3319b(rect2, i12, min, i21, max, i20, i17);
    }

    /* renamed from: b */
    private static void m14598b(String str) {
        if (f13800h) {
            C1151k.m6714h("rbx.screen", str);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3319b)) {
            return false;
        }
        C3319b c3319b = (C3319b) obj;
        return c3319b.f13801a.equals(this.f13801a) && c3319b.f13802b == this.f13802b && c3319b.f13803c == this.f13803c && c3319b.f13804d == this.f13804d && c3319b.f13805e == this.f13805e && c3319b.f13806f == this.f13806f && c3319b.f13807g == this.f13807g;
    }
}
