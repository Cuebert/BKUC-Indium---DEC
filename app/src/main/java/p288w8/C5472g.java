package p288w8;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import androidx.fragment.app.ActivityC0803d;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0802c;
import com.roblox.client.C2748c0;
import com.roblox.client.C2877p0;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import p033c7.C1134c;

/* renamed from: w8.g */
/* loaded from: classes.dex */
public class C5472g extends DialogInterfaceOnCancelListenerC0802c {

    /* renamed from: E0 */
    private static final long f20409E0 = TimeUnit.DAYS.toMillis(1);

    /* renamed from: F0 */
    private static boolean f20410F0 = false;

    /* renamed from: w8.g$a */
    /* loaded from: classes.dex */
    class a implements DialogInterface.OnClickListener {
        a() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
        }
    }

    /* renamed from: p2 */
    public static void m20124p2(ActivityC0803d activityC0803d) {
        f20410F0 = true;
        new C5472g().mo4608o2(activityC0803d.m4617y0(), "notice_dialog");
        C2877p0.m12882P().edit().putLong("deprecation_notice_previous_reminder", new Date().getTime()).apply();
    }

    /* renamed from: q2 */
    public static boolean m20125q2() {
        return !f20410F0 && Build.VERSION.SDK_INT < C1134c.m6537a().mo6651u0();
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0802c
    /* renamed from: g2 */
    public Dialog mo4601g2(Bundle bundle) {
        String m4330Z;
        AlertDialog.Builder builder = new AlertDialog.Builder(m4363p());
        try {
            m4330Z = m4330Z(C2748c0.f10758x3, DateFormat.getDateInstance().format(new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH).parse(C1134c.m6537a().mo6641q1())), Build.VERSION.RELEASE, C1134c.m6537a().mo6609g());
        } catch (ParseException unused) {
            m4330Z = m4330Z(C2748c0.f10752w3, Build.VERSION.RELEASE, C1134c.m6537a().mo6609g());
        }
        builder.setTitle(C2748c0.f10770z3);
        builder.setMessage(m4330Z);
        builder.setPositiveButton(C2748c0.f10764y3, new a());
        return builder.create();
    }
}
