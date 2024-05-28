.class Lcom/birbit/android/jobqueue/persistentQueue/sqlite/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lh0/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lh0/e<",
            "Ljava/lang/Long;",
            "Lcom/birbit/android/jobqueue/persistentQueue/sqlite/c;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Ljava/lang/String;


# direct methods
.method public constructor <init>(J)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/d$a;

    const/16 v1, 0xf

    invoke-direct {v0, p0, v1}, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/d$a;-><init>(Lcom/birbit/android/jobqueue/persistentQueue/sqlite/d;I)V

    iput-object v0, p0, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/d;->a:Lh0/e;

    .line 3
    invoke-static {p1, p2}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/d;->b:Ljava/lang/String;

    return-void
.end method

.method private b(Lcom/birbit/android/jobqueue/c;Ljava/util/Collection;)J
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/birbit/android/jobqueue/c;",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;)J"
        }
    .end annotation

    invoke-virtual {p1}, Lcom/birbit/android/jobqueue/c;->s()Z

    move-result v0

    const/4 v1, 0x0

    shl-int/2addr v0, v1

    invoke-virtual {p1}, Lcom/birbit/android/jobqueue/c;->t()Z

    move-result v2

    const/4 v3, 0x1

    shl-int/2addr v2, v3

    or-int/2addr v0, v2

    invoke-virtual {p1}, Lcom/birbit/android/jobqueue/c;->f()Lo1/g;

    move-result-object v2

    const/4 v4, 0x2

    if-nez v2, :cond_0

    const/4 v2, 0x2

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lcom/birbit/android/jobqueue/c;->f()Lo1/g;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    :goto_0
    shl-int/2addr v2, v4

    or-int/2addr v0, v2

    invoke-virtual {p1}, Lcom/birbit/android/jobqueue/c;->g()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->size()I

    move-result v2

    shl-int/lit8 v2, v2, 0x4

    or-int/2addr v0, v2

    invoke-virtual {p1}, Lcom/birbit/android/jobqueue/c;->c()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    shl-int/lit8 v2, v2, 0xa

    or-int/2addr v0, v2

    invoke-virtual {p1}, Lcom/birbit/android/jobqueue/c;->d()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    shl-int/lit8 v2, v2, 0x10

    or-int/2addr v0, v2

    invoke-virtual {p1}, Lcom/birbit/android/jobqueue/c;->b()Z

    move-result v2

    shl-int/lit8 v2, v2, 0x16

    or-int/2addr v0, v2

    invoke-virtual {p1}, Lcom/birbit/android/jobqueue/c;->h()Ljava/lang/Long;

    move-result-object p1

    if-nez p1, :cond_1

    const/4 v1, 0x1

    :cond_1
    shl-int/lit8 p1, v1, 0x17

    or-int/2addr p1, v0

    invoke-interface {p2}, Ljava/util/Collection;->size()I

    move-result p2

    shl-int/lit8 p2, p2, 0x18

    or-int/2addr p1, p2

    int-to-long p1, p1

    return-wide p1
.end method

.method private c(JLcom/birbit/android/jobqueue/c;Ljava/util/Collection;Ljava/lang/StringBuilder;)Lcom/birbit/android/jobqueue/persistentQueue/sqlite/c;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Lcom/birbit/android/jobqueue/c;",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/StringBuilder;",
            ")",
            "Lcom/birbit/android/jobqueue/persistentQueue/sqlite/c;"
        }
    .end annotation

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p5, v0}, Ljava/lang/StringBuilder;->setLength(I)V

    const-string v1, "1"

    .line 2
    invoke-virtual {p5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 3
    invoke-virtual {p3}, Lcom/birbit/android/jobqueue/c;->s()Z

    move-result v1

    const/4 v2, -0x1

    const-string v3, " <= ?"

    const-string v4, " AND "

    if-eqz v1, :cond_0

    .line 4
    invoke-virtual {p5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v1, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/a;->w:Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$c;

    iget-object v1, v1, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$c;->a:Ljava/lang/String;

    invoke-virtual {p5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v1, 0x1

    const/4 v0, 0x1

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    const/4 v1, -0x1

    .line 5
    :goto_0
    invoke-virtual {p3}, Lcom/birbit/android/jobqueue/c;->t()Z

    move-result v5

    if-eqz v5, :cond_1

    .line 6
    invoke-virtual {p5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v2, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/a;->x:Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$c;

    iget-object v2, v2, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$c;->a:Ljava/lang/String;

    invoke-virtual {p5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v2, v0, 0x1

    move v8, v2

    move v2, v0

    move v0, v8

    .line 7
    :cond_1
    invoke-virtual {p3}, Lcom/birbit/android/jobqueue/c;->h()Ljava/lang/Long;

    move-result-object v5

    if-eqz v5, :cond_2

    .line 8
    invoke-virtual {p5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v5, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/a;->u:Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$c;

    iget-object v5, v5, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$c;->a:Ljava/lang/String;

    invoke-virtual {p5, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v0, v0, 0x1

    .line 9
    :cond_2
    invoke-virtual {p3}, Lcom/birbit/android/jobqueue/c;->f()Lo1/g;

    move-result-object v3

    const-string v5, ")"

    if-eqz v3, :cond_6

    .line 10
    invoke-virtual {p3}, Lcom/birbit/android/jobqueue/c;->g()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_3

    const-string v3, " AND 0 "

    .line 11
    invoke-virtual {p5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto/16 :goto_2

    .line 12
    :cond_3
    invoke-virtual {p5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v3, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/a;->o:Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$c;

    iget-object v3, v3, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$c;->a:Ljava/lang/String;

    invoke-virtual {p5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " IN ( SELECT "

    invoke-virtual {p5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v3, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/a;->z:Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$c;

    iget-object v6, v3, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$c;->a:Ljava/lang/String;

    invoke-virtual {p5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, " FROM "

    invoke-virtual {p5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, "job_holder_tags"

    invoke-virtual {p5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, " WHERE "

    invoke-virtual {p5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v6, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/a;->A:Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$c;

    iget-object v6, v6, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$c;->a:Ljava/lang/String;

    invoke-virtual {p5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, " IN ("

    invoke-virtual {p5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    invoke-virtual {p3}, Lcom/birbit/android/jobqueue/c;->g()Ljava/util/Set;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/Set;->size()I

    move-result v6

    invoke-static {p5, v6}, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b;->a(Ljava/lang/StringBuilder;I)V

    .line 14
    invoke-virtual {p5, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    invoke-virtual {p3}, Lcom/birbit/android/jobqueue/c;->f()Lo1/g;

    move-result-object v6

    sget-object v7, Lo1/g;->o:Lo1/g;

    if-ne v6, v7, :cond_4

    .line 16
    invoke-virtual {p5, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 17
    :cond_4
    invoke-virtual {p3}, Lcom/birbit/android/jobqueue/c;->f()Lo1/g;

    move-result-object v6

    sget-object v7, Lo1/g;->n:Lo1/g;

    if-ne v6, v7, :cond_5

    const-string v6, " GROUP BY (`"

    .line 18
    invoke-virtual {p5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, v3, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$c;->a:Ljava/lang/String;

    invoke-virtual {p5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "`)"

    invoke-virtual {p5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " HAVING count(*) = "

    invoke-virtual {p5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Lcom/birbit/android/jobqueue/c;->g()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->size()I

    move-result v3

    invoke-virtual {p5, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p5, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    :goto_1
    invoke-virtual {p3}, Lcom/birbit/android/jobqueue/c;->g()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->size()I

    move-result v3

    add-int/2addr v0, v3

    goto :goto_2

    .line 20
    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p4, "unknown constraint "

    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 21
    :cond_6
    :goto_2
    invoke-virtual {p3}, Lcom/birbit/android/jobqueue/c;->c()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v3

    const-string v6, " NOT IN("

    if-nez v3, :cond_7

    const-string v3, " AND ("

    .line 22
    invoke-virtual {p5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v3, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/a;->q:Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$c;

    iget-object v7, v3, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$c;->a:Ljava/lang/String;

    invoke-virtual {p5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v7, " IS NULL OR "

    invoke-virtual {p5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, v3, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$c;->a:Ljava/lang/String;

    invoke-virtual {p5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    invoke-virtual {p3}, Lcom/birbit/android/jobqueue/c;->c()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    invoke-static {p5, v3}, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b;->a(Ljava/lang/StringBuilder;I)V

    const-string v3, "))"

    .line 24
    invoke-virtual {p5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    invoke-virtual {p3}, Lcom/birbit/android/jobqueue/c;->c()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    add-int/2addr v0, v3

    .line 26
    :cond_7
    invoke-virtual {p3}, Lcom/birbit/android/jobqueue/c;->d()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_8

    .line 27
    invoke-virtual {p5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v3, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/a;->o:Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$c;

    iget-object v3, v3, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$c;->a:Ljava/lang/String;

    invoke-virtual {p5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    invoke-virtual {p3}, Lcom/birbit/android/jobqueue/c;->d()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    invoke-static {p5, v3}, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b;->a(Ljava/lang/StringBuilder;I)V

    .line 29
    invoke-virtual {p5, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    invoke-virtual {p3}, Lcom/birbit/android/jobqueue/c;->d()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    add-int/2addr v0, v3

    .line 31
    :cond_8
    invoke-interface {p4}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_9

    .line 32
    invoke-virtual {p5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v3, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/a;->o:Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$c;

    iget-object v3, v3, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$c;->a:Ljava/lang/String;

    invoke-virtual {p5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    invoke-interface {p4}, Ljava/util/Collection;->size()I

    move-result v3

    invoke-static {p5, v3}, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b;->a(Ljava/lang/StringBuilder;I)V

    .line 34
    invoke-virtual {p5, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    invoke-interface {p4}, Ljava/util/Collection;->size()I

    move-result p4

    add-int/2addr v0, p4

    .line 36
    :cond_9
    invoke-virtual {p3}, Lcom/birbit/android/jobqueue/c;->b()Z

    move-result p3

    if-eqz p3, :cond_a

    .line 37
    invoke-virtual {p5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object p3, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/a;->v:Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$c;

    iget-object p3, p3, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$c;->a:Ljava/lang/String;

    invoke-virtual {p5, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, " != ?"

    invoke-virtual {p5, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v0, v0, 0x1

    .line 38
    :cond_a
    new-array p3, v0, [Ljava/lang/String;

    .line 39
    new-instance p4, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/c;

    invoke-virtual {p5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p5

    invoke-direct {p4, p1, p2, p5, p3}, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/c;-><init>(JLjava/lang/String;[Ljava/lang/String;)V

    .line 40
    invoke-virtual {p4, v1}, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/c;->g(I)V

    .line 41
    invoke-virtual {p4, v2}, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/c;->h(I)V

    return-object p4
.end method

.method private d(Lcom/birbit/android/jobqueue/c;Lcom/birbit/android/jobqueue/persistentQueue/sqlite/c;Ljava/util/Collection;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/birbit/android/jobqueue/c;",
            "Lcom/birbit/android/jobqueue/persistentQueue/sqlite/c;",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Lcom/birbit/android/jobqueue/c;->s()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p2, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/c;->c:[Ljava/lang/String;

    invoke-virtual {p1}, Lcom/birbit/android/jobqueue/c;->e()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x1

    .line 3
    :cond_0
    invoke-virtual {p1}, Lcom/birbit/android/jobqueue/c;->t()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 4
    iget-object v0, p2, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/c;->c:[Ljava/lang/String;

    add-int/lit8 v2, v1, 0x1

    invoke-virtual {p1}, Lcom/birbit/android/jobqueue/c;->e()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v3

    aput-object v3, v0, v1

    move v1, v2

    .line 5
    :cond_1
    invoke-virtual {p1}, Lcom/birbit/android/jobqueue/c;->h()Ljava/lang/Long;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 6
    iget-object v0, p2, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/c;->c:[Ljava/lang/String;

    add-int/lit8 v2, v1, 0x1

    invoke-virtual {p1}, Lcom/birbit/android/jobqueue/c;->h()Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v3

    aput-object v3, v0, v1

    move v1, v2

    .line 7
    :cond_2
    invoke-virtual {p1}, Lcom/birbit/android/jobqueue/c;->f()Lo1/g;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 8
    invoke-virtual {p1}, Lcom/birbit/android/jobqueue/c;->g()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 9
    iget-object v3, p2, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/c;->c:[Ljava/lang/String;

    add-int/lit8 v4, v1, 0x1

    aput-object v2, v3, v1

    move v1, v4

    goto :goto_0

    .line 10
    :cond_3
    invoke-virtual {p1}, Lcom/birbit/android/jobqueue/c;->c()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 11
    iget-object v3, p2, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/c;->c:[Ljava/lang/String;

    add-int/lit8 v4, v1, 0x1

    aput-object v2, v3, v1

    move v1, v4

    goto :goto_1

    .line 12
    :cond_4
    invoke-virtual {p1}, Lcom/birbit/android/jobqueue/c;->d()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 13
    iget-object v3, p2, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/c;->c:[Ljava/lang/String;

    add-int/lit8 v4, v1, 0x1

    aput-object v2, v3, v1

    move v1, v4

    goto :goto_2

    .line 14
    :cond_5
    invoke-interface {p3}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :goto_3
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 15
    iget-object v2, p2, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/c;->c:[Ljava/lang/String;

    add-int/lit8 v3, v1, 0x1

    aput-object v0, v2, v1

    move v1, v3

    goto :goto_3

    .line 16
    :cond_6
    invoke-virtual {p1}, Lcom/birbit/android/jobqueue/c;->b()Z

    move-result p1

    if-eqz p1, :cond_7

    .line 17
    iget-object p1, p2, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/c;->c:[Ljava/lang/String;

    add-int/lit8 p3, v1, 0x1

    iget-object v0, p0, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/d;->b:Ljava/lang/String;

    aput-object v0, p1, v1

    move v1, p3

    .line 18
    :cond_7
    iget-object p1, p2, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/c;->c:[Ljava/lang/String;

    array-length p1, p1

    if-ne v1, p1, :cond_8

    return-void

    .line 19
    :cond_8
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "something is wrong with where query cache for "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p2, p2, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/c;->b:Ljava/lang/String;

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private e(Lcom/birbit/android/jobqueue/c;)Z
    .locals 2

    invoke-virtual {p1}, Lcom/birbit/android/jobqueue/c;->g()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->size()I

    move-result v0

    const/16 v1, 0x40

    if-ge v0, v1, :cond_0

    invoke-virtual {p1}, Lcom/birbit/android/jobqueue/c;->c()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v0, v1, :cond_0

    invoke-virtual {p1}, Lcom/birbit/android/jobqueue/c;->d()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    if-ge p1, v1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method


# virtual methods
.method public a(Lcom/birbit/android/jobqueue/c;Ljava/util/Collection;Ljava/lang/StringBuilder;)Lcom/birbit/android/jobqueue/persistentQueue/sqlite/c;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/birbit/android/jobqueue/c;",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/StringBuilder;",
            ")",
            "Lcom/birbit/android/jobqueue/persistentQueue/sqlite/c;"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1}, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/d;->e(Lcom/birbit/android/jobqueue/c;)Z

    move-result v0

    .line 2
    invoke-direct {p0, p1, p2}, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/d;->b(Lcom/birbit/android/jobqueue/c;Ljava/util/Collection;)J

    move-result-wide v7

    if-eqz v0, :cond_0

    .line 3
    iget-object v1, p0, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/d;->a:Lh0/e;

    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v1, v2}, Lh0/e;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/c;

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-nez v1, :cond_1

    move-object v1, p0

    move-wide v2, v7

    move-object v4, p1

    move-object v5, p2

    move-object v6, p3

    .line 4
    invoke-direct/range {v1 .. v6}, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/d;->c(JLcom/birbit/android/jobqueue/c;Ljava/util/Collection;Ljava/lang/StringBuilder;)Lcom/birbit/android/jobqueue/persistentQueue/sqlite/c;

    move-result-object v1

    if-eqz v0, :cond_1

    .line 5
    iget-object p3, p0, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/d;->a:Lh0/e;

    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {p3, v0, v1}, Lh0/e;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    :cond_1
    invoke-direct {p0, p1, v1, p2}, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/d;->d(Lcom/birbit/android/jobqueue/c;Lcom/birbit/android/jobqueue/persistentQueue/sqlite/c;Ljava/util/Collection;)V

    return-object v1
.end method
