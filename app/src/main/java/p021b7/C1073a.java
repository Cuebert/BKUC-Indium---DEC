package p021b7;

import androidx.fragment.app.Fragment;
import com.roblox.client.feature.FeatureState;
import com.roblox.client.game.C2831b;
import com.roblox.client.game.SurfaceHolderCallbackC2830a;
import p035c9.C1151k;
import p102h9.C3448b;
import p102h9.C3449c;
import p102h9.C3450d;
import p300x7.C5565g;

/* renamed from: b7.a */
/* loaded from: classes.dex */
public class C1073a {

    /* renamed from: a */
    public final String f5304a = "rbx.appshell";

    /* renamed from: b */
    private InterfaceC1075c f5305b;

    /* renamed from: c */
    private int f5306c;

    public C1073a(InterfaceC1075c interfaceC1075c, int i10) {
        this.f5305b = interfaceC1075c;
        this.f5306c = i10;
    }

    /* renamed from: e */
    private String m6357e() {
        return C1073a.class.getName();
    }

    /* renamed from: a */
    protected C3449c m6358a(String str) {
        return new C3450d(str);
    }

    /* renamed from: b */
    protected C3448b m6359b(long j10) {
        return new C3448b("AppShellNotifications", Long.toString(j10), "StartConversationWithId", "Chat");
    }

    /* renamed from: c */
    protected C3448b m6360c(long j10) {
        return new C3448b("AppShellNotifications", Long.toString(j10), "StartConversationWithUserId", "Chat");
    }

    /* renamed from: d */
    public SurfaceHolderCallbackC2830a m6361d() {
        Fragment mo6368Z = this.f5305b.mo6368Z(m6357e());
        if (mo6368Z instanceof SurfaceHolderCallbackC2830a) {
            return (SurfaceHolderCallbackC2830a) mo6368Z;
        }
        return null;
    }

    /* renamed from: f */
    public boolean m6362f() {
        C2831b.m12572i().m12595r();
        return true;
    }

    /* renamed from: g */
    public void m6363g(FeatureState featureState) {
        SurfaceHolderCallbackC2830a m6361d = m6361d();
        if (m6361d == null) {
            C1151k.m6712f("rbx.appshell", "onShow: Create a GL fragment for LuaApp...");
            m6361d = new SurfaceHolderCallbackC2830a();
        }
        C1151k.m6707a("rbx.appshell", "onShow: ... state = " + featureState.m12514c() + ", IsLoggedIn = " + C5565g.m20445e().m20457f());
        if (C5565g.m20445e().m20457f()) {
            m6365i(featureState);
        }
        this.f5305b.mo6369y(this.f5306c, m6361d, m6357e());
    }

    /* renamed from: h */
    protected void m6364h(C3449c c3449c) {
        C2831b.m12572i().m12578A(c3449c);
    }

    /* renamed from: i */
    protected void m6365i(FeatureState featureState) {
        if (featureState.m12514c().equals("CHAT_TAG")) {
            C1151k.m6712f("rbx.appshell", "sendAppEvents() start chat");
            m6364h(m6358a("Chat"));
            long m12513b = featureState.m12513b("USER_ID_EXTRA", -1L);
            long m12513b2 = featureState.m12513b("CHAT_CONVERSATION_ID", -1L);
            if (m12513b != -1) {
                C1151k.m6712f("rbx.appshell", "sendAppEvents() userId:" + m12513b);
                m6366j(m6360c(m12513b));
                return;
            }
            if (m12513b2 != -1) {
                C1151k.m6712f("rbx.appshell", "sendAppEvents() conversationId:" + m12513b2);
                m6366j(m6359b(m12513b2));
                return;
            }
            return;
        }
        if (featureState.m12514c().equals("AVATAR_EDITOR_TAG")) {
            C1151k.m6712f("rbx.appshell", "sendAppEvents() start avatar");
            m6364h(m6358a("AvatarEditor"));
        } else if (featureState.m12514c().equals("HOME_TAG")) {
            C1151k.m6712f("rbx.appshell", "sendAppEvents() start home");
            m6364h(m6358a("Home"));
        } else if (featureState.m12514c().equals("GAMES_TAG")) {
            C1151k.m6712f("rbx.appshell", "sendAppEvents() start games");
            m6364h(m6358a("Games"));
        }
    }

    /* renamed from: j */
    protected void m6366j(C3448b c3448b) {
        C2831b.m12572i().m12580C(c3448b);
    }
}
