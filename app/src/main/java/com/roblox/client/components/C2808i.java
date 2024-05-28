package com.roblox.client.components;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.util.Pair;
import android.widget.TextView;
import com.appsflyer.oaid.BuildConfig;
import com.google.gson.stream.JsonReader;
import com.roblox.client.C2819e0;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import p020b6.C1055f;
import p035c9.C1151k;
import p076f9.C3213g;

/* renamed from: com.roblox.client.components.i */
/* loaded from: classes.dex */
public class C2808i {

    /* renamed from: a */
    private static Map<Integer, Pair<String, Float>> f10966a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.roblox.client.components.i$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        private static Hashtable<String, Typeface> f10967a = new Hashtable<>();

        /* renamed from: a */
        public static Typeface m12432a(String str, Context context) {
            Typeface typeface = f10967a.get(str);
            if (typeface != null) {
                return typeface;
            }
            try {
                Typeface createFromAsset = Typeface.createFromAsset(context.getAssets(), str);
                f10967a.put(str, createFromAsset);
                return createFromAsset;
            } catch (Exception unused) {
                return null;
            }
        }

        /* renamed from: b */
        public static Typeface m12433b(String str, String str2) {
            Typeface typeface = f10967a.get(str);
            if (typeface != null) {
                return typeface;
            }
            try {
                Typeface createFromFile = Typeface.createFromFile(str2);
                f10967a.put(str, createFromFile);
                return createFromFile;
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* renamed from: a */
    static Map<Integer, Pair<String, Float>> m12426a(Context context) {
        File file = new File(C3213g.m14266f(context) + "/fonts/font-mappings.json");
        HashMap hashMap = new HashMap();
        try {
            JsonReader m6310p = new C1055f().m6310p(new BufferedReader(new InputStreamReader(new FileInputStream(file))));
            m6310p.beginArray();
            while (m6310p.hasNext()) {
                int i10 = -1;
                String str = BuildConfig.FLAVOR;
                float f10 = 0.833f;
                m6310p.beginObject();
                while (m6310p.hasNext()) {
                    String nextName = m6310p.nextName();
                    if (nextName.equals("enum")) {
                        i10 = m6310p.nextInt();
                    } else if (nextName.equals("font")) {
                        str = m6310p.nextString();
                    } else if (nextName.equals("fromRbxFontRatio")) {
                        f10 = (float) m6310p.nextDouble();
                    } else {
                        m6310p.skipValue();
                    }
                }
                hashMap.put(Integer.valueOf(i10), Pair.create(str, Float.valueOf(f10)));
                m6310p.endObject();
            }
            m6310p.endArray();
            return hashMap;
        } catch (IOException e10) {
            C1151k.m6710d("rbx.glview.text", "Unable to parse mapping json", e10);
            return new HashMap();
        }
    }

    /* renamed from: b */
    public static float m12427b(int i10, Context context) {
        if (f10966a == null) {
            f10966a = m12426a(context);
        }
        if (f10966a.containsKey(Integer.valueOf(i10))) {
            return ((Float) f10966a.get(Integer.valueOf(i10)).second).floatValue();
        }
        return 0.833f;
    }

    /* renamed from: c */
    public static void m12428c(TextView textView, Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2819e0.f11132j1);
        String string = obtainStyledAttributes.getString(C2819e0.f11136k1);
        if (string == null) {
            string = "SourceSansPro-Light.ttf";
        }
        m12429d(textView, context, string);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: d */
    public static void m12429d(TextView textView, Context context, String str) {
        if (str != null) {
            Typeface m12432a = a.m12432a("fonts/" + str, context);
            if (m12432a != null) {
                textView.setTypeface(m12432a);
            }
        }
    }

    /* renamed from: e */
    public static boolean m12430e(TextView textView, Context context, int i10) {
        if (f10966a == null) {
            f10966a = m12426a(context);
        }
        if (f10966a.containsKey(Integer.valueOf(i10))) {
            return m12431f(textView, (String) f10966a.get(Integer.valueOf(i10)).first);
        }
        return false;
    }

    /* renamed from: f */
    public static boolean m12431f(TextView textView, String str) {
        String m14267g;
        if (str != null && (m14267g = C3213g.m14267g()) != null) {
            Typeface m12433b = a.m12433b(str, m14267g + "/fonts/" + str);
            if (m12433b != null) {
                textView.setTypeface(m12433b);
                return true;
            }
            C1151k.m6709c("rbx.glview.text", String.format("Attempting to load non-existant font: %s.", str));
        }
        return false;
    }
}
