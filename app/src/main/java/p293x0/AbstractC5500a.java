package p293x0;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import p293x0.C5501b;

/* renamed from: x0.a */
/* loaded from: classes.dex */
public abstract class AbstractC5500a extends BaseAdapter implements Filterable, C5501b.a {

    /* renamed from: n */
    protected boolean f20518n;

    /* renamed from: o */
    protected boolean f20519o;

    /* renamed from: p */
    protected Cursor f20520p;

    /* renamed from: q */
    protected Context f20521q;

    /* renamed from: r */
    protected int f20522r;

    /* renamed from: s */
    protected a f20523s;

    /* renamed from: t */
    protected DataSetObserver f20524t;

    /* renamed from: u */
    protected C5501b f20525u;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x0.a$a */
    /* loaded from: classes.dex */
    public class a extends ContentObserver {
        a() {
            super(new Handler());
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z10) {
            AbstractC5500a.this.m20237i();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x0.a$b */
    /* loaded from: classes.dex */
    public class b extends DataSetObserver {
        b() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            AbstractC5500a abstractC5500a = AbstractC5500a.this;
            abstractC5500a.f20518n = true;
            abstractC5500a.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            AbstractC5500a abstractC5500a = AbstractC5500a.this;
            abstractC5500a.f20518n = false;
            abstractC5500a.notifyDataSetInvalidated();
        }
    }

    public AbstractC5500a(Context context, Cursor cursor, boolean z10) {
        m20235f(context, cursor, z10 ? 1 : 2);
    }

    /* renamed from: a */
    public void mo1301a(Cursor cursor) {
        Cursor m20238j = m20238j(cursor);
        if (m20238j != null) {
            m20238j.close();
        }
    }

    @Override // p293x0.C5501b.a
    /* renamed from: b */
    public Cursor mo20234b() {
        return this.f20520p;
    }

    /* renamed from: c */
    public abstract CharSequence mo1302c(Cursor cursor);

    /* renamed from: e */
    public abstract void mo1304e(View view, Context context, Cursor cursor);

    /* renamed from: f */
    void m20235f(Context context, Cursor cursor, int i10) {
        if ((i10 & 1) == 1) {
            i10 |= 2;
            this.f20519o = true;
        } else {
            this.f20519o = false;
        }
        boolean z10 = cursor != null;
        this.f20520p = cursor;
        this.f20518n = z10;
        this.f20521q = context;
        this.f20522r = z10 ? cursor.getColumnIndexOrThrow("_id") : -1;
        if ((i10 & 2) == 2) {
            this.f20523s = new a();
            this.f20524t = new b();
        } else {
            this.f20523s = null;
            this.f20524t = null;
        }
        if (z10) {
            a aVar = this.f20523s;
            if (aVar != null) {
                cursor.registerContentObserver(aVar);
            }
            DataSetObserver dataSetObserver = this.f20524t;
            if (dataSetObserver != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    /* renamed from: g */
    public abstract View mo20236g(Context context, Cursor cursor, ViewGroup viewGroup);

    @Override // android.widget.Adapter
    public int getCount() {
        Cursor cursor;
        if (!this.f20518n || (cursor = this.f20520p) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i10, View view, ViewGroup viewGroup) {
        if (!this.f20518n) {
            return null;
        }
        this.f20520p.moveToPosition(i10);
        if (view == null) {
            view = mo20236g(this.f20521q, this.f20520p, viewGroup);
        }
        mo1304e(view, this.f20521q, this.f20520p);
        return view;
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        if (this.f20525u == null) {
            this.f20525u = new C5501b(this);
        }
        return this.f20525u;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i10) {
        Cursor cursor;
        if (!this.f20518n || (cursor = this.f20520p) == null) {
            return null;
        }
        cursor.moveToPosition(i10);
        return this.f20520p;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        Cursor cursor;
        if (this.f20518n && (cursor = this.f20520p) != null && cursor.moveToPosition(i10)) {
            return this.f20520p.getLong(this.f20522r);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        if (this.f20518n) {
            if (this.f20520p.moveToPosition(i10)) {
                if (view == null) {
                    view = mo1305h(this.f20521q, this.f20520p, viewGroup);
                }
                mo1304e(view, this.f20521q, this.f20520p);
                return view;
            }
            throw new IllegalStateException("couldn't move cursor to position " + i10);
        }
        throw new IllegalStateException("this should only be called when the cursor is valid");
    }

    /* renamed from: h */
    public abstract View mo1305h(Context context, Cursor cursor, ViewGroup viewGroup);

    /* renamed from: i */
    protected void m20237i() {
        Cursor cursor;
        if (!this.f20519o || (cursor = this.f20520p) == null || cursor.isClosed()) {
            return;
        }
        this.f20518n = this.f20520p.requery();
    }

    /* renamed from: j */
    public Cursor m20238j(Cursor cursor) {
        Cursor cursor2 = this.f20520p;
        if (cursor == cursor2) {
            return null;
        }
        if (cursor2 != null) {
            a aVar = this.f20523s;
            if (aVar != null) {
                cursor2.unregisterContentObserver(aVar);
            }
            DataSetObserver dataSetObserver = this.f20524t;
            if (dataSetObserver != null) {
                cursor2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f20520p = cursor;
        if (cursor != null) {
            a aVar2 = this.f20523s;
            if (aVar2 != null) {
                cursor.registerContentObserver(aVar2);
            }
            DataSetObserver dataSetObserver2 = this.f20524t;
            if (dataSetObserver2 != null) {
                cursor.registerDataSetObserver(dataSetObserver2);
            }
            this.f20522r = cursor.getColumnIndexOrThrow("_id");
            this.f20518n = true;
            notifyDataSetChanged();
        } else {
            this.f20522r = -1;
            this.f20518n = false;
            notifyDataSetInvalidated();
        }
        return cursor2;
    }
}
