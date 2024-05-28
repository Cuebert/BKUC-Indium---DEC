.class public final Lsb/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lob/a0$a;


# instance fields
.field private final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lob/a0;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Lrb/k;

.field private final c:Lrb/c;

.field private final d:I

.field private final e:Lob/g0;

.field private final f:Lob/g;

.field private final g:I

.field private final h:I

.field private final i:I

.field private j:I


# direct methods
.method public constructor <init>(Ljava/util/List;Lrb/k;Lrb/c;ILob/g0;Lob/g;III)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lob/a0;",
            ">;",
            "Lrb/k;",
            "Lrb/c;",
            "I",
            "Lob/g0;",
            "Lob/g;",
            "III)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lsb/g;->a:Ljava/util/List;

    .line 3
    iput-object p2, p0, Lsb/g;->b:Lrb/k;

    .line 4
    iput-object p3, p0, Lsb/g;->c:Lrb/c;

    .line 5
    iput p4, p0, Lsb/g;->d:I

    .line 6
    iput-object p5, p0, Lsb/g;->e:Lob/g0;

    .line 7
    iput-object p6, p0, Lsb/g;->f:Lob/g;

    .line 8
    iput p7, p0, Lsb/g;->g:I

    .line 9
    iput p8, p0, Lsb/g;->h:I

    .line 10
    iput p9, p0, Lsb/g;->i:I

    return-void
.end method


# virtual methods
.method public a()Lob/l;
    .locals 1

    iget-object v0, p0, Lsb/g;->c:Lrb/c;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lrb/c;->c()Lrb/e;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public b(Lob/g0;)Lob/i0;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-object v0, p0, Lsb/g;->b:Lrb/k;

    iget-object v1, p0, Lsb/g;->c:Lrb/c;

    invoke-virtual {p0, p1, v0, v1}, Lsb/g;->h(Lob/g0;Lrb/k;Lrb/c;)Lob/i0;

    move-result-object p1

    return-object p1
.end method

.method public c()I
    .locals 1

    iget v0, p0, Lsb/g;->g:I

    return v0
.end method

.method public d()I
    .locals 1

    iget v0, p0, Lsb/g;->h:I

    return v0
.end method

.method public e()Lob/g0;
    .locals 1

    iget-object v0, p0, Lsb/g;->e:Lob/g0;

    return-object v0
.end method

.method public f()I
    .locals 1

    iget v0, p0, Lsb/g;->i:I

    return v0
.end method

.method public g()Lrb/c;
    .locals 1

    iget-object v0, p0, Lsb/g;->c:Lrb/c;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0
.end method

.method public h(Lob/g0;Lrb/k;Lrb/c;)Lob/i0;
    .locals 15
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    move-object v0, p0

    .line 1
    iget v1, v0, Lsb/g;->d:I

    iget-object v2, v0, Lsb/g;->a:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_8

    .line 2
    iget v1, v0, Lsb/g;->j:I

    const/4 v2, 0x1

    add-int/2addr v1, v2

    iput v1, v0, Lsb/g;->j:I

    .line 3
    iget-object v1, v0, Lsb/g;->c:Lrb/c;

    const-string v3, "network interceptor "

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lrb/c;->c()Lrb/e;

    move-result-object v1

    invoke-virtual/range {p1 .. p1}, Lob/g0;->j()Lob/z;

    move-result-object v4

    invoke-virtual {v1, v4}, Lrb/e;->v(Lob/z;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    .line 4
    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, v0, Lsb/g;->a:Ljava/util/List;

    iget v5, v0, Lsb/g;->d:I

    sub-int/2addr v5, v2

    invoke-interface {v3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " must retain the same host and port"

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 5
    :cond_1
    :goto_0
    iget-object v1, v0, Lsb/g;->c:Lrb/c;

    const-string v4, " must call proceed() exactly once"

    if-eqz v1, :cond_3

    iget v1, v0, Lsb/g;->j:I

    if-gt v1, v2, :cond_2

    goto :goto_1

    .line 6
    :cond_2
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, v0, Lsb/g;->a:Ljava/util/List;

    iget v6, v0, Lsb/g;->d:I

    sub-int/2addr v6, v2

    invoke-interface {v3, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 7
    :cond_3
    :goto_1
    new-instance v1, Lsb/g;

    iget-object v6, v0, Lsb/g;->a:Ljava/util/List;

    iget v5, v0, Lsb/g;->d:I

    add-int/lit8 v9, v5, 0x1

    iget-object v11, v0, Lsb/g;->f:Lob/g;

    iget v12, v0, Lsb/g;->g:I

    iget v13, v0, Lsb/g;->h:I

    iget v14, v0, Lsb/g;->i:I

    move-object v5, v1

    move-object/from16 v7, p2

    move-object/from16 v8, p3

    move-object/from16 v10, p1

    invoke-direct/range {v5 .. v14}, Lsb/g;-><init>(Ljava/util/List;Lrb/k;Lrb/c;ILob/g0;Lob/g;III)V

    .line 8
    iget-object v5, v0, Lsb/g;->a:Ljava/util/List;

    iget v6, v0, Lsb/g;->d:I

    invoke-interface {v5, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lob/a0;

    .line 9
    invoke-interface {v5, v1}, Lob/a0;->a(Lob/a0$a;)Lob/i0;

    move-result-object v6

    if-eqz p3, :cond_5

    .line 10
    iget v7, v0, Lsb/g;->d:I

    add-int/2addr v7, v2

    iget-object v8, v0, Lsb/g;->a:Ljava/util/List;

    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v8

    if-ge v7, v8, :cond_5

    iget v1, v1, Lsb/g;->j:I

    if-ne v1, v2, :cond_4

    goto :goto_2

    .line 11
    :cond_4
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_5
    :goto_2
    const-string v1, "interceptor "

    if-eqz v6, :cond_7

    .line 12
    invoke-virtual {v6}, Lob/i0;->b()Lob/j0;

    move-result-object v2

    if-eqz v2, :cond_6

    return-object v6

    .line 13
    :cond_6
    new-instance v2, Ljava/lang/IllegalStateException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " returned a response with no body"

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2

    .line 14
    :cond_7
    new-instance v2, Ljava/lang/NullPointerException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " returned null"

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v2

    .line 15
    :cond_8
    new-instance v1, Ljava/lang/AssertionError;

    invoke-direct {v1}, Ljava/lang/AssertionError;-><init>()V

    throw v1
.end method

.method public i()Lrb/k;
    .locals 1

    iget-object v0, p0, Lsb/g;->b:Lrb/k;

    return-object v0
.end method
