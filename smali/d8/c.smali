.class public Ld8/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ld8/f;


# instance fields
.field private final a:Ljava/lang/String;

.field private b:Landroid/content/Context;

.field private c:Lcom/roblox/client/provider/ShellConfigurationContentProvider;


# direct methods
.method public constructor <init>(Lcom/roblox/client/provider/ShellConfigurationContentProvider;Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "rbx.config"

    .line 2
    iput-object v0, p0, Ld8/c;->a:Ljava/lang/String;

    .line 3
    iput-object p1, p0, Ld8/c;->c:Lcom/roblox/client/provider/ShellConfigurationContentProvider;

    .line 4
    iput-object p2, p0, Ld8/c;->b:Landroid/content/Context;

    return-void
.end method

.method public static synthetic d(Ld8/c;)V
    .locals 0

    invoke-direct {p0}, Ld8/c;->g()V

    return-void
.end method

.method private e()Lu6/c;
    .locals 1

    iget-object v0, p0, Ld8/c;->c:Lcom/roblox/client/provider/ShellConfigurationContentProvider;

    invoke-virtual {v0}, Lcom/roblox/client/provider/ShellConfigurationContentProvider;->d()Lu6/c;

    move-result-object v0

    return-object v0
.end method

.method private f()Lu6/c$a;
    .locals 1

    iget-object v0, p0, Ld8/c;->c:Lcom/roblox/client/provider/ShellConfigurationContentProvider;

    invoke-virtual {v0}, Lcom/roblox/client/provider/ShellConfigurationContentProvider;->c()Lu6/c$a;

    move-result-object v0

    return-object v0
.end method

.method private synthetic g()V
    .locals 3

    .line 1
    iget-object v0, p0, Ld8/c;->b:Landroid/content/Context;

    .line 2
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/roblox/client/c0;->l3:I

    const/4 v2, 0x0

    .line 3
    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v0

    .line 4
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    return-void
.end method


# virtual methods
.method public a(Landroid/net/Uri;)Landroid/database/Cursor;
    .locals 1

    new-instance p1, Lc8/b;

    iget-object v0, p0, Ld8/c;->c:Lcom/roblox/client/provider/ShellConfigurationContentProvider;

    invoke-virtual {v0}, Lcom/roblox/client/provider/ShellConfigurationContentProvider;->d()Lu6/c;

    move-result-object v0

    invoke-direct {p1, v0}, Lc8/b;-><init>(Lu6/c;)V

    return-object p1
.end method

.method public b(Landroid/net/Uri;Landroid/content/ContentValues;)V
    .locals 3

    const-string p1, "settings_param"

    .line 1
    invoke-virtual {p2, p1}, Landroid/content/ContentValues;->containsKey(Ljava/lang/String;)Z

    move-result v0

    const-string v1, "rbx.config"

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p2, p1}, Landroid/content/ContentValues;->getAsString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "new payload:"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lc9/k;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 4
    invoke-direct {p0}, Ld8/c;->e()Lu6/c;

    move-result-object v0

    invoke-virtual {v0, p1}, Lu6/c;->j(Ljava/lang/String;)V

    .line 5
    invoke-direct {p0}, Ld8/c;->f()Lu6/c$a;

    move-result-object v0

    invoke-interface {v0, p1}, Lu6/c$a;->b(Ljava/lang/String;)V

    :cond_0
    const-string p1, "channel_param"

    .line 6
    invoke-virtual {p2, p1}, Landroid/content/ContentValues;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 7
    invoke-virtual {p2, p1}, Landroid/content/ContentValues;->getAsString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 8
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "new robloxChannel:"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lc9/k;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 9
    invoke-direct {p0}, Ld8/c;->e()Lu6/c;

    move-result-object v0

    invoke-virtual {v0, p1}, Lu6/c;->m(Ljava/lang/String;)V

    .line 10
    invoke-direct {p0}, Ld8/c;->f()Lu6/c$a;

    move-result-object v0

    invoke-interface {v0, p1}, Lu6/c$a;->f(Ljava/lang/String;)V

    :cond_1
    const-string p1, "base_url_param"

    .line 11
    invoke-virtual {p2, p1}, Landroid/content/ContentValues;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 12
    invoke-virtual {p2, p1}, Landroid/content/ContentValues;->getAsString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 13
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "new baseUrl:"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lc9/k;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 14
    invoke-direct {p0}, Ld8/c;->e()Lu6/c;

    move-result-object v0

    invoke-virtual {v0, p1}, Lu6/c;->k(Ljava/lang/String;)V

    .line 15
    invoke-direct {p0}, Ld8/c;->f()Lu6/c$a;

    move-result-object v0

    invoke-interface {v0, p1}, Lu6/c$a;->e(Ljava/lang/String;)V

    :cond_2
    const-string p1, "user_agent_param"

    .line 16
    invoke-virtual {p2, p1}, Landroid/content/ContentValues;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 17
    invoke-virtual {p2, p1}, Landroid/content/ContentValues;->getAsString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 18
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "set user agent:"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lc9/k;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 19
    invoke-direct {p0}, Ld8/c;->e()Lu6/c;

    move-result-object v0

    invoke-virtual {v0, p1}, Lu6/c;->n(Ljava/lang/String;)V

    .line 20
    invoke-direct {p0}, Ld8/c;->f()Lu6/c$a;

    move-result-object v0

    invoke-interface {v0, p1}, Lu6/c$a;->a(Ljava/lang/String;)V

    :cond_3
    const-string p1, "dev_rpc_ip_port_override"

    .line 21
    invoke-virtual {p2, p1}, Landroid/content/ContentValues;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 22
    invoke-virtual {p2, p1}, Landroid/content/ContentValues;->getAsString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 23
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "set dev rpc ip and port:"

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {v1, p2}, Lc9/k;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 24
    invoke-direct {p0}, Ld8/c;->e()Lu6/c;

    move-result-object p2

    invoke-virtual {p2, p1}, Lu6/c;->l(Ljava/lang/String;)V

    .line 25
    invoke-direct {p0}, Ld8/c;->f()Lu6/c$a;

    move-result-object p2

    invoke-interface {p2, p1}, Lu6/c$a;->c(Ljava/lang/String;)V

    .line 26
    iget-object p2, p0, Ld8/c;->b:Landroid/content/Context;

    invoke-static {p2, p1}, Lcom/roblox/client/k;->e(Landroid/content/Context;Ljava/lang/String;)V

    .line 27
    new-instance p1, Landroid/os/Handler;

    iget-object p2, p0, Ld8/c;->b:Landroid/content/Context;

    .line 28
    invoke-virtual {p2}, Landroid/content/Context;->getMainLooper()Landroid/os/Looper;

    move-result-object p2

    invoke-direct {p1, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance p2, Ld8/b;

    invoke-direct {p2, p0}, Ld8/b;-><init>(Ld8/c;)V

    invoke-virtual {p1, p2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 29
    iget-object p1, p0, Ld8/c;->b:Landroid/content/Context;

    invoke-static {p1}, Lw8/k;->t(Landroid/content/Context;)Lw8/k;

    move-result-object p1

    invoke-virtual {p1}, Lw8/k;->w()Z

    move-result p1

    if-eqz p1, :cond_4

    const/4 p1, 0x1

    .line 30
    invoke-static {p1}, Lcom/roblox/client/p0;->P0(Z)V

    :cond_4
    return-void
.end method

.method public c(Ld8/f$a;)Lu6/a;
    .locals 1

    .line 1
    sget-object v0, Ld8/f$a;->n:Ld8/f$a;

    if-ne p1, v0, :cond_0

    .line 2
    sget-object p1, Lu6/a;->q:Lu6/a;

    return-object p1

    .line 3
    :cond_0
    sget-object v0, Ld8/f$a;->o:Ld8/f$a;

    if-ne p1, v0, :cond_1

    .line 4
    sget-object p1, Lu6/a;->r:Lu6/a;

    return-object p1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method
