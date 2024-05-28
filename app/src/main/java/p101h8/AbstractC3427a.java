package p101h8;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.media.RingtoneManager;
import android.os.AsyncTask;
import androidx.core.app.C0578k;
import com.roblox.client.C2748c0;
import com.roblox.client.C2913x;
import com.roblox.client.startup.ActivitySplash;
import p129j8.C3662e;
import p129j8.InterfaceC3670m;
import p288w8.EnumC5480o;

/* renamed from: h8.a */
/* loaded from: classes.dex */
public abstract class AbstractC3427a<T extends InterfaceC3670m> implements InterfaceC3435i<T>, C3662e.a<T> {

    /* renamed from: a */
    protected C3662e<T> f14315a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h8.a$a */
    /* loaded from: classes.dex */
    public class a extends AbstractAsyncTaskC3446t {

        /* renamed from: d */
        final /* synthetic */ Context f14316d;

        /* renamed from: e */
        final /* synthetic */ boolean f14317e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context, long j10, Context context2, boolean z10) {
            super(context, j10);
            this.f14316d = context2;
            this.f14317e = z10;
        }

        @Override // p101h8.AbstractAsyncTaskC3446t
        /* renamed from: c */
        public void mo15071c(Bitmap bitmap) {
            if (AbstractC3427a.this.f14315a.isEmpty()) {
                return;
            }
            AbstractC3427a.this.mo15070u(this.f14316d, AbstractC3427a.this.mo15057g(this.f14316d, this.f14317e, bitmap));
        }
    }

    public AbstractC3427a() {
        C3662e<T> c3662e = new C3662e<>();
        this.f14315a = c3662e;
        c3662e.m15593r(this);
    }

    /* renamed from: h */
    private PendingIntent m15051h(Context context, T t10) {
        Intent intent = new Intent(mo15059j(2));
        intent.setClass(context, ActivitySplash.class);
        intent.putExtra("STARTED_FOR_INTENT_KEY", EnumC5480o.LOADED_FROM_PUSH_NOTIFICATION);
        Intent mo15068s = mo15068s(intent, t10);
        mo15068s.putExtra("EXTRA_NOTIFICATION_ID", t10.mo15571b());
        mo15068s.putExtra("EXTRA_INTENT_ACTION_TYPE_CODE", 2);
        mo15068s.putExtra("EXTRA_NOTIFICATION_TYPE", mo15065p());
        return PendingIntent.getActivity(context, mo15063n(), mo15068s, 301989888);
    }

    @Override // p101h8.InterfaceC3435i
    /* renamed from: b */
    public void mo15052b(Context context, String str) {
        this.f14315a.m15591p(str);
        if (this.f14315a.isEmpty()) {
            m15056f(context, mo15063n());
        } else {
            m15055e(context, false);
        }
    }

    @Override // p101h8.InterfaceC3435i
    /* renamed from: c */
    public void mo15053c(Context context, T t10) {
        this.f14315a.m15590o(t10);
        m15055e(context, m15067r());
    }

    @Override // p101h8.InterfaceC3435i
    public void clear() {
        this.f14315a.clear();
    }

    @Override // p101h8.InterfaceC3435i
    /* renamed from: d */
    public void mo15054d(Context context, long j10) {
        this.f14315a.m15592q(j10);
        if (this.f14315a.isEmpty()) {
            m15056f(context, mo15063n());
        } else {
            m15055e(context, false);
        }
    }

    /* renamed from: e */
    protected void m15055e(Context context, boolean z10) {
        if (context == null || this.f14315a.isEmpty()) {
            return;
        }
        new a(context, mo15066q(), context, z10).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    /* renamed from: f */
    protected void m15056f(Context context, int i10) {
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        if (notificationManager != null) {
            notificationManager.cancel(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: g */
    public C0578k.e mo15057g(Context context, boolean z10, Bitmap bitmap) {
        C0578k.e eVar = new C0578k.e(context, "channel_general");
        eVar.m2850m(m15051h(context, m15061l()));
        eVar.m2854q(m15058i(context, m15061l()));
        eVar.m2862z(C2913x.f11773v);
        eVar.m2851n(mo15062m(context));
        eVar.m2844g(true);
        eVar.m2852o(mo15064o(context));
        eVar.m2859w(this.f14315a.size());
        eVar.m2856t(bitmap);
        if (z10) {
            eVar.m2834A(RingtoneManager.getDefaultUri(2));
        } else {
            eVar.m2834A(null);
        }
        eVar.m2835B(new C0578k.c().m2825h(mo15062m(context)));
        return eVar;
    }

    /* renamed from: i */
    protected PendingIntent m15058i(Context context, T t10) {
        Intent intent = new Intent(mo15059j(1));
        intent.setClass(context, mo15060k());
        Intent mo15069t = mo15069t(intent, t10);
        mo15069t.putExtra("EXTRA_NOTIFICATION_TYPE", mo15065p());
        mo15069t.putExtra("EXTRA_INTENT_ACTION_TYPE_CODE", 1);
        mo15069t.putExtra("EXTRA_NOTIFICATION_ID", t10.mo15571b());
        return PendingIntent.getBroadcast(context, mo15063n(), mo15069t, 301989888);
    }

    /* renamed from: j */
    protected abstract String mo15059j(int i10);

    /* renamed from: k */
    protected abstract Class<?> mo15060k();

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: l */
    public T m15061l() {
        if (this.f14315a.isEmpty()) {
            return null;
        }
        return (T) this.f14315a.get(r0.size() - 1);
    }

    /* renamed from: m */
    protected abstract String mo15062m(Context context);

    /* renamed from: n */
    protected abstract int mo15063n();

    /* renamed from: o */
    protected String mo15064o(Context context) {
        return context.getString(C2748c0.f10656g3);
    }

    /* renamed from: p */
    protected abstract String mo15065p();

    /* renamed from: q */
    protected abstract long mo15066q();

    /* renamed from: r */
    public boolean m15067r() {
        return this.f14315a.size() != 0 && this.f14315a.size() <= 2;
    }

    /* renamed from: s */
    protected abstract Intent mo15068s(Intent intent, T t10);

    /* renamed from: t */
    protected abstract Intent mo15069t(Intent intent, T t10);

    /* renamed from: u */
    protected void mo15070u(Context context, C0578k.e eVar) {
        ((NotificationManager) context.getSystemService("notification")).notify(mo15063n(), eVar.m2842c());
    }
}
