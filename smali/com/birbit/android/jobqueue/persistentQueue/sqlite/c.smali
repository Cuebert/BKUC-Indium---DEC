.class public Lcom/birbit/android/jobqueue/persistentQueue/sqlite/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:J

.field public final b:Ljava/lang/String;

.field public final c:[Ljava/lang/String;

.field private d:Landroid/database/sqlite/SQLiteStatement;

.field private e:Ljava/lang/String;

.field private f:Landroid/database/sqlite/SQLiteStatement;

.field private g:Landroid/database/sqlite/SQLiteStatement;

.field private h:Ljava/lang/String;

.field private i:I

.field private j:I


# direct methods
.method public constructor <init>(JLjava/lang/String;[Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 2
    iput v0, p0, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/c;->i:I

    .line 3
    iput v0, p0, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/c;->j:I

    .line 4
    iput-wide p1, p0, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/c;->a:J

    .line 5
    iput-object p3, p0, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/c;->b:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/c;->c:[Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/StringBuilder;)Landroid/database/sqlite/SQLiteStatement;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/c;->d:Landroid/database/sqlite/SQLiteStatement;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    .line 2
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->setLength(I)V

    const-string v0, "SELECT SUM(case WHEN "

    .line 3
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v0, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/a;->q:Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$c;

    iget-object v1, v0, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$c;->a:Ljava/lang/String;

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " is null then group_cnt else 1 end) from ("

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "SELECT count(*) group_cnt, "

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, v0, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$c;->a:Ljava/lang/String;

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " FROM "

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "job_holder"

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " WHERE "

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/c;->b:Ljava/lang/String;

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " GROUP BY "

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, v0, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$c;->a:Ljava/lang/String;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 4
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/database/sqlite/SQLiteDatabase;->compileStatement(Ljava/lang/String;)Landroid/database/sqlite/SQLiteStatement;

    move-result-object p1

    iput-object p1, p0, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/c;->d:Landroid/database/sqlite/SQLiteStatement;

    goto :goto_0

    .line 5
    :cond_0
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteStatement;->clearBindings()V

    :goto_0
    const/4 p1, 0x1

    .line 6
    :goto_1
    iget-object p2, p0, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/c;->c:[Ljava/lang/String;

    array-length v0, p2

    if-gt p1, v0, :cond_1

    .line 7
    iget-object v0, p0, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/c;->d:Landroid/database/sqlite/SQLiteStatement;

    add-int/lit8 v1, p1, -0x1

    aget-object p2, p2, v1

    invoke-virtual {v0, p1, p2}, Landroid/database/sqlite/SQLiteStatement;->bindString(ILjava/lang/String;)V

    add-int/lit8 p1, p1, 0x1

    goto :goto_1

    .line 8
    :cond_1
    iget-object p1, p0, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/c;->d:Landroid/database/sqlite/SQLiteStatement;

    return-object p1
.end method

.method public b()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/c;->d:Landroid/database/sqlite/SQLiteStatement;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteStatement;->close()V

    .line 3
    iput-object v1, p0, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/c;->d:Landroid/database/sqlite/SQLiteStatement;

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/c;->f:Landroid/database/sqlite/SQLiteStatement;

    if-eqz v0, :cond_1

    .line 5
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteStatement;->close()V

    .line 6
    iput-object v1, p0, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/c;->f:Landroid/database/sqlite/SQLiteStatement;

    .line 7
    :cond_1
    iget-object v0, p0, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/c;->g:Landroid/database/sqlite/SQLiteStatement;

    if-eqz v0, :cond_2

    .line 8
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteStatement;->close()V

    .line 9
    iput-object v1, p0, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/c;->g:Landroid/database/sqlite/SQLiteStatement;

    :cond_2
    return-void
.end method

.method public c(Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b;)Ljava/lang/String;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/c;->e:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/c;->b:Ljava/lang/String;

    const/4 v1, 0x0

    const/4 v2, 0x0

    new-array v2, v2, [Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$b;

    invoke-virtual {p1, v0, v1, v2}, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b;->c(Ljava/lang/String;Ljava/lang/Integer;[Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$b;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/c;->e:Ljava/lang/String;

    .line 3
    :cond_0
    iget-object p1, p0, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/c;->e:Ljava/lang/String;

    return-object p1
.end method

.method public d(Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b;)Ljava/lang/String;
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/c;->h:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/c;->b:Ljava/lang/String;

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    new-array v3, v3, [Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$b;

    const/4 v4, 0x0

    new-instance v5, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$b;

    sget-object v6, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/a;->p:Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$c;

    sget-object v7, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$b$a;->o:Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$b$a;

    invoke-direct {v5, v6, v7}, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$b;-><init>(Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$c;Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$b$a;)V

    aput-object v5, v3, v4

    new-instance v4, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$b;

    sget-object v5, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/a;->t:Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$c;

    sget-object v6, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$b$a;->n:Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$b$a;

    invoke-direct {v4, v5, v6}, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$b;-><init>(Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$c;Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$b$a;)V

    aput-object v4, v3, v1

    const/4 v1, 0x2

    new-instance v4, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$b;

    sget-object v5, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/a;->n:Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$c;

    invoke-direct {v4, v5, v6}, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$b;-><init>(Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$c;Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$b$a;)V

    aput-object v4, v3, v1

    invoke-virtual {p1, v0, v2, v3}, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b;->c(Ljava/lang/String;Ljava/lang/Integer;[Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$b;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/c;->h:Ljava/lang/String;

    .line 3
    :cond_0
    iget-object p1, p0, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/c;->h:Ljava/lang/String;

    return-object p1
.end method

.method public e(Landroid/database/sqlite/SQLiteDatabase;Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b;)Landroid/database/sqlite/SQLiteStatement;
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/c;->f:Landroid/database/sqlite/SQLiteStatement;

    const/4 v1, 0x1

    if-nez v0, :cond_0

    .line 2
    sget-object v0, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/a;->u:Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$c;

    iget-object v2, p0, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/c;->b:Ljava/lang/String;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    new-array v4, v1, [Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$b;

    const/4 v5, 0x0

    new-instance v6, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$b;

    sget-object v7, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$b$a;->n:Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$b$a;

    invoke-direct {v6, v0, v7}, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$b;-><init>(Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$c;Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$b$a;)V

    aput-object v6, v4, v5

    invoke-virtual {p2, v0, v2, v3, v4}, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b;->d(Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$c;Ljava/lang/String;Ljava/lang/Integer;[Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$b;)Ljava/lang/String;

    move-result-object p2

    .line 3
    invoke-virtual {p1, p2}, Landroid/database/sqlite/SQLiteDatabase;->compileStatement(Ljava/lang/String;)Landroid/database/sqlite/SQLiteStatement;

    move-result-object p1

    iput-object p1, p0, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/c;->f:Landroid/database/sqlite/SQLiteStatement;

    goto :goto_0

    .line 4
    :cond_0
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteStatement;->clearBindings()V

    .line 5
    :goto_0
    iget-object p1, p0, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/c;->c:[Ljava/lang/String;

    array-length p2, p1

    if-gt v1, p2, :cond_1

    .line 6
    iget-object p2, p0, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/c;->f:Landroid/database/sqlite/SQLiteStatement;

    add-int/lit8 v0, v1, -0x1

    aget-object p1, p1, v0

    invoke-virtual {p2, v1, p1}, Landroid/database/sqlite/SQLiteStatement;->bindString(ILjava/lang/String;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 7
    :cond_1
    iget-object p1, p0, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/c;->f:Landroid/database/sqlite/SQLiteStatement;

    return-object p1
.end method

.method public f(Landroid/database/sqlite/SQLiteDatabase;Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b;)Landroid/database/sqlite/SQLiteStatement;
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/c;->g:Landroid/database/sqlite/SQLiteStatement;

    const-wide v1, 0x7fffffffffffffffL

    const/4 v3, -0x1

    if-nez v0, :cond_4

    .line 2
    iget-object p2, p2, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b;->i:Ljava/lang/StringBuilder;

    const/4 v0, 0x0

    .line 3
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->setLength(I)V

    const-string v0, "SELECT max("

    .line 4
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v0, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/a;->u:Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$c;

    iget-object v0, v0, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$c;->a:Ljava/lang/String;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 5
    iget v0, p0, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/c;->i:I

    const-string v4, ","

    if-eq v0, v3, :cond_0

    .line 6
    invoke-virtual {p2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v0, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/a;->w:Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$c;

    iget-object v0, v0, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$c;->a:Ljava/lang/String;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 7
    :cond_0
    iget v0, p0, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/c;->j:I

    if-eq v0, v3, :cond_1

    .line 8
    invoke-virtual {p2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v0, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/a;->x:Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$c;

    iget-object v0, v0, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$c;->a:Ljava/lang/String;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1
    const-string v0, ") FROM "

    .line 9
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "job_holder"

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " WHERE "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/c;->b:Ljava/lang/String;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 10
    iget v0, p0, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/c;->i:I

    const-string v4, " != "

    const-string v5, " AND "

    if-eq v0, v3, :cond_2

    .line 11
    invoke-virtual {p2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v0, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/a;->w:Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$c;

    iget-object v0, v0, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$c;->a:Ljava/lang/String;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 12
    :cond_2
    iget v0, p0, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/c;->j:I

    if-eq v0, v3, :cond_3

    .line 13
    invoke-virtual {p2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v0, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/a;->x:Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$c;

    iget-object v0, v0, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$c;->a:Ljava/lang/String;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    :cond_3
    const-string v0, " ORDER BY 1 ASC"

    .line 14
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " limit 1"

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    .line 16
    invoke-virtual {p1, p2}, Landroid/database/sqlite/SQLiteDatabase;->compileStatement(Ljava/lang/String;)Landroid/database/sqlite/SQLiteStatement;

    move-result-object p1

    iput-object p1, p0, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/c;->g:Landroid/database/sqlite/SQLiteStatement;

    goto :goto_0

    .line 17
    :cond_4
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteStatement;->clearBindings()V

    :goto_0
    const/4 p1, 0x1

    const/4 p2, 0x1

    .line 18
    :goto_1
    iget-object v0, p0, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/c;->c:[Ljava/lang/String;

    array-length v4, v0

    if-gt p2, v4, :cond_5

    .line 19
    iget-object v4, p0, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/c;->g:Landroid/database/sqlite/SQLiteStatement;

    add-int/lit8 v5, p2, -0x1

    aget-object v0, v0, v5

    invoke-virtual {v4, p2, v0}, Landroid/database/sqlite/SQLiteStatement;->bindString(ILjava/lang/String;)V

    add-int/lit8 p2, p2, 0x1

    goto :goto_1

    .line 20
    :cond_5
    iget p2, p0, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/c;->i:I

    if-eq p2, v3, :cond_6

    .line 21
    iget-object v0, p0, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/c;->g:Landroid/database/sqlite/SQLiteStatement;

    add-int/2addr p2, p1

    invoke-static {v1, v2}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, p2, v4}, Landroid/database/sqlite/SQLiteStatement;->bindString(ILjava/lang/String;)V

    .line 22
    :cond_6
    iget p2, p0, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/c;->j:I

    if-eq p2, v3, :cond_7

    .line 23
    iget-object v0, p0, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/c;->g:Landroid/database/sqlite/SQLiteStatement;

    add-int/2addr p2, p1

    invoke-static {v1, v2}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p2, p1}, Landroid/database/sqlite/SQLiteStatement;->bindString(ILjava/lang/String;)V

    .line 24
    :cond_7
    iget-object p1, p0, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/c;->g:Landroid/database/sqlite/SQLiteStatement;

    return-object p1
.end method

.method public g(I)V
    .locals 0

    iput p1, p0, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/c;->i:I

    return-void
.end method

.method public h(I)V
    .locals 0

    iput p1, p0, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/c;->j:I

    return-void
.end method
