.class final Lob/e$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lqb/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lob/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "b"
.end annotation


# instance fields
.field private final a:Lqb/d$c;

.field private b:Lac/s;

.field private c:Lac/s;

.field d:Z

.field final synthetic e:Lob/e;


# direct methods
.method constructor <init>(Lob/e;Lqb/d$c;)V
    .locals 2

    .line 1
    iput-object p1, p0, Lob/e$b;->e:Lob/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p2, p0, Lob/e$b;->a:Lqb/d$c;

    const/4 v0, 0x1

    .line 3
    invoke-virtual {p2, v0}, Lqb/d$c;->d(I)Lac/s;

    move-result-object v0

    iput-object v0, p0, Lob/e$b;->b:Lac/s;

    .line 4
    new-instance v1, Lob/e$b$a;

    invoke-direct {v1, p0, v0, p1, p2}, Lob/e$b$a;-><init>(Lob/e$b;Lac/s;Lob/e;Lqb/d$c;)V

    iput-object v1, p0, Lob/e$b;->c:Lac/s;

    return-void
.end method


# virtual methods
.method public a()Lac/s;
    .locals 1

    iget-object v0, p0, Lob/e$b;->c:Lac/s;

    return-object v0
.end method

.method public b()V
    .locals 4

    .line 1
    iget-object v0, p0, Lob/e$b;->e:Lob/e;

    monitor-enter v0

    .line 2
    :try_start_0
    iget-boolean v1, p0, Lob/e$b;->d:Z

    if-eqz v1, :cond_0

    .line 3
    monitor-exit v0

    return-void

    :cond_0
    const/4 v1, 0x1

    .line 4
    iput-boolean v1, p0, Lob/e$b;->d:Z

    .line 5
    iget-object v2, p0, Lob/e$b;->e:Lob/e;

    iget v3, v2, Lob/e;->q:I

    add-int/2addr v3, v1

    iput v3, v2, Lob/e;->q:I

    .line 6
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    iget-object v0, p0, Lob/e$b;->b:Lac/s;

    invoke-static {v0}, Lpb/e;->g(Ljava/io/Closeable;)V

    .line 8
    :try_start_1
    iget-object v0, p0, Lob/e$b;->a:Lqb/d$c;

    invoke-virtual {v0}, Lqb/d$c;->a()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    return-void

    :catchall_0
    move-exception v1

    .line 9
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v1
.end method
