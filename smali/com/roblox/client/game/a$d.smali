.class Lcom/roblox/client/game/a$d;
.super Lf7/f;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/roblox/client/game/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "d"
.end annotation


# instance fields
.field private a:Lcom/roblox/engine/jni/OnAppBridgeNotificationListener;

.field final synthetic b:Lcom/roblox/client/game/a;


# direct methods
.method private constructor <init>(Lcom/roblox/client/game/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/roblox/client/game/a$d;->b:Lcom/roblox/client/game/a;

    invoke-direct {p0}, Lf7/f;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/roblox/client/game/a;Lcom/roblox/client/game/a$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/roblox/client/game/a$d;-><init>(Lcom/roblox/client/game/a;)V

    return-void
.end method


# virtual methods
.method public b(J)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/roblox/client/game/a$d;->b:Lcom/roblox/client/game/a;

    invoke-static {p1}, Lcom/roblox/client/game/a;->C2(Lcom/roblox/client/game/a;)Lg9/a;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 2
    iget-object p1, p0, Lcom/roblox/client/game/a$d;->b:Lcom/roblox/client/game/a;

    invoke-static {p1}, Lcom/roblox/client/game/a;->C2(Lcom/roblox/client/game/a;)Lg9/a;

    move-result-object p1

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Lg9/a;->e(Z)V

    :cond_0
    return-void
.end method

.method public e(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/roblox/client/game/a$d;->b:Lcom/roblox/client/game/a;

    invoke-static {p1}, Lcom/roblox/client/game/a;->A2(Lcom/roblox/client/game/a;)Lcom/roblox/client/game/a$f;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 2
    iget-object p1, p0, Lcom/roblox/client/game/a$d;->b:Lcom/roblox/client/game/a;

    invoke-static {p1}, Lcom/roblox/client/game/a;->A2(Lcom/roblox/client/game/a;)Lcom/roblox/client/game/a$f;

    move-result-object p1

    const/4 v0, 0x1

    invoke-interface {p1, v0}, Lcom/roblox/client/s;->b(Z)V

    :cond_0
    return-void
.end method

.method public f(Ljava/lang/String;Ljava/lang/String;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/roblox/client/game/a$d;->a:Lcom/roblox/engine/jni/OnAppBridgeNotificationListener;

    if-nez v0, :cond_0

    .line 2
    invoke-static {}, Lcom/roblox/client/n;->h()Lcom/roblox/client/n;

    move-result-object v0

    new-instance v1, Lcom/roblox/client/game/a$c;

    iget-object v2, p0, Lcom/roblox/client/game/a$d;->b:Lcom/roblox/client/game/a;

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3}, Lcom/roblox/client/game/a$c;-><init>(Lcom/roblox/client/game/a;Lcom/roblox/client/game/a$a;)V

    new-instance v2, Lcom/roblox/client/game/a$e;

    iget-object v4, p0, Lcom/roblox/client/game/a$d;->b:Lcom/roblox/client/game/a;

    invoke-direct {v2, v4, v3}, Lcom/roblox/client/game/a$e;-><init>(Lcom/roblox/client/game/a;Lcom/roblox/client/game/a$a;)V

    invoke-virtual {v0, v1, v2}, Lcom/roblox/client/n;->a(Lcom/roblox/client/game/c$a;Lcom/roblox/client/game/c$b;)Lcom/roblox/client/game/c;

    move-result-object v0

    iput-object v0, p0, Lcom/roblox/client/game/a$d;->a:Lcom/roblox/engine/jni/OnAppBridgeNotificationListener;

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/roblox/client/game/a$d;->a:Lcom/roblox/engine/jni/OnAppBridgeNotificationListener;

    invoke-virtual {v0, p1, p2}, Lcom/roblox/engine/jni/OnAppBridgeNotificationListener;->a(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public i(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/roblox/client/game/a$d;->b:Lcom/roblox/client/game/a;

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->p()Landroidx/fragment/app/d;

    move-result-object v0

    invoke-static {v0, p2, p1}, Lcom/roblox/client/g;->f(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public j(JLjava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/roblox/client/game/a$d;->b:Lcom/roblox/client/game/a;

    invoke-static {v0}, Lcom/roblox/client/game/a;->G2(Lcom/roblox/client/game/a;)Le8/b;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3}, Le8/b;->g(JLjava/lang/String;)V

    return-void
.end method

.method public k(JLjava/lang/String;Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/roblox/client/game/a$d;->b:Lcom/roblox/client/game/a;

    invoke-static {v0}, Lcom/roblox/client/game/a;->G2(Lcom/roblox/client/game/a;)Le8/b;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3, p4}, Le8/b;->h(JLjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public l(JLjava/lang/String;Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/roblox/client/game/a$d;->b:Lcom/roblox/client/game/a;

    invoke-static {v0}, Lcom/roblox/client/game/a;->G2(Lcom/roblox/client/game/a;)Le8/b;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3, p4}, Le8/b;->i(JLjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public p()Lf7/h0;
    .locals 1

    iget-object v0, p0, Lcom/roblox/client/game/a$d;->b:Lcom/roblox/client/game/a;

    invoke-static {v0}, Lcom/roblox/client/game/a;->F2(Lcom/roblox/client/game/a;)Lf7/h0;

    move-result-object v0

    return-object v0
.end method

.method public s()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/roblox/client/game/a$d;->a:Lcom/roblox/engine/jni/OnAppBridgeNotificationListener;

    if-nez v0, :cond_0

    .line 2
    invoke-static {}, Lcom/roblox/client/n;->h()Lcom/roblox/client/n;

    move-result-object v0

    new-instance v1, Lcom/roblox/client/game/a$c;

    iget-object v2, p0, Lcom/roblox/client/game/a$d;->b:Lcom/roblox/client/game/a;

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3}, Lcom/roblox/client/game/a$c;-><init>(Lcom/roblox/client/game/a;Lcom/roblox/client/game/a$a;)V

    new-instance v2, Lcom/roblox/client/game/a$e;

    iget-object v4, p0, Lcom/roblox/client/game/a$d;->b:Lcom/roblox/client/game/a;

    invoke-direct {v2, v4, v3}, Lcom/roblox/client/game/a$e;-><init>(Lcom/roblox/client/game/a;Lcom/roblox/client/game/a$a;)V

    invoke-virtual {v0, v1, v2}, Lcom/roblox/client/n;->a(Lcom/roblox/client/game/c$a;Lcom/roblox/client/game/c$b;)Lcom/roblox/client/game/c;

    move-result-object v0

    iput-object v0, p0, Lcom/roblox/client/game/a$d;->a:Lcom/roblox/engine/jni/OnAppBridgeNotificationListener;

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/roblox/client/game/a$d;->a:Lcom/roblox/engine/jni/OnAppBridgeNotificationListener;

    check-cast v0, Lcom/roblox/client/game/c;

    invoke-virtual {v0}, Lcom/roblox/client/game/c;->d()V

    return-void
.end method
