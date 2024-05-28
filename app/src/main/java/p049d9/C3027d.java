package p049d9;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.view.View;
import com.roblox.client.C2817d1;
import com.roblox.client.C2822f0;
import com.roblox.client.RobloxWebActivity;

/* renamed from: d9.d */
/* loaded from: classes.dex */
public class C3027d extends AbstractC3024a {

    /* renamed from: s */
    private boolean f12887s;

    /* renamed from: t */
    private String f12888t;

    /* renamed from: u */
    protected long f12889u;

    public C3027d(String str, Context context, String str2, int i10, int i11) {
        this(str, context, str2, i10, i11, false, null);
    }

    /* renamed from: e */
    private String m13499e() {
        String str = this.f12888t;
        return str != null ? str : m13488a();
    }

    /* renamed from: f */
    private void m13500f(Context context, String str, String str2) {
        Intent intent = new Intent(context, (Class<?>) RobloxWebActivity.class);
        intent.putExtra("URL_EXTRA", str);
        intent.putExtra("TITLE_EXTRA", str2);
        context.startActivity(intent);
    }

    /* renamed from: d */
    protected boolean m13501d() {
        return (this.f12883o == null || this.f12882n == null) ? false : true;
    }

    /* renamed from: g */
    protected boolean m13502g(String str) {
        C2822f0.m12481c(str, "span");
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - this.f12889u < 1000) {
            return false;
        }
        this.f12889u = elapsedRealtime;
        return true;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        if (m13502g("clickableSpan") && m13501d()) {
            if (this.f12887s) {
                C2817d1.m12474m(this.f12883o, this.f12882n);
            } else {
                m13500f(this.f12883o, this.f12882n, m13499e());
            }
        }
    }

    public C3027d(String str, Context context, String str2, int i10, int i11, boolean z10, String str3) {
        super(str, context, str2, i10, i11);
        this.f12889u = 0L;
        this.f12887s = z10;
        this.f12888t = str3;
    }
}
