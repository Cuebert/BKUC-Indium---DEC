.class Lf7/y$a;
.super Lcom/roblox/client/components/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lf7/y;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/roblox/client/components/b<",
        "Lcom/roblox/engine/jni/model/NativeTextBoxInfo;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic r:Lf7/y;


# direct methods
.method public constructor <init>(Lf7/y;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lf7/y$a;->r:Lf7/y;

    .line 2
    invoke-direct {p0, p2}, Lcom/roblox/client/components/b;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method protected bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/roblox/engine/jni/model/NativeTextBoxInfo;

    invoke-virtual {p0, p1}, Lf7/y$a;->f(Lcom/roblox/engine/jni/model/NativeTextBoxInfo;)V

    return-void
.end method

.method protected f(Lcom/roblox/engine/jni/model/NativeTextBoxInfo;)V
    .locals 2

    iget-object v0, p0, Lf7/y$a;->r:Lf7/y;

    invoke-static {v0}, Lf7/y;->r(Lf7/y;)Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lf7/y$a$a;

    invoke-direct {v1, p0, p1}, Lf7/y$a$a;-><init>(Lf7/y$a;Lcom/roblox/engine/jni/model/NativeTextBoxInfo;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
