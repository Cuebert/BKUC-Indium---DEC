.class public Lcom/roblox/client/RobloxWebActivity$DataModelFocusLifecycleObserver;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/k;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/roblox/client/RobloxWebActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "DataModelFocusLifecycleObserver"
.end annotation


# instance fields
.field final synthetic n:Lcom/roblox/client/RobloxWebActivity;


# direct methods
.method public constructor <init>(Lcom/roblox/client/RobloxWebActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/roblox/client/RobloxWebActivity$DataModelFocusLifecycleObserver;->n:Lcom/roblox/client/RobloxWebActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFragmentCreated()V
    .locals 3
    .annotation runtime Landroidx/lifecycle/t;
        value = .enum Landroidx/lifecycle/f$b;->ON_CREATE:Landroidx/lifecycle/f$b;
    .end annotation

    const-string v0, "RobloxActivity"

    const-string v1, "onFragmentCreated"

    .line 1
    invoke-static {v0, v1}, Lc9/k;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    new-instance v0, Lh9/a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lh9/a;-><init>(Z)V

    .line 3
    iget-object v1, v0, Lh9/c;->a:Ljava/lang/String;

    iget-object v2, v0, Lh9/c;->b:Ljava/lang/String;

    iget-object v0, v0, Lh9/c;->c:Ljava/lang/String;

    invoke-static {v1, v2, v0}, Lcom/roblox/engine/jni/NativeGLInterface;->nativeBroadcastEventWithNamespace(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public onFragmentDestroyed()V
    .locals 3
    .annotation runtime Landroidx/lifecycle/t;
        value = .enum Landroidx/lifecycle/f$b;->ON_DESTROY:Landroidx/lifecycle/f$b;
    .end annotation

    const-string v0, "RobloxActivity"

    const-string v1, "onFragmentDestroyed"

    .line 1
    invoke-static {v0, v1}, Lc9/k;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    new-instance v0, Lh9/a;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lh9/a;-><init>(Z)V

    .line 3
    iget-object v1, v0, Lh9/c;->a:Ljava/lang/String;

    iget-object v2, v0, Lh9/c;->b:Ljava/lang/String;

    iget-object v0, v0, Lh9/c;->c:Ljava/lang/String;

    invoke-static {v1, v2, v0}, Lcom/roblox/engine/jni/NativeGLInterface;->nativeBroadcastEventWithNamespace(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
