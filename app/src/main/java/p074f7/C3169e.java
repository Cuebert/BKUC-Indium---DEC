package p074f7;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.BatteryManager;
import android.os.Build;
import com.roblox.engine.jni.NativeGLInterface;
import com.roblox.engine.jni.model.BatteryStatus;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import p033c7.C1134c;
import p035c9.C1151k;

/* renamed from: f7.e */
/* loaded from: classes.dex */
public class C3169e {

    /* renamed from: g */
    private static final long f13231g;

    /* renamed from: a */
    private final Context f13232a;

    /* renamed from: b */
    private final BatteryManager f13233b;

    /* renamed from: c */
    private BroadcastReceiver f13234c;

    /* renamed from: d */
    private long f13235d = System.currentTimeMillis();

    /* renamed from: e */
    private final ScheduledExecutorService f13236e = Executors.newSingleThreadScheduledExecutor(new ThreadFactory() { // from class: f7.d
        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            Thread m13893l;
            m13893l = C3169e.m13893l(runnable);
            return m13893l;
        }
    });

    /* renamed from: f */
    private ScheduledFuture<?> f13237f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f7.e$a */
    /* loaded from: classes.dex */
    public class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (System.currentTimeMillis() - C3169e.this.f13235d > C3169e.f13231g) {
                C3169e.this.f13235d = System.currentTimeMillis();
                C3169e.this.m13896o(intent);
            }
        }
    }

    static {
        f13231g = C1134c.m6537a().mo6577T() ? 5000L : 30000L;
    }

    public C3169e(Context context) {
        this.f13232a = context;
        this.f13233b = (BatteryManager) context.getSystemService("batterymanager");
    }

    /* renamed from: g */
    private static Boolean m13888g(Intent intent, String str) {
        if (intent == null || !intent.hasExtra(str)) {
            return null;
        }
        return Boolean.valueOf(intent.getBooleanExtra(str, false));
    }

    /* renamed from: h */
    private Integer m13889h(int i10) {
        BatteryManager batteryManager = this.f13233b;
        if (batteryManager == null) {
            return null;
        }
        long longProperty = batteryManager.getLongProperty(i10);
        if (longProperty != Long.MIN_VALUE) {
            return Integer.valueOf((int) longProperty);
        }
        return null;
    }

    /* renamed from: i */
    private static Integer m13890i(Intent intent, String str) {
        int intExtra;
        if (intent == null || !intent.hasExtra(str) || (intExtra = intent.getIntExtra(str, Integer.MIN_VALUE)) == Integer.MIN_VALUE) {
            return null;
        }
        return Integer.valueOf(intExtra);
    }

    /* renamed from: j */
    private Long m13891j(int i10) {
        BatteryManager batteryManager = this.f13233b;
        if (batteryManager == null) {
            return null;
        }
        long longProperty = batteryManager.getLongProperty(i10);
        if (longProperty != Long.MIN_VALUE) {
            return Long.valueOf(longProperty);
        }
        return null;
    }

    /* renamed from: k */
    private String m13892k(int i10) {
        return i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? "BATTERY_STATUS_UNKNOWN" : "BATTERY_STATUS_FULL" : "BATTERY_STATUS_NOT_CHARGING" : "BATTERY_STATUS_DISCHARGING" : "BATTERY_STATUS_CHARGING";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public static /* synthetic */ Thread m13893l(Runnable runnable) {
        Thread thread = new Thread(runnable);
        thread.setName("BatteryStatusObserver-" + System.currentTimeMillis());
        thread.setDaemon(true);
        return thread;
    }

    /* renamed from: m */
    public static BatteryStatus.EnumC2938b m13894m(Integer num) {
        if (num == null) {
            return BatteryStatus.EnumC2938b.UNKNOWN;
        }
        for (BatteryStatus.EnumC2938b enumC2938b : BatteryStatus.EnumC2938b.values()) {
            if (enumC2938b.androidValue == num.intValue()) {
                return enumC2938b;
            }
        }
        return BatteryStatus.EnumC2938b.UNKNOWN;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public void m13895n() {
        Integer num;
        Intent registerReceiver = this.f13232a.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver == null) {
            return;
        }
        BatteryStatus batteryStatus = new BatteryStatus();
        batteryStatus.chargeCounter = m13889h(1);
        Integer m13889h = m13889h(2);
        batteryStatus.currentNow = m13889h;
        if (m13889h != null && Math.abs(m13889h.intValue()) < 42000) {
            batteryStatus.currentNow = Integer.valueOf(batteryStatus.currentNow.intValue() * 1000);
        }
        Integer m13889h2 = m13889h(3);
        batteryStatus.currentAverage = m13889h2;
        if (m13889h2 != null && Math.abs(m13889h2.intValue()) < 42000) {
            batteryStatus.currentAverage = Integer.valueOf(batteryStatus.currentAverage.intValue() * 1000);
        }
        batteryStatus.energyCounter = m13891j(5);
        BatteryStatus.EnumC2939c m13324b = BatteryStatus.EnumC2939c.m13324b(m13890i(registerReceiver, "status"));
        batteryStatus.status = Integer.valueOf(m13324b.robloxValue);
        BatteryStatus.EnumC2938b m13894m = m13894m(m13890i(registerReceiver, "plugged"));
        batteryStatus.plugged = Integer.valueOf(m13894m.robloxValue);
        if (m13894m == BatteryStatus.EnumC2938b.NOT_PLUGGED) {
            Integer num2 = batteryStatus.currentNow;
            if (num2 != null && num2.intValue() > 0) {
                batteryStatus.currentNow = Integer.valueOf(-batteryStatus.currentNow.intValue());
                Integer num3 = batteryStatus.currentAverage;
                if (num3 != null) {
                    batteryStatus.currentAverage = Integer.valueOf(-num3.intValue());
                }
            }
        } else if (m13894m != BatteryStatus.EnumC2938b.UNKNOWN && (num = batteryStatus.currentNow) != null && num.intValue() < 0) {
            batteryStatus.currentNow = Integer.valueOf(-batteryStatus.currentNow.intValue());
            Integer num4 = batteryStatus.currentAverage;
            if (num4 != null) {
                batteryStatus.currentAverage = Integer.valueOf(-num4.intValue());
            }
        }
        Integer m13890i = m13890i(registerReceiver, "level");
        Integer m13890i2 = m13890i(registerReceiver, "scale");
        if (m13890i != null && m13890i2 != null) {
            batteryStatus.batteryPercentage = Integer.valueOf((m13890i.intValue() * 100) / m13890i2.intValue());
        }
        if (Build.VERSION.SDK_INT >= 28) {
            batteryStatus.batteryLow = m13888g(registerReceiver, "battery_low");
        }
        batteryStatus.voltage = m13890i(registerReceiver, "voltage");
        if (m13890i(registerReceiver, "temperature") != null) {
            batteryStatus.temperature = Float.valueOf(r4.intValue() / 10.0f);
        }
        batteryStatus.technology = registerReceiver.getStringExtra("technology");
        batteryStatus.health = Integer.valueOf(BatteryStatus.EnumC2937a.m13323b(m13890i(registerReceiver, "health")));
        batteryStatus.present = m13888g(registerReceiver, "present");
        if (batteryStatus.currentNow != null && batteryStatus.voltage != null) {
            batteryStatus.power = Integer.valueOf((int) ((r0.intValue() / 1000.0f) * (batteryStatus.voltage.intValue() / 1000.0f)));
        }
        C1151k.m6712f("rbx.perfdata", "perfdata battery " + m13894m.name() + " " + m13324b.name() + " " + batteryStatus.currentNow + "uAmps " + batteryStatus.power + "mW");
        NativeGLInterface.reportBatteryStatus(batteryStatus);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public void m13896o(Intent intent) {
        int intExtra = (int) ((intent.getIntExtra("level", -1) / intent.getIntExtra("scale", -1)) * 100.0f);
        int intExtra2 = intent.getIntExtra("status", -1);
        C1151k.m6712f("BatteryStatusObserver", "batteryStatus: " + m13892k(intExtra2) + " batteryLevel: " + intExtra);
        NativeGLInterface.reportBatteryStateChanged(intExtra, intExtra2);
    }

    /* renamed from: p */
    public void m13897p() {
        m13899r();
        C1151k.m6712f("BatteryStatusObserver", "startObserving");
        if (!C1134c.m6537a().mo6577T()) {
            m13898q();
        } else {
            this.f13237f = this.f13236e.scheduleAtFixedRate(new Runnable() { // from class: f7.c
                @Override // java.lang.Runnable
                public final void run() {
                    C3169e.this.m13895n();
                }
            }, 0L, f13231g, TimeUnit.MILLISECONDS);
        }
    }

    /* renamed from: q */
    public void m13898q() {
        m13899r();
        C1151k.m6712f("BatteryStatusObserver", "startObserving");
        this.f13234c = new a();
        Intent registerReceiver = this.f13232a.registerReceiver(this.f13234c, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver != null) {
            m13896o(registerReceiver);
        }
    }

    /* renamed from: r */
    public void m13899r() {
        if (this.f13234c != null) {
            C1151k.m6712f("BatteryStatusObserver", "stopObserving");
            this.f13232a.unregisterReceiver(this.f13234c);
            this.f13234c = null;
        }
        ScheduledFuture<?> scheduledFuture = this.f13237f;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            this.f13237f = null;
        }
    }
}
