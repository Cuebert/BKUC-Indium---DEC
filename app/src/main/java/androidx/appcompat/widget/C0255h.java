package androidx.appcompat.widget;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.os.Bundle;
import android.text.Selection;
import android.text.Spannable;
import android.util.Log;
import android.view.DragEvent;
import android.view.View;
import android.view.inputmethod.InputContentInfo;
import android.widget.TextView;
import androidx.core.view.C0666c;
import androidx.core.view.C0690v;
import p219r0.C4416b;
import p219r0.C4417c;

/* renamed from: androidx.appcompat.widget.h */
/* loaded from: classes.dex */
final class C0255h {

    /* renamed from: androidx.appcompat.widget.h$a */
    /* loaded from: classes.dex */
    class a implements C4416b.c {

        /* renamed from: a */
        final /* synthetic */ View f1130a;

        a(View view) {
            this.f1130a = view;
        }

        @Override // p219r0.C4416b.c
        /* renamed from: a */
        public boolean mo1205a(C4417c c4417c, int i10, Bundle bundle) {
            if (Build.VERSION.SDK_INT >= 25 && (i10 & 1) != 0) {
                try {
                    c4417c.m18208d();
                    InputContentInfo inputContentInfo = (InputContentInfo) c4417c.m18209e();
                    bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                    bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", inputContentInfo);
                } catch (Exception e10) {
                    Log.w("ReceiveContent", "Can't insert content from IME; requestPermission() failed", e10);
                    return false;
                }
            }
            return C0690v.m3833g0(this.f1130a, new C0666c.a(new ClipData(c4417c.m18206b(), new ClipData.Item(c4417c.m18205a())), 2).m3621d(c4417c.m18207c()).m3619b(bundle).m3618a()) == null;
        }
    }

    /* renamed from: androidx.appcompat.widget.h$b */
    /* loaded from: classes.dex */
    private static final class b {
        /* renamed from: a */
        static boolean m1206a(DragEvent dragEvent, TextView textView, Activity activity) {
            activity.requestDragAndDropPermissions(dragEvent);
            int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
            textView.beginBatchEdit();
            try {
                Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
                C0690v.m3833g0(textView, new C0666c.a(dragEvent.getClipData(), 3).m3618a());
                textView.endBatchEdit();
                return true;
            } catch (Throwable th) {
                textView.endBatchEdit();
                throw th;
            }
        }

        /* renamed from: b */
        static boolean m1207b(DragEvent dragEvent, View view, Activity activity) {
            activity.requestDragAndDropPermissions(dragEvent);
            C0690v.m3833g0(view, new C0666c.a(dragEvent.getClipData(), 3).m3618a());
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C4416b.c m1201a(View view) {
        return new a(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static boolean m1202b(View view, DragEvent dragEvent) {
        if (Build.VERSION.SDK_INT >= 24 && dragEvent.getLocalState() == null && C0690v.m3797H(view) != null) {
            Activity m1204d = m1204d(view);
            if (m1204d == null) {
                Log.i("ReceiveContent", "Can't handle drop: no activity: view=" + view);
                return false;
            }
            if (dragEvent.getAction() == 1) {
                return !(view instanceof TextView);
            }
            if (dragEvent.getAction() == 3) {
                if (view instanceof TextView) {
                    return b.m1206a(dragEvent, (TextView) view, m1204d);
                }
                return b.m1207b(dragEvent, view, m1204d);
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static boolean m1203c(TextView textView, int i10) {
        if ((i10 != 16908322 && i10 != 16908337) || C0690v.m3797H(textView) == null) {
            return false;
        }
        ClipboardManager clipboardManager = (ClipboardManager) textView.getContext().getSystemService("clipboard");
        ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            C0690v.m3833g0(textView, new C0666c.a(primaryClip, 1).m3620c(i10 != 16908322 ? 1 : 0).m3618a());
        }
        return true;
    }

    /* renamed from: d */
    static Activity m1204d(View view) {
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }
}
