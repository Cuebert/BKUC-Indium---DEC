.class final Lqa/v$a;
.super Ljava/util/concurrent/FutureTask;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lqa/v;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/util/concurrent/FutureTask<",
        "Lqa/c;",
        ">;",
        "Ljava/lang/Comparable<",
        "Lqa/v$a;",
        ">;"
    }
.end annotation


# instance fields
.field private final n:Lqa/c;


# direct methods
.method public constructor <init>(Lqa/c;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Ljava/util/concurrent/FutureTask;-><init>(Ljava/lang/Runnable;Ljava/lang/Object;)V

    .line 2
    iput-object p1, p0, Lqa/v$a;->n:Lqa/c;

    return-void
.end method


# virtual methods
.method public c(Lqa/v$a;)I
    .locals 2

    .line 1
    iget-object v0, p0, Lqa/v$a;->n:Lqa/c;

    invoke-virtual {v0}, Lqa/c;->p()Lqa/t$f;

    move-result-object v0

    .line 2
    iget-object v1, p1, Lqa/v$a;->n:Lqa/c;

    invoke-virtual {v1}, Lqa/c;->p()Lqa/t$f;

    move-result-object v1

    if-ne v0, v1, :cond_0

    .line 3
    iget-object v0, p0, Lqa/v$a;->n:Lqa/c;

    iget v0, v0, Lqa/c;->n:I

    iget-object p1, p1, Lqa/v$a;->n:Lqa/c;

    iget p1, p1, Lqa/c;->n:I

    sub-int/2addr v0, p1

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    sub-int v0, p1, v0

    :goto_0
    return v0
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lqa/v$a;

    invoke-virtual {p0, p1}, Lqa/v$a;->c(Lqa/v$a;)I

    move-result p1

    return p1
.end method
