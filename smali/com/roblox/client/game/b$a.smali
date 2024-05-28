.class Lcom/roblox/client/game/b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roblox/client/game/b$h;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/roblox/client/game/b;->s(Landroid/content/Context;Lcom/roblox/client/game/b$h;Z)V
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

    iput-object p1, p0, Lcom/roblox/client/game/b$a;->b:Lcom/roblox/client/game/b;

    iput-object p2, p0, Lcom/roblox/client/game/b$a;->a:Lcom/roblox/client/game/b$h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 2

    .line 1
    invoke-static {}, Lma/a;->e()Lma/a;

    move-result-object v0

    const-string v1, "update_setting_to_app_bridge_end"

    invoke-virtual {v0, v1}, Lma/a;->b(Ljava/lang/String;)V

    if-nez p1, :cond_0

    .line 2
    invoke-static {}, Lr8/c;->d()V

    .line 3
    iget-object p1, p0, Lcom/roblox/client/game/b$a;->a:Lcom/roblox/client/game/b$h;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Lcom/roblox/client/game/b$h;->a(I)V

    goto :goto_0

    .line 4
    :cond_0
    iget-object p1, p0, Lcom/roblox/client/game/b$a;->a:Lcom/roblox/client/game/b$h;

    const/4 v0, 0x1

    invoke-interface {p1, v0}, Lcom/roblox/client/game/b$h;->a(I)V

    :goto_0
    return-void
.end method
