.class public Lcom/roblox/client/app/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Lv6/a;

.field private b:Lcom/roblox/engine/jni/memstorage/Connection;

.field private c:Landroid/app/Activity;


# direct methods
.method public constructor <init>(Landroid/app/Activity;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/roblox/client/app/c;->c:Landroid/app/Activity;

    return-void
.end method

.method static synthetic a(Lcom/roblox/client/app/c;Lv6/d;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/roblox/client/app/c;->f(Lv6/d;I)V

    return-void
.end method

.method static synthetic b(Lcom/roblox/client/app/c;Lv6/d;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/roblox/client/app/c;->g(Lv6/d;)V

    return-void
.end method

.method private f(Lv6/d;I)V
    .locals 3

    iget-object v0, p0, Lcom/roblox/client/app/c;->a:Lv6/a;

    iget-object v1, p0, Lcom/roblox/client/app/c;->c:Landroid/app/Activity;

    new-instance v2, Lcom/roblox/client/app/c$c;

    invoke-direct {v2, p0}, Lcom/roblox/client/app/c$c;-><init>(Lcom/roblox/client/app/c;)V

    invoke-interface {v0, v1, p2, p1, v2}, Lv6/a;->f(Landroid/app/Activity;ILv6/d;Lv6/a$a;)V

    return-void
.end method

.method private g(Lv6/d;)V
    .locals 1

    invoke-virtual {p1}, Lv6/d;->a()Ljava/lang/String;

    move-result-object p1

    const-string v0, "AutoFillCredentials"

    invoke-static {v0, p1}, Lcom/roblox/engine/jni/memstorage/MemStorage;->setItem(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public c()V
    .locals 3

    .line 1
    new-instance v0, Lu8/a;

    iget-object v1, p0, Lcom/roblox/client/app/c;->c:Landroid/app/Activity;

    new-instance v2, Lv6/b;

    invoke-direct {v2}, Lv6/b;-><init>()V

    invoke-direct {v0, v1, v2}, Lu8/a;-><init>(Landroid/app/Activity;Lv6/b;)V

    iput-object v0, p0, Lcom/roblox/client/app/c;->a:Lv6/a;

    .line 2
    new-instance v0, Lcom/roblox/client/app/c$a;

    invoke-direct {v0, p0}, Lcom/roblox/client/app/c$a;-><init>(Lcom/roblox/client/app/c;)V

    const-string v1, "AuthenticatedCredentials"

    invoke-static {v1, v0}, Lcom/roblox/engine/jni/memstorage/MemStorage;->bind(Ljava/lang/String;Lcom/roblox/engine/jni/memstorage/Callback;)Lcom/roblox/engine/jni/memstorage/Connection;

    move-result-object v0

    iput-object v0, p0, Lcom/roblox/client/app/c;->b:Lcom/roblox/engine/jni/memstorage/Connection;

    return-void
.end method

.method public d(ILandroid/content/Intent;)V
    .locals 1

    const/4 v0, -0x1

    if-ne p1, v0, :cond_0

    .line 1
    iget-object p1, p0, Lcom/roblox/client/app/c;->a:Lv6/a;

    invoke-interface {p1}, Lv6/a;->h()V

    .line 2
    iget-object p1, p0, Lcom/roblox/client/app/c;->a:Lv6/a;

    invoke-interface {p1, p2}, Lv6/a;->g(Landroid/content/Intent;)Lv6/d;

    move-result-object p1

    .line 3
    invoke-direct {p0, p1}, Lcom/roblox/client/app/c;->g(Lv6/d;)V

    :cond_0
    return-void
.end method

.method public e()V
    .locals 4

    iget-object v0, p0, Lcom/roblox/client/app/c;->a:Lv6/a;

    iget-object v1, p0, Lcom/roblox/client/app/c;->c:Landroid/app/Activity;

    new-instance v2, Lcom/roblox/client/app/c$b;

    invoke-direct {v2, p0}, Lcom/roblox/client/app/c$b;-><init>(Lcom/roblox/client/app/c;)V

    const/16 v3, 0x4e99

    invoke-interface {v0, v1, v3, v2}, Lv6/a;->c(Landroid/app/Activity;ILv6/a$b;)V

    return-void
.end method

.method public h()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/roblox/client/app/c;->b:Lcom/roblox/engine/jni/memstorage/Connection;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/roblox/engine/jni/memstorage/Connection;->disconnect()V

    const/4 v0, 0x0

    .line 3
    iput-object v0, p0, Lcom/roblox/client/app/c;->b:Lcom/roblox/engine/jni/memstorage/Connection;

    :cond_0
    return-void
.end method
