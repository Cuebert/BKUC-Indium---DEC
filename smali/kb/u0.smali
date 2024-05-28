.class final Lkb/u0;
.super Lkb/a1;
.source "SourceFile"


# instance fields
.field private final r:Ldb/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldb/l<",
            "Ljava/lang/Throwable;",
            "Lta/l;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ldb/l;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldb/l<",
            "-",
            "Ljava/lang/Throwable;",
            "Lta/l;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lkb/a1;-><init>()V

    .line 2
    iput-object p1, p0, Lkb/u0;->r:Ldb/l;

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lkb/u0;->s(Ljava/lang/Throwable;)V

    sget-object p1, Lta/l;->a:Lta/l;

    return-object p1
.end method

.method public s(Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, Lkb/u0;->r:Ldb/l;

    invoke-interface {v0, p1}, Ldb/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
