package p074f7;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import androidx.fragment.app.AbstractC0819t;
import androidx.fragment.app.ActivityC0803d;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.roblox.client.ActivityNativeMain;
import com.roblox.client.C2749c1;
import com.roblox.client.C2877p0;
import java.util.concurrent.Executors;
import p021b7.C1073a;
import p035c9.C1151k;
import p074f7.C3185n;
import p188o6.C4143a;

/* renamed from: f7.b0 */
/* loaded from: classes.dex */
public class C3164b0 {

    /* renamed from: b */
    private C3185n f13205b;

    /* renamed from: a */
    private b f13204a = b.GAME_STATE_NONE;

    /* renamed from: c */
    private long f13206c = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f7.b0$a */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: n */
        final /* synthetic */ Activity f13207n;

        /* renamed from: o */
        final /* synthetic */ C3197z f13208o;

        a(Activity activity, C3197z c3197z) {
            this.f13207n = activity;
            this.f13208o = c3197z;
        }

        @Override // java.lang.Runnable
        public void run() {
            FragmentManager m4617y0 = ((ActivityC0803d) this.f13207n).m4617y0();
            Fragment m4498j0 = ((ActivityC0803d) this.f13207n).m4617y0().m4498j0(C1073a.class.getName());
            if (m4498j0 != null && !m4617y0.m4459M0()) {
                AbstractC0819t m4504m = m4617y0.m4504m();
                m4504m.mo4564n(m4498j0);
                m4504m.mo4559h();
            } else {
                C1151k.m6709c("GameManager", "Gaming protocol is trying to send launch request when game is running.");
            }
            if (C3164b0.this.f13205b == null && !m4617y0.m4459M0()) {
                C3185n m13862e = C3164b0.this.m13862e(this.f13207n, this.f13208o);
                C3164b0.this.f13205b = m13862e;
                m13862e.m13961e0((C3185n.d) this.f13207n);
                m13862e.m13964i0();
                return;
            }
            C1151k.m6709c("GameManager", "Gaming protocol is trying to send launch request when game is running.");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f7.b0$b */
    /* loaded from: classes.dex */
    public enum b {
        GAME_STATE_NONE,
        GAME_STATE_STARTED,
        GAME_STATE_ENDED
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public C3185n m13862e(Context context, C3197z c3197z) {
        Bundle bundle = new Bundle();
        bundle.putLong("roblox_placeId", c3197z.m14045m());
        bundle.putLong("roblox_userId", c3197z.m14049q());
        bundle.putLong("roblox_conversationId", c3197z.m14038f());
        bundle.putString("roblox_accessCode", c3197z.m14036d());
        bundle.putString("roblox_linkCode", c3197z.m14044l());
        bundle.putString("roblox_gameId", c3197z.m14039g());
        bundle.putString("roblox_reservedServerAccessCode", c3197z.m14048p());
        bundle.putString("roblox_callId", c3197z.m14037e());
        bundle.putInt("roblox_joinRequestType", c3197z.m14047o());
        bundle.putString("roblox_referralPage", c3197z.m14046n());
        bundle.putString("roblox_launchData", c3197z.m14043k());
        bundle.putString("roblox_joinAttemptId", c3197z.m14041i());
        bundle.putString("roblox_joinAttemptOrigin", c3197z.m14042j());
        bundle.putString("roblox_isoContext", c3197z.m14040h());
        return new C3185n(bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public void m13863j(Activity activity, C3197z c3197z) {
        if (c3197z != null) {
            C1151k.m6712f("GameManager", "launchGameWithParams: Start game activity for placeId = " + c3197z.m14045m());
            C2877p0.m12884Q(activity).edit().remove("ROBLOXCrash").apply();
            activity.runOnUiThread(new a(activity, c3197z));
            this.f13206c = System.currentTimeMillis();
            m13870m();
            return;
        }
        C1151k.m6716j("GameManager", "launchGameWithParams: game-params is null. Just close this activity!");
    }

    /* renamed from: f */
    public boolean m13865f() {
        if (!C2749c1.m12245e().m12248f()) {
            return true;
        }
        C1151k.m6712f("GameManager", "canStartGame = false: Upgrade required");
        return false;
    }

    /* renamed from: g */
    public void m13866g(boolean z10) {
        C1151k.m6707a("GameManager", "endGameSession");
        C3185n c3185n = this.f13205b;
        if (c3185n != null) {
            c3185n.m13967y(true);
        } else {
            C1151k.m6709c("GameManager", "Error: Try to end but no game session exists.");
        }
    }

    /* renamed from: h */
    public boolean m13867h() {
        return this.f13204a == b.GAME_STATE_ENDED;
    }

    /* renamed from: i */
    public boolean m13868i() {
        return this.f13204a == b.GAME_STATE_STARTED;
    }

    /* renamed from: l */
    public void m13869l(Context context) {
        C1151k.m6707a("GameManager", "onGameEnded:");
        this.f13204a = b.GAME_STATE_ENDED;
        this.f13205b = null;
        m13872o();
    }

    /* renamed from: m */
    public void m13870m() {
        C1151k.m6707a("GameManager", "onGameStarted:");
        this.f13206c = System.currentTimeMillis();
        this.f13204a = b.GAME_STATE_STARTED;
    }

    /* renamed from: n */
    public void m13871n() {
        C1151k.m6707a("GameManager", "pauseGameSession");
        C3185n c3185n = this.f13205b;
        if (c3185n != null) {
            c3185n.m13954U();
        } else {
            C1151k.m6709c("GameManager", "Error: Try to pause but no game session exists.");
        }
    }

    /* renamed from: o */
    public void m13872o() {
        long currentTimeMillis = System.currentTimeMillis() - this.f13206c;
        C1151k.m6712f("GameManager", "Game duration: " + currentTimeMillis + "ms.");
        C4143a.m17168e().m17179l(currentTimeMillis);
    }

    /* renamed from: p */
    public void m13873p() {
        C1151k.m6707a("GameManager", "resumeGameSession");
        C3185n c3185n = this.f13205b;
        if (c3185n != null) {
            c3185n.m13956Z();
        } else {
            C1151k.m6709c("GameManager", "Error: Try to resume but no game session exists.");
        }
    }

    /* renamed from: q */
    public void m13874q(final Activity activity, final C3197z c3197z, int i10) {
        if (!m13865f()) {
            C1151k.m6712f("GameManager", "Game launch halted - Can't start game.");
            return;
        }
        C1151k.m6707a("GameManager", "startGameForResult: requestCode = " + i10);
        ((ActivityNativeMain) activity).m12174x2(EnumC3172f0.EXPERIENCE);
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            Executors.newSingleThreadExecutor().submit(new Runnable() { // from class: f7.a0
                @Override // java.lang.Runnable
                public final void run() {
                    C3164b0.this.m13863j(activity, c3197z);
                }
            });
        } else {
            m13863j(activity, c3197z);
        }
    }
}
