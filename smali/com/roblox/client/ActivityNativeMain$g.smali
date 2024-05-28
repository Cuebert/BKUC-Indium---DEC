.class Lcom/roblox/client/ActivityNativeMain$g;
.super Lcom/roblox/client/c1$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/roblox/client/ActivityNativeMain;->P1()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/roblox/client/ActivityNativeMain;


# direct methods
.method constructor <init>(Lcom/roblox/client/ActivityNativeMain;)V
    .locals 0

    iput-object p1, p0, Lcom/roblox/client/ActivityNativeMain$g;->a:Lcom/roblox/client/ActivityNativeMain;

    invoke-direct {p0}, Lcom/roblox/client/c1$b;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/roblox/client/c1$d;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Lcom/roblox/client/c1$d;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget-object p1, p0, Lcom/roblox/client/ActivityNativeMain$g;->a:Lcom/roblox/client/ActivityNativeMain;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/roblox/client/i0;->x1(Z)V

    goto :goto_0

    .line 3
    :cond_0
    invoke-virtual {p1}, Lcom/roblox/client/c1$d;->c()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 4
    iget-object p1, p0, Lcom/roblox/client/ActivityNativeMain$g;->a:Lcom/roblox/client/ActivityNativeMain;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/roblox/client/i0;->x1(Z)V

    goto :goto_0

    .line 5
    :cond_1
    invoke-static {}, Lc9/l;->g()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Lcom/roblox/client/c1$d;->a()Z

    move-result p1

    if-eqz p1, :cond_2

    .line 6
    invoke-static {}, Lx7/b;->e()Lx7/b;

    move-result-object p1

    iget-object v0, p0, Lcom/roblox/client/ActivityNativeMain$g;->a:Lcom/roblox/client/ActivityNativeMain;

    sget-object v1, Lx7/b$f;->n:Lx7/b$f;

    invoke-virtual {p1, v0, v1}, Lx7/b;->h(Landroid/app/Activity;Lx7/b$f;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public b(Lcom/roblox/client/c1$d;)V
    .locals 1

    .line 1
    invoke-static {}, Lcom/roblox/client/p0;->m0()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/roblox/client/c1$d;->c()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 2
    iget-object p1, p0, Lcom/roblox/client/ActivityNativeMain$g;->a:Lcom/roblox/client/ActivityNativeMain;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/roblox/client/i0;->x1(Z)V

    :cond_0
    return-void
.end method
