.class public final Lkb/k;
.super Lkb/x0;
.source "SourceFile"


# instance fields
.field public final r:Lkb/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkb/i<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lkb/i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkb/i<",
            "*>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lkb/x0;-><init>()V

    .line 2
    iput-object p1, p0, Lkb/k;->r:Lkb/i;

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lkb/k;->s(Ljava/lang/Throwable;)V

    sget-object p1, Lta/l;->a:Lta/l;

    return-object p1
.end method

.method public s(Ljava/lang/Throwable;)V
    .locals 1

    iget-object p1, p0, Lkb/k;->r:Lkb/i;

    invoke-virtual {p0}, Lkb/a1;->t()Lkb/b1;

    move-result-object v0

    invoke-virtual {p1, v0}, Lkb/i;->s(Lkb/v0;)Ljava/lang/Throwable;

    move-result-object v0

    invoke-virtual {p1, v0}, Lkb/i;->D(Ljava/lang/Throwable;)V

    return-void
.end method
