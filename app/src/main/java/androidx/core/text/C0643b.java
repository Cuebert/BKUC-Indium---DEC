package androidx.core.text;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import androidx.core.util.C0649c;

/* renamed from: androidx.core.text.b */
/* loaded from: classes.dex */
public class C0643b implements Spannable {

    /* renamed from: q */
    private static final Object f3467q = new Object();

    /* renamed from: n */
    private final Spannable f3468n;

    /* renamed from: o */
    private final a f3469o;

    /* renamed from: p */
    private final PrecomputedText f3470p;

    /* renamed from: a */
    public a m3432a() {
        return this.f3469o;
    }

    /* renamed from: b */
    public PrecomputedText m3433b() {
        Spannable spannable = this.f3468n;
        if (spannable instanceof PrecomputedText) {
            return (PrecomputedText) spannable;
        }
        return null;
    }

    @Override // java.lang.CharSequence
    public char charAt(int i10) {
        return this.f3468n.charAt(i10);
    }

    @Override // android.text.Spanned
    public int getSpanEnd(Object obj) {
        return this.f3468n.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public int getSpanFlags(Object obj) {
        return this.f3468n.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public int getSpanStart(Object obj) {
        return this.f3468n.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public <T> T[] getSpans(int i10, int i11, Class<T> cls) {
        if (Build.VERSION.SDK_INT >= 29) {
            return (T[]) this.f3470p.getSpans(i10, i11, cls);
        }
        return (T[]) this.f3468n.getSpans(i10, i11, cls);
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.f3468n.length();
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int i10, int i11, Class cls) {
        return this.f3468n.nextSpanTransition(i10, i11, cls);
    }

    @Override // android.text.Spannable
    public void removeSpan(Object obj) {
        if (!(obj instanceof MetricAffectingSpan)) {
            if (Build.VERSION.SDK_INT >= 29) {
                this.f3470p.removeSpan(obj);
                return;
            } else {
                this.f3468n.removeSpan(obj);
                return;
            }
        }
        throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
    }

    @Override // android.text.Spannable
    public void setSpan(Object obj, int i10, int i11, int i12) {
        if (!(obj instanceof MetricAffectingSpan)) {
            if (Build.VERSION.SDK_INT >= 29) {
                this.f3470p.setSpan(obj, i10, i11, i12);
                return;
            } else {
                this.f3468n.setSpan(obj, i10, i11, i12);
                return;
            }
        }
        throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i10, int i11) {
        return this.f3468n.subSequence(i10, i11);
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return this.f3468n.toString();
    }

    /* renamed from: androidx.core.text.b$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        private final TextPaint f3471a;

        /* renamed from: b */
        private final TextDirectionHeuristic f3472b;

        /* renamed from: c */
        private final int f3473c;

        /* renamed from: d */
        private final int f3474d;

        /* renamed from: e */
        final PrecomputedText.Params f3475e;

        /* renamed from: androidx.core.text.b$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C6039a {

            /* renamed from: a */
            private final TextPaint f3476a;

            /* renamed from: b */
            private TextDirectionHeuristic f3477b;

            /* renamed from: c */
            private int f3478c;

            /* renamed from: d */
            private int f3479d;

            public C6039a(TextPaint textPaint) {
                this.f3476a = textPaint;
                if (Build.VERSION.SDK_INT >= 23) {
                    this.f3478c = 1;
                    this.f3479d = 1;
                } else {
                    this.f3479d = 0;
                    this.f3478c = 0;
                }
                this.f3477b = TextDirectionHeuristics.FIRSTSTRONG_LTR;
            }

            /* renamed from: a */
            public a m3439a() {
                return new a(this.f3476a, this.f3477b, this.f3478c, this.f3479d);
            }

            /* renamed from: b */
            public C6039a m3440b(int i10) {
                this.f3478c = i10;
                return this;
            }

            /* renamed from: c */
            public C6039a m3441c(int i10) {
                this.f3479d = i10;
                return this;
            }

            /* renamed from: d */
            public C6039a m3442d(TextDirectionHeuristic textDirectionHeuristic) {
                this.f3477b = textDirectionHeuristic;
                return this;
            }
        }

        a(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i10, int i11) {
            if (Build.VERSION.SDK_INT >= 29) {
                this.f3475e = new PrecomputedText.Params.Builder(textPaint).setBreakStrategy(i10).setHyphenationFrequency(i11).setTextDirection(textDirectionHeuristic).build();
            } else {
                this.f3475e = null;
            }
            this.f3471a = textPaint;
            this.f3472b = textDirectionHeuristic;
            this.f3473c = i10;
            this.f3474d = i11;
        }

        /* renamed from: a */
        public boolean m3434a(a aVar) {
            int i10 = Build.VERSION.SDK_INT;
            if ((i10 >= 23 && (this.f3473c != aVar.m3435b() || this.f3474d != aVar.m3436c())) || this.f3471a.getTextSize() != aVar.m3438e().getTextSize() || this.f3471a.getTextScaleX() != aVar.m3438e().getTextScaleX() || this.f3471a.getTextSkewX() != aVar.m3438e().getTextSkewX() || this.f3471a.getLetterSpacing() != aVar.m3438e().getLetterSpacing() || !TextUtils.equals(this.f3471a.getFontFeatureSettings(), aVar.m3438e().getFontFeatureSettings()) || this.f3471a.getFlags() != aVar.m3438e().getFlags()) {
                return false;
            }
            if (i10 >= 24) {
                if (!this.f3471a.getTextLocales().equals(aVar.m3438e().getTextLocales())) {
                    return false;
                }
            } else if (!this.f3471a.getTextLocale().equals(aVar.m3438e().getTextLocale())) {
                return false;
            }
            return this.f3471a.getTypeface() == null ? aVar.m3438e().getTypeface() == null : this.f3471a.getTypeface().equals(aVar.m3438e().getTypeface());
        }

        /* renamed from: b */
        public int m3435b() {
            return this.f3473c;
        }

        /* renamed from: c */
        public int m3436c() {
            return this.f3474d;
        }

        /* renamed from: d */
        public TextDirectionHeuristic m3437d() {
            return this.f3472b;
        }

        /* renamed from: e */
        public TextPaint m3438e() {
            return this.f3471a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return m3434a(aVar) && this.f3472b == aVar.m3437d();
        }

        public int hashCode() {
            if (Build.VERSION.SDK_INT >= 24) {
                return C0649c.m3453b(Float.valueOf(this.f3471a.getTextSize()), Float.valueOf(this.f3471a.getTextScaleX()), Float.valueOf(this.f3471a.getTextSkewX()), Float.valueOf(this.f3471a.getLetterSpacing()), Integer.valueOf(this.f3471a.getFlags()), this.f3471a.getTextLocales(), this.f3471a.getTypeface(), Boolean.valueOf(this.f3471a.isElegantTextHeight()), this.f3472b, Integer.valueOf(this.f3473c), Integer.valueOf(this.f3474d));
            }
            return C0649c.m3453b(Float.valueOf(this.f3471a.getTextSize()), Float.valueOf(this.f3471a.getTextScaleX()), Float.valueOf(this.f3471a.getTextSkewX()), Float.valueOf(this.f3471a.getLetterSpacing()), Integer.valueOf(this.f3471a.getFlags()), this.f3471a.getTextLocale(), this.f3471a.getTypeface(), Boolean.valueOf(this.f3471a.isElegantTextHeight()), this.f3472b, Integer.valueOf(this.f3473c), Integer.valueOf(this.f3474d));
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("{");
            sb2.append("textSize=" + this.f3471a.getTextSize());
            sb2.append(", textScaleX=" + this.f3471a.getTextScaleX());
            sb2.append(", textSkewX=" + this.f3471a.getTextSkewX());
            int i10 = Build.VERSION.SDK_INT;
            sb2.append(", letterSpacing=" + this.f3471a.getLetterSpacing());
            sb2.append(", elegantTextHeight=" + this.f3471a.isElegantTextHeight());
            if (i10 >= 24) {
                sb2.append(", textLocale=" + this.f3471a.getTextLocales());
            } else {
                sb2.append(", textLocale=" + this.f3471a.getTextLocale());
            }
            sb2.append(", typeface=" + this.f3471a.getTypeface());
            if (i10 >= 26) {
                sb2.append(", variationSettings=" + this.f3471a.getFontVariationSettings());
            }
            sb2.append(", textDir=" + this.f3472b);
            sb2.append(", breakStrategy=" + this.f3473c);
            sb2.append(", hyphenationFrequency=" + this.f3474d);
            sb2.append("}");
            return sb2.toString();
        }

        public a(PrecomputedText.Params params) {
            this.f3471a = params.getTextPaint();
            this.f3472b = params.getTextDirection();
            this.f3473c = params.getBreakStrategy();
            this.f3474d = params.getHyphenationFrequency();
            this.f3475e = Build.VERSION.SDK_INT < 29 ? null : params;
        }
    }
}
