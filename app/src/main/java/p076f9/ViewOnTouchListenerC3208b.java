package p076f9;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.hardware.input.InputManager;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.util.SparseArray;
import android.view.GestureDetector;
import android.view.InputDevice;
import android.view.MotionEvent;
import android.view.OrientationEventListener;
import android.view.SurfaceView;
import android.view.View;
import android.view.WindowManager;
import com.roblox.engine.jni.NativeInputInterface;
import com.roblox.engine.jni.NativeSettingsInterface;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import p033c7.C1134c;
import p035c9.C1151k;
import p076f9.C3209c;
import p076f9.C3210d;

/* renamed from: f9.b */
/* loaded from: classes.dex */
public class ViewOnTouchListenerC3208b implements View.OnTouchListener, C3209c.a, C3210d.a, SensorEventListener {

    /* renamed from: J */
    private InputManager f13450J;

    /* renamed from: K */
    private final Activity f13451K;

    /* renamed from: L */
    private e f13452L;

    /* renamed from: N */
    private boolean f13454N;

    /* renamed from: n */
    private SurfaceView f13456n;

    /* renamed from: o */
    private boolean f13457o;

    /* renamed from: p */
    private GestureDetector f13458p;

    /* renamed from: q */
    private f f13459q;

    /* renamed from: r */
    private C3209c f13460r;

    /* renamed from: s */
    private C3210d f13461s;

    /* renamed from: u */
    private SensorManager f13463u;

    /* renamed from: v */
    private Sensor f13464v;

    /* renamed from: w */
    private Sensor f13465w;

    /* renamed from: x */
    private OrientationEventListener f13466x;

    /* renamed from: y */
    private ViewOnLayoutChangeListenerC3212f f13467y;

    /* renamed from: t */
    private SparseArray<h> f13462t = new SparseArray<>();

    /* renamed from: z */
    private boolean f13468z = false;

    /* renamed from: A */
    private float f13441A = 0.0f;

    /* renamed from: B */
    private float f13442B = 0.0f;

    /* renamed from: C */
    private final float[] f13443C = new float[4];

    /* renamed from: D */
    private final float[] f13444D = new float[9];

    /* renamed from: E */
    private final float[] f13445E = new float[3];

    /* renamed from: F */
    private final float[] f13446F = new float[3];

    /* renamed from: G */
    private final float[] f13447G = new float[3];

    /* renamed from: H */
    private final SparseArray f13448H = new SparseArray();

    /* renamed from: I */
    private final Handler f13449I = new g(this);

    /* renamed from: M */
    private AtomicBoolean f13453M = new AtomicBoolean(false);

    /* renamed from: O */
    private final List<Integer> f13455O = new ArrayList();

    /* renamed from: f9.b$a */
    /* loaded from: classes.dex */
    class a extends ViewOnLayoutChangeListenerC3212f {
        a(Activity activity) {
            super(activity);
        }

        @Override // p076f9.ViewOnLayoutChangeListenerC3212f
        /* renamed from: b */
        protected void mo14230b(int i10) {
            C1151k.m6707a("rbx.game.orientation", "Layout orientation changed. newRotation = " + i10);
            ViewOnTouchListenerC3208b.this.m14219v();
        }
    }

    /* renamed from: f9.b$b */
    /* loaded from: classes.dex */
    class b extends OrientationEventListener {
        b(Context context, int i10) {
            super(context, i10);
        }

        @Override // android.view.OrientationEventListener
        public void onOrientationChanged(int i10) {
            ViewOnTouchListenerC3208b.this.m14219v();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f9.b$c */
    /* loaded from: classes.dex */
    public class c implements View.OnKeyListener {
        c() {
        }

        /* JADX WARN: Failed to find 'out' block for switch in B:11:0x0016. Please report as an issue. */
        /* JADX WARN: Removed duplicated region for block: B:21:0x005f  */
        @Override // android.view.View.OnKeyListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean onKey(android.view.View r6, int r7, android.view.KeyEvent r8) {
            /*
                r5 = this;
                r6 = 82
                r0 = 1
                r1 = 0
                if (r7 == r6) goto L1d
                r6 = 96
                if (r7 == r6) goto L46
                r6 = 97
                if (r7 == r6) goto L46
                r6 = 99
                if (r7 == r6) goto L46
                r6 = 100
                if (r7 == r6) goto L46
                switch(r7) {
                    case 19: goto L46;
                    case 20: goto L46;
                    case 21: goto L46;
                    case 22: goto L46;
                    default: goto L19;
                }
            L19:
                switch(r7) {
                    case 102: goto L46;
                    case 103: goto L46;
                    case 104: goto L46;
                    case 105: goto L46;
                    case 106: goto L46;
                    case 107: goto L46;
                    case 108: goto L46;
                    case 109: goto L46;
                    default: goto L1c;
                }
            L1c:
                goto L73
            L1d:
                android.view.InputDevice r2 = r8.getDevice()
                if (r2 != 0) goto L24
                return r1
            L24:
                r3 = 16778257(0x1000411, float:2.3512805E-38)
                int r4 = r2.getSources()
                r4 = r4 & r3
                if (r4 != r3) goto L30
                r3 = 1
                goto L31
            L30:
                r3 = 0
            L31:
                r4 = 108(0x6c, float:1.51E-43)
                if (r3 == 0) goto L43
                int[] r3 = new int[r0]
                r3[r1] = r4
                boolean[] r2 = r2.hasKeys(r3)
                boolean r2 = r2[r1]
                if (r2 != 0) goto L43
                r7 = 108(0x6c, float:1.51E-43)
            L43:
                if (r7 != r6) goto L46
                return r1
            L46:
                int r6 = r8.getSource()
                r2 = 1025(0x401, float:1.436E-42)
                r6 = r6 & r2
                if (r6 == r2) goto L5c
                int r6 = r8.getSource()
                r2 = 16777232(0x1000010, float:2.3509932E-38)
                r6 = r6 & r2
                if (r6 != r2) goto L5a
                goto L5c
            L5a:
                r6 = 0
                goto L5d
            L5c:
                r6 = 1
            L5d:
                if (r6 == 0) goto L73
                int r6 = r8.getAction()
                if (r6 != 0) goto L66
                r1 = 1
            L66:
                int r6 = r8.getDeviceId()
                f9.b r8 = p076f9.ViewOnTouchListenerC3208b.this
                p076f9.ViewOnTouchListenerC3208b.m14209d(r8, r6)
                com.roblox.engine.jni.NativeInputInterface.nativeGamepadButtonEvent(r6, r7, r1)
                goto L74
            L73:
                r0 = 0
            L74:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p076f9.ViewOnTouchListenerC3208b.c.onKey(android.view.View, int, android.view.KeyEvent):boolean");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f9.b$d */
    /* loaded from: classes.dex */
    public class d implements View.OnGenericMotionListener {

        /* renamed from: a */
        float[] f13472a = new float[8];

        d() {
        }

        /* renamed from: a */
        private float m14231a(MotionEvent motionEvent, InputDevice inputDevice, int i10, int i11) {
            InputDevice.MotionRange motionRange = inputDevice.getMotionRange(i10, motionEvent.getSource());
            if (motionRange == null) {
                return 0.0f;
            }
            float flat = motionRange.getFlat();
            float axisValue = i11 < 0 ? motionEvent.getAxisValue(i10) : motionEvent.getHistoricalAxisValue(i10, i11);
            if (Math.abs(axisValue) > flat) {
                return axisValue;
            }
            return 0.0f;
        }

        /* renamed from: b */
        private void m14232b(MotionEvent motionEvent, int i10) {
            InputDevice device = motionEvent.getDevice();
            if (device == null) {
                return;
            }
            this.f13472a[0] = m14231a(motionEvent, device, 0, i10);
            this.f13472a[1] = m14231a(motionEvent, device, 1, i10);
            this.f13472a[2] = m14231a(motionEvent, device, 11, i10);
            this.f13472a[3] = m14231a(motionEvent, device, 14, i10);
            this.f13472a[4] = Math.max(m14231a(motionEvent, device, 17, i10), m14231a(motionEvent, device, 23, i10));
            this.f13472a[5] = Math.max(m14231a(motionEvent, device, 18, i10), m14231a(motionEvent, device, 22, i10));
            this.f13472a[6] = m14231a(motionEvent, device, 15, i10);
            this.f13472a[7] = m14231a(motionEvent, device, 16, i10);
        }

        @Override // android.view.View.OnGenericMotionListener
        public boolean onGenericMotion(View view, MotionEvent motionEvent) {
            if ((motionEvent.getSource() & 8194) != 8194 && (motionEvent.getSource() & 1048584) != 1048584) {
                if ((motionEvent.getSource() & 1025) != 1025 && (motionEvent.getSource() & 16777232) != 16777232) {
                    return false;
                }
                int historySize = motionEvent.getHistorySize();
                for (int i10 = 0; i10 < historySize; i10++) {
                    m14232b(motionEvent, i10);
                }
                m14232b(motionEvent, -1);
                int deviceId = motionEvent.getDeviceId();
                ViewOnTouchListenerC3208b.this.m14213h(deviceId);
                int i11 = 0;
                while (true) {
                    float[] fArr = this.f13472a;
                    if (i11 >= fArr.length) {
                        return true;
                    }
                    switch (i11) {
                        case 0:
                            NativeInputInterface.nativeGamepadAxisEvent(deviceId, 0, fArr[0], -fArr[1], 0.0f);
                            break;
                        case 1:
                            NativeInputInterface.nativeGamepadAxisEvent(deviceId, 1, fArr[0], -fArr[1], 0.0f);
                            break;
                        case 2:
                            NativeInputInterface.nativeGamepadAxisEvent(deviceId, 11, fArr[2], -fArr[3], 0.0f);
                            break;
                        case 3:
                            NativeInputInterface.nativeGamepadAxisEvent(deviceId, 14, fArr[2], -fArr[3], 0.0f);
                            break;
                        case 4:
                            NativeInputInterface.nativeGamepadAxisEvent(deviceId, 17, 0.0f, 0.0f, fArr[4]);
                            break;
                        case 5:
                            NativeInputInterface.nativeGamepadAxisEvent(deviceId, 18, 0.0f, 0.0f, fArr[5]);
                            break;
                        case 6:
                            NativeInputInterface.nativeGamepadAxisEvent(deviceId, 15, 0.0f, 0.0f, fArr[6]);
                            break;
                        case 7:
                            NativeInputInterface.nativeGamepadAxisEvent(deviceId, 16, 0.0f, 0.0f, -fArr[7]);
                            break;
                    }
                    i11++;
                }
            } else {
                return ViewOnTouchListenerC3208b.this.m14222l(motionEvent);
            }
        }
    }

    /* renamed from: f9.b$e */
    /* loaded from: classes.dex */
    public interface e {
        /* renamed from: a */
        boolean mo12553a();

        /* renamed from: d */
        float mo12532d();
    }

    /* renamed from: f9.b$g */
    /* loaded from: classes.dex */
    static class g extends Handler {

        /* renamed from: a */
        private final WeakReference f13481a;

        g(ViewOnTouchListenerC3208b viewOnTouchListenerC3208b) {
            this.f13481a = new WeakReference(viewOnTouchListenerC3208b);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            ViewOnTouchListenerC3208b viewOnTouchListenerC3208b;
            if (message.what == 101 && (viewOnTouchListenerC3208b = (ViewOnTouchListenerC3208b) this.f13481a.get()) != null) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                int size = viewOnTouchListenerC3208b.f13448H.size();
                for (int i10 = 0; i10 < size; i10++) {
                    long[] jArr = (long[]) viewOnTouchListenerC3208b.f13448H.valueAt(i10);
                    if (jArr != null && elapsedRealtime - jArr[0] > 3000) {
                        int keyAt = viewOnTouchListenerC3208b.f13448H.keyAt(i10);
                        if (InputDevice.getDevice(keyAt) == null) {
                            NativeInputInterface.nativeGamepadDisconnectEvent(keyAt);
                            viewOnTouchListenerC3208b.f13448H.remove(keyAt);
                        } else {
                            jArr[0] = elapsedRealtime;
                        }
                    }
                }
                sendEmptyMessageDelayed(101, 3000L);
            }
        }
    }

    /* renamed from: f9.b$h */
    /* loaded from: classes.dex */
    class h {

        /* renamed from: a */
        private float f13482a;

        /* renamed from: b */
        private float f13483b;

        /* renamed from: c */
        private int f13484c;

        /* renamed from: d */
        float f13485d;

        /* renamed from: e */
        float f13486e;

        /* renamed from: f */
        int f13487f;

        h() {
        }

        /* renamed from: a */
        public int m14234a() {
            return this.f13484c;
        }

        /* renamed from: b */
        public float m14235b() {
            return this.f13482a;
        }

        /* renamed from: c */
        public float m14236c() {
            return this.f13483b;
        }

        /* renamed from: d */
        public void m14237d(int i10) {
            this.f13487f = this.f13484c;
            this.f13484c = i10;
        }

        /* renamed from: e */
        public void m14238e(float f10) {
            this.f13485d = this.f13482a;
            this.f13482a = f10;
        }

        /* renamed from: f */
        public void m14239f(float f10) {
            this.f13486e = this.f13483b;
            this.f13483b = f10;
        }
    }

    public ViewOnTouchListenerC3208b(Activity activity, SurfaceView surfaceView, e eVar) {
        a aVar = null;
        this.f13456n = null;
        this.f13457o = true;
        this.f13458p = null;
        this.f13459q = null;
        this.f13460r = null;
        this.f13461s = null;
        this.f13463u = null;
        this.f13464v = null;
        this.f13465w = null;
        this.f13466x = null;
        this.f13467y = null;
        this.f13456n = surfaceView;
        this.f13451K = activity;
        boolean hasSystemFeature = activity.getPackageManager().hasSystemFeature("android.hardware.touchscreen");
        this.f13457o = hasSystemFeature;
        this.f13452L = eVar;
        if (hasSystemFeature) {
            this.f13459q = new f(this, aVar);
            this.f13458p = new GestureDetector(activity, this.f13459q);
            this.f13460r = new C3209c(this);
            this.f13461s = new C3210d(this);
        }
        m14218s(surfaceView);
        this.f13463u = (SensorManager) activity.getBaseContext().getSystemService("sensor");
        this.f13450J = (InputManager) activity.getBaseContext().getSystemService("input");
        this.f13464v = this.f13463u.getDefaultSensor(1);
        Sensor defaultSensor = this.f13463u.getDefaultSensor(11);
        this.f13465w = defaultSensor;
        if (defaultSensor != null) {
            NativeInputInterface.nativeSetGyroscopeEnabled(true);
        }
        if (this.f13464v != null) {
            NativeInputInterface.nativeSetAccelerometerEnabled(true);
        }
        if (C1134c.m6537a().mo6615i()) {
            this.f13467y = new a(activity);
            return;
        }
        b bVar = new b(activity, 3);
        this.f13466x = bVar;
        if (bVar.canDetectOrientation()) {
            this.f13466x.enable();
        }
    }

    /* renamed from: g */
    public static float[] m14212g(int i10, float[] fArr) {
        int[] iArr = new int[][]{new int[]{1, -1, 0, 1}, new int[]{-1, -1, 1, 0}, new int[]{-1, 1, 0, 1}, new int[]{1, 1, 1, 0}}[i10];
        return new float[]{iArr[0] * fArr[iArr[2]], iArr[1] * fArr[iArr[3]], fArr[2]};
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public void m14213h(int i10) {
        long[] jArr = (long[]) this.f13448H.get(i10);
        if (jArr == null) {
            jArr = new long[1];
            this.f13448H.put(i10, jArr);
            m14217r(i10);
            NativeInputInterface.nativeGamepadConnectEvent(i10);
        }
        jArr[0] = SystemClock.elapsedRealtime();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public float m14214i() {
        e eVar = this.f13452L;
        if (eVar != null) {
            return eVar.mo12532d();
        }
        return 1.0f;
    }

    /* renamed from: j */
    private boolean[] m14215j(int i10) {
        boolean[] zArr = new boolean[14];
        int[] iArr = {96, 97, 99, 100, 19, 20, 21, 22, 103, 102, 106, 107, 109, 108};
        InputDevice inputDevice = this.f13450J.getInputDevice(i10);
        return inputDevice != null ? inputDevice.hasKeys(iArr) : zArr;
    }

    /* renamed from: k */
    private boolean m14216k() {
        if (!this.f13453M.getAndSet(true)) {
            this.f13454N = NativeSettingsInterface.nativeGetFFlag("EnableCancelInputEvent");
        }
        return this.f13454N;
    }

    /* renamed from: r */
    private void m14217r(int i10) {
        int i11;
        boolean[] m14215j = m14215j(i10);
        HashMap hashMap = new HashMap();
        for (int i12 = 0; i12 < 14; i12++) {
            switch (i12) {
                case 0:
                    i11 = 96;
                    break;
                case 1:
                    i11 = 97;
                    break;
                case 2:
                    i11 = 99;
                    break;
                case 3:
                    i11 = 100;
                    break;
                case 4:
                    i11 = 19;
                    break;
                case 5:
                    i11 = 20;
                    break;
                case 6:
                    i11 = 21;
                    break;
                case 7:
                    i11 = 22;
                    break;
                case 8:
                    i11 = 103;
                    break;
                case 9:
                    i11 = 102;
                    break;
                case 10:
                    i11 = 106;
                    break;
                case 11:
                    i11 = 107;
                    break;
                case 12:
                    i11 = 109;
                    break;
                case 13:
                    i11 = 108;
                    break;
                default:
                    i11 = 0;
                    break;
            }
            if (i12 < m14215j.length) {
                hashMap.put(i11, Boolean.valueOf(m14215j[i12]));
            } else {
                hashMap.put(i11, Boolean.FALSE);
            }
        }
        Boolean bool = Boolean.FALSE;
        hashMap.put(0, bool);
        hashMap.put(1, bool);
        hashMap.put(11, bool);
        hashMap.put(14, bool);
        hashMap.put(23, bool);
        hashMap.put(22, bool);
        hashMap.put(17, bool);
        hashMap.put(18, bool);
        hashMap.put(15, bool);
        hashMap.put(16, bool);
        InputDevice device = InputDevice.getDevice(i10);
        if (device != null) {
            Iterator<InputDevice.MotionRange> it = device.getMotionRanges().iterator();
            while (it.hasNext()) {
                hashMap.put(Integer.valueOf(it.next().getAxis()), Boolean.TRUE);
            }
        }
        Iterator it2 = hashMap.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            NativeInputInterface.nativeSetGamepadSupportedKey(i10, ((Integer) entry.getKey()).intValue(), ((Boolean) entry.getValue()).booleanValue());
            it2.remove();
        }
    }

    /* renamed from: s */
    private void m14218s(SurfaceView surfaceView) {
        this.f13449I.sendEmptyMessageDelayed(101, 3000L);
        surfaceView.setOnKeyListener(new c());
        surfaceView.setOnGenericMotionListener(new d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v */
    public void m14219v() {
        Activity activity = this.f13451K;
        if (activity == null) {
            return;
        }
        WindowManager windowManager = activity.getWindowManager();
        int rotation = windowManager.getDefaultDisplay().getRotation();
        int i10 = 0;
        Point point = new Point(0, 0);
        windowManager.getDefaultDisplay().getSize(point);
        if (point.x < point.y) {
            i10 = 3;
        } else if (rotation == 0 || rotation == 2 ? rotation != 2 : rotation != 3) {
            i10 = 1;
        }
        NativeInputInterface.nativeUpdateScreenOrientation(i10);
    }

    @Override // p076f9.C3209c.a
    /* renamed from: a */
    public void mo14220a(C3209c c3209c) {
        float m14241b = c3209c.m14241b();
        int m14244e = c3209c.m14244e();
        Point m14242c = c3209c.m14242c();
        Point m14243d = c3209c.m14243d();
        NativeInputInterface.nativePassRotateGesture(m14244e, m14241b, 0.0f, m14242c.x, m14242c.y, m14243d.x, m14243d.y);
    }

    @Override // p076f9.C3210d.a
    /* renamed from: b */
    public void mo14221b(C3210d c3210d) {
        Point m14247a = c3210d.m14247a();
        Point m14248b = c3210d.m14248b();
        float m14249c = c3210d.m14249c();
        int m14250d = c3210d.m14250d();
        float m14214i = m14214i();
        NativeInputInterface.nativePassPinchGesture(m14250d, m14249c, 0.0f, (int) (m14247a.x / m14214i), (int) (m14247a.y / m14214i), (int) (m14248b.x / m14214i), (int) (m14248b.y / m14214i));
    }

    @TargetApi(23)
    /* renamed from: l */
    public boolean m14222l(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() != 7 && motionEvent.getActionMasked() != 2) {
            if (motionEvent.getActionMasked() == 11) {
                NativeInputInterface.nativePassMouseButton(this.f13441A, this.f13442B, true, motionEvent.getActionButton() - 1);
                return true;
            }
            if (motionEvent.getActionMasked() == 12) {
                NativeInputInterface.nativePassMouseButton(this.f13441A, this.f13442B, false, motionEvent.getActionButton() - 1);
                return true;
            }
            if (motionEvent.getActionMasked() != 8) {
                return motionEvent.getActionMasked() == 0;
            }
            NativeInputInterface.nativePassMouseWheel(this.f13441A, this.f13442B, motionEvent.getAxisValue(9));
            return true;
        }
        float x10 = motionEvent.getX() / m14214i();
        float y10 = motionEvent.getY() / m14214i();
        float f10 = x10 - this.f13441A;
        float f11 = y10 - this.f13442B;
        this.f13441A = x10;
        this.f13442B = y10;
        NativeInputInterface.nativePassMouseMove(x10, y10, f10, f11);
        return true;
    }

    /* renamed from: m */
    public void m14223m(int i10, int i11) {
        NativeInputInterface.nativePassSwipeGesture(1, i10, i11);
    }

    /* renamed from: n */
    public void m14224n(int i10, int i11) {
        NativeInputInterface.nativePassSwipeGesture(2, i10, i11);
    }

    /* renamed from: o */
    public void m14225o(int i10, int i11) {
        NativeInputInterface.nativePassSwipeGesture(0, i10, i11);
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i10) {
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        int rotation = ((WindowManager) this.f13451K.getBaseContext().getSystemService("window")).getDefaultDisplay().getRotation();
        if (sensorEvent.sensor.getType() == 11) {
            SensorManager.getQuaternionFromVector(this.f13443C, m14212g(rotation, sensorEvent.values));
            SensorManager.getRotationMatrixFromVector(this.f13444D, this.f13443C);
            SensorManager.getOrientation(this.f13444D, this.f13445E);
            float[] fArr = this.f13445E;
            float f10 = fArr[0];
            float f11 = fArr[1];
            float f12 = fArr[2];
            float[] fArr2 = this.f13443C;
            NativeInputInterface.nativePassGyroscopeChange(f10, f11, f12, fArr2[0], fArr2[2], fArr2[3], fArr2[1]);
            return;
        }
        if (sensorEvent.sensor.getType() == 1) {
            float[] fArr3 = this.f13446F;
            float f13 = fArr3[0] * 0.8f;
            float[] fArr4 = sensorEvent.values;
            fArr3[0] = f13 + (fArr4[0] * 0.19999999f);
            fArr3[1] = (fArr3[1] * 0.8f) + (fArr4[1] * 0.19999999f);
            fArr3[2] = (fArr3[2] * 0.8f) + (fArr4[2] * 0.19999999f);
            float[] fArr5 = this.f13447G;
            fArr5[0] = fArr4[0] - fArr3[0];
            fArr5[1] = fArr4[1] - fArr3[1];
            fArr5[2] = fArr4[2] - fArr3[2];
            float[] m14212g = m14212g(rotation, fArr5);
            float[] m14212g2 = m14212g(rotation, this.f13446F);
            NativeInputInterface.nativePassAccelerometerChange(-m14212g[1], m14212g[2], m14212g[0]);
            NativeInputInterface.nativePassGravityChange(-m14212g2[1], -m14212g2[2], m14212g2[0]);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0067, code lost:
    
        if (r3 != 6) goto L60;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01d7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01e7 A[LOOP:1: B:64:0x01e1->B:66:0x01e7, LOOP_END] */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouch(android.view.View r12, android.view.MotionEvent r13) {
        /*
            Method dump skipped, instructions count: 519
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p076f9.ViewOnTouchListenerC3208b.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    /* renamed from: p */
    public void m14226p(int i10, int i11) {
        NativeInputInterface.nativePassSwipeGesture(3, i10, i11);
    }

    /* renamed from: q */
    public void m14227q() {
        m14219v();
    }

    /* renamed from: t */
    public void m14228t(boolean z10) {
        if (!this.f13468z) {
            this.f13468z = z10;
        }
        if (this.f13468z) {
            this.f13463u.registerListener(this, this.f13465w, 1);
            this.f13463u.registerListener(this, this.f13464v, 1);
        }
        if (C1134c.m6537a().mo6615i()) {
            this.f13467y.m14261c();
        }
    }

    /* renamed from: u */
    public void m14229u() {
        this.f13463u.unregisterListener(this);
        if (C1134c.m6537a().mo6615i()) {
            this.f13467y.m14262d();
        }
    }

    /* renamed from: f9.b$f */
    /* loaded from: classes.dex */
    private final class f implements GestureDetector.OnGestureListener {

        /* renamed from: a */
        public int f13474a;

        /* renamed from: b */
        public int f13475b;

        /* renamed from: c */
        private int f13476c;

        /* renamed from: d */
        private int f13477d;

        /* renamed from: e */
        private int f13478e;

        /* renamed from: f */
        private int f13479f;

        private f() {
            this.f13474a = -1;
            this.f13475b = -1;
            this.f13476c = 0;
            this.f13477d = 0;
            this.f13478e = 0;
            this.f13479f = 0;
        }

        /* renamed from: a */
        public void m14233a() {
            this.f13475b = -1;
            NativeInputInterface.nativePassPanGesture(2, this.f13476c, this.f13477d, this.f13478e, this.f13479f, 0.0f);
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            return false;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
            if (motionEvent != null && motionEvent2 != null) {
                try {
                    float m14214i = ViewOnTouchListenerC3208b.this.m14214i();
                    int x10 = (int) (motionEvent2.getX() / m14214i);
                    int y10 = (int) (motionEvent2.getY() / m14214i);
                    int x11 = (int) (motionEvent.getX() / m14214i);
                    int y11 = (int) (motionEvent.getY() / m14214i);
                    float f12 = y10 - y11;
                    float f13 = x10 - x11;
                    if (Math.abs(f13) > Math.abs(f12)) {
                        if (Math.abs(f13) > 50.0f && Math.abs(f10) > 50.0f) {
                            if (f13 > 0.0f) {
                                ViewOnTouchListenerC3208b.this.m14225o(x11, y11);
                            } else {
                                ViewOnTouchListenerC3208b.this.m14224n(x11, y11);
                            }
                        }
                    } else if (Math.abs(f12) > 50.0f && Math.abs(f11) > 50.0f) {
                        if (f12 > 0.0f) {
                            ViewOnTouchListenerC3208b.this.m14223m(x11, y11);
                        } else {
                            ViewOnTouchListenerC3208b.this.m14226p(x11, y11);
                        }
                    }
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }
            return false;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
            this.f13474a = motionEvent.getPointerId(motionEvent.getActionIndex());
            float m14214i = ViewOnTouchListenerC3208b.this.m14214i();
            NativeInputInterface.nativePassLongPressGesture(0, motionEvent.getX() / m14214i, motionEvent.getY() / m14214i);
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
            if (motionEvent != null && motionEvent2 != null) {
                boolean z10 = this.f13475b == -1;
                this.f13475b = motionEvent2.getPointerId(motionEvent2.getActionIndex());
                float m14214i = ViewOnTouchListenerC3208b.this.m14214i();
                this.f13476c = (int) (motionEvent2.getX() / m14214i);
                this.f13477d = (int) (motionEvent2.getY() / m14214i);
                int x10 = (int) (motionEvent.getX() / m14214i);
                int y10 = (int) (motionEvent.getY() / m14214i);
                int i10 = this.f13476c;
                int i11 = i10 - x10;
                this.f13478e = i11;
                int i12 = this.f13477d;
                int i13 = i12 - y10;
                this.f13479f = i13;
                if (z10) {
                    NativeInputInterface.nativePassPanGesture(0, i10, i12, i11, i13, 0.0f);
                } else {
                    NativeInputInterface.nativePassPanGesture(1, i10, i12, i11, i13, 0.0f);
                }
            }
            return false;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public void onShowPress(MotionEvent motionEvent) {
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            float m14214i = ViewOnTouchListenerC3208b.this.m14214i();
            NativeInputInterface.nativePassTapGesture((int) (motionEvent.getX() / m14214i), (int) (motionEvent.getY() / m14214i));
            return false;
        }

        /* synthetic */ f(ViewOnTouchListenerC3208b viewOnTouchListenerC3208b, a aVar) {
            this();
        }
    }
}
