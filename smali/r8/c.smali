.class public Lr8/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static a()Z
    .locals 1

    sget-boolean v0, Lr8/c;->a:Z

    return v0
.end method

.method public static b()Z
    .locals 1

    .line 1
    invoke-static {}, Lr8/c;->c()Z

    move-result v0

    if-nez v0, :cond_1

    .line 2
    invoke-static {}, Lc9/l;->g()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public static c()Z
    .locals 1

    invoke-static {}, Lcom/roblox/engine/jni/NativeSettingsInterface;->nativeIsLuaLoginEnabled()Z

    move-result v0

    return v0
.end method

.method public static d()V
    .locals 1

    const-string v0, "AndroidRestartAfterProcDeathEnabled"

    invoke-static {v0}, Lcom/roblox/engine/jni/NativeSettingsInterface;->nativeGetFFlag(Ljava/lang/String;)Z

    move-result v0

    sput-boolean v0, Lr8/c;->a:Z

    return-void
.end method
