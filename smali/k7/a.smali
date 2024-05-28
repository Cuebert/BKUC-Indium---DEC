.class public Lk7/a;
.super Lcom/roblox/client/hybrid/RBHybridWebView;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lk7/a$b;
    }
.end annotation


# instance fields
.field private final q:Ljava/lang/String;

.field private r:Ljava/util/Vector;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Vector<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private s:Z

.field private t:Lcom/roblox/engine/jni/memstorage/Connection;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/roblox/client/hybrid/RBHybridWebView;-><init>(Landroid/content/Context;)V

    const-string p1, "rbx.browserservice"

    .line 2
    iput-object p1, p0, Lk7/a;->q:Ljava/lang/String;

    const/4 p1, 0x0

    .line 3
    iput-object p1, p0, Lk7/a;->r:Ljava/util/Vector;

    const/4 p1, 0x0

    .line 4
    iput-boolean p1, p0, Lk7/a;->s:Z

    return-void
.end method

.method static synthetic i(Lk7/a;Z)Z
    .locals 0

    iput-boolean p1, p0, Lk7/a;->s:Z

    return p1
.end method

.method static synthetic j(Lk7/a;)V
    .locals 0

    invoke-direct {p0}, Lk7/a;->m()V

    return-void
.end method

.method static synthetic k(Lk7/a;Ljava/lang/Runnable;)V
    .locals 0

    invoke-direct {p0, p1}, Lk7/a;->n(Ljava/lang/Runnable;)V

    return-void
.end method

.method private l()V
    .locals 2

    new-instance v0, Lk7/a$a;

    invoke-direct {v0, p0}, Lk7/a$a;-><init>(Lk7/a;)V

    const-string v1, "BrowserService.ExecuteJavaScript"

    invoke-static {v1, v0}, Lcom/roblox/engine/jni/memstorage/MemStorage;->bind(Ljava/lang/String;Lcom/roblox/engine/jni/memstorage/Callback;)Lcom/roblox/engine/jni/memstorage/Connection;

    move-result-object v0

    iput-object v0, p0, Lk7/a;->t:Lcom/roblox/engine/jni/memstorage/Connection;

    return-void
.end method

.method private m()V
    .locals 2

    .line 1
    iget-object v0, p0, Lk7/a;->r:Ljava/util/Vector;

    if-eqz v0, :cond_1

    .line 2
    invoke-virtual {v0}, Ljava/util/Vector;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 3
    invoke-super {p0, v1}, Ll9/c;->a(Ljava/lang/String;)V

    goto :goto_0

    .line 4
    :cond_0
    iget-object v0, p0, Lk7/a;->r:Ljava/util/Vector;

    invoke-virtual {v0}, Ljava/util/Vector;->clear()V

    :cond_1
    return-void
.end method

.method private n(Ljava/lang/Runnable;)V
    .locals 1

    iget-object v0, p0, Ll9/c;->n:Landroid/os/Handler;

    invoke-virtual {v0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method private o()V
    .locals 1

    .line 1
    iget-object v0, p0, Lk7/a;->t:Lcom/roblox/engine/jni/memstorage/Connection;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/roblox/engine/jni/memstorage/Connection;->disconnect()V

    :cond_0
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lk7/a;->s:Z

    if-eqz v0, :cond_0

    .line 2
    invoke-super {p0, p1}, Ll9/c;->a(Ljava/lang/String;)V

    goto :goto_0

    .line 3
    :cond_0
    iget-object v0, p0, Lk7/a;->r:Ljava/util/Vector;

    if-nez v0, :cond_1

    .line 4
    new-instance v0, Ljava/util/Vector;

    invoke-direct {v0}, Ljava/util/Vector;-><init>()V

    iput-object v0, p0, Lk7/a;->r:Ljava/util/Vector;

    .line 5
    :cond_1
    iget-object v0, p0, Lk7/a;->r:Ljava/util/Vector;

    invoke-virtual {v0, p1}, Ljava/util/Vector;->add(Ljava/lang/Object;)Z

    :goto_0
    return-void
.end method

.method protected d(Ljava/lang/String;)V
    .locals 1

    const-string v0, "BrowserService.JavaScriptCallback"

    invoke-static {v0, p1}, Lcom/roblox/engine/jni/memstorage/MemStorage;->fire(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method protected f(Landroid/content/Context;)V
    .locals 0

    return-void
.end method

.method public g()V
    .locals 2

    const-string v0, "rbx.browserservice"

    const-string v1, "create -> bindBrowserService"

    .line 1
    invoke-static {v0, v1}, Lc9/k;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    invoke-direct {p0}, Lk7/a;->l()V

    return-void
.end method

.method public h()V
    .locals 2

    const-string v0, "rbx.browserservice"

    const-string v1, "destroy -> unbindBrowserService"

    .line 1
    invoke-static {v0, v1}, Lc9/k;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    invoke-direct {p0}, Lk7/a;->o()V

    return-void
.end method

.method public setWebViewClient(Landroid/webkit/WebViewClient;)V
    .locals 1

    new-instance v0, Lk7/a$b;

    invoke-direct {v0, p0, p1}, Lk7/a$b;-><init>(Lk7/a;Landroid/webkit/WebViewClient;)V

    invoke-super {p0, v0}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    return-void
.end method
