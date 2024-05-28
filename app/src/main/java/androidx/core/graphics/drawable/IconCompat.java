package androidx.core.graphics.drawable;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.util.C0649c;
import androidx.core.util.C0654h;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: k */
    static final PorterDuff.Mode f3330k = PorterDuff.Mode.SRC_IN;

    /* renamed from: a */
    public int f3331a;

    /* renamed from: b */
    Object f3332b;

    /* renamed from: c */
    public byte[] f3333c;

    /* renamed from: d */
    public Parcelable f3334d;

    /* renamed from: e */
    public int f3335e;

    /* renamed from: f */
    public int f3336f;

    /* renamed from: g */
    public ColorStateList f3337g;

    /* renamed from: h */
    PorterDuff.Mode f3338h;

    /* renamed from: i */
    public String f3339i;

    /* renamed from: j */
    public String f3340j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.graphics.drawable.IconCompat$a */
    /* loaded from: classes.dex */
    public static class C0605a {
        /* renamed from: a */
        static IconCompat m3232a(Object obj) {
            C0654h.m3467f(obj);
            int m3235d = m3235d(obj);
            if (m3235d == 2) {
                return IconCompat.m3219i(null, m3234c(obj), m3233b(obj));
            }
            if (m3235d == 4) {
                return IconCompat.m3216f(m3236e(obj));
            }
            if (m3235d != 6) {
                IconCompat iconCompat = new IconCompat(-1);
                iconCompat.f3332b = obj;
                return iconCompat;
            }
            return IconCompat.m3213c(m3236e(obj));
        }

        /* renamed from: b */
        static int m3233b(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return C0607c.m3241a(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getResId", new Class[0]).invoke(obj, new Object[0])).intValue();
            } catch (IllegalAccessException e10) {
                Log.e("IconCompat", "Unable to get icon resource", e10);
                return 0;
            } catch (NoSuchMethodException e11) {
                Log.e("IconCompat", "Unable to get icon resource", e11);
                return 0;
            } catch (InvocationTargetException e12) {
                Log.e("IconCompat", "Unable to get icon resource", e12);
                return 0;
            }
        }

        /* renamed from: c */
        static String m3234c(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return C0607c.m3242b(obj);
            }
            try {
                return (String) obj.getClass().getMethod("getResPackage", new Class[0]).invoke(obj, new Object[0]);
            } catch (IllegalAccessException e10) {
                Log.e("IconCompat", "Unable to get icon package", e10);
                return null;
            } catch (NoSuchMethodException e11) {
                Log.e("IconCompat", "Unable to get icon package", e11);
                return null;
            } catch (InvocationTargetException e12) {
                Log.e("IconCompat", "Unable to get icon package", e12);
                return null;
            }
        }

        /* renamed from: d */
        static int m3235d(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return C0607c.m3243c(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getType", new Class[0]).invoke(obj, new Object[0])).intValue();
            } catch (IllegalAccessException e10) {
                Log.e("IconCompat", "Unable to get icon type " + obj, e10);
                return -1;
            } catch (NoSuchMethodException e11) {
                Log.e("IconCompat", "Unable to get icon type " + obj, e11);
                return -1;
            } catch (InvocationTargetException e12) {
                Log.e("IconCompat", "Unable to get icon type " + obj, e12);
                return -1;
            }
        }

        /* renamed from: e */
        static Uri m3236e(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return C0607c.m3244d(obj);
            }
            try {
                return (Uri) obj.getClass().getMethod("getUri", new Class[0]).invoke(obj, new Object[0]);
            } catch (IllegalAccessException e10) {
                Log.e("IconCompat", "Unable to get icon uri", e10);
                return null;
            } catch (NoSuchMethodException e11) {
                Log.e("IconCompat", "Unable to get icon uri", e11);
                return null;
            } catch (InvocationTargetException e12) {
                Log.e("IconCompat", "Unable to get icon uri", e12);
                return null;
            }
        }

        /* renamed from: f */
        static Drawable m3237f(Icon icon, Context context) {
            return icon.loadDrawable(context);
        }

        /* renamed from: g */
        static Icon m3238g(IconCompat iconCompat, Context context) {
            Icon createWithBitmap;
            switch (iconCompat.f3331a) {
                case -1:
                    return (Icon) iconCompat.f3332b;
                case 0:
                default:
                    throw new IllegalArgumentException("Unknown type");
                case 1:
                    createWithBitmap = Icon.createWithBitmap((Bitmap) iconCompat.f3332b);
                    break;
                case 2:
                    createWithBitmap = Icon.createWithResource(iconCompat.m3223l(), iconCompat.f3335e);
                    break;
                case 3:
                    createWithBitmap = Icon.createWithData((byte[]) iconCompat.f3332b, iconCompat.f3335e, iconCompat.f3336f);
                    break;
                case 4:
                    createWithBitmap = Icon.createWithContentUri((String) iconCompat.f3332b);
                    break;
                case 5:
                    if (Build.VERSION.SDK_INT >= 26) {
                        createWithBitmap = C0606b.m3240b((Bitmap) iconCompat.f3332b);
                        break;
                    } else {
                        createWithBitmap = Icon.createWithBitmap(IconCompat.m3212b((Bitmap) iconCompat.f3332b, false));
                        break;
                    }
                case 6:
                    int i10 = Build.VERSION.SDK_INT;
                    if (i10 >= 30) {
                        createWithBitmap = C0608d.m3245a(iconCompat.m3225n());
                        break;
                    } else if (context != null) {
                        InputStream m3226o = iconCompat.m3226o(context);
                        if (m3226o == null) {
                            throw new IllegalStateException("Cannot load adaptive icon from uri: " + iconCompat.m3225n());
                        }
                        if (i10 >= 26) {
                            createWithBitmap = C0606b.m3240b(BitmapFactory.decodeStream(m3226o));
                            break;
                        } else {
                            createWithBitmap = Icon.createWithBitmap(IconCompat.m3212b(BitmapFactory.decodeStream(m3226o), false));
                            break;
                        }
                    } else {
                        throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: " + iconCompat.m3225n());
                    }
            }
            ColorStateList colorStateList = iconCompat.f3337g;
            if (colorStateList != null) {
                createWithBitmap.setTintList(colorStateList);
            }
            PorterDuff.Mode mode = iconCompat.f3338h;
            if (mode != IconCompat.f3330k) {
                createWithBitmap.setTintMode(mode);
            }
            return createWithBitmap;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.graphics.drawable.IconCompat$b */
    /* loaded from: classes.dex */
    public static class C0606b {
        /* renamed from: a */
        static Drawable m3239a(Drawable drawable, Drawable drawable2) {
            return new AdaptiveIconDrawable(drawable, drawable2);
        }

        /* renamed from: b */
        static Icon m3240b(Bitmap bitmap) {
            return Icon.createWithAdaptiveBitmap(bitmap);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.graphics.drawable.IconCompat$c */
    /* loaded from: classes.dex */
    public static class C0607c {
        /* renamed from: a */
        static int m3241a(Object obj) {
            return ((Icon) obj).getResId();
        }

        /* renamed from: b */
        static String m3242b(Object obj) {
            return ((Icon) obj).getResPackage();
        }

        /* renamed from: c */
        static int m3243c(Object obj) {
            return ((Icon) obj).getType();
        }

        /* renamed from: d */
        static Uri m3244d(Object obj) {
            return ((Icon) obj).getUri();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.graphics.drawable.IconCompat$d */
    /* loaded from: classes.dex */
    public static class C0608d {
        /* renamed from: a */
        static Icon m3245a(Uri uri) {
            return Icon.createWithAdaptiveBitmapContentUri(uri);
        }
    }

    public IconCompat() {
        this.f3331a = -1;
        this.f3333c = null;
        this.f3334d = null;
        this.f3335e = 0;
        this.f3336f = 0;
        this.f3337g = null;
        this.f3338h = f3330k;
        this.f3339i = null;
    }

    /* renamed from: a */
    public static IconCompat m3211a(Icon icon) {
        return C0605a.m3232a(icon);
    }

    /* renamed from: b */
    static Bitmap m3212b(Bitmap bitmap, boolean z10) {
        int min = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
        Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(3);
        float f10 = min;
        float f11 = 0.5f * f10;
        float f12 = 0.9166667f * f11;
        if (z10) {
            float f13 = 0.010416667f * f10;
            paint.setColor(0);
            paint.setShadowLayer(f13, 0.0f, f10 * 0.020833334f, 1023410176);
            canvas.drawCircle(f11, f11, f12, paint);
            paint.setShadowLayer(f13, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f11, f11, f12, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - min)) / 2.0f, (-(bitmap.getHeight() - min)) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f11, f11, f12, paint);
        canvas.setBitmap(null);
        return createBitmap;
    }

    /* renamed from: c */
    public static IconCompat m3213c(Uri uri) {
        C0649c.m3454c(uri);
        return m3214d(uri.toString());
    }

    /* renamed from: d */
    public static IconCompat m3214d(String str) {
        C0649c.m3454c(str);
        IconCompat iconCompat = new IconCompat(6);
        iconCompat.f3332b = str;
        return iconCompat;
    }

    /* renamed from: e */
    public static IconCompat m3215e(Bitmap bitmap) {
        C0649c.m3454c(bitmap);
        IconCompat iconCompat = new IconCompat(1);
        iconCompat.f3332b = bitmap;
        return iconCompat;
    }

    /* renamed from: f */
    public static IconCompat m3216f(Uri uri) {
        C0649c.m3454c(uri);
        return m3217g(uri.toString());
    }

    /* renamed from: g */
    public static IconCompat m3217g(String str) {
        C0649c.m3454c(str);
        IconCompat iconCompat = new IconCompat(4);
        iconCompat.f3332b = str;
        return iconCompat;
    }

    /* renamed from: h */
    public static IconCompat m3218h(Context context, int i10) {
        C0649c.m3454c(context);
        return m3219i(context.getResources(), context.getPackageName(), i10);
    }

    /* renamed from: i */
    public static IconCompat m3219i(Resources resources, String str, int i10) {
        C0649c.m3454c(str);
        if (i10 != 0) {
            IconCompat iconCompat = new IconCompat(2);
            iconCompat.f3335e = i10;
            if (resources != null) {
                try {
                    iconCompat.f3332b = resources.getResourceName(i10);
                } catch (Resources.NotFoundException unused) {
                    throw new IllegalArgumentException("Icon resource cannot be found");
                }
            } else {
                iconCompat.f3332b = str;
            }
            iconCompat.f3340j = str;
            return iconCompat;
        }
        throw new IllegalArgumentException("Drawable resource ID must not be 0");
    }

    /* renamed from: u */
    private static String m3220u(int i10) {
        switch (i10) {
            case 1:
                return "BITMAP";
            case 2:
                return "RESOURCE";
            case 3:
                return "DATA";
            case 4:
                return "URI";
            case 5:
                return "BITMAP_MASKABLE";
            case 6:
                return "URI_MASKABLE";
            default:
                return "UNKNOWN";
        }
    }

    /* renamed from: j */
    public Bitmap m3221j() {
        int i10 = this.f3331a;
        if (i10 == -1 && Build.VERSION.SDK_INT >= 23) {
            Object obj = this.f3332b;
            if (obj instanceof Bitmap) {
                return (Bitmap) obj;
            }
            return null;
        }
        if (i10 == 1) {
            return (Bitmap) this.f3332b;
        }
        if (i10 == 5) {
            return m3212b((Bitmap) this.f3332b, true);
        }
        throw new IllegalStateException("called getBitmap() on " + this);
    }

    /* renamed from: k */
    public int m3222k() {
        int i10 = this.f3331a;
        if (i10 == -1 && Build.VERSION.SDK_INT >= 23) {
            return C0605a.m3233b(this.f3332b);
        }
        if (i10 == 2) {
            return this.f3335e;
        }
        throw new IllegalStateException("called getResId() on " + this);
    }

    /* renamed from: l */
    public String m3223l() {
        int i10 = this.f3331a;
        if (i10 == -1 && Build.VERSION.SDK_INT >= 23) {
            return C0605a.m3234c(this.f3332b);
        }
        if (i10 == 2) {
            String str = this.f3340j;
            if (str != null && !TextUtils.isEmpty(str)) {
                return this.f3340j;
            }
            return ((String) this.f3332b).split(":", -1)[0];
        }
        throw new IllegalStateException("called getResPackage() on " + this);
    }

    /* renamed from: m */
    public int m3224m() {
        int i10 = this.f3331a;
        return (i10 != -1 || Build.VERSION.SDK_INT < 23) ? i10 : C0605a.m3235d(this.f3332b);
    }

    /* renamed from: n */
    public Uri m3225n() {
        int i10 = this.f3331a;
        if (i10 == -1 && Build.VERSION.SDK_INT >= 23) {
            return C0605a.m3236e(this.f3332b);
        }
        if (i10 != 4 && i10 != 6) {
            throw new IllegalStateException("called getUri() on " + this);
        }
        return Uri.parse((String) this.f3332b);
    }

    /* renamed from: o */
    public InputStream m3226o(Context context) {
        Uri m3225n = m3225n();
        String scheme = m3225n.getScheme();
        if (!"content".equals(scheme) && !"file".equals(scheme)) {
            try {
                return new FileInputStream(new File((String) this.f3332b));
            } catch (FileNotFoundException e10) {
                Log.w("IconCompat", "Unable to load image from path: " + m3225n, e10);
                return null;
            }
        }
        try {
            return context.getContentResolver().openInputStream(m3225n);
        } catch (Exception e11) {
            Log.w("IconCompat", "Unable to load image from URI: " + m3225n, e11);
            return null;
        }
    }

    /* renamed from: p */
    public void m3227p() {
        this.f3338h = PorterDuff.Mode.valueOf(this.f3339i);
        switch (this.f3331a) {
            case -1:
                Parcelable parcelable = this.f3334d;
                if (parcelable != null) {
                    this.f3332b = parcelable;
                    return;
                }
                throw new IllegalArgumentException("Invalid icon");
            case 0:
            default:
                return;
            case 1:
            case 5:
                Parcelable parcelable2 = this.f3334d;
                if (parcelable2 != null) {
                    this.f3332b = parcelable2;
                    return;
                }
                byte[] bArr = this.f3333c;
                this.f3332b = bArr;
                this.f3331a = 3;
                this.f3335e = 0;
                this.f3336f = bArr.length;
                return;
            case 2:
            case 4:
            case 6:
                String str = new String(this.f3333c, Charset.forName("UTF-16"));
                this.f3332b = str;
                if (this.f3331a == 2 && this.f3340j == null) {
                    this.f3340j = str.split(":", -1)[0];
                    return;
                }
                return;
            case 3:
                this.f3332b = this.f3333c;
                return;
        }
    }

    /* renamed from: q */
    public void m3228q(boolean z10) {
        this.f3339i = this.f3338h.name();
        switch (this.f3331a) {
            case -1:
                if (!z10) {
                    this.f3334d = (Parcelable) this.f3332b;
                    return;
                }
                throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
            case 0:
            default:
                return;
            case 1:
            case 5:
                if (z10) {
                    Bitmap bitmap = (Bitmap) this.f3332b;
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    bitmap.compress(Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
                    this.f3333c = byteArrayOutputStream.toByteArray();
                    return;
                }
                this.f3334d = (Parcelable) this.f3332b;
                return;
            case 2:
                this.f3333c = ((String) this.f3332b).getBytes(Charset.forName("UTF-16"));
                return;
            case 3:
                this.f3333c = (byte[]) this.f3332b;
                return;
            case 4:
            case 6:
                this.f3333c = this.f3332b.toString().getBytes(Charset.forName("UTF-16"));
                return;
        }
    }

    /* renamed from: r */
    public Bundle m3229r() {
        Bundle bundle = new Bundle();
        switch (this.f3331a) {
            case -1:
                bundle.putParcelable("obj", (Parcelable) this.f3332b);
                break;
            case 0:
            default:
                throw new IllegalArgumentException("Invalid icon");
            case 1:
            case 5:
                bundle.putParcelable("obj", (Bitmap) this.f3332b);
                break;
            case 2:
            case 4:
            case 6:
                bundle.putString("obj", (String) this.f3332b);
                break;
            case 3:
                bundle.putByteArray("obj", (byte[]) this.f3332b);
                break;
        }
        bundle.putInt("type", this.f3331a);
        bundle.putInt("int1", this.f3335e);
        bundle.putInt("int2", this.f3336f);
        bundle.putString("string1", this.f3340j);
        ColorStateList colorStateList = this.f3337g;
        if (colorStateList != null) {
            bundle.putParcelable("tint_list", colorStateList);
        }
        PorterDuff.Mode mode = this.f3338h;
        if (mode != f3330k) {
            bundle.putString("tint_mode", mode.name());
        }
        return bundle;
    }

    @Deprecated
    /* renamed from: s */
    public Icon m3230s() {
        return m3231t(null);
    }

    /* renamed from: t */
    public Icon m3231t(Context context) {
        if (Build.VERSION.SDK_INT >= 23) {
            return C0605a.m3238g(this, context);
        }
        throw new UnsupportedOperationException("This method is only supported on API level 23+");
    }

    public String toString() {
        if (this.f3331a == -1) {
            return String.valueOf(this.f3332b);
        }
        StringBuilder sb2 = new StringBuilder("Icon(typ=");
        sb2.append(m3220u(this.f3331a));
        switch (this.f3331a) {
            case 1:
            case 5:
                sb2.append(" size=");
                sb2.append(((Bitmap) this.f3332b).getWidth());
                sb2.append("x");
                sb2.append(((Bitmap) this.f3332b).getHeight());
                break;
            case 2:
                sb2.append(" pkg=");
                sb2.append(this.f3340j);
                sb2.append(" id=");
                sb2.append(String.format("0x%08x", Integer.valueOf(m3222k())));
                break;
            case 3:
                sb2.append(" len=");
                sb2.append(this.f3335e);
                if (this.f3336f != 0) {
                    sb2.append(" off=");
                    sb2.append(this.f3336f);
                    break;
                }
                break;
            case 4:
            case 6:
                sb2.append(" uri=");
                sb2.append(this.f3332b);
                break;
        }
        if (this.f3337g != null) {
            sb2.append(" tint=");
            sb2.append(this.f3337g);
        }
        if (this.f3338h != f3330k) {
            sb2.append(" mode=");
            sb2.append(this.f3338h);
        }
        sb2.append(")");
        return sb2.toString();
    }

    IconCompat(int i10) {
        this.f3333c = null;
        this.f3334d = null;
        this.f3335e = 0;
        this.f3336f = 0;
        this.f3337g = null;
        this.f3338h = f3330k;
        this.f3339i = null;
        this.f3331a = i10;
    }
}
