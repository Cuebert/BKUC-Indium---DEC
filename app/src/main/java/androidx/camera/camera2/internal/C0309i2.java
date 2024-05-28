package androidx.camera.camera2.internal;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.CamcorderProfile;
import android.media.MediaRecorder;
import android.os.Build;
import android.util.Pair;
import android.util.Rational;
import android.util.Size;
import androidx.camera.core.C0463q1;
import androidx.camera.core.C0477u;
import androidx.camera.core.impl.utils.C0422b;
import androidx.camera.core.impl.utils.C0423c;
import androidx.core.util.C0654h;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p218r.C4382f;
import p218r.C4397m0;
import p218r.C4414z;
import p255u.C4760d;
import p255u.C4761e;
import p255u.C4770n;
import p255u.C4773q;
import p279w.AbstractC5035h2;
import p279w.AbstractC5039i2;
import p279w.C5031g2;
import p279w.InterfaceC5026f1;
import p279w.InterfaceC5063o2;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.camera.camera2.internal.i2 */
/* loaded from: classes.dex */
public final class C0309i2 {

    /* renamed from: q */
    private static final Size f1403q = new Size(640, 480);

    /* renamed from: r */
    private static final Size f1404r = new Size(0, 0);

    /* renamed from: s */
    private static final Size f1405s = new Size(1920, 1080);

    /* renamed from: t */
    private static final Size f1406t = new Size(720, 480);

    /* renamed from: u */
    private static final Rational f1407u = new Rational(4, 3);

    /* renamed from: v */
    private static final Rational f1408v = new Rational(3, 4);

    /* renamed from: w */
    private static final Rational f1409w = new Rational(16, 9);

    /* renamed from: x */
    private static final Rational f1410x = new Rational(9, 16);

    /* renamed from: c */
    private final String f1413c;

    /* renamed from: d */
    private final InterfaceC0277c f1414d;

    /* renamed from: e */
    private final C4414z f1415e;

    /* renamed from: f */
    private final C4760d f1416f;

    /* renamed from: g */
    private final C4761e f1417g;

    /* renamed from: h */
    private final int f1418h;

    /* renamed from: i */
    private final boolean f1419i;

    /* renamed from: m */
    private AbstractC5039i2 f1423m;

    /* renamed from: o */
    private final C0360v1 f1425o;

    /* renamed from: a */
    private final List<C5031g2> f1411a = new ArrayList();

    /* renamed from: b */
    private final Map<Integer, Size> f1412b = new HashMap();

    /* renamed from: j */
    private final Map<Integer, List<Size>> f1420j = new HashMap();

    /* renamed from: k */
    private boolean f1421k = false;

    /* renamed from: l */
    private boolean f1422l = false;

    /* renamed from: n */
    private Map<Integer, Size[]> f1424n = new HashMap();

    /* renamed from: p */
    private final C4770n f1426p = new C4770n();

    /* renamed from: androidx.camera.camera2.internal.i2$a */
    /* loaded from: classes.dex */
    public static final class a implements Comparator<Rational> {

        /* renamed from: n */
        private Rational f1427n;

        a(Rational rational) {
            this.f1427n = rational;
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(Rational rational, Rational rational2) {
            if (rational.equals(rational2)) {
                return 0;
            }
            return (int) Math.signum(Float.valueOf(Math.abs(rational.floatValue() - this.f1427n.floatValue())).floatValue() - Float.valueOf(Math.abs(rational2.floatValue() - this.f1427n.floatValue())).floatValue());
        }
    }

    public C0309i2(Context context, String str, C4397m0 c4397m0, InterfaceC0277c interfaceC0277c) throws C0477u {
        String str2 = (String) C0654h.m3467f(str);
        this.f1413c = str2;
        this.f1414d = (InterfaceC0277c) C0654h.m3467f(interfaceC0277c);
        this.f1416f = new C4760d(str);
        this.f1417g = new C4761e();
        this.f1425o = C0360v1.m1789b(context);
        try {
            C4414z m18165c = c4397m0.m18165c(str2);
            this.f1415e = m18165c;
            Integer num = (Integer) m18165c.m18192a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
            this.f1418h = num != null ? num.intValue() : 2;
            this.f1419i = m1533H();
            m1543h();
            m1544i();
            m1537a();
        } catch (C4382f e10) {
            throw C0312j1.m1581a(e10);
        }
    }

    /* renamed from: A */
    private Rational m1526A(InterfaceC5026f1 interfaceC5026f1) {
        Rational rational;
        int m18955a = new C4773q().m18955a(this.f1413c, this.f1415e);
        if (m18955a == 0) {
            rational = this.f1419i ? f1407u : f1408v;
        } else if (m18955a == 1) {
            rational = this.f1419i ? f1409w : f1410x;
        } else {
            if (m18955a == 2) {
                Size m1541f = m1541f(256);
                return new Rational(m1541f.getWidth(), m1541f.getHeight());
            }
            if (m18955a != 3) {
                return null;
            }
            Size m1527B = m1527B(interfaceC5026f1);
            if (!interfaceC5026f1.mo19479l()) {
                if (m1527B != null) {
                    return new Rational(m1527B.getWidth(), m1527B.getHeight());
                }
                return null;
            }
            int mo19480n = interfaceC5026f1.mo19480n();
            if (mo19480n == 0) {
                rational = this.f1419i ? f1407u : f1408v;
            } else {
                if (mo19480n != 1) {
                    C0463q1.m2204c("SupportedSurfaceCombination", "Undefined target aspect ratio: " + mo19480n);
                    return null;
                }
                rational = this.f1419i ? f1409w : f1410x;
            }
        }
        return rational;
    }

    /* renamed from: B */
    private Size m1527B(InterfaceC5026f1 interfaceC5026f1) {
        return m1542g(interfaceC5026f1.mo19482z(null), interfaceC5026f1.mo19464E(0));
    }

    /* renamed from: C */
    private List<Integer> m1528C(List<InterfaceC5063o2<?>> list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator<InterfaceC5063o2<?>> it = list.iterator();
        while (it.hasNext()) {
            int mo1372m = it.next().mo1372m(0);
            if (!arrayList2.contains(Integer.valueOf(mo1372m))) {
                arrayList2.add(Integer.valueOf(mo1372m));
            }
        }
        Collections.sort(arrayList2);
        Collections.reverse(arrayList2);
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            int intValue = ((Integer) it2.next()).intValue();
            for (InterfaceC5063o2<?> interfaceC5063o2 : list) {
                if (intValue == interfaceC5063o2.mo1372m(0)) {
                    arrayList.add(Integer.valueOf(list.indexOf(interfaceC5063o2)));
                }
            }
        }
        return arrayList;
    }

    /* renamed from: D */
    private Map<Rational, List<Size>> m1529D(List<Size> list) {
        HashMap hashMap = new HashMap();
        hashMap.put(f1407u, new ArrayList());
        hashMap.put(f1409w, new ArrayList());
        for (Size size : list) {
            Rational rational = null;
            for (Rational rational2 : hashMap.keySet()) {
                if (m1530E(size, rational2)) {
                    List list2 = (List) hashMap.get(rational2);
                    if (!list2.contains(size)) {
                        list2.add(size);
                    }
                    rational = rational2;
                }
            }
            if (rational == null) {
                hashMap.put(new Rational(size.getWidth(), size.getHeight()), new ArrayList(Collections.singleton(size)));
            }
        }
        return hashMap;
    }

    /* renamed from: E */
    static boolean m1530E(Size size, Rational rational) {
        if (rational == null) {
            return false;
        }
        if (rational.equals(new Rational(size.getWidth(), size.getHeight()))) {
            return true;
        }
        if (m1547l(size) >= m1547l(f1403q)) {
            return m1531F(size, rational);
        }
        return false;
    }

    /* renamed from: F */
    private static boolean m1531F(Size size, Rational rational) {
        int width = size.getWidth();
        int height = size.getHeight();
        Rational rational2 = new Rational(rational.getDenominator(), rational.getNumerator());
        int i10 = width % 16;
        if (i10 == 0 && height % 16 == 0) {
            return m1534I(Math.max(0, height + (-16)), width, rational) || m1534I(Math.max(0, width + (-16)), height, rational2);
        }
        if (i10 == 0) {
            return m1534I(height, width, rational);
        }
        if (height % 16 == 0) {
            return m1534I(width, height, rational2);
        }
        return false;
    }

    /* renamed from: G */
    private boolean m1532G(int i10) {
        Integer num = (Integer) this.f1415e.m18192a(CameraCharacteristics.SENSOR_ORIENTATION);
        C0654h.m3468g(num, "Camera HAL in bad state, unable to retrieve the SENSOR_ORIENTATION");
        int m2053b = C0422b.m2053b(i10);
        Integer num2 = (Integer) this.f1415e.m18192a(CameraCharacteristics.LENS_FACING);
        C0654h.m3468g(num2, "Camera HAL in bad state, unable to retrieve the LENS_FACING");
        int m2052a = C0422b.m2052a(m2053b, num.intValue(), 1 == num2.intValue());
        return m2052a == 90 || m2052a == 270;
    }

    /* renamed from: H */
    private boolean m1533H() {
        Size size = (Size) this.f1415e.m18192a(CameraCharacteristics.SENSOR_INFO_PIXEL_ARRAY_SIZE);
        return size == null || size.getWidth() >= size.getHeight();
    }

    /* renamed from: I */
    private static boolean m1534I(int i10, int i11, Rational rational) {
        C0654h.m3462a(i11 % 16 == 0);
        double numerator = (i10 * rational.getNumerator()) / rational.getDenominator();
        return numerator > ((double) Math.max(0, i11 + (-16))) && numerator < ((double) (i11 + 16));
    }

    /* renamed from: J */
    private void m1535J() {
        this.f1425o.m1792e();
        if (this.f1423m == null) {
            m1544i();
        } else {
            this.f1423m = AbstractC5039i2.m19573a(this.f1423m.mo19548b(), this.f1425o.m1791d(), this.f1423m.mo19550d());
        }
    }

    /* renamed from: K */
    private void m1536K(List<Size> list, Size size) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        int i10 = -1;
        for (int i11 = 0; i11 < list.size(); i11++) {
            Size size2 = list.get(i11);
            if (size2.getWidth() < size.getWidth() || size2.getHeight() < size.getHeight()) {
                break;
            }
            if (i10 >= 0) {
                arrayList.add(list.get(i10));
            }
            i10 = i11;
        }
        list.removeAll(arrayList);
    }

    /* renamed from: a */
    private void m1537a() {
    }

    /* renamed from: c */
    private Size[] m1538c(int i10) {
        Size[] outputSizes;
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) this.f1415e.m18192a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        if (streamConfigurationMap != null) {
            if (Build.VERSION.SDK_INT < 23 && i10 == 34) {
                outputSizes = streamConfigurationMap.getOutputSizes(SurfaceTexture.class);
            } else {
                outputSizes = streamConfigurationMap.getOutputSizes(i10);
            }
            if (outputSizes != null) {
                Size[] m1539d = m1539d(outputSizes, i10);
                Arrays.sort(m1539d, new C0423c(true));
                return m1539d;
            }
            throw new IllegalArgumentException("Can not get supported output size for the format: " + i10);
        }
        throw new IllegalArgumentException("Can not retrieve SCALER_STREAM_CONFIGURATION_MAP");
    }

    /* renamed from: d */
    private Size[] m1539d(Size[] sizeArr, int i10) {
        List<Size> m1540e = m1540e(i10);
        ArrayList arrayList = new ArrayList(Arrays.asList(sizeArr));
        arrayList.removeAll(m1540e);
        return (Size[]) arrayList.toArray(new Size[0]);
    }

    /* renamed from: e */
    private List<Size> m1540e(int i10) {
        List<Size> list = this.f1420j.get(Integer.valueOf(i10));
        if (list != null) {
            return list;
        }
        List<Size> m18935a = this.f1416f.m18935a(i10);
        this.f1420j.put(Integer.valueOf(i10), m18935a);
        return m18935a;
    }

    /* renamed from: f */
    private Size m1541f(int i10) {
        Size size = this.f1412b.get(Integer.valueOf(i10));
        if (size != null) {
            return size;
        }
        Size m1560t = m1560t(i10);
        this.f1412b.put(Integer.valueOf(i10), m1560t);
        return m1560t;
    }

    /* renamed from: g */
    private Size m1542g(Size size, int i10) {
        return (size == null || !m1532G(i10)) ? size : new Size(size.getHeight(), size.getWidth());
    }

    /* renamed from: h */
    private void m1543h() {
        this.f1411a.addAll(m1557q());
        int i10 = this.f1418h;
        if (i10 == 0 || i10 == 1 || i10 == 3) {
            this.f1411a.addAll(m1559s());
        }
        int i11 = this.f1418h;
        if (i11 == 1 || i11 == 3) {
            this.f1411a.addAll(m1556p());
        }
        int[] iArr = (int[]) this.f1415e.m18192a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        if (iArr != null) {
            for (int i12 : iArr) {
                if (i12 == 3) {
                    this.f1421k = true;
                } else if (i12 == 6) {
                    this.f1422l = true;
                }
            }
        }
        if (this.f1421k) {
            this.f1411a.addAll(m1561u());
        }
        if (this.f1422l && this.f1418h == 0) {
            this.f1411a.addAll(m1555m());
        }
        if (this.f1418h == 3) {
            this.f1411a.addAll(m1558r());
        }
        this.f1411a.addAll(this.f1417g.m18936a(this.f1413c, this.f1418h));
    }

    /* renamed from: i */
    private void m1544i() {
        this.f1423m = AbstractC5039i2.m19573a(new Size(640, 480), this.f1425o.m1791d(), m1550v());
    }

    /* renamed from: j */
    private Size[] m1545j(int i10) {
        Size[] sizeArr = this.f1424n.get(Integer.valueOf(i10));
        if (sizeArr != null) {
            return sizeArr;
        }
        Size[] m1538c = m1538c(i10);
        this.f1424n.put(Integer.valueOf(i10), m1538c);
        return m1538c;
    }

    /* renamed from: k */
    private List<List<Size>> m1546k(List<List<Size>> list) {
        Iterator<List<Size>> it = list.iterator();
        int i10 = 1;
        while (it.hasNext()) {
            i10 *= it.next().size();
        }
        if (i10 != 0) {
            ArrayList arrayList = new ArrayList();
            for (int i11 = 0; i11 < i10; i11++) {
                arrayList.add(new ArrayList());
            }
            int size = i10 / list.get(0).size();
            int i12 = i10;
            for (int i13 = 0; i13 < list.size(); i13++) {
                List<Size> list2 = list.get(i13);
                for (int i14 = 0; i14 < i10; i14++) {
                    ((List) arrayList.get(i14)).add(list2.get((i14 % i12) / size));
                }
                if (i13 < list.size() - 1) {
                    i12 = size;
                    size /= list.get(i13 + 1).size();
                }
            }
            return arrayList;
        }
        throw new IllegalArgumentException("Failed to find supported resolutions.");
    }

    /* renamed from: l */
    private static int m1547l(Size size) {
        return size.getWidth() * size.getHeight();
    }

    /* renamed from: n */
    private AbstractC5035h2.b m1548n(int i10) {
        if (i10 == 35) {
            return AbstractC5035h2.b.YUV;
        }
        if (i10 == 256) {
            return AbstractC5035h2.b.JPEG;
        }
        if (i10 == 32) {
            return AbstractC5035h2.b.RAW;
        }
        return AbstractC5035h2.b.PRIV;
    }

    /* renamed from: o */
    private Size[] m1549o(int i10, InterfaceC5026f1 interfaceC5026f1) {
        Size[] sizeArr = null;
        List<Pair<Integer, Size[]>> mo19478k = interfaceC5026f1.mo19478k(null);
        if (mo19478k != null) {
            Iterator<Pair<Integer, Size[]>> it = mo19478k.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Pair<Integer, Size[]> next = it.next();
                if (((Integer) next.first).intValue() == i10) {
                    sizeArr = (Size[]) next.second;
                    break;
                }
            }
        }
        if (sizeArr == null) {
            return sizeArr;
        }
        Size[] m1539d = m1539d(sizeArr, i10);
        Arrays.sort(m1539d, new C0423c(true));
        return m1539d;
    }

    /* renamed from: v */
    private Size m1550v() {
        try {
            int parseInt = Integer.parseInt(this.f1413c);
            CamcorderProfile mo1335a = this.f1414d.mo1336b(parseInt, 1) ? this.f1414d.mo1335a(parseInt, 1) : null;
            if (mo1335a != null) {
                return new Size(mo1335a.videoFrameWidth, mo1335a.videoFrameHeight);
            }
            return m1551w(parseInt);
        } catch (NumberFormatException unused) {
            return m1552x();
        }
    }

    /* renamed from: w */
    private Size m1551w(int i10) {
        CamcorderProfile mo1335a;
        Size size = f1406t;
        if (this.f1414d.mo1336b(i10, 10)) {
            mo1335a = this.f1414d.mo1335a(i10, 10);
        } else if (this.f1414d.mo1336b(i10, 8)) {
            mo1335a = this.f1414d.mo1335a(i10, 8);
        } else if (this.f1414d.mo1336b(i10, 12)) {
            mo1335a = this.f1414d.mo1335a(i10, 12);
        } else if (this.f1414d.mo1336b(i10, 6)) {
            mo1335a = this.f1414d.mo1335a(i10, 6);
        } else if (this.f1414d.mo1336b(i10, 5)) {
            mo1335a = this.f1414d.mo1335a(i10, 5);
        } else {
            mo1335a = this.f1414d.mo1336b(i10, 4) ? this.f1414d.mo1335a(i10, 4) : null;
        }
        return mo1335a != null ? new Size(mo1335a.videoFrameWidth, mo1335a.videoFrameHeight) : size;
    }

    /* renamed from: x */
    private Size m1552x() {
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) this.f1415e.m18192a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        if (streamConfigurationMap != null) {
            Size[] outputSizes = streamConfigurationMap.getOutputSizes(MediaRecorder.class);
            if (outputSizes == null) {
                return f1406t;
            }
            Arrays.sort(outputSizes, new C0423c(true));
            for (Size size : outputSizes) {
                int width = size.getWidth();
                Size size2 = f1405s;
                if (width <= size2.getWidth() && size.getHeight() <= size2.getHeight()) {
                    return size;
                }
            }
            return f1406t;
        }
        throw new IllegalArgumentException("Can not retrieve SCALER_STREAM_CONFIGURATION_MAP");
    }

    /* renamed from: L */
    public AbstractC5035h2 m1553L(int i10, Size size) {
        AbstractC5035h2.b m1548n = m1548n(i10);
        AbstractC5035h2.a aVar = AbstractC5035h2.a.NOT_SUPPORT;
        Size m1541f = m1541f(i10);
        if (size.getWidth() * size.getHeight() <= this.f1423m.mo19548b().getWidth() * this.f1423m.mo19548b().getHeight()) {
            aVar = AbstractC5035h2.a.ANALYSIS;
        } else if (size.getWidth() * size.getHeight() <= this.f1423m.mo19549c().getWidth() * this.f1423m.mo19549c().getHeight()) {
            aVar = AbstractC5035h2.a.PREVIEW;
        } else if (size.getWidth() * size.getHeight() <= this.f1423m.mo19550d().getWidth() * this.f1423m.mo19550d().getHeight()) {
            aVar = AbstractC5035h2.a.RECORD;
        } else if (size.getWidth() * size.getHeight() <= m1541f.getWidth() * m1541f.getHeight()) {
            aVar = AbstractC5035h2.a.MAXIMUM;
        }
        return AbstractC5035h2.m19568a(m1548n, aVar);
    }

    /* renamed from: b */
    boolean m1554b(List<AbstractC5035h2> list) {
        Iterator<C5031g2> it = this.f1411a.iterator();
        boolean z10 = false;
        while (it.hasNext() && !(z10 = it.next().m19566d(list))) {
        }
        return z10;
    }

    /* renamed from: m */
    List<C5031g2> m1555m() {
        ArrayList arrayList = new ArrayList();
        C5031g2 c5031g2 = new C5031g2();
        AbstractC5035h2.b bVar = AbstractC5035h2.b.PRIV;
        AbstractC5035h2.a aVar = AbstractC5035h2.a.PREVIEW;
        c5031g2.m19565a(AbstractC5035h2.m19568a(bVar, aVar));
        AbstractC5035h2.a aVar2 = AbstractC5035h2.a.MAXIMUM;
        c5031g2.m19565a(AbstractC5035h2.m19568a(bVar, aVar2));
        arrayList.add(c5031g2);
        C5031g2 c5031g22 = new C5031g2();
        c5031g22.m19565a(AbstractC5035h2.m19568a(bVar, aVar));
        AbstractC5035h2.b bVar2 = AbstractC5035h2.b.YUV;
        c5031g22.m19565a(AbstractC5035h2.m19568a(bVar2, aVar2));
        arrayList.add(c5031g22);
        C5031g2 c5031g23 = new C5031g2();
        c5031g23.m19565a(AbstractC5035h2.m19568a(bVar2, aVar));
        c5031g23.m19565a(AbstractC5035h2.m19568a(bVar2, aVar2));
        arrayList.add(c5031g23);
        return arrayList;
    }

    /* renamed from: p */
    List<C5031g2> m1556p() {
        ArrayList arrayList = new ArrayList();
        C5031g2 c5031g2 = new C5031g2();
        AbstractC5035h2.b bVar = AbstractC5035h2.b.PRIV;
        AbstractC5035h2.a aVar = AbstractC5035h2.a.PREVIEW;
        c5031g2.m19565a(AbstractC5035h2.m19568a(bVar, aVar));
        AbstractC5035h2.a aVar2 = AbstractC5035h2.a.MAXIMUM;
        c5031g2.m19565a(AbstractC5035h2.m19568a(bVar, aVar2));
        arrayList.add(c5031g2);
        C5031g2 c5031g22 = new C5031g2();
        c5031g22.m19565a(AbstractC5035h2.m19568a(bVar, aVar));
        AbstractC5035h2.b bVar2 = AbstractC5035h2.b.YUV;
        c5031g22.m19565a(AbstractC5035h2.m19568a(bVar2, aVar2));
        arrayList.add(c5031g22);
        C5031g2 c5031g23 = new C5031g2();
        c5031g23.m19565a(AbstractC5035h2.m19568a(bVar2, aVar));
        c5031g23.m19565a(AbstractC5035h2.m19568a(bVar2, aVar2));
        arrayList.add(c5031g23);
        C5031g2 c5031g24 = new C5031g2();
        c5031g24.m19565a(AbstractC5035h2.m19568a(bVar, aVar));
        c5031g24.m19565a(AbstractC5035h2.m19568a(bVar, aVar));
        c5031g24.m19565a(AbstractC5035h2.m19568a(AbstractC5035h2.b.JPEG, aVar2));
        arrayList.add(c5031g24);
        C5031g2 c5031g25 = new C5031g2();
        AbstractC5035h2.a aVar3 = AbstractC5035h2.a.ANALYSIS;
        c5031g25.m19565a(AbstractC5035h2.m19568a(bVar2, aVar3));
        c5031g25.m19565a(AbstractC5035h2.m19568a(bVar, aVar));
        c5031g25.m19565a(AbstractC5035h2.m19568a(bVar2, aVar2));
        arrayList.add(c5031g25);
        C5031g2 c5031g26 = new C5031g2();
        c5031g26.m19565a(AbstractC5035h2.m19568a(bVar2, aVar3));
        c5031g26.m19565a(AbstractC5035h2.m19568a(bVar2, aVar));
        c5031g26.m19565a(AbstractC5035h2.m19568a(bVar2, aVar2));
        arrayList.add(c5031g26);
        return arrayList;
    }

    /* renamed from: q */
    List<C5031g2> m1557q() {
        ArrayList arrayList = new ArrayList();
        C5031g2 c5031g2 = new C5031g2();
        AbstractC5035h2.b bVar = AbstractC5035h2.b.PRIV;
        AbstractC5035h2.a aVar = AbstractC5035h2.a.MAXIMUM;
        c5031g2.m19565a(AbstractC5035h2.m19568a(bVar, aVar));
        arrayList.add(c5031g2);
        C5031g2 c5031g22 = new C5031g2();
        AbstractC5035h2.b bVar2 = AbstractC5035h2.b.JPEG;
        c5031g22.m19565a(AbstractC5035h2.m19568a(bVar2, aVar));
        arrayList.add(c5031g22);
        C5031g2 c5031g23 = new C5031g2();
        AbstractC5035h2.b bVar3 = AbstractC5035h2.b.YUV;
        c5031g23.m19565a(AbstractC5035h2.m19568a(bVar3, aVar));
        arrayList.add(c5031g23);
        C5031g2 c5031g24 = new C5031g2();
        AbstractC5035h2.a aVar2 = AbstractC5035h2.a.PREVIEW;
        c5031g24.m19565a(AbstractC5035h2.m19568a(bVar, aVar2));
        c5031g24.m19565a(AbstractC5035h2.m19568a(bVar2, aVar));
        arrayList.add(c5031g24);
        C5031g2 c5031g25 = new C5031g2();
        c5031g25.m19565a(AbstractC5035h2.m19568a(bVar3, aVar2));
        c5031g25.m19565a(AbstractC5035h2.m19568a(bVar2, aVar));
        arrayList.add(c5031g25);
        C5031g2 c5031g26 = new C5031g2();
        c5031g26.m19565a(AbstractC5035h2.m19568a(bVar, aVar2));
        c5031g26.m19565a(AbstractC5035h2.m19568a(bVar, aVar2));
        arrayList.add(c5031g26);
        C5031g2 c5031g27 = new C5031g2();
        c5031g27.m19565a(AbstractC5035h2.m19568a(bVar, aVar2));
        c5031g27.m19565a(AbstractC5035h2.m19568a(bVar3, aVar2));
        arrayList.add(c5031g27);
        C5031g2 c5031g28 = new C5031g2();
        c5031g28.m19565a(AbstractC5035h2.m19568a(bVar, aVar2));
        c5031g28.m19565a(AbstractC5035h2.m19568a(bVar3, aVar2));
        c5031g28.m19565a(AbstractC5035h2.m19568a(bVar2, aVar));
        arrayList.add(c5031g28);
        return arrayList;
    }

    /* renamed from: r */
    List<C5031g2> m1558r() {
        ArrayList arrayList = new ArrayList();
        C5031g2 c5031g2 = new C5031g2();
        AbstractC5035h2.b bVar = AbstractC5035h2.b.PRIV;
        AbstractC5035h2.a aVar = AbstractC5035h2.a.PREVIEW;
        c5031g2.m19565a(AbstractC5035h2.m19568a(bVar, aVar));
        AbstractC5035h2.a aVar2 = AbstractC5035h2.a.ANALYSIS;
        c5031g2.m19565a(AbstractC5035h2.m19568a(bVar, aVar2));
        AbstractC5035h2.b bVar2 = AbstractC5035h2.b.YUV;
        AbstractC5035h2.a aVar3 = AbstractC5035h2.a.MAXIMUM;
        c5031g2.m19565a(AbstractC5035h2.m19568a(bVar2, aVar3));
        AbstractC5035h2.b bVar3 = AbstractC5035h2.b.RAW;
        c5031g2.m19565a(AbstractC5035h2.m19568a(bVar3, aVar3));
        arrayList.add(c5031g2);
        C5031g2 c5031g22 = new C5031g2();
        c5031g22.m19565a(AbstractC5035h2.m19568a(bVar, aVar));
        c5031g22.m19565a(AbstractC5035h2.m19568a(bVar, aVar2));
        c5031g22.m19565a(AbstractC5035h2.m19568a(AbstractC5035h2.b.JPEG, aVar3));
        c5031g22.m19565a(AbstractC5035h2.m19568a(bVar3, aVar3));
        arrayList.add(c5031g22);
        return arrayList;
    }

    /* renamed from: s */
    List<C5031g2> m1559s() {
        ArrayList arrayList = new ArrayList();
        C5031g2 c5031g2 = new C5031g2();
        AbstractC5035h2.b bVar = AbstractC5035h2.b.PRIV;
        AbstractC5035h2.a aVar = AbstractC5035h2.a.PREVIEW;
        c5031g2.m19565a(AbstractC5035h2.m19568a(bVar, aVar));
        AbstractC5035h2.a aVar2 = AbstractC5035h2.a.RECORD;
        c5031g2.m19565a(AbstractC5035h2.m19568a(bVar, aVar2));
        arrayList.add(c5031g2);
        C5031g2 c5031g22 = new C5031g2();
        c5031g22.m19565a(AbstractC5035h2.m19568a(bVar, aVar));
        AbstractC5035h2.b bVar2 = AbstractC5035h2.b.YUV;
        c5031g22.m19565a(AbstractC5035h2.m19568a(bVar2, aVar2));
        arrayList.add(c5031g22);
        C5031g2 c5031g23 = new C5031g2();
        c5031g23.m19565a(AbstractC5035h2.m19568a(bVar2, aVar));
        c5031g23.m19565a(AbstractC5035h2.m19568a(bVar2, aVar2));
        arrayList.add(c5031g23);
        C5031g2 c5031g24 = new C5031g2();
        c5031g24.m19565a(AbstractC5035h2.m19568a(bVar, aVar));
        c5031g24.m19565a(AbstractC5035h2.m19568a(bVar, aVar2));
        AbstractC5035h2.b bVar3 = AbstractC5035h2.b.JPEG;
        c5031g24.m19565a(AbstractC5035h2.m19568a(bVar3, aVar2));
        arrayList.add(c5031g24);
        C5031g2 c5031g25 = new C5031g2();
        c5031g25.m19565a(AbstractC5035h2.m19568a(bVar, aVar));
        c5031g25.m19565a(AbstractC5035h2.m19568a(bVar2, aVar2));
        c5031g25.m19565a(AbstractC5035h2.m19568a(bVar3, aVar2));
        arrayList.add(c5031g25);
        C5031g2 c5031g26 = new C5031g2();
        c5031g26.m19565a(AbstractC5035h2.m19568a(bVar2, aVar));
        c5031g26.m19565a(AbstractC5035h2.m19568a(bVar2, aVar));
        c5031g26.m19565a(AbstractC5035h2.m19568a(bVar3, AbstractC5035h2.a.MAXIMUM));
        arrayList.add(c5031g26);
        return arrayList;
    }

    /* renamed from: t */
    Size m1560t(int i10) {
        return (Size) Collections.max(Arrays.asList(m1545j(i10)), new C0423c());
    }

    /* renamed from: u */
    List<C5031g2> m1561u() {
        ArrayList arrayList = new ArrayList();
        C5031g2 c5031g2 = new C5031g2();
        AbstractC5035h2.b bVar = AbstractC5035h2.b.RAW;
        AbstractC5035h2.a aVar = AbstractC5035h2.a.MAXIMUM;
        c5031g2.m19565a(AbstractC5035h2.m19568a(bVar, aVar));
        arrayList.add(c5031g2);
        C5031g2 c5031g22 = new C5031g2();
        AbstractC5035h2.b bVar2 = AbstractC5035h2.b.PRIV;
        AbstractC5035h2.a aVar2 = AbstractC5035h2.a.PREVIEW;
        c5031g22.m19565a(AbstractC5035h2.m19568a(bVar2, aVar2));
        c5031g22.m19565a(AbstractC5035h2.m19568a(bVar, aVar));
        arrayList.add(c5031g22);
        C5031g2 c5031g23 = new C5031g2();
        AbstractC5035h2.b bVar3 = AbstractC5035h2.b.YUV;
        c5031g23.m19565a(AbstractC5035h2.m19568a(bVar3, aVar2));
        c5031g23.m19565a(AbstractC5035h2.m19568a(bVar, aVar));
        arrayList.add(c5031g23);
        C5031g2 c5031g24 = new C5031g2();
        c5031g24.m19565a(AbstractC5035h2.m19568a(bVar2, aVar2));
        c5031g24.m19565a(AbstractC5035h2.m19568a(bVar2, aVar2));
        c5031g24.m19565a(AbstractC5035h2.m19568a(bVar, aVar));
        arrayList.add(c5031g24);
        C5031g2 c5031g25 = new C5031g2();
        c5031g25.m19565a(AbstractC5035h2.m19568a(bVar2, aVar2));
        c5031g25.m19565a(AbstractC5035h2.m19568a(bVar3, aVar2));
        c5031g25.m19565a(AbstractC5035h2.m19568a(bVar, aVar));
        arrayList.add(c5031g25);
        C5031g2 c5031g26 = new C5031g2();
        c5031g26.m19565a(AbstractC5035h2.m19568a(bVar3, aVar2));
        c5031g26.m19565a(AbstractC5035h2.m19568a(bVar3, aVar2));
        c5031g26.m19565a(AbstractC5035h2.m19568a(bVar, aVar));
        arrayList.add(c5031g26);
        C5031g2 c5031g27 = new C5031g2();
        c5031g27.m19565a(AbstractC5035h2.m19568a(bVar2, aVar2));
        AbstractC5035h2.b bVar4 = AbstractC5035h2.b.JPEG;
        c5031g27.m19565a(AbstractC5035h2.m19568a(bVar4, aVar));
        c5031g27.m19565a(AbstractC5035h2.m19568a(bVar, aVar));
        arrayList.add(c5031g27);
        C5031g2 c5031g28 = new C5031g2();
        c5031g28.m19565a(AbstractC5035h2.m19568a(bVar3, aVar2));
        c5031g28.m19565a(AbstractC5035h2.m19568a(bVar4, aVar));
        c5031g28.m19565a(AbstractC5035h2.m19568a(bVar, aVar));
        arrayList.add(c5031g28);
        return arrayList;
    }

    /* renamed from: y */
    public Map<InterfaceC5063o2<?>, Size> m1562y(List<AbstractC5035h2> list, List<InterfaceC5063o2<?>> list2) {
        m1535J();
        ArrayList arrayList = new ArrayList(list);
        Iterator<InterfaceC5063o2<?>> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(m1553L(it.next().mo1374q(), new Size(640, 480)));
        }
        if (m1554b(arrayList)) {
            List<Integer> m1528C = m1528C(list2);
            ArrayList arrayList2 = new ArrayList();
            Iterator<Integer> it2 = m1528C.iterator();
            while (it2.hasNext()) {
                arrayList2.add(m1563z(list2.get(it2.next().intValue())));
            }
            HashMap hashMap = null;
            Iterator<List<Size>> it3 = m1546k(arrayList2).iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                List<Size> next = it3.next();
                ArrayList arrayList3 = new ArrayList(list);
                for (int i10 = 0; i10 < next.size(); i10++) {
                    arrayList3.add(m1553L(list2.get(m1528C.get(i10).intValue()).mo1374q(), next.get(i10)));
                }
                if (m1554b(arrayList3)) {
                    hashMap = new HashMap();
                    for (InterfaceC5063o2<?> interfaceC5063o2 : list2) {
                        hashMap.put(interfaceC5063o2, next.get(m1528C.indexOf(Integer.valueOf(list2.indexOf(interfaceC5063o2)))));
                    }
                }
            }
            if (hashMap != null) {
                return hashMap;
            }
            throw new IllegalArgumentException("No supported surface combination is found for camera device - Id : " + this.f1413c + " and Hardware level: " + this.f1418h + ". May be the specified resolution is too large and not supported. Existing surfaces: " + list + " New configs: " + list2);
        }
        throw new IllegalArgumentException("No supported surface combination is found for camera device - Id : " + this.f1413c + ".  May be attempting to bind too many use cases. Existing surfaces: " + list + " New configs: " + list2);
    }

    /* renamed from: z */
    List<Size> m1563z(InterfaceC5063o2<?> interfaceC5063o2) {
        int mo1374q = interfaceC5063o2.mo1374q();
        InterfaceC5026f1 interfaceC5026f1 = (InterfaceC5026f1) interfaceC5063o2;
        Size[] m1549o = m1549o(mo1374q, interfaceC5026f1);
        if (m1549o == null) {
            m1549o = m1545j(mo1374q);
        }
        ArrayList arrayList = new ArrayList();
        Size mo19477f = interfaceC5026f1.mo19477f(null);
        Size m1560t = m1560t(mo1374q);
        if (mo19477f == null || m1547l(m1560t) < m1547l(mo19477f)) {
            mo19477f = m1560t;
        }
        Arrays.sort(m1549o, new C0423c(true));
        Size m1527B = m1527B(interfaceC5026f1);
        Size size = f1403q;
        int m1547l = m1547l(size);
        if (m1547l(mo19477f) < m1547l) {
            size = f1404r;
        } else if (m1527B != null && m1547l(m1527B) < m1547l) {
            size = m1527B;
        }
        for (Size size2 : m1549o) {
            if (m1547l(size2) <= m1547l(mo19477f) && m1547l(size2) >= m1547l(size) && !arrayList.contains(size2)) {
                arrayList.add(size2);
            }
        }
        if (!arrayList.isEmpty()) {
            Rational m1526A = m1526A(interfaceC5026f1);
            if (m1527B == null) {
                m1527B = interfaceC5026f1.mo19481u(null);
            }
            ArrayList arrayList2 = new ArrayList();
            new HashMap();
            if (m1526A == null) {
                arrayList2.addAll(arrayList);
                if (m1527B != null) {
                    m1536K(arrayList2, m1527B);
                }
            } else {
                Map<Rational, List<Size>> m1529D = m1529D(arrayList);
                if (m1527B != null) {
                    Iterator<Rational> it = m1529D.keySet().iterator();
                    while (it.hasNext()) {
                        m1536K(m1529D.get(it.next()), m1527B);
                    }
                }
                ArrayList arrayList3 = new ArrayList(m1529D.keySet());
                Collections.sort(arrayList3, new a(m1526A));
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    for (Size size3 : m1529D.get((Rational) it2.next())) {
                        if (!arrayList2.contains(size3)) {
                            arrayList2.add(size3);
                        }
                    }
                }
            }
            return this.f1426p.m18952a(m1548n(interfaceC5063o2.mo1374q()), arrayList2);
        }
        throw new IllegalArgumentException("Can not get supported output size under supported maximum for the format: " + mo1374q);
    }
}
