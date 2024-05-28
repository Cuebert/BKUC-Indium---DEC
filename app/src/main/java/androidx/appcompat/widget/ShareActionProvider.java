package androidx.appcompat.widget;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.TypedValue;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.widget.ActivityChooserModel;
import androidx.core.view.AbstractC0664b;
import p039d.C2948a;
import p039d.C2955h;
import p066f.C3121a;

/* loaded from: classes.dex */
public class ShareActionProvider extends AbstractC0664b {
    private static final int DEFAULT_INITIAL_ACTIVITY_COUNT = 4;
    public static final String DEFAULT_SHARE_HISTORY_FILE_NAME = "share_history.xml";
    final Context mContext;
    private int mMaxShownActivityCount;
    private ActivityChooserModel.OnChooseActivityListener mOnChooseActivityListener;
    private final MenuItemOnMenuItemClickListenerC0239b mOnMenuItemClickListener;
    OnShareTargetSelectedListener mOnShareTargetSelectedListener;
    String mShareHistoryFileName;

    /* loaded from: classes.dex */
    public interface OnShareTargetSelectedListener {
        boolean onShareTargetSelected(ShareActionProvider shareActionProvider, Intent intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.ShareActionProvider$a */
    /* loaded from: classes.dex */
    public class C0238a implements ActivityChooserModel.OnChooseActivityListener {
        C0238a() {
        }

        @Override // androidx.appcompat.widget.ActivityChooserModel.OnChooseActivityListener
        public boolean onChooseActivity(ActivityChooserModel activityChooserModel, Intent intent) {
            ShareActionProvider shareActionProvider = ShareActionProvider.this;
            OnShareTargetSelectedListener onShareTargetSelectedListener = shareActionProvider.mOnShareTargetSelectedListener;
            if (onShareTargetSelectedListener == null) {
                return false;
            }
            onShareTargetSelectedListener.onShareTargetSelected(shareActionProvider, intent);
            return false;
        }
    }

    /* renamed from: androidx.appcompat.widget.ShareActionProvider$b */
    /* loaded from: classes.dex */
    private class MenuItemOnMenuItemClickListenerC0239b implements MenuItem.OnMenuItemClickListener {
        MenuItemOnMenuItemClickListenerC0239b() {
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            ShareActionProvider shareActionProvider = ShareActionProvider.this;
            Intent m1092b = ActivityChooserModel.m1085d(shareActionProvider.mContext, shareActionProvider.mShareHistoryFileName).m1092b(menuItem.getItemId());
            if (m1092b == null) {
                return true;
            }
            String action = m1092b.getAction();
            if ("android.intent.action.SEND".equals(action) || "android.intent.action.SEND_MULTIPLE".equals(action)) {
                ShareActionProvider.this.updateIntent(m1092b);
            }
            ShareActionProvider.this.mContext.startActivity(m1092b);
            return true;
        }
    }

    public ShareActionProvider(Context context) {
        super(context);
        this.mMaxShownActivityCount = 4;
        this.mOnMenuItemClickListener = new MenuItemOnMenuItemClickListenerC0239b();
        this.mShareHistoryFileName = DEFAULT_SHARE_HISTORY_FILE_NAME;
        this.mContext = context;
    }

    private void setActivityChooserPolicyIfNeeded() {
        if (this.mOnShareTargetSelectedListener == null) {
            return;
        }
        if (this.mOnChooseActivityListener == null) {
            this.mOnChooseActivityListener = new C0238a();
        }
        ActivityChooserModel.m1085d(this.mContext, this.mShareHistoryFileName).m1100q(this.mOnChooseActivityListener);
    }

    @Override // androidx.core.view.AbstractC0664b
    public boolean hasSubMenu() {
        return true;
    }

    @Override // androidx.core.view.AbstractC0664b
    public View onCreateActionView() {
        ActivityChooserView activityChooserView = new ActivityChooserView(this.mContext);
        if (!activityChooserView.isInEditMode()) {
            activityChooserView.setActivityChooserModel(ActivityChooserModel.m1085d(this.mContext, this.mShareHistoryFileName));
        }
        TypedValue typedValue = new TypedValue();
        this.mContext.getTheme().resolveAttribute(C2948a.f12159k, typedValue, true);
        activityChooserView.setExpandActivityOverflowButtonDrawable(C3121a.m13770d(this.mContext, typedValue.resourceId));
        activityChooserView.setProvider(this);
        activityChooserView.setDefaultActionButtonContentDescription(C2955h.f12331r);
        activityChooserView.setExpandActivityOverflowButtonContentDescription(C2955h.f12330q);
        return activityChooserView;
    }

    @Override // androidx.core.view.AbstractC0664b
    public void onPrepareSubMenu(SubMenu subMenu) {
        subMenu.clear();
        ActivityChooserModel m1085d = ActivityChooserModel.m1085d(this.mContext, this.mShareHistoryFileName);
        PackageManager packageManager = this.mContext.getPackageManager();
        int m1094f = m1085d.m1094f();
        int min = Math.min(m1094f, this.mMaxShownActivityCount);
        for (int i10 = 0; i10 < min; i10++) {
            ResolveInfo m1093e = m1085d.m1093e(i10);
            subMenu.add(0, i10, i10, m1093e.loadLabel(packageManager)).setIcon(m1093e.loadIcon(packageManager)).setOnMenuItemClickListener(this.mOnMenuItemClickListener);
        }
        if (min < m1094f) {
            SubMenu addSubMenu = subMenu.addSubMenu(0, min, min, this.mContext.getString(C2955h.f12315b));
            for (int i11 = 0; i11 < m1094f; i11++) {
                ResolveInfo m1093e2 = m1085d.m1093e(i11);
                addSubMenu.add(0, i11, i11, m1093e2.loadLabel(packageManager)).setIcon(m1093e2.loadIcon(packageManager)).setOnMenuItemClickListener(this.mOnMenuItemClickListener);
            }
        }
    }

    public void setOnShareTargetSelectedListener(OnShareTargetSelectedListener onShareTargetSelectedListener) {
        this.mOnShareTargetSelectedListener = onShareTargetSelectedListener;
        setActivityChooserPolicyIfNeeded();
    }

    public void setShareHistoryFileName(String str) {
        this.mShareHistoryFileName = str;
        setActivityChooserPolicyIfNeeded();
    }

    public void setShareIntent(Intent intent) {
        if (intent != null) {
            String action = intent.getAction();
            if ("android.intent.action.SEND".equals(action) || "android.intent.action.SEND_MULTIPLE".equals(action)) {
                updateIntent(intent);
            }
        }
        ActivityChooserModel.m1085d(this.mContext, this.mShareHistoryFileName).m1099p(intent);
    }

    void updateIntent(Intent intent) {
        intent.addFlags(134742016);
    }
}
