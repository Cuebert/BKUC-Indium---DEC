.class public Lc9/k$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc9/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private a:Ljava/lang/String;

.field private final b:I


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x6

    .line 2
    iput v0, p0, Lc9/k$a;->b:I

    .line 3
    iput-object p1, p0, Lc9/k$a;->a:Ljava/lang/String;

    return-void
.end method

.method private e(Ljava/lang/StackTraceElement;)Ljava/lang/String;
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;

    move-result-object p1

    const/16 v0, 0x2e

    .line 2
    invoke-virtual {p1, v0}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    return-object p1

    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 3
    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private f(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x6

    invoke-direct {p0, v1}, Lc9/k$a;->g(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private g(I)Ljava/lang/String;
    .locals 4

    .line 1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    array-length v1, v0

    if-le v1, p1, :cond_0

    .line 3
    aget-object v1, v0, p1

    invoke-direct {p0, v1}, Lc9/k$a;->e(Ljava/lang/StackTraceElement;)Ljava/lang/String;

    move-result-object v1

    .line 4
    aget-object v2, v0, p1

    invoke-virtual {v2}, Ljava/lang/StackTraceElement;->getMethodName()Ljava/lang/String;

    move-result-object v2

    .line 5
    aget-object p1, v0, p1

    invoke-virtual {p1}, Ljava/lang/StackTraceElement;->getLineNumber()I

    move-result p1

    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v1, v0, v3

    const/4 v1, 0x1

    aput-object v2, v0, v1

    const/4 v1, 0x2

    .line 6
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, v0, v1

    const-string p1, "[%s.%s()-%d]: "

    invoke-static {p1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    const-string p1, "[STACKTRACE MISMATCH]: "

    return-object p1
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/String;)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public b(Ljava/lang/String;)I
    .locals 1

    iget-object v0, p0, Lc9/k$a;->a:Ljava/lang/String;

    invoke-direct {p0, p1}, Lc9/k$a;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    move-result p1

    return p1
.end method

.method public c(Ljava/lang/String;Ljava/lang/String;)I
    .locals 0

    invoke-direct {p0, p2}, Lc9/k$a;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    move-result p1

    return p1
.end method

.method public d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    .locals 0

    invoke-direct {p0, p2}, Lc9/k$a;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2, p3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    move-result p1

    return p1
.end method

.method public h(Ljava/lang/String;)I
    .locals 1

    iget-object v0, p0, Lc9/k$a;->a:Ljava/lang/String;

    invoke-direct {p0, p1}, Lc9/k$a;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    move-result p1

    return p1
.end method

.method public i(Ljava/lang/String;Ljava/lang/String;)I
    .locals 0

    invoke-direct {p0, p2}, Lc9/k$a;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    move-result p1

    return p1
.end method

.method public j(Ljava/lang/String;)I
    .locals 1

    iget-object v0, p0, Lc9/k$a;->a:Ljava/lang/String;

    invoke-direct {p0, p1}, Lc9/k$a;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    move-result p1

    return p1
.end method

.method public k(Ljava/lang/String;Ljava/lang/String;)I
    .locals 0

    invoke-direct {p0, p2}, Lc9/k$a;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    move-result p1

    return p1
.end method

.method public l(Ljava/lang/String;)I
    .locals 1

    iget-object v0, p0, Lc9/k$a;->a:Ljava/lang/String;

    invoke-direct {p0, p1}, Lc9/k$a;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    move-result p1

    return p1
.end method

.method public m(Ljava/lang/String;Ljava/lang/String;)I
    .locals 0

    invoke-direct {p0, p2}, Lc9/k$a;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    move-result p1

    return p1
.end method
