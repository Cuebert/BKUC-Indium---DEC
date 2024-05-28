.class public final Lgc/t;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field private final a:Lob/i0;

.field private final b:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field

.field private final c:Lob/j0;


# direct methods
.method private constructor <init>(Lob/i0;Ljava/lang/Object;Lob/j0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lob/i0;",
            "TT;",
            "Lob/j0;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lgc/t;->a:Lob/i0;

    .line 3
    iput-object p2, p0, Lgc/t;->b:Ljava/lang/Object;

    .line 4
    iput-object p3, p0, Lgc/t;->c:Lob/j0;

    return-void
.end method

.method public static c(Lob/j0;Lob/i0;)Lgc/t;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lob/j0;",
            "Lob/i0;",
            ")",
            "Lgc/t<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "body == null"

    .line 1
    invoke-static {p0, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "rawResponse == null"

    .line 2
    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 3
    invoke-virtual {p1}, Lob/i0;->Q()Z

    move-result v0

    if-nez v0, :cond_0

    .line 4
    new-instance v0, Lgc/t;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1, p0}, Lgc/t;-><init>(Lob/i0;Ljava/lang/Object;Lob/j0;)V

    return-object v0

    .line 5
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "rawResponse should not be successful response"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static h(Ljava/lang/Object;Lob/i0;)Lgc/t;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;",
            "Lob/i0;",
            ")",
            "Lgc/t<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "rawResponse == null"

    .line 1
    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 2
    invoke-virtual {p1}, Lob/i0;->Q()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    new-instance v0, Lgc/t;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p0, v1}, Lgc/t;-><init>(Lob/i0;Ljava/lang/Object;Lob/j0;)V

    return-object v0

    .line 4
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "rawResponse must be successful response"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public a()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    iget-object v0, p0, Lgc/t;->b:Ljava/lang/Object;

    return-object v0
.end method

.method public b()I
    .locals 1

    iget-object v0, p0, Lgc/t;->a:Lob/i0;

    invoke-virtual {v0}, Lob/i0;->e()I

    move-result v0

    return v0
.end method

.method public d()Lob/j0;
    .locals 1

    iget-object v0, p0, Lgc/t;->c:Lob/j0;

    return-object v0
.end method

.method public e()Lob/y;
    .locals 1

    iget-object v0, p0, Lgc/t;->a:Lob/i0;

    invoke-virtual {v0}, Lob/i0;->O()Lob/y;

    move-result-object v0

    return-object v0
.end method

.method public f()Z
    .locals 1

    iget-object v0, p0, Lgc/t;->a:Lob/i0;

    invoke-virtual {v0}, Lob/i0;->Q()Z

    move-result v0

    return v0
.end method

.method public g()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lgc/t;->a:Lob/i0;

    invoke-virtual {v0}, Lob/i0;->T()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lgc/t;->a:Lob/i0;

    invoke-virtual {v0}, Lob/i0;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
