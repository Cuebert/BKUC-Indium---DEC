.class Lr1/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lr1/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator<",
        "Lcom/birbit/android/jobqueue/f;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic n:Lr1/a;


# direct methods
.method constructor <init>(Lr1/a;)V
    .locals 0

    iput-object p1, p0, Lr1/a$a;->n:Lr1/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private b(II)I
    .locals 0

    if-le p1, p2, :cond_0

    const/4 p1, -0x1

    return p1

    :cond_0
    if-le p2, p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method private c(JJ)I
    .locals 1

    cmp-long v0, p1, p3

    if-lez v0, :cond_0

    const/4 p1, -0x1

    return p1

    :cond_0
    cmp-long v0, p3, p1

    if-lez v0, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method


# virtual methods
.method public a(Lcom/birbit/android/jobqueue/f;Lcom/birbit/android/jobqueue/f;)I
    .locals 4

    .line 1
    invoke-virtual {p1}, Lcom/birbit/android/jobqueue/f;->f()Lcom/birbit/android/jobqueue/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/birbit/android/jobqueue/e;->c()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2}, Lcom/birbit/android/jobqueue/f;->f()Lcom/birbit/android/jobqueue/e;

    move-result-object v1

    invoke-virtual {v1}, Lcom/birbit/android/jobqueue/e;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 2
    :cond_0
    invoke-virtual {p1}, Lcom/birbit/android/jobqueue/f;->g()I

    move-result v0

    invoke-virtual {p2}, Lcom/birbit/android/jobqueue/f;->g()I

    move-result v1

    invoke-direct {p0, v0, v1}, Lr1/a$a;->b(II)I

    move-result v0

    if-eqz v0, :cond_1

    return v0

    .line 3
    :cond_1
    invoke-virtual {p1}, Lcom/birbit/android/jobqueue/f;->a()J

    move-result-wide v0

    invoke-virtual {p2}, Lcom/birbit/android/jobqueue/f;->a()J

    move-result-wide v2

    invoke-direct {p0, v0, v1, v2, v3}, Lr1/a$a;->c(JJ)I

    move-result v0

    neg-int v0, v0

    if-eqz v0, :cond_2

    return v0

    .line 4
    :cond_2
    invoke-virtual {p1}, Lcom/birbit/android/jobqueue/f;->e()Ljava/lang/Long;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-virtual {p2}, Lcom/birbit/android/jobqueue/f;->e()Ljava/lang/Long;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide p1

    invoke-direct {p0, v0, v1, p1, p2}, Lr1/a$a;->c(JJ)I

    move-result p1

    neg-int p1, p1

    return p1
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lcom/birbit/android/jobqueue/f;

    check-cast p2, Lcom/birbit/android/jobqueue/f;

    invoke-virtual {p0, p1, p2}, Lr1/a$a;->a(Lcom/birbit/android/jobqueue/f;Lcom/birbit/android/jobqueue/f;)I

    move-result p1

    return p1
.end method
