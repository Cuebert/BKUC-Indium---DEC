package androidx.appcompat.app;

import android.R;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.InflateException;
import android.view.View;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatCheckedTextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatMultiAutoCompleteTextView;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.appcompat.widget.AppCompatRatingBar;
import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.AppCompatToggleButton;
import androidx.appcompat.widget.TintContextWrapper;
import androidx.core.view.C0690v;
import com.appsflyer.oaid.BuildConfig;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p039d.C2957j;
import p093h0.C3362g;
import p120j.C3585d;

/* renamed from: androidx.appcompat.app.f */
/* loaded from: classes.dex */
public class C0156f {

    /* renamed from: b */
    private static final Class<?>[] f693b = {Context.class, AttributeSet.class};

    /* renamed from: c */
    private static final int[] f694c = {R.attr.onClick};

    /* renamed from: d */
    private static final String[] f695d = {"android.widget.", "android.view.", "android.webkit."};

    /* renamed from: e */
    private static final C3362g<String, Constructor<? extends View>> f696e = new C3362g<>();

    /* renamed from: a */
    private final Object[] f697a = new Object[2];

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.app.f$a */
    /* loaded from: classes.dex */
    public static class a implements View.OnClickListener {

        /* renamed from: n */
        private final View f698n;

        /* renamed from: o */
        private final String f699o;

        /* renamed from: p */
        private Method f700p;

        /* renamed from: q */
        private Context f701q;

        public a(View view, String str) {
            this.f698n = view;
            this.f699o = str;
        }

        /* renamed from: a */
        private void m868a(Context context) {
            String str;
            Method method;
            while (context != null) {
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(this.f699o, View.class)) != null) {
                        this.f700p = method;
                        this.f701q = context;
                        return;
                    }
                } catch (NoSuchMethodException unused) {
                }
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
            int id = this.f698n.getId();
            if (id == -1) {
                str = BuildConfig.FLAVOR;
            } else {
                str = " with id '" + this.f698n.getContext().getResources().getResourceEntryName(id) + "'";
            }
            throw new IllegalStateException("Could not find method " + this.f699o + "(View) in a parent or ancestor Context for android:onClick attribute defined on view " + this.f698n.getClass() + str);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.f700p == null) {
                m868a(this.f698n.getContext());
            }
            try {
                this.f700p.invoke(this.f701q, view);
            } catch (IllegalAccessException e10) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e10);
            } catch (InvocationTargetException e11) {
                throw new IllegalStateException("Could not execute method for android:onClick", e11);
            }
        }
    }

    /* renamed from: a */
    private void m847a(View view, AttributeSet attributeSet) {
        Context context = view.getContext();
        if ((context instanceof ContextWrapper) && C0690v.m3809P(view)) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f694c);
            String string = obtainStyledAttributes.getString(0);
            if (string != null) {
                view.setOnClickListener(new a(view, string));
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: r */
    private View m848r(Context context, String str, String str2) throws ClassNotFoundException, InflateException {
        String str3;
        C3362g<String, Constructor<? extends View>> c3362g = f696e;
        Constructor<? extends View> constructor = c3362g.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    str3 = str2 + str;
                } catch (Exception unused) {
                    return null;
                }
            } else {
                str3 = str;
            }
            constructor = Class.forName(str3, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f693b);
            c3362g.put(str, constructor);
        }
        constructor.setAccessible(true);
        return constructor.newInstance(this.f697a);
    }

    /* renamed from: s */
    private View m849s(Context context, String str, AttributeSet attributeSet) {
        if (str.equals("view")) {
            str = attributeSet.getAttributeValue(null, "class");
        }
        try {
            Object[] objArr = this.f697a;
            objArr[0] = context;
            objArr[1] = attributeSet;
            if (-1 != str.indexOf(46)) {
                return m848r(context, str, null);
            }
            int i10 = 0;
            while (true) {
                String[] strArr = f695d;
                if (i10 >= strArr.length) {
                    return null;
                }
                View m848r = m848r(context, str, strArr[i10]);
                if (m848r != null) {
                    return m848r;
                }
                i10++;
            }
        } catch (Exception unused) {
            return null;
        } finally {
            Object[] objArr2 = this.f697a;
            objArr2[0] = null;
            objArr2[1] = null;
        }
    }

    /* renamed from: t */
    private static Context m850t(Context context, AttributeSet attributeSet, boolean z10, boolean z11) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2957j.f12420Q3, 0, 0);
        int resourceId = z10 ? obtainStyledAttributes.getResourceId(C2957j.f12425R3, 0) : 0;
        if (z11 && resourceId == 0 && (resourceId = obtainStyledAttributes.getResourceId(C2957j.f12430S3, 0)) != 0) {
            Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        obtainStyledAttributes.recycle();
        return resourceId != 0 ? ((context instanceof C3585d) && ((C3585d) context).m15382c() == resourceId) ? context : new C3585d(context, resourceId) : context;
    }

    /* renamed from: u */
    private void m851u(View view, String str) {
        if (view != null) {
            return;
        }
        throw new IllegalStateException(getClass().getName() + " asked to inflate view for <" + str + ">, but returned null");
    }

    /* renamed from: b */
    protected AppCompatAutoCompleteTextView mo852b(Context context, AttributeSet attributeSet) {
        return new AppCompatAutoCompleteTextView(context, attributeSet);
    }

    /* renamed from: c */
    protected AppCompatButton mo853c(Context context, AttributeSet attributeSet) {
        return new AppCompatButton(context, attributeSet);
    }

    /* renamed from: d */
    protected AppCompatCheckBox mo854d(Context context, AttributeSet attributeSet) {
        return new AppCompatCheckBox(context, attributeSet);
    }

    /* renamed from: e */
    protected AppCompatCheckedTextView m855e(Context context, AttributeSet attributeSet) {
        return new AppCompatCheckedTextView(context, attributeSet);
    }

    /* renamed from: f */
    protected AppCompatEditText m856f(Context context, AttributeSet attributeSet) {
        return new AppCompatEditText(context, attributeSet);
    }

    /* renamed from: g */
    protected AppCompatImageButton m857g(Context context, AttributeSet attributeSet) {
        return new AppCompatImageButton(context, attributeSet);
    }

    /* renamed from: h */
    protected AppCompatImageView m858h(Context context, AttributeSet attributeSet) {
        return new AppCompatImageView(context, attributeSet);
    }

    /* renamed from: i */
    protected AppCompatMultiAutoCompleteTextView m859i(Context context, AttributeSet attributeSet) {
        return new AppCompatMultiAutoCompleteTextView(context, attributeSet);
    }

    /* renamed from: j */
    protected AppCompatRadioButton mo860j(Context context, AttributeSet attributeSet) {
        return new AppCompatRadioButton(context, attributeSet);
    }

    /* renamed from: k */
    protected AppCompatRatingBar m861k(Context context, AttributeSet attributeSet) {
        return new AppCompatRatingBar(context, attributeSet);
    }

    /* renamed from: l */
    protected AppCompatSeekBar m862l(Context context, AttributeSet attributeSet) {
        return new AppCompatSeekBar(context, attributeSet);
    }

    /* renamed from: m */
    protected AppCompatSpinner m863m(Context context, AttributeSet attributeSet) {
        return new AppCompatSpinner(context, attributeSet);
    }

    /* renamed from: n */
    protected AppCompatTextView mo864n(Context context, AttributeSet attributeSet) {
        return new AppCompatTextView(context, attributeSet);
    }

    /* renamed from: o */
    protected AppCompatToggleButton m865o(Context context, AttributeSet attributeSet) {
        return new AppCompatToggleButton(context, attributeSet);
    }

    /* renamed from: p */
    protected View m866p(Context context, String str, AttributeSet attributeSet) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public final View m867q(View view, String str, Context context, AttributeSet attributeSet, boolean z10, boolean z11, boolean z12, boolean z13) {
        View m861k;
        Context context2 = (!z10 || view == null) ? context : view.getContext();
        if (z11 || z12) {
            context2 = m850t(context2, attributeSet, z11, z12);
        }
        if (z13) {
            context2 = TintContextWrapper.wrap(context2);
        }
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1946472170:
                if (str.equals("RatingBar")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1455429095:
                if (str.equals("CheckedTextView")) {
                    c10 = 1;
                    break;
                }
                break;
            case -1346021293:
                if (str.equals("MultiAutoCompleteTextView")) {
                    c10 = 2;
                    break;
                }
                break;
            case -938935918:
                if (str.equals("TextView")) {
                    c10 = 3;
                    break;
                }
                break;
            case -937446323:
                if (str.equals("ImageButton")) {
                    c10 = 4;
                    break;
                }
                break;
            case -658531749:
                if (str.equals("SeekBar")) {
                    c10 = 5;
                    break;
                }
                break;
            case -339785223:
                if (str.equals("Spinner")) {
                    c10 = 6;
                    break;
                }
                break;
            case 776382189:
                if (str.equals("RadioButton")) {
                    c10 = 7;
                    break;
                }
                break;
            case 799298502:
                if (str.equals("ToggleButton")) {
                    c10 = '\b';
                    break;
                }
                break;
            case 1125864064:
                if (str.equals("ImageView")) {
                    c10 = '\t';
                    break;
                }
                break;
            case 1413872058:
                if (str.equals("AutoCompleteTextView")) {
                    c10 = '\n';
                    break;
                }
                break;
            case 1601505219:
                if (str.equals("CheckBox")) {
                    c10 = 11;
                    break;
                }
                break;
            case 1666676343:
                if (str.equals("EditText")) {
                    c10 = '\f';
                    break;
                }
                break;
            case 2001146706:
                if (str.equals("Button")) {
                    c10 = '\r';
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                m861k = m861k(context2, attributeSet);
                m851u(m861k, str);
                break;
            case 1:
                m861k = m855e(context2, attributeSet);
                m851u(m861k, str);
                break;
            case 2:
                m861k = m859i(context2, attributeSet);
                m851u(m861k, str);
                break;
            case 3:
                m861k = mo864n(context2, attributeSet);
                m851u(m861k, str);
                break;
            case 4:
                m861k = m857g(context2, attributeSet);
                m851u(m861k, str);
                break;
            case 5:
                m861k = m862l(context2, attributeSet);
                m851u(m861k, str);
                break;
            case 6:
                m861k = m863m(context2, attributeSet);
                m851u(m861k, str);
                break;
            case 7:
                m861k = mo860j(context2, attributeSet);
                m851u(m861k, str);
                break;
            case '\b':
                m861k = m865o(context2, attributeSet);
                m851u(m861k, str);
                break;
            case '\t':
                m861k = m858h(context2, attributeSet);
                m851u(m861k, str);
                break;
            case '\n':
                m861k = mo852b(context2, attributeSet);
                m851u(m861k, str);
                break;
            case 11:
                m861k = mo854d(context2, attributeSet);
                m851u(m861k, str);
                break;
            case '\f':
                m861k = m856f(context2, attributeSet);
                m851u(m861k, str);
                break;
            case '\r':
                m861k = mo853c(context2, attributeSet);
                m851u(m861k, str);
                break;
            default:
                m861k = m866p(context2, str, attributeSet);
                break;
        }
        if (m861k == null && context != context2) {
            m861k = m849s(context2, str, attributeSet);
        }
        if (m861k != null) {
            m847a(m861k, attributeSet);
        }
        return m861k;
    }
}
