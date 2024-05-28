package p080g;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.StateSet;
import androidx.core.content.res.C0599k;
import androidx.core.graphics.drawable.InterfaceC0610b;
import androidx.vectordrawable.graphics.drawable.C0934b;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p080g.C3218b;
import p080g.C3220d;
import p092h.C3355b;
import p093h0.C3359d;
import p093h0.C3363h;

@SuppressLint({"RestrictedAPI"})
/* renamed from: g.a */
/* loaded from: classes.dex */
public class C3217a extends C3220d implements InterfaceC0610b {

    /* renamed from: G */
    private static final String f13528G = C3217a.class.getSimpleName();

    /* renamed from: B */
    private c f13529B;

    /* renamed from: C */
    private g f13530C;

    /* renamed from: D */
    private int f13531D;

    /* renamed from: E */
    private int f13532E;

    /* renamed from: F */
    private boolean f13533F;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g.a$b */
    /* loaded from: classes.dex */
    public static class b extends g {

        /* renamed from: a */
        private final Animatable f13534a;

        b(Animatable animatable) {
            super();
            this.f13534a = animatable;
        }

        @Override // p080g.C3217a.g
        /* renamed from: c */
        public void mo14329c() {
            this.f13534a.start();
        }

        @Override // p080g.C3217a.g
        /* renamed from: d */
        public void mo14330d() {
            this.f13534a.stop();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g.a$c */
    /* loaded from: classes.dex */
    public static class c extends C3220d.a {

        /* renamed from: K */
        C3359d<Long> f13535K;

        /* renamed from: L */
        C3363h<Integer> f13536L;

        c(c cVar, C3217a c3217a, Resources resources) {
            super(cVar, c3217a, resources);
            if (cVar != null) {
                this.f13535K = cVar.f13535K;
                this.f13536L = cVar.f13536L;
            } else {
                this.f13535K = new C3359d<>();
                this.f13536L = new C3363h<>();
            }
        }

        /* renamed from: D */
        private static long m14331D(int i10, int i11) {
            return i11 | (i10 << 32);
        }

        /* renamed from: B */
        int m14332B(int[] iArr, Drawable drawable, int i10) {
            int m14384z = super.m14384z(iArr, drawable);
            this.f13536L.m14853n(m14384z, Integer.valueOf(i10));
            return m14384z;
        }

        /* renamed from: C */
        int m14333C(int i10, int i11, Drawable drawable, boolean z10) {
            int m14358a = super.m14358a(drawable);
            long m14331D = m14331D(i10, i11);
            long j10 = z10 ? 8589934592L : 0L;
            long j11 = m14358a;
            this.f13535K.m14802a(m14331D, Long.valueOf(j11 | j10));
            if (z10) {
                this.f13535K.m14802a(m14331D(i11, i10), Long.valueOf(4294967296L | j11 | j10));
            }
            return m14358a;
        }

        /* renamed from: E */
        int m14334E(int i10) {
            if (i10 < 0) {
                return 0;
            }
            return this.f13536L.m14850j(i10, 0).intValue();
        }

        /* renamed from: F */
        int m14335F(int[] iArr) {
            int m14383A = super.m14383A(iArr);
            return m14383A >= 0 ? m14383A : super.m14383A(StateSet.WILD_CARD);
        }

        /* renamed from: G */
        int m14336G(int i10, int i11) {
            return (int) this.f13535K.m14806j(m14331D(i10, i11), -1L).longValue();
        }

        /* renamed from: H */
        boolean m14337H(int i10, int i11) {
            return (this.f13535K.m14806j(m14331D(i10, i11), -1L).longValue() & 4294967296L) != 0;
        }

        /* renamed from: I */
        boolean m14338I(int i10, int i11) {
            return (this.f13535K.m14806j(m14331D(i10, i11), -1L).longValue() & 8589934592L) != 0;
        }

        @Override // p080g.C3220d.a, android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new C3217a(this, null);
        }

        @Override // p080g.C3220d.a, p080g.C3218b.d
        /* renamed from: r */
        void mo14339r() {
            this.f13535K = this.f13535K.clone();
            this.f13536L = this.f13536L.clone();
        }

        @Override // p080g.C3220d.a, android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new C3217a(this, resources);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g.a$d */
    /* loaded from: classes.dex */
    public static class d extends g {

        /* renamed from: a */
        private final C0934b f13537a;

        d(C0934b c0934b) {
            super();
            this.f13537a = c0934b;
        }

        @Override // p080g.C3217a.g
        /* renamed from: c */
        public void mo14329c() {
            this.f13537a.start();
        }

        @Override // p080g.C3217a.g
        /* renamed from: d */
        public void mo14330d() {
            this.f13537a.stop();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g.a$e */
    /* loaded from: classes.dex */
    public static class e extends g {

        /* renamed from: a */
        private final ObjectAnimator f13538a;

        /* renamed from: b */
        private final boolean f13539b;

        e(AnimationDrawable animationDrawable, boolean z10, boolean z11) {
            super();
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            int i10 = z10 ? numberOfFrames - 1 : 0;
            int i11 = z10 ? 0 : numberOfFrames - 1;
            f fVar = new f(animationDrawable, z10);
            ObjectAnimator ofInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", i10, i11);
            ofInt.setAutoCancel(true);
            ofInt.setDuration(fVar.m14342a());
            ofInt.setInterpolator(fVar);
            this.f13539b = z11;
            this.f13538a = ofInt;
        }

        @Override // p080g.C3217a.g
        /* renamed from: a */
        public boolean mo14340a() {
            return this.f13539b;
        }

        @Override // p080g.C3217a.g
        /* renamed from: b */
        public void mo14341b() {
            this.f13538a.reverse();
        }

        @Override // p080g.C3217a.g
        /* renamed from: c */
        public void mo14329c() {
            this.f13538a.start();
        }

        @Override // p080g.C3217a.g
        /* renamed from: d */
        public void mo14330d() {
            this.f13538a.cancel();
        }
    }

    /* renamed from: g.a$f */
    /* loaded from: classes.dex */
    private static class f implements TimeInterpolator {

        /* renamed from: a */
        private int[] f13540a;

        /* renamed from: b */
        private int f13541b;

        /* renamed from: c */
        private int f13542c;

        f(AnimationDrawable animationDrawable, boolean z10) {
            m14343b(animationDrawable, z10);
        }

        /* renamed from: a */
        int m14342a() {
            return this.f13542c;
        }

        /* renamed from: b */
        int m14343b(AnimationDrawable animationDrawable, boolean z10) {
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            this.f13541b = numberOfFrames;
            int[] iArr = this.f13540a;
            if (iArr == null || iArr.length < numberOfFrames) {
                this.f13540a = new int[numberOfFrames];
            }
            int[] iArr2 = this.f13540a;
            int i10 = 0;
            for (int i11 = 0; i11 < numberOfFrames; i11++) {
                int duration = animationDrawable.getDuration(z10 ? (numberOfFrames - i11) - 1 : i11);
                iArr2[i11] = duration;
                i10 += duration;
            }
            this.f13542c = i10;
            return i10;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            int i10 = (int) ((f10 * this.f13542c) + 0.5f);
            int i11 = this.f13541b;
            int[] iArr = this.f13540a;
            int i12 = 0;
            while (i12 < i11 && i10 >= iArr[i12]) {
                i10 -= iArr[i12];
                i12++;
            }
            return (i12 / i11) + (i12 < i11 ? i10 / this.f13542c : 0.0f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g.a$g */
    /* loaded from: classes.dex */
    public static abstract class g {
        private g() {
        }

        /* renamed from: a */
        public boolean mo14340a() {
            return false;
        }

        /* renamed from: b */
        public void mo14341b() {
        }

        /* renamed from: c */
        public abstract void mo14329c();

        /* renamed from: d */
        public abstract void mo14330d();
    }

    public C3217a() {
        this(null, null);
    }

    /* renamed from: m */
    public static C3217a m14317m(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws IOException, XmlPullParserException {
        String name = xmlPullParser.getName();
        if (name.equals("animated-selector")) {
            C3217a c3217a = new C3217a();
            c3217a.m14328n(context, resources, xmlPullParser, attributeSet, theme);
            return c3217a;
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid animated-selector tag " + name);
    }

    /* renamed from: o */
    private void m14318o(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1) {
                return;
            }
            int depth2 = xmlPullParser.getDepth();
            if (depth2 < depth && next == 3) {
                return;
            }
            if (next == 2 && depth2 <= depth) {
                if (xmlPullParser.getName().equals("item")) {
                    m14320q(context, resources, xmlPullParser, attributeSet, theme);
                } else if (xmlPullParser.getName().equals("transition")) {
                    m14321r(context, resources, xmlPullParser, attributeSet, theme);
                }
            }
        }
    }

    /* renamed from: p */
    private void m14319p() {
        onStateChange(getState());
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0034, code lost:
    
        if (r5 != 2) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0040, code lost:
    
        if (r7.getName().equals("vector") == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0042, code lost:
    
        r5 = androidx.vectordrawable.graphics.drawable.C0939g.m5994c(r6, r7, r8, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0047, code lost:
    
        r5 = android.graphics.drawable.Drawable.createFromXmlInner(r6, r7, r8, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0064, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException(r7.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0065, code lost:
    
        if (r5 == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006d, code lost:
    
        return r4.f13529B.m14332B(r0, r5, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0086, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException(r7.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0029, code lost:
    
        if (r5 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x002b, code lost:
    
        r5 = r7.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0030, code lost:
    
        if (r5 != 4) goto L24;
     */
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int m14320q(android.content.Context r5, android.content.res.Resources r6, org.xmlpull.v1.XmlPullParser r7, android.util.AttributeSet r8, android.content.res.Resources.Theme r9) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r4 = this;
            int[] r0 = p092h.C3355b.f14042h
            android.content.res.TypedArray r0 = androidx.core.content.res.C0599k.m3162k(r6, r9, r8, r0)
            int r1 = p092h.C3355b.f14043i
            r2 = 0
            int r1 = r0.getResourceId(r1, r2)
            int r2 = p092h.C3355b.f14044j
            r3 = -1
            int r2 = r0.getResourceId(r2, r3)
            if (r2 <= 0) goto L1f
            androidx.appcompat.widget.ResourceManagerInternal r3 = androidx.appcompat.widget.ResourceManagerInternal.get()
            android.graphics.drawable.Drawable r5 = r3.getDrawable(r5, r2)
            goto L20
        L1f:
            r5 = 0
        L20:
            r0.recycle()
            int[] r0 = r4.m14382k(r8)
            java.lang.String r2 = ": <item> tag requires a 'drawable' attribute or child tag defining a drawable"
            if (r5 != 0) goto L65
        L2b:
            int r5 = r7.next()
            r3 = 4
            if (r5 != r3) goto L33
            goto L2b
        L33:
            r3 = 2
            if (r5 != r3) goto L4c
            java.lang.String r5 = r7.getName()
            java.lang.String r3 = "vector"
            boolean r5 = r5.equals(r3)
            if (r5 == 0) goto L47
            androidx.vectordrawable.graphics.drawable.g r5 = androidx.vectordrawable.graphics.drawable.C0939g.m5994c(r6, r7, r8, r9)
            goto L65
        L47:
            android.graphics.drawable.Drawable r5 = android.graphics.drawable.Drawable.createFromXmlInner(r6, r7, r8, r9)
            goto L65
        L4c:
            org.xmlpull.v1.XmlPullParserException r5 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = r7.getPositionDescription()
            r6.append(r7)
            r6.append(r2)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L65:
            if (r5 == 0) goto L6e
            g.a$c r6 = r4.f13529B
            int r5 = r6.m14332B(r0, r5, r1)
            return r5
        L6e:
            org.xmlpull.v1.XmlPullParserException r5 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = r7.getPositionDescription()
            r6.append(r7)
            r6.append(r2)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p080g.C3217a.m14320q(android.content.Context, android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003c, code lost:
    
        if (r4 != 2) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0048, code lost:
    
        if (r10.getName().equals("animated-vector") == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004a, code lost:
    
        r4 = androidx.vectordrawable.graphics.drawable.C0934b.m5967a(r8, r9, r10, r11, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004f, code lost:
    
        r4 = android.graphics.drawable.Drawable.createFromXmlInner(r9, r10, r11, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006c, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException(r10.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006d, code lost:
    
        if (r4 == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006f, code lost:
    
        if (r1 == (-1)) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0071, code lost:
    
        if (r3 == (-1)) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0079, code lost:
    
        return r7.f13529B.m14333C(r1, r3, r4, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0094, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException(r10.getPositionDescription() + ": <transition> tag requires 'fromId' & 'toId' attributes");
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ad, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException(r10.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0031, code lost:
    
        if (r4 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0033, code lost:
    
        r4 = r10.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0038, code lost:
    
        if (r4 != 4) goto L28;
     */
    /* renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int m14321r(android.content.Context r8, android.content.res.Resources r9, org.xmlpull.v1.XmlPullParser r10, android.util.AttributeSet r11, android.content.res.Resources.Theme r12) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r7 = this;
            int[] r0 = p092h.C3355b.f14045k
            android.content.res.TypedArray r0 = androidx.core.content.res.C0599k.m3162k(r9, r12, r11, r0)
            int r1 = p092h.C3355b.f14048n
            r2 = -1
            int r1 = r0.getResourceId(r1, r2)
            int r3 = p092h.C3355b.f14047m
            int r3 = r0.getResourceId(r3, r2)
            int r4 = p092h.C3355b.f14046l
            int r4 = r0.getResourceId(r4, r2)
            if (r4 <= 0) goto L24
            androidx.appcompat.widget.ResourceManagerInternal r5 = androidx.appcompat.widget.ResourceManagerInternal.get()
            android.graphics.drawable.Drawable r4 = r5.getDrawable(r8, r4)
            goto L25
        L24:
            r4 = 0
        L25:
            int r5 = p092h.C3355b.f14049o
            r6 = 0
            boolean r5 = r0.getBoolean(r5, r6)
            r0.recycle()
            java.lang.String r0 = ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable"
            if (r4 != 0) goto L6d
        L33:
            int r4 = r10.next()
            r6 = 4
            if (r4 != r6) goto L3b
            goto L33
        L3b:
            r6 = 2
            if (r4 != r6) goto L54
            java.lang.String r4 = r10.getName()
            java.lang.String r6 = "animated-vector"
            boolean r4 = r4.equals(r6)
            if (r4 == 0) goto L4f
            androidx.vectordrawable.graphics.drawable.b r4 = androidx.vectordrawable.graphics.drawable.C0934b.m5967a(r8, r9, r10, r11, r12)
            goto L6d
        L4f:
            android.graphics.drawable.Drawable r4 = android.graphics.drawable.Drawable.createFromXmlInner(r9, r10, r11, r12)
            goto L6d
        L54:
            org.xmlpull.v1.XmlPullParserException r8 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = r10.getPositionDescription()
            r9.append(r10)
            r9.append(r0)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        L6d:
            if (r4 == 0) goto L95
            if (r1 == r2) goto L7a
            if (r3 == r2) goto L7a
            g.a$c r8 = r7.f13529B
            int r8 = r8.m14333C(r1, r3, r4, r5)
            return r8
        L7a:
            org.xmlpull.v1.XmlPullParserException r8 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = r10.getPositionDescription()
            r9.append(r10)
            java.lang.String r10 = ": <transition> tag requires 'fromId' & 'toId' attributes"
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        L95:
            org.xmlpull.v1.XmlPullParserException r8 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = r10.getPositionDescription()
            r9.append(r10)
            r9.append(r0)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p080g.C3217a.m14321r(android.content.Context, android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):int");
    }

    /* renamed from: s */
    private boolean m14322s(int i10) {
        int m14348c;
        int m14336G;
        g bVar;
        g gVar = this.f13530C;
        if (gVar != null) {
            if (i10 == this.f13531D) {
                return true;
            }
            if (i10 == this.f13532E && gVar.mo14340a()) {
                gVar.mo14341b();
                this.f13531D = this.f13532E;
                this.f13532E = i10;
                return true;
            }
            m14348c = this.f13531D;
            gVar.mo14330d();
        } else {
            m14348c = m14348c();
        }
        this.f13530C = null;
        this.f13532E = -1;
        this.f13531D = -1;
        c cVar = this.f13529B;
        int m14334E = cVar.m14334E(m14348c);
        int m14334E2 = cVar.m14334E(i10);
        if (m14334E2 == 0 || m14334E == 0 || (m14336G = cVar.m14336G(m14334E, m14334E2)) < 0) {
            return false;
        }
        boolean m14338I = cVar.m14338I(m14334E, m14334E2);
        m14349g(m14336G);
        Object current = getCurrent();
        if (current instanceof AnimationDrawable) {
            bVar = new e((AnimationDrawable) current, cVar.m14337H(m14334E, m14334E2), m14338I);
        } else if (current instanceof C0934b) {
            bVar = new d((C0934b) current);
        } else {
            if (current instanceof Animatable) {
                bVar = new b((Animatable) current);
            }
            return false;
        }
        bVar.mo14329c();
        this.f13530C = bVar;
        this.f13532E = m14348c;
        this.f13531D = i10;
        return true;
    }

    /* renamed from: t */
    private void m14323t(TypedArray typedArray) {
        c cVar = this.f13529B;
        cVar.f13569d |= typedArray.getChangingConfigurations();
        cVar.m14378x(typedArray.getBoolean(C3355b.f14038d, cVar.f13574i));
        cVar.m14374t(typedArray.getBoolean(C3355b.f14039e, cVar.f13577l));
        cVar.m14375u(typedArray.getInt(C3355b.f14040f, cVar.f13557A));
        cVar.m14376v(typedArray.getInt(C3355b.f14041g, cVar.f13558B));
        setDither(typedArray.getBoolean(C3355b.f14036b, cVar.f13589x));
    }

    @Override // p080g.C3220d, p080g.C3218b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
    }

    @Override // p080g.C3218b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean canApplyTheme() {
        return super.canApplyTheme();
    }

    @Override // p080g.C3218b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void draw(Canvas canvas) {
        super.draw(canvas);
    }

    @Override // p080g.C3218b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getAlpha() {
        return super.getAlpha();
    }

    @Override // p080g.C3218b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getChangingConfigurations() {
        return super.getChangingConfigurations();
    }

    @Override // p080g.C3218b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // p080g.C3218b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void getHotspotBounds(Rect rect) {
        super.getHotspotBounds(rect);
    }

    @Override // p080g.C3218b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getIntrinsicHeight() {
        return super.getIntrinsicHeight();
    }

    @Override // p080g.C3218b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getIntrinsicWidth() {
        return super.getIntrinsicWidth();
    }

    @Override // p080g.C3218b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // p080g.C3218b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // p080g.C3218b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getOpacity() {
        return super.getOpacity();
    }

    @Override // p080g.C3218b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void getOutline(Outline outline) {
        super.getOutline(outline);
    }

    @Override // p080g.C3218b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p080g.C3220d, p080g.C3218b
    /* renamed from: h */
    public void mo14325h(C3218b.d dVar) {
        super.mo14325h(dVar);
        if (dVar instanceof c) {
            this.f13529B = (c) dVar;
        }
    }

    @Override // p080g.C3218b, android.graphics.drawable.Drawable.Callback
    public /* bridge */ /* synthetic */ void invalidateDrawable(Drawable drawable) {
        super.invalidateDrawable(drawable);
    }

    @Override // p080g.C3218b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean isAutoMirrored() {
        return super.isAutoMirrored();
    }

    @Override // p080g.C3220d, android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // p080g.C3218b, android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        super.jumpToCurrentState();
        g gVar = this.f13530C;
        if (gVar != null) {
            gVar.mo14330d();
            this.f13530C = null;
            m14349g(this.f13531D);
            this.f13531D = -1;
            this.f13532E = -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p080g.C3220d
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public c mo14324b() {
        return new c(this.f13529B, this, null);
    }

    @Override // p080g.C3220d, p080g.C3218b, android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f13533F && super.mutate() == this) {
            this.f13529B.mo14339r();
            this.f13533F = true;
        }
        return this;
    }

    /* renamed from: n */
    public void m14328n(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        TypedArray m3162k = C0599k.m3162k(resources, theme, attributeSet, C3355b.f14035a);
        setVisible(m3162k.getBoolean(C3355b.f14037c, true), true);
        m14323t(m3162k);
        m14350i(resources);
        m3162k.recycle();
        m14318o(context, resources, xmlPullParser, attributeSet, theme);
        m14319p();
    }

    @Override // p080g.C3218b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean onLayoutDirectionChanged(int i10) {
        return super.onLayoutDirectionChanged(i10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p080g.C3220d, p080g.C3218b, android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        int m14335F = this.f13529B.m14335F(iArr);
        boolean z10 = m14335F != m14348c() && (m14322s(m14335F) || m14349g(m14335F));
        Drawable current = getCurrent();
        return current != null ? z10 | current.setState(iArr) : z10;
    }

    @Override // p080g.C3218b, android.graphics.drawable.Drawable.Callback
    public /* bridge */ /* synthetic */ void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        super.scheduleDrawable(drawable, runnable, j10);
    }

    @Override // p080g.C3218b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setAlpha(int i10) {
        super.setAlpha(i10);
    }

    @Override // p080g.C3218b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setAutoMirrored(boolean z10) {
        super.setAutoMirrored(z10);
    }

    @Override // p080g.C3218b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
    }

    @Override // p080g.C3218b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setDither(boolean z10) {
        super.setDither(z10);
    }

    @Override // p080g.C3218b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f10, float f11) {
        super.setHotspot(f10, f11);
    }

    @Override // p080g.C3218b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i10, int i11, int i12, int i13) {
        super.setHotspotBounds(i10, i11, i12, i13);
    }

    @Override // p080g.C3218b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setTintList(ColorStateList colorStateList) {
        super.setTintList(colorStateList);
    }

    @Override // p080g.C3218b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setTintMode(PorterDuff.Mode mode) {
        super.setTintMode(mode);
    }

    @Override // p080g.C3218b, android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        boolean visible = super.setVisible(z10, z11);
        g gVar = this.f13530C;
        if (gVar != null && (visible || z11)) {
            if (z10) {
                gVar.mo14329c();
            } else {
                jumpToCurrentState();
            }
        }
        return visible;
    }

    @Override // p080g.C3218b, android.graphics.drawable.Drawable.Callback
    public /* bridge */ /* synthetic */ void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        super.unscheduleDrawable(drawable, runnable);
    }

    C3217a(c cVar, Resources resources) {
        super(null);
        this.f13531D = -1;
        this.f13532E = -1;
        mo14325h(new c(cVar, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }
}
