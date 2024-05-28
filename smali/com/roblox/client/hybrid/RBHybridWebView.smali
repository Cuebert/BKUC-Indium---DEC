.class public Lcom/roblox/client/hybrid/RBHybridWebView;
.super Ll9/c;
.source "SourceFile"


# instance fields
.field protected p:Lcom/roblox/client/components/n;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Ll9/c;-><init>(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ll9/c;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method


# virtual methods
.method protected c(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Ll9/c;->c(Landroid/content/Context;)V

    .line 2
    new-instance p1, Lcom/roblox/client/components/n;

    invoke-direct {p1}, Lcom/roblox/client/components/n;-><init>()V

    iput-object p1, p0, Lcom/roblox/client/hybrid/RBHybridWebView;->p:Lcom/roblox/client/components/n;

    .line 3
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object v0

    invoke-interface {v0}, Lc7/e;->d()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/roblox/client/components/n;->a(I)V

    return-void
.end method

.method protected f(Landroid/content/Context;)V
    .locals 1

    .line 1
    new-instance v0, Ll7/j;

    invoke-direct {v0}, Ll7/j;-><init>()V

    invoke-virtual {p0, v0}, Ll9/c;->e(Ll9/b;)V

    .line 2
    new-instance v0, Ll7/c;

    invoke-direct {v0}, Ll7/c;-><init>()V

    invoke-virtual {p0, v0}, Ll9/c;->e(Ll9/b;)V

    .line 3
    new-instance v0, Ll7/a;

    invoke-direct {v0}, Ll7/a;-><init>()V

    invoke-virtual {p0, v0}, Ll9/c;->e(Ll9/b;)V

    .line 4
    new-instance v0, Ll7/d;

    invoke-direct {v0}, Ll7/d;-><init>()V

    invoke-virtual {p0, v0}, Ll9/c;->e(Ll9/b;)V

    .line 5
    new-instance v0, Ll7/b;

    invoke-direct {v0}, Ll7/b;-><init>()V

    invoke-virtual {p0, v0}, Ll9/c;->e(Ll9/b;)V

    .line 6
    new-instance v0, Ll7/i;

    invoke-direct {v0}, Ll7/i;-><init>()V

    invoke-virtual {p0, v0}, Ll9/c;->e(Ll9/b;)V

    .line 7
    new-instance v0, Ll7/h;

    invoke-direct {v0, p1}, Ll7/h;-><init>(Landroid/content/Context;)V

    invoke-virtual {p0, v0}, Ll9/c;->e(Ll9/b;)V

    .line 8
    new-instance p1, Ll7/f;

    invoke-direct {p1}, Ll7/f;-><init>()V

    invoke-virtual {p0, p1}, Ll9/c;->e(Ll9/b;)V

    .line 9
    new-instance p1, Ll7/g;

    invoke-direct {p1}, Ll7/g;-><init>()V

    invoke-virtual {p0, p1}, Ll9/c;->e(Ll9/b;)V

    .line 10
    new-instance p1, Ll7/e;

    invoke-direct {p1}, Ll7/e;-><init>()V

    invoke-virtual {p0, p1}, Ll9/c;->e(Ll9/b;)V

    return-void
.end method

.method public g()V
    .locals 0

    return-void
.end method

.method public h()V
    .locals 0

    return-void
.end method

.method public onFilterTouchEventForSecurity(Landroid/view/MotionEvent;)Z
    .locals 1

    iget-object v0, p0, Lcom/roblox/client/hybrid/RBHybridWebView;->p:Lcom/roblox/client/components/n;

    invoke-virtual {v0, p1}, Lcom/roblox/client/components/n;->b(Landroid/view/MotionEvent;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-super {p0, p1}, Landroid/webkit/WebView;->onFilterTouchEventForSecurity(Landroid/view/MotionEvent;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method
