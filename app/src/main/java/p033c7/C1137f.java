package p033c7;

import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p035c9.C1151k;

/* renamed from: c7.f */
/* loaded from: classes.dex */
public class C1137f {

    /* renamed from: f */
    private static C1137f f5472f = new C1137f();

    /* renamed from: a */
    private final Set<String> f5473a = new HashSet();

    /* renamed from: b */
    private boolean f5474b = false;

    /* renamed from: c */
    private final Map<String, Boolean> f5475c = new HashMap();

    /* renamed from: d */
    private boolean f5476d = false;

    /* renamed from: e */
    private final InterfaceC1133b f5477e = C1134c.m6537a();

    C1137f() {
    }

    /* renamed from: c */
    public static C1137f m6665c() {
        if (f5472f == null) {
            synchronized (C1137f.class) {
                if (f5472f == null) {
                    f5472f = new C1137f();
                }
            }
        }
        return f5472f;
    }

    /* renamed from: a */
    public synchronized void m6666a(SharedPreferences sharedPreferences) {
        if (this.f5474b) {
            C1151k.m6716j("Roblox.UniversalFlagCenter", "Duplicate cacheAndLoadServerFlags call! Please file a ticket to NFDN component to report this log.");
            return;
        }
        SharedPreferences.Editor edit = sharedPreferences.edit();
        Iterator<Map.Entry<String, C1132a>> it = this.f5477e.mo6536r1().iterator();
        while (it.hasNext()) {
            C1132a value = it.next().getValue();
            if (value.m6527a()) {
                boolean booleanValue = ((Boolean) value.m6533h(value.m6530d())).booleanValue();
                String m6528b = value.m6528b();
                edit.putBoolean(m6528b, booleanValue);
                C1151k.m6712f("Roblox.UniversalFlagCenter", "Saved " + m6528b + " to SharedPreference with value " + booleanValue);
                if (!this.f5473a.contains(m6528b)) {
                    this.f5475c.put(m6528b, Boolean.valueOf(booleanValue));
                } else {
                    C1151k.m6712f("Roblox.UniversalFlagCenter", "Won't update " + m6528b + " in memory since it's been read before.");
                }
            }
        }
        edit.apply();
        this.f5474b = true;
    }

    /* renamed from: b */
    public synchronized boolean m6667b(String str) {
        if (!this.f5474b) {
            this.f5473a.add(str);
        }
        Boolean bool = this.f5475c.get(str);
        if (bool == null) {
            C1151k.m6709c("Roblox.UniversalFlagCenter", "UniversalFlagCenter doesn't contain " + str + ". Did you add it into UniversalFlagCenter.java?");
            return false;
        }
        return bool.booleanValue();
    }

    /* renamed from: d */
    public synchronized void m6668d(SharedPreferences sharedPreferences) {
        if (this.f5476d) {
            return;
        }
        SharedPreferences.Editor edit = sharedPreferences.edit();
        Iterator<Map.Entry<String, C1132a>> it = this.f5477e.mo6536r1().iterator();
        while (it.hasNext()) {
            C1132a value = it.next().getValue();
            if (value.m6527a()) {
                boolean booleanValue = ((Boolean) value.m6533h(value.m6530d())).booleanValue();
                String m6528b = value.m6528b();
                this.f5475c.put(m6528b, Boolean.valueOf(sharedPreferences.getBoolean(m6528b, booleanValue)));
                edit.remove(m6528b);
                C1151k.m6712f("Roblox.UniversalFlagCenter", "Loaded and removed flag " + m6528b + " from SharedPreference with value " + this.f5475c.get(m6528b));
            }
        }
        edit.commit();
        this.f5476d = true;
    }
}
