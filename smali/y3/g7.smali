.class public final Ly3/g7;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Ly3/a5;

.field private b:Ly3/n6;


# direct methods
.method private constructor <init>(Ly3/a5;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p2, Ly3/n6;

    invoke-direct {p2}, Ly3/n6;-><init>()V

    iput-object p2, p0, Ly3/g7;->b:Ly3/n6;

    iput-object p1, p0, Ly3/g7;->a:Ly3/a5;

    invoke-static {}, Ly3/t7;->a()Ly3/t7;

    return-void
.end method

.method public static c(Ly3/a5;)Ly3/g7;
    .locals 2

    new-instance v0, Ly3/g7;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Ly3/g7;-><init>(Ly3/a5;I)V

    return-object v0
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Ly3/g7;->a:Ly3/a5;

    invoke-virtual {v0}, Ly3/a5;->f()Ly3/b5;

    move-result-object v0

    invoke-virtual {v0}, Ly3/b5;->c()Ly3/o6;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ly3/o6;->j()Ljava/lang/String;

    move-result-object v1

    .line 1
    invoke-static {v1}, Ly3/g5;->b(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0}, Ly3/o6;->j()Ljava/lang/String;

    move-result-object v0

    .line 2
    invoke-static {v0}, Lz2/j;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0

    :cond_0
    const-string v0, "NA"

    return-object v0
.end method

.method public final b(IZ)[B
    .locals 2

    iget-object p2, p0, Ly3/g7;->b:Ly3/n6;

    const/4 v0, 0x1

    if-nez p1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 1
    :goto_0
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {p2, v1}, Ly3/n6;->f(Ljava/lang/Boolean;)Ly3/n6;

    iget-object p2, p0, Ly3/g7;->b:Ly3/n6;

    .line 2
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {p2, v1}, Ly3/n6;->e(Ljava/lang/Boolean;)Ly3/n6;

    iget-object p2, p0, Ly3/g7;->a:Ly3/a5;

    iget-object v1, p0, Ly3/g7;->b:Ly3/n6;

    .line 3
    invoke-virtual {v1}, Ly3/n6;->l()Ly3/o6;

    move-result-object v1

    invoke-virtual {p2, v1}, Ly3/a5;->e(Ly3/o6;)Ly3/a5;

    .line 4
    :try_start_0
    invoke-static {}, Ly3/t7;->a()Ly3/t7;

    if-nez p1, :cond_1

    iget-object p1, p0, Ly3/g7;->a:Ly3/a5;

    invoke-virtual {p1}, Ly3/a5;->f()Ly3/b5;

    move-result-object p1

    .line 5
    new-instance p2, Ln5/d;

    invoke-direct {p2}, Ln5/d;-><init>()V

    sget-object v1, Ly3/q3;->a:Lm5/a;

    invoke-virtual {p2, v1}, Ln5/d;->j(Lm5/a;)Ln5/d;

    move-result-object p2

    invoke-virtual {p2, v0}, Ln5/d;->k(Z)Ln5/d;

    move-result-object p2

    invoke-virtual {p2}, Ln5/d;->i()Ll5/a;

    move-result-object p2

    invoke-interface {p2, p1}, Ll5/a;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string p2, "utf-8"

    .line 6
    invoke-virtual {p1, p2}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object p1

    return-object p1

    :cond_1
    iget-object p1, p0, Ly3/g7;->a:Ly3/a5;

    invoke-virtual {p1}, Ly3/a5;->f()Ly3/b5;

    move-result-object p1

    .line 7
    new-instance p2, Ly3/c;

    invoke-direct {p2}, Ly3/c;-><init>()V

    .line 8
    sget-object v0, Ly3/q3;->a:Lm5/a;

    .line 9
    invoke-interface {v0, p2}, Lm5/a;->a(Lm5/b;)V

    .line 10
    invoke-virtual {p2}, Ly3/c;->b()Ly3/d;

    move-result-object p2

    invoke-virtual {p2, p1}, Ly3/d;->a(Ljava/lang/Object;)[B

    move-result-object p1
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    new-instance p2, Ljava/lang/UnsupportedOperationException;

    const-string v0, "Failed to covert logging to UTF-8 byte array"

    .line 11
    invoke-direct {p2, v0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2
.end method

.method public final d(Ly3/y4;)Ly3/g7;
    .locals 1

    iget-object v0, p0, Ly3/g7;->a:Ly3/a5;

    invoke-virtual {v0, p1}, Ly3/a5;->c(Ly3/y4;)Ly3/a5;

    return-object p0
.end method

.method public final e(Ly3/n6;)Ly3/g7;
    .locals 0

    iput-object p1, p0, Ly3/g7;->b:Ly3/n6;

    return-object p0
.end method
