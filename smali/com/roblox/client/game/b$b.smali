.class Lcom/roblox/client/game/b$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roblox/client/game/b$h;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/roblox/client/game/b;->p(Lcom/roblox/client/game/b$h;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/roblox/client/game/b$h;

.field final synthetic b:Lcom/roblox/client/game/b;


# direct methods
.method constructor <init>(Lcom/roblox/client/game/b;Lcom/roblox/client/game/b$h;)V
    .locals 0

    iput-object p1, p0, Lcom/roblox/client/game/b$b;->b:Lcom/roblox/client/game/b;

    iput-object p2, p0, Lcom/roblox/client/game/b$b;->a:Lcom/roblox/client/game/b$h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 2

    if-nez p1, :cond_0

    .line 1
    iget-object v0, p0, Lcom/roblox/client/game/b$b;->b:Lcom/roblox/client/game/b;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/roblox/client/game/b;->d(Lcom/roblox/client/game/b;Z)Z

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/roblox/client/game/b$b;->a:Lcom/roblox/client/game/b$h;

    if-eqz v0, :cond_1

    .line 3
    invoke-interface {v0, p1}, Lcom/roblox/client/game/b$h;->a(I)V

    :cond_1
    return-void
.end method
