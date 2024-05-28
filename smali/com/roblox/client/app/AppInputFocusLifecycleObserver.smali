.class public Lcom/roblox/client/app/AppInputFocusLifecycleObserver;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/k;


# instance fields
.field private final n:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "rbx.datamodel"

    .line 2
    iput-object v0, p0, Lcom/roblox/client/app/AppInputFocusLifecycleObserver;->n:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public onMenuOptionActivated()V
    .locals 3
    .annotation runtime Landroidx/lifecycle/t;
        value = .enum Landroidx/lifecycle/f$b;->ON_CREATE:Landroidx/lifecycle/f$b;
    .end annotation

    const-string v0, "rbx.datamodel"

    const-string v1, "onMenuOptionActivated"

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

.method public onMenuOptionClosed()V
    .locals 3
    .annotation runtime Landroidx/lifecycle/t;
        value = .enum Landroidx/lifecycle/f$b;->ON_DESTROY:Landroidx/lifecycle/f$b;
    .end annotation

    const-string v0, "rbx.datamodel"

    const-string v1, "onMenuOptionClosed"

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
