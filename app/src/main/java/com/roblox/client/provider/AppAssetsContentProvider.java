package com.roblox.client.provider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.res.AssetFileDescriptor;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.webkit.MimeTypeMap;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import p033c7.C1134c;
import p035c9.C1151k;

/* loaded from: classes.dex */
public class AppAssetsContentProvider extends ContentProvider {

    /* renamed from: o */
    private static final String[] f11449o = {"_display_name", "_size"};

    /* renamed from: n */
    private final String f11450n = "AppAssetsContentProvider";

    /* renamed from: a */
    private boolean m12962a() {
        if (!C1134c.m6537a().mo6564M0()) {
            return true;
        }
        String callingPackage = getCallingPackage();
        if (callingPackage != null) {
            return callingPackage.startsWith("com.roblox.client") || callingPackage.startsWith("com.tencent.roblox");
        }
        return false;
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        C1151k.m6707a("AppAssetsContentProvider", "getType: " + uri.toString());
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(uri.toString()));
        return mimeTypeFromExtension != null ? mimeTypeFromExtension : "application/octet-stream";
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    public AssetFileDescriptor openAssetFile(Uri uri, String str) throws FileNotFoundException {
        C1151k.m6707a("AppAssetsContentProvider", "openAssetFile: " + uri.toString());
        if (!m12962a()) {
            return null;
        }
        File file = new File(getContext().getFilesDir().getParentFile(), uri.getPath());
        try {
            if (file.getCanonicalPath().startsWith(getContext().getFilesDir().getCanonicalPath())) {
                if (file.exists()) {
                    return new AssetFileDescriptor(ParcelFileDescriptor.open(file, 268435456), 0L, -1L);
                }
                throw new FileNotFoundException();
            }
            throw new SecurityException();
        } catch (IOException unused) {
            throw new IllegalArgumentException();
        }
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        int i10;
        C1151k.m6707a("AppAssetsContentProvider", "query: " + uri.toString());
        if (!m12962a()) {
            return null;
        }
        if (strArr == null) {
            strArr = f11449o;
        }
        File file = new File(getContext().getFilesDir().getParentFile(), uri.getPath());
        long length = file.exists() ? file.length() : 0L;
        String[] strArr3 = new String[strArr.length];
        Object[] objArr = new Object[strArr.length];
        int i11 = 0;
        for (String str3 : strArr) {
            if ("_display_name".equals(str3)) {
                strArr3[i11] = "_display_name";
                i10 = i11 + 1;
                objArr[i11] = uri.getLastPathSegment();
            } else if ("_size".equals(str3)) {
                strArr3[i11] = "_size";
                i10 = i11 + 1;
                objArr[i11] = Long.valueOf(length);
            }
            i11 = i10;
        }
        MatrixCursor matrixCursor = new MatrixCursor(strArr3, 1);
        matrixCursor.addRow(objArr);
        return matrixCursor;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
