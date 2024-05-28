.class Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback;->o(JZ[BLcom/roblox/engine/jni/model/NativeTextBoxInfo;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic n:J

.field final synthetic o:Z

.field final synthetic p:[B

.field final synthetic q:Lcom/roblox/engine/jni/model/NativeTextBoxInfo;

.field final synthetic r:Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback;


# direct methods
.method constructor <init>(Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback;JZ[BLcom/roblox/engine/jni/model/NativeTextBoxInfo;)V
    .locals 0

    iput-object p1, p0, Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback$1;->r:Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback;

    iput-wide p2, p0, Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback$1;->n:J

    iput-boolean p4, p0, Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback$1;->o:Z

    iput-object p5, p0, Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback$1;->p:[B

    iput-object p6, p0, Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback$1;->q:Lcom/roblox/engine/jni/model/NativeTextBoxInfo;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    iget-object v0, p0, Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback$1;->r:Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback;

    iget-wide v1, p0, Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback$1;->n:J

    iget-boolean v3, p0, Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback$1;->o:Z

    iget-object v4, p0, Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback$1;->p:[B

    iget-object v5, p0, Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback$1;->q:Lcom/roblox/engine/jni/model/NativeTextBoxInfo;

    invoke-static/range {v0 .. v5}, Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback;->p(Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback;JZ[BLcom/roblox/engine/jni/model/NativeTextBoxInfo;)V

    return-void
.end method
