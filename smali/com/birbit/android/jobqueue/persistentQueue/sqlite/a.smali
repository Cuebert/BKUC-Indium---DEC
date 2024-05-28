.class public Lcom/birbit/android/jobqueue/persistentQueue/sqlite/a;
.super Landroid/database/sqlite/SQLiteOpenHelper;
.source "SourceFile"


# static fields
.field static final A:Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$c;

.field static final n:Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$c;

.field static final o:Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$c;

.field static final p:Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$c;

.field static final q:Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$c;

.field static final r:Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$c;

.field static final s:Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$c;

.field static final t:Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$c;

.field static final u:Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$c;

.field static final v:Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$c;

.field static final w:Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$c;

.field static final x:Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$c;

.field static final y:Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$c;

.field static final z:Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$c;


# direct methods
.method static constructor <clinit>()V
    .locals 10

    .line 1
    new-instance v0, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$c;

    const-string v1, "insertionOrder"

    const-string v2, "integer"

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$c;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    sput-object v0, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/a;->n:Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$c;

    .line 2
    new-instance v0, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$c;

    const-string v5, "_id"

    const-string v6, "text"

    const/4 v7, 0x1

    const/4 v8, 0x0

    const/4 v9, 0x1

    move-object v4, v0

    invoke-direct/range {v4 .. v9}, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$c;-><init>(Ljava/lang/String;Ljava/lang/String;ILcom/birbit/android/jobqueue/persistentQueue/sqlite/b$a;Z)V

    sput-object v0, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/a;->o:Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$c;

    .line 3
    new-instance v1, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$c;

    const-string v4, "priority"

    const/4 v5, 0x2

    invoke-direct {v1, v4, v2, v5}, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$c;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    sput-object v1, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/a;->p:Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$c;

    .line 4
    new-instance v1, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$c;

    const-string v4, "group_id"

    const-string v6, "text"

    const/4 v7, 0x3

    invoke-direct {v1, v4, v6, v7}, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$c;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    sput-object v1, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/a;->q:Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$c;

    .line 5
    new-instance v1, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$c;

    const-string v4, "run_count"

    const/4 v7, 0x4

    invoke-direct {v1, v4, v2, v7}, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$c;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    sput-object v1, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/a;->r:Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$c;

    .line 6
    new-instance v1, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$c;

    const-string v4, "base_job"

    const-string v7, "byte"

    const/4 v8, 0x5

    invoke-direct {v1, v4, v7, v8}, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$c;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    sput-object v1, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/a;->s:Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$c;

    .line 7
    new-instance v1, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$c;

    const-string v4, "created_ns"

    const-string v7, "long"

    const/4 v8, 0x6

    invoke-direct {v1, v4, v7, v8}, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$c;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    sput-object v1, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/a;->t:Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$c;

    .line 8
    new-instance v1, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$c;

    const-string v4, "delay_until_ns"

    const/4 v8, 0x7

    invoke-direct {v1, v4, v7, v8}, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$c;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    sput-object v1, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/a;->u:Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$c;

    .line 9
    new-instance v1, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$c;

    const-string v4, "running_session_id"

    const/16 v8, 0x8

    invoke-direct {v1, v4, v7, v8}, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$c;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    sput-object v1, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/a;->v:Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$c;

    .line 10
    new-instance v1, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$c;

    const-string v4, "requires_network_until"

    const/16 v7, 0x9

    invoke-direct {v1, v4, v2, v7}, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$c;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    sput-object v1, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/a;->w:Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$c;

    .line 11
    new-instance v1, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$c;

    const-string v4, "requires_unmetered_network_until"

    const/16 v7, 0xa

    invoke-direct {v1, v4, v2, v7}, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$c;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    sput-object v1, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/a;->x:Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$c;

    .line 12
    new-instance v1, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$c;

    const-string v4, "_id"

    invoke-direct {v1, v4, v2, v3}, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$c;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    sput-object v1, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/a;->y:Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$c;

    .line 13
    new-instance v1, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$c;

    new-instance v2, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$a;

    iget-object v0, v0, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$c;->a:Ljava/lang/String;

    const-string v3, "job_holder"

    invoke-direct {v2, v3, v0}, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "job_id"

    const/4 v3, 0x1

    invoke-direct {v1, v0, v6, v3, v2}, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$c;-><init>(Ljava/lang/String;Ljava/lang/String;ILcom/birbit/android/jobqueue/persistentQueue/sqlite/b$a;)V

    sput-object v1, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/a;->z:Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$c;

    .line 14
    new-instance v0, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$c;

    const-string v1, "tag_name"

    invoke-direct {v0, v1, v6, v5}, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$c;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    sput-object v0, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/a;->A:Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$c;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 2

    const/4 v0, 0x0

    const/16 v1, 0x8

    invoke-direct {p0, p1, p2, v0, v1}, Landroid/database/sqlite/SQLiteOpenHelper;-><init>(Landroid/content/Context;Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase$CursorFactory;I)V

    return-void
.end method


# virtual methods
.method public onCreate(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 7

    .line 1
    sget-object v0, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/a;->n:Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$c;

    const/16 v1, 0xa

    new-array v1, v1, [Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$c;

    sget-object v2, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/a;->o:Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$c;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    sget-object v2, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/a;->p:Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$c;

    const/4 v4, 0x1

    aput-object v2, v1, v4

    sget-object v2, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/a;->q:Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$c;

    const/4 v5, 0x2

    aput-object v2, v1, v5

    sget-object v2, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/a;->r:Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$c;

    const/4 v6, 0x3

    aput-object v2, v1, v6

    sget-object v2, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/a;->s:Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$c;

    const/4 v6, 0x4

    aput-object v2, v1, v6

    sget-object v2, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/a;->t:Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$c;

    const/4 v6, 0x5

    aput-object v2, v1, v6

    sget-object v2, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/a;->u:Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$c;

    const/4 v6, 0x6

    aput-object v2, v1, v6

    sget-object v2, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/a;->v:Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$c;

    const/4 v6, 0x7

    aput-object v2, v1, v6

    sget-object v2, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/a;->w:Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$c;

    const/16 v6, 0x8

    aput-object v2, v1, v6

    sget-object v2, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/a;->x:Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$c;

    const/16 v6, 0x9

    aput-object v2, v1, v6

    const-string v2, "job_holder"

    invoke-static {v2, v0, v1}, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b;->b(Ljava/lang/String;Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$c;[Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$c;)Ljava/lang/String;

    move-result-object v0

    .line 2
    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 3
    sget-object v0, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/a;->y:Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$c;

    new-array v1, v5, [Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$c;

    sget-object v2, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/a;->z:Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$c;

    aput-object v2, v1, v3

    sget-object v2, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/a;->A:Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$c;

    aput-object v2, v1, v4

    const-string v3, "job_holder_tags"

    invoke-static {v3, v0, v1}, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b;->b(Ljava/lang/String;Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$c;[Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$c;)Ljava/lang/String;

    move-result-object v0

    .line 4
    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 5
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "CREATE INDEX IF NOT EXISTS TAG_NAME_INDEX ON job_holder_tags("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, v2, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$c;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    return-void
.end method

.method public onDowngrade(Landroid/database/sqlite/SQLiteDatabase;II)V
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/a;->onUpgrade(Landroid/database/sqlite/SQLiteDatabase;II)V

    return-void
.end method

.method public onUpgrade(Landroid/database/sqlite/SQLiteDatabase;II)V
    .locals 0

    const-string p2, "job_holder"

    .line 1
    invoke-static {p2}, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    const-string p2, "job_holder_tags"

    .line 2
    invoke-static {p2}, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    const-string p2, "DROP INDEX IF EXISTS TAG_NAME_INDEX"

    .line 3
    invoke-virtual {p1, p2}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 4
    invoke-virtual {p0, p1}, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/a;->onCreate(Landroid/database/sqlite/SQLiteDatabase;)V

    return-void
.end method
