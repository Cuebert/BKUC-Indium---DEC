.class public Lcom/birbit/android/jobqueue/persistentQueue/sqlite/SqliteJobQueue;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/birbit/android/jobqueue/JobQueue;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/birbit/android/jobqueue/persistentQueue/sqlite/SqliteJobQueue$JobSerializer;,
        Lcom/birbit/android/jobqueue/persistentQueue/sqlite/SqliteJobQueue$c;,
        Lcom/birbit/android/jobqueue/persistentQueue/sqlite/SqliteJobQueue$b;
    }
.end annotation


# instance fields
.field a:Lcom/birbit/android/jobqueue/persistentQueue/sqlite/a;

.field private final b:J

.field c:Landroid/database/sqlite/SQLiteDatabase;

.field d:Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b;

.field e:Lcom/birbit/android/jobqueue/persistentQueue/sqlite/SqliteJobQueue$JobSerializer;

.field f:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final g:Ljava/lang/StringBuilder;

.field private final h:Lcom/birbit/android/jobqueue/persistentQueue/sqlite/d;


# direct methods
.method public constructor <init>(Lq1/a;JLcom/birbit/android/jobqueue/persistentQueue/sqlite/SqliteJobQueue$JobSerializer;)V
    .locals 10

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/SqliteJobQueue;->f:Ljava/util/Set;

    .line 3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iput-object v0, p0, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/SqliteJobQueue;->g:Ljava/lang/StringBuilder;

    .line 4
    iput-wide p2, p0, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/SqliteJobQueue;->b:J

    .line 5
    new-instance v0, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/d;

    invoke-direct {v0, p2, p3}, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/d;-><init>(J)V

    iput-object v0, p0, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/SqliteJobQueue;->h:Lcom/birbit/android/jobqueue/persistentQueue/sqlite/d;

    .line 6
    new-instance v0, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/a;

    invoke-virtual {p1}, Lq1/a;->b()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {p1}, Lq1/a;->o()Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x0

    goto :goto_0

    :cond_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "db_"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lq1/a;->f()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    :goto_0
    invoke-direct {v0, v1, v2}, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/a;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/SqliteJobQueue;->a:Lcom/birbit/android/jobqueue/persistentQueue/sqlite/a;

    .line 7
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteOpenHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v1

    iput-object v1, p0, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/SqliteJobQueue;->c:Landroid/database/sqlite/SQLiteDatabase;

    .line 8
    new-instance v9, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b;

    sget-object v0, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/a;->o:Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$c;

    iget-object v3, v0, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$c;->a:Ljava/lang/String;

    const/16 v4, 0xb

    const/4 v6, 0x3

    const-string v2, "job_holder"

    const-string v5, "job_holder_tags"

    move-object v0, v9

    move-wide v7, p2

    invoke-direct/range {v0 .. v8}, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b;-><init>(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;IJ)V

    iput-object v9, p0, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/SqliteJobQueue;->d:Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b;

    .line 9
    iput-object p4, p0, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/SqliteJobQueue;->e:Lcom/birbit/android/jobqueue/persistentQueue/sqlite/SqliteJobQueue$JobSerializer;

    .line 10
    invoke-virtual {p1}, Lq1/a;->p()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 11
    iget-object v0, p0, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/SqliteJobQueue;->d:Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b;

    const-wide/high16 v1, -0x8000000000000000L

    invoke-virtual {v0, v1, v2}, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b;->l(J)V

    :cond_1
    return-void
.end method

.method private a(Landroid/database/sqlite/SQLiteStatement;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    sget-object v0, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/a;->z:Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$c;

    iget v0, v0, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$c;->c:I

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {p1, v0, p2}, Landroid/database/sqlite/SQLiteStatement;->bindString(ILjava/lang/String;)V

    .line 2
    sget-object p2, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/a;->A:Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$c;

    iget p2, p2, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$c;->c:I

    add-int/lit8 p2, p2, 0x1

    invoke-virtual {p1, p2, p3}, Landroid/database/sqlite/SQLiteStatement;->bindString(ILjava/lang/String;)V

    return-void
.end method

.method private b(Landroid/database/sqlite/SQLiteStatement;Lcom/birbit/android/jobqueue/f;)V
    .locals 3

    .line 1
    invoke-virtual {p2}, Lcom/birbit/android/jobqueue/f;->e()Ljava/lang/Long;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    sget-object v0, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/a;->n:Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$c;

    iget v0, v0, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$c;->c:I

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {p2}, Lcom/birbit/android/jobqueue/f;->e()Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-virtual {p1, v0, v1, v2}, Landroid/database/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 3
    :cond_0
    sget-object v0, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/a;->o:Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$c;

    iget v0, v0, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$c;->c:I

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {p2}, Lcom/birbit/android/jobqueue/f;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/database/sqlite/SQLiteStatement;->bindString(ILjava/lang/String;)V

    .line 4
    sget-object v0, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/a;->p:Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$c;

    iget v0, v0, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$c;->c:I

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {p2}, Lcom/birbit/android/jobqueue/f;->g()I

    move-result v1

    int-to-long v1, v1

    invoke-virtual {p1, v0, v1, v2}, Landroid/database/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 5
    invoke-virtual {p2}, Lcom/birbit/android/jobqueue/f;->c()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 6
    sget-object v0, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/a;->q:Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$c;

    iget v0, v0, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$c;->c:I

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {p2}, Lcom/birbit/android/jobqueue/f;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/database/sqlite/SQLiteStatement;->bindString(ILjava/lang/String;)V

    .line 7
    :cond_1
    sget-object v0, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/a;->r:Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$c;

    iget v0, v0, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$c;->c:I

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {p2}, Lcom/birbit/android/jobqueue/f;->k()I

    move-result v1

    int-to-long v1, v1

    invoke-virtual {p1, v0, v1, v2}, Landroid/database/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 8
    invoke-direct {p0, p2}, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/SqliteJobQueue;->f(Lcom/birbit/android/jobqueue/f;)[B

    move-result-object v0

    if-eqz v0, :cond_2

    .line 9
    sget-object v1, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/a;->s:Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$c;

    iget v1, v1, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$c;->c:I

    add-int/lit8 v1, v1, 0x1

    invoke-virtual {p1, v1, v0}, Landroid/database/sqlite/SQLiteStatement;->bindBlob(I[B)V

    .line 10
    :cond_2
    sget-object v0, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/a;->t:Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$c;

    iget v0, v0, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$c;->c:I

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {p2}, Lcom/birbit/android/jobqueue/f;->a()J

    move-result-wide v1

    invoke-virtual {p1, v0, v1, v2}, Landroid/database/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 11
    sget-object v0, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/a;->u:Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$c;

    iget v0, v0, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$c;->c:I

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {p2}, Lcom/birbit/android/jobqueue/f;->b()J

    move-result-wide v1

    invoke-virtual {p1, v0, v1, v2}, Landroid/database/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 12
    sget-object v0, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/a;->v:Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$c;

    iget v0, v0, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$c;->c:I

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {p2}, Lcom/birbit/android/jobqueue/f;->l()J

    move-result-wide v1

    invoke-virtual {p1, v0, v1, v2}, Landroid/database/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 13
    sget-object v0, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/a;->w:Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$c;

    iget v0, v0, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$c;->c:I

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {p2}, Lcom/birbit/android/jobqueue/f;->h()J

    move-result-wide v1

    invoke-virtual {p1, v0, v1, v2}, Landroid/database/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 14
    sget-object v0, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/a;->x:Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$c;

    iget v0, v0, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$c;->c:I

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {p2}, Lcom/birbit/android/jobqueue/f;->i()J

    move-result-wide v1

    invoke-virtual {p1, v0, v1, v2}, Landroid/database/sqlite/SQLiteStatement;->bindLong(IJ)V

    return-void
.end method

.method private c(Landroid/database/Cursor;)Lcom/birbit/android/jobqueue/f;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/birbit/android/jobqueue/persistentQueue/sqlite/SqliteJobQueue$b;
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/a;->s:Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$c;

    iget v0, v0, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$c;->c:I

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getBlob(I)[B

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/SqliteJobQueue;->h([B)Lcom/birbit/android/jobqueue/e;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    new-instance v1, Lcom/birbit/android/jobqueue/f$b;

    invoke-direct {v1}, Lcom/birbit/android/jobqueue/f$b;-><init>()V

    sget-object v2, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/a;->n:Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$c;

    iget v2, v2, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$c;->c:I

    invoke-interface {p1, v2}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Lcom/birbit/android/jobqueue/f$b;->e(J)Lcom/birbit/android/jobqueue/f$b;

    move-result-object v1

    sget-object v2, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/a;->p:Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$c;

    iget v2, v2, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$c;->c:I

    invoke-interface {p1, v2}, Landroid/database/Cursor;->getInt(I)I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/birbit/android/jobqueue/f$b;->g(I)Lcom/birbit/android/jobqueue/f$b;

    move-result-object v1

    sget-object v2, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/a;->q:Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$c;

    iget v2, v2, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$c;->c:I

    invoke-interface {p1, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/birbit/android/jobqueue/f$b;->d(Ljava/lang/String;)Lcom/birbit/android/jobqueue/f$b;

    move-result-object v1

    sget-object v2, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/a;->r:Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$c;

    iget v2, v2, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$c;->c:I

    invoke-interface {p1, v2}, Landroid/database/Cursor;->getInt(I)I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/birbit/android/jobqueue/f$b;->h(I)Lcom/birbit/android/jobqueue/f$b;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/birbit/android/jobqueue/f$b;->f(Lcom/birbit/android/jobqueue/e;)Lcom/birbit/android/jobqueue/f$b;

    move-result-object v0

    sget-object v1, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/a;->t:Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$c;

    iget v1, v1, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$c;->c:I

    invoke-interface {p1, v1}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/birbit/android/jobqueue/f$b;->b(J)Lcom/birbit/android/jobqueue/f$b;

    move-result-object v0

    sget-object v1, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/a;->u:Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$c;

    iget v1, v1, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$c;->c:I

    invoke-interface {p1, v1}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/birbit/android/jobqueue/f$b;->c(J)Lcom/birbit/android/jobqueue/f$b;

    move-result-object v0

    sget-object v1, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/a;->v:Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$c;

    iget v1, v1, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$c;->c:I

    invoke-interface {p1, v1}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/birbit/android/jobqueue/f$b;->i(J)Lcom/birbit/android/jobqueue/f$b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/birbit/android/jobqueue/f$b;->a()Lcom/birbit/android/jobqueue/f;

    move-result-object p1

    return-object p1

    .line 3
    :cond_0
    new-instance p1, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/SqliteJobQueue$b;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/SqliteJobQueue$b;-><init>(Lcom/birbit/android/jobqueue/persistentQueue/sqlite/SqliteJobQueue$a;)V

    throw p1
.end method

.method private d(Lcom/birbit/android/jobqueue/c;)Lcom/birbit/android/jobqueue/persistentQueue/sqlite/c;
    .locals 3

    iget-object v0, p0, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/SqliteJobQueue;->h:Lcom/birbit/android/jobqueue/persistentQueue/sqlite/d;

    iget-object v1, p0, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/SqliteJobQueue;->f:Ljava/util/Set;

    iget-object v2, p0, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/SqliteJobQueue;->g:Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1, v1, v2}, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/d;->a(Lcom/birbit/android/jobqueue/c;Ljava/util/Collection;Ljava/lang/StringBuilder;)Lcom/birbit/android/jobqueue/persistentQueue/sqlite/c;

    move-result-object p1

    return-object p1
.end method

.method private e(Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/SqliteJobQueue;->f:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 2
    iget-object v0, p0, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/SqliteJobQueue;->d:Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b;

    invoke-virtual {v0}, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b;->g()Landroid/database/sqlite/SQLiteStatement;

    move-result-object v0

    .line 3
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteStatement;->clearBindings()V

    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, v1, p1}, Landroid/database/sqlite/SQLiteStatement;->bindString(ILjava/lang/String;)V

    .line 5
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteStatement;->execute()V

    return-void
.end method

.method private f(Lcom/birbit/android/jobqueue/f;)[B
    .locals 0

    invoke-virtual {p1}, Lcom/birbit/android/jobqueue/f;->f()Lcom/birbit/android/jobqueue/e;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/SqliteJobQueue;->i(Ljava/lang/Object;)[B

    move-result-object p1

    return-object p1
.end method

.method private g(Lcom/birbit/android/jobqueue/f;)Z
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/SqliteJobQueue;->d:Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b;

    invoke-virtual {v0}, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b;->i()Landroid/database/sqlite/SQLiteStatement;

    move-result-object v0

    .line 2
    iget-object v1, p0, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/SqliteJobQueue;->d:Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b;

    invoke-virtual {v1}, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b;->j()Landroid/database/sqlite/SQLiteStatement;

    move-result-object v1

    .line 3
    iget-object v2, p0, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/SqliteJobQueue;->c:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v2}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V

    const/4 v2, 0x0

    .line 4
    :try_start_0
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteStatement;->clearBindings()V

    .line 5
    invoke-direct {p0, v0, p1}, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/SqliteJobQueue;->b(Landroid/database/sqlite/SQLiteStatement;Lcom/birbit/android/jobqueue/f;)V

    .line 6
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteStatement;->executeInsert()J

    move-result-wide v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-wide/16 v5, -0x1

    const/4 v0, 0x1

    cmp-long v7, v3, v5

    if-eqz v7, :cond_0

    const/4 v3, 0x1

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    if-nez v3, :cond_1

    .line 7
    :goto_1
    iget-object p1, p0, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/SqliteJobQueue;->c:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {p1}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    return v2

    .line 8
    :cond_1
    :try_start_1
    invoke-virtual {p1}, Lcom/birbit/android/jobqueue/f;->m()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    .line 9
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteStatement;->clearBindings()V

    .line 10
    invoke-virtual {p1}, Lcom/birbit/android/jobqueue/f;->d()Ljava/lang/String;

    move-result-object v5

    invoke-direct {p0, v1, v5, v4}, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/SqliteJobQueue;->a(Landroid/database/sqlite/SQLiteStatement;Ljava/lang/String;Ljava/lang/String;)V

    .line 11
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteStatement;->executeInsert()J

    goto :goto_2

    .line 12
    :cond_2
    iget-object p1, p0, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/SqliteJobQueue;->c:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {p1}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 13
    iget-object p1, p0, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/SqliteJobQueue;->c:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {p1}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    return v0

    :catchall_0
    move-exception p1

    :try_start_2
    const-string v0, "error while inserting job with tags"

    new-array v1, v2, [Ljava/lang/Object;

    .line 14
    invoke-static {p1, v0, v1}, Ls1/a;->d(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception p1

    .line 15
    iget-object v0, p0, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/SqliteJobQueue;->c:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    throw p1
.end method

.method private h([B)Lcom/birbit/android/jobqueue/e;
    .locals 2

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/SqliteJobQueue;->e:Lcom/birbit/android/jobqueue/persistentQueue/sqlite/SqliteJobQueue$JobSerializer;

    invoke-interface {v0, p1}, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/SqliteJobQueue$JobSerializer;->deserialize([B)Lcom/birbit/android/jobqueue/e;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p1

    :catchall_0
    move-exception p1

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "error while deserializing job"

    .line 2
    invoke-static {p1, v1, v0}, Ls1/a;->d(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method private i(Ljava/lang/Object;)[B
    .locals 3

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/SqliteJobQueue;->e:Lcom/birbit/android/jobqueue/persistentQueue/sqlite/SqliteJobQueue$JobSerializer;

    invoke-interface {v0, p1}, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/SqliteJobQueue$JobSerializer;->serialize(Ljava/lang/Object;)[B

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p1

    :catchall_0
    move-exception v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    .line 2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p1

    aput-object p1, v1, v2

    const-string p1, "error while serializing object %s"

    invoke-static {v0, p1, v1}, Ls1/a;->d(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method private j(Lcom/birbit/android/jobqueue/f;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/SqliteJobQueue;->d:Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b;

    invoke-virtual {v0}, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b;->k()Landroid/database/sqlite/SQLiteStatement;

    move-result-object v0

    .line 2
    invoke-virtual {p1}, Lcom/birbit/android/jobqueue/f;->k()I

    move-result v1

    const/4 v2, 0x1

    add-int/2addr v1, v2

    invoke-virtual {p1, v1}, Lcom/birbit/android/jobqueue/f;->B(I)V

    .line 3
    iget-wide v3, p0, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/SqliteJobQueue;->b:J

    invoke-virtual {p1, v3, v4}, Lcom/birbit/android/jobqueue/f;->C(J)V

    .line 4
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteStatement;->clearBindings()V

    .line 5
    invoke-virtual {p1}, Lcom/birbit/android/jobqueue/f;->k()I

    move-result v1

    int-to-long v3, v1

    invoke-virtual {v0, v2, v3, v4}, Landroid/database/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 6
    iget-wide v1, p0, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/SqliteJobQueue;->b:J

    const/4 v3, 0x2

    invoke-virtual {v0, v3, v1, v2}, Landroid/database/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 7
    invoke-virtual {p1}, Lcom/birbit/android/jobqueue/f;->d()Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x3

    invoke-virtual {v0, v1, p1}, Landroid/database/sqlite/SQLiteStatement;->bindString(ILjava/lang/String;)V

    .line 8
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteStatement;->execute()V

    return-void
.end method


# virtual methods
.method public clear()V
    .locals 1

    iget-object v0, p0, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/SqliteJobQueue;->d:Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b;

    invoke-virtual {v0}, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b;->m()V

    return-void
.end method

.method public count()I
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/SqliteJobQueue;->d:Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b;

    invoke-virtual {v0}, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b;->f()Landroid/database/sqlite/SQLiteStatement;

    move-result-object v0

    .line 2
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteStatement;->clearBindings()V

    .line 3
    iget-wide v1, p0, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/SqliteJobQueue;->b:J

    const/4 v3, 0x1

    invoke-virtual {v0, v3, v1, v2}, Landroid/database/sqlite/SQLiteStatement;->bindLong(IJ)V

    .line 4
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteStatement;->simpleQueryForLong()J

    move-result-wide v0

    long-to-int v1, v0

    return v1
.end method

.method public countReadyJobs(Lcom/birbit/android/jobqueue/c;)I
    .locals 2

    .line 1
    invoke-direct {p0, p1}, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/SqliteJobQueue;->d(Lcom/birbit/android/jobqueue/c;)Lcom/birbit/android/jobqueue/persistentQueue/sqlite/c;

    move-result-object p1

    .line 2
    iget-object v0, p0, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/SqliteJobQueue;->c:Landroid/database/sqlite/SQLiteDatabase;

    iget-object v1, p0, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/SqliteJobQueue;->g:Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0, v1}, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/c;->a(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/StringBuilder;)Landroid/database/sqlite/SQLiteStatement;

    move-result-object p1

    invoke-virtual {p1}, Landroid/database/sqlite/SQLiteStatement;->simpleQueryForLong()J

    move-result-wide v0

    long-to-int p1, v0

    return p1
.end method

.method public findJobById(Ljava/lang/String;)Lcom/birbit/android/jobqueue/f;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/SqliteJobQueue;->c:Landroid/database/sqlite/SQLiteDatabase;

    iget-object v1, p0, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/SqliteJobQueue;->d:Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b;

    iget-object v1, v1, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b;->a:Ljava/lang/String;

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/String;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    invoke-virtual {v0, v1, v2}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object p1

    const/4 v0, 0x0

    .line 2
    :try_start_0
    invoke-interface {p1}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v1
    :try_end_0
    .catch Lcom/birbit/android/jobqueue/persistentQueue/sqlite/SqliteJobQueue$b; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v1, :cond_0

    .line 3
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    return-object v0

    .line 4
    :cond_0
    :try_start_1
    invoke-direct {p0, p1}, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/SqliteJobQueue;->c(Landroid/database/Cursor;)Lcom/birbit/android/jobqueue/f;

    move-result-object v0
    :try_end_1
    .catch Lcom/birbit/android/jobqueue/persistentQueue/sqlite/SqliteJobQueue$b; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 5
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    return-object v0

    :catchall_0
    move-exception v0

    goto :goto_0

    :catch_0
    move-exception v1

    :try_start_2
    const-string v2, "invalid job on findJobById"

    new-array v3, v3, [Ljava/lang/Object;

    .line 6
    invoke-static {v1, v2, v3}, Ls1/a;->d(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 7
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    return-object v0

    :goto_0
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    throw v0
.end method

.method public findJobs(Lcom/birbit/android/jobqueue/c;)Ljava/util/Set;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/birbit/android/jobqueue/c;",
            ")",
            "Ljava/util/Set<",
            "Lcom/birbit/android/jobqueue/f;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1}, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/SqliteJobQueue;->d(Lcom/birbit/android/jobqueue/c;)Lcom/birbit/android/jobqueue/persistentQueue/sqlite/c;

    move-result-object p1

    .line 2
    iget-object v0, p0, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/SqliteJobQueue;->d:Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b;

    invoke-virtual {p1, v0}, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/c;->c(Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b;)Ljava/lang/String;

    move-result-object v0

    .line 3
    iget-object v1, p0, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/SqliteJobQueue;->c:Landroid/database/sqlite/SQLiteDatabase;

    iget-object p1, p1, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/c;->c:[Ljava/lang/String;

    invoke-virtual {v1, v0, p1}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object p1

    .line 4
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 5
    :goto_0
    :try_start_0
    invoke-interface {p1}, Landroid/database/Cursor;->moveToNext()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 6
    invoke-direct {p0, p1}, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/SqliteJobQueue;->c(Landroid/database/Cursor;)Lcom/birbit/android/jobqueue/f;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Lcom/birbit/android/jobqueue/persistentQueue/sqlite/SqliteJobQueue$b; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 7
    :cond_0
    :goto_1
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    goto :goto_2

    :catchall_0
    move-exception v0

    goto :goto_3

    :catch_0
    move-exception v1

    :try_start_1
    const-string v2, "invalid job found by tags."

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    .line 8
    invoke-static {v1, v2, v3}, Ls1/a;->d(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :goto_2
    return-object v0

    .line 9
    :goto_3
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    throw v0
.end method

.method public getNextJobDelayUntilNs(Lcom/birbit/android/jobqueue/c;)Ljava/lang/Long;
    .locals 2

    .line 1
    invoke-direct {p0, p1}, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/SqliteJobQueue;->d(Lcom/birbit/android/jobqueue/c;)Lcom/birbit/android/jobqueue/persistentQueue/sqlite/c;

    move-result-object v0

    .line 2
    :try_start_0
    invoke-virtual {p1}, Lcom/birbit/android/jobqueue/c;->s()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {p1}, Lcom/birbit/android/jobqueue/c;->t()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    iget-object p1, p0, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/SqliteJobQueue;->c:Landroid/database/sqlite/SQLiteDatabase;

    iget-object v1, p0, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/SqliteJobQueue;->d:Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b;

    invoke-virtual {v0, p1, v1}, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/c;->e(Landroid/database/sqlite/SQLiteDatabase;Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b;)Landroid/database/sqlite/SQLiteStatement;

    move-result-object p1

    invoke-virtual {p1}, Landroid/database/sqlite/SQLiteStatement;->simpleQueryForLong()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    return-object p1

    .line 4
    :cond_1
    :goto_0
    iget-object p1, p0, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/SqliteJobQueue;->c:Landroid/database/sqlite/SQLiteDatabase;

    iget-object v1, p0, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/SqliteJobQueue;->d:Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b;

    invoke-virtual {v0, p1, v1}, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/c;->f(Landroid/database/sqlite/SQLiteDatabase;Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b;)Landroid/database/sqlite/SQLiteStatement;

    move-result-object p1

    invoke-virtual {p1}, Landroid/database/sqlite/SQLiteStatement;->simpleQueryForLong()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteDoneException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public insert(Lcom/birbit/android/jobqueue/f;)Z
    .locals 4

    .line 1
    invoke-virtual {p1}, Lcom/birbit/android/jobqueue/f;->n()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    invoke-direct {p0, p1}, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/SqliteJobQueue;->g(Lcom/birbit/android/jobqueue/f;)Z

    move-result p1

    return p1

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/SqliteJobQueue;->d:Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b;

    invoke-virtual {v0}, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b;->i()Landroid/database/sqlite/SQLiteStatement;

    move-result-object v0

    .line 4
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteStatement;->clearBindings()V

    .line 5
    invoke-direct {p0, v0, p1}, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/SqliteJobQueue;->b(Landroid/database/sqlite/SQLiteStatement;Lcom/birbit/android/jobqueue/f;)V

    .line 6
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteStatement;->executeInsert()J

    move-result-wide v0

    .line 7
    invoke-virtual {p1, v0, v1}, Lcom/birbit/android/jobqueue/f;->z(J)V

    const-wide/16 v2, -0x1

    cmp-long p1, v0, v2

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public insertOrReplace(Lcom/birbit/android/jobqueue/f;)Z
    .locals 4

    .line 1
    invoke-virtual {p1}, Lcom/birbit/android/jobqueue/f;->e()Ljava/lang/Long;

    move-result-object v0

    if-nez v0, :cond_0

    .line 2
    invoke-virtual {p0, p1}, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/SqliteJobQueue;->insert(Lcom/birbit/android/jobqueue/f;)Z

    move-result p1

    return p1

    :cond_0
    const-wide/high16 v0, -0x8000000000000000L

    .line 3
    invoke-virtual {p1, v0, v1}, Lcom/birbit/android/jobqueue/f;->C(J)V

    .line 4
    iget-object v0, p0, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/SqliteJobQueue;->d:Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b;

    invoke-virtual {v0}, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b;->h()Landroid/database/sqlite/SQLiteStatement;

    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteStatement;->clearBindings()V

    .line 6
    invoke-direct {p0, v0, p1}, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/SqliteJobQueue;->b(Landroid/database/sqlite/SQLiteStatement;Lcom/birbit/android/jobqueue/f;)V

    .line 7
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteStatement;->executeInsert()J

    move-result-wide v0

    const-wide/16 v2, -0x1

    cmp-long p1, v0, v2

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public nextJobAndIncRunCount(Lcom/birbit/android/jobqueue/c;)Lcom/birbit/android/jobqueue/f;
    .locals 4

    .line 1
    invoke-direct {p0, p1}, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/SqliteJobQueue;->d(Lcom/birbit/android/jobqueue/c;)Lcom/birbit/android/jobqueue/persistentQueue/sqlite/c;

    move-result-object p1

    .line 2
    iget-object v0, p0, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/SqliteJobQueue;->d:Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b;

    invoke-virtual {p1, v0}, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/c;->d(Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b;)Ljava/lang/String;

    move-result-object v0

    .line 3
    :goto_0
    iget-object v1, p0, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/SqliteJobQueue;->c:Landroid/database/sqlite/SQLiteDatabase;

    iget-object v2, p1, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/c;->c:[Ljava/lang/String;

    invoke-virtual {v1, v0, v2}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v1

    .line 4
    :try_start_0
    invoke-interface {v1}, Landroid/database/Cursor;->moveToNext()Z

    move-result v2
    :try_end_0
    .catch Lcom/birbit/android/jobqueue/persistentQueue/sqlite/SqliteJobQueue$b; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v2, :cond_0

    const/4 p1, 0x0

    .line 5
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    return-object p1

    .line 6
    :cond_0
    :try_start_1
    invoke-direct {p0, v1}, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/SqliteJobQueue;->c(Landroid/database/Cursor;)Lcom/birbit/android/jobqueue/f;

    move-result-object v2

    .line 7
    invoke-direct {p0, v2}, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/SqliteJobQueue;->j(Lcom/birbit/android/jobqueue/f;)V
    :try_end_1
    .catch Lcom/birbit/android/jobqueue/persistentQueue/sqlite/SqliteJobQueue$b; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 8
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    return-object v2

    :catchall_0
    move-exception p1

    goto :goto_2

    .line 9
    :catch_0
    :try_start_2
    sget-object v2, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/a;->o:Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$c;

    iget v2, v2, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$c;->c:I

    invoke-interface {v1, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_1

    const-string v2, "cannot find job id on a retriewed job"

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    .line 10
    invoke-static {v2, v3}, Ls1/a;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_1

    .line 11
    :cond_1
    invoke-direct {p0, v2}, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/SqliteJobQueue;->e(Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 12
    :goto_1
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    goto :goto_0

    :goto_2
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    throw p1
.end method

.method public onJobCancelled(Lcom/birbit/android/jobqueue/f;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/SqliteJobQueue;->f:Ljava/util/Set;

    invoke-virtual {p1}, Lcom/birbit/android/jobqueue/f;->d()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 2
    invoke-direct {p0, p1}, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/SqliteJobQueue;->j(Lcom/birbit/android/jobqueue/f;)V

    return-void
.end method

.method public remove(Lcom/birbit/android/jobqueue/f;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Lcom/birbit/android/jobqueue/f;->d()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    new-array p1, p1, [Ljava/lang/Object;

    const-string v0, "called remove with null job id."

    .line 2
    invoke-static {v0, p1}, Ls1/a;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    .line 3
    :cond_0
    invoke-virtual {p1}, Lcom/birbit/android/jobqueue/f;->d()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/SqliteJobQueue;->e(Ljava/lang/String;)V

    return-void
.end method

.method public substitute(Lcom/birbit/android/jobqueue/f;Lcom/birbit/android/jobqueue/f;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/SqliteJobQueue;->c:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V

    .line 2
    :try_start_0
    invoke-virtual {p0, p2}, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/SqliteJobQueue;->remove(Lcom/birbit/android/jobqueue/f;)V

    .line 3
    invoke-virtual {p0, p1}, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/SqliteJobQueue;->insert(Lcom/birbit/android/jobqueue/f;)Z

    .line 4
    iget-object p1, p0, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/SqliteJobQueue;->c:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {p1}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    iget-object p1, p0, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/SqliteJobQueue;->c:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {p1}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    return-void

    :catchall_0
    move-exception p1

    iget-object p2, p0, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/SqliteJobQueue;->c:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {p2}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    throw p1
.end method
