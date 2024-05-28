package com.roblox.engine.jni.model;

/* loaded from: classes.dex */
public class BatteryStatus {
    public Boolean batteryLow;
    public Integer batteryPercentage;
    public Integer chargeCounter;
    public Integer currentAverage;
    public Integer currentNow;
    public Long energyCounter;
    public Integer health;
    public Integer plugged;
    public Integer power;
    public Boolean present;
    public Integer status;
    public String technology;
    public Float temperature;
    public Integer voltage;

    /* renamed from: com.roblox.engine.jni.model.BatteryStatus$a */
    /* loaded from: classes.dex */
    public enum EnumC2937a {
        UNKNOWN(0, 1),
        GOOD(1, 2),
        OVERHEAT(2, 3),
        DEAD(3, 4),
        OVER_VOLTAGE(4, 5),
        UNSPECFIED_FAILURE(5, 6),
        COLD(6, 7);

        public final int androidValue;
        public final int robloxValue;

        EnumC2937a(int i10, int i11) {
            this.robloxValue = i10;
            this.androidValue = i11;
        }

        /* renamed from: b */
        public static int m13323b(Integer num) {
            if (num == null) {
                return UNKNOWN.robloxValue;
            }
            for (EnumC2937a enumC2937a : values()) {
                if (enumC2937a.androidValue == num.intValue()) {
                    return enumC2937a.robloxValue;
                }
            }
            return UNKNOWN.robloxValue;
        }
    }

    /* renamed from: com.roblox.engine.jni.model.BatteryStatus$b */
    /* loaded from: classes.dex */
    public enum EnumC2938b {
        UNKNOWN(-1, -1),
        NOT_PLUGGED(0, 0),
        AC(1, 1),
        USB(2, 2),
        WIRELESS(4, 4),
        DOCK(8, 8);

        public final int androidValue;
        public final int robloxValue;

        EnumC2938b(int i10, int i11) {
            this.robloxValue = i10;
            this.androidValue = i11;
        }
    }

    /* renamed from: com.roblox.engine.jni.model.BatteryStatus$c */
    /* loaded from: classes.dex */
    public enum EnumC2939c {
        UNKNOWN(1, 1),
        CHARGING(2, 2),
        DISCHARGING(3, 3),
        NOT_CHARGING(4, 4),
        FULL(5, 5);

        public final int androidValue;
        public final int robloxValue;

        EnumC2939c(int i10, int i11) {
            this.robloxValue = i10;
            this.androidValue = i11;
        }

        /* renamed from: b */
        public static EnumC2939c m13324b(Integer num) {
            if (num == null) {
                return UNKNOWN;
            }
            for (EnumC2939c enumC2939c : values()) {
                if (enumC2939c.androidValue == num.intValue()) {
                    return enumC2939c;
                }
            }
            return UNKNOWN;
        }
    }
}
