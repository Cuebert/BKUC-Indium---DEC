package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.os.Parcelable;
import androidx.versionedparcelable.AbstractC0941a;

/* loaded from: classes.dex */
public class IconCompatParcelizer {
    public static IconCompat read(AbstractC0941a abstractC0941a) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f3331a = abstractC0941a.m6063p(iconCompat.f3331a, 1);
        iconCompat.f3333c = abstractC0941a.m6057j(iconCompat.f3333c, 2);
        iconCompat.f3334d = abstractC0941a.m6065r(iconCompat.f3334d, 3);
        iconCompat.f3335e = abstractC0941a.m6063p(iconCompat.f3335e, 4);
        iconCompat.f3336f = abstractC0941a.m6063p(iconCompat.f3336f, 5);
        iconCompat.f3337g = (ColorStateList) abstractC0941a.m6065r(iconCompat.f3337g, 6);
        iconCompat.f3339i = abstractC0941a.m6067t(iconCompat.f3339i, 7);
        iconCompat.f3340j = abstractC0941a.m6067t(iconCompat.f3340j, 8);
        iconCompat.m3227p();
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, AbstractC0941a abstractC0941a) {
        abstractC0941a.m6071x(true, true);
        iconCompat.m3228q(abstractC0941a.m6053f());
        int i10 = iconCompat.f3331a;
        if (-1 != i10) {
            abstractC0941a.m6043F(i10, 1);
        }
        byte[] bArr = iconCompat.f3333c;
        if (bArr != null) {
            abstractC0941a.m6039B(bArr, 2);
        }
        Parcelable parcelable = iconCompat.f3334d;
        if (parcelable != null) {
            abstractC0941a.m6045H(parcelable, 3);
        }
        int i11 = iconCompat.f3335e;
        if (i11 != 0) {
            abstractC0941a.m6043F(i11, 4);
        }
        int i12 = iconCompat.f3336f;
        if (i12 != 0) {
            abstractC0941a.m6043F(i12, 5);
        }
        ColorStateList colorStateList = iconCompat.f3337g;
        if (colorStateList != null) {
            abstractC0941a.m6045H(colorStateList, 6);
        }
        String str = iconCompat.f3339i;
        if (str != null) {
            abstractC0941a.m6047J(str, 7);
        }
        String str2 = iconCompat.f3340j;
        if (str2 != null) {
            abstractC0941a.m6047J(str2, 8);
        }
    }
}
