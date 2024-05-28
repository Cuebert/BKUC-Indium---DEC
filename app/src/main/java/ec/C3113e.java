package ec;

import android.annotation.TargetApi;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioAttributes;
import android.media.AudioDeviceInfo;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.appcompat.app.ActivityC0153c;
import ec.C3120l;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.webrtc.voiceengine.AppAudioManagerBase;
import p033c7.C1134c;
import p079fc.C3216a;

/* renamed from: ec.e */
/* loaded from: classes.dex */
public class C3113e extends AppAudioManagerBase {

    /* renamed from: a */
    private final Context f13055a;

    /* renamed from: b */
    private final AudioManager f13056b;

    /* renamed from: c */
    private AppAudioManagerBase.AudioManagerEvents f13057c;

    /* renamed from: d */
    private c f13058d;

    /* renamed from: f */
    private boolean f13060f;

    /* renamed from: g */
    private boolean f13061g;

    /* renamed from: h */
    private boolean f13062h;

    /* renamed from: j */
    private final b f13064j;

    /* renamed from: k */
    private b f13065k;

    /* renamed from: l */
    private final C3120l f13066l;

    /* renamed from: n */
    private final BroadcastReceiver f13068n;

    /* renamed from: o */
    private AudioManager.OnAudioFocusChangeListener f13069o;

    /* renamed from: p */
    private AudioFocusRequest f13070p;

    /* renamed from: e */
    private int f13059e = -2;

    /* renamed from: i */
    private int f13063i = 0;

    /* renamed from: m */
    private Set<b> f13067m = new HashSet();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ec.e$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f13071a;

        static {
            int[] iArr = new int[b.values().length];
            f13071a = iArr;
            try {
                iArr[b.SPEAKER_PHONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13071a[b.EARPIECE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13071a[b.WIRED_HEADSET.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f13071a[b.BLUETOOTH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* renamed from: ec.e$b */
    /* loaded from: classes.dex */
    public enum b {
        SPEAKER_PHONE,
        WIRED_HEADSET,
        EARPIECE,
        BLUETOOTH,
        NONE
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ec.e$c */
    /* loaded from: classes.dex */
    public enum c {
        UNINITIALIZED,
        RUNNING
    }

    /* renamed from: ec.e$d */
    /* loaded from: classes.dex */
    private class d extends BroadcastReceiver {
        private d() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            int intExtra = intent.getIntExtra("state", 0);
            int intExtra2 = intent.getIntExtra("microphone", 0);
            String stringExtra = intent.getStringExtra("name");
            StringBuilder sb2 = new StringBuilder();
            sb2.append("WiredHeadsetReceiver.onReceive");
            sb2.append(C3216a.m14305k());
            sb2.append(": a=");
            sb2.append(intent.getAction());
            sb2.append(", s=");
            sb2.append(intExtra == 0 ? "unplugged" : "plugged");
            sb2.append(", m=");
            sb2.append(intExtra2 == 1 ? "mic" : "no mic");
            sb2.append(", n=");
            sb2.append(stringExtra);
            sb2.append(", sb=");
            sb2.append(isInitialStickyBroadcast());
            Log.d("AppRtcAudioManager", sb2.toString());
            C3113e.this.f13062h = intExtra == 1;
            C3113e.this.m13693z();
        }

        /* synthetic */ d(C3113e c3113e, a aVar) {
            this();
        }
    }

    private C3113e(Context context) {
        Log.d("AppRtcAudioManager", "ctor");
        C3216a.m14300f();
        this.f13055a = context;
        this.f13056b = (AudioManager) context.getSystemService("audio");
        this.f13066l = C3120l.m13746n(context, new C3120l.f() { // from class: ec.b
            @Override // ec.C3120l.f
            /* renamed from: a */
            public final void mo13669a() {
                C3113e.this.m13693z();
            }
        });
        this.f13068n = new d(this, null);
        this.f13058d = c.UNINITIALIZED;
        b bVar = b.SPEAKER_PHONE;
        this.f13064j = bVar;
        Log.d("AppRtcAudioManager", "defaultAudioDevice: " + bVar);
        C3216a.m14315u("AppRtcAudioManager");
        setInstance(this);
    }

    /* renamed from: d */
    private void m13673d() {
        if (C1134c.m6537a().mo6598c0() && Build.VERSION.SDK_INT >= 26) {
            m13675f();
        } else {
            m13674e();
        }
    }

    /* renamed from: e */
    private void m13674e() {
        AudioManager audioManager = this.f13056b;
        if (audioManager == null) {
            return;
        }
        audioManager.abandonAudioFocus(this.f13069o);
    }

    @TargetApi(26)
    /* renamed from: f */
    private void m13675f() {
        AudioManager audioManager = this.f13056b;
        if (audioManager == null) {
            return;
        }
        audioManager.abandonAudioFocusRequest(this.f13070p);
    }

    /* renamed from: i */
    public static C3113e m13678i(Context context) {
        return new C3113e(context);
    }

    /* renamed from: j */
    private boolean m13679j() {
        return this.f13055a.getPackageManager().hasSystemFeature("android.hardware.telephony");
    }

    /* renamed from: k */
    private boolean m13680k() {
        if (this.f13056b == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT < 23) {
            return m13681l();
        }
        return m13682m();
    }

    /* renamed from: l */
    private boolean m13681l() {
        AudioManager audioManager = this.f13056b;
        if (audioManager == null) {
            return false;
        }
        return audioManager.isWiredHeadsetOn();
    }

    @TargetApi(23)
    /* renamed from: m */
    private boolean m13682m() {
        AudioManager audioManager = this.f13056b;
        if (audioManager == null) {
            return false;
        }
        for (AudioDeviceInfo audioDeviceInfo : audioManager.getDevices(3)) {
            int type = audioDeviceInfo.getType();
            if (type == 3) {
                Log.d("AppRtcAudioManager", "hasWiredHeadset: found wired headset");
                return true;
            }
            if (type == 11) {
                Log.d("AppRtcAudioManager", "hasWiredHeadset: found USB audio device");
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public static /* synthetic */ void m13683n(int i10) {
        Log.d("AppRtcAudioManager", "onAudioFocusChange: " + C3216a.m14301g(i10));
    }

    /* renamed from: p */
    private void m13685p(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        this.f13055a.registerReceiver(broadcastReceiver, intentFilter);
    }

    /* renamed from: q */
    private void m13686q() {
        if (C1134c.m6537a().mo6598c0() && Build.VERSION.SDK_INT >= 26) {
            m13688s();
        } else {
            m13687r();
        }
    }

    /* renamed from: r */
    private void m13687r() {
        AudioManager audioManager = this.f13056b;
        if (audioManager == null) {
            return;
        }
        if (audioManager.requestAudioFocus(this.f13069o, 0, 2) == 1) {
            Log.d("AppRtcAudioManager", "Audio focus request granted for VOICE_CALL streams");
        } else {
            Log.e("AppRtcAudioManager", "Audio focus request failed");
        }
    }

    @TargetApi(26)
    /* renamed from: s */
    private void m13688s() {
        if (this.f13056b == null) {
            return;
        }
        AudioFocusRequest build = new AudioFocusRequest.Builder(2).setAudioAttributes(new AudioAttributes.Builder().setUsage(2).setContentType(1).build()).setAcceptsDelayedFocusGain(true).setWillPauseWhenDucked(true).setOnAudioFocusChangeListener(this.f13069o).build();
        this.f13070p = build;
        Log.d("AppRtcAudioManager", "requestAudioFocusNew: result = " + C3216a.m14302h(this.f13056b.requestAudioFocus(build)));
    }

    /* renamed from: t */
    private void m13689t(b bVar) {
        Log.d("AppRtcAudioManager", "setAudioDeviceInternal(device=" + bVar + ")");
        C3216a.m14295a(this.f13067m.contains(bVar));
        int i10 = a.f13071a[bVar.ordinal()];
        if (i10 == 1) {
            m13691v(true);
        } else if (i10 != 2 && i10 != 3 && i10 != 4) {
            Log.e("AppRtcAudioManager", "Invalid audio device selection");
        } else {
            m13691v(false);
        }
        this.f13065k = bVar;
    }

    /* renamed from: u */
    private void m13690u(boolean z10) {
        AudioManager audioManager = this.f13056b;
        if (audioManager == null || audioManager.isMicrophoneMute() == z10) {
            return;
        }
        this.f13056b.setMicrophoneMute(z10);
    }

    /* renamed from: v */
    private void m13691v(boolean z10) {
        AudioManager audioManager = this.f13056b;
        if (audioManager == null || audioManager.isSpeakerphoneOn() == z10) {
            return;
        }
        this.f13056b.setSpeakerphoneOn(z10);
    }

    /* renamed from: y */
    private void m13692y(BroadcastReceiver broadcastReceiver) {
        this.f13055a.unregisterReceiver(broadcastReceiver);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z */
    public void m13693z() {
        b bVar;
        C3216a.m14300f();
        Log.d("AppRtcAudioManager", "---> updateAudioDeviceState: wired headset=" + this.f13062h + ", BT isHeadsetAvailable=" + this.f13066l.m13762s());
        Log.d("AppRtcAudioManager", "Device status: available=" + this.f13067m + ", selected=" + this.f13065k);
        AudioManager audioManager = this.f13056b;
        if (audioManager != null && audioManager.getMode() != 3) {
            Log.w("AppRtcAudioManager", "Mode != MODE_IN_COMMUNICATION");
            if (C1134c.m6537a().mo6563M()) {
                this.f13056b.setMode(3);
            }
        }
        if (this.f13058d == c.UNINITIALIZED) {
            Log.d("AppRtcAudioManager", "updateAudioDeviceState: amState == AudioManagerState.UNINITIALIZED");
            return;
        }
        HashSet hashSet = new HashSet();
        if (this.f13066l.m13763t()) {
            hashSet.add(b.BLUETOOTH);
        }
        if (this.f13062h) {
            hashSet.add(b.WIRED_HEADSET);
        } else {
            hashSet.add(b.SPEAKER_PHONE);
            if (m13679j()) {
                hashSet.add(b.EARPIECE);
            }
        }
        boolean z10 = !this.f13067m.equals(hashSet);
        this.f13067m = hashSet;
        if (this.f13066l.m13763t()) {
            bVar = b.BLUETOOTH;
        } else if (this.f13062h) {
            bVar = b.WIRED_HEADSET;
        } else {
            bVar = this.f13064j;
        }
        if (bVar != this.f13065k || z10) {
            m13689t(bVar);
            Log.d("AppRtcAudioManager", "New device status: available=" + this.f13067m + ", selected=" + bVar);
            if (this.f13057c != null) {
                HashSet hashSet2 = new HashSet();
                Iterator<b> it = this.f13067m.iterator();
                while (it.hasNext()) {
                    hashSet2.add(it.next().toString());
                }
                this.f13057c.onAudioDeviceChanged(this.f13065k.toString(), hashSet2);
            }
        }
        Log.d("AppRtcAudioManager", "<--- updateAudioDeviceState done");
    }

    @Override // org.webrtc.voiceengine.AppAudioManagerBase
    public void onDispose() {
        if (this.f13058d != c.UNINITIALIZED) {
            stopCommunication();
        }
    }

    @Override // org.webrtc.voiceengine.AppAudioManagerBase
    public void setActivityForPermissionRequest(ActivityC0153c activityC0153c) {
    }

    @Override // org.webrtc.voiceengine.AppAudioManagerBase
    public void startCommunication(final AppAudioManagerBase.AudioManagerEvents audioManagerEvents) {
        Log.d("AppRtcAudioManager", "startCommunication");
        this.f13063i++;
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: ec.d
            @Override // java.lang.Runnable
            public final void run() {
                C3113e.this.m13684o(audioManagerEvents);
            }
        });
    }

    @Override // org.webrtc.voiceengine.AppAudioManagerBase
    public void stopCommunication() {
        Log.d("AppRtcAudioManager", "stopCommunication");
        int i10 = this.f13063i - 1;
        this.f13063i = i10;
        if (i10 == 0) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: ec.c
                @Override // java.lang.Runnable
                public final void run() {
                    C3113e.this.m13695x();
                }
            });
        }
    }

    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public void m13684o(AppAudioManagerBase.AudioManagerEvents audioManagerEvents) {
        Log.d("AppRtcAudioManager", "start");
        C3216a.m14300f();
        if (this.f13056b == null) {
            Log.w("AppRtcAudioManager", "start: audioManager == null");
            return;
        }
        c cVar = this.f13058d;
        c cVar2 = c.RUNNING;
        if (cVar == cVar2) {
            Log.w("AppRtcAudioManager", "AudioManager is already active");
            return;
        }
        Log.d("AppRtcAudioManager", "AudioManager starts...");
        this.f13057c = audioManagerEvents;
        this.f13058d = cVar2;
        this.f13059e = this.f13056b.getMode();
        this.f13060f = this.f13056b.isSpeakerphoneOn();
        this.f13061g = this.f13056b.isMicrophoneMute();
        this.f13062h = m13680k();
        this.f13069o = new AudioManager.OnAudioFocusChangeListener() { // from class: ec.a
            @Override // android.media.AudioManager.OnAudioFocusChangeListener
            public final void onAudioFocusChange(int i10) {
                C3113e.m13683n(i10);
            }
        };
        m13686q();
        this.f13056b.setMode(3);
        m13690u(false);
        this.f13065k = b.NONE;
        this.f13067m.clear();
        this.f13066l.m13756E();
        m13693z();
        m13685p(this.f13068n, new IntentFilter("android.intent.action.HEADSET_PLUG"));
        Log.d("AppRtcAudioManager", "AudioManager started");
    }

    /* renamed from: x */
    public void m13695x() {
        Log.d("AppRtcAudioManager", "stop");
        C3216a.m14300f();
        if (this.f13058d != c.RUNNING) {
            Log.w("AppRtcAudioManager", "Trying to stop AudioManager in incorrect state: " + this.f13058d);
            return;
        }
        this.f13058d = c.UNINITIALIZED;
        m13692y(this.f13068n);
        this.f13066l.m13757I();
        if (this.f13056b != null) {
            m13691v(this.f13060f);
            m13690u(this.f13061g);
            int i10 = this.f13059e;
            if (i10 != -2) {
                this.f13056b.setMode(i10);
            }
            m13673d();
        }
        this.f13069o = null;
        Log.d("AppRtcAudioManager", "Abandoned audio focus for VOICE_CALL streams");
        this.f13057c = null;
        Log.d("AppRtcAudioManager", "AudioManager stopped");
    }
}
