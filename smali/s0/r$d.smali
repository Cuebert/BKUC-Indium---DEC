.class final Ls0/r$d;
.super Lkotlin/jvm/internal/j;
.source "SourceFile"

# interfaces
.implements Ldb/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ls0/r;->onGetCredential(Landroid/content/Context;Ls0/t;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;Ls0/l;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/j;",
        "Ldb/a<",
        "Lta/l;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic n:Ls0/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ls0/l<",
            "Ls0/u;",
            "Lt0/m;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Ls0/l;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ls0/l<",
            "Ls0/u;",
            "Lt0/m;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Ls0/r$d;->n:Ls0/l;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ls0/r$d;->invoke()V

    sget-object v0, Lta/l;->a:Lta/l;

    return-object v0
.end method

.method public final invoke()V
    .locals 3

    .line 2
    iget-object v0, p0, Ls0/r$d;->n:Ls0/l;

    .line 3
    new-instance v1, Lt0/q;

    const-string v2, "Your device doesn\'t support credential manager"

    invoke-direct {v1, v2}, Lt0/q;-><init>(Ljava/lang/CharSequence;)V

    .line 4
    invoke-interface {v0, v1}, Ls0/l;->a(Ljava/lang/Object;)V

    return-void
.end method
