.class final Lgc/r;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lgc/r$a;
    }
.end annotation


# static fields
.field private static final l:[C

.field private static final m:Ljava/util/regex/Pattern;


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Lob/z;

.field private c:Ljava/lang/String;

.field private d:Lob/z$a;

.field private final e:Lob/g0$a;

.field private final f:Lob/y$a;

.field private g:Lob/b0;

.field private final h:Z

.field private i:Lob/c0$a;

.field private j:Lob/w$a;

.field private k:Lob/h0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x10

    new-array v0, v0, [C

    .line 1
    fill-array-data v0, :array_0

    sput-object v0, Lgc/r;->l:[C

    const-string v0, "(.*/)?(\\.|%2e|%2E){1,2}(/.*)?"

    .line 2
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lgc/r;->m:Ljava/util/regex/Pattern;

    return-void

    :array_0
    .array-data 2
        0x30s
        0x31s
        0x32s
        0x33s
        0x34s
        0x35s
        0x36s
        0x37s
        0x38s
        0x39s
        0x41s
        0x42s
        0x43s
        0x44s
        0x45s
        0x46s
    .end array-data
.end method

.method constructor <init>(Ljava/lang/String;Lob/z;Ljava/lang/String;Lob/y;Lob/b0;ZZZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lgc/r;->a:Ljava/lang/String;

    .line 3
    iput-object p2, p0, Lgc/r;->b:Lob/z;

    .line 4
    iput-object p3, p0, Lgc/r;->c:Ljava/lang/String;

    .line 5
    new-instance p1, Lob/g0$a;

    invoke-direct {p1}, Lob/g0$a;-><init>()V

    iput-object p1, p0, Lgc/r;->e:Lob/g0$a;

    .line 6
    iput-object p5, p0, Lgc/r;->g:Lob/b0;

    .line 7
    iput-boolean p6, p0, Lgc/r;->h:Z

    if-eqz p4, :cond_0

    .line 8
    invoke-virtual {p4}, Lob/y;->f()Lob/y$a;

    move-result-object p1

    iput-object p1, p0, Lgc/r;->f:Lob/y$a;

    goto :goto_0

    .line 9
    :cond_0
    new-instance p1, Lob/y$a;

    invoke-direct {p1}, Lob/y$a;-><init>()V

    iput-object p1, p0, Lgc/r;->f:Lob/y$a;

    :goto_0
    if-eqz p7, :cond_1

    .line 10
    new-instance p1, Lob/w$a;

    invoke-direct {p1}, Lob/w$a;-><init>()V

    iput-object p1, p0, Lgc/r;->j:Lob/w$a;

    goto :goto_1

    :cond_1
    if-eqz p8, :cond_2

    .line 11
    new-instance p1, Lob/c0$a;

    invoke-direct {p1}, Lob/c0$a;-><init>()V

    iput-object p1, p0, Lgc/r;->i:Lob/c0$a;

    .line 12
    sget-object p2, Lob/c0;->j:Lob/b0;

    invoke-virtual {p1, p2}, Lob/c0$a;->d(Lob/b0;)Lob/c0$a;

    :cond_2
    :goto_1
    return-void
.end method

.method private static i(Ljava/lang/String;Z)Ljava/lang/String;
    .locals 6

    .line 1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_2

    .line 2
    invoke-virtual {p0, v2}, Ljava/lang/String;->codePointAt(I)I

    move-result v3

    const/16 v4, 0x20

    if-lt v3, v4, :cond_1

    const/16 v4, 0x7f

    if-ge v3, v4, :cond_1

    const-string v4, " \"<>^`{}|\\?#"

    .line 3
    invoke-virtual {v4, v3}, Ljava/lang/String;->indexOf(I)I

    move-result v4

    const/4 v5, -0x1

    if-ne v4, v5, :cond_1

    if-nez p1, :cond_0

    const/16 v4, 0x2f

    if-eq v3, v4, :cond_1

    const/16 v4, 0x25

    if-ne v3, v4, :cond_0

    goto :goto_1

    .line 4
    :cond_0
    invoke-static {v3}, Ljava/lang/Character;->charCount(I)I

    move-result v3

    add-int/2addr v2, v3

    goto :goto_0

    .line 5
    :cond_1
    :goto_1
    new-instance v3, Lac/c;

    invoke-direct {v3}, Lac/c;-><init>()V

    .line 6
    invoke-virtual {v3, p0, v1, v2}, Lac/c;->N0(Ljava/lang/String;II)Lac/c;

    .line 7
    invoke-static {v3, p0, v2, v0, p1}, Lgc/r;->j(Lac/c;Ljava/lang/String;IIZ)V

    .line 8
    invoke-virtual {v3}, Lac/c;->t0()Ljava/lang/String;

    move-result-object p0

    :cond_2
    return-object p0
.end method

.method private static j(Lac/c;Ljava/lang/String;IIZ)V
    .locals 6

    const/4 v0, 0x0

    :goto_0
    if-ge p2, p3, :cond_5

    .line 1
    invoke-virtual {p1, p2}, Ljava/lang/String;->codePointAt(I)I

    move-result v1

    if-eqz p4, :cond_0

    const/16 v2, 0x9

    if-eq v1, v2, :cond_4

    const/16 v2, 0xa

    if-eq v1, v2, :cond_4

    const/16 v2, 0xc

    if-eq v1, v2, :cond_4

    const/16 v2, 0xd

    if-ne v1, v2, :cond_0

    goto :goto_3

    :cond_0
    const/16 v2, 0x20

    const/16 v3, 0x25

    if-lt v1, v2, :cond_2

    const/16 v2, 0x7f

    if-ge v1, v2, :cond_2

    const-string v2, " \"<>^`{}|\\?#"

    .line 2
    invoke-virtual {v2, v1}, Ljava/lang/String;->indexOf(I)I

    move-result v2

    const/4 v4, -0x1

    if-ne v2, v4, :cond_2

    if-nez p4, :cond_1

    const/16 v2, 0x2f

    if-eq v1, v2, :cond_2

    if-ne v1, v3, :cond_1

    goto :goto_1

    .line 3
    :cond_1
    invoke-virtual {p0, v1}, Lac/c;->O0(I)Lac/c;

    goto :goto_3

    :cond_2
    :goto_1
    if-nez v0, :cond_3

    .line 4
    new-instance v0, Lac/c;

    invoke-direct {v0}, Lac/c;-><init>()V

    .line 5
    :cond_3
    invoke-virtual {v0, v1}, Lac/c;->O0(I)Lac/c;

    .line 6
    :goto_2
    invoke-virtual {v0}, Lac/c;->F()Z

    move-result v2

    if-nez v2, :cond_4

    .line 7
    invoke-virtual {v0}, Lac/c;->readByte()B

    move-result v2

    and-int/lit16 v2, v2, 0xff

    .line 8
    invoke-virtual {p0, v3}, Lac/c;->G0(I)Lac/c;

    .line 9
    sget-object v4, Lgc/r;->l:[C

    shr-int/lit8 v5, v2, 0x4

    and-int/lit8 v5, v5, 0xf

    aget-char v5, v4, v5

    invoke-virtual {p0, v5}, Lac/c;->G0(I)Lac/c;

    and-int/lit8 v2, v2, 0xf

    .line 10
    aget-char v2, v4, v2

    invoke-virtual {p0, v2}, Lac/c;->G0(I)Lac/c;

    goto :goto_2

    .line 11
    :cond_4
    :goto_3
    invoke-static {v1}, Ljava/lang/Character;->charCount(I)I

    move-result v1

    add-int/2addr p2, v1

    goto :goto_0

    :cond_5
    return-void
.end method


# virtual methods
.method a(Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 0

    if-eqz p3, :cond_0

    .line 1
    iget-object p3, p0, Lgc/r;->j:Lob/w$a;

    invoke-virtual {p3, p1, p2}, Lob/w$a;->b(Ljava/lang/String;Ljava/lang/String;)Lob/w$a;

    goto :goto_0

    .line 2
    :cond_0
    iget-object p3, p0, Lgc/r;->j:Lob/w$a;

    invoke-virtual {p3, p1, p2}, Lob/w$a;->a(Ljava/lang/String;Ljava/lang/String;)Lob/w$a;

    :goto_0
    return-void
.end method

.method b(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    const-string v0, "Content-Type"

    .line 1
    invoke-virtual {v0, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    :try_start_0
    invoke-static {p2}, Lob/b0;->c(Ljava/lang/String;)Lob/b0;

    move-result-object p1

    iput-object p1, p0, Lgc/r;->g:Lob/b0;
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 3
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Malformed content type: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {v0, p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    .line 4
    :cond_0
    iget-object v0, p0, Lgc/r;->f:Lob/y$a;

    invoke-virtual {v0, p1, p2}, Lob/y$a;->a(Ljava/lang/String;Ljava/lang/String;)Lob/y$a;

    :goto_0
    return-void
.end method

.method c(Lob/y;)V
    .locals 1

    iget-object v0, p0, Lgc/r;->f:Lob/y$a;

    invoke-virtual {v0, p1}, Lob/y$a;->b(Lob/y;)Lob/y$a;

    return-void
.end method

.method d(Lob/y;Lob/h0;)V
    .locals 1

    iget-object v0, p0, Lgc/r;->i:Lob/c0$a;

    invoke-virtual {v0, p1, p2}, Lob/c0$a;->a(Lob/y;Lob/h0;)Lob/c0$a;

    return-void
.end method

.method e(Lob/c0$b;)V
    .locals 1

    iget-object v0, p0, Lgc/r;->i:Lob/c0$a;

    invoke-virtual {v0, p1}, Lob/c0$a;->b(Lob/c0$b;)Lob/c0$a;

    return-void
.end method

.method f(Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 3

    .line 1
    iget-object v0, p0, Lgc/r;->c:Ljava/lang/String;

    if-eqz v0, :cond_1

    .line 2
    invoke-static {p2, p3}, Lgc/r;->i(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object p3

    .line 3
    iget-object v0, p0, Lgc/r;->c:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "{"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "}"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1, p3}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p1

    .line 4
    sget-object p3, Lgc/r;->m:Ljava/util/regex/Pattern;

    invoke-virtual {p3, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p3

    invoke-virtual {p3}, Ljava/util/regex/Matcher;->matches()Z

    move-result p3

    if-nez p3, :cond_0

    .line 5
    iput-object p1, p0, Lgc/r;->c:Ljava/lang/String;

    return-void

    .line 6
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "@Path parameters shouldn\'t perform path traversal (\'.\' or \'..\'): "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 7
    :cond_1
    new-instance p1, Ljava/lang/AssertionError;

    invoke-direct {p1}, Ljava/lang/AssertionError;-><init>()V

    throw p1
.end method

.method g(Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Lgc/r;->c:Ljava/lang/String;

    if-eqz v0, :cond_1

    .line 2
    iget-object v1, p0, Lgc/r;->b:Lob/z;

    invoke-virtual {v1, v0}, Lob/z;->q(Ljava/lang/String;)Lob/z$a;

    move-result-object v0

    iput-object v0, p0, Lgc/r;->d:Lob/z$a;

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 3
    iput-object v0, p0, Lgc/r;->c:Ljava/lang/String;

    goto :goto_0

    .line 4
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "Malformed URL. Base: "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p3, p0, Lgc/r;->b:Lob/z;

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p3, ", Relative: "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p3, p0, Lgc/r;->c:Ljava/lang/String;

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    if-eqz p3, :cond_2

    .line 5
    iget-object p3, p0, Lgc/r;->d:Lob/z$a;

    invoke-virtual {p3, p1, p2}, Lob/z$a;->a(Ljava/lang/String;Ljava/lang/String;)Lob/z$a;

    goto :goto_1

    .line 6
    :cond_2
    iget-object p3, p0, Lgc/r;->d:Lob/z$a;

    invoke-virtual {p3, p1, p2}, Lob/z$a;->b(Ljava/lang/String;Ljava/lang/String;)Lob/z$a;

    :goto_1
    return-void
.end method

.method h(Ljava/lang/Class;Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;TT;)V"
        }
    .end annotation

    iget-object v0, p0, Lgc/r;->e:Lob/g0$a;

    invoke-virtual {v0, p1, p2}, Lob/g0$a;->g(Ljava/lang/Class;Ljava/lang/Object;)Lob/g0$a;

    return-void
.end method

.method k()Lob/g0$a;
    .locals 5

    .line 1
    iget-object v0, p0, Lgc/r;->d:Lob/z$a;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lob/z$a;->c()Lob/z;

    move-result-object v0

    goto :goto_0

    .line 3
    :cond_0
    iget-object v0, p0, Lgc/r;->b:Lob/z;

    iget-object v1, p0, Lgc/r;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lob/z;->C(Ljava/lang/String;)Lob/z;

    move-result-object v0

    if-eqz v0, :cond_6

    .line 4
    :goto_0
    iget-object v1, p0, Lgc/r;->k:Lob/h0;

    if-nez v1, :cond_3

    .line 5
    iget-object v2, p0, Lgc/r;->j:Lob/w$a;

    if-eqz v2, :cond_1

    .line 6
    invoke-virtual {v2}, Lob/w$a;->c()Lob/w;

    move-result-object v1

    goto :goto_1

    .line 7
    :cond_1
    iget-object v2, p0, Lgc/r;->i:Lob/c0$a;

    if-eqz v2, :cond_2

    .line 8
    invoke-virtual {v2}, Lob/c0$a;->c()Lob/c0;

    move-result-object v1

    goto :goto_1

    .line 9
    :cond_2
    iget-boolean v2, p0, Lgc/r;->h:Z

    if-eqz v2, :cond_3

    const/4 v1, 0x0

    const/4 v2, 0x0

    new-array v2, v2, [B

    .line 10
    invoke-static {v1, v2}, Lob/h0;->e(Lob/b0;[B)Lob/h0;

    move-result-object v1

    .line 11
    :cond_3
    :goto_1
    iget-object v2, p0, Lgc/r;->g:Lob/b0;

    if-eqz v2, :cond_5

    if-eqz v1, :cond_4

    .line 12
    new-instance v3, Lgc/r$a;

    invoke-direct {v3, v1, v2}, Lgc/r$a;-><init>(Lob/h0;Lob/b0;)V

    move-object v1, v3

    goto :goto_2

    .line 13
    :cond_4
    iget-object v3, p0, Lgc/r;->f:Lob/y$a;

    invoke-virtual {v2}, Lob/b0;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v4, "Content-Type"

    invoke-virtual {v3, v4, v2}, Lob/y$a;->a(Ljava/lang/String;Ljava/lang/String;)Lob/y$a;

    .line 14
    :cond_5
    :goto_2
    iget-object v2, p0, Lgc/r;->e:Lob/g0$a;

    invoke-virtual {v2, v0}, Lob/g0$a;->i(Lob/z;)Lob/g0$a;

    move-result-object v0

    iget-object v2, p0, Lgc/r;->f:Lob/y$a;

    invoke-virtual {v2}, Lob/y$a;->e()Lob/y;

    move-result-object v2

    invoke-virtual {v0, v2}, Lob/g0$a;->c(Lob/y;)Lob/g0$a;

    move-result-object v0

    iget-object v2, p0, Lgc/r;->a:Ljava/lang/String;

    invoke-virtual {v0, v2, v1}, Lob/g0$a;->d(Ljava/lang/String;Lob/h0;)Lob/g0$a;

    move-result-object v0

    return-object v0

    .line 15
    :cond_6
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Malformed URL. Base: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lgc/r;->b:Lob/z;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", Relative: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lgc/r;->c:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method l(Lob/h0;)V
    .locals 0

    iput-object p1, p0, Lgc/r;->k:Lob/h0;

    return-void
.end method

.method m(Ljava/lang/Object;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lgc/r;->c:Ljava/lang/String;

    return-void
.end method
