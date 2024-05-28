package androidx.core.graphics;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import androidx.core.content.res.C0593e;
import androidx.core.provider.C0640g;
import java.io.IOException;

/* renamed from: androidx.core.graphics.i */
/* loaded from: classes.dex */
public class C0619i extends C0620j {
    /* renamed from: h */
    private Font m3314h(FontFamily fontFamily, int i10) {
        FontStyle fontStyle = new FontStyle((i10 & 1) != 0 ? 700 : 400, (i10 & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int m3315i = m3315i(fontStyle, font.getStyle());
        for (int i11 = 1; i11 < fontFamily.getSize(); i11++) {
            Font font2 = fontFamily.getFont(i11);
            int m3315i2 = m3315i(fontStyle, font2.getStyle());
            if (m3315i2 < m3315i) {
                font = font2;
                m3315i = m3315i2;
            }
        }
        return font;
    }

    /* renamed from: i */
    private static int m3315i(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    @Override // androidx.core.graphics.C0620j
    /* renamed from: a */
    public Typeface mo3293a(Context context, C0593e.c cVar, Resources resources, int i10) {
        try {
            FontFamily.Builder builder = null;
            for (C0593e.d dVar : cVar.m3107a()) {
                try {
                    Font build = new Font.Builder(resources, dVar.m3109b()).setWeight(dVar.m3112e()).setSlant(dVar.m3113f() ? 1 : 0).setTtcIndex(dVar.m3110c()).setFontVariationSettings(dVar.m3111d()).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(build);
                    } else {
                        builder.addFont(build);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily build2 = builder.build();
            return new Typeface.CustomFallbackBuilder(build2).setStyle(m3314h(build2, i10).getStyle()).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // androidx.core.graphics.C0620j
    /* renamed from: b */
    public Typeface mo3294b(Context context, CancellationSignal cancellationSignal, C0640g.b[] bVarArr, int i10) {
        int i11;
        ParcelFileDescriptor openFileDescriptor;
        ContentResolver contentResolver = context.getContentResolver();
        try {
            int length = bVarArr.length;
            FontFamily.Builder builder = null;
            while (i11 < length) {
                C0640g.b bVar = bVarArr[i11];
                try {
                    openFileDescriptor = contentResolver.openFileDescriptor(bVar.m3403d(), "r", cancellationSignal);
                } catch (IOException unused) {
                }
                if (openFileDescriptor != null) {
                    try {
                        Font build = new Font.Builder(openFileDescriptor).setWeight(bVar.m3404e()).setSlant(bVar.m3405f() ? 1 : 0).setTtcIndex(bVar.m3402c()).build();
                        if (builder == null) {
                            builder = new FontFamily.Builder(build);
                        } else {
                            builder.addFont(build);
                        }
                    } catch (Throwable th) {
                        try {
                            openFileDescriptor.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                        break;
                    }
                } else {
                    i11 = openFileDescriptor == null ? i11 + 1 : 0;
                }
                openFileDescriptor.close();
            }
            if (builder == null) {
                return null;
            }
            FontFamily build2 = builder.build();
            return new Typeface.CustomFallbackBuilder(build2).setStyle(m3314h(build2, i10).getStyle()).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // androidx.core.graphics.C0620j
    /* renamed from: d */
    public Typeface mo3305d(Context context, Resources resources, int i10, String str, int i11) {
        try {
            Font build = new Font.Builder(resources, i10).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(build).build()).setStyle(build.getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.core.graphics.C0620j
    /* renamed from: g */
    public C0640g.b mo3316g(C0640g.b[] bVarArr, int i10) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }
}
