package p049d9;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;
import com.roblox.client.C2748c0;
import com.roblox.client.C2877p0;
import java.util.ArrayList;
import p035c9.C1151k;
import p035c9.C1152l;
import p250t7.C4736a;

/* renamed from: d9.b */
/* loaded from: classes.dex */
public class C3025b {
    /* renamed from: a */
    public static void m13491a(Context context, TextView textView) {
        String string = context.getString(C2748c0.f10626b3);
        String string2 = context.getString(C2748c0.f10599W2);
        m13493c(context, textView, C4736a.m18881c(context, C2748c0.f10518G1, string, string2), string, string2);
    }

    /* renamed from: b */
    public static void m13492b(Context context, TextView textView) {
        String string = context.getString(C2748c0.f10626b3);
        String string2 = context.getString(C2748c0.f10599W2);
        m13493c(context, textView, string + " - " + string2, string, string2);
    }

    /* renamed from: c */
    public static void m13493c(Context context, TextView textView, String str, String str2, String str3) {
        int indexOf = str.indexOf(str2);
        int length = indexOf + str2.length();
        int indexOf2 = str.indexOf(str3);
        m13495e(textView, str, new C3027d(m13497g(), context, str2, indexOf, length), new C3027d(m13496f(), context, str3, indexOf2, indexOf2 + str3.length()));
    }

    /* renamed from: d */
    static SpannableStringBuilder m13494d(SpannableStringBuilder spannableStringBuilder, String str, AbstractC3024a... abstractC3024aArr) {
        ArrayList arrayList = new ArrayList();
        for (AbstractC3024a abstractC3024a : abstractC3024aArr) {
            try {
                if (str.contains(abstractC3024a.m13488a())) {
                    int m13490c = abstractC3024a.m13490c();
                    int m13489b = abstractC3024a.m13489b();
                    arrayList.add(abstractC3024a);
                    if (!m13498h(arrayList, str, m13490c, m13489b)) {
                        spannableStringBuilder.setSpan(abstractC3024a, m13490c, m13489b, 33);
                    }
                }
            } catch (NullPointerException e10) {
                C1151k.m6708b("NullPointer Exception in generateClickableString(): " + e10.getMessage());
            }
        }
        return spannableStringBuilder;
    }

    /* renamed from: e */
    public static void m13495e(TextView textView, String str, AbstractC3024a... abstractC3024aArr) {
        textView.setText(m13494d(new SpannableStringBuilder(str), str, abstractC3024aArr));
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    /* renamed from: f */
    private static String m13496f() {
        if (C1152l.m6736g()) {
            return "https://game.qq.com/privacy_guide.shtml";
        }
        return C2877p0.m12926i() + "Info/Privacy?layout=null";
    }

    /* renamed from: g */
    private static String m13497g() {
        if (C1152l.m6736g()) {
            return "https://game.qq.com/contract.shtml";
        }
        return C2877p0.m12926i() + "info/terms";
    }

    /* renamed from: h */
    private static boolean m13498h(ArrayList<AbstractC3024a> arrayList, String str, int i10, int i11) {
        for (int i12 = 0; i12 < arrayList.size() - 1; i12++) {
            arrayList.get(i12).m13488a();
            int m13490c = arrayList.get(i12).m13490c();
            int m13489b = arrayList.get(i12).m13489b();
            if ((i10 >= m13490c && i10 <= m13489b) || (i11 >= m13490c && i11 <= m13489b)) {
                return true;
            }
        }
        return false;
    }
}
