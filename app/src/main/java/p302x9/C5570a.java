package p302x9;

import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;

/* renamed from: x9.a */
/* loaded from: classes.dex */
public class C5570a {
    /* renamed from: a */
    public static String m20471a(boolean z10) {
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        if (z10) {
            str2 = str + " " + str2 + Build.DEVICE;
        } else if (!str2.startsWith(str)) {
            str2 = str + " " + str2;
        }
        return Character.toUpperCase(str2.charAt(0)) + str2.substring(1, str2.length());
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0065 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0089 A[Catch: IOException -> 0x0091, TRY_ENTER, TryCatch #4 {IOException -> 0x0091, blocks: (B:43:0x0089, B:47:0x008d), top: B:41:0x0087 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008d A[Catch: IOException -> 0x0091, TRY_LEAVE, TryCatch #4 {IOException -> 0x0091, blocks: (B:43:0x0089, B:47:0x008d), top: B:41:0x0087 }] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int m20472b() {
        /*
            java.lang.String r0 = "Cannot find reader"
            java.lang.String r1 = "File close failed: "
            java.lang.String r2 = "rbx.platform.utils"
            r3 = 0
            java.io.RandomAccessFile r4 = new java.io.RandomAccessFile     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L37
            java.lang.String r5 = "/proc/meminfo"
            java.lang.String r6 = "r"
            r4.<init>(r5, r6)     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L37
            java.lang.String r3 = r4.readLine()     // Catch: java.io.IOException -> L30 java.lang.Throwable -> L86
            r4.close()     // Catch: java.io.IOException -> L18
            goto L62
        L18:
            r0 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
        L1e:
            r4.append(r1)
            java.lang.String r0 = r0.toString()
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            p035c9.C1151k.m6709c(r2, r0)
            goto L62
        L30:
            r5 = move-exception
            goto L39
        L32:
            r4 = move-exception
            r8 = r4
            r4 = r3
            r3 = r8
            goto L87
        L37:
            r5 = move-exception
            r4 = r3
        L39:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L86
            r6.<init>()     // Catch: java.lang.Throwable -> L86
            java.lang.String r7 = "File read failed: "
            r6.append(r7)     // Catch: java.lang.Throwable -> L86
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L86
            r6.append(r5)     // Catch: java.lang.Throwable -> L86
            java.lang.String r5 = r6.toString()     // Catch: java.lang.Throwable -> L86
            p035c9.C1151k.m6709c(r2, r5)     // Catch: java.lang.Throwable -> L86
            if (r4 != 0) goto L57
            p035c9.C1151k.m6709c(r2, r0)     // Catch: java.io.IOException -> L5b
            goto L62
        L57:
            r4.close()     // Catch: java.io.IOException -> L5b
            goto L62
        L5b:
            r0 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            goto L1e
        L62:
            r0 = 0
            if (r3 != 0) goto L66
            return r0
        L66:
            java.lang.String r1 = "\\s+"
            java.lang.String[] r1 = r3.split(r1)
            int r3 = r1.length
            r4 = 2
            if (r3 >= r4) goto L71
            return r0
        L71:
            r3 = 0
            r0 = 1
            r0 = r1[r0]     // Catch: java.lang.NumberFormatException -> L7f
            long r0 = java.lang.Long.parseLong(r0)     // Catch: java.lang.NumberFormatException -> L7f
            r5 = 1024(0x400, double:5.06E-321)
            long r3 = r0 / r5
            goto L84
        L7f:
            java.lang.String r0 = "NumberFormatException getDeviceTotalMegabytes()"
            p035c9.C1151k.m6709c(r2, r0)
        L84:
            int r0 = (int) r3
            return r0
        L86:
            r3 = move-exception
        L87:
            if (r4 != 0) goto L8d
            p035c9.C1151k.m6709c(r2, r0)     // Catch: java.io.IOException -> L91
            goto La8
        L8d:
            r4.close()     // Catch: java.io.IOException -> L91
            goto La8
        L91:
            r0 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r1)
            java.lang.String r0 = r0.toString()
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            p035c9.C1151k.m6709c(r2, r0)
        La8:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p302x9.C5570a.m20472b():int");
    }

    /* renamed from: c */
    public static Point m20473c(Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        Point point = new Point();
        float f10 = displayMetrics.widthPixels;
        float f11 = displayMetrics.density;
        point.x = (int) (f10 / f11);
        point.y = (int) (displayMetrics.heightPixels / f11);
        return point;
    }

    /* renamed from: d */
    public static Point m20474d(Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        Point point = new Point();
        point.x = (int) displayMetrics.xdpi;
        point.y = (int) displayMetrics.ydpi;
        return point;
    }

    /* renamed from: e */
    public static Point m20475e(Context context) {
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        return point;
    }
}
