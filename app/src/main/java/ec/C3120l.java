package ec;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothHeadset;
import android.bluetooth.BluetoothProfile;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import p033c7.C1134c;
import p079fc.C3216a;

/* renamed from: ec.l */
/* loaded from: classes.dex */
public class C3120l {

    /* renamed from: a */
    private final Context f13109a;

    /* renamed from: b */
    private final f f13110b;

    /* renamed from: c */
    private final AudioManager f13111c;

    /* renamed from: d */
    private final Handler f13112d;

    /* renamed from: e */
    int f13113e;

    /* renamed from: f */
    private e f13114f;

    /* renamed from: g */
    private final BluetoothProfile.ServiceListener f13115g;

    /* renamed from: h */
    private BluetoothAdapter f13116h;

    /* renamed from: i */
    private BluetoothHeadset f13117i;

    /* renamed from: j */
    private BluetoothDevice f13118j;

    /* renamed from: k */
    private final BroadcastReceiver f13119k;

    /* renamed from: l */
    private AudioDeviceCallback f13120l;

    /* renamed from: m */
    private final Runnable f13121m = new Runnable() { // from class: ec.k
        @Override // java.lang.Runnable
        public final void run() {
            C3120l.this.m13743j();
        }
    };

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ec.l$a */
    /* loaded from: classes.dex */
    public class a extends AudioDeviceCallback {
        a() {
        }

        @Override // android.media.AudioDeviceCallback
        public void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
            Log.d("AppRtcBluetoothMgr", "onAudioDevicesAdded");
            if (C3216a.m14307m(audioDeviceInfoArr, true)) {
                C3120l.this.m13753y();
            }
            if (C1134c.m6537a().mo6563M() && C3216a.m14307m(audioDeviceInfoArr, false) && C3120l.this.f13114f == e.SCO_CONNECTED) {
                Log.d("AppRtcBluetoothMgr", "SCO_CONNECTED state but device in A2DP. Reconnecting...");
                C3120l.this.f13114f = e.HEADSET_AVAILABLE;
                C3120l.this.m13753y();
            }
        }

        @Override // android.media.AudioDeviceCallback
        public void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
            Log.d("AppRtcBluetoothMgr", "onAudioDevicesRemoved");
            if (C3216a.m14307m(audioDeviceInfoArr, true)) {
                C3120l.this.m13754z();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ec.l$b */
    /* loaded from: classes.dex */
    public static /* synthetic */ class b {

        /* renamed from: a */
        static final /* synthetic */ int[] f13123a;

        static {
            int[] iArr = new int[e.values().length];
            f13123a = iArr;
            try {
                iArr[e.UNINITIALIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13123a[e.SCO_CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13123a[e.SCO_DISCONNECTING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f13123a[e.HEADSET_UNAVAILABLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f13123a[e.HEADSET_AVAILABLE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f13123a[e.SCO_CONNECTING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* renamed from: ec.l$c */
    /* loaded from: classes.dex */
    private class c extends BroadcastReceiver {
        private c() {
        }

        /* renamed from: a */
        protected void m13764a(Intent intent) {
            int intExtra = intent.getIntExtra("android.bluetooth.profile.extra.STATE", 10);
            Log.d("AppRtcBluetoothMgr", "BluetoothHeadsetBroadcastReceiver.onAudioStateChanged: a=ACTION_AUDIO_STATE_CHANGED, s=" + C3216a.m14298d(intExtra) + ", sb=" + isInitialStickyBroadcast() + ", BT state: " + C3120l.this.f13114f);
            switch (intExtra) {
                case 10:
                    Log.d("AppRtcBluetoothMgr", "+++ Bluetooth audio SCO is now disconnected");
                    if (isInitialStickyBroadcast()) {
                        Log.d("AppRtcBluetoothMgr", "Ignore STATE_AUDIO_DISCONNECTED initial sticky broadcast.");
                        return;
                    } else {
                        C3120l.this.m13752x();
                        return;
                    }
                case 11:
                    Log.d("AppRtcBluetoothMgr", "+++ Bluetooth audio SCO is now connecting...");
                    return;
                case 12:
                    C3120l.this.m13751w();
                    return;
                default:
                    return;
            }
        }

        /* renamed from: b */
        protected void m13765b(Intent intent) {
            int intExtra = intent.getIntExtra("android.bluetooth.profile.extra.STATE", 0);
            Log.d("AppRtcBluetoothMgr", "BluetoothHeadsetBroadcastReceiver.onConnectionStateChanged: a=ACTION_CONNECTION_STATE_CHANGED, s=" + C3216a.m14299e(intExtra) + ", sb=" + isInitialStickyBroadcast() + ", BT state: " + C3120l.this.f13114f);
            if (intExtra == 0) {
                C3120l.this.m13754z();
            } else {
                if (intExtra != 2) {
                    return;
                }
                C3120l.this.m13753y();
            }
        }

        /* renamed from: c */
        protected void m13766c(Intent intent) {
            int intExtra = intent.getIntExtra("android.media.extra.SCO_AUDIO_STATE", 0);
            Log.d("AppRtcBluetoothMgr", "BluetoothHeadsetBroadcastReceiver.onScoAudioStateUpdate: action=" + intent.getAction() + ", EXTRA_SCO_AUDIO_STATE=" + C3216a.m14297c(intExtra) + ", EXTRA_SCO_AUDIO_PREVIOUS_STATE=" + C3216a.m14297c(intent.getIntExtra("android.media.extra.SCO_AUDIO_PREVIOUS_STATE", 0)) + ", sb=" + isInitialStickyBroadcast() + ", bluetoothState= " + C3120l.this.f13114f);
            if (intExtra != 0) {
                if (intExtra != 1) {
                    return;
                }
                C3120l.this.m13751w();
            } else {
                if (isInitialStickyBroadcast()) {
                    return;
                }
                C3120l.this.m13752x();
            }
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (C3120l.this.f13114f == e.UNINITIALIZED) {
                return;
            }
            String action = intent.getAction();
            Log.d("AppRtcBluetoothMgr", ">>> BluetoothHeadsetBroadcastReceiver.onReceive: action=" + action);
            if (intent.getExtras() != null) {
                Log.d("AppRtcBluetoothMgr", ">>> BluetoothHeadsetBroadcastReceiver.onReceive: extras=" + intent.getExtras().toString());
            }
            action.hashCode();
            char c10 = 65535;
            switch (action.hashCode()) {
                case -1692127708:
                    if (action.equals("android.media.ACTION_SCO_AUDIO_STATE_UPDATED")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -1435586571:
                    if (action.equals("android.bluetooth.headset.profile.action.AUDIO_STATE_CHANGED")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 545516589:
                    if (action.equals("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED")) {
                        c10 = 2;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    m13766c(intent);
                    break;
                case 1:
                    m13764a(intent);
                    break;
                case 2:
                    m13765b(intent);
                    break;
            }
            Log.d("AppRtcBluetoothMgr", "<<< BluetoothHeadsetBroadcastReceiver.onReceive done: BT state=" + C3120l.this.f13114f);
        }

        /* synthetic */ c(C3120l c3120l, a aVar) {
            this();
        }
    }

    /* renamed from: ec.l$d */
    /* loaded from: classes.dex */
    private class d implements BluetoothProfile.ServiceListener {
        private d() {
        }

        @Override // android.bluetooth.BluetoothProfile.ServiceListener
        public void onServiceConnected(int i10, BluetoothProfile bluetoothProfile) {
            if (i10 != 1 || C3120l.this.f13114f == e.UNINITIALIZED) {
                return;
            }
            Log.d("AppRtcBluetoothMgr", "BluetoothServiceListener.onServiceConnected: BT state=" + C3120l.this.f13114f);
            C3120l.this.m13722A((BluetoothHeadset) bluetoothProfile);
            Log.d("AppRtcBluetoothMgr", "onServiceConnected done: BT state=" + C3120l.this.f13114f);
        }

        @Override // android.bluetooth.BluetoothProfile.ServiceListener
        public void onServiceDisconnected(int i10) {
            if (i10 != 1 || C3120l.this.f13114f == e.UNINITIALIZED) {
                return;
            }
            Log.d("AppRtcBluetoothMgr", "BluetoothServiceListener.onServiceDisconnected: BT state=" + C3120l.this.f13114f);
            C3120l.this.m13723B();
            Log.d("AppRtcBluetoothMgr", "onServiceDisconnected done: BT state=" + C3120l.this.f13114f);
        }

        /* synthetic */ d(C3120l c3120l, a aVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ec.l$e */
    /* loaded from: classes.dex */
    public enum e {
        UNINITIALIZED,
        HEADSET_UNAVAILABLE,
        HEADSET_AVAILABLE,
        SCO_DISCONNECTING,
        SCO_CONNECTING,
        SCO_CONNECTED
    }

    /* renamed from: ec.l$f */
    /* loaded from: classes.dex */
    public interface f {
        /* renamed from: a */
        void mo13669a();
    }

    protected C3120l(Context context, f fVar) {
        Log.d("AppRtcBluetoothMgr", "ctor");
        C3216a.m14300f();
        this.f13109a = context;
        this.f13110b = fVar;
        this.f13111c = m13760o(context);
        this.f13114f = e.UNINITIALIZED;
        a aVar = null;
        this.f13115g = new d(this, aVar);
        this.f13119k = new c(this, aVar);
        this.f13112d = new Handler(Looper.getMainLooper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A */
    public void m13722A(BluetoothHeadset bluetoothHeadset) {
        Log.d("AppRtcBluetoothMgr", "onHeadsetProfileConnected");
        this.f13117i = bluetoothHeadset;
        m13731N();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: B */
    public void m13723B() {
        Log.d("AppRtcBluetoothMgr", "onHeadsetProfileDisconnected");
        m13729K();
        this.f13117i = null;
        this.f13118j = null;
        m13731N();
    }

    /* renamed from: C */
    private void m13724C() {
        Log.d("AppRtcBluetoothMgr", "registerAudioDeviceCallback");
        if (this.f13120l != null || this.f13111c == null) {
            return;
        }
        a aVar = new a();
        this.f13120l = aVar;
        this.f13111c.registerAudioDeviceCallback(aVar, this.f13112d);
    }

    /* renamed from: F */
    private void m13725F() {
        AudioManager audioManager = this.f13111c;
        if (audioManager == null) {
            return;
        }
        audioManager.startBluetoothSco();
        this.f13111c.setBluetoothScoOn(true);
    }

    /* renamed from: G */
    private boolean m13726G() {
        C3216a.m14300f();
        if (this.f13111c == null) {
            Log.w("AppRtcBluetoothMgr", "startScoAudio: audioManager == null");
            return false;
        }
        Log.d("AppRtcBluetoothMgr", "startSco: BT state=" + this.f13114f + ", attempts: " + this.f13113e + ", SCO is on: " + m13749u());
        if (this.f13113e >= 2) {
            Log.e("AppRtcBluetoothMgr", "BT SCO connection fails - no more attempts");
            return false;
        }
        Log.d("AppRtcBluetoothMgr", "Starting Bluetooth SCO and waits for ACTION_AUDIO_STATE_CHANGED...");
        m13725F();
        this.f13113e++;
        m13727H();
        Log.d("AppRtcBluetoothMgr", "startScoAudio done: BT state=" + this.f13114f + ", SCO is on: " + m13749u());
        return true;
    }

    /* renamed from: H */
    private void m13727H() {
        C3216a.m14300f();
        Log.d("AppRtcBluetoothMgr", "startTimer");
        this.f13112d.removeCallbacks(this.f13121m);
        this.f13112d.postDelayed(this.f13121m, 4000L);
    }

    /* renamed from: J */
    private void m13728J() {
        AudioManager audioManager = this.f13111c;
        if (audioManager == null) {
            return;
        }
        audioManager.stopBluetoothSco();
        this.f13111c.setBluetoothScoOn(false);
    }

    /* renamed from: K */
    private void m13729K() {
        C3216a.m14300f();
        if (this.f13111c == null) {
            Log.w("AppRtcBluetoothMgr", "stopScoAudio: audioManager == null");
            return;
        }
        Log.d("AppRtcBluetoothMgr", "stopScoAudio: BT state=" + this.f13114f + ", SCO is on: " + m13749u());
        e eVar = this.f13114f;
        if (eVar == e.SCO_CONNECTING || eVar == e.SCO_CONNECTED) {
            m13744l();
            m13728J();
            m13745m(e.SCO_DISCONNECTING);
            Log.d("AppRtcBluetoothMgr", "stopScoAudio done: BT state=" + this.f13114f + ", SCO is on: " + m13749u());
        }
    }

    /* renamed from: L */
    private void m13730L() {
        AudioManager audioManager;
        Log.d("AppRtcBluetoothMgr", "unregisterAudioDeviceCallback");
        AudioDeviceCallback audioDeviceCallback = this.f13120l;
        if (audioDeviceCallback == null || (audioManager = this.f13111c) == null) {
            return;
        }
        audioManager.unregisterAudioDeviceCallback(audioDeviceCallback);
    }

    /* renamed from: N */
    private synchronized void m13731N() {
        Log.d("AppRtcBluetoothMgr", "update: bluetoothState=" + this.f13114f);
        e eVar = this.f13114f;
        int i10 = b.f13123a[eVar.ordinal()];
        if (i10 != 3 && i10 != 4 && i10 != 5) {
            if (i10 == 6 && m13748r()) {
                eVar = e.SCO_CONNECTED;
            }
        } else {
            eVar = m13733P() ? e.HEADSET_AVAILABLE : e.HEADSET_UNAVAILABLE;
        }
        if (eVar == e.HEADSET_AVAILABLE && this.f13113e < 2) {
            Log.d("AppRtcBluetoothMgr", "Starting SCO Audio...");
            if (m13726G()) {
                eVar = e.SCO_CONNECTING;
            }
        }
        if (eVar != this.f13114f) {
            m13745m(eVar);
        }
    }

    /* renamed from: O */
    private void m13732O() {
        C3216a.m14300f();
        Log.d("AppRtcBluetoothMgr", "updateAudioDeviceState");
        m13750v();
        f fVar = this.f13110b;
        if (fVar != null) {
            fVar.mo13669a();
        }
    }

    /* renamed from: P */
    private boolean m13733P() {
        boolean z10 = false;
        if (this.f13114f == e.UNINITIALIZED) {
            Log.d("AppRtcBluetoothMgr", "updateDevice: not initialized!");
            return false;
        }
        if (this.f13117i == null) {
            Log.d("AppRtcBluetoothMgr", "updateDevice: bluetoothHeadset is null. bluetoothState=" + this.f13114f);
            return false;
        }
        if (m13759k()) {
            BluetoothDevice m14304j = C3216a.m14304j("AppRtcBluetoothMgr", this.f13109a, this.f13117i);
            this.f13118j = m14304j;
            if (m14304j == null) {
                Log.d("AppRtcBluetoothMgr", "updateDevice: No connected bluetooth headset");
            } else {
                C3216a.m14314t("AppRtcBluetoothMgr", this.f13109a, this.f13117i, m14304j);
                z10 = true;
            }
        } else {
            AudioManager audioManager = this.f13111c;
            if (audioManager != null) {
                C3216a.m14312r("AppRtcBluetoothMgr", audioManager);
                if (Build.VERSION.SDK_INT >= 23 && C3216a.m14306l(this.f13111c, false)) {
                    z10 = true;
                }
                Log.d("AppRtcBluetoothMgr", "updateDevice: permission not granted, bluetoothState=" + this.f13114f);
            }
        }
        Log.d("AppRtcBluetoothMgr", "updateDevice done: hasBluetoothHeadset=" + z10);
        return z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public void m13743j() {
        C3216a.m14300f();
        if (this.f13114f != e.UNINITIALIZED && this.f13117i != null) {
            Log.d("AppRtcBluetoothMgr", "bluetoothTimeout: BT state=" + this.f13114f + ", attempts: " + this.f13113e + ", SCO is on: " + m13749u());
            if (this.f13114f != e.SCO_CONNECTING) {
                return;
            }
            boolean z10 = false;
            if (m13759k()) {
                BluetoothDevice m14303i = C3216a.m14303i("AppRtcBluetoothMgr", this.f13109a, this.f13117i);
                this.f13118j = m14303i;
                if (m14303i != null) {
                    z10 = true;
                }
            } else {
                z10 = m13748r();
            }
            if (z10) {
                m13751w();
            } else {
                Log.w("AppRtcBluetoothMgr", "BT failed to connect after timeout");
                m13729K();
            }
            Log.d("AppRtcBluetoothMgr", "bluetoothTimeout done: BT state=" + this.f13114f);
            return;
        }
        Log.d("AppRtcBluetoothMgr", "bluetoothTimeout: not initialized! BT state=" + this.f13114f);
    }

    /* renamed from: l */
    private void m13744l() {
        C3216a.m14300f();
        Log.d("AppRtcBluetoothMgr", "cancelTimer");
        this.f13112d.removeCallbacks(this.f13121m);
    }

    /* renamed from: m */
    private void m13745m(e eVar) {
        if (eVar != this.f13114f) {
            Log.d("AppRtcBluetoothMgr", "Changing state from " + this.f13114f + " to " + eVar);
            this.f13114f = eVar;
            if (eVar != e.UNINITIALIZED) {
                m13732O();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public static C3120l m13746n(Context context, f fVar) {
        Log.d("AppRtcBluetoothMgr", "create" + C3216a.m14305k());
        return new C3120l(context, fVar);
    }

    /* renamed from: q */
    private e m13747q() {
        C3216a.m14300f();
        return this.f13114f;
    }

    /* renamed from: r */
    private boolean m13748r() {
        AudioManager audioManager;
        if (m13759k()) {
            return C3216a.m14309o("AppRtcBluetoothMgr", this.f13109a, this.f13117i, this.f13118j);
        }
        if (Build.VERSION.SDK_INT < 23 || (audioManager = this.f13111c) == null) {
            return false;
        }
        return C3216a.m14306l(audioManager, true);
    }

    /* renamed from: u */
    private boolean m13749u() {
        AudioManager audioManager = this.f13111c;
        if (audioManager == null) {
            return false;
        }
        return audioManager.isBluetoothScoOn();
    }

    /* renamed from: v */
    private void m13750v() {
        Log.d("AppRtcBluetoothMgr", "bluetoothState=" + this.f13114f);
        AudioManager audioManager = this.f13111c;
        if (audioManager != null) {
            C3216a.m14312r("AppRtcBluetoothMgr", audioManager);
        }
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter != null) {
            BluetoothAdapter bluetoothAdapter = this.f13116h;
            if (bluetoothAdapter != null && defaultAdapter != bluetoothAdapter) {
                Log.d("AppRtcBluetoothMgr", "Cached adapter different that default BluetoothAdapter!");
            }
        } else {
            Log.d("AppRtcBluetoothMgr", "Default BluetoothAdapter unavailable!");
        }
        if (Build.VERSION.SDK_INT >= 31 && !C3216a.m14308n(this.f13109a, "android.permission.BLUETOOTH_CONNECT")) {
            Log.d("AppRtcBluetoothMgr", "logBluetoothStatus: BLUETOOTH_CONNECT not granted!");
            return;
        }
        BluetoothHeadset bluetoothHeadset = this.f13117i;
        if (bluetoothHeadset != null) {
            C3216a.m14313s("AppRtcBluetoothMgr", this.f13109a, bluetoothHeadset);
        } else {
            Log.d("AppRtcBluetoothMgr", "No headset connected.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w */
    public void m13751w() {
        Log.d("AppRtcBluetoothMgr", "onHeadsetAudioConnected");
        if (this.f13114f == e.SCO_CONNECTED) {
            Log.d("AppRtcBluetoothMgr", "onHeadsetAudioConnected: Audio already connected. state=" + this.f13114f);
            return;
        }
        m13744l();
        if (this.f13114f == e.SCO_CONNECTING) {
            Log.d("AppRtcBluetoothMgr", "+++ Bluetooth audio SCO is now connected");
            this.f13113e = 0;
            m13731N();
            return;
        }
        Log.w("AppRtcBluetoothMgr", "Unexpected state BluetoothHeadset.STATE_AUDIO_CONNECTED");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x */
    public void m13752x() {
        Log.d("AppRtcBluetoothMgr", "onHeadsetAudioDisconnected");
        m13745m(e.HEADSET_AVAILABLE);
        this.f13113e = 0;
        m13731N();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y */
    public void m13753y() {
        Log.d("AppRtcBluetoothMgr", "onHeadsetConnected");
        this.f13113e = 0;
        m13731N();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z */
    public void m13754z() {
        Log.d("AppRtcBluetoothMgr", "onHeadsetDisconnected");
        m13729K();
        m13731N();
    }

    /* renamed from: D */
    protected Intent m13755D(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        return this.f13109a.registerReceiver(broadcastReceiver, intentFilter);
    }

    /* renamed from: E */
    public void m13756E() {
        C3216a.m14300f();
        Log.d("AppRtcBluetoothMgr", "start");
        Log.d("AppRtcBluetoothMgr", "Starting AppRtcBluetoothManager...");
        AudioManager audioManager = this.f13111c;
        if (audioManager == null) {
            Log.w("AppRtcBluetoothMgr", "audioManager == null");
            return;
        }
        if (this.f13114f != e.UNINITIALIZED) {
            Log.w("AppRtcBluetoothMgr", "Invalid BT state");
            return;
        }
        this.f13117i = null;
        this.f13118j = null;
        this.f13113e = 0;
        if (!audioManager.isBluetoothScoAvailableOffCall()) {
            Log.e("AppRtcBluetoothMgr", "Bluetooth SCO audio is not available off call");
            return;
        }
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        this.f13116h = defaultAdapter;
        if (defaultAdapter == null) {
            Log.w("AppRtcBluetoothMgr", "Device does not support Bluetooth");
            return;
        }
        if (!m13761p(this.f13109a, this.f13115g)) {
            Log.e("AppRtcBluetoothMgr", "BluetoothAdapter.getBluetoothHeadsetProfileProxy failed");
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED");
        intentFilter.addAction("android.bluetooth.headset.profile.action.AUDIO_STATE_CHANGED");
        intentFilter.addAction("android.media.ACTION_SCO_AUDIO_STATE_UPDATED");
        Intent m13755D = m13755D(this.f13119k, intentFilter);
        if (m13755D != null) {
            Log.d("AppRtcBluetoothMgr", "start: bluetoothHeadsetReceiver registered. receiverIntent.action=" + m13755D.getAction() + " receiverIntent.extras=" + m13755D.getExtras());
        }
        Log.d("AppRtcBluetoothMgr", "Bluetooth proxy for headset profile has started.");
        if (!m13759k() && Build.VERSION.SDK_INT >= 23) {
            m13724C();
        }
        m13745m(e.HEADSET_UNAVAILABLE);
        Log.d("AppRtcBluetoothMgr", "start done: BT state=" + this.f13114f);
    }

    /* renamed from: I */
    public void m13757I() {
        C3216a.m14300f();
        Log.d("AppRtcBluetoothMgr", "stop: BT state=" + this.f13114f);
        if (this.f13116h == null) {
            return;
        }
        e eVar = this.f13114f;
        e eVar2 = e.UNINITIALIZED;
        if (eVar == eVar2) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            m13730L();
        }
        m13729K();
        m13758M(this.f13119k);
        m13744l();
        BluetoothHeadset bluetoothHeadset = this.f13117i;
        if (bluetoothHeadset != null) {
            this.f13116h.closeProfileProxy(1, bluetoothHeadset);
            this.f13117i = null;
        }
        this.f13116h = null;
        this.f13118j = null;
        m13745m(eVar2);
        Log.d("AppRtcBluetoothMgr", "stop done: BT state=" + this.f13114f);
    }

    /* renamed from: M */
    protected void m13758M(BroadcastReceiver broadcastReceiver) {
        this.f13109a.unregisterReceiver(broadcastReceiver);
    }

    /* renamed from: k */
    boolean m13759k() {
        return Build.VERSION.SDK_INT < 31;
    }

    /* renamed from: o */
    protected AudioManager m13760o(Context context) {
        return (AudioManager) context.getSystemService("audio");
    }

    /* renamed from: p */
    protected boolean m13761p(Context context, BluetoothProfile.ServiceListener serviceListener) {
        BluetoothAdapter bluetoothAdapter = this.f13116h;
        if (bluetoothAdapter == null) {
            return false;
        }
        return bluetoothAdapter.getProfileProxy(context, serviceListener, 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public boolean m13762s() {
        return m13747q() == e.SCO_CONNECTED || m13747q() == e.SCO_CONNECTING || m13747q() == e.HEADSET_AVAILABLE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public boolean m13763t() {
        return m13747q() == e.SCO_CONNECTED;
    }
}
