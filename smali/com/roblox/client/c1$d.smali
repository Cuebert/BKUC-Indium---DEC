.class public Lcom/roblox/client/c1$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/roblox/client/c1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "d"
.end annotation


# instance fields
.field public a:Lcom/roblox/client/c1$e;

.field public b:Ljava/lang/String;

.field public c:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    sget-object v0, Lcom/roblox/client/c1$e;->n:Lcom/roblox/client/c1$e;

    iput-object v0, p0, Lcom/roblox/client/c1$d;->a:Lcom/roblox/client/c1$e;

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 2

    iget-object v0, p0, Lcom/roblox/client/c1$d;->a:Lcom/roblox/client/c1$e;

    sget-object v1, Lcom/roblox/client/c1$e;->r:Lcom/roblox/client/c1$e;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public b()Z
    .locals 2

    iget-object v0, p0, Lcom/roblox/client/c1$d;->a:Lcom/roblox/client/c1$e;

    sget-object v1, Lcom/roblox/client/c1$e;->o:Lcom/roblox/client/c1$e;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public c()Z
    .locals 2

    iget-object v0, p0, Lcom/roblox/client/c1$d;->a:Lcom/roblox/client/c1$e;

    sget-object v1, Lcom/roblox/client/c1$e;->p:Lcom/roblox/client/c1$e;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public d()V
    .locals 1

    sget-object v0, Lcom/roblox/client/c1$e;->o:Lcom/roblox/client/c1$e;

    iput-object v0, p0, Lcom/roblox/client/c1$d;->a:Lcom/roblox/client/c1$e;

    return-void
.end method

.method public e()V
    .locals 1

    sget-object v0, Lcom/roblox/client/c1$e;->p:Lcom/roblox/client/c1$e;

    iput-object v0, p0, Lcom/roblox/client/c1$d;->a:Lcom/roblox/client/c1$e;

    return-void
.end method

.method public f()V
    .locals 1

    sget-object v0, Lcom/roblox/client/c1$e;->q:Lcom/roblox/client/c1$e;

    iput-object v0, p0, Lcom/roblox/client/c1$d;->a:Lcom/roblox/client/c1$e;

    return-void
.end method
