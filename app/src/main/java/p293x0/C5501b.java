package p293x0;

import android.database.Cursor;
import android.widget.Filter;

/* renamed from: x0.b */
/* loaded from: classes.dex */
class C5501b extends Filter {

    /* renamed from: a */
    a f20528a;

    /* renamed from: x0.b$a */
    /* loaded from: classes.dex */
    interface a {
        /* renamed from: a */
        void mo1301a(Cursor cursor);

        /* renamed from: b */
        Cursor mo20234b();

        /* renamed from: c */
        CharSequence mo1302c(Cursor cursor);

        /* renamed from: d */
        Cursor mo1303d(CharSequence charSequence);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5501b(a aVar) {
        this.f20528a = aVar;
    }

    @Override // android.widget.Filter
    public CharSequence convertResultToString(Object obj) {
        return this.f20528a.mo1302c((Cursor) obj);
    }

    @Override // android.widget.Filter
    protected Filter.FilterResults performFiltering(CharSequence charSequence) {
        Cursor mo1303d = this.f20528a.mo1303d(charSequence);
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (mo1303d != null) {
            filterResults.count = mo1303d.getCount();
            filterResults.values = mo1303d;
        } else {
            filterResults.count = 0;
            filterResults.values = null;
        }
        return filterResults;
    }

    @Override // android.widget.Filter
    protected void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        Cursor mo20234b = this.f20528a.mo20234b();
        Object obj = filterResults.values;
        if (obj == null || obj == mo20234b) {
            return;
        }
        this.f20528a.mo1301a((Cursor) obj);
    }
}
