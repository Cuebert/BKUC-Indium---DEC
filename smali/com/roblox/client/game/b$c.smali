.class Lcom/roblox/client/game/b$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/roblox/client/game/b;->F(Landroid/view/Surface;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic n:Lcom/roblox/client/game/b$d;

.field final synthetic o:Lcom/roblox/client/game/b;


# direct methods
.method constructor <init>(Lcom/roblox/client/game/b;Lcom/roblox/client/game/b$d;)V
    .locals 0

    iput-object p1, p0, Lcom/roblox/client/game/b$c;->o:Lcom/roblox/client/game/b;

    iput-object p2, p0, Lcom/roblox/client/game/b$c;->n:Lcom/roblox/client/game/b$d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    iget-object v0, p0, Lcom/roblox/client/game/b$c;->n:Lcom/roblox/client/game/b$d;

    iget-object v0, v0, Lcom/roblox/client/game/b$d;->a:Landroid/app/Activity;

    invoke-static {v0}, Lcom/roblox/engine/jni/NativeGLInterface;->initMaquettesSDK(Landroid/app/Activity;)V

    return-void
.end method
