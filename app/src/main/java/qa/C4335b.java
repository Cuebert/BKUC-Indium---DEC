package qa;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.IOException;
import qa.AbstractC4364y;
import qa.C4359t;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: qa.b */
/* loaded from: classes.dex */
public class C4335b extends AbstractC4364y {

    /* renamed from: b */
    private static final int f17621b = 22;

    /* renamed from: a */
    private final AssetManager f17622a;

    public C4335b(Context context) {
        this.f17622a = context.getAssets();
    }

    /* renamed from: j */
    static String m17890j(C4362w c4362w) {
        return c4362w.f17789d.toString().substring(f17621b);
    }

    @Override // qa.AbstractC4364y
    /* renamed from: c */
    public boolean mo17891c(C4362w c4362w) {
        Uri uri = c4362w.f17789d;
        return "file".equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && "android_asset".equals(uri.getPathSegments().get(0));
    }

    @Override // qa.AbstractC4364y
    /* renamed from: f */
    public AbstractC4364y.a mo17892f(C4362w c4362w, int i10) throws IOException {
        return new AbstractC4364y.a(this.f17622a.open(m17890j(c4362w)), C4359t.e.DISK);
    }
}
