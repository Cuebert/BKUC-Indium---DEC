package androidx.vectordrawable.graphics.drawable;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import androidx.core.content.res.C0599k;
import androidx.core.graphics.drawable.C0609a;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p093h0.C3356a;

/* renamed from: androidx.vectordrawable.graphics.drawable.b */
/* loaded from: classes.dex */
public class C0934b extends AbstractC0938f implements Animatable {

    /* renamed from: o */
    private b f4936o;

    /* renamed from: p */
    private Context f4937p;

    /* renamed from: q */
    private ArgbEvaluator f4938q;

    /* renamed from: r */
    private Animator.AnimatorListener f4939r;

    /* renamed from: s */
    ArrayList<Object> f4940s;

    /* renamed from: t */
    final Drawable.Callback f4941t;

    /* renamed from: androidx.vectordrawable.graphics.drawable.b$a */
    /* loaded from: classes.dex */
    class a implements Drawable.Callback {
        a() {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
            C0934b.this.invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
            C0934b.this.scheduleSelf(runnable, j10);
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            C0934b.this.unscheduleSelf(runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.vectordrawable.graphics.drawable.b$b */
    /* loaded from: classes.dex */
    public static class b extends Drawable.ConstantState {

        /* renamed from: a */
        int f4943a;

        /* renamed from: b */
        C0939g f4944b;

        /* renamed from: c */
        AnimatorSet f4945c;

        /* renamed from: d */
        ArrayList<Animator> f4946d;

        /* renamed from: e */
        C3356a<Animator, String> f4947e;

        public b(Context context, b bVar, Drawable.Callback callback, Resources resources) {
            if (bVar != null) {
                this.f4943a = bVar.f4943a;
                C0939g c0939g = bVar.f4944b;
                if (c0939g != null) {
                    Drawable.ConstantState constantState = c0939g.getConstantState();
                    if (resources != null) {
                        this.f4944b = (C0939g) constantState.newDrawable(resources);
                    } else {
                        this.f4944b = (C0939g) constantState.newDrawable();
                    }
                    C0939g c0939g2 = (C0939g) this.f4944b.mutate();
                    this.f4944b = c0939g2;
                    c0939g2.setCallback(callback);
                    this.f4944b.setBounds(bVar.f4944b.getBounds());
                    this.f4944b.m6000h(false);
                }
                ArrayList<Animator> arrayList = bVar.f4946d;
                if (arrayList != null) {
                    int size = arrayList.size();
                    this.f4946d = new ArrayList<>(size);
                    this.f4947e = new C3356a<>(size);
                    for (int i10 = 0; i10 < size; i10++) {
                        Animator animator = bVar.f4946d.get(i10);
                        Animator clone = animator.clone();
                        String str = bVar.f4947e.get(animator);
                        clone.setTarget(this.f4944b.m5999d(str));
                        this.f4946d.add(clone);
                        this.f4947e.put(clone, str);
                    }
                    m5969a();
                }
            }
        }

        /* renamed from: a */
        public void m5969a() {
            if (this.f4945c == null) {
                this.f4945c = new AnimatorSet();
            }
            this.f4945c.playTogether(this.f4946d);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f4943a;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    C0934b() {
        this(null, null, null);
    }

    /* renamed from: a */
    public static C0934b m5967a(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        C0934b c0934b = new C0934b(context);
        c0934b.inflate(resources, xmlPullParser, attributeSet, theme);
        return c0934b;
    }

    /* renamed from: b */
    private void m5968b(String str, Animator animator) {
        animator.setTarget(this.f4936o.f4944b.m5999d(str));
        b bVar = this.f4936o;
        if (bVar.f4946d == null) {
            bVar.f4946d = new ArrayList<>();
            this.f4936o.f4947e = new C3356a<>();
        }
        this.f4936o.f4946d.add(animator);
        this.f4936o.f4947e.put(animator, str);
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC0938f, android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f4951n;
        if (drawable != null) {
            C0609a.m3246a(drawable, theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f4951n;
        if (drawable != null) {
            return C0609a.m3247b(drawable);
        }
        return false;
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC0938f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f4951n;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        this.f4936o.f4944b.draw(canvas);
        if (this.f4936o.f4945c.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f4951n;
        if (drawable != null) {
            return C0609a.m3249d(drawable);
        }
        return this.f4936o.f4944b.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f4951n;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.f4936o.f4943a;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.f4951n;
        if (drawable != null) {
            return C0609a.m3250e(drawable);
        }
        return this.f4936o.f4944b.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f4951n == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new c(this.f4951n.getConstantState());
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC0938f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f4951n;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return this.f4936o.f4944b.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f4951n;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return this.f4936o.f4944b.getIntrinsicWidth();
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC0938f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC0938f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f4951n;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return this.f4936o.f4944b.getOpacity();
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC0938f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC0938f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC0938f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        Drawable drawable = this.f4951n;
        if (drawable != null) {
            C0609a.m3252g(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray m3162k = C0599k.m3162k(resources, theme, attributeSet, C0933a.f4928e);
                    int resourceId = m3162k.getResourceId(0, 0);
                    if (resourceId != 0) {
                        C0939g m5993b = C0939g.m5993b(resources, resourceId, theme);
                        m5993b.m6000h(false);
                        m5993b.setCallback(this.f4941t);
                        C0939g c0939g = this.f4936o.f4944b;
                        if (c0939g != null) {
                            c0939g.setCallback(null);
                        }
                        this.f4936o.f4944b = m5993b;
                    }
                    m3162k.recycle();
                } else if ("target".equals(name)) {
                    TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, C0933a.f4929f);
                    String string = obtainAttributes.getString(0);
                    int resourceId2 = obtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f4937p;
                        if (context != null) {
                            m5968b(string, C0936d.m5979i(context, resourceId2));
                        } else {
                            obtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                    }
                    obtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        this.f4936o.m5969a();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f4951n;
        if (drawable != null) {
            return C0609a.m3253h(drawable);
        }
        return this.f4936o.f4944b.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        Drawable drawable = this.f4951n;
        if (drawable != null) {
            return ((AnimatedVectorDrawable) drawable).isRunning();
        }
        return this.f4936o.f4945c.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        Drawable drawable = this.f4951n;
        if (drawable != null) {
            return drawable.isStateful();
        }
        return this.f4936o.f4944b.isStateful();
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC0938f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f4951n;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f4951n;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f4936o.f4944b.setBounds(rect);
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC0938f, android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i10) {
        Drawable drawable = this.f4951n;
        if (drawable != null) {
            return drawable.setLevel(i10);
        }
        return this.f4936o.f4944b.setLevel(i10);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f4951n;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        return this.f4936o.f4944b.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        Drawable drawable = this.f4951n;
        if (drawable != null) {
            drawable.setAlpha(i10);
        } else {
            this.f4936o.f4944b.setAlpha(i10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z10) {
        Drawable drawable = this.f4951n;
        if (drawable != null) {
            C0609a.m3255j(drawable, z10);
        } else {
            this.f4936o.f4944b.setAutoMirrored(z10);
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC0938f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i10) {
        super.setChangingConfigurations(i10);
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC0938f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(int i10, PorterDuff.Mode mode) {
        super.setColorFilter(i10, mode);
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC0938f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z10) {
        super.setFilterBitmap(z10);
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC0938f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f10, float f11) {
        super.setHotspot(f10, f11);
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC0938f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i10, int i11, int i12, int i13) {
        super.setHotspotBounds(i10, i11, i12, i13);
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC0938f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i10) {
        Drawable drawable = this.f4951n;
        if (drawable != null) {
            C0609a.m3259n(drawable, i10);
        } else {
            this.f4936o.f4944b.setTint(i10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f4951n;
        if (drawable != null) {
            C0609a.m3260o(drawable, colorStateList);
        } else {
            this.f4936o.f4944b.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f4951n;
        if (drawable != null) {
            C0609a.m3261p(drawable, mode);
        } else {
            this.f4936o.f4944b.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        Drawable drawable = this.f4951n;
        if (drawable != null) {
            return drawable.setVisible(z10, z11);
        }
        this.f4936o.f4944b.setVisible(z10, z11);
        return super.setVisible(z10, z11);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Drawable drawable = this.f4951n;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
        } else {
            if (this.f4936o.f4945c.isStarted()) {
                return;
            }
            this.f4936o.f4945c.start();
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        Drawable drawable = this.f4951n;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f4936o.f4945c.end();
        }
    }

    private C0934b(Context context) {
        this(context, null, null);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f4951n;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f4936o.f4944b.setColorFilter(colorFilter);
        }
    }

    /* renamed from: androidx.vectordrawable.graphics.drawable.b$c */
    /* loaded from: classes.dex */
    private static class c extends Drawable.ConstantState {

        /* renamed from: a */
        private final Drawable.ConstantState f4948a;

        public c(Drawable.ConstantState constantState) {
            this.f4948a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f4948a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f4948a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            C0934b c0934b = new C0934b();
            Drawable newDrawable = this.f4948a.newDrawable();
            c0934b.f4951n = newDrawable;
            newDrawable.setCallback(c0934b.f4941t);
            return c0934b;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            C0934b c0934b = new C0934b();
            Drawable newDrawable = this.f4948a.newDrawable(resources);
            c0934b.f4951n = newDrawable;
            newDrawable.setCallback(c0934b.f4941t);
            return c0934b;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            C0934b c0934b = new C0934b();
            Drawable newDrawable = this.f4948a.newDrawable(resources, theme);
            c0934b.f4951n = newDrawable;
            newDrawable.setCallback(c0934b.f4941t);
            return c0934b;
        }
    }

    private C0934b(Context context, b bVar, Resources resources) {
        this.f4938q = null;
        this.f4939r = null;
        this.f4940s = null;
        a aVar = new a();
        this.f4941t = aVar;
        this.f4937p = context;
        if (bVar != null) {
            this.f4936o = bVar;
        } else {
            this.f4936o = new b(context, bVar, aVar, resources);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
