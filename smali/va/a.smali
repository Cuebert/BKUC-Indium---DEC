.class public abstract Lva/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lva/e$a;


# instance fields
.field private final n:Lva/e$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lva/e$b<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lva/e$b;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lva/e$b<",
            "*>;)V"
        }
    .end annotation

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lva/a;->n:Lva/e$b;

    return-void
.end method


# virtual methods
.method public b(Ljava/lang/Object;Ldb/p;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(TR;",
            "Ldb/p<",
            "-TR;-",
            "Lva/e$a;",
            "+TR;>;)TR;"
        }
    .end annotation

    invoke-static {p0, p1, p2}, Lva/e$a$a;->a(Lva/e$a;Ljava/lang/Object;Ldb/p;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public getKey()Lva/e$b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lva/e$b<",
            "*>;"
        }
    .end annotation

    iget-object v0, p0, Lva/a;->n:Lva/e$b;

    return-object v0
.end method

.method public i(Lva/e$b;)Lva/e$a;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E::",
            "Lva/e$a;",
            ">(",
            "Lva/e$b<",
            "TE;>;)TE;"
        }
    .end annotation

    invoke-static {p0, p1}, Lva/e$a$a;->b(Lva/e$a;Lva/e$b;)Lva/e$a;

    move-result-object p1

    return-object p1
.end method
