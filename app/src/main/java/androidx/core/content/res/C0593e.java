package androidx.core.content.res;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.Base64;
import android.util.Xml;
import androidx.core.provider.C0638e;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p182o0.C4114g;

/* renamed from: androidx.core.content.res.e */
/* loaded from: classes.dex */
public class C0593e {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.content.res.e$a */
    /* loaded from: classes.dex */
    public static class a {
        /* renamed from: a */
        static int m3106a(TypedArray typedArray, int i10) {
            return typedArray.getType(i10);
        }
    }

    /* renamed from: androidx.core.content.res.e$b */
    /* loaded from: classes.dex */
    public interface b {
    }

    /* renamed from: androidx.core.content.res.e$c */
    /* loaded from: classes.dex */
    public static final class c implements b {

        /* renamed from: a */
        private final d[] f3278a;

        public c(d[] dVarArr) {
            this.f3278a = dVarArr;
        }

        /* renamed from: a */
        public d[] m3107a() {
            return this.f3278a;
        }
    }

    /* renamed from: androidx.core.content.res.e$d */
    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a */
        private final String f3279a;

        /* renamed from: b */
        private final int f3280b;

        /* renamed from: c */
        private final boolean f3281c;

        /* renamed from: d */
        private final String f3282d;

        /* renamed from: e */
        private final int f3283e;

        /* renamed from: f */
        private final int f3284f;

        public d(String str, int i10, boolean z10, String str2, int i11, int i12) {
            this.f3279a = str;
            this.f3280b = i10;
            this.f3281c = z10;
            this.f3282d = str2;
            this.f3283e = i11;
            this.f3284f = i12;
        }

        /* renamed from: a */
        public String m3108a() {
            return this.f3279a;
        }

        /* renamed from: b */
        public int m3109b() {
            return this.f3284f;
        }

        /* renamed from: c */
        public int m3110c() {
            return this.f3283e;
        }

        /* renamed from: d */
        public String m3111d() {
            return this.f3282d;
        }

        /* renamed from: e */
        public int m3112e() {
            return this.f3280b;
        }

        /* renamed from: f */
        public boolean m3113f() {
            return this.f3281c;
        }
    }

    /* renamed from: androidx.core.content.res.e$e */
    /* loaded from: classes.dex */
    public static final class e implements b {

        /* renamed from: a */
        private final C0638e f3285a;

        /* renamed from: b */
        private final int f3286b;

        /* renamed from: c */
        private final int f3287c;

        /* renamed from: d */
        private final String f3288d;

        public e(C0638e c0638e, int i10, int i11, String str) {
            this.f3285a = c0638e;
            this.f3287c = i10;
            this.f3286b = i11;
            this.f3288d = str;
        }

        /* renamed from: a */
        public int m3114a() {
            return this.f3287c;
        }

        /* renamed from: b */
        public C0638e m3115b() {
            return this.f3285a;
        }

        /* renamed from: c */
        public String m3116c() {
            return this.f3288d;
        }

        /* renamed from: d */
        public int m3117d() {
            return this.f3286b;
        }
    }

    /* renamed from: a */
    private static int m3098a(TypedArray typedArray, int i10) {
        return a.m3106a(typedArray, i10);
    }

    /* renamed from: b */
    public static b m3099b(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        int next;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return m3101d(xmlPullParser, resources);
        }
        throw new XmlPullParserException("No start tag found");
    }

    /* renamed from: c */
    public static List<List<byte[]>> m3100c(Resources resources, int i10) {
        if (i10 == 0) {
            return Collections.emptyList();
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i10);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (m3098a(obtainTypedArray, 0) == 1) {
                for (int i11 = 0; i11 < obtainTypedArray.length(); i11++) {
                    int resourceId = obtainTypedArray.getResourceId(i11, 0);
                    if (resourceId != 0) {
                        arrayList.add(m3105h(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(m3105h(resources.getStringArray(i10)));
            }
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    /* renamed from: d */
    private static b m3101d(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        xmlPullParser.require(2, null, "font-family");
        if (xmlPullParser.getName().equals("font-family")) {
            return m3102e(xmlPullParser, resources);
        }
        m3104g(xmlPullParser);
        return null;
    }

    /* renamed from: e */
    private static b m3102e(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), C4114g.f16760h);
        String string = obtainAttributes.getString(C4114g.f16761i);
        String string2 = obtainAttributes.getString(C4114g.f16765m);
        String string3 = obtainAttributes.getString(C4114g.f16766n);
        int resourceId = obtainAttributes.getResourceId(C4114g.f16762j, 0);
        int integer = obtainAttributes.getInteger(C4114g.f16763k, 1);
        int integer2 = obtainAttributes.getInteger(C4114g.f16764l, 500);
        String string4 = obtainAttributes.getString(C4114g.f16767o);
        obtainAttributes.recycle();
        if (string != null && string2 != null && string3 != null) {
            while (xmlPullParser.next() != 3) {
                m3104g(xmlPullParser);
            }
            return new e(new C0638e(string, string2, string3, m3100c(resources, resourceId)), integer, integer2, string4);
        }
        ArrayList arrayList = new ArrayList();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (xmlPullParser.getName().equals("font")) {
                    arrayList.add(m3103f(xmlPullParser, resources));
                } else {
                    m3104g(xmlPullParser);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new c((d[]) arrayList.toArray(new d[0]));
    }

    /* renamed from: f */
    private static d m3103f(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), C4114g.f16768p);
        int i10 = C4114g.f16777y;
        if (!obtainAttributes.hasValue(i10)) {
            i10 = C4114g.f16770r;
        }
        int i11 = obtainAttributes.getInt(i10, 400);
        int i12 = C4114g.f16775w;
        if (!obtainAttributes.hasValue(i12)) {
            i12 = C4114g.f16771s;
        }
        boolean z10 = 1 == obtainAttributes.getInt(i12, 0);
        int i13 = C4114g.f16778z;
        if (!obtainAttributes.hasValue(i13)) {
            i13 = C4114g.f16772t;
        }
        int i14 = C4114g.f16776x;
        if (!obtainAttributes.hasValue(i14)) {
            i14 = C4114g.f16773u;
        }
        String string = obtainAttributes.getString(i14);
        int i15 = obtainAttributes.getInt(i13, 0);
        int i16 = C4114g.f16774v;
        if (!obtainAttributes.hasValue(i16)) {
            i16 = C4114g.f16769q;
        }
        int resourceId = obtainAttributes.getResourceId(i16, 0);
        String string2 = obtainAttributes.getString(i16);
        obtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            m3104g(xmlPullParser);
        }
        return new d(string2, i11, z10, string, i15, resourceId);
    }

    /* renamed from: g */
    private static void m3104g(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int i10 = 1;
        while (i10 > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i10++;
            } else if (next == 3) {
                i10--;
            }
        }
    }

    /* renamed from: h */
    private static List<byte[]> m3105h(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.add(Base64.decode(str, 0));
        }
        return arrayList;
    }
}
