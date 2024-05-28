.class public Lcom/roblox/client/z0;
.super Landroidx/fragment/app/Fragment;
.source "SourceFile"

# interfaces
.implements Landroidx/swiperefreshlayout/widget/c$j;
.implements Ly8/e$b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/roblox/client/z0$h;,
        Lcom/roblox/client/z0$f;,
        Lcom/roblox/client/z0$g;
    }
.end annotation


# instance fields
.field protected A0:Landroid/webkit/ValueCallback;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/webkit/ValueCallback<",
            "[",
            "Landroid/net/Uri;",
            ">;"
        }
    .end annotation
.end field

.field private B0:Z

.field private C0:Z

.field protected D0:Z

.field private E0:Lcom/roblox/client/app/b;

.field private F0:Lo7/b;

.field private G0:Ly8/e;

.field final H0:Le8/g;

.field final I0:Le8/g;

.field private final J0:Le8/g;

.field private o0:Landroid/widget/TextView;

.field protected p0:Lcom/roblox/client/hybrid/RBHybridWebView;

.field private q0:Landroidx/swiperefreshlayout/widget/c;

.field protected r0:Ljava/lang/String;

.field private s0:I

.field private t0:I

.field protected u0:Ljava/lang/String;

.field private v0:Ljava/lang/String;

.field private w0:Landroid/app/ProgressDialog;

.field protected x0:Landroid/widget/FrameLayout;

.field private y0:Z

.field private z0:Lcom/roblox/client/z0$g;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Landroidx/fragment/app/Fragment;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lcom/roblox/client/z0;->o0:Landroid/widget/TextView;

    .line 3
    iput-object v0, p0, Lcom/roblox/client/z0;->p0:Lcom/roblox/client/hybrid/RBHybridWebView;

    .line 4
    iput-object v0, p0, Lcom/roblox/client/z0;->q0:Landroidx/swiperefreshlayout/widget/c;

    .line 5
    iput-object v0, p0, Lcom/roblox/client/z0;->r0:Ljava/lang/String;

    const/4 v1, 0x0

    .line 6
    iput v1, p0, Lcom/roblox/client/z0;->s0:I

    .line 7
    iput v1, p0, Lcom/roblox/client/z0;->t0:I

    .line 8
    iput-object v0, p0, Lcom/roblox/client/z0;->u0:Ljava/lang/String;

    .line 9
    iput-boolean v1, p0, Lcom/roblox/client/z0;->B0:Z

    .line 10
    iput-boolean v1, p0, Lcom/roblox/client/z0;->C0:Z

    const/4 v0, 0x1

    .line 11
    iput-boolean v0, p0, Lcom/roblox/client/z0;->D0:Z

    .line 12
    new-instance v0, Lcom/roblox/client/z0$b;

    invoke-direct {v0, p0}, Lcom/roblox/client/z0$b;-><init>(Lcom/roblox/client/z0;)V

    iput-object v0, p0, Lcom/roblox/client/z0;->H0:Le8/g;

    .line 13
    new-instance v0, Lcom/roblox/client/z0$c;

    invoke-direct {v0, p0}, Lcom/roblox/client/z0$c;-><init>(Lcom/roblox/client/z0;)V

    iput-object v0, p0, Lcom/roblox/client/z0;->I0:Le8/g;

    .line 14
    new-instance v0, Lcom/roblox/client/z0$d;

    invoke-direct {v0, p0}, Lcom/roblox/client/z0$d;-><init>(Lcom/roblox/client/z0;)V

    iput-object v0, p0, Lcom/roblox/client/z0;->J0:Le8/g;

    return-void
.end method

.method private D2(Ljava/lang/String;Z)V
    .locals 1

    const-string v0, "sponsored"

    .line 1
    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 2
    iget-object p1, p0, Lcom/roblox/client/z0;->p0:Lcom/roblox/client/hybrid/RBHybridWebView;

    invoke-virtual {p1}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object p1

    invoke-virtual {p1, p2}, Landroid/webkit/WebSettings;->setBuiltInZoomControls(Z)V

    goto :goto_0

    .line 3
    :cond_0
    iget-object p1, p0, Lcom/roblox/client/z0;->p0:Lcom/roblox/client/hybrid/RBHybridWebView;

    invoke-virtual {p1}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object p1

    xor-int/lit8 p2, p2, 0x1

    invoke-virtual {p1, p2}, Landroid/webkit/WebSettings;->setBuiltInZoomControls(Z)V

    :goto_0
    return-void
.end method

.method private E2()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->p()Landroidx/fragment/app/d;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    new-instance v1, Lcom/roblox/client/w0;

    invoke-direct {v1, p0, v0}, Lcom/roblox/client/w0;-><init>(Lcom/roblox/client/z0;Landroidx/fragment/app/d;)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method

.method private F2(Le8/h;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->p()Landroidx/fragment/app/d;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v1, 0x0

    .line 2
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object v2

    invoke-interface {v2}, Lc7/e;->s0()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 3
    move-object v1, p1

    check-cast v1, Le8/c;

    .line 4
    invoke-interface {v1}, Le8/c;->a()Ljava/lang/CharSequence;

    move-result-object v1

    .line 5
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object v2

    invoke-interface {v2}, Lc7/e;->m()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    .line 6
    :cond_1
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "isBonusItemEnabled = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "rbx.web"

    invoke-static {v3, v2}, Lc9/k;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 7
    invoke-virtual {p1, v0}, Le8/h;->b(Landroid/content/Context;)Ljava/lang/CharSequence;

    move-result-object v0

    .line 8
    invoke-virtual {p1}, Le8/h;->e()Z

    move-result p1

    if-eqz p1, :cond_2

    .line 9
    invoke-direct {p0, v0}, Lcom/roblox/client/z0;->l2(Ljava/lang/CharSequence;)V

    goto :goto_0

    :cond_2
    if-eqz v1, :cond_3

    .line 10
    :try_start_0
    sget p1, Lcom/roblox/client/c0;->t4:I

    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->Y(I)Ljava/lang/String;

    move-result-object p1

    .line 11
    sget v0, Lcom/roblox/client/c0;->s4:I

    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->Y(I)Ljava/lang/String;

    move-result-object v0

    .line 12
    invoke-virtual {p0}, Lcom/roblox/client/z0;->o2()Lcom/roblox/client/i0;

    move-result-object v1

    invoke-virtual {v1, v0, p1}, Lcom/roblox/client/k0;->V0(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 13
    :cond_3
    invoke-virtual {p0}, Lcom/roblox/client/z0;->o2()Lcom/roblox/client/i0;

    move-result-object p1

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/roblox/client/k0;->U0(Ljava/lang/String;)V
    :try_end_0
    .catch Lcom/roblox/client/j0; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 14
    :catch_0
    invoke-static {}, Lcom/roblox/client/z0;->y2()V

    :goto_0
    return-void
.end method

.method public static synthetic X1(Lcom/roblox/client/z0;Landroidx/fragment/app/d;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/roblox/client/z0;->w2(Landroidx/fragment/app/d;)V

    return-void
.end method

.method public static synthetic Y1(Lcom/roblox/client/z0;Landroidx/fragment/app/d;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/roblox/client/z0;->v2(Landroidx/fragment/app/d;)V

    return-void
.end method

.method public static synthetic Z1(Lcom/roblox/client/z0;Landroidx/fragment/app/d;Le8/h;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/roblox/client/z0;->u2(Landroidx/fragment/app/d;Le8/h;)V

    return-void
.end method

.method static synthetic a2(Lcom/roblox/client/z0;)Landroidx/swiperefreshlayout/widget/c;
    .locals 0

    iget-object p0, p0, Lcom/roblox/client/z0;->q0:Landroidx/swiperefreshlayout/widget/c;

    return-object p0
.end method

.method static synthetic b2()V
    .locals 0

    invoke-static {}, Lcom/roblox/client/z0;->y2()V

    return-void
.end method

.method static synthetic c2(Lcom/roblox/client/z0;)V
    .locals 0

    invoke-direct {p0}, Lcom/roblox/client/z0;->s2()V

    return-void
.end method

.method static synthetic d2(Lcom/roblox/client/z0;Ljava/lang/String;)Z
    .locals 0

    invoke-direct {p0, p1}, Lcom/roblox/client/z0;->r2(Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method static synthetic e2(Lcom/roblox/client/z0;Ljava/lang/String;)Z
    .locals 0

    invoke-direct {p0, p1}, Lcom/roblox/client/z0;->z2(Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method static synthetic f2(Lcom/roblox/client/z0;)Lcom/roblox/client/z0$g;
    .locals 0

    iget-object p0, p0, Lcom/roblox/client/z0;->z0:Lcom/roblox/client/z0$g;

    return-object p0
.end method

.method static synthetic g2(Lcom/roblox/client/z0;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/roblox/client/z0;->y0:Z

    return p0
.end method

.method static synthetic h2(Lcom/roblox/client/z0;Ljava/lang/String;Z)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/roblox/client/z0;->D2(Ljava/lang/String;Z)V

    return-void
.end method

.method static synthetic i2(Lcom/roblox/client/z0;)Landroid/widget/TextView;
    .locals 0

    iget-object p0, p0, Lcom/roblox/client/z0;->o0:Landroid/widget/TextView;

    return-object p0
.end method

.method static synthetic j2(Lcom/roblox/client/z0;)V
    .locals 0

    invoke-direct {p0}, Lcom/roblox/client/z0;->E2()V

    return-void
.end method

.method private declared-synchronized l2(Ljava/lang/CharSequence;)V
    .locals 12

    monitor-enter p0

    .line 1
    :try_start_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->p()Landroidx/fragment/app/d;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v1, :cond_0

    .line 2
    monitor-exit p0

    return-void

    .line 3
    :cond_0
    :try_start_1
    new-instance v0, Landroidx/appcompat/app/b$a;

    invoke-direct {v0, v1}, Landroidx/appcompat/app/b$a;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Landroidx/appcompat/app/b$a;->a()Landroidx/appcompat/app/b;

    move-result-object v8

    .line 4
    new-instance v6, Landroid/widget/TextView;

    invoke-direct {v6, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 5
    sget v0, Lcom/roblox/client/c0;->r3:I

    invoke-virtual {v1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    .line 6
    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v4

    .line 7
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v0

    add-int v5, v4, v0

    .line 8
    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v9, 0x1

    new-array v7, v9, [Ld9/a;

    const/4 v10, 0x0

    new-instance v11, Ld9/c;

    const/4 v2, 0x0

    move-object v0, v11

    invoke-direct/range {v0 .. v5}, Ld9/c;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;II)V

    aput-object v11, v7, v10

    .line 9
    invoke-static {v6, p1, v7}, Ld9/b;->e(Landroid/widget/TextView;Ljava/lang/String;[Ld9/a;)V

    const/high16 p1, 0x41a00000    # 20.0f

    .line 10
    invoke-virtual {v6, p1}, Landroid/widget/TextView;->setTextSize(F)V

    const/4 p1, 0x0

    .line 11
    invoke-virtual {v6, p1}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    const/16 v4, 0x96

    const/16 v5, 0x64

    const/16 p1, 0x96

    const/16 v7, 0x64

    move-object v2, v8

    move-object v3, v6

    move v6, p1

    .line 12
    invoke-virtual/range {v2 .. v7}, Landroidx/appcompat/app/b;->i(Landroid/view/View;IIII)V

    .line 13
    invoke-virtual {v8, v9}, Landroid/app/Dialog;->setCanceledOnTouchOutside(Z)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 14
    :try_start_2
    invoke-virtual {v8}, Landroid/app/Dialog;->show()V
    :try_end_2
    .catch Landroid/view/WindowManager$BadTokenException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 15
    :catch_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method private m2(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/app/ProgressDialog;
    .locals 1

    .line 1
    new-instance v0, Landroid/app/ProgressDialog;

    invoke-direct {v0, p1}, Landroid/app/ProgressDialog;-><init>(Landroid/content/Context;)V

    .line 2
    invoke-virtual {v0, p2}, Landroid/app/ProgressDialog;->setTitle(Ljava/lang/CharSequence;)V

    .line 3
    invoke-virtual {v0, p3}, Landroid/app/ProgressDialog;->setMessage(Ljava/lang/CharSequence;)V

    const/4 p1, 0x1

    .line 4
    invoke-virtual {v0, p1}, Landroid/app/ProgressDialog;->setIndeterminate(Z)V

    .line 5
    invoke-virtual {v0, p1}, Landroid/app/ProgressDialog;->setCancelable(Z)V

    const/4 p1, 0x0

    .line 6
    invoke-virtual {v0, p1}, Landroid/app/ProgressDialog;->setCanceledOnTouchOutside(Z)V

    const/4 p1, 0x0

    .line 7
    invoke-virtual {v0, p1}, Landroid/app/ProgressDialog;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)V

    return-object v0
.end method

.method private r2(Ljava/lang/String;)Z
    .locals 2

    const-string v0, "mailto:"

    .line 1
    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    new-instance v0, Landroid/content/Intent;

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    const-string v1, "android.intent.action.SENDTO"

    invoke-direct {v0, v1, p1}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    goto :goto_0

    :cond_0
    const-string v0, "tel:"

    .line 3
    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 4
    new-instance v0, Landroid/content/Intent;

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    const-string v1, "android.intent.action.DIAL"

    invoke-direct {v0, v1, p1}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_2

    const/4 p1, 0x0

    return p1

    .line 5
    :cond_2
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->w()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1, v0}, Lc9/l;->a(Landroid/content/Context;Landroid/content/Intent;)Z

    move-result p1

    const/4 v1, 0x1

    if-eqz p1, :cond_3

    .line 6
    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->T1(Landroid/content/Intent;)V

    return v1

    .line 7
    :cond_3
    :try_start_0
    invoke-virtual {p0}, Lcom/roblox/client/z0;->o2()Lcom/roblox/client/i0;

    move-result-object p1

    sget v0, Lcom/roblox/client/c0;->o3:I

    invoke-virtual {p1, v0, v1}, Lcom/roblox/client/k0;->d1(II)V
    :try_end_0
    .catch Lcom/roblox/client/j0; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    .line 8
    :catch_0
    invoke-static {}, Lcom/roblox/client/z0;->y2()V

    :goto_1
    return v1
.end method

.method private s2()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->p()Landroidx/fragment/app/d;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    new-instance v1, Lcom/roblox/client/x0;

    invoke-direct {v1, p0, v0}, Lcom/roblox/client/x0;-><init>(Lcom/roblox/client/z0;Landroidx/fragment/app/d;)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method

.method private synthetic u2(Landroidx/fragment/app/d;Le8/h;)V
    .locals 1

    if-eqz p1, :cond_1

    .line 1
    invoke-virtual {p1}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p1}, Landroid/app/Activity;->isDestroyed()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    invoke-direct {p0}, Lcom/roblox/client/z0;->s2()V

    .line 3
    invoke-direct {p0, p2}, Lcom/roblox/client/z0;->F2(Le8/h;)V

    :cond_1
    :goto_0
    return-void
.end method

.method private synthetic v2(Landroidx/fragment/app/d;)V
    .locals 1

    if-eqz p1, :cond_1

    .line 1
    invoke-virtual {p1}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p1}, Landroid/app/Activity;->isDestroyed()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    iget-object p1, p0, Lcom/roblox/client/z0;->w0:Landroid/app/ProgressDialog;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Landroid/app/ProgressDialog;->isShowing()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 3
    iget-object p1, p0, Lcom/roblox/client/z0;->w0:Landroid/app/ProgressDialog;

    invoke-virtual {p1}, Landroid/app/ProgressDialog;->dismiss()V

    :cond_1
    :goto_0
    return-void
.end method

.method private synthetic w2(Landroidx/fragment/app/d;)V
    .locals 2

    if-eqz p1, :cond_2

    .line 1
    invoke-virtual {p1}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p1}, Landroid/app/Activity;->isDestroyed()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/roblox/client/z0;->w0:Landroid/app/ProgressDialog;

    if-nez v0, :cond_1

    const/4 v0, 0x0

    .line 3
    sget v1, Lcom/roblox/client/c0;->i3:I

    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->Y(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, p1, v0, v1}, Lcom/roblox/client/z0;->m2(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/app/ProgressDialog;

    move-result-object p1

    iput-object p1, p0, Lcom/roblox/client/z0;->w0:Landroid/app/ProgressDialog;

    .line 4
    :cond_1
    iget-object p1, p0, Lcom/roblox/client/z0;->w0:Landroid/app/ProgressDialog;

    invoke-virtual {p1}, Landroid/app/ProgressDialog;->show()V

    :cond_2
    :goto_0
    return-void
.end method

.method private static y2()V
    .locals 2

    const-string v0, "roblox.app"

    const-string v1, "The activity containing this fragment must be of type RobloxActivity!"

    invoke-static {v0, v1}, Lc9/k;->j(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method private z2(Ljava/lang/String;)Z
    .locals 2

    .line 1
    new-instance v0, Lv8/c;

    const-string v1, "rbx.web"

    invoke-direct {v0, v1}, Lv8/c;-><init>(Ljava/lang/String;)V

    .line 2
    invoke-virtual {v0, p1}, Lv8/c;->d(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->p()Landroidx/fragment/app/d;

    move-result-object v1

    invoke-virtual {v0, v1, p1, p1}, Lv8/a;->b(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)V

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method


# virtual methods
.method public A2(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public B2(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public C2(Landroid/webkit/WebView;I)V
    .locals 0

    return-void
.end method

.method public D0(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 5

    .line 1
    sget p3, Lcom/roblox/client/a0;->x:I

    const/4 v0, 0x0

    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p2

    .line 2
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object p3

    invoke-interface {p3}, Lc7/e;->d1()Z

    move-result p3

    if-eqz p3, :cond_0

    .line 3
    new-instance p3, Lo7/b;

    invoke-direct {p3}, Lo7/b;-><init>()V

    iput-object p3, p0, Lcom/roblox/client/z0;->F0:Lo7/b;

    .line 4
    invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p3

    check-cast p3, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 5
    iput v0, p3, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 6
    iget-object p3, p0, Lcom/roblox/client/z0;->F0:Lo7/b;

    invoke-virtual {p3, p1, p0}, Lo7/b;->e(Landroid/view/LayoutInflater;Landroidx/fragment/app/Fragment;)Landroid/view/View;

    move-result-object p1

    .line 7
    iget-object p3, p0, Lcom/roblox/client/z0;->F0:Lo7/b;

    invoke-virtual {p3}, Lo7/b;->c()Landroid/view/ViewGroup;

    move-result-object p3

    .line 8
    invoke-virtual {p3, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    move-object p2, p1

    .line 9
    :cond_0
    sget p1, Lcom/roblox/client/y;->l1:I

    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Landroid/view/ViewGroup;

    .line 10
    sget v1, Lcom/roblox/client/y;->K1:I

    invoke-virtual {p2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, p0, Lcom/roblox/client/z0;->o0:Landroid/widget/TextView;

    .line 11
    new-instance v1, Lcom/roblox/client/z0$h;

    invoke-direct {v1, p0}, Lcom/roblox/client/z0$h;-><init>(Lcom/roblox/client/z0;)V

    .line 12
    invoke-virtual {p0}, Lcom/roblox/client/z0;->n2()Lcom/roblox/client/hybrid/RBHybridWebView;

    move-result-object v2

    iput-object v2, p0, Lcom/roblox/client/z0;->p0:Lcom/roblox/client/hybrid/RBHybridWebView;

    .line 13
    new-instance v3, Landroid/view/ViewGroup$LayoutParams;

    const/4 v4, -0x1

    invoke-direct {v3, v4, v4}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {p3, v2, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 14
    iget-object p3, p0, Lcom/roblox/client/z0;->p0:Lcom/roblox/client/hybrid/RBHybridWebView;

    iget-object v2, p0, Lcom/roblox/client/z0;->v0:Ljava/lang/String;

    invoke-virtual {p3, v2}, Landroid/webkit/WebView;->setTag(Ljava/lang/Object;)V

    .line 15
    iget-object p3, p0, Lcom/roblox/client/z0;->p0:Lcom/roblox/client/hybrid/RBHybridWebView;

    invoke-virtual {p3, v1}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    .line 16
    iget-object p3, p0, Lcom/roblox/client/z0;->p0:Lcom/roblox/client/hybrid/RBHybridWebView;

    invoke-virtual {p3}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object p3

    const/4 v1, 0x1

    invoke-virtual {p3, v1}, Landroid/webkit/WebSettings;->setSupportMultipleWindows(Z)V

    .line 17
    iget-object p3, p0, Lcom/roblox/client/z0;->p0:Lcom/roblox/client/hybrid/RBHybridWebView;

    new-instance v2, Lcom/roblox/client/z0$a;

    invoke-direct {v2, p0}, Lcom/roblox/client/z0$a;-><init>(Lcom/roblox/client/z0;)V

    invoke-virtual {p3, v2}, Landroid/webkit/WebView;->setWebChromeClient(Landroid/webkit/WebChromeClient;)V

    .line 18
    iget-object p3, p0, Lcom/roblox/client/z0;->p0:Lcom/roblox/client/hybrid/RBHybridWebView;

    invoke-virtual {p3}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object p3

    invoke-virtual {p3, v1}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    .line 19
    iget-object p3, p0, Lcom/roblox/client/z0;->p0:Lcom/roblox/client/hybrid/RBHybridWebView;

    invoke-virtual {p3}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object p3

    invoke-static {}, Lcom/roblox/client/p0;->Z0()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p3, v2}, Landroid/webkit/WebSettings;->setUserAgentString(Ljava/lang/String;)V

    .line 20
    iget-object p3, p0, Lcom/roblox/client/z0;->p0:Lcom/roblox/client/hybrid/RBHybridWebView;

    invoke-virtual {p3}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object p3

    invoke-virtual {p3, v4}, Landroid/webkit/WebSettings;->setCacheMode(I)V

    .line 21
    iget-object p3, p0, Lcom/roblox/client/z0;->p0:Lcom/roblox/client/hybrid/RBHybridWebView;

    invoke-virtual {p3, v0}, Landroid/webkit/WebView;->setHorizontalScrollBarEnabled(Z)V

    .line 22
    iget-object p3, p0, Lcom/roblox/client/z0;->p0:Lcom/roblox/client/hybrid/RBHybridWebView;

    invoke-virtual {p3, v0}, Landroid/webkit/WebView;->setVerticalScrollBarEnabled(Z)V

    .line 23
    iget-object p3, p0, Lcom/roblox/client/z0;->p0:Lcom/roblox/client/hybrid/RBHybridWebView;

    invoke-virtual {p3}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object p3

    invoke-virtual {p3}, Landroid/webkit/WebSettings;->getUserAgentString()Ljava/lang/String;

    move-result-object p3

    .line 24
    iget-object v2, p0, Lcom/roblox/client/z0;->p0:Lcom/roblox/client/hybrid/RBHybridWebView;

    invoke-virtual {v2}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Landroid/webkit/WebSettings;->setUserAgentString(Ljava/lang/String;)V

    .line 25
    iget-object v2, p0, Lcom/roblox/client/z0;->p0:Lcom/roblox/client/hybrid/RBHybridWebView;

    invoke-virtual {v2}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v2

    invoke-virtual {v2}, Landroid/webkit/WebSettings;->getUserAgentString()Ljava/lang/String;

    move-result-object v2

    .line 26
    iget-object v4, p0, Lcom/roblox/client/z0;->p0:Lcom/roblox/client/hybrid/RBHybridWebView;

    invoke-virtual {v4}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v4

    invoke-virtual {v4, p3}, Landroid/webkit/WebSettings;->setUserAgentString(Ljava/lang/String;)V

    const-string p3, "Chrome/"

    .line 27
    invoke-virtual {v2, p3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 28
    invoke-static {}, Lx6/b;->a()Z

    move-result p3

    if-eqz p3, :cond_1

    .line 29
    invoke-static {v1}, Landroid/webkit/WebView;->setWebContentsDebuggingEnabled(Z)V

    .line 30
    :cond_1
    iget-object p3, p0, Lcom/roblox/client/z0;->r0:Ljava/lang/String;

    if-eqz p3, :cond_2

    .line 31
    iget-object v2, p0, Lcom/roblox/client/z0;->p0:Lcom/roblox/client/hybrid/RBHybridWebView;

    invoke-virtual {v2, p3}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 32
    iput-object v3, p0, Lcom/roblox/client/z0;->r0:Ljava/lang/String;

    .line 33
    :cond_2
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroidx/swiperefreshlayout/widget/c;

    iput-object p1, p0, Lcom/roblox/client/z0;->q0:Landroidx/swiperefreshlayout/widget/c;

    .line 34
    invoke-virtual {p1, p0}, Landroidx/swiperefreshlayout/widget/c;->setOnRefreshListener(Landroidx/swiperefreshlayout/widget/c$j;)V

    .line 35
    iget-object p1, p0, Lcom/roblox/client/z0;->q0:Landroidx/swiperefreshlayout/widget/c;

    const/4 p3, 0x4

    new-array p3, p3, [I

    sget v2, Lcom/roblox/client/v;->h:I

    aput v2, p3, v0

    aput v2, p3, v1

    const/4 v2, 0x2

    sget v3, Lcom/roblox/client/v;->y:I

    aput v3, p3, v2

    const/4 v2, 0x3

    aput v3, p3, v2

    invoke-virtual {p1, p3}, Landroidx/swiperefreshlayout/widget/c;->setColorSchemeResources([I)V

    .line 36
    sget p1, Lcom/roblox/client/y;->s1:I

    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/FrameLayout;

    iput-object p1, p0, Lcom/roblox/client/z0;->x0:Landroid/widget/FrameLayout;

    .line 37
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->u()Landroid/os/Bundle;

    move-result-object p1

    if-eqz p1, :cond_4

    const-string p3, "dialogHeight"

    .line 38
    invoke-virtual {p1, p3, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result p3

    iput p3, p0, Lcom/roblox/client/z0;->s0:I

    const-string p3, "dialogWidth"

    .line 39
    invoke-virtual {p1, p3, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result p3

    iput p3, p0, Lcom/roblox/client/z0;->t0:I

    const-string p3, "enablePullToRefresh"

    .line 40
    invoke-virtual {p1, p3, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result p3

    if-nez p3, :cond_3

    .line 41
    iget-object p3, p0, Lcom/roblox/client/z0;->q0:Landroidx/swiperefreshlayout/widget/c;

    invoke-virtual {p3, v0}, Landroidx/swiperefreshlayout/widget/c;->setEnabled(Z)V

    :cond_3
    const-string p3, "USING_LOGIN_WEB_URL"

    .line 42
    invoke-virtual {p1, p3, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result p3

    iput-boolean p3, p0, Lcom/roblox/client/z0;->y0:Z

    const-string p3, "VISIBLE"

    .line 43
    invoke-virtual {p1, p3, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result p3

    iput-boolean p3, p0, Lcom/roblox/client/z0;->D0:Z

    const-string p3, "BACK_NAVIGATION_DISABLED"

    .line 44
    invoke-virtual {p1, p3, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result p1

    iput-boolean p1, p0, Lcom/roblox/client/z0;->C0:Z

    .line 45
    :cond_4
    :try_start_0
    invoke-virtual {p0}, Lcom/roblox/client/z0;->o2()Lcom/roblox/client/i0;

    move-result-object p1

    invoke-virtual {p1}, Lcom/roblox/client/i0;->g1()Z
    :try_end_0
    .catch Lcom/roblox/client/j0; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 46
    :catch_0
    invoke-static {}, Lcom/roblox/client/z0;->y2()V

    .line 47
    :goto_0
    iget-object p1, p0, Lcom/roblox/client/z0;->p0:Lcom/roblox/client/hybrid/RBHybridWebView;

    invoke-virtual {p1}, Lcom/roblox/client/hybrid/RBHybridWebView;->g()V

    return-object p2
.end method

.method public E0()V
    .locals 1

    .line 1
    invoke-static {}, Lm9/b;->a()Lbc/c;

    move-result-object v0

    invoke-virtual {v0, p0}, Lbc/c;->p(Ljava/lang/Object;)V

    .line 2
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->E0()V

    return-void
.end method

.method public G0()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->G0()V

    .line 2
    iget-object v0, p0, Lcom/roblox/client/z0;->p0:Lcom/roblox/client/hybrid/RBHybridWebView;

    invoke-virtual {v0}, Lcom/roblox/client/hybrid/RBHybridWebView;->h()V

    const/4 v0, 0x0

    .line 3
    iput-object v0, p0, Lcom/roblox/client/z0;->F0:Lo7/b;

    return-void
.end method

.method public J0(Z)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->J0(Z)V

    if-nez p1, :cond_0

    .line 2
    invoke-static {}, Le7/j;->b()Le7/j;

    move-result-object p1

    iget-object v0, p0, Lcom/roblox/client/z0;->p0:Lcom/roblox/client/hybrid/RBHybridWebView;

    .line 3
    invoke-virtual {v0}, Landroid/webkit/WebView;->getUrl()Ljava/lang/String;

    move-result-object v0

    .line 4
    invoke-virtual {p1, v0}, Le7/j;->a(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 5
    iget-object p1, p0, Lcom/roblox/client/z0;->p0:Lcom/roblox/client/hybrid/RBHybridWebView;

    invoke-virtual {p1}, Landroid/webkit/WebView;->reload()V

    :cond_0
    return-void
.end method

.method public P0()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->P0()V

    .line 2
    iget-object v0, p0, Lcom/roblox/client/z0;->p0:Lcom/roblox/client/hybrid/RBHybridWebView;

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0}, Landroid/webkit/WebView;->onPause()V

    :cond_0
    return-void
.end method

.method public U(Ly8/f;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ".onThemeChanged() "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "rbx.theme"

    invoke-static {v1, v0}, Lc9/k;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    iget-object v0, p0, Lcom/roblox/client/z0;->F0:Lo7/b;

    if-eqz v0, :cond_2

    .line 3
    sget-object v0, Lcom/roblox/client/z0$e;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_1

    const/4 v0, 0x2

    if-eq p1, v0, :cond_0

    .line 4
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->Q()Landroid/content/res/Resources;

    move-result-object p1

    sget v0, Lcom/roblox/client/v;->p:I

    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getColor(I)I

    move-result p1

    goto :goto_0

    .line 5
    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->Q()Landroid/content/res/Resources;

    move-result-object p1

    sget v0, Lcom/roblox/client/v;->b:I

    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getColor(I)I

    move-result p1

    goto :goto_0

    .line 6
    :cond_1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->Q()Landroid/content/res/Resources;

    move-result-object p1

    sget v0, Lcom/roblox/client/v;->w:I

    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getColor(I)I

    move-result p1

    .line 7
    :goto_0
    iget-object v0, p0, Lcom/roblox/client/z0;->F0:Lo7/b;

    invoke-virtual {v0, p1}, Lo7/b;->g(I)V

    :cond_2
    return-void
.end method

.method public U0()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->U0()V

    .line 2
    iget-object v0, p0, Lcom/roblox/client/z0;->p0:Lcom/roblox/client/hybrid/RBHybridWebView;

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0}, Landroid/webkit/WebView;->onResume()V

    :cond_0
    return-void
.end method

.method public W0()V
    .locals 0

    invoke-super {p0}, Landroidx/fragment/app/Fragment;->W0()V

    return-void
.end method

.method public X0()V
    .locals 0

    invoke-super {p0}, Landroidx/fragment/app/Fragment;->X0()V

    return-void
.end method

.method public c()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->p()Landroidx/fragment/app/d;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 2
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->p()Landroidx/fragment/app/d;

    move-result-object v0

    check-cast v0, Lcom/roblox/client/i0;

    invoke-virtual {v0}, Lcom/roblox/client/i0;->g1()Z

    move-result v0

    if-nez v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/roblox/client/z0;->p0:Lcom/roblox/client/hybrid/RBHybridWebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->reload()V

    goto :goto_0

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/roblox/client/z0;->q0:Landroidx/swiperefreshlayout/widget/c;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroidx/swiperefreshlayout/widget/c;->setRefreshing(Z)V

    :cond_1
    :goto_0
    return-void
.end method

.method protected k2(Le8/h;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->p()Landroidx/fragment/app/d;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    new-instance v1, Lcom/roblox/client/y0;

    invoke-direct {v1, p0, v0, p1}, Lcom/roblox/client/y0;-><init>(Lcom/roblox/client/z0;Landroidx/fragment/app/d;Le8/h;)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method

.method public n2()Lcom/roblox/client/hybrid/RBHybridWebView;
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/roblox/client/z0;->B0:Z

    if-eqz v0, :cond_0

    .line 2
    new-instance v0, Lk7/a;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->w()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lk7/a;-><init>(Landroid/content/Context;)V

    return-object v0

    .line 3
    :cond_0
    new-instance v0, Lcom/roblox/client/hybrid/RBHybridWebView;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->w()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/roblox/client/hybrid/RBHybridWebView;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method protected o2()Lcom/roblox/client/i0;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/roblox/client/j0;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->p()Landroidx/fragment/app/d;

    move-result-object v0

    .line 2
    instance-of v1, v0, Lcom/roblox/client/i0;

    if-eqz v1, :cond_0

    .line 3
    check-cast v0, Lcom/roblox/client/i0;

    return-object v0

    .line 4
    :cond_0
    new-instance v0, Lcom/roblox/client/j0;

    invoke-direct {v0}, Lcom/roblox/client/j0;-><init>()V

    throw v0
.end method

.method public onEmitRbHybridEvent(Lm9/a;)V
    .locals 0
    .annotation runtime Lbc/j;
        threadMode = .enum Lorg/greenrobot/eventbus/ThreadMode;->MAIN:Lorg/greenrobot/eventbus/ThreadMode;
    .end annotation

    .line 1
    iget-object p1, p0, Lcom/roblox/client/z0;->p0:Lcom/roblox/client/hybrid/RBHybridWebView;

    instance-of p1, p1, Lcom/roblox/client/hybrid/RBHybridWebView;

    if-nez p1, :cond_0

    return-void

    :cond_0
    const/4 p1, 0x0

    .line 2
    throw p1
.end method

.method protected p2()Ljava/lang/String;
    .locals 1

    const-string v0, "undefinedWebContext"

    return-object v0
.end method

.method public q2()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/roblox/client/z0;->p0:Lcom/roblox/client/hybrid/RBHybridWebView;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/webkit/WebView;->canGoBack()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/roblox/client/z0;->p0:Lcom/roblox/client/hybrid/RBHybridWebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->getUrl()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0, v1}, Lcom/roblox/client/z0;->D2(Ljava/lang/String;Z)V

    .line 3
    iget-object v0, p0, Lcom/roblox/client/z0;->p0:Lcom/roblox/client/hybrid/RBHybridWebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->goBack()V

    const/4 v0, 0x1

    return v0

    :cond_0
    return v1
.end method

.method public t0(Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->t0(Landroid/os/Bundle;)V

    .line 2
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object p1

    invoke-interface {p1}, Lc7/e;->d1()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 3
    new-instance p1, Ly8/e;

    invoke-direct {p1, p0}, Ly8/e;-><init>(Ly8/e$b;)V

    iput-object p1, p0, Lcom/roblox/client/z0;->G0:Ly8/e;

    .line 4
    invoke-virtual {p1, p0}, Ly8/e;->b(Landroidx/lifecycle/l;)V

    :cond_0
    return-void
.end method

.method public t2()Z
    .locals 1

    iget-boolean v0, p0, Lcom/roblox/client/z0;->C0:Z

    return v0
.end method

.method public u0(IILandroid/content/Intent;)V
    .locals 1

    const/16 v0, 0x4e9b

    if-ne p1, v0, :cond_1

    const/4 p1, -0x1

    if-ne p2, p1, :cond_0

    const/4 p1, 0x1

    new-array p1, p1, [Landroid/net/Uri;

    const/4 p2, 0x0

    .line 1
    invoke-virtual {p3}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object p3

    aput-object p3, p1, p2

    .line 2
    iget-object p2, p0, Lcom/roblox/client/z0;->A0:Landroid/webkit/ValueCallback;

    invoke-interface {p2, p1}, Landroid/webkit/ValueCallback;->onReceiveValue(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    const-string p1, "rbx.web"

    const-string p2, "Result of file chooser invalid."

    .line 3
    invoke-static {p1, p2}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 4
    iget-object p1, p0, Lcom/roblox/client/z0;->A0:Landroid/webkit/ValueCallback;

    const/4 p2, 0x0

    invoke-interface {p1, p2}, Landroid/webkit/ValueCallback;->onReceiveValue(Ljava/lang/Object;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public x2(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/roblox/client/z0;->p0:Lcom/roblox/client/hybrid/RBHybridWebView;

    if-nez v0, :cond_0

    .line 2
    iput-object p1, p0, Lcom/roblox/client/z0;->r0:Ljava/lang/String;

    goto :goto_0

    .line 3
    :cond_0
    invoke-virtual {v0, p1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method public z0(Landroid/os/Bundle;)V
    .locals 4

    .line 1
    invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->z0(Landroid/os/Bundle;)V

    .line 2
    invoke-static {}, Lm9/b;->a()Lbc/c;

    move-result-object p1

    invoke-virtual {p1, p0}, Lbc/c;->n(Ljava/lang/Object;)V

    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->u()Landroid/os/Bundle;

    move-result-object p1

    if-eqz p1, :cond_1

    const-string v0, "DEFAULT_URL"

    const/4 v1, 0x0

    .line 4
    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 5
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onCreate: default-URL = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "."

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "rbx.web"

    invoke-static {v3, v2}, Lc9/k;->a(Ljava/lang/String;Ljava/lang/String;)I

    if-eqz v0, :cond_0

    .line 6
    iput-object v0, p0, Lcom/roblox/client/z0;->u0:Ljava/lang/String;

    .line 7
    iget-object v2, p0, Lcom/roblox/client/z0;->r0:Ljava/lang/String;

    if-nez v2, :cond_0

    .line 8
    iput-object v0, p0, Lcom/roblox/client/z0;->r0:Ljava/lang/String;

    :cond_0
    const-string v0, "WEB_VIEW_TAG"

    .line 9
    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/roblox/client/z0;->v0:Ljava/lang/String;

    const-string v0, "USE_APP_HYBRID"

    .line 10
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result p1

    iput-boolean p1, p0, Lcom/roblox/client/z0;->B0:Z

    .line 11
    :cond_1
    new-instance p1, Lcom/roblox/client/app/b;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->w()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p1, v0}, Lcom/roblox/client/app/b;-><init>(Landroid/content/Context;)V

    iput-object p1, p0, Lcom/roblox/client/z0;->E0:Lcom/roblox/client/app/b;

    return-void
.end method
