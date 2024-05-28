.class public Ln6/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ln6/b$b;,
        Ln6/b$d;,
        Ln6/b$c;
    }
.end annotation


# instance fields
.field public a:Lm1/a;

.field private b:Ljava/util/UUID;


# direct methods
.method private constructor <init>()V
    .locals 3

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 3
    iput-object v0, p0, Ln6/b;->b:Ljava/util/UUID;

    .line 4
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object v0

    invoke-interface {v0}, Lc7/e;->G0()Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "8a82d513-2fc8-4450-b42f-4de7face24f8"

    .line 5
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    const-string v2, "rbx.backtrace"

    if-nez v1, :cond_0

    .line 6
    :try_start_0
    invoke-static {v0}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v0

    iput-object v0, p0, Ln6/b;->b:Ljava/util/UUID;
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const-string v0, "Could not parse provided symbolication ID."

    .line 7
    invoke-static {v2, v0}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :cond_0
    const-string v0, "No symbolication ID provided."

    .line 8
    invoke-static {v2, v0}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1
    :goto_0
    return-void
.end method

.method synthetic constructor <init>(Ln6/b$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ln6/b;-><init>()V

    return-void
.end method

.method public static synthetic a(Ln6/b;Landroid/content/Context;Lbacktraceio/library/models/BacktraceData;)Lbacktraceio/library/models/BacktraceData;
    .locals 0

    invoke-direct {p0, p1, p2}, Ln6/b;->e(Landroid/content/Context;Lbacktraceio/library/models/BacktraceData;)Lbacktraceio/library/models/BacktraceData;

    move-result-object p0

    return-object p0
.end method

.method private b(Landroid/content/Context;)V
    .locals 4

    .line 1
    :try_start_0
    new-instance v0, Ljava/lang/ProcessBuilder;

    const/4 v1, 0x5

    new-array v1, v1, [Ljava/lang/String;

    const/4 v2, 0x0

    const-string v3, "logcat"

    aput-object v3, v1, v2

    const/4 v2, 0x1

    const-string v3, "-t"

    aput-object v3, v1, v2

    const/4 v2, 0x2

    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object v3

    invoke-interface {v3}, Lc7/e;->D()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x3

    const-string v3, "-v"

    aput-object v3, v1, v2

    const/4 v2, 0x4

    const-string v3, "time"

    aput-object v3, v1, v2

    invoke-direct {v0, v1}, Ljava/lang/ProcessBuilder;-><init>([Ljava/lang/String;)V

    .line 2
    invoke-virtual {v0}, Ljava/lang/ProcessBuilder;->start()Ljava/lang/Process;

    move-result-object v0

    .line 3
    new-instance v1, Ljava/io/File;

    invoke-virtual {p1}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    move-result-object p1

    const-string v2, "androidLog.txt"

    invoke-direct {v1, p1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 4
    new-instance p1, Ljava/io/BufferedReader;

    new-instance v2, Ljava/io/InputStreamReader;

    invoke-virtual {v0}, Ljava/lang/Process;->getInputStream()Ljava/io/InputStream;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    invoke-direct {p1, v2}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    .line 5
    new-instance v2, Ljava/io/BufferedWriter;

    new-instance v3, Ljava/io/FileWriter;

    invoke-direct {v3, v1}, Ljava/io/FileWriter;-><init>(Ljava/io/File;)V

    invoke-direct {v2, v3}, Ljava/io/BufferedWriter;-><init>(Ljava/io/Writer;)V

    .line 6
    :goto_0
    invoke-virtual {p1}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 7
    invoke-virtual {v2, v1}, Ljava/io/BufferedWriter;->write(Ljava/lang/String;)V

    .line 8
    invoke-virtual {v2}, Ljava/io/BufferedWriter;->newLine()V

    goto :goto_0

    .line 9
    :cond_0
    invoke-virtual {p1}, Ljava/io/BufferedReader;->close()V

    .line 10
    invoke-virtual {v2}, Ljava/io/BufferedWriter;->close()V

    .line 11
    invoke-virtual {v0}, Ljava/lang/Process;->destroy()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    .line 12
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Bypass Java log due to "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "rbx.backtrace"

    invoke-static {v0, p1}, Lc9/k;->j(Ljava/lang/String;Ljava/lang/String;)I

    :goto_1
    return-void
.end method

.method public static c()Ln6/b;
    .locals 1

    sget-object v0, Ln6/b$c;->a:Ln6/b;

    return-object v0
.end method

.method private synthetic e(Landroid/content/Context;Lbacktraceio/library/models/BacktraceData;)Lbacktraceio/library/models/BacktraceData;
    .locals 3

    .line 1
    iget-object v0, p2, Lbacktraceio/library/models/BacktraceData;->attributes:Ljava/util/Map;

    invoke-static {}, Lcom/roblox/client/p0;->i()Ljava/lang/String;

    move-result-object v1

    const-string v2, "BaseUrl"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    iget-object v0, p2, Lbacktraceio/library/models/BacktraceData;->attributes:Ljava/util/Map;

    invoke-static {}, Lb9/c;->c()Lb9/c;

    move-result-object v1

    invoke-virtual {v1}, Lb9/c;->j()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v1

    const-string v2, "UserId"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 3
    iget-object v0, p2, Lbacktraceio/library/models/BacktraceData;->attributes:Ljava/util/Map;

    .line 4
    invoke-static {}, Lcom/roblox/client/n;->h()Lcom/roblox/client/n;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roblox/client/n;->f()Lf7/b0;

    move-result-object v1

    invoke-virtual {v1}, Lf7/b0;->i()Z

    move-result v1

    .line 5
    invoke-static {v1}, Ljava/lang/Boolean;->toString(Z)Ljava/lang/String;

    move-result-object v1

    const-string v2, "IsInGame"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    iget-object v0, p2, Lbacktraceio/library/models/BacktraceData;->attributes:Ljava/util/Map;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "googleProd"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "release"

    invoke-static {v2}, Lc9/q;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "BuildVariant"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    iget-object v0, p2, Lbacktraceio/library/models/BacktraceData;->attributes:Ljava/util/Map;

    invoke-static {}, Lcom/roblox/client/p0;->H()Ljava/lang/String;

    move-result-object v1

    const-string v2, "BuildId"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    iget-object v0, p0, Ln6/b;->b:Ljava/util/UUID;

    if-eqz v0, :cond_0

    .line 9
    iget-object v1, p2, Lbacktraceio/library/models/BacktraceData;->attributes:Ljava/util/Map;

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v2, "symbolication_id"

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    :cond_0
    invoke-direct {p0, p1}, Ln6/b;->b(Landroid/content/Context;)V

    return-object p2
.end method


# virtual methods
.method public d(Landroid/content/Context;)V
    .locals 4

    .line 1
    iget-object v0, p0, Ln6/b;->a:Lm1/a;

    if-nez v0, :cond_1

    .line 2
    new-instance v0, Lm1/b;

    .line 3
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object v1

    invoke-interface {v1}, Lc7/e;->U()Ljava/lang/String;

    move-result-object v1

    .line 4
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object v2

    invoke-interface {v2}, Lc7/e;->I()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lm1/b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 5
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, "/"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "androidLog.txt"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 6
    new-instance v2, Ln6/b$a;

    invoke-direct {v2, p0, v1}, Ln6/b$a;-><init>(Ln6/b;Ljava/lang/String;)V

    .line 7
    new-instance v1, Lm1/a;

    invoke-direct {v1, p1, v0, v2}, Lm1/a;-><init>(Landroid/content/Context;Lm1/b;Ljava/util/List;)V

    iput-object v1, p0, Ln6/b;->a:Lm1/a;

    .line 8
    iget-object v0, p0, Ln6/b;->b:Ljava/util/UUID;

    if-eqz v0, :cond_0

    .line 9
    invoke-virtual {v1}, Lbacktraceio/library/base/BacktraceBase;->enableProguard()V

    .line 10
    :cond_0
    iget-object v0, p0, Ln6/b;->a:Lm1/a;

    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object v1

    invoke-interface {v1}, Lc7/e;->A()I

    move-result v1

    new-instance v2, Ln6/b$b;

    iget-object v3, p0, Ln6/b;->a:Lm1/a;

    invoke-direct {v2, v3}, Ln6/b$b;-><init>(Lm1/a;)V

    invoke-virtual {v0, v1, v2}, Lm1/a;->a(ILbacktraceio/library/watchdog/OnApplicationNotRespondingEvent;)V

    .line 11
    iget-object v0, p0, Ln6/b;->a:Lm1/a;

    new-instance v1, Ln6/a;

    invoke-direct {v1, p0, p1}, Ln6/a;-><init>(Ln6/b;Landroid/content/Context;)V

    invoke-virtual {v0, v1}, Lbacktraceio/library/base/BacktraceBase;->setOnBeforeSendEventListener(Lbacktraceio/library/events/OnBeforeSendEventListener;)V

    .line 12
    new-instance p1, Ln6/b$d;

    iget-object v0, p0, Ln6/b;->a:Lm1/a;

    invoke-direct {p1, v0}, Ln6/b$d;-><init>(Lm1/a;)V

    :cond_1
    return-void
.end method
