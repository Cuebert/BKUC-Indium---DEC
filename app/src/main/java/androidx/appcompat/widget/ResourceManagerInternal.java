package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import androidx.core.content.C0587a;
import androidx.core.graphics.drawable.C0609a;
import androidx.vectordrawable.graphics.drawable.C0934b;
import androidx.vectordrawable.graphics.drawable.C0939g;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p080g.C3217a;
import p092h.C3354a;
import p093h0.C3359d;
import p093h0.C3360e;
import p093h0.C3362g;
import p093h0.C3363h;

/* loaded from: classes.dex */
public final class ResourceManagerInternal {
    private static final boolean DEBUG = false;
    private static ResourceManagerInternal INSTANCE = null;
    private static final String PLATFORM_VD_CLAZZ = "android.graphics.drawable.VectorDrawable";
    private static final String SKIP_DRAWABLE_TAG = "appcompat_skip_skip";
    private static final String TAG = "ResourceManagerInternal";
    private C3362g<String, InterfaceC0218e> mDelegates;
    private final WeakHashMap<Context, C3359d<WeakReference<Drawable.ConstantState>>> mDrawableCaches = new WeakHashMap<>(0);
    private boolean mHasCheckedVectorDrawableSetup;
    private ResourceManagerHooks mHooks;
    private C3363h<String> mKnownDrawableIdTags;
    private WeakHashMap<Context, C3363h<ColorStateList>> mTintLists;
    private TypedValue mTypedValue;
    private static final PorterDuff.Mode DEFAULT_MODE = PorterDuff.Mode.SRC_IN;
    private static final C0216c COLOR_FILTER_CACHE = new C0216c(6);

    /* loaded from: classes.dex */
    public interface ResourceManagerHooks {
        Drawable createDrawableFor(ResourceManagerInternal resourceManagerInternal, Context context, int i10);

        ColorStateList getTintListForDrawableRes(Context context, int i10);

        PorterDuff.Mode getTintModeForDrawableRes(int i10);

        boolean tintDrawable(Context context, int i10, Drawable drawable);

        boolean tintDrawableUsingColorFilter(Context context, int i10, Drawable drawable);
    }

    /* renamed from: androidx.appcompat.widget.ResourceManagerInternal$a */
    /* loaded from: classes.dex */
    public static class C0214a implements InterfaceC0218e {
        C0214a() {
        }

        @Override // androidx.appcompat.widget.ResourceManagerInternal.InterfaceC0218e
        /* renamed from: a */
        public Drawable mo1132a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return C3217a.m14317m(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e10) {
                Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", e10);
                return null;
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.ResourceManagerInternal$b */
    /* loaded from: classes.dex */
    public static class C0215b implements InterfaceC0218e {
        C0215b() {
        }

        @Override // androidx.appcompat.widget.ResourceManagerInternal.InterfaceC0218e
        /* renamed from: a */
        public Drawable mo1132a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return C0934b.m5967a(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e10) {
                Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e10);
                return null;
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.ResourceManagerInternal$c */
    /* loaded from: classes.dex */
    public static class C0216c extends C3360e<Integer, PorterDuffColorFilter> {
        public C0216c(int i10) {
            super(i10);
        }

        /* renamed from: j */
        private static int m1133j(int i10, PorterDuff.Mode mode) {
            return ((i10 + 31) * 31) + mode.hashCode();
        }

        /* renamed from: k */
        PorterDuffColorFilter m1134k(int i10, PorterDuff.Mode mode) {
            return m14815c(Integer.valueOf(m1133j(i10, mode)));
        }

        /* renamed from: l */
        PorterDuffColorFilter m1135l(int i10, PorterDuff.Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return m14816d(Integer.valueOf(m1133j(i10, mode)), porterDuffColorFilter);
        }
    }

    /* renamed from: androidx.appcompat.widget.ResourceManagerInternal$d */
    /* loaded from: classes.dex */
    public static class C0217d implements InterfaceC0218e {
        C0217d() {
        }

        @Override // androidx.appcompat.widget.ResourceManagerInternal.InterfaceC0218e
        /* renamed from: a */
        public Drawable mo1132a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            String classAttribute = attributeSet.getClassAttribute();
            if (classAttribute != null) {
                try {
                    Drawable drawable = (Drawable) C0217d.class.getClassLoader().loadClass(classAttribute).asSubclass(Drawable.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    drawable.inflate(context.getResources(), xmlPullParser, attributeSet, theme);
                    return drawable;
                } catch (Exception e10) {
                    Log.e("DrawableDelegate", "Exception while inflating <drawable>", e10);
                }
            }
            return null;
        }
    }

    /* renamed from: androidx.appcompat.widget.ResourceManagerInternal$e */
    /* loaded from: classes.dex */
    public interface InterfaceC0218e {
        /* renamed from: a */
        Drawable mo1132a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme);
    }

    /* renamed from: androidx.appcompat.widget.ResourceManagerInternal$f */
    /* loaded from: classes.dex */
    public static class C0219f implements InterfaceC0218e {
        C0219f() {
        }

        @Override // androidx.appcompat.widget.ResourceManagerInternal.InterfaceC0218e
        /* renamed from: a */
        public Drawable mo1132a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return C0939g.m5994c(context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e10) {
                Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e10);
                return null;
            }
        }
    }

    private void addDelegate(String str, InterfaceC0218e interfaceC0218e) {
        if (this.mDelegates == null) {
            this.mDelegates = new C3362g<>();
        }
        this.mDelegates.put(str, interfaceC0218e);
    }

    private synchronized boolean addDrawableToCache(Context context, long j10, Drawable drawable) {
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState == null) {
            return false;
        }
        C3359d<WeakReference<Drawable.ConstantState>> c3359d = this.mDrawableCaches.get(context);
        if (c3359d == null) {
            c3359d = new C3359d<>();
            this.mDrawableCaches.put(context, c3359d);
        }
        c3359d.m14809n(j10, new WeakReference<>(constantState));
        return true;
    }

    private void addTintListToCache(Context context, int i10, ColorStateList colorStateList) {
        if (this.mTintLists == null) {
            this.mTintLists = new WeakHashMap<>();
        }
        C3363h<ColorStateList> c3363h = this.mTintLists.get(context);
        if (c3363h == null) {
            c3363h = new C3363h<>();
            this.mTintLists.put(context, c3363h);
        }
        c3363h.m14846a(i10, colorStateList);
    }

    private void checkVectorDrawableSetup(Context context) {
        if (this.mHasCheckedVectorDrawableSetup) {
            return;
        }
        this.mHasCheckedVectorDrawableSetup = true;
        Drawable drawable = getDrawable(context, C3354a.f14034a);
        if (drawable == null || !isVectorDrawable(drawable)) {
            this.mHasCheckedVectorDrawableSetup = false;
            throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
        }
    }

    private static long createCacheKey(TypedValue typedValue) {
        return (typedValue.assetCookie << 32) | typedValue.data;
    }

    private Drawable createDrawableIfNeeded(Context context, int i10) {
        if (this.mTypedValue == null) {
            this.mTypedValue = new TypedValue();
        }
        TypedValue typedValue = this.mTypedValue;
        context.getResources().getValue(i10, typedValue, true);
        long createCacheKey = createCacheKey(typedValue);
        Drawable cachedDrawable = getCachedDrawable(context, createCacheKey);
        if (cachedDrawable != null) {
            return cachedDrawable;
        }
        ResourceManagerHooks resourceManagerHooks = this.mHooks;
        Drawable createDrawableFor = resourceManagerHooks == null ? null : resourceManagerHooks.createDrawableFor(this, context, i10);
        if (createDrawableFor != null) {
            createDrawableFor.setChangingConfigurations(typedValue.changingConfigurations);
            addDrawableToCache(context, createCacheKey, createDrawableFor);
        }
        return createDrawableFor;
    }

    private static PorterDuffColorFilter createTintFilter(ColorStateList colorStateList, PorterDuff.Mode mode, int[] iArr) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return getPorterDuffColorFilter(colorStateList.getColorForState(iArr, 0), mode);
    }

    public static synchronized ResourceManagerInternal get() {
        ResourceManagerInternal resourceManagerInternal;
        synchronized (ResourceManagerInternal.class) {
            if (INSTANCE == null) {
                ResourceManagerInternal resourceManagerInternal2 = new ResourceManagerInternal();
                INSTANCE = resourceManagerInternal2;
                installDefaultInflateDelegates(resourceManagerInternal2);
            }
            resourceManagerInternal = INSTANCE;
        }
        return resourceManagerInternal;
    }

    private synchronized Drawable getCachedDrawable(Context context, long j10) {
        C3359d<WeakReference<Drawable.ConstantState>> c3359d = this.mDrawableCaches.get(context);
        if (c3359d == null) {
            return null;
        }
        WeakReference<Drawable.ConstantState> m14805h = c3359d.m14805h(j10);
        if (m14805h != null) {
            Drawable.ConstantState constantState = m14805h.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            c3359d.m14810o(j10);
        }
        return null;
    }

    public static synchronized PorterDuffColorFilter getPorterDuffColorFilter(int i10, PorterDuff.Mode mode) {
        PorterDuffColorFilter m1134k;
        synchronized (ResourceManagerInternal.class) {
            C0216c c0216c = COLOR_FILTER_CACHE;
            m1134k = c0216c.m1134k(i10, mode);
            if (m1134k == null) {
                m1134k = new PorterDuffColorFilter(i10, mode);
                c0216c.m1135l(i10, mode, m1134k);
            }
        }
        return m1134k;
    }

    private ColorStateList getTintListFromCache(Context context, int i10) {
        C3363h<ColorStateList> c3363h;
        WeakHashMap<Context, C3363h<ColorStateList>> weakHashMap = this.mTintLists;
        if (weakHashMap == null || (c3363h = weakHashMap.get(context)) == null) {
            return null;
        }
        return c3363h.m14849h(i10);
    }

    private static void installDefaultInflateDelegates(ResourceManagerInternal resourceManagerInternal) {
        if (Build.VERSION.SDK_INT < 24) {
            resourceManagerInternal.addDelegate("vector", new C0219f());
            resourceManagerInternal.addDelegate("animated-vector", new C0215b());
            resourceManagerInternal.addDelegate("animated-selector", new C0214a());
            resourceManagerInternal.addDelegate("drawable", new C0217d());
        }
    }

    private static boolean isVectorDrawable(Drawable drawable) {
        return (drawable instanceof C0939g) || PLATFORM_VD_CLAZZ.equals(drawable.getClass().getName());
    }

    private Drawable loadDrawableFromDelegates(Context context, int i10) {
        int next;
        C3362g<String, InterfaceC0218e> c3362g = this.mDelegates;
        if (c3362g == null || c3362g.isEmpty()) {
            return null;
        }
        C3363h<String> c3363h = this.mKnownDrawableIdTags;
        if (c3363h != null) {
            String m14849h = c3363h.m14849h(i10);
            if (SKIP_DRAWABLE_TAG.equals(m14849h) || (m14849h != null && this.mDelegates.get(m14849h) == null)) {
                return null;
            }
        } else {
            this.mKnownDrawableIdTags = new C3363h<>();
        }
        if (this.mTypedValue == null) {
            this.mTypedValue = new TypedValue();
        }
        TypedValue typedValue = this.mTypedValue;
        Resources resources = context.getResources();
        resources.getValue(i10, typedValue, true);
        long createCacheKey = createCacheKey(typedValue);
        Drawable cachedDrawable = getCachedDrawable(context, createCacheKey);
        if (cachedDrawable != null) {
            return cachedDrawable;
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && charSequence.toString().endsWith(".xml")) {
            try {
                XmlResourceParser xml = resources.getXml(i10);
                AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next == 2) {
                    String name = xml.getName();
                    this.mKnownDrawableIdTags.m14846a(i10, name);
                    InterfaceC0218e interfaceC0218e = this.mDelegates.get(name);
                    if (interfaceC0218e != null) {
                        cachedDrawable = interfaceC0218e.mo1132a(context, xml, asAttributeSet, context.getTheme());
                    }
                    if (cachedDrawable != null) {
                        cachedDrawable.setChangingConfigurations(typedValue.changingConfigurations);
                        addDrawableToCache(context, createCacheKey, cachedDrawable);
                    }
                } else {
                    throw new XmlPullParserException("No start tag found");
                }
            } catch (Exception e10) {
                Log.e(TAG, "Exception while inflating drawable", e10);
            }
        }
        if (cachedDrawable == null) {
            this.mKnownDrawableIdTags.m14846a(i10, SKIP_DRAWABLE_TAG);
        }
        return cachedDrawable;
    }

    private Drawable tintDrawable(Context context, int i10, boolean z10, Drawable drawable) {
        ColorStateList tintList = getTintList(context, i10);
        if (tintList != null) {
            if (DrawableUtils.canSafelyMutateDrawable(drawable)) {
                drawable = drawable.mutate();
            }
            Drawable m3263r = C0609a.m3263r(drawable);
            C0609a.m3260o(m3263r, tintList);
            PorterDuff.Mode tintMode = getTintMode(i10);
            if (tintMode == null) {
                return m3263r;
            }
            C0609a.m3261p(m3263r, tintMode);
            return m3263r;
        }
        ResourceManagerHooks resourceManagerHooks = this.mHooks;
        if ((resourceManagerHooks == null || !resourceManagerHooks.tintDrawable(context, i10, drawable)) && !tintDrawableUsingColorFilter(context, i10, drawable) && z10) {
            return null;
        }
        return drawable;
    }

    public synchronized Drawable getDrawable(Context context, int i10) {
        return getDrawable(context, i10, false);
    }

    public synchronized ColorStateList getTintList(Context context, int i10) {
        ColorStateList tintListFromCache;
        tintListFromCache = getTintListFromCache(context, i10);
        if (tintListFromCache == null) {
            ResourceManagerHooks resourceManagerHooks = this.mHooks;
            tintListFromCache = resourceManagerHooks == null ? null : resourceManagerHooks.getTintListForDrawableRes(context, i10);
            if (tintListFromCache != null) {
                addTintListToCache(context, i10, tintListFromCache);
            }
        }
        return tintListFromCache;
    }

    PorterDuff.Mode getTintMode(int i10) {
        ResourceManagerHooks resourceManagerHooks = this.mHooks;
        if (resourceManagerHooks == null) {
            return null;
        }
        return resourceManagerHooks.getTintModeForDrawableRes(i10);
    }

    public synchronized void onConfigurationChanged(Context context) {
        C3359d<WeakReference<Drawable.ConstantState>> c3359d = this.mDrawableCaches.get(context);
        if (c3359d != null) {
            c3359d.m14803d();
        }
    }

    public synchronized Drawable onDrawableLoadedFromResources(Context context, VectorEnabledTintResources vectorEnabledTintResources, int i10) {
        Drawable loadDrawableFromDelegates = loadDrawableFromDelegates(context, i10);
        if (loadDrawableFromDelegates == null) {
            loadDrawableFromDelegates = vectorEnabledTintResources.superGetDrawable(i10);
        }
        if (loadDrawableFromDelegates == null) {
            return null;
        }
        return tintDrawable(context, i10, false, loadDrawableFromDelegates);
    }

    public synchronized void setHooks(ResourceManagerHooks resourceManagerHooks) {
        this.mHooks = resourceManagerHooks;
    }

    public boolean tintDrawableUsingColorFilter(Context context, int i10, Drawable drawable) {
        ResourceManagerHooks resourceManagerHooks = this.mHooks;
        return resourceManagerHooks != null && resourceManagerHooks.tintDrawableUsingColorFilter(context, i10, drawable);
    }

    public synchronized Drawable getDrawable(Context context, int i10, boolean z10) {
        Drawable loadDrawableFromDelegates;
        checkVectorDrawableSetup(context);
        loadDrawableFromDelegates = loadDrawableFromDelegates(context, i10);
        if (loadDrawableFromDelegates == null) {
            loadDrawableFromDelegates = createDrawableIfNeeded(context, i10);
        }
        if (loadDrawableFromDelegates == null) {
            loadDrawableFromDelegates = C0587a.m3031e(context, i10);
        }
        if (loadDrawableFromDelegates != null) {
            loadDrawableFromDelegates = tintDrawable(context, i10, z10, loadDrawableFromDelegates);
        }
        if (loadDrawableFromDelegates != null) {
            DrawableUtils.fixDrawable(loadDrawableFromDelegates);
        }
        return loadDrawableFromDelegates;
    }

    public static void tintDrawable(Drawable drawable, TintInfo tintInfo, int[] iArr) {
        if (DrawableUtils.canSafelyMutateDrawable(drawable) && drawable.mutate() != drawable) {
            Log.d(TAG, "Mutated drawable is not the same instance as the input.");
            return;
        }
        boolean z10 = tintInfo.mHasTintList;
        if (!z10 && !tintInfo.mHasTintMode) {
            drawable.clearColorFilter();
        } else {
            drawable.setColorFilter(createTintFilter(z10 ? tintInfo.mTintList : null, tintInfo.mHasTintMode ? tintInfo.mTintMode : DEFAULT_MODE, iArr));
        }
        if (Build.VERSION.SDK_INT <= 23) {
            drawable.invalidateSelf();
        }
    }
}
