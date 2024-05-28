package p074f7;

import android.text.TextUtils;
import com.appsflyer.oaid.BuildConfig;
import com.roblox.client.C2748c0;
import com.roblox.client.C2877p0;
import com.roblox.engine.jni.NativeSettingsInterface;
import org.json.JSONException;
import org.json.JSONObject;
import p035c9.C1151k;
import p215q8.C4330a;

/* renamed from: f7.x */
/* loaded from: classes.dex */
public class C3195x extends AbstractC3171f {

    /* renamed from: a */
    private final String f13311a = "rbx.game.callback";

    /* renamed from: b */
    private final a f13312b;

    /* renamed from: c */
    private final long f13313c;

    /* renamed from: d */
    private final InterfaceC3176h0 f13314d;

    /* renamed from: f7.x$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: a */
        void mo13957a(int i10);

        /* renamed from: b */
        void mo13958b(boolean z10);

        /* renamed from: c */
        void mo13959c(long j10, String str, String str2);

        /* renamed from: d */
        void mo13960d(int i10);

        /* renamed from: f */
        void mo13962f(String str, String str2, String str3);

        /* renamed from: h */
        void mo13963h(long j10);

        /* renamed from: j */
        void mo13965j(long j10, String str);

        /* renamed from: k */
        void mo13966k(long j10, String str, String str2);
    }

    public C3195x(a aVar, InterfaceC3176h0 interfaceC3176h0, long j10) {
        this.f13312b = aVar;
        this.f13313c = j10;
        this.f13314d = interfaceC3176h0;
    }

    /* renamed from: s */
    private int m14002s(int i10) {
        if (i10 == 3) {
            return C2748c0.f10493B3;
        }
        if (i10 == 4) {
            return C2748c0.f10499C3;
        }
        if (i10 == 5) {
            return C2748c0.f10505D3;
        }
        if (i10 != 6) {
            switch (i10) {
                case 10:
                    return C2748c0.f10530I3;
                case 11:
                    return C2748c0.f10520G3;
                case 12:
                    return C2748c0.f10515F3;
                default:
                    C1151k.m6716j("rbx.game.callback", "(Game failed to start) Unexpected errorId=[" + i10 + "].");
                    return C2748c0.f10525H3;
            }
        }
        return C2748c0.f10510E3;
    }

    @Override // com.roblox.engine.jni.EngineJavaCallback2
    /* renamed from: a */
    public void mo13258a(int i10) {
        C1151k.m6712f("rbx.game.callback", "exitGameWithError: errorID = " + i10);
        C4330a.m17860b("SessionReporterState_GameLoaded", this.f13313c);
        this.f13312b.mo13960d(m14002s(i10));
    }

    @Override // com.roblox.engine.jni.EngineJavaCallback2
    /* renamed from: b */
    public void mo12557b(long j10) {
        C1151k.m6707a("rbx.game.callback", "gameLoadedCallback() " + j10);
        this.f13312b.mo13963h(j10);
    }

    @Override // com.roblox.engine.jni.EngineJavaCallback2
    /* renamed from: e */
    public void mo12558e(String str) {
        this.f13312b.mo13958b(true);
    }

    @Override // com.roblox.engine.jni.EngineJavaCallback2
    /* renamed from: f */
    public void mo12559f(String str, String str2) {
        String str3;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("onDataModelNotification() type:");
        sb2.append(str);
        if (TextUtils.isEmpty(str2)) {
            str3 = BuildConfig.FLAVOR;
        } else {
            str3 = " data:" + str2;
        }
        sb2.append(str3);
        C1151k.m6712f("rbx.game.callback", sb2.toString());
        if ("OPEN_CUSTOM_WEBVIEW".equals(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str2);
                String optString = jSONObject.optString("url");
                if (optString.isEmpty()) {
                    C1151k.m6716j("rbx.game.callback", "URL must not be empty onNavigateToFeatureEvent OPEN_CUSTOM_WEBVIEW");
                    return;
                }
                String optString2 = jSONObject.optString("title");
                JSONObject optJSONObject = jSONObject.optJSONObject("searchParams");
                this.f13312b.mo13962f(optString, optString2, optJSONObject != null ? optJSONObject.toString() : null);
            } catch (JSONException unused) {
                C1151k.m6716j("rbx.game.callback", "Exception parsing data onNavigateToFeatureEvent OPEN_CUSTOM_WEBVIEW");
            }
        }
    }

    @Override // com.roblox.engine.jni.EngineJavaCallback2
    /* renamed from: j */
    public void mo12561j(long j10, String str) {
        this.f13312b.mo13965j(j10, str);
    }

    @Override // com.roblox.engine.jni.EngineJavaCallback2
    /* renamed from: k */
    public void mo12562k(long j10, String str, String str2) {
        this.f13312b.mo13966k(j10, str, str2);
    }

    @Override // com.roblox.engine.jni.EngineJavaCallback2
    /* renamed from: l */
    public void mo12563l(long j10, String str, String str2) {
        this.f13312b.mo13959c(j10, str, str2);
    }

    @Override // com.roblox.engine.jni.EngineJavaCallback2
    /* renamed from: n */
    public void mo13264n(int i10) {
        if (NativeSettingsInterface.nativeGetFFlag("MaquettesDisableScreenRotation") && C2877p0.m12935m0()) {
            C1151k.m6707a("rbx.game.orientation", "screenOrientationChanged: ignoring screen orientation change request on Quest");
            return;
        }
        if (i10 == 0) {
            C1151k.m6707a("rbx.game.orientation", "screenOrientationChanged: newOrientation = SCREEN_ORIENTATION_REVERSE_LANDSCAPE");
            this.f13312b.mo13957a(8);
            return;
        }
        if (i10 == 1) {
            C1151k.m6707a("rbx.game.orientation", "screenOrientationChanged: newOrientation = SCREEN_ORIENTATION_LANDSCAPE");
            this.f13312b.mo13957a(0);
            return;
        }
        if (i10 == 2) {
            C1151k.m6707a("rbx.game.orientation", "screenOrientationChanged: newOrientation = SCREEN_ORIENTATION_SENSOR_LANDSCAPE");
            this.f13312b.mo13957a(6);
            return;
        }
        if (i10 == 3) {
            C1151k.m6707a("rbx.game.orientation", "screenOrientationChanged: newOrientation = SCREEN_ORIENTATION_SENSOR_PORTRAIT");
            this.f13312b.mo13957a(7);
        } else {
            if (i10 != 4) {
                C1151k.m6707a("rbx.game.orientation", "screenOrientationChanged: newOrientation =" + i10);
                return;
            }
            C1151k.m6707a("rbx.game.orientation", "screenOrientationChanged: newOrientation = SCREEN_ORIENTATION_USER");
            this.f13312b.mo13957a(2);
        }
    }

    @Override // p074f7.AbstractC3171f
    /* renamed from: p */
    public InterfaceC3176h0 mo12564p() {
        return this.f13314d;
    }
}
