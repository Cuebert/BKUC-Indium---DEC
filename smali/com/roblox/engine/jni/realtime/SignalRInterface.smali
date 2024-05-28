.class public Lcom/roblox/engine/jni/realtime/SignalRInterface;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static native nativeStartSignalR(Lcom/roblox/engine/jni/realtime/SignalRInterfaceCallback;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
.end method

.method public static native nativeStopSignalR(Z)V
.end method
