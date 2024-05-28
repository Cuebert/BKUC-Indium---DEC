package androidx.core.provider;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;
import androidx.core.content.res.C0593e;
import androidx.core.provider.C0640g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.core.provider.d */
/* loaded from: classes.dex */
public class C0637d {

    /* renamed from: a */
    private static final Comparator<byte[]> f3411a = new Comparator() { // from class: androidx.core.provider.c
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int m3376g;
            m3376g = C0637d.m3376g((byte[]) obj, (byte[]) obj2);
            return m3376g;
        }
    };

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.provider.d$a */
    /* loaded from: classes.dex */
    public static class a {
        /* renamed from: a */
        static Cursor m3378a(ContentResolver contentResolver, Uri uri, String[] strArr, String str, String[] strArr2, String str2, Object obj) {
            return contentResolver.query(uri, strArr, str, strArr2, str2, (CancellationSignal) obj);
        }
    }

    /* renamed from: b */
    private static List<byte[]> m3371b(Signature[] signatureArr) {
        ArrayList arrayList = new ArrayList();
        for (Signature signature : signatureArr) {
            arrayList.add(signature.toByteArray());
        }
        return arrayList;
    }

    /* renamed from: c */
    private static boolean m3372c(List<byte[]> list, List<byte[]> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (!Arrays.equals(list.get(i10), list2.get(i10))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    private static List<List<byte[]>> m3373d(C0638e c0638e, Resources resources) {
        if (c0638e.m3380b() != null) {
            return c0638e.m3380b();
        }
        return C0593e.m3100c(resources, c0638e.m3381c());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static C0640g.a m3374e(Context context, C0638e c0638e, CancellationSignal cancellationSignal) throws PackageManager.NameNotFoundException {
        ProviderInfo m3375f = m3375f(context.getPackageManager(), c0638e, context.getResources());
        if (m3375f == null) {
            return C0640g.a.m3397a(1, null);
        }
        return C0640g.a.m3397a(0, m3377h(context, c0638e, m3375f.authority, cancellationSignal));
    }

    /* renamed from: f */
    static ProviderInfo m3375f(PackageManager packageManager, C0638e c0638e, Resources resources) throws PackageManager.NameNotFoundException {
        String m3383e = c0638e.m3383e();
        ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(m3383e, 0);
        if (resolveContentProvider != null) {
            if (resolveContentProvider.packageName.equals(c0638e.m3384f())) {
                List<byte[]> m3371b = m3371b(packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures);
                Collections.sort(m3371b, f3411a);
                List<List<byte[]>> m3373d = m3373d(c0638e, resources);
                for (int i10 = 0; i10 < m3373d.size(); i10++) {
                    ArrayList arrayList = new ArrayList(m3373d.get(i10));
                    Collections.sort(arrayList, f3411a);
                    if (m3372c(m3371b, arrayList)) {
                        return resolveContentProvider;
                    }
                }
                return null;
            }
            throw new PackageManager.NameNotFoundException("Found content provider " + m3383e + ", but package was not " + c0638e.m3384f());
        }
        throw new PackageManager.NameNotFoundException("No package found for authority: " + m3383e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public static /* synthetic */ int m3376g(byte[] bArr, byte[] bArr2) {
        int i10;
        int i11;
        if (bArr.length != bArr2.length) {
            i10 = bArr.length;
            i11 = bArr2.length;
        } else {
            for (int i12 = 0; i12 < bArr.length; i12++) {
                if (bArr[i12] != bArr2[i12]) {
                    i10 = bArr[i12];
                    i11 = bArr2[i12];
                }
            }
            return 0;
        }
        return i10 - i11;
    }

    /* renamed from: h */
    static C0640g.b[] m3377h(Context context, C0638e c0638e, String str, CancellationSignal cancellationSignal) {
        int i10;
        Uri withAppendedId;
        int i11;
        boolean z10;
        ArrayList arrayList = new ArrayList();
        Uri build = new Uri.Builder().scheme("content").authority(str).build();
        Uri build2 = new Uri.Builder().scheme("content").authority(str).appendPath("file").build();
        Cursor cursor = null;
        try {
            cursor = a.m3378a(context.getContentResolver(), build, new String[]{"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, "query = ?", new String[]{c0638e.m3385g()}, null, cancellationSignal);
            if (cursor != null && cursor.getCount() > 0) {
                int columnIndex = cursor.getColumnIndex("result_code");
                ArrayList arrayList2 = new ArrayList();
                int columnIndex2 = cursor.getColumnIndex("_id");
                int columnIndex3 = cursor.getColumnIndex("file_id");
                int columnIndex4 = cursor.getColumnIndex("font_ttc_index");
                int columnIndex5 = cursor.getColumnIndex("font_weight");
                int columnIndex6 = cursor.getColumnIndex("font_italic");
                while (cursor.moveToNext()) {
                    int i12 = columnIndex != -1 ? cursor.getInt(columnIndex) : 0;
                    int i13 = columnIndex4 != -1 ? cursor.getInt(columnIndex4) : 0;
                    if (columnIndex3 == -1) {
                        i10 = i12;
                        withAppendedId = ContentUris.withAppendedId(build, cursor.getLong(columnIndex2));
                    } else {
                        i10 = i12;
                        withAppendedId = ContentUris.withAppendedId(build2, cursor.getLong(columnIndex3));
                    }
                    int i14 = columnIndex5 != -1 ? cursor.getInt(columnIndex5) : 400;
                    if (columnIndex6 == -1 || cursor.getInt(columnIndex6) != 1) {
                        i11 = i10;
                        z10 = false;
                    } else {
                        i11 = i10;
                        z10 = true;
                    }
                    arrayList2.add(C0640g.b.m3400a(withAppendedId, i13, i14, z10, i11));
                }
                arrayList = arrayList2;
            }
            return (C0640g.b[]) arrayList.toArray(new C0640g.b[0]);
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
    }
}
