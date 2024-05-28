.class public Lz7/f;
.super Lcom/roblox/client/i0;
.source "SourceFile"


# instance fields
.field private final S:Ljava/lang/String;

.field protected T:Lz7/e;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/roblox/client/i0;-><init>()V

    const-string v0, "RobloxMVPActivity"

    .line 2
    iput-object v0, p0, Lz7/f;->S:Ljava/lang/String;

    return-void
.end method

.method private A1(Lz7/d;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lz7/f;->T:Lz7/e;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0, p1}, Lz7/e;->a(Lz7/d;)V

    goto :goto_0

    :cond_0
    const-string p1, "RobloxMVPActivity"

    const-string v0, "Lifecycle listener is null."

    .line 3
    invoke-static {p1, v0}, Lc9/k;->j(Ljava/lang/String;Ljava/lang/String;)I

    :goto_0
    return-void
.end method


# virtual methods
.method protected onCreate(Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/roblox/client/i0;->onCreate(Landroid/os/Bundle;)V

    .line 2
    sget-object p1, Lz7/d;->n:Lz7/d;

    invoke-direct {p0, p1}, Lz7/f;->A1(Lz7/d;)V

    return-void
.end method

.method protected onDestroy()V
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/roblox/client/i0;->onDestroy()V

    .line 2
    sget-object v0, Lz7/d;->s:Lz7/d;

    invoke-direct {p0, v0}, Lz7/f;->A1(Lz7/d;)V

    return-void
.end method

.method protected onPause()V
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/roblox/client/i0;->onPause()V

    .line 2
    sget-object v0, Lz7/d;->q:Lz7/d;

    invoke-direct {p0, v0}, Lz7/f;->A1(Lz7/d;)V

    return-void
.end method

.method protected onResume()V
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/roblox/client/i0;->onResume()V

    .line 2
    sget-object v0, Lz7/d;->p:Lz7/d;

    invoke-direct {p0, v0}, Lz7/f;->A1(Lz7/d;)V

    return-void
.end method

.method protected onStart()V
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/roblox/client/i0;->onStart()V

    .line 2
    sget-object v0, Lz7/d;->o:Lz7/d;

    invoke-direct {p0, v0}, Lz7/f;->A1(Lz7/d;)V

    return-void
.end method

.method protected onStop()V
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/roblox/client/i0;->onStop()V

    .line 2
    sget-object v0, Lz7/d;->r:Lz7/d;

    invoke-direct {p0, v0}, Lz7/f;->A1(Lz7/d;)V

    return-void
.end method
