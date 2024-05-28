package org.webrtc;

import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public class Logging {

    /* renamed from: a */
    private static final Logger f17392a = m17628a();

    /* renamed from: b */
    private static volatile boolean f17393b;

    /* renamed from: c */
    private static InterfaceC4204a f17394c;

    /* renamed from: d */
    private static EnumC4203b f17395d;

    /* renamed from: org.webrtc.Logging$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C4202a {

        /* renamed from: a */
        static final /* synthetic */ int[] f17396a;

        static {
            int[] iArr = new int[EnumC4203b.values().length];
            f17396a = iArr;
            try {
                iArr[EnumC4203b.LS_ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17396a[EnumC4203b.LS_WARNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17396a[EnumC4203b.LS_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* renamed from: org.webrtc.Logging$b */
    /* loaded from: classes.dex */
    public enum EnumC4203b {
        LS_VERBOSE,
        LS_INFO,
        LS_WARNING,
        LS_ERROR,
        LS_NONE
    }

    /* renamed from: a */
    private static Logger m17628a() {
        Logger logger = Logger.getLogger("org.webrtc.Logging");
        logger.setLevel(Level.ALL);
        return logger;
    }

    /* renamed from: b */
    public static void m17629b(String str, String str2) {
        m17631d(EnumC4203b.LS_INFO, str, str2);
    }

    /* renamed from: c */
    public static void m17630c(String str, String str2) {
        m17631d(EnumC4203b.LS_ERROR, str, str2);
    }

    /* renamed from: d */
    public static void m17631d(EnumC4203b enumC4203b, String str, String str2) {
        Level level;
        if (str != null && str2 != null) {
            if (f17394c != null) {
                if (enumC4203b.ordinal() < f17395d.ordinal()) {
                    return;
                }
                f17394c.m17633a(str2, enumC4203b, str);
                return;
            }
            if (f17393b) {
                nativeLog(enumC4203b.ordinal(), str, str2);
                return;
            }
            int i10 = C4202a.f17396a[enumC4203b.ordinal()];
            if (i10 == 1) {
                level = Level.SEVERE;
            } else if (i10 == 2) {
                level = Level.WARNING;
            } else if (i10 != 3) {
                level = Level.FINE;
            } else {
                level = Level.INFO;
            }
            f17392a.log(level, str + ": " + str2);
            return;
        }
        throw new IllegalArgumentException("Logging tag or message may not be null.");
    }

    /* renamed from: e */
    public static void m17632e(String str, String str2) {
        m17631d(EnumC4203b.LS_WARNING, str, str2);
    }

    private static native void nativeLog(int i10, String str, String str2);
}
