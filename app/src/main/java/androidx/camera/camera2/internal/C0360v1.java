package androidx.camera.camera2.internal;

import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.util.Size;
import android.view.Display;
import p255u.C4766j;

/* renamed from: androidx.camera.camera2.internal.v1 */
/* loaded from: classes.dex */
public class C0360v1 {

    /* renamed from: d */
    private static final Size f1625d = new Size(1920, 1080);

    /* renamed from: e */
    private static final Object f1626e = new Object();

    /* renamed from: f */
    private static volatile C0360v1 f1627f;

    /* renamed from: a */
    private final DisplayManager f1628a;

    /* renamed from: b */
    private volatile Size f1629b = null;

    /* renamed from: c */
    private final C4766j f1630c = new C4766j();

    private C0360v1(Context context) {
        this.f1628a = (DisplayManager) context.getSystemService("display");
    }

    /* renamed from: a */
    private Size m1788a() {
        Size size;
        Point point = new Point();
        m1790c().getRealSize(point);
        if (point.x > point.y) {
            size = new Size(point.x, point.y);
        } else {
            size = new Size(point.y, point.x);
        }
        int width = size.getWidth() * size.getHeight();
        Size size2 = f1625d;
        if (width > size2.getWidth() * size2.getHeight()) {
            size = size2;
        }
        return this.f1630c.m18947a(size);
    }

    /* renamed from: b */
    public static C0360v1 m1789b(Context context) {
        if (f1627f == null) {
            synchronized (f1626e) {
                if (f1627f == null) {
                    f1627f = new C0360v1(context);
                }
            }
        }
        return f1627f;
    }

    /* renamed from: c */
    public Display m1790c() {
        Display[] displays = this.f1628a.getDisplays();
        if (displays.length == 1) {
            return displays[0];
        }
        Display display = null;
        int i10 = -1;
        for (Display display2 : displays) {
            if (display2.getState() != 1) {
                Point point = new Point();
                display2.getRealSize(point);
                int i11 = point.x;
                int i12 = point.y;
                if (i11 * i12 > i10) {
                    display = display2;
                    i10 = i11 * i12;
                }
            }
        }
        if (display != null) {
            return display;
        }
        throw new IllegalArgumentException("No display can be found from the input display manager!");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public Size m1791d() {
        if (this.f1629b != null) {
            return this.f1629b;
        }
        this.f1629b = m1788a();
        return this.f1629b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m1792e() {
        this.f1629b = m1788a();
    }
}
