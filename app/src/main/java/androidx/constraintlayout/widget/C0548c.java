package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: androidx.constraintlayout.widget.c */
/* loaded from: classes.dex */
public class C0548c {

    /* renamed from: a */
    private final ConstraintLayout f2538a;

    /* renamed from: b */
    int f2539b = -1;

    /* renamed from: c */
    int f2540c = -1;

    /* renamed from: d */
    private SparseArray<a> f2541d = new SparseArray<>();

    /* renamed from: e */
    private SparseArray<C0549d> f2542e = new SparseArray<>();

    /* renamed from: androidx.constraintlayout.widget.c$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        int f2543a;

        /* renamed from: b */
        ArrayList<b> f2544b = new ArrayList<>();

        /* renamed from: c */
        int f2545c;

        /* renamed from: d */
        C0549d f2546d;

        public a(Context context, XmlPullParser xmlPullParser) {
            this.f2545c = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), C0554i.f2706F4);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == C0554i.f2712G4) {
                    this.f2543a = obtainStyledAttributes.getResourceId(index, this.f2543a);
                } else if (index == C0554i.f2718H4) {
                    this.f2545c = obtainStyledAttributes.getResourceId(index, this.f2545c);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f2545c);
                    context.getResources().getResourceName(this.f2545c);
                    if ("layout".equals(resourceTypeName)) {
                        C0549d c0549d = new C0549d();
                        this.f2546d = c0549d;
                        c0549d.m2584f(context, this.f2545c);
                    }
                }
            }
            obtainStyledAttributes.recycle();
        }

        /* renamed from: a */
        void m2573a(b bVar) {
            this.f2544b.add(bVar);
        }
    }

    /* renamed from: androidx.constraintlayout.widget.c$b */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        float f2547a;

        /* renamed from: b */
        float f2548b;

        /* renamed from: c */
        float f2549c;

        /* renamed from: d */
        float f2550d;

        /* renamed from: e */
        int f2551e;

        /* renamed from: f */
        C0549d f2552f;

        public b(Context context, XmlPullParser xmlPullParser) {
            this.f2547a = Float.NaN;
            this.f2548b = Float.NaN;
            this.f2549c = Float.NaN;
            this.f2550d = Float.NaN;
            this.f2551e = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), C0554i.f2840b5);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == C0554i.f2847c5) {
                    this.f2551e = obtainStyledAttributes.getResourceId(index, this.f2551e);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f2551e);
                    context.getResources().getResourceName(this.f2551e);
                    if ("layout".equals(resourceTypeName)) {
                        C0549d c0549d = new C0549d();
                        this.f2552f = c0549d;
                        c0549d.m2584f(context, this.f2551e);
                    }
                } else if (index == C0554i.f2854d5) {
                    this.f2550d = obtainStyledAttributes.getDimension(index, this.f2550d);
                } else if (index == C0554i.f2861e5) {
                    this.f2548b = obtainStyledAttributes.getDimension(index, this.f2548b);
                } else if (index == C0554i.f2868f5) {
                    this.f2549c = obtainStyledAttributes.getDimension(index, this.f2549c);
                } else if (index == C0554i.f2875g5) {
                    this.f2547a = obtainStyledAttributes.getDimension(index, this.f2547a);
                } else {
                    Log.v("ConstraintLayoutStates", "Unknown tag");
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public C0548c(Context context, ConstraintLayout constraintLayout, int i10) {
        this.f2538a = constraintLayout;
        m2570a(context, i10);
    }

    /* renamed from: a */
    private void m2570a(Context context, int i10) {
        XmlResourceParser xml = context.getResources().getXml(i10);
        a aVar = null;
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    char c10 = 65535;
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                c10 = 4;
                                break;
                            }
                            break;
                        case 80204913:
                            if (name.equals("State")) {
                                c10 = 2;
                                break;
                            }
                            break;
                        case 1382829617:
                            if (name.equals("StateSet")) {
                                c10 = 1;
                                break;
                            }
                            break;
                        case 1657696882:
                            if (name.equals("layoutDescription")) {
                                c10 = 0;
                                break;
                            }
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                c10 = 3;
                                break;
                            }
                            break;
                    }
                    if (c10 != 0 && c10 != 1) {
                        if (c10 == 2) {
                            aVar = new a(context, xml);
                            this.f2541d.put(aVar.f2543a, aVar);
                        } else if (c10 == 3) {
                            b bVar = new b(context, xml);
                            if (aVar != null) {
                                aVar.m2573a(bVar);
                            }
                        } else if (c10 != 4) {
                            Log.v("ConstraintLayoutStates", "unknown tag " + name);
                        } else {
                            m2571b(context, xml);
                        }
                    }
                }
            }
        } catch (IOException e10) {
            e10.printStackTrace();
        } catch (XmlPullParserException e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: b */
    private void m2571b(Context context, XmlPullParser xmlPullParser) {
        C0549d c0549d = new C0549d();
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i10 = 0; i10 < attributeCount; i10++) {
            if ("id".equals(xmlPullParser.getAttributeName(i10))) {
                String attributeValue = xmlPullParser.getAttributeValue(i10);
                int identifier = attributeValue.contains("/") ? context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName()) : -1;
                if (identifier == -1) {
                    if (attributeValue.length() > 1) {
                        identifier = Integer.parseInt(attributeValue.substring(1));
                    } else {
                        Log.e("ConstraintLayoutStates", "error in parsing id");
                    }
                }
                c0549d.m2589n(context, xmlPullParser);
                this.f2542e.put(identifier, c0549d);
                return;
            }
        }
    }

    /* renamed from: c */
    public void m2572c(AbstractC0551f abstractC0551f) {
    }
}
