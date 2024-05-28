package p074f7;

import android.content.Context;
import android.os.Build;
import android.os.PowerManager;
import com.roblox.engine.jni.NativeGLInterface;
import p035c9.C1151k;

/* renamed from: f7.k0 */
/* loaded from: classes.dex */
public class C3182k0 {

    /* renamed from: a */
    private final Context f13250a;

    /* renamed from: b */
    private PowerManager.OnThermalStatusChangedListener f13251b;

    /* renamed from: f7.k0$a */
    /* loaded from: classes.dex */
    class a implements PowerManager.OnThermalStatusChangedListener {
        a() {
        }

        @Override // android.os.PowerManager.OnThermalStatusChangedListener
        public void onThermalStatusChanged(int i10) {
            NativeGLInterface.reportThermalStateChanged(i10);
            C1151k.m6707a("ThermalStatusObserver", "onThermalStatusChanged: " + i10);
        }
    }

    public C3182k0(Context context) {
        this.f13250a = context;
    }

    /* renamed from: a */
    public void m13915a() {
        PowerManager powerManager;
        if (Build.VERSION.SDK_INT < 29 || (powerManager = (PowerManager) this.f13250a.getSystemService("power")) == null) {
            return;
        }
        PowerManager.OnThermalStatusChangedListener onThermalStatusChangedListener = this.f13251b;
        if (onThermalStatusChangedListener != null) {
            powerManager.removeThermalStatusListener(onThermalStatusChangedListener);
        }
        NativeGLInterface.reportThermalStateChanged(powerManager.getCurrentThermalStatus());
        C1151k.m6712f("ThermalStatusObserver", "startObserving");
        a aVar = new a();
        this.f13251b = aVar;
        powerManager.addThermalStatusListener(aVar);
    }

    /* renamed from: b */
    public void m13916b() {
        PowerManager.OnThermalStatusChangedListener onThermalStatusChangedListener;
        if (Build.VERSION.SDK_INT < 29 || this.f13251b == null) {
            return;
        }
        C1151k.m6712f("ThermalStatusObserver", "stopObserving");
        PowerManager powerManager = (PowerManager) this.f13250a.getSystemService("power");
        if (powerManager == null || (onThermalStatusChangedListener = this.f13251b) == null) {
            return;
        }
        powerManager.removeThermalStatusListener(onThermalStatusChangedListener);
        this.f13251b = null;
        NativeGLInterface.reportThermalStateChanged(-1);
    }
}
