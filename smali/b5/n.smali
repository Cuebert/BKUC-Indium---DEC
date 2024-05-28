.class final Lb5/n;
.super Lb5/s;
.source "SourceFile"


# instance fields
.field final synthetic p:J

.field final synthetic q:Lg4/m;

.field final synthetic r:Lb5/t;


# direct methods
.method constructor <init>(Lb5/t;Lg4/m;JLg4/m;)V
    .locals 0

    iput-object p1, p0, Lb5/n;->r:Lb5/t;

    iput-wide p3, p0, Lb5/n;->p:J

    iput-object p5, p0, Lb5/n;->q:Lg4/m;

    invoke-direct {p0, p1, p2}, Lb5/s;-><init>(Lb5/t;Lg4/m;)V

    return-void
.end method


# virtual methods
.method protected final b()V
    .locals 6

    .line 1
    iget-object v0, p0, Lb5/n;->r:Lb5/t;

    invoke-static {v0}, Lb5/t;->g(Lb5/t;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    new-instance v0, Lb5/b;

    const/4 v1, -0x2

    const/4 v2, 0x0

    .line 3
    invoke-direct {v0, v1, v2}, Lb5/b;-><init>(ILjava/lang/Throwable;)V

    .line 4
    invoke-super {p0, v0}, Lb5/s;->a(Ljava/lang/Exception;)V

    return-void

    :cond_0
    :try_start_0
    iget-object v0, p0, Lb5/n;->r:Lb5/t;

    iget-object v1, v0, Lb5/t;->d:Ld5/d;

    invoke-virtual {v1}, Ld5/d;->e()Landroid/os/IInterface;

    move-result-object v1

    .line 5
    check-cast v1, Ld5/u;

    iget-wide v2, p0, Lb5/n;->p:J

    .line 6
    invoke-static {v0, v2, v3}, Lb5/t;->b(Lb5/t;J)Landroid/os/Bundle;

    move-result-object v0

    new-instance v2, Lb5/r;

    iget-object v3, p0, Lb5/n;->r:Lb5/t;

    iget-object v4, p0, Lb5/n;->q:Lg4/m;

    invoke-direct {v2, v3, v4}, Lb5/r;-><init>(Lb5/t;Lg4/m;)V

    .line 7
    invoke-interface {v1, v0, v2}, Ld5/u;->I(Landroid/os/Bundle;Ld5/w;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    iget-object v1, p0, Lb5/n;->r:Lb5/t;

    invoke-static {v1}, Lb5/t;->f(Lb5/t;)Ld5/x;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    iget-wide v4, p0, Lb5/n;->p:J

    .line 8
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    aput-object v4, v2, v3

    const-string v3, "warmUpIntegrityToken(%s)"

    invoke-virtual {v1, v0, v3, v2}, Ld5/x;->a(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)I

    iget-object v1, p0, Lb5/n;->q:Lg4/m;

    .line 9
    new-instance v2, Lb5/b;

    const/16 v3, -0x64

    invoke-direct {v2, v3, v0}, Lb5/b;-><init>(ILjava/lang/Throwable;)V

    invoke-virtual {v1, v2}, Lg4/m;->d(Ljava/lang/Exception;)Z

    return-void
.end method
