.class final Ld5/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/ServiceConnection;


# instance fields
.field final synthetic a:Ld5/d;


# direct methods
.method synthetic constructor <init>(Ld5/d;Ld5/b;)V
    .locals 0

    iput-object p1, p0, Ld5/c;->a:Ld5/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 3

    .line 1
    iget-object v0, p0, Ld5/c;->a:Ld5/d;

    invoke-static {v0}, Ld5/d;->f(Ld5/d;)Ld5/x;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const-string p1, "ServiceConnectionImpl.onServiceConnected(%s)"

    invoke-virtual {v0, p1, v1}, Ld5/x;->b(Ljava/lang/String;[Ljava/lang/Object;)I

    iget-object p1, p0, Ld5/c;->a:Ld5/d;

    new-instance v0, Ld5/f0;

    invoke-direct {v0, p0, p2}, Ld5/f0;-><init>(Ld5/c;Landroid/os/IBinder;)V

    .line 2
    invoke-virtual {p1}, Ld5/d;->c()Landroid/os/Handler;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 3

    .line 1
    iget-object v0, p0, Ld5/c;->a:Ld5/d;

    invoke-static {v0}, Ld5/d;->f(Ld5/d;)Ld5/x;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const-string p1, "ServiceConnectionImpl.onServiceDisconnected(%s)"

    invoke-virtual {v0, p1, v1}, Ld5/x;->b(Ljava/lang/String;[Ljava/lang/Object;)I

    iget-object p1, p0, Ld5/c;->a:Ld5/d;

    new-instance v0, Ld5/g0;

    invoke-direct {v0, p0}, Ld5/g0;-><init>(Ld5/c;)V

    .line 2
    invoke-virtual {p1}, Ld5/d;->c()Landroid/os/Handler;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
