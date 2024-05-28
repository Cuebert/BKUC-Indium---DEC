.class Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback$10;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback;->f(Ljava/lang/String;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic n:Ljava/lang/String;

.field final synthetic o:Ljava/lang/String;

.field final synthetic p:Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback;


# direct methods
.method constructor <init>(Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback$10;->p:Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback;

    iput-object p2, p0, Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback$10;->n:Ljava/lang/String;

    iput-object p3, p0, Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback$10;->o:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback$10;->p:Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback;

    iget-object v1, p0, Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback$10;->n:Ljava/lang/String;

    iget-object v2, p0, Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback$10;->o:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback;->D(Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
