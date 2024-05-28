.class final Ld5/g0;
.super Ld5/y;
.source "SourceFile"


# instance fields
.field final synthetic o:Ld5/c;


# direct methods
.method constructor <init>(Ld5/c;)V
    .locals 0

    iput-object p1, p0, Ld5/g0;->o:Ld5/c;

    invoke-direct {p0}, Ld5/y;-><init>()V

    return-void
.end method


# virtual methods
.method public final b()V
    .locals 2

    .line 1
    iget-object v0, p0, Ld5/g0;->o:Ld5/c;

    iget-object v0, v0, Ld5/c;->a:Ld5/d;

    invoke-static {v0}, Ld5/d;->s(Ld5/d;)V

    iget-object v0, p0, Ld5/g0;->o:Ld5/c;

    iget-object v0, v0, Ld5/c;->a:Ld5/d;

    const/4 v1, 0x0

    .line 2
    invoke-static {v0, v1}, Ld5/d;->n(Ld5/d;Landroid/os/IInterface;)V

    iget-object v0, p0, Ld5/g0;->o:Ld5/c;

    iget-object v0, v0, Ld5/c;->a:Ld5/d;

    const/4 v1, 0x0

    .line 3
    invoke-static {v0, v1}, Ld5/d;->m(Ld5/d;Z)V

    return-void
.end method
