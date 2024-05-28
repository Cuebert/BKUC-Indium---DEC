.class public final Lw3/sa;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lw3/f8;

.field private b:Lw3/w9;

.field private final c:I


# direct methods
.method private constructor <init>(Lw3/f8;I)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lw3/w9;

    invoke-direct {v0}, Lw3/w9;-><init>()V

    iput-object v0, p0, Lw3/sa;->b:Lw3/w9;

    iput-object p1, p0, Lw3/sa;->a:Lw3/f8;

    invoke-static {}, Lw3/bb;->a()Lw3/bb;

    iput p2, p0, Lw3/sa;->c:I

    return-void
.end method

.method public static d(Lw3/f8;)Lw3/sa;
    .locals 2

    new-instance v0, Lw3/sa;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lw3/sa;-><init>(Lw3/f8;I)V

    return-object v0
.end method

.method public static e(Lw3/f8;I)Lw3/sa;
    .locals 1

    new-instance p1, Lw3/sa;

    const/4 v0, 0x1

    invoke-direct {p1, p0, v0}, Lw3/sa;-><init>(Lw3/f8;I)V

    return-object p1
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget v0, p0, Lw3/sa;->c:I

    return v0
.end method

.method public final b()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lw3/sa;->a:Lw3/f8;

    invoke-virtual {v0}, Lw3/f8;->i()Lw3/g8;

    move-result-object v0

    invoke-virtual {v0}, Lw3/g8;->e()Lw3/x9;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lw3/x9;->j()Ljava/lang/String;

    move-result-object v1

    .line 1
    invoke-static {v1}, Lw3/q;->b(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0}, Lw3/x9;->j()Ljava/lang/String;

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

.method public final c(IZ)[B
    .locals 2

    iget-object p2, p0, Lw3/sa;->b:Lw3/w9;

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

    invoke-virtual {p2, v1}, Lw3/w9;->f(Ljava/lang/Boolean;)Lw3/w9;

    iget-object p2, p0, Lw3/sa;->b:Lw3/w9;

    .line 2
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {p2, v1}, Lw3/w9;->e(Ljava/lang/Boolean;)Lw3/w9;

    iget-object p2, p0, Lw3/sa;->a:Lw3/f8;

    iget-object v1, p0, Lw3/sa;->b:Lw3/w9;

    .line 3
    invoke-virtual {v1}, Lw3/w9;->l()Lw3/x9;

    move-result-object v1

    invoke-virtual {p2, v1}, Lw3/f8;->h(Lw3/x9;)Lw3/f8;

    .line 4
    :try_start_0
    invoke-static {}, Lw3/bb;->a()Lw3/bb;

    if-nez p1, :cond_1

    iget-object p1, p0, Lw3/sa;->a:Lw3/f8;

    invoke-virtual {p1}, Lw3/f8;->i()Lw3/g8;

    move-result-object p1

    .line 5
    new-instance p2, Ln5/d;

    invoke-direct {p2}, Ln5/d;-><init>()V

    sget-object v1, Lw3/s6;->a:Lm5/a;

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
    iget-object p1, p0, Lw3/sa;->a:Lw3/f8;

    invoke-virtual {p1}, Lw3/f8;->i()Lw3/g8;

    move-result-object p1

    .line 7
    new-instance p2, Lw3/f2;

    invoke-direct {p2}, Lw3/f2;-><init>()V

    .line 8
    sget-object v0, Lw3/s6;->a:Lm5/a;

    .line 9
    invoke-interface {v0, p2}, Lm5/a;->a(Lm5/b;)V

    .line 10
    invoke-virtual {p2}, Lw3/f2;->b()Lw3/g2;

    move-result-object p2

    invoke-virtual {p2, p1}, Lw3/g2;->a(Ljava/lang/Object;)[B

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

.method public final f(Lw3/d8;)Lw3/sa;
    .locals 1

    iget-object v0, p0, Lw3/sa;->a:Lw3/f8;

    invoke-virtual {v0, p1}, Lw3/f8;->d(Lw3/d8;)Lw3/f8;

    return-object p0
.end method

.method public final g(Lw3/w9;)Lw3/sa;
    .locals 0

    iput-object p1, p0, Lw3/sa;->b:Lw3/w9;

    return-object p0
.end method
