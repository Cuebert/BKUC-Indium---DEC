.class Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback$11;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback;->b(J)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic n:J

.field final synthetic o:Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback;


# direct methods
.method constructor <init>(Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback;J)V
    .locals 0

    iput-object p1, p0, Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback$11;->o:Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback;

    iput-wide p2, p0, Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback$11;->n:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback$11;->o:Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback;

    iget-wide v1, p0, Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback$11;->n:J

    invoke-static {v0, v1, v2}, Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback;->q(Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback;J)V

    return-void
.end method
