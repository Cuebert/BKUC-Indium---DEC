package androidx.appcompat.widget;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.C0168e;
import androidx.appcompat.view.menu.C0172i;
import p039d.C2948a;
import p120j.C3588g;
import p133k.InterfaceC3703e;

/* loaded from: classes.dex */
public class PopupMenu {
    private final View mAnchor;
    private final Context mContext;
    private View.OnTouchListener mDragListener;
    private final C0168e mMenu;
    OnMenuItemClickListener mMenuItemClickListener;
    OnDismissListener mOnDismissListener;
    final C0172i mPopup;

    /* loaded from: classes.dex */
    public interface OnDismissListener {
        void onDismiss(PopupMenu popupMenu);
    }

    /* loaded from: classes.dex */
    public interface OnMenuItemClickListener {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    /* renamed from: androidx.appcompat.widget.PopupMenu$a */
    /* loaded from: classes.dex */
    class C0211a implements C0168e.a {
        C0211a() {
        }

        @Override // androidx.appcompat.view.menu.C0168e.a
        /* renamed from: a */
        public boolean mo807a(C0168e c0168e, MenuItem menuItem) {
            OnMenuItemClickListener onMenuItemClickListener = PopupMenu.this.mMenuItemClickListener;
            if (onMenuItemClickListener != null) {
                return onMenuItemClickListener.onMenuItemClick(menuItem);
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.C0168e.a
        /* renamed from: b */
        public void mo809b(C0168e c0168e) {
        }
    }

    /* renamed from: androidx.appcompat.widget.PopupMenu$b */
    /* loaded from: classes.dex */
    class C0212b implements PopupWindow.OnDismissListener {
        C0212b() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            PopupMenu popupMenu = PopupMenu.this;
            OnDismissListener onDismissListener = popupMenu.mOnDismissListener;
            if (onDismissListener != null) {
                onDismissListener.onDismiss(popupMenu);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.PopupMenu$c */
    /* loaded from: classes.dex */
    class C0213c extends ForwardingListener {
        C0213c(View view) {
            super(view);
        }

        @Override // androidx.appcompat.widget.ForwardingListener
        public InterfaceC3703e getPopup() {
            return PopupMenu.this.mPopup.m1070e();
        }

        @Override // androidx.appcompat.widget.ForwardingListener
        protected boolean onForwardingStarted() {
            PopupMenu.this.show();
            return true;
        }

        @Override // androidx.appcompat.widget.ForwardingListener
        protected boolean onForwardingStopped() {
            PopupMenu.this.dismiss();
            return true;
        }
    }

    public PopupMenu(Context context, View view) {
        this(context, view, 0);
    }

    public void dismiss() {
        this.mPopup.m1067b();
    }

    public View.OnTouchListener getDragToOpenListener() {
        if (this.mDragListener == null) {
            this.mDragListener = new C0213c(this.mAnchor);
        }
        return this.mDragListener;
    }

    public int getGravity() {
        return this.mPopup.m1068c();
    }

    public Menu getMenu() {
        return this.mMenu;
    }

    public MenuInflater getMenuInflater() {
        return new C3588g(this.mContext);
    }

    ListView getMenuListView() {
        if (this.mPopup.m1071f()) {
            return this.mPopup.m1069d();
        }
        return null;
    }

    public void inflate(int i10) {
        getMenuInflater().inflate(i10, this.mMenu);
    }

    public void setGravity(int i10) {
        this.mPopup.m1075j(i10);
    }

    public void setOnDismissListener(OnDismissListener onDismissListener) {
        this.mOnDismissListener = onDismissListener;
    }

    public void setOnMenuItemClickListener(OnMenuItemClickListener onMenuItemClickListener) {
        this.mMenuItemClickListener = onMenuItemClickListener;
    }

    public void show() {
        this.mPopup.m1078m();
    }

    public PopupMenu(Context context, View view, int i10) {
        this(context, view, i10, C2948a.f12139H, 0);
    }

    public PopupMenu(Context context, View view, int i10, int i11, int i12) {
        this.mContext = context;
        this.mAnchor = view;
        C0168e c0168e = new C0168e(context);
        this.mMenu = c0168e;
        c0168e.mo997R(new C0211a());
        C0172i c0172i = new C0172i(context, c0168e, view, false, i11, i12);
        this.mPopup = c0172i;
        c0172i.m1075j(i10);
        c0172i.m1076k(new C0212b());
    }
}
