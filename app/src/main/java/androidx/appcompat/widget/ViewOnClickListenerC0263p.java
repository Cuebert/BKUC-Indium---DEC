package androidx.appcompat.widget;

import android.R;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.C0587a;
import com.appsflyer.oaid.BuildConfig;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.WeakHashMap;
import p039d.C2948a;
import p039d.C2953f;
import p293x0.AbstractC5502c;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.appcompat.widget.p */
/* loaded from: classes.dex */
public class ViewOnClickListenerC0263p extends AbstractC5502c implements View.OnClickListener {

    /* renamed from: A */
    private final Context f1185A;

    /* renamed from: B */
    private final WeakHashMap<String, Drawable.ConstantState> f1186B;

    /* renamed from: C */
    private final int f1187C;

    /* renamed from: D */
    private boolean f1188D;

    /* renamed from: E */
    private int f1189E;

    /* renamed from: F */
    private ColorStateList f1190F;

    /* renamed from: G */
    private int f1191G;

    /* renamed from: H */
    private int f1192H;

    /* renamed from: I */
    private int f1193I;

    /* renamed from: J */
    private int f1194J;

    /* renamed from: K */
    private int f1195K;

    /* renamed from: L */
    private int f1196L;

    /* renamed from: y */
    private final SearchView f1197y;

    /* renamed from: z */
    private final SearchableInfo f1198z;

    /* renamed from: androidx.appcompat.widget.p$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public final TextView f1199a;

        /* renamed from: b */
        public final TextView f1200b;

        /* renamed from: c */
        public final ImageView f1201c;

        /* renamed from: d */
        public final ImageView f1202d;

        /* renamed from: e */
        public final ImageView f1203e;

        public a(View view) {
            this.f1199a = (TextView) view.findViewById(R.id.text1);
            this.f1200b = (TextView) view.findViewById(R.id.text2);
            this.f1201c = (ImageView) view.findViewById(R.id.icon1);
            this.f1202d = (ImageView) view.findViewById(R.id.icon2);
            this.f1203e = (ImageView) view.findViewById(C2953f.f12284s);
        }
    }

    public ViewOnClickListenerC0263p(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap<String, Drawable.ConstantState> weakHashMap) {
        super(context, searchView.getSuggestionRowLayout(), null, true);
        this.f1188D = false;
        this.f1189E = 1;
        this.f1191G = -1;
        this.f1192H = -1;
        this.f1193I = -1;
        this.f1194J = -1;
        this.f1195K = -1;
        this.f1196L = -1;
        this.f1197y = searchView;
        this.f1198z = searchableInfo;
        this.f1187C = searchView.getSuggestionCommitIconResId();
        this.f1185A = context;
        this.f1186B = weakHashMap;
    }

    /* renamed from: A */
    private void m1286A(String str, Drawable drawable) {
        if (drawable != null) {
            this.f1186B.put(str, drawable.getConstantState());
        }
    }

    /* renamed from: B */
    private void m1287B(Cursor cursor) {
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    /* renamed from: k */
    private Drawable m1288k(String str) {
        Drawable.ConstantState constantState = this.f1186B.get(str);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable();
    }

    /* renamed from: l */
    private CharSequence m1289l(CharSequence charSequence) {
        if (this.f1190F == null) {
            TypedValue typedValue = new TypedValue();
            this.f1185A.getTheme().resolveAttribute(C2948a.f12146O, typedValue, true);
            this.f1190F = this.f1185A.getResources().getColorStateList(typedValue.resourceId);
        }
        SpannableString spannableString = new SpannableString(charSequence);
        spannableString.setSpan(new TextAppearanceSpan(null, 0, 0, this.f1190F, null), 0, charSequence.length(), 33);
        return spannableString;
    }

    /* renamed from: m */
    private Drawable m1290m(ComponentName componentName) {
        PackageManager packageManager = this.f1185A.getPackageManager();
        try {
            ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, 128);
            int iconResource = activityInfo.getIconResource();
            if (iconResource == 0) {
                return null;
            }
            Drawable drawable = packageManager.getDrawable(componentName.getPackageName(), iconResource, activityInfo.applicationInfo);
            if (drawable != null) {
                return drawable;
            }
            Log.w("SuggestionsAdapter", "Invalid icon resource " + iconResource + " for " + componentName.flattenToShortString());
            return null;
        } catch (PackageManager.NameNotFoundException e10) {
            Log.w("SuggestionsAdapter", e10.toString());
            return null;
        }
    }

    /* renamed from: n */
    private Drawable m1291n(ComponentName componentName) {
        String flattenToShortString = componentName.flattenToShortString();
        if (this.f1186B.containsKey(flattenToShortString)) {
            Drawable.ConstantState constantState = this.f1186B.get(flattenToShortString);
            if (constantState == null) {
                return null;
            }
            return constantState.newDrawable(this.f1185A.getResources());
        }
        Drawable m1290m = m1290m(componentName);
        this.f1186B.put(flattenToShortString, m1290m != null ? m1290m.getConstantState() : null);
        return m1290m;
    }

    /* renamed from: o */
    public static String m1292o(Cursor cursor, String str) {
        return m1298w(cursor, cursor.getColumnIndex(str));
    }

    /* renamed from: p */
    private Drawable m1293p() {
        Drawable m1291n = m1291n(this.f1198z.getSearchActivity());
        return m1291n != null ? m1291n : this.f1185A.getPackageManager().getDefaultActivityIcon();
    }

    /* renamed from: q */
    private Drawable m1294q(Uri uri) {
        try {
            if ("android.resource".equals(uri.getScheme())) {
                try {
                    return m1306r(uri);
                } catch (Resources.NotFoundException unused) {
                    throw new FileNotFoundException("Resource does not exist: " + uri);
                }
            }
            InputStream openInputStream = this.f1185A.getContentResolver().openInputStream(uri);
            if (openInputStream != null) {
                try {
                    return Drawable.createFromStream(openInputStream, null);
                } finally {
                    try {
                        openInputStream.close();
                    } catch (IOException e10) {
                        Log.e("SuggestionsAdapter", "Error closing icon stream for " + uri, e10);
                    }
                }
            }
            throw new FileNotFoundException("Failed to open " + uri);
        } catch (FileNotFoundException e11) {
            Log.w("SuggestionsAdapter", "Icon not found: " + uri + ", " + e11.getMessage());
            return null;
        }
        Log.w("SuggestionsAdapter", "Icon not found: " + uri + ", " + e11.getMessage());
        return null;
    }

    /* renamed from: s */
    private Drawable m1295s(String str) {
        if (str == null || str.isEmpty() || "0".equals(str)) {
            return null;
        }
        try {
            int parseInt = Integer.parseInt(str);
            String str2 = "android.resource://" + this.f1185A.getPackageName() + "/" + parseInt;
            Drawable m1288k = m1288k(str2);
            if (m1288k != null) {
                return m1288k;
            }
            Drawable m3031e = C0587a.m3031e(this.f1185A, parseInt);
            m1286A(str2, m3031e);
            return m3031e;
        } catch (Resources.NotFoundException unused) {
            Log.w("SuggestionsAdapter", "Icon resource not found: " + str);
            return null;
        } catch (NumberFormatException unused2) {
            Drawable m1288k2 = m1288k(str);
            if (m1288k2 != null) {
                return m1288k2;
            }
            Drawable m1294q = m1294q(Uri.parse(str));
            m1286A(str, m1294q);
            return m1294q;
        }
    }

    /* renamed from: t */
    private Drawable m1296t(Cursor cursor) {
        int i10 = this.f1194J;
        if (i10 == -1) {
            return null;
        }
        Drawable m1295s = m1295s(cursor.getString(i10));
        return m1295s != null ? m1295s : m1293p();
    }

    /* renamed from: u */
    private Drawable m1297u(Cursor cursor) {
        int i10 = this.f1195K;
        if (i10 == -1) {
            return null;
        }
        return m1295s(cursor.getString(i10));
    }

    /* renamed from: w */
    private static String m1298w(Cursor cursor, int i10) {
        if (i10 == -1) {
            return null;
        }
        try {
            return cursor.getString(i10);
        } catch (Exception e10) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e10);
            return null;
        }
    }

    /* renamed from: y */
    private void m1299y(ImageView imageView, Drawable drawable, int i10) {
        imageView.setImageDrawable(drawable);
        if (drawable == null) {
            imageView.setVisibility(i10);
            return;
        }
        imageView.setVisibility(0);
        drawable.setVisible(false, false);
        drawable.setVisible(true, false);
    }

    /* renamed from: z */
    private void m1300z(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        if (TextUtils.isEmpty(charSequence)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
    }

    @Override // p293x0.AbstractC5500a, p293x0.C5501b.a
    /* renamed from: a */
    public void mo1301a(Cursor cursor) {
        if (this.f1188D) {
            Log.w("SuggestionsAdapter", "Tried to change cursor after adapter was closed.");
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        try {
            super.mo1301a(cursor);
            if (cursor != null) {
                this.f1191G = cursor.getColumnIndex("suggest_text_1");
                this.f1192H = cursor.getColumnIndex("suggest_text_2");
                this.f1193I = cursor.getColumnIndex("suggest_text_2_url");
                this.f1194J = cursor.getColumnIndex("suggest_icon_1");
                this.f1195K = cursor.getColumnIndex("suggest_icon_2");
                this.f1196L = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e10) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e10);
        }
    }

    @Override // p293x0.AbstractC5500a, p293x0.C5501b.a
    /* renamed from: c */
    public CharSequence mo1302c(Cursor cursor) {
        String m1292o;
        String m1292o2;
        if (cursor == null) {
            return null;
        }
        String m1292o3 = m1292o(cursor, "suggest_intent_query");
        if (m1292o3 != null) {
            return m1292o3;
        }
        if (this.f1198z.shouldRewriteQueryFromData() && (m1292o2 = m1292o(cursor, "suggest_intent_data")) != null) {
            return m1292o2;
        }
        if (!this.f1198z.shouldRewriteQueryFromText() || (m1292o = m1292o(cursor, "suggest_text_1")) == null) {
            return null;
        }
        return m1292o;
    }

    @Override // p293x0.C5501b.a
    /* renamed from: d */
    public Cursor mo1303d(CharSequence charSequence) {
        String charSequence2 = charSequence == null ? BuildConfig.FLAVOR : charSequence.toString();
        if (this.f1197y.getVisibility() == 0 && this.f1197y.getWindowVisibility() == 0) {
            try {
                Cursor m1307v = m1307v(this.f1198z, charSequence2, 50);
                if (m1307v != null) {
                    m1307v.getCount();
                    return m1307v;
                }
            } catch (RuntimeException e10) {
                Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", e10);
            }
        }
        return null;
    }

    @Override // p293x0.AbstractC5500a
    /* renamed from: e */
    public void mo1304e(View view, Context context, Cursor cursor) {
        CharSequence m1298w;
        a aVar = (a) view.getTag();
        int i10 = this.f1196L;
        int i11 = i10 != -1 ? cursor.getInt(i10) : 0;
        if (aVar.f1199a != null) {
            m1300z(aVar.f1199a, m1298w(cursor, this.f1191G));
        }
        if (aVar.f1200b != null) {
            String m1298w2 = m1298w(cursor, this.f1193I);
            if (m1298w2 != null) {
                m1298w = m1289l(m1298w2);
            } else {
                m1298w = m1298w(cursor, this.f1192H);
            }
            if (TextUtils.isEmpty(m1298w)) {
                TextView textView = aVar.f1199a;
                if (textView != null) {
                    textView.setSingleLine(false);
                    aVar.f1199a.setMaxLines(2);
                }
            } else {
                TextView textView2 = aVar.f1199a;
                if (textView2 != null) {
                    textView2.setSingleLine(true);
                    aVar.f1199a.setMaxLines(1);
                }
            }
            m1300z(aVar.f1200b, m1298w);
        }
        ImageView imageView = aVar.f1201c;
        if (imageView != null) {
            m1299y(imageView, m1296t(cursor), 4);
        }
        ImageView imageView2 = aVar.f1202d;
        if (imageView2 != null) {
            m1299y(imageView2, m1297u(cursor), 8);
        }
        int i12 = this.f1189E;
        if (i12 != 2 && (i12 != 1 || (i11 & 1) == 0)) {
            aVar.f1203e.setVisibility(8);
            return;
        }
        aVar.f1203e.setVisibility(0);
        aVar.f1203e.setTag(aVar.f1199a.getText());
        aVar.f1203e.setOnClickListener(this);
    }

    @Override // p293x0.AbstractC5500a, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i10, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i10, view, viewGroup);
        } catch (RuntimeException e10) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e10);
            View mo20236g = mo20236g(this.f1185A, mo20234b(), viewGroup);
            if (mo20236g != null) {
                ((a) mo20236g.getTag()).f1199a.setText(e10.toString());
            }
            return mo20236g;
        }
    }

    @Override // p293x0.AbstractC5500a, android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i10, view, viewGroup);
        } catch (RuntimeException e10) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e10);
            View mo1305h = mo1305h(this.f1185A, mo20234b(), viewGroup);
            if (mo1305h != null) {
                ((a) mo1305h.getTag()).f1199a.setText(e10.toString());
            }
            return mo1305h;
        }
    }

    @Override // p293x0.AbstractC5502c, p293x0.AbstractC5500a
    /* renamed from: h */
    public View mo1305h(Context context, Cursor cursor, ViewGroup viewGroup) {
        View mo1305h = super.mo1305h(context, cursor, viewGroup);
        mo1305h.setTag(new a(mo1305h));
        ((ImageView) mo1305h.findViewById(C2953f.f12284s)).setImageResource(this.f1187C);
        return mo1305h;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return false;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        m1287B(mo20234b());
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        m1287B(mo20234b());
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f1197y.onQueryRefine((CharSequence) tag);
        }
    }

    /* renamed from: r */
    Drawable m1306r(Uri uri) throws FileNotFoundException {
        int parseInt;
        String authority = uri.getAuthority();
        if (!TextUtils.isEmpty(authority)) {
            try {
                Resources resourcesForApplication = this.f1185A.getPackageManager().getResourcesForApplication(authority);
                List<String> pathSegments = uri.getPathSegments();
                if (pathSegments != null) {
                    int size = pathSegments.size();
                    if (size == 1) {
                        try {
                            parseInt = Integer.parseInt(pathSegments.get(0));
                        } catch (NumberFormatException unused) {
                            throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                        }
                    } else if (size == 2) {
                        parseInt = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
                    } else {
                        throw new FileNotFoundException("More than two path segments: " + uri);
                    }
                    if (parseInt != 0) {
                        return resourcesForApplication.getDrawable(parseInt);
                    }
                    throw new FileNotFoundException("No resource found for: " + uri);
                }
                throw new FileNotFoundException("No path: " + uri);
            } catch (PackageManager.NameNotFoundException unused2) {
                throw new FileNotFoundException("No package found for authority: " + uri);
            }
        }
        throw new FileNotFoundException("No authority: " + uri);
    }

    /* renamed from: v */
    Cursor m1307v(SearchableInfo searchableInfo, String str, int i10) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder fragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query(BuildConfig.FLAVOR).fragment(BuildConfig.FLAVOR);
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            fragment.appendEncodedPath(suggestPath);
        }
        fragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            fragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        if (i10 > 0) {
            fragment.appendQueryParameter("limit", String.valueOf(i10));
        }
        return this.f1185A.getContentResolver().query(fragment.build(), null, suggestSelection, strArr2, null);
    }

    /* renamed from: x */
    public void m1308x(int i10) {
        this.f1189E = i10;
    }
}
