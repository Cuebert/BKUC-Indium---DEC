.class public Lcom/birbit/android/jobqueue/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Z

.field private b:Z

.field private c:Lo1/g;

.field private final d:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final f:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private g:Z

.field private h:Ljava/lang/Long;

.field private i:J


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/birbit/android/jobqueue/c;->d:Ljava/util/Set;

    .line 3
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/birbit/android/jobqueue/c;->e:Ljava/util/List;

    .line 4
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/birbit/android/jobqueue/c;->f:Ljava/util/List;

    return-void
.end method


# virtual methods
.method a()V
    .locals 3

    const/4 v0, 0x0

    .line 1
    iput-boolean v0, p0, Lcom/birbit/android/jobqueue/c;->a:Z

    .line 2
    iput-boolean v0, p0, Lcom/birbit/android/jobqueue/c;->b:Z

    const/4 v1, 0x0

    .line 3
    iput-object v1, p0, Lcom/birbit/android/jobqueue/c;->c:Lo1/g;

    .line 4
    iget-object v2, p0, Lcom/birbit/android/jobqueue/c;->d:Ljava/util/Set;

    invoke-interface {v2}, Ljava/util/Set;->clear()V

    .line 5
    iget-object v2, p0, Lcom/birbit/android/jobqueue/c;->e:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->clear()V

    .line 6
    iget-object v2, p0, Lcom/birbit/android/jobqueue/c;->f:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->clear()V

    .line 7
    iput-boolean v0, p0, Lcom/birbit/android/jobqueue/c;->g:Z

    .line 8
    iput-object v1, p0, Lcom/birbit/android/jobqueue/c;->h:Ljava/lang/Long;

    const-wide/high16 v0, -0x8000000000000000L

    .line 9
    iput-wide v0, p0, Lcom/birbit/android/jobqueue/c;->i:J

    return-void
.end method

.method public b()Z
    .locals 1

    iget-boolean v0, p0, Lcom/birbit/android/jobqueue/c;->g:Z

    return v0
.end method

.method public c()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/birbit/android/jobqueue/c;->e:Ljava/util/List;

    return-object v0
.end method

.method public d()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/birbit/android/jobqueue/c;->f:Ljava/util/List;

    return-object v0
.end method

.method public e()J
    .locals 2

    iget-wide v0, p0, Lcom/birbit/android/jobqueue/c;->i:J

    return-wide v0
.end method

.method public f()Lo1/g;
    .locals 1

    iget-object v0, p0, Lcom/birbit/android/jobqueue/c;->c:Lo1/g;

    return-object v0
.end method

.method public g()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/birbit/android/jobqueue/c;->d:Ljava/util/Set;

    return-object v0
.end method

.method public h()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Lcom/birbit/android/jobqueue/c;->h:Ljava/lang/Long;

    return-object v0
.end method

.method i(Ljava/util/Collection;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/birbit/android/jobqueue/c;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    if-eqz p1, :cond_0

    .line 2
    iget-object v0, p0, Lcom/birbit/android/jobqueue/c;->e:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_0
    return-void
.end method

.method j(Ljava/util/Collection;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/birbit/android/jobqueue/c;->f:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    if-eqz p1, :cond_0

    .line 2
    iget-object v0, p0, Lcom/birbit/android/jobqueue/c;->f:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_0
    return-void
.end method

.method k(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/birbit/android/jobqueue/c;->g:Z

    return-void
.end method

.method l(I)V
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-ne p1, v1, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    .line 1
    :goto_0
    invoke-virtual {p0, v2}, Lcom/birbit/android/jobqueue/c;->n(Z)V

    const/4 v2, 0x3

    if-eq p1, v2, :cond_1

    const/4 v0, 0x1

    .line 2
    :cond_1
    invoke-virtual {p0, v0}, Lcom/birbit/android/jobqueue/c;->o(Z)V

    return-void
.end method

.method public m(J)V
    .locals 0

    iput-wide p1, p0, Lcom/birbit/android/jobqueue/c;->i:J

    return-void
.end method

.method n(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/birbit/android/jobqueue/c;->a:Z

    return-void
.end method

.method o(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/birbit/android/jobqueue/c;->b:Z

    return-void
.end method

.method p(Lo1/g;)V
    .locals 0

    iput-object p1, p0, Lcom/birbit/android/jobqueue/c;->c:Lo1/g;

    return-void
.end method

.method q([Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/birbit/android/jobqueue/c;->d:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->clear()V

    if-eqz p1, :cond_0

    .line 2
    iget-object v0, p0, Lcom/birbit/android/jobqueue/c;->d:Ljava/util/Set;

    invoke-static {v0, p1}, Ljava/util/Collections;->addAll(Ljava/util/Collection;[Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method r(Ljava/lang/Long;)V
    .locals 0

    iput-object p1, p0, Lcom/birbit/android/jobqueue/c;->h:Ljava/lang/Long;

    return-void
.end method

.method public s()Z
    .locals 1

    iget-boolean v0, p0, Lcom/birbit/android/jobqueue/c;->a:Z

    return v0
.end method

.method public t()Z
    .locals 1

    iget-boolean v0, p0, Lcom/birbit/android/jobqueue/c;->b:Z

    return v0
.end method
