package qa;

import android.annotation.TargetApi;
import android.content.ContentResolver;
import android.content.Context;
import android.content.UriMatcher;
import android.net.Uri;
import android.provider.ContactsContract;
import java.io.IOException;
import java.io.InputStream;
import qa.AbstractC4364y;
import qa.C4359t;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: qa.f */
/* loaded from: classes.dex */
public class C4343f extends AbstractC4364y {

    /* renamed from: b */
    private static final UriMatcher f17665b;

    /* renamed from: a */
    private final Context f17666a;

    /* JADX INFO: Access modifiers changed from: private */
    @TargetApi(14)
    /* renamed from: qa.f$a */
    /* loaded from: classes.dex */
    public static class a {
        /* renamed from: a */
        static InputStream m17923a(ContentResolver contentResolver, Uri uri) {
            return ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, uri, true);
        }
    }

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        f17665b = uriMatcher;
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/#/photo", 2);
        uriMatcher.addURI("com.android.contacts", "contacts/#", 3);
        uriMatcher.addURI("com.android.contacts", "display_photo/#", 4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4343f(Context context) {
        this.f17666a = context;
    }

    /* renamed from: j */
    private InputStream m17922j(C4362w c4362w) throws IOException {
        ContentResolver contentResolver = this.f17666a.getContentResolver();
        Uri uri = c4362w.f17789d;
        int match = f17665b.match(uri);
        if (match != 1) {
            if (match != 2) {
                if (match != 3) {
                    if (match != 4) {
                        throw new IllegalStateException("Invalid uri: " + uri);
                    }
                }
            }
            return contentResolver.openInputStream(uri);
        }
        uri = ContactsContract.Contacts.lookupContact(contentResolver, uri);
        if (uri == null) {
            return null;
        }
        return a.m17923a(contentResolver, uri);
    }

    @Override // qa.AbstractC4364y
    /* renamed from: c */
    public boolean mo17891c(C4362w c4362w) {
        Uri uri = c4362w.f17789d;
        return "content".equals(uri.getScheme()) && ContactsContract.Contacts.CONTENT_URI.getHost().equals(uri.getHost()) && f17665b.match(c4362w.f17789d) != -1;
    }

    @Override // qa.AbstractC4364y
    /* renamed from: f */
    public AbstractC4364y.a mo17892f(C4362w c4362w, int i10) throws IOException {
        InputStream m17922j = m17922j(c4362w);
        if (m17922j != null) {
            return new AbstractC4364y.a(m17922j, C4359t.e.DISK);
        }
        return null;
    }
}
