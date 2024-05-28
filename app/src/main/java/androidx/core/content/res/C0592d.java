package androidx.core.content.res;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: androidx.core.content.res.d */
/* loaded from: classes.dex */
public final class C0592d {

    /* renamed from: a */
    private final Shader f3275a;

    /* renamed from: b */
    private final ColorStateList f3276b;

    /* renamed from: c */
    private int f3277c;

    private C0592d(Shader shader, ColorStateList colorStateList, int i10) {
        this.f3275a = shader;
        this.f3276b = colorStateList;
        this.f3277c = i10;
    }

    /* renamed from: a */
    private static C0592d m3086a(Resources resources, int i10, Resources.Theme theme) throws IOException, XmlPullParserException {
        int next;
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
            name.hashCode();
            if (name.equals("gradient")) {
                return m3089d(C0594f.m3119b(resources, xml, asAttributeSet, theme));
            }
            if (name.equals("selector")) {
                return m3088c(C0591c.m3079b(resources, xml, asAttributeSet, theme));
            }
            throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
        }
        throw new XmlPullParserException("No start tag found");
    }

    /* renamed from: b */
    public static C0592d m3087b(int i10) {
        return new C0592d(null, null, i10);
    }

    /* renamed from: c */
    static C0592d m3088c(ColorStateList colorStateList) {
        return new C0592d(null, colorStateList, colorStateList.getDefaultColor());
    }

    /* renamed from: d */
    static C0592d m3089d(Shader shader) {
        return new C0592d(shader, null, 0);
    }

    /* renamed from: g */
    public static C0592d m3090g(Resources resources, int i10, Resources.Theme theme) {
        try {
            return m3086a(resources, i10, theme);
        } catch (Exception e10) {
            Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e10);
            return null;
        }
    }

    /* renamed from: e */
    public int m3091e() {
        return this.f3277c;
    }

    /* renamed from: f */
    public Shader m3092f() {
        return this.f3275a;
    }

    /* renamed from: h */
    public boolean m3093h() {
        return this.f3275a != null;
    }

    /* renamed from: i */
    public boolean m3094i() {
        ColorStateList colorStateList;
        return this.f3275a == null && (colorStateList = this.f3276b) != null && colorStateList.isStateful();
    }

    /* renamed from: j */
    public boolean m3095j(int[] iArr) {
        if (m3094i()) {
            ColorStateList colorStateList = this.f3276b;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != this.f3277c) {
                this.f3277c = colorForState;
                return true;
            }
        }
        return false;
    }

    /* renamed from: k */
    public void m3096k(int i10) {
        this.f3277c = i10;
    }

    /* renamed from: l */
    public boolean m3097l() {
        return m3093h() || this.f3277c != 0;
    }
}
