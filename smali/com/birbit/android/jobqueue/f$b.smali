.class public Lcom/birbit/android/jobqueue/f$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/birbit/android/jobqueue/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field private a:I

.field private b:Ljava/lang/String;

.field private c:I

.field private d:Lcom/birbit/android/jobqueue/e;

.field private e:J

.field private f:J

.field private g:Ljava/lang/Long;

.field private h:J

.field private i:I


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/high16 v0, -0x8000000000000000L

    .line 2
    iput-wide v0, p0, Lcom/birbit/android/jobqueue/f$b;->f:J

    const/4 v0, 0x0

    .line 3
    iput v0, p0, Lcom/birbit/android/jobqueue/f$b;->i:I

    return-void
.end method


# virtual methods
.method public a()Lcom/birbit/android/jobqueue/f;
    .locals 13

    .line 1
    iget-object v4, p0, Lcom/birbit/android/jobqueue/f$b;->d:Lcom/birbit/android/jobqueue/e;

    if-eqz v4, :cond_4

    .line 2
    iget v0, p0, Lcom/birbit/android/jobqueue/f$b;->i:I

    and-int/lit8 v1, v0, 0x2

    if-eqz v1, :cond_3

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_2

    and-int/lit8 v0, v0, 0x4

    if-eqz v0, :cond_1

    .line 3
    new-instance v12, Lcom/birbit/android/jobqueue/f;

    iget v1, p0, Lcom/birbit/android/jobqueue/f$b;->a:I

    iget-object v2, p0, Lcom/birbit/android/jobqueue/f$b;->b:Ljava/lang/String;

    iget v3, p0, Lcom/birbit/android/jobqueue/f$b;->c:I

    iget-wide v5, p0, Lcom/birbit/android/jobqueue/f$b;->e:J

    iget-wide v7, p0, Lcom/birbit/android/jobqueue/f$b;->f:J

    iget-wide v9, p0, Lcom/birbit/android/jobqueue/f$b;->h:J

    const/4 v11, 0x0

    move-object v0, v12

    invoke-direct/range {v0 .. v11}, Lcom/birbit/android/jobqueue/f;-><init>(ILjava/lang/String;ILcom/birbit/android/jobqueue/e;JJJLcom/birbit/android/jobqueue/f$a;)V

    .line 4
    iget-object v0, p0, Lcom/birbit/android/jobqueue/f$b;->g:Ljava/lang/Long;

    if-eqz v0, :cond_0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-virtual {v12, v0, v1}, Lcom/birbit/android/jobqueue/f;->z(J)V

    :cond_0
    return-object v12

    .line 6
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "must provide a created timestamp"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 7
    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "must provide a session id"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 8
    :cond_3
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "must provide a priority"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 9
    :cond_4
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "must provide a job"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public b(J)Lcom/birbit/android/jobqueue/f$b;
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/birbit/android/jobqueue/f$b;->e:J

    .line 2
    iget p1, p0, Lcom/birbit/android/jobqueue/f$b;->i:I

    or-int/lit8 p1, p1, 0x4

    iput p1, p0, Lcom/birbit/android/jobqueue/f$b;->i:I

    return-object p0
.end method

.method public c(J)Lcom/birbit/android/jobqueue/f$b;
    .locals 0

    iput-wide p1, p0, Lcom/birbit/android/jobqueue/f$b;->f:J

    return-object p0
.end method

.method public d(Ljava/lang/String;)Lcom/birbit/android/jobqueue/f$b;
    .locals 0

    iput-object p1, p0, Lcom/birbit/android/jobqueue/f$b;->b:Ljava/lang/String;

    return-object p0
.end method

.method public e(J)Lcom/birbit/android/jobqueue/f$b;
    .locals 0

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, p0, Lcom/birbit/android/jobqueue/f$b;->g:Ljava/lang/Long;

    return-object p0
.end method

.method public f(Lcom/birbit/android/jobqueue/e;)Lcom/birbit/android/jobqueue/f$b;
    .locals 0

    iput-object p1, p0, Lcom/birbit/android/jobqueue/f$b;->d:Lcom/birbit/android/jobqueue/e;

    return-object p0
.end method

.method public g(I)Lcom/birbit/android/jobqueue/f$b;
    .locals 0

    .line 1
    iput p1, p0, Lcom/birbit/android/jobqueue/f$b;->a:I

    .line 2
    iget p1, p0, Lcom/birbit/android/jobqueue/f$b;->i:I

    or-int/lit8 p1, p1, 0x2

    iput p1, p0, Lcom/birbit/android/jobqueue/f$b;->i:I

    return-object p0
.end method

.method public h(I)Lcom/birbit/android/jobqueue/f$b;
    .locals 0

    iput p1, p0, Lcom/birbit/android/jobqueue/f$b;->c:I

    return-object p0
.end method

.method public i(J)Lcom/birbit/android/jobqueue/f$b;
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/birbit/android/jobqueue/f$b;->h:J

    .line 2
    iget p1, p0, Lcom/birbit/android/jobqueue/f$b;->i:I

    or-int/lit8 p1, p1, 0x1

    iput p1, p0, Lcom/birbit/android/jobqueue/f$b;->i:I

    return-object p0
.end method
