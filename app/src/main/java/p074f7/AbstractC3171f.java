package p074f7;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import android.webkit.MimeTypeMap;
import com.appsflyer.oaid.BuildConfig;
import com.roblox.client.RobloxApplication;
import com.roblox.engine.jni.EngineJavaCallback2;
import com.roblox.engine.jni.NativeGLInterface;
import com.roblox.engine.jni.model.NativeTextBoxInfo;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.Objects;
import p035c9.C1151k;

/* renamed from: f7.f */
/* loaded from: classes.dex */
public abstract class AbstractC3171f extends EngineJavaCallback2 {
    /* renamed from: q */
    private OutputStream m13900q(String str) throws IOException {
        File externalStoragePublicDirectory;
        Uri insert;
        String m13901r = m13901r(str);
        if (Build.VERSION.SDK_INT >= 29) {
            ContentResolver contentResolver = RobloxApplication.m12215a().getContentResolver();
            ContentValues contentValues = new ContentValues();
            contentValues.put("_display_name", str);
            contentValues.put("mime_type", m13901r);
            contentValues.put("relative_path", Environment.DIRECTORY_PICTURES);
            if (m13901r.startsWith("image/")) {
                insert = contentResolver.insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
            } else if (m13901r.startsWith("video/")) {
                insert = contentResolver.insert(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, contentValues);
            } else {
                insert = contentResolver.insert(MediaStore.Downloads.EXTERNAL_CONTENT_URI, contentValues);
            }
            Objects.requireNonNull(insert);
            return contentResolver.openOutputStream(insert);
        }
        if (m13901r.startsWith("image/")) {
            externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES);
        } else if (m13901r.startsWith("video/")) {
            externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MOVIES);
        } else {
            externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
        }
        return new FileOutputStream(new File(externalStoragePublicDirectory, str));
    }

    /* renamed from: r */
    private String m13901r(String str) {
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(str));
        return mimeTypeFromExtension != null ? mimeTypeFromExtension : "application/octet-stream";
    }

    @Override // com.roblox.engine.jni.EngineJavaCallback2
    /* renamed from: c */
    public void mo13259c(int i10) {
        if (i10 == 3) {
            mo12564p().mo13880d();
        }
    }

    @Override // com.roblox.engine.jni.EngineJavaCallback2
    /* renamed from: d */
    public void mo13260d() {
        InterfaceC3176h0 mo12564p = mo12564p();
        if (mo12564p != null) {
            mo12564p.mo13877a();
        }
    }

    @Override // com.roblox.engine.jni.EngineJavaCallback2
    /* renamed from: g */
    public void mo13261g(String str) {
        InterfaceC3176h0 mo12564p = mo12564p();
        if (mo12564p != null) {
            mo12564p.mo13879c(str);
        }
    }

    @Override // com.roblox.engine.jni.EngineJavaCallback2
    /* renamed from: h */
    public void mo13262h() {
        InterfaceC3176h0 mo12564p = mo12564p();
        if (mo12564p != null) {
            mo12564p.mo13881e();
        }
    }

    @Override // com.roblox.engine.jni.EngineJavaCallback2
    /* renamed from: m */
    public void mo13263m(String str) {
        String message;
        String name = new File(str).getName();
        boolean z10 = false;
        try {
            FileInputStream fileInputStream = new FileInputStream(str);
            OutputStream m13900q = m13900q(name);
            byte[] bArr = new byte[8192];
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read <= 0) {
                    break;
                } else {
                    m13900q.write(bArr, 0, read);
                }
            }
            fileInputStream.close();
            m13900q.close();
            z10 = true;
            message = BuildConfig.FLAVOR;
        } catch (IOException e10) {
            C1151k.m6716j("DataModelJavaCallback", "saveImageToAlbum: Failed to save image with exception: \n" + e10);
            message = e10.getMessage();
        }
        NativeGLInterface.nativeImageSavedToAlbumFinished(name, z10, message);
    }

    @Override // com.roblox.engine.jni.EngineJavaCallback2
    /* renamed from: o */
    public void mo13265o(long j10, boolean z10, byte[] bArr, NativeTextBoxInfo nativeTextBoxInfo) {
        InterfaceC3176h0 mo12564p = mo12564p();
        if (mo12564p != null) {
            mo12564p.mo13878b(j10, z10, new String(bArr, Charset.forName("UTF-8")), nativeTextBoxInfo);
        }
    }

    /* renamed from: p */
    public abstract InterfaceC3176h0 mo12564p();
}
