package qa;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.provider.MediaStore;
import java.io.IOException;
import qa.AbstractC4364y;
import qa.C4359t;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: qa.o */
/* loaded from: classes.dex */
public class C4354o extends C4345g {

    /* renamed from: b */
    private static final String[] f17715b = {"orientation"};

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: qa.o$a */
    /* loaded from: classes.dex */
    public enum a {
        MICRO(3, 96, 96),
        MINI(1, 512, 384),
        FULL(2, -1, -1);


        /* renamed from: n */
        final int f17720n;

        /* renamed from: o */
        final int f17721o;

        /* renamed from: p */
        final int f17722p;

        a(int i10, int i11, int i12) {
            this.f17720n = i10;
            this.f17721o = i11;
            this.f17722p = i12;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4354o(Context context) {
        super(context);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0020, code lost:
    
        r1.close();
     */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static int m17991k(android.content.ContentResolver r8, android.net.Uri r9) {
        /*
            r0 = 0
            r1 = 0
            java.lang.String[] r4 = qa.C4354o.f17715b     // Catch: java.lang.Throwable -> L24 java.lang.RuntimeException -> L2b
            r5 = 0
            r6 = 0
            r7 = 0
            r2 = r8
            r3 = r9
            android.database.Cursor r1 = r2.query(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L24 java.lang.RuntimeException -> L2b
            if (r1 == 0) goto L1e
            boolean r8 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L24 java.lang.RuntimeException -> L2b
            if (r8 != 0) goto L16
            goto L1e
        L16:
            int r8 = r1.getInt(r0)     // Catch: java.lang.Throwable -> L24 java.lang.RuntimeException -> L2b
            r1.close()
            return r8
        L1e:
            if (r1 == 0) goto L23
            r1.close()
        L23:
            return r0
        L24:
            r8 = move-exception
            if (r1 == 0) goto L2a
            r1.close()
        L2a:
            throw r8
        L2b:
            if (r1 == 0) goto L31
            r1.close()
        L31:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: qa.C4354o.m17991k(android.content.ContentResolver, android.net.Uri):int");
    }

    /* renamed from: l */
    static a m17992l(int i10, int i11) {
        a aVar = a.MICRO;
        if (i10 <= aVar.f17721o && i11 <= aVar.f17722p) {
            return aVar;
        }
        a aVar2 = a.MINI;
        return (i10 > aVar2.f17721o || i11 > aVar2.f17722p) ? a.FULL : aVar2;
    }

    @Override // qa.C4345g, qa.AbstractC4364y
    /* renamed from: c */
    public boolean mo17891c(C4362w c4362w) {
        Uri uri = c4362w.f17789d;
        return "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }

    @Override // qa.C4345g, qa.AbstractC4364y
    /* renamed from: f */
    public AbstractC4364y.a mo17892f(C4362w c4362w, int i10) throws IOException {
        Bitmap thumbnail;
        ContentResolver contentResolver = this.f17671a.getContentResolver();
        int m17991k = m17991k(contentResolver, c4362w.f17789d);
        String type = contentResolver.getType(c4362w.f17789d);
        boolean z10 = type != null && type.startsWith("video/");
        if (c4362w.m18030c()) {
            a m17992l = m17992l(c4362w.f17793h, c4362w.f17794i);
            if (!z10 && m17992l == a.FULL) {
                return new AbstractC4364y.a(null, m17929j(c4362w), C4359t.e.DISK, m17991k);
            }
            long parseId = ContentUris.parseId(c4362w.f17789d);
            BitmapFactory.Options m18050d = AbstractC4364y.m18050d(c4362w);
            m18050d.inJustDecodeBounds = true;
            AbstractC4364y.m18048a(c4362w.f17793h, c4362w.f17794i, m17992l.f17721o, m17992l.f17722p, m18050d, c4362w);
            if (z10) {
                thumbnail = MediaStore.Video.Thumbnails.getThumbnail(contentResolver, parseId, m17992l == a.FULL ? 1 : m17992l.f17720n, m18050d);
            } else {
                thumbnail = MediaStore.Images.Thumbnails.getThumbnail(contentResolver, parseId, m17992l.f17720n, m18050d);
            }
            if (thumbnail != null) {
                return new AbstractC4364y.a(thumbnail, null, C4359t.e.DISK, m17991k);
            }
        }
        return new AbstractC4364y.a(null, m17929j(c4362w), C4359t.e.DISK, m17991k);
    }
}
