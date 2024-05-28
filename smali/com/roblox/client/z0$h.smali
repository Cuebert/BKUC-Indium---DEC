.class public Lcom/roblox/client/z0$h;
.super Landroid/webkit/WebViewClient;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/roblox/client/z0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4
    name = "h"
.end annotation


# instance fields
.field final synthetic a:Lcom/roblox/client/z0;


# direct methods
.method protected constructor <init>(Lcom/roblox/client/z0;)V
    .locals 0

    iput-object p1, p0, Lcom/roblox/client/z0$h;->a:Lcom/roblox/client/z0;

    invoke-direct {p0}, Landroid/webkit/WebViewClient;-><init>()V

    return-void
.end method

.method public static synthetic a(Lcom/roblox/client/z0$h;Landroidx/fragment/app/d;Ljava/lang/String;Landroid/webkit/WebView;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/roblox/client/z0$h;->c(Landroidx/fragment/app/d;Ljava/lang/String;Landroid/webkit/WebView;)V

    return-void
.end method

.method public static synthetic b(Lcom/roblox/client/z0$h;Ljava/lang/String;Landroidx/fragment/app/d;Landroid/webkit/WebView;Z)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/roblox/client/z0$h;->d(Ljava/lang/String;Landroidx/fragment/app/d;Landroid/webkit/WebView;Z)V

    return-void
.end method

.method private synthetic c(Landroidx/fragment/app/d;Ljava/lang/String;Landroid/webkit/WebView;)V
    .locals 1

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
    iget-object p1, p0, Lcom/roblox/client/z0$h;->a:Lcom/roblox/client/z0;

    invoke-static {p1}, Lcom/roblox/client/z0;->i2(Lcom/roblox/client/z0;)Landroid/widget/TextView;

    move-result-object p1

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 3
    invoke-virtual {p3, p2}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    :cond_1
    :goto_0
    return-void
.end method

.method private synthetic d(Ljava/lang/String;Landroidx/fragment/app/d;Landroid/webkit/WebView;Z)V
    .locals 0

    if-eqz p4, :cond_0

    .line 1
    invoke-static {}, Lbc/c;->d()Lbc/c;

    move-result-object p2

    new-instance p3, Lcom/roblox/client/z0$f;

    iget-object p4, p0, Lcom/roblox/client/z0$h;->a:Lcom/roblox/client/z0;

    invoke-direct {p3, p4}, Lcom/roblox/client/z0$f;-><init>(Lcom/roblox/client/z0;)V

    invoke-virtual {p2, p3}, Lbc/c;->j(Ljava/lang/Object;)V

    .line 2
    invoke-static {}, Lla/c;->r()Lla/c;

    move-result-object p2

    invoke-virtual {p2, p1}, Lla/c;->e(Ljava/lang/String;)V

    goto :goto_0

    .line 3
    :cond_0
    new-instance p4, Lcom/roblox/client/a1;

    invoke-direct {p4, p0, p2, p1, p3}, Lcom/roblox/client/a1;-><init>(Lcom/roblox/client/z0$h;Landroidx/fragment/app/d;Ljava/lang/String;Landroid/webkit/WebView;)V

    invoke-virtual {p2, p4}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    :goto_0
    return-void
.end method


# virtual methods
.method public onLoadResource(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Landroid/webkit/WebViewClient;->onLoadResource(Landroid/webkit/WebView;Ljava/lang/String;)V

    .line 2
    invoke-static {}, Lo9/g;->h()Lo9/g;

    move-result-object p1

    invoke-static {}, Lcom/roblox/client/p0;->i()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lo9/g;->k(Ljava/lang/String;)V

    return-void
.end method

.method public onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/roblox/client/z0$h;->a:Lcom/roblox/client/z0;

    invoke-static {p1}, Lcom/roblox/client/z0;->a2(Lcom/roblox/client/z0;)Landroidx/swiperefreshlayout/widget/c;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroidx/swiperefreshlayout/widget/c;->setRefreshing(Z)V

    .line 2
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "onPageFinished. url="

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "rbx.web"

    invoke-static {v0, p1}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 3
    iget-object p1, p0, Lcom/roblox/client/z0$h;->a:Lcom/roblox/client/z0;

    invoke-virtual {p1, p2}, Lcom/roblox/client/z0;->B2(Ljava/lang/String;)V

    .line 4
    invoke-static {}, Le7/j;->b()Le7/j;

    move-result-object p1

    invoke-virtual {p1, p2}, Le7/j;->a(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 5
    iget-object p1, p0, Lcom/roblox/client/z0$h;->a:Lcom/roblox/client/z0;

    iget-object p1, p1, Lcom/roblox/client/z0;->p0:Lcom/roblox/client/hybrid/RBHybridWebView;

    invoke-virtual {p1}, Landroid/webkit/WebView;->reload()V

    :cond_0
    return-void
.end method

.method public onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V
    .locals 0

    .line 1
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "-> "

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p3, "rbx.web"

    invoke-static {p3, p1}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    iget-object p1, p0, Lcom/roblox/client/z0$h;->a:Lcom/roblox/client/z0;

    invoke-virtual {p1, p2}, Lcom/roblox/client/z0;->A2(Ljava/lang/String;)V

    .line 3
    iget-object p1, p0, Lcom/roblox/client/z0$h;->a:Lcom/roblox/client/z0;

    invoke-static {p1}, Lcom/roblox/client/z0;->a2(Lcom/roblox/client/z0;)Landroidx/swiperefreshlayout/widget/c;

    move-result-object p1

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Landroidx/swiperefreshlayout/widget/c;->setRefreshing(Z)V

    return-void
.end method

.method public shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z
    .locals 11

    const-string v0, "rbx.purchaseflow"

    .line 1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "-> "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "rbx.web"

    invoke-static {v2, v1}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v1, 0x0

    if-nez p2, :cond_0

    const-string p1, "RWF.shouldOverrideUrlLoading() urlString is null!"

    .line 2
    invoke-static {v2, p1}, Lc9/k;->c(Ljava/lang/String;Ljava/lang/String;)I

    return v1

    .line 3
    :cond_0
    iget-object v3, p0, Lcom/roblox/client/z0$h;->a:Lcom/roblox/client/z0;

    invoke-virtual {v3}, Landroidx/fragment/app/Fragment;->p()Landroidx/fragment/app/d;

    move-result-object v3

    const/4 v4, 0x1

    if-eqz v3, :cond_b

    .line 4
    invoke-virtual {v3}, Landroid/app/Activity;->isFinishing()Z

    move-result v5

    if-eqz v5, :cond_1

    goto/16 :goto_3

    .line 5
    :cond_1
    :try_start_0
    iget-object v5, p0, Lcom/roblox/client/z0$h;->a:Lcom/roblox/client/z0;

    invoke-virtual {v5}, Lcom/roblox/client/z0;->o2()Lcom/roblox/client/i0;

    move-result-object v5

    invoke-virtual {v5}, Lcom/roblox/client/i0;->g1()Z

    move-result v5
    :try_end_0
    .catch Lcom/roblox/client/j0; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v5, :cond_2

    return v4

    .line 6
    :catch_0
    invoke-static {}, Lcom/roblox/client/z0;->b2()V

    .line 7
    :cond_2
    iget-object v5, p0, Lcom/roblox/client/z0$h;->a:Lcom/roblox/client/z0;

    invoke-static {v5, p2}, Lcom/roblox/client/z0;->d2(Lcom/roblox/client/z0;Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_3

    return v4

    .line 8
    :cond_3
    iget-object v5, p0, Lcom/roblox/client/z0$h;->a:Lcom/roblox/client/z0;

    invoke-static {v5, p2}, Lcom/roblox/client/z0;->e2(Lcom/roblox/client/z0;Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_4

    const-string p1, "Navigating social media Link..."

    .line 9
    invoke-static {v2, p1}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    return v4

    .line 10
    :cond_4
    invoke-static {}, Lcom/roblox/client/p0;->z0()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p2, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_6

    .line 11
    iget-object p1, p0, Lcom/roblox/client/z0$h;->a:Lcom/roblox/client/z0;

    invoke-static {p1}, Lcom/roblox/client/z0;->f2(Lcom/roblox/client/z0;)Lcom/roblox/client/z0$g;

    move-result-object p1

    if-eqz p1, :cond_5

    .line 12
    iget-object p1, p0, Lcom/roblox/client/z0$h;->a:Lcom/roblox/client/z0;

    invoke-static {p1}, Lcom/roblox/client/z0;->f2(Lcom/roblox/client/z0;)Lcom/roblox/client/z0$g;

    move-result-object p1

    invoke-interface {p1}, Lcom/roblox/client/z0$g;->a()V

    :cond_5
    return v4

    .line 13
    :cond_6
    invoke-static {p2}, Lcom/roblox/client/p0;->j0(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_7

    iget-object v5, p0, Lcom/roblox/client/z0$h;->a:Lcom/roblox/client/z0;

    invoke-static {v5}, Lcom/roblox/client/z0;->g2(Lcom/roblox/client/z0;)Z

    move-result v5

    if-nez v5, :cond_7

    const-string p1, "RWF.shouldOverrideUrlLoading() The URL is a LOGIN type!"

    .line 14
    invoke-static {v2, p1}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 15
    :try_start_1
    iget-object p1, p0, Lcom/roblox/client/z0$h;->a:Lcom/roblox/client/z0;

    invoke-virtual {p1}, Lcom/roblox/client/z0;->o2()Lcom/roblox/client/i0;

    move-result-object p1

    iget-object v0, p0, Lcom/roblox/client/z0$h;->a:Lcom/roblox/client/z0;

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->w()Landroid/content/Context;

    move-result-object v0

    sget v2, Lcom/roblox/client/c0;->W:I

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v2, v1}, Lt7/a;->c(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0, v4}, Lcom/roblox/client/k0;->e1(Ljava/lang/String;I)V
    :try_end_1
    .catch Lcom/roblox/client/j0; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    .line 16
    :catch_1
    invoke-static {}, Lcom/roblox/client/z0;->b2()V

    .line 17
    :goto_0
    invoke-static {}, Lx7/b;->e()Lx7/b;

    move-result-object p1

    sget-object v0, Lx7/b$f;->q:Lx7/b$f;

    invoke-virtual {p1, v3, v0}, Lx7/b;->h(Landroid/app/Activity;Lx7/b$f;)V

    .line 18
    invoke-static {p2}, Lcom/roblox/client/p0;->R(Ljava/lang/String;)Ljava/lang/String;

    .line 19
    invoke-static {}, Lx7/g;->e()Lx7/g;

    move-result-object p1

    new-instance p2, Lcom/roblox/client/z0$h$a;

    invoke-direct {p2, p0}, Lcom/roblox/client/z0$h$a;-><init>(Lcom/roblox/client/z0$h;)V

    invoke-virtual {p1, p2}, Lx7/g;->d(Lh7/m;)V

    return v4

    .line 20
    :cond_7
    iget-object v1, p0, Lcom/roblox/client/z0$h;->a:Lcom/roblox/client/z0;

    iget-object v1, v1, Lcom/roblox/client/z0;->p0:Lcom/roblox/client/hybrid/RBHybridWebView;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/webkit/WebView;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 21
    iget-object v1, p0, Lcom/roblox/client/z0$h;->a:Lcom/roblox/client/z0;

    invoke-static {v1, p2, v4}, Lcom/roblox/client/z0;->h2(Lcom/roblox/client/z0;Ljava/lang/String;Z)V

    const-string v1, "mobile-app-upgrades/buy?"

    .line 22
    invoke-virtual {p2, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_a

    .line 23
    move-object v8, v3

    check-cast v8, Lcom/roblox/client/i0;

    .line 24
    invoke-static {}, Lb9/c;->c()Lb9/c;

    move-result-object p1

    invoke-virtual {p1}, Lb9/c;->k()Ljava/lang/String;

    move-result-object v6

    .line 25
    invoke-static {p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    const-string p2, "id"

    .line 26
    invoke-virtual {p1, p2}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 27
    invoke-static {v8}, Lf8/h;->f0(Landroid/content/Context;)Lf8/h;

    move-result-object v5

    if-nez v5, :cond_8

    .line 28
    :try_start_2
    iget-object p1, p0, Lcom/roblox/client/z0$h;->a:Lcom/roblox/client/z0;

    invoke-virtual {p1}, Lcom/roblox/client/z0;->o2()Lcom/roblox/client/i0;

    move-result-object p1

    sget p2, Lcom/roblox/client/c0;->u4:I

    invoke-virtual {p1, p2}, Lcom/roblox/client/k0;->W0(I)V
    :try_end_2
    .catch Lcom/roblox/client/j0; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_2

    .line 29
    :catch_2
    invoke-static {}, Lcom/roblox/client/z0;->b2()V

    goto :goto_2

    .line 30
    :cond_8
    iget-object p2, p0, Lcom/roblox/client/z0$h;->a:Lcom/roblox/client/z0;

    invoke-virtual {p2}, Lcom/roblox/client/z0;->p2()Ljava/lang/String;

    move-result-object p2

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "purchaseStart"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {p2, v1}, Lcom/roblox/client/f0;->c(Ljava/lang/String;Ljava/lang/String;)V

    :try_start_3
    const-string p2, "recurring"

    .line 31
    invoke-virtual {p1, p2}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2
    :try_end_3
    .catch Ljava/lang/NullPointerException; {:try_start_3 .. :try_end_3} :catch_4
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_3 .. :try_end_3} :catch_3

    goto :goto_1

    :catch_3
    const-string p1, "UnsupportedOperationException thrown while parsing recurring parameter for purchase url"

    .line 32
    invoke-static {v0, p1}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_1

    :catch_4
    const-string p1, "NullPointerException thrown while parsing recurring parameter for purchase url"

    .line 33
    invoke-static {v0, p1}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 34
    :goto_1
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v10

    .line 35
    iget-object p1, p0, Lcom/roblox/client/z0$h;->a:Lcom/roblox/client/z0;

    iget-object v9, p1, Lcom/roblox/client/z0;->H0:Le8/g;

    invoke-interface/range {v5 .. v10}, Le8/d;->c(Ljava/lang/String;Ljava/lang/String;Landroid/app/Activity;Le8/g;Z)Z

    move-result p1

    if-nez p1, :cond_9

    .line 36
    :try_start_4
    iget-object p1, p0, Lcom/roblox/client/z0$h;->a:Lcom/roblox/client/z0;

    invoke-virtual {p1}, Lcom/roblox/client/z0;->o2()Lcom/roblox/client/i0;

    move-result-object p1

    sget p2, Lcom/roblox/client/c0;->q4:I

    invoke-virtual {p1, p2}, Lcom/roblox/client/k0;->W0(I)V
    :try_end_4
    .catch Lcom/roblox/client/j0; {:try_start_4 .. :try_end_4} :catch_5

    goto :goto_2

    .line 37
    :catch_5
    invoke-static {}, Lcom/roblox/client/z0;->b2()V

    :cond_9
    :goto_2
    return v4

    .line 38
    :cond_a
    invoke-static {}, Lla/c;->r()Lla/c;

    move-result-object v0

    new-instance v1, Lcom/roblox/client/b1;

    invoke-direct {v1, p0, p2, v3, p1}, Lcom/roblox/client/b1;-><init>(Lcom/roblox/client/z0$h;Ljava/lang/String;Landroidx/fragment/app/d;Landroid/webkit/WebView;)V

    invoke-virtual {v0, p2, v1}, Lla/c;->h(Ljava/lang/String;Lla/c$d;)V

    return v4

    :cond_b
    :goto_3
    const-string p1, "RWF.shouldOverrideUrlLoading() activity is null or finishing"

    .line 39
    invoke-static {v2, p1}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    return v4
.end method
