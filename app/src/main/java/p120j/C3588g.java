package p120j;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.C0170g;
import androidx.appcompat.widget.DrawableUtils;
import androidx.appcompat.widget.TintTypedArray;
import androidx.core.view.AbstractC0664b;
import androidx.core.view.C0677i;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParserException;
import p039d.C2957j;
import p133k.MenuItemC3701c;
import p195p0.InterfaceMenuC4210a;

/* renamed from: j.g */
/* loaded from: classes.dex */
public class C3588g extends MenuInflater {

    /* renamed from: e */
    static final Class<?>[] f15168e;

    /* renamed from: f */
    static final Class<?>[] f15169f;

    /* renamed from: a */
    final Object[] f15170a;

    /* renamed from: b */
    final Object[] f15171b;

    /* renamed from: c */
    Context f15172c;

    /* renamed from: d */
    private Object f15173d;

    /* renamed from: j.g$a */
    /* loaded from: classes.dex */
    public static class a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: c */
        private static final Class<?>[] f15174c = {MenuItem.class};

        /* renamed from: a */
        private Object f15175a;

        /* renamed from: b */
        private Method f15176b;

        public a(Object obj, String str) {
            this.f15175a = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f15176b = cls.getMethod(str, f15174c);
            } catch (Exception e10) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e10);
                throw inflateException;
            }
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.f15176b.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f15176b.invoke(this.f15175a, menuItem)).booleanValue();
                }
                this.f15176b.invoke(this.f15175a, menuItem);
                return true;
            } catch (Exception e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    /* renamed from: j.g$b */
    /* loaded from: classes.dex */
    public class b {

        /* renamed from: A */
        AbstractC0664b f15177A;

        /* renamed from: B */
        private CharSequence f15178B;

        /* renamed from: C */
        private CharSequence f15179C;

        /* renamed from: D */
        private ColorStateList f15180D = null;

        /* renamed from: E */
        private PorterDuff.Mode f15181E = null;

        /* renamed from: a */
        private Menu f15183a;

        /* renamed from: b */
        private int f15184b;

        /* renamed from: c */
        private int f15185c;

        /* renamed from: d */
        private int f15186d;

        /* renamed from: e */
        private int f15187e;

        /* renamed from: f */
        private boolean f15188f;

        /* renamed from: g */
        private boolean f15189g;

        /* renamed from: h */
        private boolean f15190h;

        /* renamed from: i */
        private int f15191i;

        /* renamed from: j */
        private int f15192j;

        /* renamed from: k */
        private CharSequence f15193k;

        /* renamed from: l */
        private CharSequence f15194l;

        /* renamed from: m */
        private int f15195m;

        /* renamed from: n */
        private char f15196n;

        /* renamed from: o */
        private int f15197o;

        /* renamed from: p */
        private char f15198p;

        /* renamed from: q */
        private int f15199q;

        /* renamed from: r */
        private int f15200r;

        /* renamed from: s */
        private boolean f15201s;

        /* renamed from: t */
        private boolean f15202t;

        /* renamed from: u */
        private boolean f15203u;

        /* renamed from: v */
        private int f15204v;

        /* renamed from: w */
        private int f15205w;

        /* renamed from: x */
        private String f15206x;

        /* renamed from: y */
        private String f15207y;

        /* renamed from: z */
        private String f15208z;

        public b(Menu menu) {
            this.f15183a = menu;
            m15397h();
        }

        /* renamed from: c */
        private char m15389c(String str) {
            if (str == null) {
                return (char) 0;
            }
            return str.charAt(0);
        }

        /* renamed from: e */
        private <T> T m15390e(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Class.forName(str, false, C3588g.this.f15172c.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return (T) constructor.newInstance(objArr);
            } catch (Exception e10) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e10);
                return null;
            }
        }

        /* renamed from: i */
        private void m15391i(MenuItem menuItem) {
            boolean z10 = false;
            menuItem.setChecked(this.f15201s).setVisible(this.f15202t).setEnabled(this.f15203u).setCheckable(this.f15200r >= 1).setTitleCondensed(this.f15194l).setIcon(this.f15195m);
            int i10 = this.f15204v;
            if (i10 >= 0) {
                menuItem.setShowAsAction(i10);
            }
            if (this.f15208z != null) {
                if (!C3588g.this.f15172c.isRestricted()) {
                    menuItem.setOnMenuItemClickListener(new a(C3588g.this.m15388b(), this.f15208z));
                } else {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
            }
            if (this.f15200r >= 2) {
                if (menuItem instanceof C0170g) {
                    ((C0170g) menuItem).m1053t(true);
                } else if (menuItem instanceof MenuItemC3701c) {
                    ((MenuItemC3701c) menuItem).m15707h(true);
                }
            }
            String str = this.f15206x;
            if (str != null) {
                menuItem.setActionView((View) m15390e(str, C3588g.f15168e, C3588g.this.f15170a));
                z10 = true;
            }
            int i11 = this.f15205w;
            if (i11 > 0) {
                if (!z10) {
                    menuItem.setActionView(i11);
                } else {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                }
            }
            AbstractC0664b abstractC0664b = this.f15177A;
            if (abstractC0664b != null) {
                C0677i.m3731a(menuItem, abstractC0664b);
            }
            C0677i.m3733c(menuItem, this.f15178B);
            C0677i.m3737g(menuItem, this.f15179C);
            C0677i.m3732b(menuItem, this.f15196n, this.f15197o);
            C0677i.m3736f(menuItem, this.f15198p, this.f15199q);
            PorterDuff.Mode mode = this.f15181E;
            if (mode != null) {
                C0677i.m3735e(menuItem, mode);
            }
            ColorStateList colorStateList = this.f15180D;
            if (colorStateList != null) {
                C0677i.m3734d(menuItem, colorStateList);
            }
        }

        /* renamed from: a */
        public void m15392a() {
            this.f15190h = true;
            m15391i(this.f15183a.add(this.f15184b, this.f15191i, this.f15192j, this.f15193k));
        }

        /* renamed from: b */
        public SubMenu m15393b() {
            this.f15190h = true;
            SubMenu addSubMenu = this.f15183a.addSubMenu(this.f15184b, this.f15191i, this.f15192j, this.f15193k);
            m15391i(addSubMenu.getItem());
            return addSubMenu;
        }

        /* renamed from: d */
        public boolean m15394d() {
            return this.f15190h;
        }

        /* renamed from: f */
        public void m15395f(AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = C3588g.this.f15172c.obtainStyledAttributes(attributeSet, C2957j.f12564t1);
            this.f15184b = obtainStyledAttributes.getResourceId(C2957j.f12574v1, 0);
            this.f15185c = obtainStyledAttributes.getInt(C2957j.f12584x1, 0);
            this.f15186d = obtainStyledAttributes.getInt(C2957j.f12589y1, 0);
            this.f15187e = obtainStyledAttributes.getInt(C2957j.f12594z1, 0);
            this.f15188f = obtainStyledAttributes.getBoolean(C2957j.f12579w1, true);
            this.f15189g = obtainStyledAttributes.getBoolean(C2957j.f12569u1, true);
            obtainStyledAttributes.recycle();
        }

        /* renamed from: g */
        public void m15396g(AttributeSet attributeSet) {
            TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(C3588g.this.f15172c, attributeSet, C2957j.f12338A1);
            this.f15191i = obtainStyledAttributes.getResourceId(C2957j.f12353D1, 0);
            this.f15192j = (obtainStyledAttributes.getInt(C2957j.f12368G1, this.f15185c) & (-65536)) | (obtainStyledAttributes.getInt(C2957j.f12373H1, this.f15186d) & 65535);
            this.f15193k = obtainStyledAttributes.getText(C2957j.f12378I1);
            this.f15194l = obtainStyledAttributes.getText(C2957j.f12383J1);
            this.f15195m = obtainStyledAttributes.getResourceId(C2957j.f12343B1, 0);
            this.f15196n = m15389c(obtainStyledAttributes.getString(C2957j.f12388K1));
            this.f15197o = obtainStyledAttributes.getInt(C2957j.f12423R1, 4096);
            this.f15198p = m15389c(obtainStyledAttributes.getString(C2957j.f12393L1));
            this.f15199q = obtainStyledAttributes.getInt(C2957j.f12443V1, 4096);
            int i10 = C2957j.f12398M1;
            if (obtainStyledAttributes.hasValue(i10)) {
                this.f15200r = obtainStyledAttributes.getBoolean(i10, false) ? 1 : 0;
            } else {
                this.f15200r = this.f15187e;
            }
            this.f15201s = obtainStyledAttributes.getBoolean(C2957j.f12358E1, false);
            this.f15202t = obtainStyledAttributes.getBoolean(C2957j.f12363F1, this.f15188f);
            this.f15203u = obtainStyledAttributes.getBoolean(C2957j.f12348C1, this.f15189g);
            this.f15204v = obtainStyledAttributes.getInt(C2957j.f12448W1, -1);
            this.f15208z = obtainStyledAttributes.getString(C2957j.f12403N1);
            this.f15205w = obtainStyledAttributes.getResourceId(C2957j.f12408O1, 0);
            this.f15206x = obtainStyledAttributes.getString(C2957j.f12418Q1);
            String string = obtainStyledAttributes.getString(C2957j.f12413P1);
            this.f15207y = string;
            boolean z10 = string != null;
            if (z10 && this.f15205w == 0 && this.f15206x == null) {
                this.f15177A = (AbstractC0664b) m15390e(string, C3588g.f15169f, C3588g.this.f15171b);
            } else {
                if (z10) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                }
                this.f15177A = null;
            }
            this.f15178B = obtainStyledAttributes.getText(C2957j.f12428S1);
            this.f15179C = obtainStyledAttributes.getText(C2957j.f12453X1);
            int i11 = C2957j.f12438U1;
            if (obtainStyledAttributes.hasValue(i11)) {
                this.f15181E = DrawableUtils.parseTintMode(obtainStyledAttributes.getInt(i11, -1), this.f15181E);
            } else {
                this.f15181E = null;
            }
            int i12 = C2957j.f12433T1;
            if (obtainStyledAttributes.hasValue(i12)) {
                this.f15180D = obtainStyledAttributes.getColorStateList(i12);
            } else {
                this.f15180D = null;
            }
            obtainStyledAttributes.recycle();
            this.f15190h = false;
        }

        /* renamed from: h */
        public void m15397h() {
            this.f15184b = 0;
            this.f15185c = 0;
            this.f15186d = 0;
            this.f15187e = 0;
            this.f15188f = true;
            this.f15189g = true;
        }
    }

    static {
        Class<?>[] clsArr = {Context.class};
        f15168e = clsArr;
        f15169f = clsArr;
    }

    public C3588g(Context context) {
        super(context);
        this.f15172c = context;
        Object[] objArr = {context};
        this.f15170a = objArr;
        this.f15171b = objArr;
    }

    /* renamed from: a */
    private Object m15386a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? m15386a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0048, code lost:
    
        if (r15 == 2) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004b, code lost:
    
        if (r15 == 3) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004f, code lost:
    
        r15 = r13.getName();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0053, code lost:
    
        if (r7 == false) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0059, code lost:
    
        if (r15.equals(r8) == false) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005b, code lost:
    
        r8 = null;
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00b9, code lost:
    
        r15 = r13.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0062, code lost:
    
        if (r15.equals("group") == false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0064, code lost:
    
        r0.m15397h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006c, code lost:
    
        if (r15.equals("item") == false) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0072, code lost:
    
        if (r0.m15394d() != false) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0074, code lost:
    
        r15 = r0.f15177A;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0076, code lost:
    
        if (r15 == null) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007c, code lost:
    
        if (r15.hasSubMenu() == false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007e, code lost:
    
        r0.m15393b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0082, code lost:
    
        r0.m15392a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x008a, code lost:
    
        if (r15.equals("menu") == false) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x008c, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x008e, code lost:
    
        if (r7 == false) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0091, code lost:
    
        r15 = r13.getName();
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0099, code lost:
    
        if (r15.equals("group") == false) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x009b, code lost:
    
        r0.m15395f(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a3, code lost:
    
        if (r15.equals("item") == false) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a5, code lost:
    
        r0.m15396g(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00ad, code lost:
    
        if (r15.equals("menu") == false) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00af, code lost:
    
        m15387c(r13, r14, r0.m15393b());
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00b7, code lost:
    
        r8 = r15;
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00c5, code lost:
    
        throw new java.lang.RuntimeException("Unexpected end of document");
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00c6, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x003b, code lost:
    
        r8 = null;
        r6 = false;
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0040, code lost:
    
        if (r6 != false) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0042, code lost:
    
        if (r15 == 1) goto L136;
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m15387c(org.xmlpull.v1.XmlPullParser r13, android.util.AttributeSet r14, android.view.Menu r15) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r12 = this;
            j.g$b r0 = new j.g$b
            r0.<init>(r15)
            int r15 = r13.getEventType()
        L9:
            r1 = 2
            java.lang.String r2 = "menu"
            r3 = 1
            if (r15 != r1) goto L35
            java.lang.String r15 = r13.getName()
            boolean r4 = r15.equals(r2)
            if (r4 == 0) goto L1e
            int r15 = r13.next()
            goto L3b
        L1e:
            java.lang.RuntimeException r13 = new java.lang.RuntimeException
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r0 = "Expecting menu, got "
            r14.append(r0)
            r14.append(r15)
            java.lang.String r14 = r14.toString()
            r13.<init>(r14)
            throw r13
        L35:
            int r15 = r13.next()
            if (r15 != r3) goto L9
        L3b:
            r4 = 0
            r5 = 0
            r8 = r4
            r6 = 0
            r7 = 0
        L40:
            if (r6 != 0) goto Lc6
            if (r15 == r3) goto Lbe
            java.lang.String r9 = "item"
            java.lang.String r10 = "group"
            if (r15 == r1) goto L8e
            r11 = 3
            if (r15 == r11) goto L4f
            goto Lb9
        L4f:
            java.lang.String r15 = r13.getName()
            if (r7 == 0) goto L5e
            boolean r11 = r15.equals(r8)
            if (r11 == 0) goto L5e
            r8 = r4
            r7 = 0
            goto Lb9
        L5e:
            boolean r10 = r15.equals(r10)
            if (r10 == 0) goto L68
            r0.m15397h()
            goto Lb9
        L68:
            boolean r9 = r15.equals(r9)
            if (r9 == 0) goto L86
            boolean r15 = r0.m15394d()
            if (r15 != 0) goto Lb9
            androidx.core.view.b r15 = r0.f15177A
            if (r15 == 0) goto L82
            boolean r15 = r15.hasSubMenu()
            if (r15 == 0) goto L82
            r0.m15393b()
            goto Lb9
        L82:
            r0.m15392a()
            goto Lb9
        L86:
            boolean r15 = r15.equals(r2)
            if (r15 == 0) goto Lb9
            r6 = 1
            goto Lb9
        L8e:
            if (r7 == 0) goto L91
            goto Lb9
        L91:
            java.lang.String r15 = r13.getName()
            boolean r10 = r15.equals(r10)
            if (r10 == 0) goto L9f
            r0.m15395f(r14)
            goto Lb9
        L9f:
            boolean r9 = r15.equals(r9)
            if (r9 == 0) goto La9
            r0.m15396g(r14)
            goto Lb9
        La9:
            boolean r9 = r15.equals(r2)
            if (r9 == 0) goto Lb7
            android.view.SubMenu r15 = r0.m15393b()
            r12.m15387c(r13, r14, r15)
            goto Lb9
        Lb7:
            r8 = r15
            r7 = 1
        Lb9:
            int r15 = r13.next()
            goto L40
        Lbe:
            java.lang.RuntimeException r13 = new java.lang.RuntimeException
            java.lang.String r14 = "Unexpected end of document"
            r13.<init>(r14)
            throw r13
        Lc6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p120j.C3588g.m15387c(org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.view.Menu):void");
    }

    /* renamed from: b */
    Object m15388b() {
        if (this.f15173d == null) {
            this.f15173d = m15386a(this.f15172c);
        }
        return this.f15173d;
    }

    @Override // android.view.MenuInflater
    public void inflate(int i10, Menu menu) {
        if (!(menu instanceof InterfaceMenuC4210a)) {
            super.inflate(i10, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                try {
                    xmlResourceParser = this.f15172c.getResources().getLayout(i10);
                    m15387c(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
                } catch (IOException e10) {
                    throw new InflateException("Error inflating menu XML", e10);
                }
            } catch (XmlPullParserException e11) {
                throw new InflateException("Error inflating menu XML", e11);
            }
        } finally {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
        }
    }
}
