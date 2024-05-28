package p120j;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;
import p039d.C2956i;

/* renamed from: j.d */
/* loaded from: classes.dex */
public class C3585d extends ContextWrapper {

    /* renamed from: a */
    private int f15150a;

    /* renamed from: b */
    private Resources.Theme f15151b;

    /* renamed from: c */
    private LayoutInflater f15152c;

    /* renamed from: d */
    private Configuration f15153d;

    /* renamed from: e */
    private Resources f15154e;

    public C3585d() {
        super(null);
    }

    /* renamed from: b */
    private Resources m15379b() {
        if (this.f15154e == null) {
            Configuration configuration = this.f15153d;
            if (configuration == null) {
                this.f15154e = super.getResources();
            } else {
                this.f15154e = createConfigurationContext(configuration).getResources();
            }
        }
        return this.f15154e;
    }

    /* renamed from: d */
    private void m15380d() {
        boolean z10 = this.f15151b == null;
        if (z10) {
            this.f15151b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f15151b.setTo(theme);
            }
        }
        m15383e(this.f15151b, this.f15150a, z10);
    }

    /* renamed from: a */
    public void m15381a(Configuration configuration) {
        if (this.f15154e == null) {
            if (this.f15153d == null) {
                this.f15153d = new Configuration(configuration);
                return;
            }
            throw new IllegalStateException("Override configuration has already been set");
        }
        throw new IllegalStateException("getResources() or getAssets() has already been called");
    }

    @Override // android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    /* renamed from: c */
    public int m15382c() {
        return this.f15150a;
    }

    /* renamed from: e */
    protected void m15383e(Resources.Theme theme, int i10, boolean z10) {
        theme.applyStyle(i10, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return m15379b();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) {
        if ("layout_inflater".equals(str)) {
            if (this.f15152c == null) {
                this.f15152c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
            }
            return this.f15152c;
        }
        return getBaseContext().getSystemService(str);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f15151b;
        if (theme != null) {
            return theme;
        }
        if (this.f15150a == 0) {
            this.f15150a = C2956i.f12335d;
        }
        m15380d();
        return this.f15151b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i10) {
        if (this.f15150a != i10) {
            this.f15150a = i10;
            m15380d();
        }
    }

    public C3585d(Context context, int i10) {
        super(context);
        this.f15150a = i10;
    }

    public C3585d(Context context, Resources.Theme theme) {
        super(context);
        this.f15151b = theme;
    }
}
