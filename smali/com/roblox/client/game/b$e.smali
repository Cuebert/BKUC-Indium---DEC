.class public Lcom/roblox/client/game/b$e;
.super Lcom/roblox/engine/jni/EngineJavaCallbackWrapper;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/roblox/client/game/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "e"
.end annotation


# instance fields
.field final synthetic b:Lcom/roblox/client/game/b;


# direct methods
.method public constructor <init>(Lcom/roblox/client/game/b;Lcom/roblox/engine/jni/EngineJavaCallback2;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/roblox/client/game/b$e;->b:Lcom/roblox/client/game/b;

    .line 2
    invoke-direct {p0, p2}, Lcom/roblox/engine/jni/EngineJavaCallbackWrapper;-><init>(Lcom/roblox/engine/jni/EngineJavaCallback2;)V

    return-void
.end method


# virtual methods
.method public f(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "APP_READY"

    .line 1
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/roblox/client/game/b$e;->b:Lcom/roblox/client/game/b;

    invoke-virtual {v0, p2}, Lcom/roblox/client/game/b;->q(Ljava/lang/String;)V

    .line 3
    :cond_0
    invoke-super {p0, p1, p2}, Lcom/roblox/engine/jni/EngineJavaCallbackWrapper;->f(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
