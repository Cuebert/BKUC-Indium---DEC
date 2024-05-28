package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import androidx.appcompat.widget.ResourceManagerInternal;
import androidx.core.graphics.C0601a;
import p039d.C2948a;
import p039d.C2950c;
import p039d.C2951d;
import p039d.C2952e;
import p066f.C3121a;

/* loaded from: classes.dex */
public final class AppCompatDrawableManager {
    private static final boolean DEBUG = false;
    private static final PorterDuff.Mode DEFAULT_MODE = PorterDuff.Mode.SRC_IN;
    private static AppCompatDrawableManager INSTANCE = null;
    private static final String TAG = "AppCompatDrawableManag";
    private ResourceManagerInternal mResourceManager;

    /* renamed from: androidx.appcompat.widget.AppCompatDrawableManager$a */
    /* loaded from: classes.dex */
    public class C0193a implements ResourceManagerInternal.ResourceManagerHooks {

        /* renamed from: a */
        private final int[] f1000a = {C2952e.f12216R, C2952e.f12214P, C2952e.f12218a};

        /* renamed from: b */
        private final int[] f1001b = {C2952e.f12232o, C2952e.f12200B, C2952e.f12237t, C2952e.f12233p, C2952e.f12234q, C2952e.f12236s, C2952e.f12235r};

        /* renamed from: c */
        private final int[] f1002c = {C2952e.f12213O, C2952e.f12215Q, C2952e.f12228k, C2952e.f12209K, C2952e.f12210L, C2952e.f12211M, C2952e.f12212N};

        /* renamed from: d */
        private final int[] f1003d = {C2952e.f12240w, C2952e.f12226i, C2952e.f12239v};

        /* renamed from: e */
        private final int[] f1004e = {C2952e.f12208J, C2952e.f12217S};

        /* renamed from: f */
        private final int[] f1005f = {C2952e.f12220c, C2952e.f12224g, C2952e.f12221d, C2952e.f12225h};

        C0193a() {
        }

        /* renamed from: a */
        private boolean m1113a(int[] iArr, int i10) {
            for (int i11 : iArr) {
                if (i11 == i10) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: b */
        private ColorStateList m1114b(Context context) {
            return m1115c(context, 0);
        }

        /* renamed from: c */
        private ColorStateList m1115c(Context context, int i10) {
            int themeAttrColor = ThemeUtils.getThemeAttrColor(context, C2948a.f12172x);
            return new ColorStateList(new int[][]{ThemeUtils.DISABLED_STATE_SET, ThemeUtils.PRESSED_STATE_SET, ThemeUtils.FOCUSED_STATE_SET, ThemeUtils.EMPTY_STATE_SET}, new int[]{ThemeUtils.getDisabledThemeAttrColor(context, C2948a.f12170v), C0601a.m3177c(themeAttrColor, i10), C0601a.m3177c(themeAttrColor, i10), i10});
        }

        /* renamed from: d */
        private ColorStateList m1116d(Context context) {
            return m1115c(context, ThemeUtils.getThemeAttrColor(context, C2948a.f12169u));
        }

        /* renamed from: e */
        private ColorStateList m1117e(Context context) {
            return m1115c(context, ThemeUtils.getThemeAttrColor(context, C2948a.f12170v));
        }

        /* renamed from: f */
        private ColorStateList m1118f(Context context) {
            int[][] iArr = new int[3];
            int[] iArr2 = new int[3];
            int i10 = C2948a.f12174z;
            ColorStateList themeAttrColorStateList = ThemeUtils.getThemeAttrColorStateList(context, i10);
            if (themeAttrColorStateList != null && themeAttrColorStateList.isStateful()) {
                iArr[0] = ThemeUtils.DISABLED_STATE_SET;
                iArr2[0] = themeAttrColorStateList.getColorForState(iArr[0], 0);
                iArr[1] = ThemeUtils.CHECKED_STATE_SET;
                iArr2[1] = ThemeUtils.getThemeAttrColor(context, C2948a.f12171w);
                iArr[2] = ThemeUtils.EMPTY_STATE_SET;
                iArr2[2] = themeAttrColorStateList.getDefaultColor();
            } else {
                iArr[0] = ThemeUtils.DISABLED_STATE_SET;
                iArr2[0] = ThemeUtils.getDisabledThemeAttrColor(context, i10);
                iArr[1] = ThemeUtils.CHECKED_STATE_SET;
                iArr2[1] = ThemeUtils.getThemeAttrColor(context, C2948a.f12171w);
                iArr[2] = ThemeUtils.EMPTY_STATE_SET;
                iArr2[2] = ThemeUtils.getThemeAttrColor(context, i10);
            }
            return new ColorStateList(iArr, iArr2);
        }

        /* renamed from: g */
        private LayerDrawable m1119g(ResourceManagerInternal resourceManagerInternal, Context context, int i10) {
            BitmapDrawable bitmapDrawable;
            BitmapDrawable bitmapDrawable2;
            BitmapDrawable bitmapDrawable3;
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(i10);
            Drawable drawable = resourceManagerInternal.getDrawable(context, C2952e.f12204F);
            Drawable drawable2 = resourceManagerInternal.getDrawable(context, C2952e.f12205G);
            if ((drawable instanceof BitmapDrawable) && drawable.getIntrinsicWidth() == dimensionPixelSize && drawable.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable = (BitmapDrawable) drawable;
                bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
            } else {
                Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                drawable.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                drawable.draw(canvas);
                bitmapDrawable = new BitmapDrawable(createBitmap);
                bitmapDrawable2 = new BitmapDrawable(createBitmap);
            }
            bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
            if ((drawable2 instanceof BitmapDrawable) && drawable2.getIntrinsicWidth() == dimensionPixelSize && drawable2.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable3 = (BitmapDrawable) drawable2;
            } else {
                Bitmap createBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(createBitmap2);
                drawable2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                drawable2.draw(canvas2);
                bitmapDrawable3 = new BitmapDrawable(createBitmap2);
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
            layerDrawable.setId(0, R.id.background);
            layerDrawable.setId(1, R.id.secondaryProgress);
            layerDrawable.setId(2, R.id.progress);
            return layerDrawable;
        }

        /* renamed from: h */
        private void m1120h(Drawable drawable, int i10, PorterDuff.Mode mode) {
            if (DrawableUtils.canSafelyMutateDrawable(drawable)) {
                drawable = drawable.mutate();
            }
            if (mode == null) {
                mode = AppCompatDrawableManager.DEFAULT_MODE;
            }
            drawable.setColorFilter(AppCompatDrawableManager.getPorterDuffColorFilter(i10, mode));
        }

        @Override // androidx.appcompat.widget.ResourceManagerInternal.ResourceManagerHooks
        public Drawable createDrawableFor(ResourceManagerInternal resourceManagerInternal, Context context, int i10) {
            if (i10 == C2952e.f12227j) {
                return new LayerDrawable(new Drawable[]{resourceManagerInternal.getDrawable(context, C2952e.f12226i), resourceManagerInternal.getDrawable(context, C2952e.f12228k)});
            }
            if (i10 == C2952e.f12242y) {
                return m1119g(resourceManagerInternal, context, C2951d.f12192i);
            }
            if (i10 == C2952e.f12241x) {
                return m1119g(resourceManagerInternal, context, C2951d.f12193j);
            }
            if (i10 == C2952e.f12243z) {
                return m1119g(resourceManagerInternal, context, C2951d.f12194k);
            }
            return null;
        }

        @Override // androidx.appcompat.widget.ResourceManagerInternal.ResourceManagerHooks
        public ColorStateList getTintListForDrawableRes(Context context, int i10) {
            if (i10 == C2952e.f12230m) {
                return C3121a.m13769c(context, C2950c.f12180e);
            }
            if (i10 == C2952e.f12207I) {
                return C3121a.m13769c(context, C2950c.f12183h);
            }
            if (i10 == C2952e.f12206H) {
                return m1118f(context);
            }
            if (i10 == C2952e.f12223f) {
                return m1117e(context);
            }
            if (i10 == C2952e.f12219b) {
                return m1114b(context);
            }
            if (i10 == C2952e.f12222e) {
                return m1116d(context);
            }
            if (i10 != C2952e.f12202D && i10 != C2952e.f12203E) {
                if (m1113a(this.f1001b, i10)) {
                    return ThemeUtils.getThemeAttrColorStateList(context, C2948a.f12173y);
                }
                if (m1113a(this.f1004e, i10)) {
                    return C3121a.m13769c(context, C2950c.f12179d);
                }
                if (m1113a(this.f1005f, i10)) {
                    return C3121a.m13769c(context, C2950c.f12178c);
                }
                if (i10 == C2952e.f12199A) {
                    return C3121a.m13769c(context, C2950c.f12181f);
                }
                return null;
            }
            return C3121a.m13769c(context, C2950c.f12182g);
        }

        @Override // androidx.appcompat.widget.ResourceManagerInternal.ResourceManagerHooks
        public PorterDuff.Mode getTintModeForDrawableRes(int i10) {
            if (i10 == C2952e.f12206H) {
                return PorterDuff.Mode.MULTIPLY;
            }
            return null;
        }

        @Override // androidx.appcompat.widget.ResourceManagerInternal.ResourceManagerHooks
        public boolean tintDrawable(Context context, int i10, Drawable drawable) {
            if (i10 == C2952e.f12201C) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(R.id.background);
                int i11 = C2948a.f12173y;
                m1120h(findDrawableByLayerId, ThemeUtils.getThemeAttrColor(context, i11), AppCompatDrawableManager.DEFAULT_MODE);
                m1120h(layerDrawable.findDrawableByLayerId(R.id.secondaryProgress), ThemeUtils.getThemeAttrColor(context, i11), AppCompatDrawableManager.DEFAULT_MODE);
                m1120h(layerDrawable.findDrawableByLayerId(R.id.progress), ThemeUtils.getThemeAttrColor(context, C2948a.f12171w), AppCompatDrawableManager.DEFAULT_MODE);
                return true;
            }
            if (i10 != C2952e.f12242y && i10 != C2952e.f12241x && i10 != C2952e.f12243z) {
                return false;
            }
            LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
            m1120h(layerDrawable2.findDrawableByLayerId(R.id.background), ThemeUtils.getDisabledThemeAttrColor(context, C2948a.f12173y), AppCompatDrawableManager.DEFAULT_MODE);
            Drawable findDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(R.id.secondaryProgress);
            int i12 = C2948a.f12171w;
            m1120h(findDrawableByLayerId2, ThemeUtils.getThemeAttrColor(context, i12), AppCompatDrawableManager.DEFAULT_MODE);
            m1120h(layerDrawable2.findDrawableByLayerId(R.id.progress), ThemeUtils.getThemeAttrColor(context, i12), AppCompatDrawableManager.DEFAULT_MODE);
            return true;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0061 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0046  */
        @Override // androidx.appcompat.widget.ResourceManagerInternal.ResourceManagerHooks
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean tintDrawableUsingColorFilter(android.content.Context r7, int r8, android.graphics.drawable.Drawable r9) {
            /*
                r6 = this;
                android.graphics.PorterDuff$Mode r0 = androidx.appcompat.widget.AppCompatDrawableManager.access$000()
                int[] r1 = r6.f1000a
                boolean r1 = r6.m1113a(r1, r8)
                r2 = 16842801(0x1010031, float:2.3693695E-38)
                r3 = -1
                r4 = 0
                r5 = 1
                if (r1 == 0) goto L17
                int r2 = p039d.C2948a.f12173y
            L14:
                r8 = -1
            L15:
                r1 = 1
                goto L44
            L17:
                int[] r1 = r6.f1002c
                boolean r1 = r6.m1113a(r1, r8)
                if (r1 == 0) goto L22
                int r2 = p039d.C2948a.f12171w
                goto L14
            L22:
                int[] r1 = r6.f1003d
                boolean r1 = r6.m1113a(r1, r8)
                if (r1 == 0) goto L2d
                android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.MULTIPLY
                goto L14
            L2d:
                int r1 = p039d.C2952e.f12238u
                if (r8 != r1) goto L3c
                r2 = 16842800(0x1010030, float:2.3693693E-38)
                r8 = 1109603123(0x42233333, float:40.8)
                int r8 = java.lang.Math.round(r8)
                goto L15
            L3c:
                int r1 = p039d.C2952e.f12229l
                if (r8 != r1) goto L41
                goto L14
            L41:
                r8 = -1
                r1 = 0
                r2 = 0
            L44:
                if (r1 == 0) goto L61
                boolean r1 = androidx.appcompat.widget.DrawableUtils.canSafelyMutateDrawable(r9)
                if (r1 == 0) goto L50
                android.graphics.drawable.Drawable r9 = r9.mutate()
            L50:
                int r7 = androidx.appcompat.widget.ThemeUtils.getThemeAttrColor(r7, r2)
                android.graphics.PorterDuffColorFilter r7 = androidx.appcompat.widget.AppCompatDrawableManager.getPorterDuffColorFilter(r7, r0)
                r9.setColorFilter(r7)
                if (r8 == r3) goto L60
                r9.setAlpha(r8)
            L60:
                return r5
            L61:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AppCompatDrawableManager.C0193a.tintDrawableUsingColorFilter(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
        }
    }

    public static synchronized AppCompatDrawableManager get() {
        AppCompatDrawableManager appCompatDrawableManager;
        synchronized (AppCompatDrawableManager.class) {
            if (INSTANCE == null) {
                preload();
            }
            appCompatDrawableManager = INSTANCE;
        }
        return appCompatDrawableManager;
    }

    public static synchronized PorterDuffColorFilter getPorterDuffColorFilter(int i10, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        synchronized (AppCompatDrawableManager.class) {
            porterDuffColorFilter = ResourceManagerInternal.getPorterDuffColorFilter(i10, mode);
        }
        return porterDuffColorFilter;
    }

    public static synchronized void preload() {
        synchronized (AppCompatDrawableManager.class) {
            if (INSTANCE == null) {
                AppCompatDrawableManager appCompatDrawableManager = new AppCompatDrawableManager();
                INSTANCE = appCompatDrawableManager;
                appCompatDrawableManager.mResourceManager = ResourceManagerInternal.get();
                INSTANCE.mResourceManager.setHooks(new C0193a());
            }
        }
    }

    public static void tintDrawable(Drawable drawable, TintInfo tintInfo, int[] iArr) {
        ResourceManagerInternal.tintDrawable(drawable, tintInfo, iArr);
    }

    public synchronized Drawable getDrawable(Context context, int i10) {
        return this.mResourceManager.getDrawable(context, i10);
    }

    public synchronized ColorStateList getTintList(Context context, int i10) {
        return this.mResourceManager.getTintList(context, i10);
    }

    public synchronized void onConfigurationChanged(Context context) {
        this.mResourceManager.onConfigurationChanged(context);
    }

    synchronized Drawable onDrawableLoadedFromResources(Context context, VectorEnabledTintResources vectorEnabledTintResources, int i10) {
        return this.mResourceManager.onDrawableLoadedFromResources(context, vectorEnabledTintResources, i10);
    }

    boolean tintDrawableUsingColorFilter(Context context, int i10, Drawable drawable) {
        return this.mResourceManager.tintDrawableUsingColorFilter(context, i10, drawable);
    }

    public synchronized Drawable getDrawable(Context context, int i10, boolean z10) {
        return this.mResourceManager.getDrawable(context, i10, z10);
    }
}
