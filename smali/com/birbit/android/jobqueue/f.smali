.class public Lcom/birbit/android/jobqueue/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/birbit/android/jobqueue/f$b;
    }
.end annotation


# instance fields
.field protected a:Ljava/lang/Long;

.field protected b:Ljava/lang/String;

.field protected c:I

.field protected d:Ljava/lang/String;

.field protected e:I

.field protected f:J

.field protected g:J

.field protected h:J

.field protected i:J

.field protected j:J

.field transient k:Lcom/birbit/android/jobqueue/e;

.field protected final l:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private m:Z

.field private n:Z

.field private o:Z


# direct methods
.method private constructor <init>(ILjava/lang/String;ILcom/birbit/android/jobqueue/e;JJJ)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    invoke-virtual {p4}, Lcom/birbit/android/jobqueue/e;->c()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/birbit/android/jobqueue/f;->b:Ljava/lang/String;

    .line 4
    iput p1, p0, Lcom/birbit/android/jobqueue/f;->c:I

    .line 5
    iput-object p2, p0, Lcom/birbit/android/jobqueue/f;->d:Ljava/lang/String;

    .line 6
    iput p3, p0, Lcom/birbit/android/jobqueue/f;->e:I

    .line 7
    iput-wide p5, p0, Lcom/birbit/android/jobqueue/f;->g:J

    .line 8
    iput-wide p7, p0, Lcom/birbit/android/jobqueue/f;->f:J

    .line 9
    iput-object p4, p0, Lcom/birbit/android/jobqueue/f;->k:Lcom/birbit/android/jobqueue/e;

    .line 10
    iput p1, p4, Lcom/birbit/android/jobqueue/e;->w:I

    .line 11
    iput-wide p9, p0, Lcom/birbit/android/jobqueue/f;->h:J

    .line 12
    invoke-virtual {p4}, Lcom/birbit/android/jobqueue/e;->e()J

    move-result-wide p1

    iput-wide p1, p0, Lcom/birbit/android/jobqueue/f;->i:J

    .line 13
    invoke-virtual {p4}, Lcom/birbit/android/jobqueue/e;->f()J

    move-result-wide p1

    iput-wide p1, p0, Lcom/birbit/android/jobqueue/f;->j:J

    .line 14
    invoke-virtual {p4}, Lcom/birbit/android/jobqueue/e;->j()Ljava/util/Set;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p4}, Lcom/birbit/android/jobqueue/e;->j()Ljava/util/Set;

    move-result-object p1

    invoke-static {p1}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object p1

    :goto_0
    iput-object p1, p0, Lcom/birbit/android/jobqueue/f;->l:Ljava/util/Set;

    return-void
.end method

.method synthetic constructor <init>(ILjava/lang/String;ILcom/birbit/android/jobqueue/e;JJJLcom/birbit/android/jobqueue/f$a;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p10}, Lcom/birbit/android/jobqueue/f;-><init>(ILjava/lang/String;ILcom/birbit/android/jobqueue/e;JJJ)V

    return-void
.end method


# virtual methods
.method public A(I)V
    .locals 1

    .line 1
    iput p1, p0, Lcom/birbit/android/jobqueue/f;->c:I

    .line 2
    iget-object v0, p0, Lcom/birbit/android/jobqueue/f;->k:Lcom/birbit/android/jobqueue/e;

    iput p1, v0, Lcom/birbit/android/jobqueue/e;->w:I

    return-void
.end method

.method public B(I)V
    .locals 0

    iput p1, p0, Lcom/birbit/android/jobqueue/f;->e:I

    return-void
.end method

.method public C(J)V
    .locals 0

    iput-wide p1, p0, Lcom/birbit/android/jobqueue/f;->h:J

    return-void
.end method

.method public a()J
    .locals 2

    iget-wide v0, p0, Lcom/birbit/android/jobqueue/f;->g:J

    return-wide v0
.end method

.method public b()J
    .locals 2

    iget-wide v0, p0, Lcom/birbit/android/jobqueue/f;->f:J

    return-wide v0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/birbit/android/jobqueue/f;->d:Ljava/lang/String;

    return-object v0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/birbit/android/jobqueue/f;->b:Ljava/lang/String;

    return-object v0
.end method

.method public e()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Lcom/birbit/android/jobqueue/f;->a:Ljava/lang/Long;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    instance-of v0, p1, Lcom/birbit/android/jobqueue/f;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 2
    :cond_0
    check-cast p1, Lcom/birbit/android/jobqueue/f;

    .line 3
    iget-object v0, p0, Lcom/birbit/android/jobqueue/f;->b:Ljava/lang/String;

    iget-object p1, p1, Lcom/birbit/android/jobqueue/f;->b:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public f()Lcom/birbit/android/jobqueue/e;
    .locals 1

    iget-object v0, p0, Lcom/birbit/android/jobqueue/f;->k:Lcom/birbit/android/jobqueue/e;

    return-object v0
.end method

.method public g()I
    .locals 1

    iget v0, p0, Lcom/birbit/android/jobqueue/f;->c:I

    return v0
.end method

.method public h()J
    .locals 2

    iget-wide v0, p0, Lcom/birbit/android/jobqueue/f;->i:J

    return-wide v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lcom/birbit/android/jobqueue/f;->b:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0
.end method

.method public i()J
    .locals 2

    iget-wide v0, p0, Lcom/birbit/android/jobqueue/f;->j:J

    return-wide v0
.end method

.method public j()Lo1/e;
    .locals 1

    iget-object v0, p0, Lcom/birbit/android/jobqueue/f;->k:Lcom/birbit/android/jobqueue/e;

    iget-object v0, v0, Lcom/birbit/android/jobqueue/e;->A:Lo1/e;

    return-object v0
.end method

.method public k()I
    .locals 1

    iget v0, p0, Lcom/birbit/android/jobqueue/f;->e:I

    return v0
.end method

.method public l()J
    .locals 2

    iget-wide v0, p0, Lcom/birbit/android/jobqueue/f;->h:J

    return-wide v0
.end method

.method public m()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/birbit/android/jobqueue/f;->l:Ljava/util/Set;

    return-object v0
.end method

.method public n()Z
    .locals 1

    iget-object v0, p0, Lcom/birbit/android/jobqueue/f;->l:Ljava/util/Set;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/Set;->size()I

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public o()Z
    .locals 1

    iget-boolean v0, p0, Lcom/birbit/android/jobqueue/f;->m:Z

    return v0
.end method

.method public p()Z
    .locals 1

    iget-boolean v0, p0, Lcom/birbit/android/jobqueue/f;->n:Z

    return v0
.end method

.method public q()V
    .locals 2

    const/4 v0, 0x1

    .line 1
    iput-boolean v0, p0, Lcom/birbit/android/jobqueue/f;->m:Z

    .line 2
    iget-object v1, p0, Lcom/birbit/android/jobqueue/f;->k:Lcom/birbit/android/jobqueue/e;

    iput-boolean v0, v1, Lcom/birbit/android/jobqueue/e;->y:Z

    return-void
.end method

.method public r()V
    .locals 1

    const/4 v0, 0x1

    .line 1
    iput-boolean v0, p0, Lcom/birbit/android/jobqueue/f;->n:Z

    .line 2
    invoke-virtual {p0}, Lcom/birbit/android/jobqueue/f;->q()V

    return-void
.end method

.method public declared-synchronized s()V
    .locals 1

    monitor-enter p0

    const/4 v0, 0x1

    .line 1
    :try_start_0
    iput-boolean v0, p0, Lcom/birbit/android/jobqueue/f;->o:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public t(I)V
    .locals 1

    iget-object v0, p0, Lcom/birbit/android/jobqueue/f;->k:Lcom/birbit/android/jobqueue/e;

    invoke-virtual {v0, p1}, Lcom/birbit/android/jobqueue/e;->m(I)V

    return-void
.end method

.method public u(J)Z
    .locals 3

    iget-wide v0, p0, Lcom/birbit/android/jobqueue/f;->i:J

    cmp-long v2, v0, p1

    if-lez v2, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public v(J)Z
    .locals 3

    iget-wide v0, p0, Lcom/birbit/android/jobqueue/f;->j:J

    cmp-long v2, v0, p1

    if-lez v2, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public w(I)I
    .locals 1

    iget-object v0, p0, Lcom/birbit/android/jobqueue/f;->k:Lcom/birbit/android/jobqueue/e;

    invoke-virtual {v0, p0, p1}, Lcom/birbit/android/jobqueue/e;->q(Lcom/birbit/android/jobqueue/f;I)I

    move-result p1

    return p1
.end method

.method public x(Landroid/content/Context;)V
    .locals 1

    iget-object v0, p0, Lcom/birbit/android/jobqueue/f;->k:Lcom/birbit/android/jobqueue/e;

    invoke-virtual {v0, p1}, Lcom/birbit/android/jobqueue/e;->s(Landroid/content/Context;)V

    return-void
.end method

.method public y(J)V
    .locals 0

    iput-wide p1, p0, Lcom/birbit/android/jobqueue/f;->f:J

    return-void
.end method

.method public z(J)V
    .locals 0

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, p0, Lcom/birbit/android/jobqueue/f;->a:Ljava/lang/Long;

    return-void
.end method
