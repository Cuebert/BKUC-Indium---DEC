.class public abstract Lxa/c;
.super Lxa/a;
.source "SourceFile"


# instance fields
.field private final o:Lva/e;

.field private transient p:Lva/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lva/c<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lva/c;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lva/c<",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    if-eqz p1, :cond_0

    .line 3
    invoke-interface {p1}, Lva/c;->getContext()Lva/e;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-direct {p0, p1, v0}, Lxa/c;-><init>(Lva/c;Lva/e;)V

    return-void
.end method

.method public constructor <init>(Lva/c;Lva/e;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lva/c<",
            "Ljava/lang/Object;",
            ">;",
            "Lva/e;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1}, Lxa/a;-><init>(Lva/c;)V

    .line 2
    iput-object p2, p0, Lxa/c;->o:Lva/e;

    return-void
.end method


# virtual methods
.method protected e()V
    .locals 3

    .line 1
    iget-object v0, p0, Lxa/c;->p:Lva/c;

    if-eqz v0, :cond_0

    if-eq v0, p0, :cond_0

    .line 2
    invoke-virtual {p0}, Lxa/c;->getContext()Lva/e;

    move-result-object v1

    sget-object v2, Lva/d;->l:Lva/d$b;

    invoke-interface {v1, v2}, Lva/e;->i(Lva/e$b;)Lva/e$a;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/i;->c(Ljava/lang/Object;)V

    check-cast v1, Lva/d;

    invoke-interface {v1, v0}, Lva/d;->W(Lva/c;)V

    .line 3
    :cond_0
    sget-object v0, Lxa/b;->n:Lxa/b;

    iput-object v0, p0, Lxa/c;->p:Lva/c;

    return-void
.end method

.method public final g()Lva/c;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lva/c<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lxa/c;->p:Lva/c;

    if-nez v0, :cond_2

    .line 2
    invoke-virtual {p0}, Lxa/c;->getContext()Lva/e;

    move-result-object v0

    sget-object v1, Lva/d;->l:Lva/d$b;

    invoke-interface {v0, v1}, Lva/e;->i(Lva/e$b;)Lva/e$a;

    move-result-object v0

    check-cast v0, Lva/d;

    if-eqz v0, :cond_0

    invoke-interface {v0, p0}, Lva/d;->Q(Lva/c;)Lva/c;

    move-result-object v0

    if-nez v0, :cond_1

    :cond_0
    move-object v0, p0

    .line 3
    :cond_1
    iput-object v0, p0, Lxa/c;->p:Lva/c;

    :cond_2
    return-object v0
.end method

.method public getContext()Lva/e;
    .locals 1

    iget-object v0, p0, Lxa/c;->o:Lva/e;

    invoke-static {v0}, Lkotlin/jvm/internal/i;->c(Ljava/lang/Object;)V

    return-object v0
.end method
