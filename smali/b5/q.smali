.class final Lb5/q;
.super Lb5/p;
.source "SourceFile"


# instance fields
.field private final e:Ld5/x;


# direct methods
.method constructor <init>(Lb5/t;Lg4/m;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lb5/p;-><init>(Lb5/t;Lg4/m;)V

    new-instance p1, Ld5/x;

    const-string p2, "OnRequestIntegrityTokenCallback"

    .line 2
    invoke-direct {p1, p2}, Ld5/x;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Lb5/q;->e:Ld5/x;

    return-void
.end method


# virtual methods
.method public final h0(Landroid/os/Bundle;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1
    invoke-super {p0, p1}, Lb5/p;->h0(Landroid/os/Bundle;)V

    iget-object v0, p0, Lb5/q;->e:Ld5/x;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onRequestExpressIntegrityToken"

    .line 2
    invoke-virtual {v0, v2, v1}, Ld5/x;->b(Ljava/lang/String;[Ljava/lang/Object;)I

    const-string v0, "error"

    .line 3
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p0, Lb5/p;->c:Lg4/m;

    .line 4
    new-instance v1, Lb5/b;

    const/4 v2, 0x0

    .line 5
    invoke-direct {v1, v0, v2}, Lb5/b;-><init>(ILjava/lang/Throwable;)V

    .line 6
    invoke-virtual {p1, v1}, Lg4/m;->d(Ljava/lang/Exception;)Z

    return-void

    :cond_0
    iget-object v0, p0, Lb5/p;->c:Lg4/m;

    new-instance v1, Lb5/c0;

    invoke-direct {v1}, Lb5/c0;-><init>()V

    const-string v2, "token"

    .line 7
    invoke-virtual {p1, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Lb5/f;->a(Ljava/lang/String;)Lb5/f;

    .line 8
    invoke-virtual {v1}, Lb5/f;->b()Lb5/c$b;

    move-result-object p1

    .line 9
    invoke-virtual {v0, p1}, Lg4/m;->e(Ljava/lang/Object;)Z

    return-void
.end method
