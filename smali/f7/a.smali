.class public final synthetic Lf7/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Lcom/roblox/client/game/b;

.field public final synthetic b:Landroid/content/Context;

.field public final synthetic c:Lcom/roblox/client/game/b$h;


# direct methods
.method public synthetic constructor <init>(Lcom/roblox/client/game/b;Landroid/content/Context;Lcom/roblox/client/game/b$h;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf7/a;->a:Lcom/roblox/client/game/b;

    iput-object p2, p0, Lf7/a;->b:Landroid/content/Context;

    iput-object p3, p0, Lf7/a;->c:Lcom/roblox/client/game/b$h;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lf7/a;->a:Lcom/roblox/client/game/b;

    iget-object v1, p0, Lf7/a;->b:Landroid/content/Context;

    iget-object v2, p0, Lf7/a;->c:Lcom/roblox/client/game/b$h;

    invoke-static {v0, v1, v2}, Lcom/roblox/client/game/b;->c(Lcom/roblox/client/game/b;Landroid/content/Context;Lcom/roblox/client/game/b$h;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
