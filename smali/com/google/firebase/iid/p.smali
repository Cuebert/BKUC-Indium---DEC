.class public final Lcom/google/firebase/iid/p;
.super Landroid/os/Binder;
.source "SourceFile"


# instance fields
.field private final c:Lr5/n;


# direct methods
.method public constructor <init>(Lr5/n;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroid/os/Binder;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/google/firebase/iid/p;->c:Lr5/n;

    return-void
.end method


# virtual methods
.method final a(Lcom/google/firebase/iid/s;)V
    .locals 3

    .line 1
    invoke-static {}, Landroid/os/Binder;->getCallingUid()I

    move-result v0

    invoke-static {}, Landroid/os/Process;->myUid()I

    move-result v1

    if-ne v0, v1, :cond_1

    const/4 v0, 0x3

    const-string v1, "FirebaseInstanceId"

    .line 2
    invoke-static {v1, v0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "service received new intent via bind strategy"

    .line 3
    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/google/firebase/iid/p;->c:Lr5/n;

    iget-object v1, p1, Lcom/google/firebase/iid/s;->a:Landroid/content/Intent;

    .line 5
    invoke-interface {v0, v1}, Lr5/n;->a(Landroid/content/Intent;)Lg4/l;

    move-result-object v0

    .line 6
    invoke-static {}, Lcom/google/firebase/iid/a;->b()Ljava/util/concurrent/Executor;

    move-result-object v1

    new-instance v2, Lcom/google/firebase/iid/o;

    invoke-direct {v2, p1}, Lcom/google/firebase/iid/o;-><init>(Lcom/google/firebase/iid/s;)V

    invoke-virtual {v0, v1, v2}, Lg4/l;->c(Ljava/util/concurrent/Executor;Lg4/f;)Lg4/l;

    return-void

    .line 7
    :cond_1
    new-instance p1, Ljava/lang/SecurityException;

    const-string v0, "Binding only allowed within app"

    invoke-direct {p1, v0}, Ljava/lang/SecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
