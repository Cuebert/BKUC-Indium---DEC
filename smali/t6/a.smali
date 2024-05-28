.class public Lt6/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:J

.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private d:Ljava/lang/String;


# direct methods
.method public constructor <init>(JLjava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-wide p1, p0, Lt6/a;->a:J

    const-string p1, ""

    if-eqz p3, :cond_0

    goto :goto_0

    :cond_0
    move-object p3, p1

    .line 3
    :goto_0
    iput-object p3, p0, Lt6/a;->b:Ljava/lang/String;

    .line 4
    iput-object p1, p0, Lt6/a;->c:Ljava/lang/String;

    .line 5
    iput-object p1, p0, Lt6/a;->d:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lt6/a;->d:Ljava/lang/String;

    return-object v0
.end method

.method public b()J
    .locals 2

    iget-wide v0, p0, Lt6/a;->a:J

    return-wide v0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lt6/a;->c:Ljava/lang/String;

    return-object v0
.end method

.method public d()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lt6/a;->b:Ljava/lang/String;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "User "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lt6/a;->b()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public e(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lt6/a;->d:Ljava/lang/String;

    return-void
.end method

.method public f(J)V
    .locals 0

    iput-wide p1, p0, Lt6/a;->a:J

    return-void
.end method

.method public g(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lt6/a;->c:Ljava/lang/String;

    return-void
.end method

.method public h(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lt6/a;->b:Ljava/lang/String;

    return-void
.end method

.method public i(Lt6/a;)V
    .locals 5

    if-ne p1, p0, :cond_0

    return-void

    .line 1
    :cond_0
    iget-wide v0, p0, Lt6/a;->a:J

    invoke-virtual {p1}, Lt6/a;->b()J

    move-result-wide v2

    cmp-long v4, v0, v2

    if-eqz v4, :cond_1

    invoke-virtual {p1}, Lt6/a;->b()J

    move-result-wide v0

    const-wide/16 v2, -0x1

    cmp-long v4, v0, v2

    if-eqz v4, :cond_1

    .line 2
    invoke-virtual {p1}, Lt6/a;->b()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lt6/a;->f(J)V

    .line 3
    :cond_1
    iget-object v0, p0, Lt6/a;->b:Ljava/lang/String;

    invoke-virtual {p1}, Lt6/a;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p1}, Lt6/a;->d()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    .line 4
    invoke-virtual {p1}, Lt6/a;->d()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lt6/a;->h(Ljava/lang/String;)V

    .line 5
    :cond_2
    iget-object v0, p0, Lt6/a;->c:Ljava/lang/String;

    invoke-virtual {p1}, Lt6/a;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    invoke-virtual {p1}, Lt6/a;->c()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    .line 6
    invoke-virtual {p1}, Lt6/a;->c()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lt6/a;->g(Ljava/lang/String;)V

    .line 7
    :cond_3
    iget-object v0, p0, Lt6/a;->d:Ljava/lang/String;

    invoke-virtual {p1}, Lt6/a;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    invoke-virtual {p1}, Lt6/a;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_4

    .line 8
    invoke-virtual {p1}, Lt6/a;->a()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lt6/a;->e(Ljava/lang/String;)V

    :cond_4
    return-void
.end method
