.class public abstract Lva/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lva/e$b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<B::",
        "Lva/e$a;",
        "E::TB;>",
        "Ljava/lang/Object;",
        "Lva/e$b<",
        "TE;>;"
    }
.end annotation


# instance fields
.field private final n:Ldb/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldb/l<",
            "Lva/e$a;",
            "TE;>;"
        }
    .end annotation
.end field

.field private final o:Lva/e$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lva/e$b<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lva/e$b;Ldb/l;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lva/e$b<",
            "TB;>;",
            "Ldb/l<",
            "-",
            "Lva/e$a;",
            "+TE;>;)V"
        }
    .end annotation

    const-string v0, "baseKey"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "safeCast"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p2, p0, Lva/b;->n:Ldb/l;

    .line 3
    instance-of p2, p1, Lva/b;

    if-eqz p2, :cond_0

    check-cast p1, Lva/b;

    iget-object p1, p1, Lva/b;->o:Lva/e$b;

    :cond_0
    iput-object p1, p0, Lva/b;->o:Lva/e$b;

    return-void
.end method


# virtual methods
.method public final a(Lva/e$b;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lva/e$b<",
            "*>;)Z"
        }
    .end annotation

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    if-eq p1, p0, :cond_1

    iget-object v0, p0, Lva/b;->o:Lva/e$b;

    if-ne v0, p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method public final b(Lva/e$a;)Lva/e$a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lva/e$a;",
            ")TE;"
        }
    .end annotation

    const-string v0, "element"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lva/b;->n:Ldb/l;

    invoke-interface {v0, p1}, Ldb/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lva/e$a;

    return-object p1
.end method
