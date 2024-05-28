package androidx.camera.camera2.internal;

import android.graphics.Rect;
import android.hardware.camera2.CaptureResult;
import android.os.Build;
import androidx.camera.core.C0463q1;
import androidx.camera.core.impl.utils.C0427g;
import p279w.C5043j2;
import p279w.C5064p;
import p279w.EnumC5044k;
import p279w.EnumC5048l;
import p279w.EnumC5052m;
import p279w.EnumC5056n;
import p279w.EnumC5060o;
import p279w.InterfaceC5068q;

/* renamed from: androidx.camera.camera2.internal.e */
/* loaded from: classes.dex */
public class C0287e implements InterfaceC5068q {

    /* renamed from: a */
    private final C5043j2 f1275a;

    /* renamed from: b */
    private final CaptureResult f1276b;

    public C0287e(C5043j2 c5043j2, CaptureResult captureResult) {
        this.f1275a = c5043j2;
        this.f1276b = captureResult;
    }

    @Override // p279w.InterfaceC5068q
    /* renamed from: a */
    public C5043j2 mo1383a() {
        return this.f1275a;
    }

    @Override // p279w.InterfaceC5068q
    /* renamed from: b */
    public void mo1384b(C0427g.b bVar) {
        Integer num;
        C5064p.m19657a(this, bVar);
        Rect rect = (Rect) this.f1276b.get(CaptureResult.SCALER_CROP_REGION);
        if (rect != null) {
            bVar.m2105j(rect.width()).m2104i(rect.height());
        }
        Integer num2 = (Integer) this.f1276b.get(CaptureResult.JPEG_ORIENTATION);
        if (num2 != null) {
            bVar.m2108m(num2.intValue());
        }
        Long l10 = (Long) this.f1276b.get(CaptureResult.SENSOR_EXPOSURE_TIME);
        if (l10 != null) {
            bVar.m2101f(l10.longValue());
        }
        Float f10 = (Float) this.f1276b.get(CaptureResult.LENS_APERTURE);
        if (f10 != null) {
            bVar.m2107l(f10.floatValue());
        }
        Integer num3 = (Integer) this.f1276b.get(CaptureResult.SENSOR_SENSITIVITY);
        if (num3 != null) {
            if (Build.VERSION.SDK_INT >= 24 && (num = (Integer) this.f1276b.get(CaptureResult.CONTROL_POST_RAW_SENSITIVITY_BOOST)) != null) {
                num3 = Integer.valueOf(num3.intValue() * ((int) (num.intValue() / 100.0f)));
            }
            bVar.m2106k(num3.intValue());
        }
        Float f11 = (Float) this.f1276b.get(CaptureResult.LENS_FOCAL_LENGTH);
        if (f11 != null) {
            bVar.m2103h(f11.floatValue());
        }
        Integer num4 = (Integer) this.f1276b.get(CaptureResult.CONTROL_AWB_MODE);
        if (num4 != null) {
            C0427g.c cVar = C0427g.c.AUTO;
            if (num4.intValue() == 0) {
                cVar = C0427g.c.MANUAL;
            }
            bVar.m2109n(cVar);
        }
    }

    @Override // p279w.InterfaceC5068q
    /* renamed from: c */
    public long mo1385c() {
        Long l10 = (Long) this.f1276b.get(CaptureResult.SENSOR_TIMESTAMP);
        if (l10 == null) {
            return -1L;
        }
        return l10.longValue();
    }

    @Override // p279w.InterfaceC5068q
    /* renamed from: d */
    public EnumC5060o mo1386d() {
        Integer num = (Integer) this.f1276b.get(CaptureResult.FLASH_STATE);
        if (num == null) {
            return EnumC5060o.UNKNOWN;
        }
        int intValue = num.intValue();
        if (intValue == 0 || intValue == 1) {
            return EnumC5060o.NONE;
        }
        if (intValue == 2) {
            return EnumC5060o.READY;
        }
        if (intValue != 3 && intValue != 4) {
            C0463q1.m2204c("C2CameraCaptureResult", "Undefined flash state: " + num);
            return EnumC5060o.UNKNOWN;
        }
        return EnumC5060o.FIRED;
    }

    @Override // p279w.InterfaceC5068q
    /* renamed from: e */
    public CaptureResult mo1387e() {
        return this.f1276b;
    }

    /* renamed from: f */
    public EnumC5044k m1388f() {
        Integer num = (Integer) this.f1276b.get(CaptureResult.CONTROL_AE_STATE);
        if (num == null) {
            return EnumC5044k.UNKNOWN;
        }
        int intValue = num.intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                if (intValue == 2) {
                    return EnumC5044k.CONVERGED;
                }
                if (intValue == 3) {
                    return EnumC5044k.LOCKED;
                }
                if (intValue == 4) {
                    return EnumC5044k.FLASH_REQUIRED;
                }
                if (intValue != 5) {
                    C0463q1.m2204c("C2CameraCaptureResult", "Undefined ae state: " + num);
                    return EnumC5044k.UNKNOWN;
                }
            }
            return EnumC5044k.SEARCHING;
        }
        return EnumC5044k.INACTIVE;
    }

    /* renamed from: g */
    public EnumC5048l m1389g() {
        Integer num = (Integer) this.f1276b.get(CaptureResult.CONTROL_AF_MODE);
        if (num == null) {
            return EnumC5048l.UNKNOWN;
        }
        int intValue = num.intValue();
        if (intValue != 0) {
            if (intValue == 1 || intValue == 2) {
                return EnumC5048l.ON_MANUAL_AUTO;
            }
            if (intValue == 3 || intValue == 4) {
                return EnumC5048l.ON_CONTINUOUS_AUTO;
            }
            if (intValue != 5) {
                C0463q1.m2204c("C2CameraCaptureResult", "Undefined af mode: " + num);
                return EnumC5048l.UNKNOWN;
            }
        }
        return EnumC5048l.OFF;
    }

    /* renamed from: h */
    public EnumC5052m m1390h() {
        Integer num = (Integer) this.f1276b.get(CaptureResult.CONTROL_AF_STATE);
        if (num == null) {
            return EnumC5052m.UNKNOWN;
        }
        switch (num.intValue()) {
            case 0:
                return EnumC5052m.INACTIVE;
            case 1:
            case 3:
                return EnumC5052m.SCANNING;
            case 2:
                return EnumC5052m.PASSIVE_FOCUSED;
            case 4:
                return EnumC5052m.LOCKED_FOCUSED;
            case 5:
                return EnumC5052m.LOCKED_NOT_FOCUSED;
            case 6:
                return EnumC5052m.PASSIVE_NOT_FOCUSED;
            default:
                C0463q1.m2204c("C2CameraCaptureResult", "Undefined af state: " + num);
                return EnumC5052m.UNKNOWN;
        }
    }

    /* renamed from: i */
    public EnumC5056n m1391i() {
        Integer num = (Integer) this.f1276b.get(CaptureResult.CONTROL_AWB_STATE);
        if (num == null) {
            return EnumC5056n.UNKNOWN;
        }
        int intValue = num.intValue();
        if (intValue == 0) {
            return EnumC5056n.INACTIVE;
        }
        if (intValue == 1) {
            return EnumC5056n.METERING;
        }
        if (intValue == 2) {
            return EnumC5056n.CONVERGED;
        }
        if (intValue != 3) {
            C0463q1.m2204c("C2CameraCaptureResult", "Undefined awb state: " + num);
            return EnumC5056n.UNKNOWN;
        }
        return EnumC5056n.LOCKED;
    }

    public C0287e(CaptureResult captureResult) {
        this(C5043j2.m19576a(), captureResult);
    }
}
