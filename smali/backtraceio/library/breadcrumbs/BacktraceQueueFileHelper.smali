.class public Lbacktraceio/library/breadcrumbs/BacktraceQueueFileHelper;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final LOG_TAG:Ljava/lang/String;

.field private final breadcrumbLogDirectory:Ljava/lang/String;

.field private final breadcrumbStore:Lra/a;

.field private final maxQueueFileSizeBytes:I

.field private final minimumQueueFileSizeBytes:I

.field private final usedBytes:Ljava/lang/reflect/Method;


# direct methods
.method public constructor <init>(Ljava/lang/String;I)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Ljava/lang/NoSuchMethodException;
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    const-class v0, Lbacktraceio/library/breadcrumbs/BacktraceQueueFileHelper;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lbacktraceio/library/breadcrumbs/BacktraceQueueFileHelper;->LOG_TAG:Ljava/lang/String;

    const/16 v0, 0x1000

    .line 3
    iput v0, p0, Lbacktraceio/library/breadcrumbs/BacktraceQueueFileHelper;->minimumQueueFileSizeBytes:I

    .line 4
    iput-object p1, p0, Lbacktraceio/library/breadcrumbs/BacktraceQueueFileHelper;->breadcrumbLogDirectory:Ljava/lang/String;

    .line 5
    new-instance v1, Lra/a;

    new-instance v2, Ljava/io/File;

    invoke-direct {v2, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-direct {v1, v2}, Lra/a;-><init>(Ljava/io/File;)V

    iput-object v1, p0, Lbacktraceio/library/breadcrumbs/BacktraceQueueFileHelper;->breadcrumbStore:Lra/a;

    .line 6
    const-class p1, Lra/a;

    const-string v1, "v"

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Class;

    invoke-virtual {p1, v1, v2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object p1

    iput-object p1, p0, Lbacktraceio/library/breadcrumbs/BacktraceQueueFileHelper;->usedBytes:Ljava/lang/reflect/Method;

    const/4 v1, 0x1

    .line 7
    invoke-virtual {p1, v1}, Ljava/lang/reflect/Method;->setAccessible(Z)V

    if-ge p2, v0, :cond_0

    .line 8
    iput v0, p0, Lbacktraceio/library/breadcrumbs/BacktraceQueueFileHelper;->maxQueueFileSizeBytes:I

    goto :goto_0

    .line 9
    :cond_0
    iput p2, p0, Lbacktraceio/library/breadcrumbs/BacktraceQueueFileHelper;->maxQueueFileSizeBytes:I

    :goto_0
    return-void
.end method


# virtual methods
.method public add([B)Z
    .locals 5

    const/4 v0, 0x0

    .line 1
    :try_start_0
    iget-object v1, p0, Lbacktraceio/library/breadcrumbs/BacktraceQueueFileHelper;->usedBytes:Ljava/lang/reflect/Method;

    iget-object v2, p0, Lbacktraceio/library/breadcrumbs/BacktraceQueueFileHelper;->breadcrumbStore:Lra/a;

    new-array v3, v0, [Ljava/lang/Object;

    invoke-virtual {v1, v2, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    .line 2
    array-length v2, p1

    const/16 v3, 0x1000

    if-le v2, v3, :cond_0

    .line 3
    iget-object v1, p0, Lbacktraceio/library/breadcrumbs/BacktraceQueueFileHelper;->LOG_TAG:Ljava/lang/String;

    const-string v2, "We should not have a breadcrumb this big, this is a bug!"

    invoke-static {v1, v2}, Lbacktraceio/library/logger/BacktraceLogger;->e(Ljava/lang/String;Ljava/lang/String;)I

    return v0

    .line 4
    :cond_0
    :goto_0
    iget-object v3, p0, Lbacktraceio/library/breadcrumbs/BacktraceQueueFileHelper;->breadcrumbStore:Lra/a;

    invoke-virtual {v3}, Lra/a;->j()Z

    move-result v3

    if-nez v3, :cond_1

    add-int v3, v1, v2

    iget v4, p0, Lbacktraceio/library/breadcrumbs/BacktraceQueueFileHelper;->maxQueueFileSizeBytes:I

    if-le v3, v4, :cond_1

    .line 5
    iget-object v3, p0, Lbacktraceio/library/breadcrumbs/BacktraceQueueFileHelper;->breadcrumbStore:Lra/a;

    invoke-virtual {v3}, Lra/a;->q()V

    goto :goto_0

    .line 6
    :cond_1
    iget-object v1, p0, Lbacktraceio/library/breadcrumbs/BacktraceQueueFileHelper;->breadcrumbStore:Lra/a;

    invoke-virtual {v1, p1}, Lra/a;->d([B)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const/4 p1, 0x1

    return p1

    :catch_0
    move-exception v1

    .line 7
    iget-object v2, p0, Lbacktraceio/library/breadcrumbs/BacktraceQueueFileHelper;->LOG_TAG:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Exception: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\nWhen adding breadcrumb: "

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v1, Ljava/lang/String;

    sget-object v4, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-direct {v1, p1, v4}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v2, p1}, Lbacktraceio/library/logger/BacktraceLogger;->w(Ljava/lang/String;Ljava/lang/String;)I

    return v0
.end method

.method public clear()Z
    .locals 4

    .line 1
    :try_start_0
    iget-object v0, p0, Lbacktraceio/library/breadcrumbs/BacktraceQueueFileHelper;->breadcrumbStore:Lra/a;

    invoke-virtual {v0}, Lra/a;->f()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v0, 0x1

    return v0

    :catch_0
    move-exception v0

    .line 2
    iget-object v1, p0, Lbacktraceio/library/breadcrumbs/BacktraceQueueFileHelper;->LOG_TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Exception: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\nWhen clearing breadcrumbs"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lbacktraceio/library/logger/BacktraceLogger;->w(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v0, 0x0

    return v0
.end method
