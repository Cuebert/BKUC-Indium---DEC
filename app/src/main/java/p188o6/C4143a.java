package p188o6;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.widget.Toast;
import androidx.appcompat.app.ActivityC0153c;
import androidx.fragment.app.FragmentManager;
import com.appsflyer.oaid.BuildConfig;
import com.roblox.client.C2748c0;
import p035c9.C1151k;
import p035c9.C1152l;
import p035c9.C1156p;
import p188o6.ViewOnClickListenerC4144b;
import p300x7.C5563e;

/* renamed from: o6.a */
/* loaded from: classes.dex */
public class C4143a implements ViewOnClickListenerC4144b.a {

    /* renamed from: j */
    private static C4143a f16873j;

    /* renamed from: a */
    private SharedPreferences f16874a;

    /* renamed from: b */
    private int f16875b = 0;

    /* renamed from: c */
    private int f16876c = 0;

    /* renamed from: d */
    private int f16877d = 0;

    /* renamed from: e */
    private int f16878e = 0;

    /* renamed from: f */
    private long f16879f = 0;

    /* renamed from: g */
    private int f16880g = 0;

    /* renamed from: h */
    private Boolean f16881h = Boolean.TRUE;

    /* renamed from: i */
    private a f16882i;

    /* renamed from: o6.a$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: a */
        void m17180a();

        /* renamed from: b */
        void m17181b();

        /* renamed from: c */
        void m17182c();
    }

    private C4143a() {
    }

    /* renamed from: e */
    public static C4143a m17168e() {
        C4143a c4143a = f16873j;
        if (c4143a != null) {
            return c4143a;
        }
        synchronized (C4143a.class) {
            if (f16873j == null) {
                f16873j = new C4143a();
            }
        }
        return f16873j;
    }

    /* renamed from: f */
    private C5563e m17169f() {
        return C5563e.m20379h();
    }

    /* renamed from: h */
    public static void m17170h(Context context) {
        C1156p.m6743a(context, "rate_me_maybe").edit().clear().apply();
        C1151k.m6707a("RateMeMaybe", "Cleared RateMeMaybe shared preferences.");
    }

    /* renamed from: k */
    private void m17171k(Activity activity) {
        FragmentManager m4617y0 = ((ActivityC0153c) activity).m4617y0();
        if (m4617y0.m4498j0("rmmFragment") != null) {
            return;
        }
        ViewOnClickListenerC4144b viewOnClickListenerC4144b = new ViewOnClickListenerC4144b();
        viewOnClickListenerC4144b.m17184q2(this);
        try {
            viewOnClickListenerC4144b.mo4608o2(m4617y0, "rmmFragment");
            m17169f().m20388A("Mobile-Ratings-Shown-Android");
        } catch (IllegalStateException e10) {
            C1151k.m6709c("RateMeMaybe", "Exception: " + e10.getMessage());
        }
    }

    @Override // p188o6.ViewOnClickListenerC4144b.a
    /* renamed from: a */
    public void mo17172a(Context context) {
        SharedPreferences.Editor edit = this.f16874a.edit();
        edit.putBoolean("PREF_DONT_SHOW_AGAIN_FOR_THIS_VERSION", true);
        edit.apply();
        try {
            context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + context.getPackageName())));
        } catch (ActivityNotFoundException unused) {
            Toast.makeText(context, C2748c0.f10616a, 0).show();
        }
        a aVar = this.f16882i;
        if (aVar != null) {
            aVar.m17182c();
        }
        m17169f().m20388A("Mobile-Ratings-Yes-Tapped-Android");
    }

    @Override // p188o6.ViewOnClickListenerC4144b.a
    /* renamed from: b */
    public void mo17173b() {
        SharedPreferences.Editor edit = this.f16874a.edit();
        edit.putBoolean("PREF_DONT_SHOW_AGAIN_FOR_THIS_VERSION", true);
        edit.apply();
        a aVar = this.f16882i;
        if (aVar != null) {
            aVar.m17180a();
        }
        m17169f().m20388A("Mobile-Ratings-NotNow-Tapped-Android");
    }

    @Override // p188o6.ViewOnClickListenerC4144b.a
    /* renamed from: c */
    public void mo17174c() {
        if (this.f16881h.booleanValue()) {
            mo17175d();
        } else {
            mo17173b();
        }
    }

    @Override // p188o6.ViewOnClickListenerC4144b.a
    /* renamed from: d */
    public void mo17175d() {
        a aVar = this.f16882i;
        if (aVar != null) {
            aVar.m17181b();
        }
        m17169f().m20388A("Mobile-Ratings-RemindMe-Tapped-Android");
    }

    /* renamed from: g */
    public void m17176g(Context context) {
        SharedPreferences m6743a = C1156p.m6743a(context, "rate_me_maybe");
        this.f16874a = m6743a;
        SharedPreferences.Editor edit = m6743a.edit();
        if (!"2.622.471".equals(this.f16874a.getString("CURRENT_APP_VERSION", BuildConfig.FLAVOR))) {
            m17170h(context);
            edit.putString("CURRENT_APP_VERSION", "2.622.471");
        }
        if (this.f16874a.getLong("PREF_TIME_OF_ABSOLUTE_FIRST_LAUNCH", 0L) == 0) {
            edit.putLong("PREF_TIME_OF_ABSOLUTE_FIRST_LAUNCH", System.currentTimeMillis());
        }
        edit.putInt("PREF_TOTAL_LAUNCH_COUNT", this.f16874a.getInt("PREF_TOTAL_LAUNCH_COUNT", 0) + 1);
        edit.putInt("PREF_LAUNCHES_SINCE_LAST_PROMPT", this.f16874a.getInt("PREF_LAUNCHES_SINCE_LAST_PROMPT", 0) + 1);
        edit.apply();
    }

    /* renamed from: i */
    public void m17177i(Activity activity) {
        if (this.f16874a.getBoolean("PREF_DONT_SHOW_AGAIN_FOR_THIS_VERSION", false)) {
            return;
        }
        if (!C1152l.m6735f(activity)) {
            C1151k.m6707a("RateMeMaybe", "No Play Store installed on device.");
            return;
        }
        if (this.f16880g > this.f16874a.getInt("PREF_GAMES_PLAYED", 0)) {
            C1151k.m6707a("RateMeMaybe", "Hasn't played a number games higher than the minimum requested.");
            return;
        }
        if (this.f16879f > this.f16874a.getLong("PREF_LONGEST_GAME_DURATION", 0L)) {
            C1151k.m6707a("RateMeMaybe", "Hasn't played a game for more than the minimum time requested.");
            return;
        }
        SharedPreferences.Editor edit = this.f16874a.edit();
        int i10 = this.f16874a.getInt("PREF_TOTAL_LAUNCH_COUNT", 0);
        long currentTimeMillis = System.currentTimeMillis();
        long j10 = this.f16874a.getLong("PREF_TIME_OF_ABSOLUTE_FIRST_LAUNCH", 0L);
        long j11 = this.f16874a.getLong("PREF_TIME_OF_LAST_PROMPT", 0L);
        int i11 = this.f16874a.getInt("PREF_LAUNCHES_SINCE_LAST_PROMPT", 0);
        if (i10 >= this.f16875b && currentTimeMillis - j10 >= this.f16876c * 86400000) {
            C1151k.m6707a("RateMeMaybe", "Enough time until initial prompt.");
            if (j11 != 0 && (i11 < this.f16877d || currentTimeMillis - j11 < this.f16878e * 86400000)) {
                C1151k.m6707a("RateMeMaybe", "User has seen a prompt recently || (Not enough launches since last prompt || Not enough time since last prompt)");
                edit.apply();
                return;
            }
            C1151k.m6707a("RateMeMaybe", "User has not seen a prompt || (Enough launches since last prompt && Enough time since last prompt)");
            edit.putLong("PREF_TIME_OF_LAST_PROMPT", currentTimeMillis);
            edit.putInt("PREF_LAUNCHES_SINCE_LAST_PROMPT", 0);
            edit.apply();
            m17171k(activity);
            return;
        }
        C1151k.m6707a("RateMeMaybe", "Not enough time until initial prompt.");
        edit.apply();
    }

    /* renamed from: j */
    public void m17178j(int i10, int i11, int i12, int i13, long j10, int i14) {
        this.f16875b = i10;
        this.f16876c = i11;
        this.f16877d = i12;
        this.f16878e = i13;
        this.f16879f = j10;
        this.f16880g = i14;
    }

    /* renamed from: l */
    public void m17179l(long j10) {
        SharedPreferences.Editor edit = this.f16874a.edit();
        if (j10 > this.f16874a.getLong("PREF_LONGEST_GAME_DURATION", 0L)) {
            edit.putLong("PREF_LONGEST_GAME_DURATION", j10);
        }
        edit.putInt("PREF_GAMES_PLAYED", this.f16874a.getInt("PREF_GAMES_PLAYED", 0) + 1);
        edit.apply();
    }
}
