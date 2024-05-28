package p212q5;

import android.content.Context;
import android.content.SharedPreferences;
import java.text.SimpleDateFormat;
import java.util.Date;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: q5.g */
/* loaded from: classes.dex */
public class C4320g {

    /* renamed from: c */
    private static C4320g f17552c;

    /* renamed from: d */
    private static final SimpleDateFormat f17553d = new SimpleDateFormat("dd/MM/yyyy z");

    /* renamed from: a */
    private final SharedPreferences f17554a;

    /* renamed from: b */
    private final SharedPreferences f17555b;

    private C4320g(Context context) {
        this.f17554a = context.getSharedPreferences("FirebaseAppHeartBeat", 0);
        this.f17555b = context.getSharedPreferences("FirebaseAppHeartBeatStorage", 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static synchronized C4320g m17833a(Context context) {
        C4320g c4320g;
        synchronized (C4320g.class) {
            if (f17552c == null) {
                f17552c = new C4320g(context);
            }
            c4320g = f17552c;
        }
        return c4320g;
    }

    /* renamed from: b */
    static boolean m17834b(long j10, long j11) {
        Date date = new Date(j10);
        Date date2 = new Date(j11);
        SimpleDateFormat simpleDateFormat = f17553d;
        return !simpleDateFormat.format(date).equals(simpleDateFormat.format(date2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public synchronized boolean m17835c(long j10) {
        return m17836d("fire-global", j10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public synchronized boolean m17836d(String str, long j10) {
        if (this.f17554a.contains(str)) {
            if (!m17834b(this.f17554a.getLong(str, -1L), j10)) {
                return false;
            }
            this.f17554a.edit().putLong(str, j10).apply();
            return true;
        }
        this.f17554a.edit().putLong(str, j10).apply();
        return true;
    }
}
