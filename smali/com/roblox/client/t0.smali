.class public Lcom/roblox/client/t0;
.super Lcom/roblox/client/m0;
.source "SourceFile"

# interfaces
.implements Landroidx/swiperefreshlayout/widget/c$j;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/roblox/client/t0$g;,
        Lcom/roblox/client/t0$e;,
        Lcom/roblox/client/t0$f;
    }
.end annotation


# instance fields
.field private Q0:Landroid/widget/TextView;

.field protected R0:Lcom/roblox/client/hybrid/RBHybridWebView;

.field private S0:Landroidx/swiperefreshlayout/widget/c;

.field protected T0:Ljava/lang/String;

.field private U0:I

.field private V0:I

.field protected W0:Ljava/lang/String;

.field private X0:Ljava/lang/String;

.field private Y0:Landroid/app/ProgressDialog;

.field protected Z0:Landroid/widget/FrameLayout;

.field private a1:Z

.field private b1:Lcom/roblox/client/t0$f;

.field protected c1:Landroid/webkit/ValueCallback;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/webkit/ValueCallback<",
            "[",
            "Landroid/net/Uri;",
            ">;"
        }
    .end annotation
.end field

.field private d1:Z

.field private e1:Z

.field protected f1:Z

.field private g1:Lcom/roblox/client/app/b;

.field final h1:Le8/g;

.field final i1:Le8/g;

.field private final j1:Le8/g;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/roblox/client/m0;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lcom/roblox/client/t0;->Q0:Landroid/widget/TextView;

    .line 3
    iput-object v0, p0, Lcom/roblox/client/t0;->R0:Lcom/roblox/client/hybrid/RBHybridWebView;

    .line 4
    iput-object v0, p0, Lcom/roblox/client/t0;->S0:Landroidx/swiperefreshlayout/widget/c;

    .line 5
    iput-object v0, p0, Lcom/roblox/client/t0;->T0:Ljava/lang/String;

    const/4 v1, 0x0

    .line 6
    iput v1, p0, Lcom/roblox/client/t0;->U0:I

    .line 7
    iput v1, p0, Lcom/roblox/client/t0;->V0:I

    .line 8
    iput-object v0, p0, Lcom/roblox/client/t0;->W0:Ljava/lang/String;

    .line 9
    iput-boolean v1, p0, Lcom/roblox/client/t0;->d1:Z

    .line 10
    iput-boolean v1, p0, Lcom/roblox/client/t0;->e1:Z

    const/4 v0, 0x1

    .line 11
    iput-boolean v0, p0, Lcom/roblox/client/t0;->f1:Z

    .line 12
    new-instance v0, Lcom/roblox/client/t0$b;

    invoke-direct {v0, p0}, Lcom/roblox/client/t0$b;-><init>(Lcom/roblox/client/t0;)V

    iput-object v0, p0, Lcom/roblox/client/t0;->h1:Le8/g;

    .line 13
    new-instance v0, Lcom/roblox/client/t0$c;

    invoke-direct {v0, p0}, Lcom/roblox/client/t0$c;-><init>(Lcom/roblox/client/t0;)V

    iput-object v0, p0, Lcom/roblox/client/t0;->i1:Le8/g;

    .line 14
    new-instance v0, Lcom/roblox/client/t0$d;

    invoke-direct {v0, p0}, Lcom/roblox/client/t0$d;-><init>(Lcom/roblox/client/t0;)V

    iput-object v0, p0, Lcom/roblox/client/t0;->j1:Le8/g;

    return-void
.end method

.method public static synthetic A2(Lcom/roblox/client/t0;Landroidx/fragment/app/d;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/roblox/client/t0;->W2(Landroidx/fragment/app/d;)V

    return-void
.end method

.method public static synthetic B2(Lcom/roblox/client/t0;Landroidx/fragment/app/d;Le8/h;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/roblox/client/t0;->U2(Landroidx/fragment/app/d;Le8/h;)V

    return-void
.end method

.method static synthetic C2(Lcom/roblox/client/t0;)Landroidx/swiperefreshlayout/widget/c;
    .locals 0

    iget-object p0, p0, Lcom/roblox/client/t0;->S0:Landroidx/swiperefreshlayout/widget/c;

    return-object p0
.end method

.method static synthetic D2(Lcom/roblox/client/t0;Ljava/lang/String;)Z
    .locals 0

    invoke-direct {p0, p1}, Lcom/roblox/client/t0;->R2(Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method static synthetic E2(Lcom/roblox/client/t0;Ljava/lang/String;)Z
    .locals 0

    invoke-direct {p0, p1}, Lcom/roblox/client/t0;->Y2(Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method static synthetic F2(Lcom/roblox/client/t0;)Lcom/roblox/client/t0$f;
    .locals 0

    iget-object p0, p0, Lcom/roblox/client/t0;->b1:Lcom/roblox/client/t0$f;

    return-object p0
.end method

.method static synthetic G2(Lcom/roblox/client/t0;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/roblox/client/t0;->a1:Z

    return p0
.end method

.method static synthetic H2(Lcom/roblox/client/t0;Ljava/lang/String;Z)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/roblox/client/t0;->f3(Ljava/lang/String;Z)V

    return-void
.end method

.method static synthetic I2(Lcom/roblox/client/t0;)Landroid/widget/TextView;
    .locals 0

    iget-object p0, p0, Lcom/roblox/client/t0;->Q0:Landroid/widget/TextView;

    return-object p0
.end method

.method static synthetic J2(Lcom/roblox/client/t0;)V
    .locals 0

    invoke-direct {p0}, Lcom/roblox/client/t0;->g3()V

    return-void
.end method

.method static synthetic K2(Lcom/roblox/client/t0;)V
    .locals 0

    invoke-direct {p0}, Lcom/roblox/client/t0;->S2()V

    return-void
.end method

.method private M2(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/app/ProgressDialog;
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

.method private R2(Ljava/lang/String;)Z
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
    sget p1, Lcom/roblox/client/c0;->o3:I

    invoke-virtual {p0, p1, v1}, Lcom/roblox/client/m0;->x2(II)V

    return v1
.end method

.method private S2()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->p()Landroidx/fragment/app/d;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    new-instance v1, Lcom/roblox/client/q0;

    invoke-direct {v1, p0, v0}, Lcom/roblox/client/q0;-><init>(Lcom/roblox/client/t0;Landroidx/fragment/app/d;)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method

.method private synthetic U2(Landroidx/fragment/app/d;Le8/h;)V
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
    invoke-direct {p0}, Lcom/roblox/client/t0;->S2()V

    .line 3
    invoke-direct {p0, p2}, Lcom/roblox/client/t0;->h3(Le8/h;)V

    :cond_1
    :goto_0
    return-void
.end method

.method private synthetic V2(Landroidx/fragment/app/d;)V
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
    iget-object p1, p0, Lcom/roblox/client/t0;->Y0:Landroid/app/ProgressDialog;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Landroid/app/ProgressDialog;->isShowing()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 3
    iget-object p1, p0, Lcom/roblox/client/t0;->Y0:Landroid/app/ProgressDialog;

    invoke-virtual {p1}, Landroid/app/ProgressDialog;->dismiss()V

    :cond_1
    :goto_0
    return-void
.end method

.method private synthetic W2(Landroidx/fragment/app/d;)V
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
    iget-object v0, p0, Lcom/roblox/client/t0;->Y0:Landroid/app/ProgressDialog;

    if-nez v0, :cond_1

    const/4 v0, 0x0

    .line 3
    sget v1, Lcom/roblox/client/c0;->i3:I

    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->Y(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, p1, v0, v1}, Lcom/roblox/client/t0;->M2(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/app/ProgressDialog;

    move-result-object p1

    iput-object p1, p0, Lcom/roblox/client/t0;->Y0:Landroid/app/ProgressDialog;

    .line 4
    :cond_1
    iget-object p1, p0, Lcom/roblox/client/t0;->Y0:Landroid/app/ProgressDialog;

    invoke-virtual {p1}, Landroid/app/ProgressDialog;->show()V

    :cond_2
    :goto_0
    return-void
.end method

.method private Y2(Ljava/lang/String;)Z
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

.method private f3(Ljava/lang/String;Z)V
    .locals 1

    const-string v0, "sponsored"

    .line 1
    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 2
    iget-object p1, p0, Lcom/roblox/client/t0;->R0:Lcom/roblox/client/hybrid/RBHybridWebView;

    invoke-virtual {p1}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object p1

    invoke-virtual {p1, p2}, Landroid/webkit/WebSettings;->setBuiltInZoomControls(Z)V

    goto :goto_0

    .line 3
    :cond_0
    iget-object p1, p0, Lcom/roblox/client/t0;->R0:Lcom/roblox/client/hybrid/RBHybridWebView;

    invoke-virtual {p1}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object p1

    xor-int/lit8 p2, p2, 0x1

    invoke-virtual {p1, p2}, Landroid/webkit/WebSettings;->setBuiltInZoomControls(Z)V

    :goto_0
    return-void
.end method

.method private g3()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->p()Landroidx/fragment/app/d;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    new-instance v1, Lcom/roblox/client/r0;

    invoke-direct {v1, p0, v0}, Lcom/roblox/client/r0;-><init>(Lcom/roblox/client/t0;Landroidx/fragment/app/d;)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method

.method private h3(Le8/h;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->p()Landroidx/fragment/app/d;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-virtual {p1, v0}, Le8/h;->b(Landroid/content/Context;)Ljava/lang/CharSequence;

    move-result-object v0

    .line 3
    invoke-virtual {p1}, Le8/h;->e()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 4
    invoke-virtual {p0, v0}, Lcom/roblox/client/m0;->u2(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 5
    :cond_1
    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/roblox/client/m0;->r2(Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method public static synthetic z2(Lcom/roblox/client/t0;Landroidx/fragment/app/d;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/roblox/client/t0;->V2(Landroidx/fragment/app/d;)V

    return-void
.end method


# virtual methods
.method public D0(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 4

    .line 1
    sget p3, Lcom/roblox/client/a0;->o:I

    const/4 v0, 0x0

    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 2
    sget p2, Lcom/roblox/client/y;->l1:I

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/view/ViewGroup;

    .line 3
    sget p3, Lcom/roblox/client/y;->K1:I

    invoke-virtual {p1, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Landroid/widget/TextView;

    iput-object p3, p0, Lcom/roblox/client/t0;->Q0:Landroid/widget/TextView;

    .line 4
    new-instance p3, Lcom/roblox/client/t0$g;

    invoke-direct {p3, p0}, Lcom/roblox/client/t0$g;-><init>(Lcom/roblox/client/t0;)V

    .line 5
    invoke-virtual {p0}, Lcom/roblox/client/t0;->N2()Lcom/roblox/client/hybrid/RBHybridWebView;

    move-result-object v1

    iput-object v1, p0, Lcom/roblox/client/t0;->R0:Lcom/roblox/client/hybrid/RBHybridWebView;

    .line 6
    new-instance v2, Landroid/view/ViewGroup$LayoutParams;

    const/4 v3, -0x1

    invoke-direct {v2, v3, v3}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {p2, v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 7
    iget-object p2, p0, Lcom/roblox/client/t0;->R0:Lcom/roblox/client/hybrid/RBHybridWebView;

    iget-object v1, p0, Lcom/roblox/client/t0;->X0:Ljava/lang/String;

    invoke-virtual {p2, v1}, Landroid/webkit/WebView;->setTag(Ljava/lang/Object;)V

    .line 8
    iget-object p2, p0, Lcom/roblox/client/t0;->R0:Lcom/roblox/client/hybrid/RBHybridWebView;

    invoke-virtual {p2, p3}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    .line 9
    iget-object p2, p0, Lcom/roblox/client/t0;->R0:Lcom/roblox/client/hybrid/RBHybridWebView;

    invoke-virtual {p2}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object p2

    const/4 p3, 0x1

    invoke-virtual {p2, p3}, Landroid/webkit/WebSettings;->setSupportMultipleWindows(Z)V

    .line 10
    iget-object p2, p0, Lcom/roblox/client/t0;->R0:Lcom/roblox/client/hybrid/RBHybridWebView;

    new-instance v1, Lcom/roblox/client/t0$a;

    invoke-direct {v1, p0}, Lcom/roblox/client/t0$a;-><init>(Lcom/roblox/client/t0;)V

    invoke-virtual {p2, v1}, Landroid/webkit/WebView;->setWebChromeClient(Landroid/webkit/WebChromeClient;)V

    .line 11
    :try_start_0
    iget-object p2, p0, Lcom/roblox/client/t0;->R0:Lcom/roblox/client/hybrid/RBHybridWebView;

    invoke-virtual {p2}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object p2

    invoke-virtual {p2, p3}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    .line 12
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object p2

    invoke-interface {p2}, Lc7/e;->E0()Z

    move-result p2

    if-eqz p2, :cond_0

    .line 13
    iget-object p2, p0, Lcom/roblox/client/t0;->R0:Lcom/roblox/client/hybrid/RBHybridWebView;

    invoke-virtual {p2}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object p2

    invoke-virtual {p2, p3}, Landroid/webkit/WebSettings;->setDomStorageEnabled(Z)V

    .line 14
    :cond_0
    iget-object p2, p0, Lcom/roblox/client/t0;->R0:Lcom/roblox/client/hybrid/RBHybridWebView;

    invoke-virtual {p2}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object p2

    invoke-static {}, Lcom/roblox/client/p0;->Z0()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, v1}, Landroid/webkit/WebSettings;->setUserAgentString(Ljava/lang/String;)V

    .line 15
    iget-object p2, p0, Lcom/roblox/client/t0;->R0:Lcom/roblox/client/hybrid/RBHybridWebView;

    invoke-virtual {p2}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object p2

    invoke-virtual {p2, v3}, Landroid/webkit/WebSettings;->setCacheMode(I)V

    .line 16
    iget-object p2, p0, Lcom/roblox/client/t0;->R0:Lcom/roblox/client/hybrid/RBHybridWebView;

    invoke-virtual {p2, v0}, Landroid/webkit/WebView;->setHorizontalScrollBarEnabled(Z)V

    .line 17
    iget-object p2, p0, Lcom/roblox/client/t0;->R0:Lcom/roblox/client/hybrid/RBHybridWebView;

    invoke-virtual {p2, v0}, Landroid/webkit/WebView;->setVerticalScrollBarEnabled(Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p2

    .line 18
    invoke-virtual {p2}, Ljava/lang/Exception;->printStackTrace()V

    .line 19
    :goto_0
    iget-object p2, p0, Lcom/roblox/client/t0;->R0:Lcom/roblox/client/hybrid/RBHybridWebView;

    invoke-virtual {p2}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object p2

    invoke-virtual {p2}, Landroid/webkit/WebSettings;->getUserAgentString()Ljava/lang/String;

    move-result-object p2

    .line 20
    iget-object v1, p0, Lcom/roblox/client/t0;->R0:Lcom/roblox/client/hybrid/RBHybridWebView;

    invoke-virtual {v1}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/webkit/WebSettings;->setUserAgentString(Ljava/lang/String;)V

    .line 21
    iget-object v1, p0, Lcom/roblox/client/t0;->R0:Lcom/roblox/client/hybrid/RBHybridWebView;

    invoke-virtual {v1}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v1

    invoke-virtual {v1}, Landroid/webkit/WebSettings;->getUserAgentString()Ljava/lang/String;

    move-result-object v1

    .line 22
    iget-object v3, p0, Lcom/roblox/client/t0;->R0:Lcom/roblox/client/hybrid/RBHybridWebView;

    invoke-virtual {v3}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v3

    invoke-virtual {v3, p2}, Landroid/webkit/WebSettings;->setUserAgentString(Ljava/lang/String;)V

    const-string p2, "Chrome/"

    .line 23
    invoke-virtual {v1, p2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 24
    invoke-static {}, Lx6/b;->a()Z

    move-result p2

    if-eqz p2, :cond_1

    .line 25
    invoke-static {p3}, Landroid/webkit/WebView;->setWebContentsDebuggingEnabled(Z)V

    .line 26
    :cond_1
    iget-object p2, p0, Lcom/roblox/client/t0;->T0:Ljava/lang/String;

    if-eqz p2, :cond_2

    .line 27
    iget-object v1, p0, Lcom/roblox/client/t0;->R0:Lcom/roblox/client/hybrid/RBHybridWebView;

    invoke-virtual {v1, p2}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 28
    iput-object v2, p0, Lcom/roblox/client/t0;->T0:Ljava/lang/String;

    .line 29
    :cond_2
    sget p2, Lcom/roblox/client/y;->l1:I

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroidx/swiperefreshlayout/widget/c;

    iput-object p2, p0, Lcom/roblox/client/t0;->S0:Landroidx/swiperefreshlayout/widget/c;

    .line 30
    invoke-virtual {p2, p0}, Landroidx/swiperefreshlayout/widget/c;->setOnRefreshListener(Landroidx/swiperefreshlayout/widget/c$j;)V

    .line 31
    iget-object p2, p0, Lcom/roblox/client/t0;->S0:Landroidx/swiperefreshlayout/widget/c;

    const/4 v1, 0x4

    new-array v1, v1, [I

    sget v2, Lcom/roblox/client/v;->h:I

    aput v2, v1, v0

    aput v2, v1, p3

    const/4 v2, 0x2

    sget v3, Lcom/roblox/client/v;->y:I

    aput v3, v1, v2

    const/4 v2, 0x3

    aput v3, v1, v2

    invoke-virtual {p2, v1}, Landroidx/swiperefreshlayout/widget/c;->setColorSchemeResources([I)V

    .line 32
    sget p2, Lcom/roblox/client/y;->s1:I

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/FrameLayout;

    iput-object p2, p0, Lcom/roblox/client/t0;->Z0:Landroid/widget/FrameLayout;

    .line 33
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->u()Landroid/os/Bundle;

    move-result-object p2

    if-eqz p2, :cond_4

    const-string v1, "dialogHeight"

    .line 34
    invoke-virtual {p2, v1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v1

    iput v1, p0, Lcom/roblox/client/t0;->U0:I

    const-string v1, "dialogWidth"

    .line 35
    invoke-virtual {p2, v1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v1

    iput v1, p0, Lcom/roblox/client/t0;->V0:I

    const-string v1, "enablePullToRefresh"

    .line 36
    invoke-virtual {p2, v1, p3}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    if-nez v1, :cond_3

    .line 37
    iget-object v1, p0, Lcom/roblox/client/t0;->S0:Landroidx/swiperefreshlayout/widget/c;

    invoke-virtual {v1, v0}, Landroidx/swiperefreshlayout/widget/c;->setEnabled(Z)V

    :cond_3
    const-string v1, "USING_LOGIN_WEB_URL"

    .line 38
    invoke-virtual {p2, v1, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    iput-boolean v1, p0, Lcom/roblox/client/t0;->a1:Z

    const-string v1, "VISIBLE"

    .line 39
    invoke-virtual {p2, v1, p3}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result p3

    iput-boolean p3, p0, Lcom/roblox/client/t0;->f1:Z

    const-string p3, "BACK_NAVIGATION_DISABLED"

    .line 40
    invoke-virtual {p2, p3, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result p2

    iput-boolean p2, p0, Lcom/roblox/client/t0;->e1:Z

    .line 41
    :cond_4
    invoke-virtual {p0}, Lcom/roblox/client/m0;->q2()Z

    .line 42
    iget-object p2, p0, Lcom/roblox/client/t0;->R0:Lcom/roblox/client/hybrid/RBHybridWebView;

    invoke-virtual {p2}, Lcom/roblox/client/hybrid/RBHybridWebView;->g()V

    return-object p1
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
    invoke-super {p0}, Landroidx/fragment/app/c;->G0()V

    .line 2
    iget-object v0, p0, Lcom/roblox/client/t0;->R0:Lcom/roblox/client/hybrid/RBHybridWebView;

    invoke-virtual {v0}, Lcom/roblox/client/hybrid/RBHybridWebView;->h()V

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

    iget-object v0, p0, Lcom/roblox/client/t0;->R0:Lcom/roblox/client/hybrid/RBHybridWebView;

    .line 3
    invoke-virtual {v0}, Landroid/webkit/WebView;->getUrl()Ljava/lang/String;

    move-result-object v0

    .line 4
    invoke-virtual {p1, v0}, Le7/j;->a(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 5
    iget-object p1, p0, Lcom/roblox/client/t0;->R0:Lcom/roblox/client/hybrid/RBHybridWebView;

    invoke-virtual {p1}, Landroid/webkit/WebView;->reload()V

    :cond_0
    return-void
.end method

.method protected L2(Le8/h;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->p()Landroidx/fragment/app/d;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    new-instance v1, Lcom/roblox/client/s0;

    invoke-direct {v1, p0, v0, p1}, Lcom/roblox/client/s0;-><init>(Lcom/roblox/client/t0;Landroidx/fragment/app/d;Le8/h;)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method

.method public N2()Lcom/roblox/client/hybrid/RBHybridWebView;
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/roblox/client/t0;->d1:Z

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

.method protected O2()Ljava/lang/String;
    .locals 1

    const-string v0, "undefinedWebContext"

    return-object v0
.end method

.method public P0()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->P0()V

    .line 2
    iget-object v0, p0, Lcom/roblox/client/t0;->R0:Lcom/roblox/client/hybrid/RBHybridWebView;

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0}, Landroid/webkit/WebView;->onPause()V

    :cond_0
    return-void
.end method

.method public P2()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/roblox/client/t0;->R0:Lcom/roblox/client/hybrid/RBHybridWebView;

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/roblox/client/t0;->T0:Ljava/lang/String;

    return-object v0

    .line 3
    :cond_0
    invoke-virtual {v0}, Landroid/webkit/WebView;->getUrl()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public Q2()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/roblox/client/t0;->R0:Lcom/roblox/client/hybrid/RBHybridWebView;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/webkit/WebView;->canGoBack()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/roblox/client/t0;->R0:Lcom/roblox/client/hybrid/RBHybridWebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->getUrl()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0, v1}, Lcom/roblox/client/t0;->f3(Ljava/lang/String;Z)V

    .line 3
    iget-object v0, p0, Lcom/roblox/client/t0;->R0:Lcom/roblox/client/hybrid/RBHybridWebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->goBack()V

    const/4 v0, 0x1

    return v0

    :cond_0
    return v1
.end method

.method public T2()Z
    .locals 1

    iget-boolean v0, p0, Lcom/roblox/client/t0;->e1:Z

    return v0
.end method

.method public U(Ly8/f;)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Lcom/roblox/client/m0;->U(Ly8/f;)V

    .line 2
    iget-object p1, p0, Lcom/roblox/client/t0;->R0:Lcom/roblox/client/hybrid/RBHybridWebView;

    iget-object v0, p0, Lcom/roblox/client/t0;->g1:Lcom/roblox/client/app/b;

    invoke-static {}, Lb9/c;->c()Lb9/c;

    move-result-object v1

    invoke-virtual {v1}, Lb9/c;->g()Ly8/f;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/roblox/client/app/b;->a(Ly8/f;)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/webkit/WebView;->setBackgroundColor(I)V

    return-void
.end method

.method public U0()V
    .locals 3

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->U0()V

    .line 2
    invoke-virtual {p0}, Landroidx/fragment/app/c;->d2()Landroid/app/Dialog;

    move-result-object v0

    if-eqz v0, :cond_1

    iget v0, p0, Lcom/roblox/client/t0;->U0:I

    if-eqz v0, :cond_1

    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/c;->d2()Landroid/app/Dialog;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 4
    iget v1, p0, Lcom/roblox/client/t0;->V0:I

    if-nez v1, :cond_0

    const/4 v1, -0x2

    .line 5
    iget v2, p0, Lcom/roblox/client/t0;->U0:I

    invoke-virtual {v0, v1, v2}, Landroid/view/Window;->setLayout(II)V

    goto :goto_0

    .line 6
    :cond_0
    iget v2, p0, Lcom/roblox/client/t0;->U0:I

    invoke-virtual {v0, v1, v2}, Landroid/view/Window;->setLayout(II)V

    .line 7
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/roblox/client/t0;->R0:Lcom/roblox/client/hybrid/RBHybridWebView;

    if-eqz v0, :cond_2

    .line 8
    invoke-virtual {v0}, Landroid/webkit/WebView;->onResume()V

    :cond_2
    return-void
.end method

.method public W0()V
    .locals 0

    invoke-super {p0}, Lcom/roblox/client/m0;->W0()V

    return-void
.end method

.method public X0()V
    .locals 0

    invoke-super {p0}, Lcom/roblox/client/m0;->X0()V

    return-void
.end method

.method public X2(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/roblox/client/t0;->R0:Lcom/roblox/client/hybrid/RBHybridWebView;

    if-nez v0, :cond_0

    .line 2
    iput-object p1, p0, Lcom/roblox/client/t0;->T0:Ljava/lang/String;

    goto :goto_0

    .line 3
    :cond_0
    invoke-virtual {v0, p1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method public Z2(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public a3(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public b3(Landroid/webkit/WebView;I)V
    .locals 0

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
    iget-object v0, p0, Lcom/roblox/client/t0;->R0:Lcom/roblox/client/hybrid/RBHybridWebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->reload()V

    goto :goto_0

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/roblox/client/t0;->S0:Landroidx/swiperefreshlayout/widget/c;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroidx/swiperefreshlayout/widget/c;->setRefreshing(Z)V

    :cond_1
    :goto_0
    return-void
.end method

.method public c3(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/roblox/client/t0;->e1:Z

    return-void
.end method

.method public d3(Lcom/roblox/client/t0$f;)V
    .locals 0

    iput-object p1, p0, Lcom/roblox/client/t0;->b1:Lcom/roblox/client/t0$f;

    return-void
.end method

.method public e3(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/roblox/client/t0;->f1:Z

    return-void
.end method

.method public i3(Lcom/roblox/client/app/d;)V
    .locals 1

    .line 1
    iget-object v0, p1, Lcom/roblox/client/app/d;->c:Ljava/lang/Boolean;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-virtual {p0, v0}, Lcom/roblox/client/t0;->e3(Z)V

    .line 3
    :cond_0
    iget-object p1, p1, Lcom/roblox/client/app/d;->e:Ljava/lang/Boolean;

    if-eqz p1, :cond_1

    .line 4
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-virtual {p0, p1}, Lcom/roblox/client/t0;->c3(Z)V

    :cond_1
    return-void
.end method

.method public onEmitRbHybridEvent(Lm9/a;)V
    .locals 0
    .annotation runtime Lbc/j;
        threadMode = .enum Lorg/greenrobot/eventbus/ThreadMode;->MAIN:Lorg/greenrobot/eventbus/ThreadMode;
    .end annotation

    .line 1
    iget-object p1, p0, Lcom/roblox/client/t0;->R0:Lcom/roblox/client/hybrid/RBHybridWebView;

    instance-of p1, p1, Lcom/roblox/client/hybrid/RBHybridWebView;

    if-nez p1, :cond_0

    return-void

    :cond_0
    const/4 p1, 0x0

    .line 2
    throw p1
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
    iget-object p2, p0, Lcom/roblox/client/t0;->c1:Landroid/webkit/ValueCallback;

    invoke-interface {p2, p1}, Landroid/webkit/ValueCallback;->onReceiveValue(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    const-string p1, "rbx.web"

    const-string p2, "Result of file chooser invalid."

    .line 3
    invoke-static {p1, p2}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 4
    iget-object p1, p0, Lcom/roblox/client/t0;->c1:Landroid/webkit/ValueCallback;

    const/4 p2, 0x0

    invoke-interface {p1, p2}, Landroid/webkit/ValueCallback;->onReceiveValue(Ljava/lang/Object;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public z0(Landroid/os/Bundle;)V
    .locals 4

    .line 1
    invoke-super {p0, p1}, Lcom/roblox/client/m0;->z0(Landroid/os/Bundle;)V

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
    iput-object v0, p0, Lcom/roblox/client/t0;->W0:Ljava/lang/String;

    .line 7
    iget-object v2, p0, Lcom/roblox/client/t0;->T0:Ljava/lang/String;

    if-nez v2, :cond_0

    .line 8
    iput-object v0, p0, Lcom/roblox/client/t0;->T0:Ljava/lang/String;

    :cond_0
    const-string v0, "WEB_VIEW_TAG"

    .line 9
    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/roblox/client/t0;->X0:Ljava/lang/String;

    const-string v0, "USE_APP_HYBRID"

    .line 10
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result p1

    iput-boolean p1, p0, Lcom/roblox/client/t0;->d1:Z

    .line 11
    :cond_1
    new-instance p1, Lcom/roblox/client/app/b;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->w()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p1, v0}, Lcom/roblox/client/app/b;-><init>(Landroid/content/Context;)V

    iput-object p1, p0, Lcom/roblox/client/t0;->g1:Lcom/roblox/client/app/b;

    return-void
.end method
