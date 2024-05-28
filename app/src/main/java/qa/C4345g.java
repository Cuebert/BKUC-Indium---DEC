package qa;

import android.content.Context;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import qa.AbstractC4364y;
import qa.C4359t;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: qa.g */
/* loaded from: classes.dex */
public class C4345g extends AbstractC4364y {

    /* renamed from: a */
    final Context f17671a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4345g(Context context) {
        this.f17671a = context;
    }

    @Override // qa.AbstractC4364y
    /* renamed from: c */
    public boolean mo17891c(C4362w c4362w) {
        return "content".equals(c4362w.f17789d.getScheme());
    }

    @Override // qa.AbstractC4364y
    /* renamed from: f */
    public AbstractC4364y.a mo17892f(C4362w c4362w, int i10) throws IOException {
        return new AbstractC4364y.a(m17929j(c4362w), C4359t.e.DISK);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public InputStream m17929j(C4362w c4362w) throws FileNotFoundException {
        return this.f17671a.getContentResolver().openInputStream(c4362w.f17789d);
    }
}
