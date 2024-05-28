.class public abstract Lob/j0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lob/j0$b;
    }
.end annotation


# instance fields
.field private n:Ljava/io/Reader;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static O(Lob/b0;[B)Lob/j0;
    .locals 3

    .line 1
    new-instance v0, Lac/c;

    invoke-direct {v0}, Lac/c;-><init>()V

    invoke-virtual {v0, p1}, Lac/c;->D0([B)Lac/c;

    move-result-object v0

    .line 2
    array-length p1, p1

    int-to-long v1, p1

    invoke-static {p0, v1, v2, v0}, Lob/j0;->z(Lob/b0;JLac/e;)Lob/j0;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic b(Ljava/lang/Throwable;Ljava/lang/AutoCloseable;)V
    .locals 0

    if-eqz p0, :cond_0

    :try_start_0
    invoke-interface {p1}, Ljava/lang/AutoCloseable;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_0
    invoke-interface {p1}, Ljava/lang/AutoCloseable;->close()V

    :goto_0
    return-void
.end method

.method private e()Ljava/nio/charset/Charset;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lob/j0;->l()Lob/b0;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    sget-object v1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {v0, v1}, Lob/b0;->b(Ljava/nio/charset/Charset;)Ljava/nio/charset/Charset;

    move-result-object v0

    goto :goto_0

    :cond_0
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    :goto_0
    return-object v0
.end method

.method public static z(Lob/b0;JLac/e;)Lob/j0;
    .locals 1

    const-string v0, "source == null"

    .line 1
    invoke-static {p3, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 2
    new-instance v0, Lob/j0$a;

    invoke-direct {v0, p0, p1, p2, p3}, Lob/j0$a;-><init>(Lob/b0;JLac/e;)V

    return-object v0
.end method


# virtual methods
.method public abstract Q()Lac/e;
.end method

.method public final T()Ljava/lang/String;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lob/j0;->Q()Lac/e;

    move-result-object v0

    .line 2
    :try_start_0
    invoke-direct {p0}, Lob/j0;->e()Ljava/nio/charset/Charset;

    move-result-object v1

    invoke-static {v0, v1}, Lpb/e;->c(Lac/e;Ljava/nio/charset/Charset;)Ljava/nio/charset/Charset;

    move-result-object v1

    .line 3
    invoke-interface {v0, v1}, Lac/e;->g0(Ljava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v2, 0x0

    .line 4
    invoke-static {v2, v0}, Lob/j0;->b(Ljava/lang/Throwable;Ljava/lang/AutoCloseable;)V

    return-object v1

    :catchall_0
    move-exception v1

    .line 5
    :try_start_1
    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    move-exception v2

    if-eqz v0, :cond_0

    .line 6
    invoke-static {v1, v0}, Lob/j0;->b(Ljava/lang/Throwable;Ljava/lang/AutoCloseable;)V

    :cond_0
    throw v2
.end method

.method public final c()Ljava/io/Reader;
    .locals 3

    .line 1
    iget-object v0, p0, Lob/j0;->n:Ljava/io/Reader;

    if-eqz v0, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    new-instance v0, Lob/j0$b;

    invoke-virtual {p0}, Lob/j0;->Q()Lac/e;

    move-result-object v1

    invoke-direct {p0}, Lob/j0;->e()Ljava/nio/charset/Charset;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lob/j0$b;-><init>(Lac/e;Ljava/nio/charset/Charset;)V

    iput-object v0, p0, Lob/j0;->n:Ljava/io/Reader;

    :goto_0
    return-object v0
.end method

.method public close()V
    .locals 1

    invoke-virtual {p0}, Lob/j0;->Q()Lac/e;

    move-result-object v0

    invoke-static {v0}, Lpb/e;->g(Ljava/io/Closeable;)V

    return-void
.end method

.method public abstract i()J
.end method

.method public abstract l()Lob/b0;
.end method
