.class Lb5/p;
.super Ld5/v;
.source "SourceFile"


# instance fields
.field final c:Lg4/m;

.field final synthetic d:Lb5/t;


# direct methods
.method constructor <init>(Lb5/t;Lg4/m;)V
    .locals 0

    iput-object p1, p0, Lb5/p;->d:Lb5/t;

    invoke-direct {p0}, Ld5/v;-><init>()V

    iput-object p2, p0, Lb5/p;->c:Lg4/m;

    return-void
.end method


# virtual methods
.method public D(Landroid/os/Bundle;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object p1, p0, Lb5/p;->d:Lb5/t;

    iget-object p1, p1, Lb5/t;->d:Ld5/d;

    iget-object v0, p0, Lb5/p;->c:Lg4/m;

    invoke-virtual {p1, v0}, Ld5/d;->v(Lg4/m;)V

    return-void
.end method

.method public final U(Landroid/os/Bundle;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object p1, p0, Lb5/p;->d:Lb5/t;

    iget-object p1, p1, Lb5/t;->d:Ld5/d;

    iget-object v0, p0, Lb5/p;->c:Lg4/m;

    invoke-virtual {p1, v0}, Ld5/d;->v(Lg4/m;)V

    return-void
.end method

.method public h0(Landroid/os/Bundle;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object p1, p0, Lb5/p;->d:Lb5/t;

    iget-object p1, p1, Lb5/t;->d:Ld5/d;

    iget-object v0, p0, Lb5/p;->c:Lg4/m;

    invoke-virtual {p1, v0}, Ld5/d;->v(Lg4/m;)V

    return-void
.end method

.method public final z0(Landroid/os/Bundle;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object p1, p0, Lb5/p;->d:Lb5/t;

    iget-object p1, p1, Lb5/t;->d:Ld5/d;

    iget-object v0, p0, Lb5/p;->c:Lg4/m;

    invoke-virtual {p1, v0}, Ld5/d;->v(Lg4/m;)V

    return-void
.end method
