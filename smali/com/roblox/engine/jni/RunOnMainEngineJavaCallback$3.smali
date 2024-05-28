.class Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback;->k(JLjava/lang/String;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic n:J

.field final synthetic o:Ljava/lang/String;

.field final synthetic p:Ljava/lang/String;

.field final synthetic q:Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback;


# direct methods
.method constructor <init>(Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback;JLjava/lang/String;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback$3;->q:Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback;

    iput-wide p2, p0, Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback$3;->n:J

    iput-object p4, p0, Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback$3;->o:Ljava/lang/String;

    iput-object p5, p0, Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback$3;->p:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    iget-object v0, p0, Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback$3;->q:Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback;

    iget-wide v1, p0, Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback$3;->n:J

    iget-object v3, p0, Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback$3;->o:Ljava/lang/String;

    iget-object v4, p0, Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback$3;->p:Ljava/lang/String;

    invoke-static {v0, v1, v2, v3, v4}, Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback;->w(Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback;JLjava/lang/String;Ljava/lang/String;)V

    return-void
.end method
