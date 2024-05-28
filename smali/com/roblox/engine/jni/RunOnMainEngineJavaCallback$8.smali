.class Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback$8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback;->n(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic n:I

.field final synthetic o:Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback;


# direct methods
.method constructor <init>(Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback;I)V
    .locals 0

    iput-object p1, p0, Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback$8;->o:Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback;

    iput p2, p0, Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback$8;->n:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback$8;->o:Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback;

    iget v1, p0, Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback$8;->n:I

    invoke-static {v0, v1}, Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback;->B(Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback;I)V

    return-void
.end method
