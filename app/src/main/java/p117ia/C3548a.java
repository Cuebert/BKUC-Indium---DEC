package p117ia;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.os.VibratorManager;
import com.roblox.universalapp.messagebus.Callback;
import com.roblox.universalapp.messagebus.Connection;
import com.roblox.universalapp.messagebus.MessageBus;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;
import org.json.JSONException;
import org.json.JSONObject;
import p035c9.C1151k;

/* renamed from: ia.a */
/* loaded from: classes.dex */
public class C3548a {

    /* renamed from: j */
    private static C3548a f15132j = new C3548a();

    /* renamed from: a */
    private MessageBus f15133a = MessageBus.m13364e();

    /* renamed from: b */
    private ArrayList<Connection> f15134b = new ArrayList<>();

    /* renamed from: c */
    private final int f15135c = Build.VERSION.SDK_INT;

    /* renamed from: d */
    private boolean f15136d = false;

    /* renamed from: e */
    private Timer f15137e = null;

    /* renamed from: f */
    private Vibrator f15138f = null;

    /* renamed from: g */
    private float f15139g = 0.0f;

    /* renamed from: h */
    private boolean f15140h = true;

    /* renamed from: i */
    private int f15141i = 0;

    /* renamed from: ia.a$a */
    /* loaded from: classes.dex */
    class a implements Callback {
        a() {
        }

        @Override // com.roblox.universalapp.messagebus.Callback
        /* renamed from: a */
        public void mo6401a(JSONObject jSONObject) {
            boolean m15358g = C3548a.this.m15358g();
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("supportsHaptics", m15358g);
                C3548a.this.f15133a.publishProtocolMethodResponseRaw("HapticProtocol", "SupportsHaptics", jSONObject2.toString(), 0, "{}");
            } catch (JSONException unused) {
                C1151k.m6709c("HapticProtocol", "Failed to write supportsHaptics in response to SupportsHaptics request");
            }
        }
    }

    /* renamed from: ia.a$b */
    /* loaded from: classes.dex */
    class b implements Callback {
        b() {
        }

        @Override // com.roblox.universalapp.messagebus.Callback
        /* renamed from: a */
        public void mo6401a(JSONObject jSONObject) {
            try {
                C3548a.this.f15139g = Float.valueOf(jSONObject.getString("intensity")).floatValue();
                C3548a.this.m15360j();
            } catch (JSONException unused) {
                C1151k.m6709c("HapticProtocol", "Failed to parse JSON in UpdateSingletonVibration request");
            }
        }
    }

    /* renamed from: ia.a$c */
    /* loaded from: classes.dex */
    class c extends TimerTask {
        c() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            C3548a.this.f15140h = true;
            C3548a.this.m15360j();
        }
    }

    /* renamed from: f */
    public static C3548a m15354f() {
        return f15132j;
    }

    @TargetApi(31)
    /* renamed from: i */
    private Vibrator m15355i(Context context) {
        return ((VibratorManager) context.getSystemService("vibrator_manager")).getDefaultVibrator();
    }

    /* renamed from: d */
    public void m15356d() {
        int i10 = this.f15141i + 1;
        this.f15141i = i10;
        if (i10 != 1) {
            return;
        }
        Timer timer = new Timer();
        this.f15137e = timer;
        timer.schedule(new c(), 500L);
    }

    /* renamed from: e */
    public void m15357e() {
        int i10 = this.f15141i - 1;
        this.f15141i = i10;
        if (i10 != 0) {
            return;
        }
        Timer timer = this.f15137e;
        if (timer != null) {
            timer.cancel();
            this.f15137e = null;
        }
        this.f15140h = false;
        m15360j();
    }

    /* renamed from: g */
    public boolean m15358g() {
        return this.f15136d;
    }

    /* renamed from: h */
    public void m15359h(Context context) {
        if (this.f15136d) {
            return;
        }
        int i10 = this.f15135c;
        if (i10 >= 31) {
            this.f15138f = m15355i(context);
        } else if (i10 >= 26) {
            this.f15138f = (Vibrator) context.getSystemService("vibrator");
        }
        Vibrator vibrator = this.f15138f;
        if (vibrator == null || !vibrator.hasVibrator()) {
            return;
        }
        this.f15136d = true;
        this.f15134b.add(this.f15133a.m13374o("HapticProtocol", "SupportsHaptics", new a()));
        this.f15134b.add(this.f15133a.m13374o("HapticProtocol", "UpdateSingletonVibration", new b()));
    }

    /* renamed from: j */
    public void m15360j() {
        int i10;
        if (m15358g()) {
            this.f15138f.cancel();
            if (this.f15140h && (i10 = (int) ((this.f15139g * 255.0f) + 0.5d)) != 0) {
                this.f15138f.vibrate(VibrationEffect.createWaveform(new long[]{1000}, new int[]{i10}, 0));
            }
        }
    }
}
