package com.roblox.audio;

import androidx.appcompat.app.ActivityC0153c;
import java.util.Set;

/* renamed from: com.roblox.audio.a */
/* loaded from: classes.dex */
public abstract class AbstractC2714a {

    /* renamed from: a */
    private static AbstractC2714a f10318a;

    /* renamed from: com.roblox.audio.a$a */
    /* loaded from: classes.dex */
    public enum a {
        SPEAKER_PHONE,
        WIRED_HEADSET,
        EARPIECE,
        BLUETOOTH,
        NONE
    }

    /* renamed from: com.roblox.audio.a$b */
    /* loaded from: classes.dex */
    public interface b {
        /* renamed from: a */
        void mo12091a(a aVar, Set<a> set);
    }

    /* renamed from: b */
    public static AbstractC2714a m12092b() {
        return f10318a;
    }

    /* renamed from: d */
    public static boolean m12093d() {
        return f10318a != null;
    }

    /* renamed from: a */
    public void m12094a() {
        AbstractC2714a abstractC2714a = f10318a;
        if (this == abstractC2714a) {
            abstractC2714a.mo12096e();
            f10318a = null;
        }
    }

    /* renamed from: c */
    public abstract a mo12095c();

    /* renamed from: e */
    public abstract void mo12096e();

    /* renamed from: f */
    public abstract void mo12097f(ActivityC0153c activityC0153c);

    /* renamed from: g */
    public void m12098g(boolean z10) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: h */
    public void m12099h(AbstractC2714a abstractC2714a) {
        f10318a = abstractC2714a;
    }

    /* renamed from: i */
    public abstract void mo12100i(b bVar);

    /* renamed from: j */
    public abstract void mo12101j();
}
