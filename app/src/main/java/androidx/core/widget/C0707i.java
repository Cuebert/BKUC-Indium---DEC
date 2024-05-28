package androidx.core.widget;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.icu.text.DecimalFormatSymbols;
import android.os.Build;
import android.text.Editable;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import androidx.core.text.C0643b;
import androidx.core.util.C0654h;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: androidx.core.widget.i */
/* loaded from: classes.dex */
public final class C0707i {

    /* renamed from: androidx.core.widget.i$a */
    /* loaded from: classes.dex */
    static class a {
        /* renamed from: a */
        static boolean m4180a(TextView textView) {
            return textView.getIncludeFontPadding();
        }

        /* renamed from: b */
        static int m4181b(TextView textView) {
            return textView.getMaxLines();
        }

        /* renamed from: c */
        static int m4182c(TextView textView) {
            return textView.getMinLines();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.widget.i$b */
    /* loaded from: classes.dex */
    public static class b {
        /* renamed from: a */
        static Drawable[] m4183a(TextView textView) {
            return textView.getCompoundDrawablesRelative();
        }

        /* renamed from: b */
        static int m4184b(View view) {
            return view.getLayoutDirection();
        }

        /* renamed from: c */
        static int m4185c(View view) {
            return view.getTextDirection();
        }

        /* renamed from: d */
        static Locale m4186d(TextView textView) {
            return textView.getTextLocale();
        }

        /* renamed from: e */
        static void m4187e(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            textView.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        }

        /* renamed from: f */
        static void m4188f(TextView textView, int i10, int i11, int i12, int i13) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(i10, i11, i12, i13);
        }

        /* renamed from: g */
        static void m4189g(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        }

        /* renamed from: h */
        static void m4190h(View view, int i10) {
            view.setTextDirection(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.widget.i$c */
    /* loaded from: classes.dex */
    public static class c {
        /* renamed from: a */
        static int m4191a(TextView textView) {
            return textView.getBreakStrategy();
        }

        /* renamed from: b */
        static ColorStateList m4192b(TextView textView) {
            return textView.getCompoundDrawableTintList();
        }

        /* renamed from: c */
        static PorterDuff.Mode m4193c(TextView textView) {
            return textView.getCompoundDrawableTintMode();
        }

        /* renamed from: d */
        static int m4194d(TextView textView) {
            return textView.getHyphenationFrequency();
        }

        /* renamed from: e */
        static void m4195e(TextView textView, int i10) {
            textView.setBreakStrategy(i10);
        }

        /* renamed from: f */
        static void m4196f(TextView textView, ColorStateList colorStateList) {
            textView.setCompoundDrawableTintList(colorStateList);
        }

        /* renamed from: g */
        static void m4197g(TextView textView, PorterDuff.Mode mode) {
            textView.setCompoundDrawableTintMode(mode);
        }

        /* renamed from: h */
        static void m4198h(TextView textView, int i10) {
            textView.setHyphenationFrequency(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.widget.i$d */
    /* loaded from: classes.dex */
    public static class d {
        /* renamed from: a */
        static DecimalFormatSymbols m4199a(Locale locale) {
            return DecimalFormatSymbols.getInstance(locale);
        }
    }

    /* renamed from: androidx.core.widget.i$e */
    /* loaded from: classes.dex */
    static class e {
        /* renamed from: a */
        static int m4200a(TextView textView) {
            return textView.getAutoSizeMaxTextSize();
        }

        /* renamed from: b */
        static int m4201b(TextView textView) {
            return textView.getAutoSizeMinTextSize();
        }

        /* renamed from: c */
        static int m4202c(TextView textView) {
            return textView.getAutoSizeStepGranularity();
        }

        /* renamed from: d */
        static int[] m4203d(TextView textView) {
            return textView.getAutoSizeTextAvailableSizes();
        }

        /* renamed from: e */
        static int m4204e(TextView textView) {
            return textView.getAutoSizeTextType();
        }

        /* renamed from: f */
        static void m4205f(TextView textView, int i10, int i11, int i12, int i13) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(i10, i11, i12, i13);
        }

        /* renamed from: g */
        static void m4206g(TextView textView, int[] iArr, int i10) {
            textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i10);
        }

        /* renamed from: h */
        static void m4207h(TextView textView, int i10) {
            textView.setAutoSizeTextTypeWithDefaults(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.widget.i$f */
    /* loaded from: classes.dex */
    public static class f {
        /* renamed from: a */
        static String[] m4208a(DecimalFormatSymbols decimalFormatSymbols) {
            return decimalFormatSymbols.getDigitStrings();
        }

        /* renamed from: b */
        static PrecomputedText.Params m4209b(TextView textView) {
            return textView.getTextMetricsParams();
        }

        /* renamed from: c */
        static void m4210c(TextView textView, int i10) {
            textView.setFirstBaselineToTopHeight(i10);
        }
    }

    /* renamed from: androidx.core.widget.i$g */
    /* loaded from: classes.dex */
    private static class g implements ActionMode.Callback {

        /* renamed from: a */
        private final ActionMode.Callback f3728a;

        /* renamed from: b */
        private final TextView f3729b;

        /* renamed from: c */
        private Class<?> f3730c;

        /* renamed from: d */
        private Method f3731d;

        /* renamed from: e */
        private boolean f3732e;

        /* renamed from: f */
        private boolean f3733f = false;

        g(ActionMode.Callback callback, TextView textView) {
            this.f3728a = callback;
            this.f3729b = textView;
        }

        /* renamed from: a */
        private Intent m4211a() {
            return new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
        }

        /* renamed from: b */
        private Intent m4212b(ResolveInfo resolveInfo, TextView textView) {
            Intent putExtra = m4211a().putExtra("android.intent.extra.PROCESS_TEXT_READONLY", !m4214d(textView));
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            return putExtra.setClassName(activityInfo.packageName, activityInfo.name);
        }

        /* renamed from: c */
        private List<ResolveInfo> m4213c(Context context, PackageManager packageManager) {
            ArrayList arrayList = new ArrayList();
            if (!(context instanceof Activity)) {
                return arrayList;
            }
            for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(m4211a(), 0)) {
                if (m4215e(resolveInfo, context)) {
                    arrayList.add(resolveInfo);
                }
            }
            return arrayList;
        }

        /* renamed from: d */
        private boolean m4214d(TextView textView) {
            return (textView instanceof Editable) && textView.onCheckIsTextEditor() && textView.isEnabled();
        }

        /* renamed from: e */
        private boolean m4215e(ResolveInfo resolveInfo, Context context) {
            if (context.getPackageName().equals(resolveInfo.activityInfo.packageName)) {
                return true;
            }
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            if (!activityInfo.exported) {
                return false;
            }
            String str = activityInfo.permission;
            return str == null || context.checkSelfPermission(str) == 0;
        }

        /* renamed from: f */
        private void m4216f(Menu menu) {
            Method declaredMethod;
            Context context = this.f3729b.getContext();
            PackageManager packageManager = context.getPackageManager();
            if (!this.f3733f) {
                this.f3733f = true;
                try {
                    Class<?> cls = Class.forName("com.android.internal.view.menu.MenuBuilder");
                    this.f3730c = cls;
                    this.f3731d = cls.getDeclaredMethod("removeItemAt", Integer.TYPE);
                    this.f3732e = true;
                } catch (ClassNotFoundException | NoSuchMethodException unused) {
                    this.f3730c = null;
                    this.f3731d = null;
                    this.f3732e = false;
                }
            }
            try {
                if (this.f3732e && this.f3730c.isInstance(menu)) {
                    declaredMethod = this.f3731d;
                } else {
                    declaredMethod = menu.getClass().getDeclaredMethod("removeItemAt", Integer.TYPE);
                }
                for (int size = menu.size() - 1; size >= 0; size--) {
                    MenuItem item = menu.getItem(size);
                    if (item.getIntent() != null && "android.intent.action.PROCESS_TEXT".equals(item.getIntent().getAction())) {
                        declaredMethod.invoke(menu, Integer.valueOf(size));
                    }
                }
                List<ResolveInfo> m4213c = m4213c(context, packageManager);
                for (int i10 = 0; i10 < m4213c.size(); i10++) {
                    ResolveInfo resolveInfo = m4213c.get(i10);
                    menu.add(0, 0, i10 + 100, resolveInfo.loadLabel(packageManager)).setIntent(m4212b(resolveInfo, this.f3729b)).setShowAsAction(1);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
            }
        }

        @Override // android.view.ActionMode.Callback
        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return this.f3728a.onActionItemClicked(actionMode, menuItem);
        }

        @Override // android.view.ActionMode.Callback
        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            return this.f3728a.onCreateActionMode(actionMode, menu);
        }

        @Override // android.view.ActionMode.Callback
        public void onDestroyActionMode(ActionMode actionMode) {
            this.f3728a.onDestroyActionMode(actionMode);
        }

        @Override // android.view.ActionMode.Callback
        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            m4216f(menu);
            return this.f3728a.onPrepareActionMode(actionMode, menu);
        }
    }

    /* renamed from: a */
    public static Drawable[] m4162a(TextView textView) {
        return b.m4183a(textView);
    }

    /* renamed from: b */
    public static int m4163b(TextView textView) {
        return textView.getPaddingTop() - textView.getPaint().getFontMetricsInt().top;
    }

    /* renamed from: c */
    public static int m4164c(TextView textView) {
        return textView.getPaddingBottom() + textView.getPaint().getFontMetricsInt().bottom;
    }

    /* renamed from: d */
    public static int m4165d(TextView textView) {
        return a.m4181b(textView);
    }

    /* renamed from: e */
    private static int m4166e(TextDirectionHeuristic textDirectionHeuristic) {
        if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL || textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
            return 1;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.ANYRTL_LTR) {
            return 2;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.LTR) {
            return 3;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.RTL) {
            return 4;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.LOCALE) {
            return 5;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
            return 6;
        }
        return textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL ? 7 : 1;
    }

    /* renamed from: f */
    private static TextDirectionHeuristic m4167f(TextView textView) {
        if (textView.getTransformationMethod() instanceof PasswordTransformationMethod) {
            return TextDirectionHeuristics.LTR;
        }
        if (Build.VERSION.SDK_INT >= 28 && (textView.getInputType() & 15) == 3) {
            byte directionality = Character.getDirectionality(f.m4208a(d.m4199a(b.m4186d(textView)))[0].codePointAt(0));
            if (directionality != 1 && directionality != 2) {
                return TextDirectionHeuristics.LTR;
            }
            return TextDirectionHeuristics.RTL;
        }
        boolean z10 = b.m4184b(textView) == 1;
        switch (b.m4185c(textView)) {
            case 2:
                return TextDirectionHeuristics.ANYRTL_LTR;
            case 3:
                return TextDirectionHeuristics.LTR;
            case 4:
                return TextDirectionHeuristics.RTL;
            case 5:
                return TextDirectionHeuristics.LOCALE;
            case 6:
                return TextDirectionHeuristics.FIRSTSTRONG_LTR;
            case 7:
                return TextDirectionHeuristics.FIRSTSTRONG_RTL;
            default:
                if (z10) {
                    return TextDirectionHeuristics.FIRSTSTRONG_RTL;
                }
                return TextDirectionHeuristics.FIRSTSTRONG_LTR;
        }
    }

    /* renamed from: g */
    public static C0643b.a m4168g(TextView textView) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            return new C0643b.a(f.m4209b(textView));
        }
        C0643b.a.C6039a c6039a = new C0643b.a.C6039a(new TextPaint(textView.getPaint()));
        if (i10 >= 23) {
            c6039a.m3440b(c.m4191a(textView));
            c6039a.m3441c(c.m4194d(textView));
        }
        c6039a.m3442d(m4167f(textView));
        return c6039a.m3439a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: h */
    public static void m4169h(TextView textView, int i10, int i11, int i12, int i13) throws IllegalArgumentException {
        if (Build.VERSION.SDK_INT >= 27) {
            e.m4205f(textView, i10, i11, i12, i13);
        } else if (textView instanceof InterfaceC0700b) {
            ((InterfaceC0700b) textView).setAutoSizeTextTypeUniformWithConfiguration(i10, i11, i12, i13);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: i */
    public static void m4170i(TextView textView, ColorStateList colorStateList) {
        C0654h.m3467f(textView);
        if (Build.VERSION.SDK_INT >= 24) {
            c.m4196f(textView, colorStateList);
        } else if (textView instanceof InterfaceC0709k) {
            ((InterfaceC0709k) textView).setSupportCompoundDrawablesTintList(colorStateList);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: j */
    public static void m4171j(TextView textView, PorterDuff.Mode mode) {
        C0654h.m3467f(textView);
        if (Build.VERSION.SDK_INT >= 24) {
            c.m4197g(textView, mode);
        } else if (textView instanceof InterfaceC0709k) {
            ((InterfaceC0709k) textView).setSupportCompoundDrawablesTintMode(mode);
        }
    }

    /* renamed from: k */
    public static void m4172k(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        b.m4187e(textView, drawable, drawable2, drawable3, drawable4);
    }

    /* renamed from: l */
    public static void m4173l(TextView textView, int i10) {
        int i11;
        C0654h.m3465d(i10);
        if (Build.VERSION.SDK_INT >= 28) {
            f.m4210c(textView, i10);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        if (a.m4180a(textView)) {
            i11 = fontMetricsInt.top;
        } else {
            i11 = fontMetricsInt.ascent;
        }
        if (i10 > Math.abs(i11)) {
            textView.setPadding(textView.getPaddingLeft(), i10 + i11, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    /* renamed from: m */
    public static void m4174m(TextView textView, int i10) {
        int i11;
        C0654h.m3465d(i10);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        if (a.m4180a(textView)) {
            i11 = fontMetricsInt.bottom;
        } else {
            i11 = fontMetricsInt.descent;
        }
        if (i10 > Math.abs(i11)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i10 - i11);
        }
    }

    /* renamed from: n */
    public static void m4175n(TextView textView, int i10) {
        C0654h.m3465d(i10);
        if (i10 != textView.getPaint().getFontMetricsInt(null)) {
            textView.setLineSpacing(i10 - r0, 1.0f);
        }
    }

    /* renamed from: o */
    public static void m4176o(TextView textView, C0643b c0643b) {
        if (Build.VERSION.SDK_INT >= 29) {
            textView.setText(c0643b.m3433b());
        } else {
            if (m4168g(textView).m3434a(c0643b.m3432a())) {
                textView.setText(c0643b);
                return;
            }
            throw new IllegalArgumentException("Given text can not be applied to TextView.");
        }
    }

    /* renamed from: p */
    public static void m4177p(TextView textView, int i10) {
        if (Build.VERSION.SDK_INT >= 23) {
            textView.setTextAppearance(i10);
        } else {
            textView.setTextAppearance(textView.getContext(), i10);
        }
    }

    /* renamed from: q */
    public static void m4178q(TextView textView, C0643b.a aVar) {
        int i10 = Build.VERSION.SDK_INT;
        b.m4190h(textView, m4166e(aVar.m3437d()));
        if (i10 < 23) {
            float textScaleX = aVar.m3438e().getTextScaleX();
            textView.getPaint().set(aVar.m3438e());
            if (textScaleX == textView.getTextScaleX()) {
                textView.setTextScaleX((textScaleX / 2.0f) + 1.0f);
            }
            textView.setTextScaleX(textScaleX);
            return;
        }
        textView.getPaint().set(aVar.m3438e());
        c.m4195e(textView, aVar.m3435b());
        c.m4198h(textView, aVar.m3436c());
    }

    /* renamed from: r */
    public static ActionMode.Callback m4179r(TextView textView, ActionMode.Callback callback) {
        int i10 = Build.VERSION.SDK_INT;
        return (i10 < 26 || i10 > 27 || (callback instanceof g) || callback == null) ? callback : new g(callback, textView);
    }
}
