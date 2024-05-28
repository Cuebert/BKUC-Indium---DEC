package p101h8;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.AsyncTask;
import android.widget.ImageView;
import java.io.IOException;
import java.util.List;
import p035c9.C1149i;
import p091gc.C3348t;
import p179n9.C4083g;
import p289w9.C5481a;
import p289w9.C5482b;
import qa.C4359t;
import qa.InterfaceC4341e;
import qa.InterfaceC4342e0;

/* renamed from: h8.t */
/* loaded from: classes.dex */
public abstract class AbstractAsyncTaskC3446t extends AsyncTask<Void, Void, String> {

    /* renamed from: a */
    private InterfaceC4342e0 f14334a = new C1149i.a();

    /* renamed from: b */
    private Context f14335b;

    /* renamed from: c */
    private long f14336c;

    /* renamed from: h8.t$a */
    /* loaded from: classes.dex */
    public class a implements InterfaceC4341e {

        /* renamed from: a */
        final /* synthetic */ ImageView f14337a;

        a(ImageView imageView) {
            this.f14337a = imageView;
        }

        @Override // qa.InterfaceC4341e
        /* renamed from: a */
        public void mo15170a() {
            AbstractAsyncTaskC3446t.this.mo15071c(null);
        }

        @Override // qa.InterfaceC4341e
        public void onSuccess() {
            Bitmap bitmap = ((BitmapDrawable) this.f14337a.getDrawable()).getBitmap();
            if (bitmap != null) {
                AbstractAsyncTaskC3446t.this.mo15071c(bitmap);
            } else {
                AbstractAsyncTaskC3446t.this.mo15071c(null);
            }
        }
    }

    public AbstractAsyncTaskC3446t(Context context, long j10) {
        this.f14335b = context;
        this.f14336c = j10;
    }

    /* renamed from: b */
    private void m15167b(Context context, String str) {
        ImageView imageView = new ImageView(context);
        C4359t.m18005p(context).m18013k(str).m18046g(this.f14334a).m18043d(imageView, new a(imageView));
    }

    @Override // android.os.AsyncTask
    /* renamed from: a */
    public String doInBackground(Void... voidArr) {
        C5482b m14731a;
        List<C5481a> list;
        String m15149f = C3442p.m15144c().m15149f(this.f14336c);
        if (m15149f != null || this.f14336c <= 0) {
            return m15149f;
        }
        try {
            C3348t<C5482b> mo14637c = C4083g.m16979d().mo16974g().m18309b(Long.toString(this.f14336c), "150x150", "Png", Boolean.FALSE).mo14637c();
            return (!mo14637c.m14735f() || (m14731a = mo14637c.m14731a()) == null || (list = m14731a.data) == null || list.get(0) == null) ? m15149f : m14731a.data.get(0).imageUrl;
        } catch (IOException e10) {
            e10.printStackTrace();
            return m15149f;
        }
    }

    /* renamed from: c */
    public abstract void mo15071c(Bitmap bitmap);

    @Override // android.os.AsyncTask
    /* renamed from: d */
    public void onPostExecute(String str) {
        if (str != null && !str.isEmpty()) {
            C3442p.m15144c().m15151h(this.f14336c, str);
            m15167b(this.f14335b, str);
        } else {
            mo15071c(null);
        }
    }
}
