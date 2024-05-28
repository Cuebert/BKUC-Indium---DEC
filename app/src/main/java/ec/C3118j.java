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
import com.roblox.audio.AbstractC2714a;
import ec.C3120l;
import java.util.HashSet;
import java.util.Set;
import p033c7.C1134c;
import p079fc.C3216a;

/* renamed from: ec.j */
/* loaded from: classes.dex */
public class C3118j extends AbstractC2714a {

    /* renamed from: b */
    private final Context f13087b;

    /* renamed from: c */
    private final AudioManager f13088c;

    /* renamed from: d */
    private AbstractC2714a.b f13089d;

    /* renamed from: e */
    private b f13090e;

    /* renamed from: g */
    private boolean f13092g;

    /* renamed from: h */
    private boolean f13093h;

    /* renamed from: i */
    private boolean f13094i;

    /* renamed from: k */
    private final AbstractC2714a.a f13096k;

    /* renamed from: l */
    private AbstractC2714a.a f13097l;

    /* renamed from: m */
    private final C3120l f13098m;

    /* renamed from: o */
    private final BroadcastReceiver f13100o;

    /* renamed from: p */
    private AudioManager.OnAudioFocusChangeListener f13101p;

    /* renamed from: q */
    private AudioFocusRequest f13102q;

    /* renamed from: f */
    private int f13091f = -2;

    /* renamed from: j */
    private int f13095j = 0;

    /* renamed from: n */
    private Set<AbstractC2714a.a> f13099n = new HashSet();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ec.j$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f13103a;

        static {
            int[] iArr = new int[AbstractC2714a.a.values().length];
            f13103a = iArr;
            try {
                iArr[AbstractC2714a.a.SPEAKER_PHONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13103a[AbstractC2714a.a.EARPIECE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13103a[AbstractC2714a.a.WIRED_HEADSET.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f13103a[AbstractC2714a.a.BLUETOOTH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ec.j$b */
    /* loaded from: classes.dex */
    public enum b {
        UNINITIALIZED,
        RUNNING
    }

    /* renamed from: ec.j$c */
    /* loaded from: classes.dex */
    private class c extends BroadcastReceiver {
        private c() {
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
            Log.d("AppRtcAudioManagerNew", sb2.toString());
            C3118j.this.f13094i = intExtra == 1;
            C3118j.this.m13703J();
        }

        /* synthetic */ c(C3118j c3118j, a aVar) {
            this();
        }
    }

    private C3118j(Context context) {
        Log.d("AppRtcAudioManagerNew", "ctor");
        C3216a.m14300f();
        this.f13087b = context;
        this.f13088c = (AudioManager) context.getSystemService("audio");
        this.f13098m = C3120l.m13746n(context, new C3120l.f() { // from class: ec.g
            @Override // ec.C3120l.f
            /* renamed from: a */
            public final void mo13669a() {
                C3118j.this.m13703J();
            }
        });
        this.f13100o = new c(this, null);
        this.f13090e = b.UNINITIALIZED;
        AbstractC2714a.a aVar = AbstractC2714a.a.SPEAKER_PHONE;
        this.f13096k = aVar;
        Log.d("AppRtcAudioManagerNew", "defaultAudioDevice: " + aVar);
        C3216a.m14315u("AppRtcAudioManagerNew");
        m12099h(this);
    }

    /* renamed from: A */
    private void m13696A() {
        if (C1134c.m6537a().mo6598c0() && Build.VERSION.SDK_INT >= 26) {
            m13698C();
        } else {
            m13697B();
        }
    }

    /* renamed from: B */
    private void m13697B() {
        AudioManager audioManager = this.f13088c;
        if (audioManager == null) {
            return;
        }
        if (audioManager.requestAudioFocus(this.f13101p, 0, 2) == 1) {
            Log.d("AppRtcAudioManagerNew", "Audio focus request granted for VOICE_CALL streams");
        } else {
            Log.e("AppRtcAudioManagerNew", "Audio focus request failed");
        }
    }

    @TargetApi(26)
    /* renamed from: C */
    private void m13698C() {
        if (this.f13088c == null) {
            return;
        }
        AudioFocusRequest build = new AudioFocusRequest.Builder(2).setAudioAttributes(new AudioAttributes.Builder().setUsage(2).setContentType(1).build()).setAcceptsDelayedFocusGain(true).setWillPauseWhenDucked(true).setOnAudioFocusChangeListener(this.f13101p).build();
        this.f13102q = build;
        Log.d("AppRtcAudioManagerNew", "requestAudioFocusNew: result = " + C3216a.m14302h(this.f13088c.requestAudioFocus(build)));
    }

    /* renamed from: D */
    private void m13699D(AbstractC2714a.a aVar) {
        Log.d("AppRtcAudioManagerNew", "setAudioDeviceInternal(device=" + aVar + ")");
        C3216a.m14295a(this.f13099n.contains(aVar));
        int i10 = a.f13103a[aVar.ordinal()];
        if (i10 == 1) {
            m13701F(true);
        } else if (i10 != 2 && i10 != 3 && i10 != 4) {
            Log.e("AppRtcAudioManagerNew", "Invalid audio device selection");
        } else {
            m13701F(false);
        }
        this.f13097l = aVar;
    }

    /* renamed from: E */
    private void m13700E(boolean z10) {
        AudioManager audioManager = this.f13088c;
        if (audioManager == null || audioManager.isMicrophoneMute() == z10) {
            return;
        }
        this.f13088c.setMicrophoneMute(z10);
    }

    /* renamed from: F */
    private void m13701F(boolean z10) {
        AudioManager audioManager = this.f13088c;
        if (audioManager == null || audioManager.isSpeakerphoneOn() == z10) {
            return;
        }
        this.f13088c.setSpeakerphoneOn(z10);
    }

    /* renamed from: I */
    private void m13702I(BroadcastReceiver broadcastReceiver) {
        this.f13087b.unregisterReceiver(broadcastReceiver);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: J */
    public void m13703J() {
        AbstractC2714a.a aVar;
        C3216a.m14300f();
        Log.d("AppRtcAudioManagerNew", "---> updateAudioDeviceState: wired headset=" + this.f13094i + ", BT isHeadsetAvailable=" + this.f13098m.m13762s());
        Log.d("AppRtcAudioManagerNew", "Device status: available=" + this.f13099n + ", selected=" + this.f13097l);
        AudioManager audioManager = this.f13088c;
        if (audioManager != null && audioManager.getMode() != 3) {
            Log.w("AppRtcAudioManagerNew", "Mode != MODE_IN_COMMUNICATION");
        }
        if (this.f13090e == b.UNINITIALIZED) {
            Log.d("AppRtcAudioManagerNew", "updateAudioDeviceState: amState == AudioManagerState.UNINITIALIZED");
            return;
        }
        HashSet hashSet = new HashSet();
        if (this.f13098m.m13763t()) {
            hashSet.add(AbstractC2714a.a.BLUETOOTH);
        }
        if (this.f13094i) {
            hashSet.add(AbstractC2714a.a.WIRED_HEADSET);
        } else {
            hashSet.add(AbstractC2714a.a.SPEAKER_PHONE);
            if (m13713t()) {
                hashSet.add(AbstractC2714a.a.EARPIECE);
            }
        }
        boolean z10 = !this.f13099n.equals(hashSet);
        this.f13099n = hashSet;
        if (this.f13098m.m13763t()) {
            aVar = AbstractC2714a.a.BLUETOOTH;
        } else if (this.f13094i) {
            aVar = AbstractC2714a.a.WIRED_HEADSET;
        } else {
            aVar = this.f13096k;
        }
        if (aVar != this.f13097l || z10) {
            m13699D(aVar);
            Log.d("AppRtcAudioManagerNew", "New device status: available=" + this.f13099n + ", selected=" + aVar);
            AbstractC2714a.b bVar = this.f13089d;
            if (bVar != null) {
                bVar.mo12091a(this.f13097l, this.f13099n);
            }
        }
        Log.d("AppRtcAudioManagerNew", "<--- updateAudioDeviceState done");
    }

    /* renamed from: n */
    private void m13707n() {
        if (C1134c.m6537a().mo6598c0() && Build.VERSION.SDK_INT >= 26) {
            m13709p();
        } else {
            m13708o();
        }
    }

    /* renamed from: o */
    private void m13708o() {
        AudioManager audioManager = this.f13088c;
        if (audioManager == null) {
            return;
        }
        audioManager.abandonAudioFocus(this.f13101p);
    }

    @TargetApi(26)
    /* renamed from: p */
    private void m13709p() {
        AudioManager audioManager = this.f13088c;
        if (audioManager == null) {
            return;
        }
        audioManager.abandonAudioFocusRequest(this.f13102q);
    }

    /* renamed from: s */
    public static C3118j m13712s(Context context) {
        return new C3118j(context);
    }

    /* renamed from: t */
    private boolean m13713t() {
        return this.f13087b.getPackageManager().hasSystemFeature("android.hardware.telephony");
    }

    /* renamed from: u */
    private boolean m13714u() {
        if (this.f13088c == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT < 23) {
            return m13715v();
        }
        return m13716w();
    }

    /* renamed from: v */
    private boolean m13715v() {
        AudioManager audioManager = this.f13088c;
        if (audioManager == null) {
            return false;
        }
        return audioManager.isWiredHeadsetOn();
    }

    @TargetApi(23)
    /* renamed from: w */
    private boolean m13716w() {
        AudioManager audioManager = this.f13088c;
        if (audioManager == null) {
            return false;
        }
        for (AudioDeviceInfo audioDeviceInfo : audioManager.getDevices(3)) {
            int type = audioDeviceInfo.getType();
            if (type == 3) {
                Log.d("AppRtcAudioManagerNew", "hasWiredHeadset: found wired headset");
                return true;
            }
            if (type == 11) {
                Log.d("AppRtcAudioManagerNew", "hasWiredHeadset: found USB audio device");
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x */
    public static /* synthetic */ void m13717x(int i10) {
        Log.d("AppRtcAudioManagerNew", "onAudioFocusChange: " + C3216a.m14301g(i10));
    }

    /* renamed from: z */
    private void m13719z(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        this.f13087b.registerReceiver(broadcastReceiver, intentFilter);
    }

    /* renamed from: G, reason: merged with bridge method [inline-methods] */
    public void m13718y(AbstractC2714a.b bVar) {
        Log.d("AppRtcAudioManagerNew", "start");
        C3216a.m14300f();
        if (this.f13088c == null) {
            Log.w("AppRtcAudioManagerNew", "start: audioManager == null");
            return;
        }
        b bVar2 = this.f13090e;
        b bVar3 = b.RUNNING;
        if (bVar2 == bVar3) {
            Log.w("AppRtcAudioManagerNew", "AudioManager is already active");
            return;
        }
        Log.d("AppRtcAudioManagerNew", "AudioManager starts...");
        this.f13089d = bVar;
        this.f13090e = bVar3;
        this.f13091f = this.f13088c.getMode();
        this.f13092g = this.f13088c.isSpeakerphoneOn();
        this.f13093h = this.f13088c.isMicrophoneMute();
        this.f13094i = m13714u();
        this.f13101p = new AudioManager.OnAudioFocusChangeListener() { // from class: ec.f
            @Override // android.media.AudioManager.OnAudioFocusChangeListener
            public final void onAudioFocusChange(int i10) {
                C3118j.m13717x(i10);
            }
        };
        m13696A();
        this.f13088c.setMode(3);
        m13700E(false);
        this.f13097l = AbstractC2714a.a.NONE;
        this.f13099n.clear();
        this.f13098m.m13756E();
        m13703J();
        m13719z(this.f13100o, new IntentFilter("android.intent.action.HEADSET_PLUG"));
        Log.d("AppRtcAudioManagerNew", "AudioManager started");
    }

    /* renamed from: H */
    public void m13721H() {
        Log.d("AppRtcAudioManagerNew", "stop");
        C3216a.m14300f();
        if (this.f13090e != b.RUNNING) {
            Log.w("AppRtcAudioManagerNew", "Trying to stop AudioManager in incorrect state: " + this.f13090e);
            return;
        }
        this.f13090e = b.UNINITIALIZED;
        m13702I(this.f13100o);
        this.f13098m.m13757I();
        if (this.f13088c != null) {
            m13701F(this.f13092g);
            m13700E(this.f13093h);
            int i10 = this.f13091f;
            if (i10 != -2) {
                this.f13088c.setMode(i10);
            }
            m13707n();
        }
        this.f13101p = null;
        Log.d("AppRtcAudioManagerNew", "Abandoned audio focus for VOICE_CALL streams");
        this.f13089d = null;
        Log.d("AppRtcAudioManagerNew", "AudioManager stopped");
    }

    @Override // com.roblox.audio.AbstractC2714a
    /* renamed from: c */
    public AbstractC2714a.a mo12095c() {
        return this.f13097l;
    }

    @Override // com.roblox.audio.AbstractC2714a
    /* renamed from: e */
    public void mo12096e() {
        if (this.f13090e != b.UNINITIALIZED) {
            mo12101j();
        }
    }

    @Override // com.roblox.audio.AbstractC2714a
    /* renamed from: f */
    public void mo12097f(ActivityC0153c activityC0153c) {
    }

    @Override // com.roblox.audio.AbstractC2714a
    /* renamed from: i */
    public void mo12100i(final AbstractC2714a.b bVar) {
        Log.d("AppRtcAudioManagerNew", "startCommunication");
        this.f13095j++;
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: ec.i
            @Override // java.lang.Runnable
            public final void run() {
                C3118j.this.m13718y(bVar);
            }
        });
    }

    @Override // com.roblox.audio.AbstractC2714a
    /* renamed from: j */
    public void mo12101j() {
        Log.d("AppRtcAudioManagerNew", "stopCommunication");
        int i10 = this.f13095j - 1;
        this.f13095j = i10;
        if (i10 == 0) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: ec.h
                @Override // java.lang.Runnable
                public final void run() {
                    C3118j.this.m13721H();
                }
            });
        }
    }
}
