.class public Lbacktraceio/library/models/json/ThreadData;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private mainThread:Ljava/lang/String;

.field public threadInformation:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lbacktraceio/library/models/json/ThreadInformation;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/ArrayList;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lbacktraceio/library/models/BacktraceStackFrame;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lbacktraceio/library/models/json/ThreadData;->threadInformation:Ljava/util/HashMap;

    const-string v0, ""

    .line 3
    iput-object v0, p0, Lbacktraceio/library/models/json/ThreadData;->mainThread:Ljava/lang/String;

    .line 4
    invoke-direct {p0, p1}, Lbacktraceio/library/models/json/ThreadData;->generateCurrentThreadInformation(Ljava/util/ArrayList;)V

    .line 5
    invoke-direct {p0}, Lbacktraceio/library/models/json/ThreadData;->processThreads()V

    return-void
.end method

.method private generateCurrentThreadInformation(Ljava/util/ArrayList;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lbacktraceio/library/models/BacktraceStackFrame;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    .line 2
    invoke-virtual {v0}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lbacktraceio/library/models/json/ThreadData;->mainThread:Ljava/lang/String;

    .line 3
    iget-object v2, p0, Lbacktraceio/library/models/json/ThreadData;->threadInformation:Ljava/util/HashMap;

    new-instance v3, Lbacktraceio/library/models/json/ThreadInformation;

    .line 4
    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-direct {v3, v0, p1, v4}, Lbacktraceio/library/models/json/ThreadInformation;-><init>(Ljava/lang/Thread;Ljava/util/ArrayList;Ljava/lang/Boolean;)V

    .line 5
    invoke-virtual {v2, v1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private processThreads()V
    .locals 9

    .line 1
    invoke-static {}, Ljava/lang/Thread;->getAllStackTraces()Ljava/util/Map;

    move-result-object v0

    .line 2
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 3
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_0

    goto :goto_0

    .line 4
    :cond_0
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Thread;

    .line 5
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Ljava/lang/StackTraceElement;

    .line 6
    invoke-virtual {v2}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v3

    .line 7
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 8
    invoke-virtual {p0}, Lbacktraceio/library/models/json/ThreadData;->getMainThread()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    goto :goto_0

    :cond_1
    if-eqz v1, :cond_2

    .line 9
    array-length v5, v1

    if-eqz v5, :cond_2

    .line 10
    array-length v5, v1

    const/4 v6, 0x0

    :goto_1
    if-ge v6, v5, :cond_2

    aget-object v7, v1, v6

    .line 11
    new-instance v8, Lbacktraceio/library/models/BacktraceStackFrame;

    invoke-direct {v8, v7}, Lbacktraceio/library/models/BacktraceStackFrame;-><init>(Ljava/lang/StackTraceElement;)V

    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    .line 12
    :cond_2
    iget-object v1, p0, Lbacktraceio/library/models/json/ThreadData;->threadInformation:Ljava/util/HashMap;

    new-instance v5, Lbacktraceio/library/models/json/ThreadInformation;

    .line 13
    sget-object v6, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-direct {v5, v2, v4, v6}, Lbacktraceio/library/models/json/ThreadInformation;-><init>(Ljava/lang/Thread;Ljava/util/ArrayList;Ljava/lang/Boolean;)V

    .line 14
    invoke-virtual {v1, v3, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_3
    return-void
.end method


# virtual methods
.method public getMainThread()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lbacktraceio/library/models/json/ThreadData;->mainThread:Ljava/lang/String;

    return-object v0
.end method
